/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.apps.speech.tts.googletts.local.greco3;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.speech.tts.googletts.audio.AndroidDecoder;
import com.google.android.apps.speech.tts.googletts.local.greco3.AndroidComposer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class AndroidComposerImpl
implements AndroidComposer {
    private static final hei logger = hei.m("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl");
    private final AndroidDecoder androidDecoder;
    private final AssetManager assetManager;
    private final ArrayList availableTimepoints;
    private long composerRef = 0L;
    private final ByteBuffer directAudioBuffer;
    private final int expectedSampleRateHz;
    private boolean isInitialized = false;

    public AndroidComposerImpl(Context context, int n2, int n3, AndroidDecoder androidDecoder) {
        ByteBuffer byteBuffer;
        this.expectedSampleRateHz = n3;
        this.directAudioBuffer = byteBuffer = ByteBuffer.allocateDirect(n2);
        byteBuffer.limit(0);
        this.assetManager = context.getAssets();
        this.availableTimepoints = new ArrayList();
        this.androidDecoder = androidDecoder;
    }

    private boolean audioAvailable(int n2, int n3) {
        if (this.isAudioAvailable()) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "audioAvailable", 226, "AndroidComposerImpl.java")).r("Last audio chunk was not consumed, cannot write new audio chunk");
            return false;
        }
        if (n3 != this.expectedSampleRateHz) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "audioAvailable", 231, "AndroidComposerImpl.java")).r("Unexpected output sample rate");
            return false;
        }
        this.directAudioBuffer.limit(n2);
        return true;
    }

    private native long jniConstruct(long var1);

    private native void jniDelete(long var1);

    private native boolean jniInit(long var1, int var3, String var4);

    private native boolean jniInitWithOverride(long var1, int var3, String var4, byte[] var5);

    private native int jniSyncReadBuffered(long var1);

    private native boolean jniSyncSetupBuffered(long var1, byte[] var3, byte[] var4);

    private void reset() {
        this.directAudioBuffer.limit(0);
        this.availableTimepoints.clear();
    }

    private boolean timepointAvailable(int n2, int n3, int n4, int n5, double d2) {
        brw brw2 = new brw(n2, n3, n4, n5, d2);
        this.availableTimepoints.add(brw2);
        return true;
    }

    @Override
    public boolean areTimepointsAvailable() {
        return !this.availableTimepoints.isEmpty();
    }

    @Override
    public byte[] consumeAvailableAudio() {
        if (this.isAudioAvailable()) {
            byte[] byArray = new byte[this.directAudioBuffer.remaining()];
            this.directAudioBuffer.get(byArray).rewind().limit(0);
            return byArray;
        }
        throw new IllegalStateException("No new audio to consume");
    }

    @Override
    public gzx consumeAvailableTimepoints() {
        if (this.areTimepointsAvailable()) {
            ArrayList arrayList = this.availableTimepoints;
            gzx gzx2 = gzx.o(arrayList);
            arrayList.clear();
            return gzx2;
        }
        throw new IllegalStateException("No new timepoints to consume");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void delete() {
        synchronized (this) {
            long l2 = this.composerRef;
            if (l2 != 0L) {
                this.jniDelete(l2);
                this.composerRef = 0L;
                this.isInitialized = false;
            }
            this.androidDecoder.a();
            return;
        }
    }

    public final void finalize() {
        this.delete();
    }

    @Override
    public int getAudioBufferSizeBytes() {
        return this.directAudioBuffer.capacity();
    }

    @Override
    public int getSampleRateHz() {
        return this.expectedSampleRateHz;
    }

    @Override
    public boolean initBufferedSession(ikd ikd2, iiq iiq2) {
        int n2 = iiq2.d;
        if (n2 + n2 > this.directAudioBuffer.capacity()) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "initBufferedSession", 94, "AndroidComposerImpl.java")).r("Session audio buffer size exceeds current audio buffer capacity.");
            return false;
        }
        boolean bl2 = this.jniSyncSetupBuffered(this.composerRef, ikd2.g(), iiq2.g());
        if (!bl2) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "initBufferedSession", 101, "AndroidComposerImpl.java")).r("Failed to init buffered synthesis through composer!");
        }
        return bl2;
    }

    @Override
    public boolean initComposer(ParcelFileDescriptor parcelFileDescriptor, String string, ktd ktd2) {
        long l2;
        AndroidDecoder androidDecoder = this.androidDecoder;
        androidDecoder.c = l2 = androidDecoder.jniConstruct();
        if (!androidDecoder.jniInit(l2)) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "initComposer", 60, "AndroidComposerImpl.java")).r("Failed to initialize decoder");
            return false;
        }
        this.composerRef = this.jniConstruct(this.androidDecoder.c);
        int n2 = parcelFileDescriptor.getFd();
        boolean bl2 = ktd2 != null ? this.jniInitWithOverride(this.composerRef, n2, string, ktd2.g()) : this.jniInit(this.composerRef, n2, string);
        if (!bl2) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "initComposer", 75, "AndroidComposerImpl.java")).r("Failed to load pipeline definitions!");
            return false;
        }
        this.isInitialized = true;
        return true;
    }

    @Override
    public boolean isAudioAvailable() {
        return this.directAudioBuffer.hasRemaining();
    }

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override
    public iim readBuffered() {
        Object object;
        iim iim2 = iim.b;
        if (this.isAudioAvailable()) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "readBuffered", 112, "AndroidComposerImpl.java")).r("Can't start new read while audio is available from last read");
            object = iim2;
        } else if (this.areTimepointsAvailable()) {
            ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "readBuffered", 114, "AndroidComposerImpl.java")).r("Can't start new read while timepoints are available from last read");
            object = iim2;
        } else {
            int n2 = this.jniSyncReadBuffered(this.composerRef);
            object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? (n2 != 5 ? null : iim.f) : iim.e) : iim.d) : iim.c) : iim.b) : iim.a;
            if (object == null) {
                ((heg)((heg)logger.g()).j("com/google/android/apps/speech/tts/googletts/local/greco3/AndroidComposerImpl", "readBuffered", 119, "AndroidComposerImpl.java")).r("Null composition status");
                object = iim2;
            }
        }
        if (object != iim.d) {
            this.reset();
        }
        return object;
    }
}

