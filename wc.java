/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class wc {
    public static int a(View view) {
        return ag$$ExternalSyntheticApiModelOutline0.m(view);
    }

    public static void b(View view, int n2) {
        ag$$ExternalSyntheticApiModelOutline0.m(view, 8);
    }

    static int c(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 8) {
                        if (n2 != 16) {
                            if (n2 != 32) {
                                if (n2 != 64) {
                                    if (n2 != 128) {
                                        if (n2 == 256) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException(a.af(n2, "type needs to be >= FIRST and <= LAST, type="));
                                    }
                                    return 7;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void d(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static void e(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static void f(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static void g(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static void h(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static void i(abe abe2) {
        jse.e(abe2, "owner");
    }

    public static float j(float[] fArray, float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int n2 = Math.min((int)(200.0f * f2), 199);
        float f3 = n2;
        float f4 = fArray[n2];
        float f5 = fArray[n2 + 1];
        return f4 + (f2 - f3 * 0.005f) / 0.005f * (f5 - f4);
    }

    public static int k(byte[] byArray) {
        byte by2 = byArray[11];
        return byArray[10] & 0xFF | (by2 & 0xFF) << 8;
    }

    public static long l(byte by2, byte by3) {
        int n2;
        int n3 = by2 & 3;
        if (n3 != 0) {
            int n4;
            n2 = n4 = 2;
            if (n3 != 1) {
                n2 = n4;
                if (n3 != 2) {
                    n2 = by3 & 0x3F;
                }
            }
        } else {
            n2 = 1;
        }
        by2 = (byte)((by2 & 0xFF) >> 3);
        by3 = (byte)(by2 & 3);
        by2 = by2 >= 16 ? (byte)(2500 << by3) : (by2 >= 12 ? (byte)(10000 << (by2 & 1)) : (by3 == 3 ? (byte)60000 : (byte)(10000 << by3)));
        return (long)n2 * (long)by2;
    }

    public static long m(long l2) {
        return l2 * 1000000000L / 48000L;
    }

    public static boolean n(long l2, long l3) {
        return l2 - l3 <= wc.m(3840L) / 1000L;
    }

    public static byte[] o(long l2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l2).array();
    }

    public static apo[] p(apr apr2) {
        return apr2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean q(app app2, byte[] byArray, int n2, int n3) {
        try {
            int n4 = ((apl)app2).b(byArray, n2, n3);
            while (n4 < n3 && n4 != -1) {
                n4 = ((apl)app2).c(byArray, n2, n3, n4, false);
            }
            ((apl)app2).g(n4);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }

    public static boolean r(app app2, int n2) {
        try {
            app2.j(n2);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }

    public static boolean s(app app2, byte[] byArray, int n2, boolean bl2) {
        try {
            boolean bl3 = app2.l(byArray, 0, n2, bl2);
            return bl3;
        }
        catch (EOFException eOFException) {
            if (bl2) {
                return false;
            }
            throw eOFException;
        }
    }
}

