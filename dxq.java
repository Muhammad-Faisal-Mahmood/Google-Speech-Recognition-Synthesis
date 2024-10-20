/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dxq
implements dxk {
    private static final long d = TimeUnit.MINUTES.toNanos(20L);
    public final Object a;
    public gto b;
    public final dyu c;
    private final Deque e = new ArrayDeque();
    private final dxz f;
    private final int g;
    private final iuv h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public dxq(dpq object, gto object2, iuv iuv2, gto gto2, dxs dxs2) {
        this.a = new Object();
        this.b = gsl.a;
        Object object3 = (dxz)gto2.e(dxz.b());
        this.f = object3;
        gto2 = dxs2.e;
        int n2 = ((dxz)object3).a;
        object3 = n2;
        gto2.e(object3);
        object3.getClass();
        this.g = (Integer)dxs2.d.a((gto)object2).e(0);
        this.h = iuv2;
        ((cgw)((dpq)object).b.b()).getClass();
        this.c = object2 = new dyu(((bqw)((dpq)object).a).a(), n2);
        object = ((dyu)object2).a;
        synchronized (object) {
            ((dyu)object2).b = gto.i(this);
            return;
        }
    }

    private static dyf c(dys object) {
        int n2 = ((dys)object).b;
        if (n2 != 0) {
            object = ((dys)object).a;
            if (n2 - 1 != 3) {
                return ((dym)fvd.P((Iterable)object)).e.b();
            }
            return ((dym)object.get((int)0)).e.b();
        }
        throw null;
    }

    public final dzc a(dys object) {
        long l2;
        Object object2;
        int n2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        gzs gzs2 = new gzs();
        dzb dzb2 = dzc.a();
        hwp hwp2 = kcw.a.l();
        int n4 = dxq.c((dys)object).a;
        int n5 = dxq.c((dys)object).b;
        if (n5 != 1) {
            object5 = kcv.a.l();
            n3 = this.g;
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object4 = ((hwp)object5).b;
            object3 = (kcv)object4;
            ((kcv)object3).b |= 1;
            ((kcv)object3).c = n3;
            if (!((hwv)object4).B()) {
                ((hwp)object5).u();
            }
            object4 = (kcv)((hwp)object5).b;
            ((kcv)object4).d = n5 - 1;
            ((kcv)object4).b |= 2;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object4 = (kcw)hwp2.b;
            object5 = (kcv)((hwp)object5).o();
            object5.getClass();
            ((kcw)object4).j = object5;
            ((kcw)object4).b |= 0x40;
        } else {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object5 = (kcw)hwp2.b;
            ((kcw)object5).b |= 4;
            ((kcw)object5).f = n4;
        }
        Object object6 = ((dys)object).a;
        HashSet hashSet = new HashSet();
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        n3 = object6.size();
        object5 = null;
        for (n2 = 0; n2 < n3; ++n2) {
            dym dym2 = (dym)object6.get(n2);
            object4 = dym2.b;
            int n6 = dym2.a().a();
            object4 = (bor)dym2.h.o();
            hwp hwp3 = bor.a.m((hwv)object4);
            hwp hwp4 = bot.a.l();
            if (n6 != 0 && n6 != n4) {
                if (!hwp4.b.B()) {
                    hwp4.u();
                }
                object4 = (bot)hwp4.b;
                ((bot)object4).b |= 1;
                ((bot)object4).c = n6;
            }
            if ((n6 = dym2.a().b()) != 1 && n5 != n6) {
                if (!hwp4.b.B()) {
                    hwp4.u();
                }
                object4 = (bot)hwp4.b;
                ((bot)object4).e = n6 - 1;
                ((bot)object4).b |= 4;
            }
            object2 = dym2.f.l().k();
            block1: while (object2.hasNext()) {
                object4 = (String)object2.next();
                object3 = (Set)dym2.f.get(object4);
                if (object3 == null) continue;
                Iterator iterator = object3.iterator();
                object3 = object2;
                while (true) {
                    object2 = object3;
                    if (!iterator.hasNext()) continue block1;
                    object2 = new dxp((String)object4, (String)iterator.next());
                    if (!hashMap.containsKey(object2)) {
                        hashMap.put(object2, hashMap.size() + 1);
                    }
                    n6 = (Integer)hashMap.get(object2);
                    if (!hwp4.b.B()) {
                        hwp4.u();
                    }
                    object2 = (bot)hwp4.b;
                    hxb hxb2 = ((bot)object2).f;
                    if (!hxb2.c()) {
                        ((bot)object2).f = hwv.q(hxb2);
                    }
                    ((bot)object2).f.g(n6);
                }
            }
            n6 = ((bot)hwp4.b).b;
            if ((n6 & 1) != 0 || (n6 & 4) != 0 || !dym2.f.isEmpty()) {
                object4 = bou.a.l();
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object3 = (bou)((hwp)object4).b;
                object2 = (bot)hwp4.o();
                object2.getClass();
                ((bou)object3).f = object2;
                ((bou)object3).b |= 8;
                object4 = (bou)((hwp)object4).p();
                if (!hwp3.b.B()) {
                    hwp3.u();
                }
                object3 = (bor)hwp3.b;
                object4.getClass();
                object2 = ((bor)object3).c;
                if (object2 != null && object2 != bou.a) {
                    object2 = bou.a.m((hwv)object2);
                    ((hwp)object2).x((hwv)object4);
                    ((bor)object3).c = (bou)((hwp)object2).p();
                } else {
                    ((bor)object3).c = object4;
                }
                ((bor)object3).b |= 1;
            }
            if (dym2.d.g()) {
                object4 = dym2.d.c();
                if (object5 == null || !((gpu)object5).a.equals(object3 = ((gpu)object4).a)) {
                    object3 = (gpu)object4;
                    l2 = ((gpu)object3).a.getMostSignificantBits();
                    if (!hwp3.b.B()) {
                        hwp3.u();
                    }
                    object5 = (bor)hwp3.b;
                    ((bor)object5).b |= 8;
                    ((bor)object5).f = l2;
                    l2 = ((gpu)object3).a.getLeastSignificantBits();
                    if (!hwp3.b.B()) {
                        hwp3.u();
                    }
                    object5 = (bor)hwp3.b;
                    ((bor)object5).b |= 0x10;
                    ((bor)object5).g = l2;
                    object5 = object4;
                }
                n6 = ((gpu)object4).b;
                if (!hwp3.b.B()) {
                    hwp3.u();
                }
                object4 = (bor)hwp3.b;
                ((bor)object4).b |= 0x20;
                ((bor)object4).h = n6;
            }
            hwp2.X((bor)hwp3.o());
            hashSet.addAll(dym2.g);
        }
        n5 = ((dys)object).b;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object5 = (kcw)hwp2.b;
        if (n5 != 0) {
            ((kcw)object5).c = n5 - 1;
            ((kcw)object5).b |= 1;
            object4 = (dym)object6.get(0);
            object2 = (dym)fvd.P((Iterable)object6);
            object5 = ((dym)object2).b();
            if (((dys)object).b != 3) {
                object3 = (bor)((dym)object4).h.o();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object6 = (kcw)hwp2.b;
                object3.getClass();
                ((kcw)object6).g = object3;
                ((kcw)object6).b |= 8;
            }
            if (((dys)object).b != 4) {
                object6 = (bor)((dym)object2).h.o();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object3 = (kcw)hwp2.b;
                object6.getClass();
                ((kcw)object3).h = object6;
                ((kcw)object3).b |= 0x10;
                n5 = ((dym)object2).b().b();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object3 = (kcw)hwp2.b;
                ((kcw)object3).b |= 2;
                ((kcw)object3).e = n5;
            } else if (!((dym)object4).d()) {
                object5 = ((dym)object4).b();
                n5 = ((dym)object4).b().b();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object3 = (kcw)hwp2.b;
                ((kcw)object3).b |= 2;
                ((kcw)object3).e = n5;
            } else {
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object3 = (kcw)hwp2.b;
                ((kcw)object3).b |= 2;
                ((kcw)object3).e = 1;
            }
            dzb2.c((dyg)object5);
            n5 = ((dys)object).b;
            if (n5 != 3 && n5 != 4) {
                object4 = object3 = ((bor)((dym)object4).h.b).d;
                if (object3 == null) {
                    object4 = ibk.a;
                }
                object4 = object3 = ((ibk)object4).c;
                if (object3 == null) {
                    object4 = hzb.a;
                }
                object3 = object2 = ((bor)((dym)object2).h.b).d;
                if (object2 == null) {
                    object3 = ibk.a;
                }
                object3 = object2 = ((ibk)object3).c;
                if (object2 == null) {
                    object3 = hzb.a;
                }
                hzw.e((hzb)object4);
                hzw.e((hzb)object3);
                l2 = hhk.ar(((hzb)object3).b, ((hzb)object4).b);
                n3 = ((hzb)object3).c;
                n2 = ((hzb)object4).c;
                long l3 = (long)n3 - (long)n2;
                n5 = (int)l3;
                if (l3 == (long)n5) {
                    object4 = hzu.c(l2, n5);
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object3 = (kcw)hwp2.b;
                    object4.getClass();
                    ((kcw)object3).i = object4;
                    ((kcw)object3).b |= 0x20;
                } else {
                    object = new StringBuilder("overflow: checkedSubtract(");
                    ((StringBuilder)object).append(n3);
                    ((StringBuilder)object).append(", ");
                    ((StringBuilder)object).append(n2);
                    ((StringBuilder)object).append(")");
                    throw new ArithmeticException(((StringBuilder)object).toString());
                }
            }
            if (this.h.a && ((dys)object).b != 4 && (n5 = object5.a()) > 1) {
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (kcw)hwp2.b;
                ((kcw)object).b |= 0x80;
                ((kcw)object).k = n5;
                object = this.h;
                if (object5.a() > 1 && ((Random)(object = ((iuv)object).b)).nextInt(n5 = object5.a()) != 0) {
                    dzb2.e(true);
                }
            }
            dzb2.b((kcw)hwp2.o());
            dzb2.f(hashSet);
            dzb2.d(gzs2.g());
            return dzb2.a();
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(dzc object) {
        Deque deque = this.e;
        synchronized (deque) {
            long l2 = cgw.o();
            long l3 = cgw.p().toEpochMilli();
            Deque deque2 = this.e;
            Object object2 = ((dzc)object).a;
            boolean bl2 = ((dzc)object).d;
            object = new dyq((kcw)object2, gto.i(l3), bl2);
            object2 = new dxo((dyq)object, l2);
            deque2.addLast(object2);
            if (this.e.size() <= 10) {
                return;
            }
            while (this.e.size() > 30 || this.e.size() > 10 && l2 > ((dxo)this.e.getFirst()).a + d) {
                this.e.removeFirst();
            }
            return;
        }
    }
}

