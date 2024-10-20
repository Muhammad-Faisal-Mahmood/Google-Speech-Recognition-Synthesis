/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ajq {
    public final List a;
    public final IdentityHashMap b;
    public final Map c;
    public final ajp d;
    public final HashMap e;
    public final Set f;
    public final afp g;
    public boolean h;
    public ahl i;
    public final akl j;
    public bmu k;
    private final akr l;

    public ajq(ajp ajp2, akl akl2, afp afp2, akr akr2) {
        this.l = akr2;
        this.d = ajp2;
        this.k = new bmu();
        this.b = new IdentityHashMap();
        this.c = new HashMap();
        this.a = new ArrayList();
        this.j = akl2;
        this.g = afp2;
        this.e = new HashMap();
        this.f = new HashSet();
    }

    private final void h(int n2, int n3) {
        while (n2 < this.a.size()) {
            ajo ajo2 = (ajo)this.a.get(n2);
            ajo2.d += n3;
            ++n2;
        }
    }

    private final void i(ajo object) {
        if ((object = (bmu)this.e.get(object)) != null) {
            ((bmu)object).a.c((and)((bmu)object).c);
        }
    }

    private final void j(ajo ajo2) {
        if (ajo2.e && ajo2.c.isEmpty()) {
            bmu bmu2 = (bmu)this.e.remove(ajo2);
            abr.i(bmu2);
            bmu2.a.j((and)bmu2.c);
            bmu2.a.m((ani)bmu2.b);
            bmu2.a.l((alc)bmu2.b);
            this.f.remove(ajo2);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final aew b() {
        if (!this.a.isEmpty()) {
            int n2 = 0;
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                ajo ajo2 = (ajo)this.a.get(i2);
                ajo2.d = n2;
                n2 += ((aew)ajo2.a.g).c();
            }
            return new aia(this.a, this.k);
        }
        return aew.a;
    }

    public final void c() {
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ajo ajo2 = (ajo)iterator.next();
            if (!ajo2.c.isEmpty()) continue;
            this.i(ajo2);
            iterator.remove();
        }
    }

    public final void d(ajo ajo2) {
        amz amz2 = ajo2.a;
        amq amq2 = new amq(this, 1);
        ajn ajn2 = new ajn(this, ajo2);
        bmu bmu2 = new bmu(amz2, amq2, ajn2);
        this.e.put(ajo2, bmu2);
        amz2.b(agf.o(), ajn2);
        agf.o();
        amz2.q(ajn2);
        amz2.g(amq2, this.i, this.l);
    }

    public final void e(anb object) {
        ajo ajo2 = (ajo)this.b.remove(object);
        abr.i(ajo2);
        ((aod)ajo2.a).z((anb)object);
        object = ((amw)object).a;
        ajo2.c.remove(object);
        if (!this.b.isEmpty()) {
            this.c();
        }
        this.j(ajo2);
    }

    public final void f(int n2, int n3) {
        int n4;
        while ((n4 = n3 - 1) >= n2) {
            ajo ajo2 = (ajo)this.a.remove(n4);
            this.c.remove(ajo2.b);
            this.h(n4, -((aew)ajo2.a.g).c());
            ajo2.e = true;
            n3 = n4;
            if (!this.h) continue;
            this.j(ajo2);
            n3 = n4;
        }
    }

    public final aew g(int n2, List list, bmu object) {
        if (!list.isEmpty()) {
            this.k = object;
            for (int i2 = n2; i2 < list.size() + n2; ++i2) {
                object = (ajo)list.get(i2 - n2);
                if (i2 > 0) {
                    ajo ajo2 = (ajo)this.a.get(i2 - 1);
                    amx amx2 = ajo2.a.g;
                    ((ajo)object).c(ajo2.d + ((aew)amx2).c());
                } else {
                    ((ajo)object).c(0);
                }
                this.h(i2, ((aew)((ajo)object).a.g).c());
                this.a.add(i2, object);
                this.c.put(((ajo)object).b, object);
                if (!this.h) continue;
                this.d((ajo)object);
                if (this.b.isEmpty()) {
                    this.f.add(object);
                    continue;
                }
                this.i((ajo)object);
            }
        }
        return this.b();
    }
}

