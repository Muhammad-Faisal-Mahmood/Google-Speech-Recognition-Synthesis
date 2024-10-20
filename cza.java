/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class cza
implements gte {
    public final Set a;
    public final ctt b;
    public final AtomicLong c;
    public final Set d;
    public final boolean e;
    public final czc f;
    public final cxr g;
    public final Set h;

    public /* synthetic */ cza(Set set, ctt ctt2, AtomicLong atomicLong, Set set2, boolean bl2, czc czc2, cxr cxr2, Set set3) {
        this.a = set;
        this.b = ctt2;
        this.c = atomicLong;
        this.d = set2;
        this.e = bl2;
        this.f = czc2;
        this.g = cxr2;
        this.h = set3;
    }

    @Override
    public final Object apply(Object object) {
        object = (Long)object;
        Object object2 = this.a;
        ctt ctt2 = this.b;
        if (!object2.contains(ctt2)) {
            this.c.getAndAdd((Long)object);
            object2.add(ctt2);
        }
        object2 = this.f;
        boolean bl2 = this.e;
        Set set = this.d;
        if (!set.contains(ctt2)) {
            if (bl2) {
                ((czc)object2).b += ((Long)object).longValue();
            }
            ((czc)object2).a += ((Long)object).longValue();
            set.add(ctt2);
        }
        if (this.g.a.f) {
            set = this.h;
            fxf.K(set);
            if (!set.contains(ctt2)) {
                if (bl2) {
                    ((czc)object2).d += ((Long)object).longValue();
                    ++((czc)object2).f;
                }
                ((czc)object2).c += ((Long)object).longValue();
                set.add(ctt2);
            }
        }
        return null;
    }
}

