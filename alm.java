/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class alm
extends Handler {
    final alo a;

    public alm(alo alo2, Looper looper) {
        this.a = alo2;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        Object object2;
        block16: {
            int n2;
            alo alo2;
            block17: {
                block18: {
                    alo2 = this.a;
                    n2 = object.what;
                    if (n2 == 1) break block17;
                    if (n2 == 2) break block18;
                    object2 = null;
                    if (n2 != 3) {
                        if (n2 != 4) {
                            a.i(alo2.d, new IllegalStateException(String.valueOf(object.what)));
                            object = object2;
                            break block16;
                        } else {
                            object = (Bundle)object.obj;
                            try {
                                alo2.c.setParameters((Bundle)object);
                                object = object2;
                            }
                            catch (RuntimeException runtimeException) {
                                a.i(alo2.d, runtimeException);
                                object = object2;
                            }
                        }
                        break block16;
                    } else {
                        alo2.e.e();
                        object = object2;
                    }
                    break block16;
                }
                object = (aln)object.obj;
                n2 = object.a;
                int n3 = object.b;
                MediaCodec.CryptoInfo cryptoInfo = object.d;
                long l2 = object.e;
                n3 = object.f;
                try {
                    object2 = alo.b;
                    synchronized (object2) {
                    }
                }
                catch (RuntimeException runtimeException) {
                    a.i(alo2.d, runtimeException);
                    break block16;
                }
                {
                    alo2.c.queueSecureInputBuffer(n2, 0, cryptoInfo, l2, n3);
                    break block16;
                }
            }
            object = (aln)object.obj;
            n2 = object.a;
            int n4 = object.b;
            n4 = object.c;
            long l3 = object.e;
            int n5 = object.f;
            try {
                alo2.c.queueInputBuffer(n2, 0, n4, l3, n5);
            }
            catch (RuntimeException runtimeException) {
                a.i(alo2.d, runtimeException);
            }
        }
        if (object != null) {
            object2 = alo.a;
            synchronized (object2) {
                alo.a.add(object);
                return;
            }
        }
    }
}

