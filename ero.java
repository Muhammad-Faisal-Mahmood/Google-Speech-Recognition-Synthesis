/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.RandomAccessFile;
import java.util.Collection;

public final class ero
extends jsf
implements jrk {
    public static final ero a;
    public static final ero b;
    public static final ero c;
    public static final ero d;
    public static final ero e;
    public static final ero f;
    public static final ero g;
    public static final ero h;
    public static final ero i;
    public static final ero j;
    public static final ero k;
    public static final ero l;
    public static final ero m;
    public static final ero n;
    public static final ero o;
    public static final ero p;
    public static final ero q;
    public static final ero r;
    public static final ero s;
    public static final ero t;
    private final int u;

    static {
        t = new ero(20);
        s = new ero(19);
        r = new ero(18);
        q = new ero(17);
        p = new ero(16);
        o = new ero(15);
        n = new ero(14);
        m = new ero(13);
        l = new ero(12);
        k = new ero(11);
        j = new ero(10);
        i = new ero(9);
        h = new ero(8);
        g = new ero(7);
        f = new ero(6);
        e = new ero(5);
        d = new ero(4);
        c = new ero(3);
        b = new ero(2);
        a = new ero(1);
    }

    public ero(int n2) {
        this.u = n2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.u;
        boolean bl2 = true;
        switch (n2) {
            default: {
                object = (Throwable)object;
                return null;
            }
            case 19: {
                object = (jqd)object;
                if (object instanceof jwa) {
                    return (jwa)object;
                }
                return null;
            }
            case 18: {
                object = (jqd)object;
                if (object instanceof juy) {
                    return (juy)object;
                }
                return null;
            }
            case 17: {
                object = (String)object;
                jse.e(object, "line");
                return object;
            }
            case 16: {
                if (object != null) {
                    bl2 = false;
                }
                return bl2;
            }
            case 15: {
                object = (Void)object;
                return hhk.K(true);
            }
            case 14: {
                jse.e((Exception)object, "it");
                return false;
            }
            case 13: {
                object = (hqp)object;
                jse.e(object, "it");
                return ((hqp)object).g;
            }
            case 12: {
                object = (cdb)object;
                jse.e(object, "e");
                return Log.w((String)"RegisterInternal", (String)"GMS Core version too old", (Throwable)object);
            }
            case 11: {
                object = (dut)object;
                jse.e(object, "e");
                if (((dut)object).a == 29501) {
                    return null;
                }
                throw object;
            }
            case 10: {
                object = (cdb)object;
                jse.e(object, "e");
                return Log.w((String)"ConfigurationUpdater", (String)"Failed to update shared storage snapshot. GMS Core version too old.", (Throwable)object);
            }
            case 9: {
                object = (String)object;
                jse.e(object, "it");
                return object;
            }
            case 8: {
                jse.e((Exception)object, "it");
                return null;
            }
            case 7: {
                object = (ezj)object;
                jse.e(object, "it");
                return hhk.K(object);
            }
            case 6: {
                object = (gzx)object;
                jse.b(object);
                return fvd.V((Collection)object);
            }
            case 5: {
                object = (RandomAccessFile)object;
                jse.e(object, "$this$runOpsSafely");
                ((RandomAccessFile)object).getFD().sync();
                ((RandomAccessFile)object).close();
                return jon.a;
            }
            case 4: {
                object = (RandomAccessFile)object;
                jse.e(object, "$this$runOpsSafely");
                ((RandomAccessFile)object).getFD().sync();
                ((RandomAccessFile)object).close();
                return jon.a;
            }
            case 3: {
                dzn dzn2 = (dzn)object;
                jse.e(dzn2, "it");
                object = crh.X(eun.a.l());
                jse.e(dzn2, "value");
                hyg hyg2 = (hwp)((bzq)object).a;
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                hyg2 = (eun)hyg2.b;
                dzn2.getClass();
                ((eun)hyg2).c = dzn2;
                ((eun)hyg2).b = 10;
                return ((bzq)object).I();
            }
            case 2: {
                object = (dzn)object;
                jse.e(object, "it");
                bzq bzq2 = crh.X(eun.a.l());
                bzq2.J((dzn)object);
                return bzq2.I();
            }
            case 1: {
                return fpo.c(object);
            }
            case 0: 
        }
        ((erf)object).a();
        return jon.a;
    }
}

