/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class gqq
extends RuntimeException {
    public static final int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public gqq(Throwable throwable, StackTraceElement[] stackTraceElementArray) {
        super("", throwable);
        this.setStackTrace(stackTraceElementArray);
    }

    public static hpn a(hpn hpn2, long l2, TimeUnit object, ScheduledExecutorService scheduledExecutorService) {
        gpc gpc2 = gno.b();
        hpn hpn3 = hhk.L(hpn2);
        object = hhk.R(hpn3, l2, object, scheduledExecutorService);
        return hmv.g((hpn)object, TimeoutException.class, new fbl(hpn2, (hpn)object, gpc2, hpn3, 3), (Executor)hom.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static RuntimeException b(Thread object) {
        WeakHashMap weakHashMap = gno.d;
        // MONITORENTER : weakHashMap
        object = (goz)gno.d.get(object);
        // MONITOREXIT : weakHashMap
        if (object == null) {
            object = null;
            return new gqq(null, gqq.l((gpc)object, null));
        }
        object = ((goz)object).c;
        return new gqq(null, gqq.l((gpc)object, null));
    }

    public static RuntimeException c() {
        return new gqq(null, gqq.l(gno.b(), null));
    }

    public static String d(String string) {
        return b.matcher(string).replaceAll("");
    }

    public static void e(Collection object, StackTraceElement[] stackTraceElementArray) {
        object = object.iterator();
        while (object.hasNext()) {
            ((Throwable)object.next()).addSuppressed(new gqp(stackTraceElementArray));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(hac hac2) {
        Object object;
        Object object22;
        ArrayList<StackTraceElement> arrayList = new HashMap<Thread, gpc>();
        Object object3 = gno.d;
        synchronized (object3) {
            for (Object object22 : gno.d.entrySet()) {
                object = ((goz)object22.getValue()).c;
                if (object == null) continue;
                arrayList.put((Thread)object22.getKey(), object);
            }
        }
        object3 = new hat();
        object22 = hac2.l().iterator();
        while (object22.hasNext()) {
            ((hat)object3).j(((gpc)object22.next()).d());
        }
        hav hav2 = ((hat)object3).g();
        object3 = hac2.l().iterator();
        int n2 = Integer.MAX_VALUE;
        while (object3.hasNext()) {
            object22 = (gpc)object3.next();
            if (!(object22 instanceof goe) || ((goe)(object22 = (goe)object22)).f() >= n2) continue;
            n2 = ((goe)object22).f();
        }
        object = new HashMap();
        Iterator iterator = arrayList.entrySet().iterator();
        while (iterator.hasNext()) {
            arrayList = iterator.next();
            Object object4 = (Thread)arrayList.getKey();
            object22 = (gpc)arrayList.getValue();
            if (object4 == Thread.currentThread()) continue;
            if (!hav2.contains(object22.d())) {
                arrayList = gsl.a;
            } else {
                block15: {
                    for (object3 = object22; !(object3 == null || object3 instanceof goe && ((goe)object3).f() < n2); object3 = object3.a()) {
                        if (object.containsKey(object3)) {
                            arrayList = (gpc)object.get(object3);
                            break block15;
                        } else {
                            arrayList = object3;
                            if (!hac2.containsKey(object3)) {
                                continue;
                            }
                        }
                        break block15;
                    }
                    arrayList = null;
                }
                for (object3 = object22; object3 != arrayList && !object.containsKey(object3); object3 = object3.a()) {
                    object.put(object3, arrayList);
                }
                arrayList = gto.h(arrayList);
            }
            if (!((gto)((Object)arrayList)).g()) continue;
            object3 = (Throwable)hac2.get(((gto)((Object)arrayList)).c());
            object4 = new cpe((Thread)object4);
            ((Throwable)object4).addSuppressed(new gqq(null, gqq.l((gpc)object22, ((gpc)((gto)((Object)arrayList)).c()).a())));
            arrayList = new ArrayList<StackTraceElement>();
            arrayList.add(new StackTraceElement("tk_trace", gqq.d(((Throwable)object4).getMessage()), null, 0));
            Collections.addAll(arrayList, ((Throwable)object4).getStackTrace());
            arrayList.toArray(new StackTraceElement[0]);
            ((Throwable)object3).addSuppressed((Throwable)object4);
        }
        return;
    }

    public static void g(gpc gpc2, Throwable throwable) {
        if (fxf.ax(gpc2)) {
            gqq.f(hac.j(gpc2, throwable));
        }
    }

    public static void h(hac object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5 = new HashMap();
        HashMap object62 = new HashMap();
        Object object6 = ((hac)object).k().k();
        while (object6.hasNext()) {
            Object object7;
            object4 = (Map.Entry)object6.next();
            object3 = (gpc)object4.getKey();
            if (!(object3 instanceof goe)) continue;
            object = object2 = (gqm)object5.get(((gpc)object4.getKey()).d());
            if (object2 == null) {
                object = ((goe)object3).a.b().c;
                object5.put(object3.d(), object);
            }
            object2 = object7 = (Map)object62.get(object);
            if (object7 == null) {
                object2 = new HashMap<Integer, Throwable>();
                object62.put(object, (HashMap<Integer, Throwable>)object2);
            }
            object2.put(((goe)object3).f(), (Throwable)object4.getValue());
        }
        for (Map.Entry entry : object62.entrySet()) {
            int n2;
            block10: {
                object5 = (gqm)entry.getKey();
                n2 = (Integer)Collections.min(((Map)entry.getValue()).keySet());
                object4 = new HashMap();
                object3 = new ArrayList();
                object = ((gqm)object5).e.iterator();
                while (object.hasNext()) {
                    if ((((gok)object.next()).b & 0x20) != 0) continue;
                    break block10;
                }
                object3.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
            }
            object = object2 = ((gqm)object5).i;
            if (object2 == null) {
                object = gmv.a;
            }
            if ((((gmv)object).b & 1) != 0) {
                object6 = Locale.US;
                String string = ((gok)((gqm)object5).e.get((int)0)).c;
                object = object2 = ((gqm)object5).i;
                if (object2 == null) {
                    object = gmv.a;
                }
                object = object2 = ((gmv)object).c;
                if (object2 == null) {
                    object = gmu.a;
                }
                object3.add(new StackTraceElement("tk_trace", gqq.d(String.format((Locale)object6, "Trace %s tried to log too many spans. %s spans dropped", string, ((gmu)object).c)), null, 0));
            }
            if (!object3.isEmpty()) {
                gqq.e(((Map)entry.getValue()).values(), object3.toArray(new StackTraceElement[0]));
                continue;
            }
            gqq.j((gqm)object5, (Map)entry.getValue(), n2, (Map)object4);
        }
    }

    public static void i(gpc gpc2, Throwable throwable) {
        if (fxf.ax(gpc2)) {
            gqq.h(hac.j(gpc2, throwable));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void j(gqm gqm2, Map map, int n2, Map map2) {
        Iterator iterator = fvd.x(gqm2.e).iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            int n4;
            gok gok2 = (gok)iterator.next();
            Serializable serializable = null;
            if (n3 >= 10) {
                gqq.e(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((gok2.b & 0x20) != 0 || map2.containsKey(gok2)) continue;
            hxk hxk2 = gqm2.e;
            Set set = map.keySet();
            int n5 = 0;
            Object object = gok2;
            while (n5 == 0) {
                block15: {
                    block13: {
                        block14: {
                            block12: {
                                if (!map2.containsKey(object)) break block12;
                                serializable = (Integer)map2.get(object);
                                break block13;
                            }
                            if (!set.contains(((gok)object).d)) break block14;
                            serializable = Integer.valueOf(((gok)object).d);
                            break block13;
                        }
                        n4 = ((gok)object).e;
                        if (n4 >= n2) break block15;
                    }
                    n5 = 1;
                    continue;
                }
                object = (gok)hxk2.get(n4);
            }
            n5 = 0;
            object = gok2;
            while (n5 == 0) {
                block17: {
                    block16: {
                        if (map2.containsKey(object)) break block16;
                        map2.put(object, serializable);
                        if ((serializable == null || ((gok)object).e != (Integer)serializable) && (n4 = ((gok)object).e) >= 0) break block17;
                    }
                    n5 = 1;
                    continue;
                }
                object = (gok)hxk2.get(n4);
            }
            gto gto2 = gto.h(serializable);
            if (!gto2.g()) continue;
            ++n3;
            serializable = (Throwable)map.get(gto2.c());
            object = gqm2.e;
            n5 = (Integer)gto2.c();
            ArrayList<StackTraceElement> arrayList = new ArrayList<StackTraceElement>();
            arrayList.add(gqq.m(gok2));
            while (gok2.d != n5) {
                gok2 = (gok)object.get(gok2.e);
                arrayList.add(gqq.m(gok2));
            }
            ((Throwable)serializable).addSuppressed(new gqp(arrayList.toArray(new StackTraceElement[0])));
        }
        return;
    }

    public static void k(Throwable throwable) {
        gne.b(throwable);
        throw new gqq(throwable, gqq.l(gno.b(), null));
    }

    public static StackTraceElement[] l(gpc gpc2, gpc gpc3) {
        ArrayList<StackTraceElement> arrayList = new ArrayList<StackTraceElement>();
        for (gpc gpc4 = gpc2; gpc4 != gpc3; gpc4 = gpc4.a()) {
            arrayList.add(new StackTraceElement("tk_trace", gqq.d(gpc4.c()), null, 0));
        }
        if (gpc2 instanceof gnd) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement m(gok gok2) {
        CharSequence charSequence;
        if ((gok2.b & 0x20) != 0) {
            long l2 = gok2.h;
            charSequence = new StringBuilder(" ");
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" ms");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", gqq.d(String.valueOf(gok2.c).concat((String)charSequence)), null, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return this;
    }
}

