/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.WindowManager
 */
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

public class dox {
    public static volatile long a;
    private static volatile float b;

    public dox() {
    }

    public dox(byte[] byArray, byte[] byArray2) {
    }

    public dox(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        this(null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static gto a(Context context) {
        float f2;
        if (Build.VERSION.SDK_INT >= 31) {
            return gsl.a;
        }
        float f3 = f2 = b;
        if (f2 != 0.0f) return gto.i(Float.valueOf(f3));
        synchronized (dox.class) {
            f3 = f2 = b;
            if (f2 != 0.0f) return gto.i(Float.valueOf(f3));
            b = f3 = ((WindowManager)context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
            return gto.i(Float.valueOf(f3));
        }
    }

    public static /* synthetic */ String b(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 5) {
                        if (n2 != 6) {
                            return "null";
                        }
                        return "FAILED_GETTING_STATUS_FUTURE";
                    }
                    return "FAILED_RELEASING_DUE_TO_INACTIVE_SESSION";
                }
                return "FAILED_RELEASING_PLATFORM_ERROR";
            }
            return "RELEASED";
        }
        return "UNKNOWN_RELEASING_STATUS";
    }

    public static int c(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return 0;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ String d(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 6) {
                        if (n2 != 7) {
                            return "null";
                        }
                        return "FAILED_ACQUIRING_IN_CALL";
                    }
                    return "FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE";
                }
                return "FAILED_ACQUIRING_PLATFORM_ERROR";
            }
            return "ACQUIRED";
        }
        return "UNKNOWN_ACQUIRING_STATUS";
    }

    public static int e(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 3) {
                    if (n2 != 5) {
                        if (n2 != 6) {
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ cxt f(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ cxt g(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ bzq h(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static /* synthetic */ bzq i(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static /* synthetic */ bzo j(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ bzo k(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ bzq l(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static /* synthetic */ bzq m(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static /* synthetic */ bzo n(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ bzo o(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }
}

