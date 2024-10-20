/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.google.android.apps.speech.tts.googletts.audio;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

public final class AndroidDecoder {
    public static final hei a;
    private static final hac d;
    public final int b;
    public long c = 0L;
    public final ByteBuffer directAudioBuffer;
    private final brq e;
    private final ExecutorService f;

    static {
        d = hac.j("https://dl.google.com/android/tts/natcon/mmm-hmm-hol-v0.wav", "mmm-hmm-hol-v0.wav");
        a = hei.m("com/google/android/apps/speech/tts/googletts/audio/AndroidDecoder");
    }

    public AndroidDecoder(brq brq2, ExecutorService executorService) {
        ByteBuffer byteBuffer;
        this.directAudioBuffer = byteBuffer = ByteBuffer.allocateDirect(1024);
        this.b = byteBuffer.capacity();
        this.e = brq2;
        this.f = executorService;
    }

    private final void b(hpn hpn2) {
        hmv.f(hph.q(hpn2), IllegalArgumentException.class, new brk(this, 0), this.f);
    }

    private boolean isReady() {
        int n2 = this.e.g;
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        if (n2 != 0) {
            return bl2;
        }
        throw null;
    }

    private native void jniDelete(long var1);

    private void startDecodeByteArray(byte[] object) {
        brl brl2 = new brl(this);
        if (((byte[])object).length == 0) {
            brl2.b(iim.e);
            brl2.a();
            object = hpj.a;
        } else {
            brq brq2 = this.e;
            object = new agm((byte[])object);
            object = brq2.a(brq.b, (agr)object, brl2, 2000L);
        }
        this.b((hpn)object);
    }

    private void startDecodeHttpUrl(String object, long l2) {
        Object object2 = d;
        if (((hac)object2).containsKey(object)) {
            ((heg)((heg)a.c()).j("com/google/android/apps/speech/tts/googletts/audio/AndroidDecoder", "startDecodeHttpUrl", 107, "AndroidDecoder.java")).C("Mapping HTTP URL %s to asset path %s", object, ((hac)object2).get(object));
            brq brq2 = this.e;
            object = (String)((hac)object2).get(object);
            object2 = new brl(this);
            if (fxf.P((String)object)) {
                object2.b(iim.e);
                object2.a();
                object = hpj.a;
            } else {
                object = brq2.a(new Uri.Builder().scheme("file").authority("android_asset").appendPath((String)object).build(), brq2.f, (brn)object2, 2000L);
            }
            this.b((hpn)object);
            return;
        }
        object2 = this.e;
        brl brl2 = new brl(this);
        if (fxf.P((String)object)) {
            brl2.b(iim.e);
            brl2.a();
            object = hpj.a;
        } else {
            object = ((brq)object2).a(Uri.parse((String)object), (agr)((brq)object2).e.b(), brl2, l2);
        }
        this.b((hpn)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            long l2 = this.c;
            if (l2 != 0L) {
                this.jniDelete(l2);
                this.c = 0L;
                return;
            }
            return;
        }
    }

    public final void finalize() {
        this.a();
    }

    public native long jniConstruct();

    public native int jniDecoderAudioAvailable(long var1, int var3);

    public native void jniDecoderCompleted(long var1);

    public native boolean jniDecoderStopped(long var1, int var3);

    public native boolean jniInit(long var1);
}

