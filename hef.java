/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.logging.Level;

public abstract class hef
extends heo
implements hew {
    protected hef(Level level) {
        super(level);
    }

    @Override
    protected final hhz a() {
        return hhx.a;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final boolean b(hes object) {
        hfj hfj2;
        Object[] objectArray;
        Object object2;
        Object object3;
        int n2;
        Object object4 = this.l();
        int n3 = ((hfz)object4).b();
        boolean bl2 = false;
        for (n2 = 0; n2 < n3; ++n2) {
            if (((hfz)object4).c((int)n2).a != "eye3tag") continue;
            if (((hfz)object4).d(hem.a) != null || ((hfz)object4).d(hem.i) != null) break;
            this.p(hem.i, (Object)hfj.a);
            break;
        }
        if ((object4 = this.c) == null) return true;
        if (object != null) {
            void var1_5;
            hfe hfe2;
            long l2;
            long l3 = this.b;
            object3 = hee.a;
            object3 = (hed)((hfz)object4).d(hem.d);
            if (object3 == null) {
                object4 = null;
            } else {
                long l4;
                object4 = (hee)hee.a.b((hes)object, (hfz)object4);
                boolean bl3 = l3 >= 0L;
                hhk.f(bl3, "timestamp cannot be negative");
                l2 = ((hee)object4).b.get();
                if (l2 >= 0L && ((l4 = ((hed)object3).b.toNanos(n2 = ((hed)object3).a) + l2) < 0L || l3 < l4)) {
                    object4 = hee.c;
                } else {
                    ((hee)object4).b.compareAndSet(l2, -l3);
                }
            }
            object3 = this.c;
            object2 = heb.a;
            object2 = (Integer)((hfz)object3).d(hem.b);
            if (object2 == null) {
                object3 = null;
            } else {
                object3 = (heb)heb.a.b((hes)object, (hfz)object3);
                objectArray = ((heb)object3).b;
                l2 = ((Integer)object2).intValue();
                if (objectArray.incrementAndGet() < l2) {
                    object3 = heb.c;
                }
            }
            object4 = hfe.b((hfe)object4, (hfe)object3);
            object2 = this.c;
            object3 = hfh.a;
            object3 = (Integer)((hfz)object2).d(hem.c);
            if (object3 != null && (Integer)object3 > 0) {
                hfh hfh2 = (hfh)hfh.a.b((hes)object, (hfz)object2);
                n2 = (Integer)object3;
                n2 = ((Random)hfh.b.get()).nextInt(n2) == 0 ? hfh2.e.incrementAndGet() : hfh2.e.get();
                if (n2 <= 0) {
                    hfe hfe3 = hfh.c;
                }
            } else {
                Object var1_4 = null;
            }
            this.d = hfe2 = hfe.b((hfe)object4, (hfe)var1_5);
            if (hfe2 == hfe.c) {
                return bl2;
            }
        }
        if ((hfj2 = (hfj)((Object)this.c.d(hem.i))) == null) return true;
        object4 = hem.i;
        object3 = this.c;
        if (object3 != null && (n2 = ((hen)object3).a((hez)object4)) >= 0) {
            int n4;
            n2 += n2;
            for (n3 = n2 + 2; n3 < (n4 = ((hen)object3).b) + n4; n3 += 2) {
                object2 = ((hen)object3).a[n3];
                n4 = n2;
                if (!object2.equals(object4)) {
                    objectArray = ((hen)object3).a;
                    objectArray[n2] = object2;
                    objectArray[n2 + 1] = objectArray[n3 + 1];
                    n4 = n2 + 2;
                }
                n2 = n4;
            }
            ((hen)object3).b = n4 - (n3 - n2 >> 1);
            while (n2 < n3) {
                ((hen)object3).a[n2] = null;
                ++n2;
            }
        }
        object4 = (Throwable)this.l().d(hem.a);
        n2 = hfj2.f;
        if (n2 <= 0) {
            if (n2 != -1) throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        heu heu2 = new heu((Throwable)object4, hfj2, hic.a.b(heo.class, n2));
        this.p(hem.a, heu2);
        return true;
    }
}

