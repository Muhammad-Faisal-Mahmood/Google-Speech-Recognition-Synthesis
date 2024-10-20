/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dyu {
    public final Object a;
    public gto b;
    private final LinkedList c = new LinkedList();
    private final gyb d = new gyb();
    private final Set e = new HashSet();
    private final dxz f;
    private final Map g;
    private int h = 300;

    public dyu(gto gto2, int n2) {
        this.a = new Object();
        this.b = gsl.a;
        this.g = new HashMap();
        this.f = (dxz)gto2.e(dxz.b());
        this.h = n2;
    }

    private static boolean c(Map map, Map map2) {
        for (String string : ((hac)map2).l()) {
            if (!map.containsKey(string) || hhk.p((Set)map.get(string), (Set)map2.get(string)).isEmpty()) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gto a(dym object) {
        synchronized (this) {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            if (this.c.size() + 1 > this.h && (object6 = (dym)this.c.pollFirst()) != null) {
                object5 = this.d;
                object4 = (Collection)((gxp)object5).a.remove(object6);
                if (object4 == null) {
                    Collections.emptyList();
                } else {
                    object3 = ((gxp)object5).a();
                    object3.addAll(object4);
                    ((gxp)object5).b -= object4.size();
                    object4.clear();
                    DesugarCollections.unmodifiableList(object3);
                }
                this.e.remove(object6);
                if (((dym)object6).e() && this.g.containsKey(object6) && !(object4 = (hpn)this.g.get(object6)).isDone()) {
                    object4.cancel(false);
                }
            }
            hac hac2 = ((dym)object).f;
            object4 = this.c;
            Object object7 = ((LinkedList)object4).listIterator(((LinkedList)object4).size());
            object4 = gsl.a;
            while (object7.hasPrevious()) {
                object2 = (dym)object7.previous();
                object6 = object3 = ((bor)((dym)object2).h.b).d;
                if (object3 == null) {
                    object6 = ibk.a;
                }
                object6 = object3 = ((ibk)object6).c;
                if (object3 == null) {
                    object6 = hzb.a;
                }
                object3 = object5 = ((bor)((dym)object).h.b).d;
                if (object5 == null) {
                    object3 = ibk.a;
                }
                object3 = object5 = ((ibk)object3).c;
                if (object5 == null) {
                    object3 = hzb.a;
                }
                hzw.e((hzb)object6);
                hzw.e((hzb)object3);
                int n2 = Long.compare(((hzb)object6).b, ((hzb)object3).b);
                if (n2 == 0) {
                    n2 = Integer.compare(((hzb)object6).c, ((hzb)object3).c);
                }
                if (n2 <= 0) {
                    object7.next();
                    break;
                }
                if (!((dym)object2).d() || !((dym)object2).c().contains(((dym)object).a()) || !hac2.isEmpty() && !((dym)object2).f.isEmpty() && !dyu.c(((dym)object2).f, hac2) || ((gto)object4).g()) continue;
                object4 = gto.i(object2);
            }
            object7.add(object);
            if (((gto)object4).g()) {
                object7.previous();
                ((gxw)this.d).m(object, ((dym)((gto)object4).c()).b());
                object4 = object6 = new dyv((ListIterator)object7, 2, (gto)object4);
            } else {
                if (((dym)object).e() && this.f.c.g() && ((dym)object).e.e.g()) {
                    long l2;
                    object4 = ((dym)object).h;
                    long l3 = SystemClock.elapsedRealtime();
                    object4 = object6 = ((bor)((hwp)object4).b).d;
                    if (object6 == null) {
                        object4 = ibk.a;
                    }
                    object4 = object6 = ((ibk)object4).c;
                    if (object6 == null) {
                        object4 = hzb.a;
                    }
                    long l4 = l2 = hzw.a((hzb)object4);
                    if (l2 > l3) {
                        l4 = l3;
                    }
                    if ((l4 = (Long)((dym)object).e.e.c() - (l3 - l4)) <= 0L) {
                        this.b((dym)object);
                    } else {
                        object3 = this.f.c.c();
                        object6 = new dyt(this);
                        object4 = new bcv((gty)object6, (dym)object, 4);
                        object4 = object3.b((Runnable)object4, l4, TimeUnit.MILLISECONDS);
                        this.g.put(object, object4);
                    }
                }
                object4 = new dyv((ListIterator)object7, 1, gsl.a);
            }
            if (((dyv)object4).c - 1 != 0) {
                object = ((dym)object).f;
                object3 = new dyr();
                object6 = new gzs();
                while (((dyv)object4).a.hasNext()) {
                    object5 = (dym)((dyv)object4).a.next();
                    if (!((hac)object).isEmpty() && !((dym)object5).f.isEmpty() && !dyu.c(((dym)object5).f, (Map)object)) continue;
                    ((gzs)object6).h(object5);
                    if (object5 != ((dyv)object4).b.c()) continue;
                }
                ((dyr)object3).b(((gzs)object6).g());
                ((dyr)object3).a = 7;
                return gto.i(((dyr)object3).a());
            }
            if (!((dym)object).d()) {
                return gsl.a;
            }
            object2 = ((dyv)object4).a;
            hac2 = ((dym)object).f;
            object7 = ((dym)object).c();
            object5 = ((dym)object).b();
            object4 = new dyr();
            object = new gzs();
            object3 = new ArrayDeque();
            while (object2.hasPrevious()) {
                object6 = (dym)object2.previous();
                if (!hac2.isEmpty() && !((dym)object6).f.isEmpty() && !dyu.c(((dym)object6).f, hac2)) continue;
                ((ArrayDeque)object3).add(object6);
                if (!((gzm)object7).contains(((dym)object6).a())) continue;
                if (this.f.c.g() && (object7 = (hpn)this.g.remove(object6)) != null) {
                    object7.cancel(false);
                }
                if (this.e.contains(object6)) {
                    ((dyr)object4).a = 6;
                } else {
                    object7 = (Collection)this.d.o().get(object6);
                    if (object7 != null && object7.contains(object5)) {
                        ((dyr)object4).a = 5;
                    } else {
                        ((gxw)this.d).m(object6, object5);
                        ((dyr)object4).a = 2;
                    }
                }
                ((gzs)object).k(((ArrayDeque)object3).descendingIterator());
                ((dyr)object4).b(((gzs)object).g());
                object = ((dyr)object4).a();
                return gto.i(object);
            }
            ((dyr)object4).b(gzx.o(this.c));
            ((dyr)object4).a = 3;
            object = ((dyr)object4).a();
            return gto.i(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(dym object) {
        Object object2 = new ArrayDeque<dym>();
        Object object3 = new dyr();
        Object object4 = new gzs();
        synchronized (this) {
            dym dym2;
            this.g.remove(object);
            this.e.add(object);
            Object object5 = this.c;
            object5 = ((LinkedList)object5).listIterator(((LinkedList)object5).size());
            while (object5.hasPrevious() && (dym2 = (dym)object5.previous()) != object) {
                ((ArrayDeque)object2).add(dym2);
            }
        }
        ((ArrayDeque)object2).add(object);
        ((gzs)object4).k(((ArrayDeque)object2).descendingIterator());
        ((dyr)object3).b(((gzs)object4).g());
        ((dyr)object3).a = 4;
        object = this.a;
        synchronized (object) {
            if (this.b.g()) {
                object4 = this.b.c();
                object2 = ((dyr)object3).a();
                object3 = ((dxq)object4).a;
                object2 = ((dxq)object4).a((dys)object2);
                synchronized (object3) {
                    if (((dxq)object4).b.g()) {
                        ((dxq)object4).b.c().b((dzc)object2);
                        ((dxq)object4).b((dzc)object2);
                    }
                }
            }
            return;
        }
    }
}

