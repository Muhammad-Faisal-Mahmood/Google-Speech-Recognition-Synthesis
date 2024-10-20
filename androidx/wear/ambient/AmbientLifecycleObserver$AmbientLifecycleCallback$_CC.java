/*
 * Decompiled with CFR 0.152.
 */
package androidx.wear.ambient;

import androidx.wear.ambient.AmbientLifecycleObserver$AmbientDetails;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import java.util.concurrent.Executor;

public class AmbientLifecycleObserver$AmbientLifecycleCallback$_CC {
    public static void $default$onEnterAmbient(AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback, AmbientLifecycleObserver$AmbientDetails ambientLifecycleObserver$AmbientDetails) {
        jse.e(ambientLifecycleObserver$AmbientDetails, "ambientDetails");
    }

    public static void $default$onExitAmbient(AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
    }

    public static void $default$onUpdateAmbient(AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
    }

    public AmbientLifecycleObserver$AmbientLifecycleCallback$_CC() {
    }

    public AmbientLifecycleObserver$AmbientLifecycleCallback$_CC(byte[] byArray) {
    }

    public static hpn a(Executor executor, String string, jqz jqz2) {
        jse.e(executor, "<this>");
        return kl.o(new bbc(executor, string, jqz2, 1, null));
    }

    public static /* synthetic */ hpn b(jqf jqf2, jro jro2) {
        jvc jvc2 = jvc.a;
        jse.e(jqf2, "context");
        jse.e((Object)jvc2, "start");
        return kl.o(new bbc(jqf2, (Object)jvc2, jro2, 0));
    }

    public static long c(boolean bl2, int n2, bak bak2, long l2, long l3, int n3, boolean bl3, long l4, long l5, long l6, long l7) {
        block13: {
            block11: {
                long l8;
                block12: {
                    block10: {
                        jse.e((Object)bak2, "backoffPolicy");
                        l8 = Long.MAX_VALUE;
                        if (l7 != Long.MAX_VALUE && bl3) {
                            if (n3 == 0) {
                                return l7;
                            }
                            return jse.m(l7, 900000L + l3);
                        }
                        if (!bl2) break block10;
                        l2 = bak2 == bak.b ? (long)n2 * l2 : (long)Math.scalb(l2, n2 - 1);
                        l2 = l3 + jse.n(l2, 18000000L);
                        break block11;
                    }
                    if (!bl3) break block12;
                    if (n3 == 0) {
                        l2 = l3 + l4;
                        n2 = 0;
                    } else {
                        l2 = l3 + l6;
                        n2 = n3;
                    }
                    l2 = l3 = l2;
                    if (l5 != l6) {
                        l2 = l3;
                        if (n2 == 0) {
                            l2 = l3 + (l6 - l5);
                        }
                    }
                    break block11;
                }
                if (l3 != -1L) break block13;
                l2 = l8;
            }
            return l2;
        }
        return l3 + l4;
    }

    public static /* synthetic */ int d(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static bgm e(bgs bgs2, int n2) {
        return new bgm(bgs2.a, bgs2.b, n2);
    }
}

