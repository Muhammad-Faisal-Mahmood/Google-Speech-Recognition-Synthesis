/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.libraries.assistant.soda.s3client;

import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;

public class SodaTransportSession {
    private static final hei a = hei.m("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession");
    private final SodaTransportFactory b;
    private cnx c;

    public SodaTransportSession(SodaTransportFactory sodaTransportFactory) {
        this.b = sodaTransportFactory;
    }

    public final void sendRequest(byte[] object) {
        if (this.c == null) {
            return;
        }
        try {
            hwj hwj2 = hwj.a();
            object = hwv.o(ida.a, object, 0, ((byte[])object).length, hwj2);
            hwv.D((hwv)object);
            object = (ida)object;
            this.c.b();
            return;
        }
        catch (Exception exception) {
            a.as(a.h(), "S3Request parsing failed.", "com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "sendRequest", '\\', "SodaTransportSession.java", exception);
            return;
        }
    }

    public final boolean start(long l2, byte[] object) {
        if (l2 != 0L) {
            block4: {
                hwj hwj2 = hwj.a();
                object = hwv.o(igh.a, (byte[])object, 0, ((byte[])object).length, hwj2);
                hwv.D((hwv)object);
                object = (igh)object;
                object = this.b.a();
                this.c = object;
                if (object == null) break block4;
                try {
                    boolean bl2 = object.c();
                    return bl2;
                }
                catch (Exception exception) {
                    a.as(a.h(), "SodaS3TransportConfig parsing failed.", "com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "start", 'M', "SodaTransportSession.java", exception);
                }
            }
            return false;
        }
        return false;
    }

    public final void stop() {
        cnx cnx2 = this.c;
        if (cnx2 == null) {
            return;
        }
        cnx2.a();
        this.c = null;
    }
}

