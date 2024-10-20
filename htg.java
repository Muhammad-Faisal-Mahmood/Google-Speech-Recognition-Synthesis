/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

final class htg
extends ixn {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b;
    public boolean c;
    public iyh d;
    public iwx f;
    private final gzx h;
    private final Queue i = new ArrayDeque();
    private final Set j;
    private int k;
    private boolean l;
    private boolean m;
    private iwx n;

    public htg(fvc fvc2, gzx gzx2, Set set) {
        super(fvc2);
        this.b = new LinkedHashMap();
        this.h = gzx2;
        this.k = ((hct)gzx2).c;
        this.j = set;
    }

    private final void aL() {
        if (!this.aK() && this.i.isEmpty() && this.m && !this.c) {
            this.aJ();
        }
    }

    @Override
    public final void W(iwx object) {
        this.n = object;
        object = new dlm((iwx)object);
        for (Object object22 : fvd.x(this.h.c(0, this.k))) {
            --this.k;
            for (Object object22 : fvd.x((List)object22)) {
                if (!this.j.contains(object22)) continue;
                try {
                    object22.g((dlm)object);
                }
                catch (Throwable throwable) {
                    this.d = iyh.c(throwable);
                    this.f = new iwx();
                    this.aJ();
                    return;
                }
            }
            if (!this.aK()) continue;
            return;
        }
        this.g.W(this.n);
        this.l = true;
        this.aI();
    }

    @Override
    public final void X(Object object) {
        object = new htf(object, this.h.size());
        this.i.add(object);
        this.aI();
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        this.d = iyh2;
        this.f = iwx2;
        this.m = true;
        this.aL();
    }

    public final void aI() {
        if (this.l) {
            Iterator iterator = this.i.iterator();
            block2: while (true) {
                htf htf2;
                if (!iterator.hasNext()) {
                    while (!this.i.isEmpty() && !(htf2 = (htf)this.i.peek()).a() && htf2.b == 0) {
                        this.g.X(((htf)this.i.poll()).a);
                    }
                    this.aL();
                    return;
                }
                htf2 = (htf)iterator.next();
                Iterator iterator2 = fvd.x(this.h.c(0, htf2.b)).iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block2;
                    for (hsy hsy2 : fvd.x((List)iterator2.next())) {
                        if (!this.j.contains(hsy2)) continue;
                        dlm dlm2 = new dlm(htf2.a);
                        try {
                            hsy2.f(dlm2);
                        }
                        catch (Throwable throwable) {
                            this.d = iyh.c(throwable);
                            this.f = new iwx();
                            this.aJ();
                            this.c = true;
                            return;
                        }
                    }
                    if (htf2.a()) break block2;
                    --htf2.b;
                }
                break;
            }
        }
    }

    public final void aJ() {
        Iterator iterator = fvd.x(this.h).iterator();
        while (iterator.hasNext()) {
            for (hsy hsy2 : fvd.x((List)iterator.next())) {
                bzq bzq2 = new bzq(this.d, this.f);
                if (!this.j.contains(hsy2)) continue;
                try {
                    hsy2.e(bzq2);
                }
                catch (Throwable throwable) {
                    this.d = iyh.c(throwable);
                    this.f = new iwx();
                }
            }
        }
        if (this.b.isEmpty()) {
            this.g.a(this.d, this.f);
        }
    }

    public final boolean aK() {
        return !this.a.isEmpty();
    }
}

