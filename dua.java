/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.logging.Level;

public final class dua {
    public static Context a;
    public static final gui b;
    private static final Object i;
    private static volatile dua j;
    private static volatile dua k;
    public final Context c;
    public final gui d;
    public final dwq e;
    public final gui f;
    public final dvx g;
    public final cya h = new cya();
    private final gui l;
    private final gui m;
    private final gui n;

    static {
        i = new Object();
        b = fvd.ap(new bpr(15));
    }

    public dua(Context context, gui gui2, gui gui3, gui gui4, gui gui5, gui gui6) {
        context = context.getApplicationContext();
        fxf.K(context);
        fxf.K(gui2);
        fxf.K(gui3);
        fxf.K(gui4);
        fxf.K(gui5);
        fxf.K(gui6);
        gui2 = fvd.ap(gui2);
        gui3 = fvd.ap(gui3);
        gui4 = fvd.ap(gui4);
        gui5 = fvd.ap(gui5);
        gui6 = fvd.ap(gui6);
        this.c = context;
        this.l = gui2;
        this.m = gui3;
        this.d = gui4;
        this.n = gui5;
        this.e = new dwq(context, gui2, gui5, gui3);
        this.f = gui6;
        this.g = new dvx(gui4, gui3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static dua a(Context object) {
        boolean bl2;
        dua dua2;
        block9: {
            dua2 = j;
            if (dua2 != null) {
                return dua2;
            }
            dua2 = object.getApplicationContext();
            try {
                object = ((dtz)fvd.l((Context)dua2, dtz.class)).u();
            }
            catch (IllegalStateException illegalStateException) {
                bl2 = false;
                break block9;
            }
            try {
                object = ((gtt)object).a;
                return (dua)object;
            }
            catch (IllegalStateException illegalStateException) {
                bl2 = true;
            }
        }
        Object object2 = i;
        synchronized (object2) {
            if (j != null) {
                return j;
            }
            Object object3 = gsl.a;
            boolean bl3 = dua2 instanceof dtz;
            if (bl3) {
                object3 = ((dtz)((Object)dua2)).u();
            }
            aim aim2 = new aim(dua2, 20);
            j = object3 = (dua)((gto)object3).d(aim2);
            if (bl2) return object3;
            if (bl3) return object3;
            dpf.d(Level.CONFIG, ((dua)object3).d(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
            return object3;
        }
    }

    public static gui c(Context context) {
        return fvd.ap(new dty(context, 1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(Context context) {
        Object object = i;
        synchronized (object) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            }
            catch (NullPointerException nullPointerException) {
                if (dua.f()) {
                    dpf.d(Level.INFO, (Executor)b.a(), "context.getApplicationContext() yielded NullPointerException in test mode", new Object[0]);
                }
                dpf.d(Level.WARNING, (Executor)b.a(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
            return;
        }
    }

    public static boolean f() {
        boolean bl2;
        boolean bl3 = bl2 = duc.a();
        if (a == null) {
            bl3 = bl2;
            if (!bl2) {
                bl3 = bl2;
                if (duc.d == null) {
                    duc.d = new dub();
                    bl3 = false;
                }
            }
        }
        return bl3;
    }

    public final dus b() {
        return (dus)this.m.a();
    }

    public final hpr d() {
        return (hpr)this.l.a();
    }

    public final bmu g() {
        return (bmu)this.n.a();
    }
}

