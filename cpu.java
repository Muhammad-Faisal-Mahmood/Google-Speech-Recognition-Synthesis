/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Debug
 */
import android.os.Debug;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public final class cpu {
    public static final int d = 0;
    private static final gui e = fvd.ap(new bpr(7));
    public final gto a;
    public final boolean b;
    public final hpr c;

    public cpu(gto gto2, gto gto3, hpr hpr2) {
        this.a = gto2;
        this.b = (Boolean)gto3.e(false);
        this.c = hpr2;
    }

    public static void a(cpv cpv2, ArrayList serializable, RuntimeException runtimeException) {
        block7: {
            block8: {
                block6: {
                    int n2;
                    if (Debug.isDebuggerConnected()) break block6;
                    if (((ArrayList)serializable).size() > 20) {
                        for (n2 = 0; n2 < 20; ++n2) {
                            Collections.swap(serializable, n2, ((Random)ThreadLocalRandom.current()).nextInt(((ArrayList)serializable).size() - n2) + n2);
                        }
                    }
                    for (Thread thread : ((ArrayList)serializable).subList(0, Math.min(((ArrayList)serializable).size(), 20))) {
                        serializable = gqq.b(thread);
                        serializable = ((Throwable)serializable).getStackTrace().length > 0 ? new cpe(thread, (Throwable)serializable) : new cpe(thread);
                        runtimeException.addSuppressed((Throwable)serializable);
                    }
                    n2 = cpv2.ordinal();
                    if (n2 == 0) break block7;
                    if (n2 == 1) break block8;
                }
                return;
            }
            fpk.e(new cmw(runtimeException, 7));
            return;
        }
        a.as(((hei)e.a()).g(), "Unhealthy thread pool detected", "com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", '\u019a', "ThreadMonitoring.java", runtimeException);
    }

    static /* bridge */ /* synthetic */ boolean b() {
        return ((Random)ThreadLocalRandom.current()).nextInt(1000) <= 0;
    }
}

