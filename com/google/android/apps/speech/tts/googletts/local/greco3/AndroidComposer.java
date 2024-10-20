/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.apps.speech.tts.googletts.local.greco3;

import android.os.ParcelFileDescriptor;

public interface AndroidComposer {
    public boolean areTimepointsAvailable();

    public byte[] consumeAvailableAudio();

    public gzx consumeAvailableTimepoints();

    public void delete();

    public int getAudioBufferSizeBytes();

    public int getSampleRateHz();

    public boolean initBufferedSession(ikd var1, iiq var2);

    public boolean initComposer(ParcelFileDescriptor var1, String var2, ktd var3);

    public boolean isAudioAvailable();

    public boolean isInitialized();

    public iim readBuffered();
}

