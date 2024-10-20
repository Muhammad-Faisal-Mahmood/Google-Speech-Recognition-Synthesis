/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class gne {
    public static boolean a = true;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a() {
        a = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Throwable throwable) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(throwable, true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Throwable throwable) {
        Object object;
        Object object2;
        if (!a) {
            return;
        }
        Object object3 = c;
        synchronized (object3) {
            for (object2 = throwable; object2 != null && !c.containsKey(object2); object2 = ((Throwable)object2).getCause()) {
            }
            object = c;
            boolean bl2 = object2 != null;
            ((WeakHashMap)object).put(throwable, bl2);
        }
        if (object2 != null) return;
        if (gne.d(throwable) != null) return;
        object3 = new ArrayList();
        for (object2 = gno.b(); object2 != null; object2 = object2.a()) {
            object3.add(object2);
        }
        object2 = gzx.g(object3.size());
        object = gzx.g(object3.size());
        object3 = fvd.x((List)object3).iterator();
        while (true) {
            if (!object3.hasNext()) {
                object3 = ((gzs)object).g();
                ((gzs)object2).g();
                object3 = new gpv((gzx)object3);
                object2 = b;
                synchronized (object2) {
                    ((WeakHashMap)object2).put(throwable, object3);
                    return;
                }
            }
            gpc gpc2 = (gpc)object3.next();
            ((gzs)object).h(gpc2.c());
            ((gzs)object2).h(gpc2.i());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static cxt d(Throwable throwable) {
        Object object;
        fxf.B(a, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap = b;
        // MONITORENTER : weakHashMap
        for (object = throwable; object != null; object = ((Throwable)object).getCause()) {
            if (b.containsKey(object)) break;
            continue;
        }
        if (object == null) {
            // MONITOREXIT : weakHashMap
            return null;
        }
        WeakHashMap weakHashMap2 = b;
        object = (gpv)weakHashMap2.get(object);
        weakHashMap2.put(throwable, object);
        // MONITOREXIT : weakHashMap
        return new cxt(object);
    }
}

