/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class jfp
extends itx {
    public final AtomicReference a;
    public final String b;
    final jfs c;
    private final itx d;

    public jfp(jfs jfs2, String string) {
        this.c = jfs2;
        this.a = new AtomicReference<ivl>(jfs.e);
        this.d = new jfm(this);
        a.s(string, "authority");
        this.b = string;
    }

    @Override
    public final itz a(ixb object, itw object2) {
        if (this.a.get() != jfs.e) {
            return this.c((ixb)object, (itw)object2);
        }
        jfs jfs2 = this.c;
        Object object3 = new jel(this, 12);
        jfs2.m.execute((Runnable)object3);
        if (this.a.get() != jfs.e) {
            return this.c((ixb)object, (itw)object2);
        }
        if (this.c.A.get()) {
            return new jfn();
        }
        object = new jfo(this, ius.k(), (ixb)object, (itw)object2);
        object3 = this.c;
        object2 = new jdg(this, object, 13);
        ((jfs)object3).m.execute((Runnable)object2);
        return object;
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final itz c(ixb ixb2, itw itw2) {
        Object object = (ivl)this.a.get();
        if (object == null) {
            return this.d.a(ixb2, itw2);
        }
        if (object instanceof jgc) {
            jgb jgb2 = ((jgc)object).b.b(ixb2);
            object = itw2;
            if (jgb2 != null) {
                object = itw2.f(jgb.a, jgb2);
            }
            return this.d.a(ixb2, (itw)object);
        }
        return new jfg((ivl)object, this.d, this.c.k, ixb2, itw2);
    }

    public final void d(ivl iterator) {
        ivl ivl2 = (ivl)this.a.get();
        this.a.set(iterator);
        if (ivl2 == jfs.e && (iterator = this.c.w) != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                ((jfo)iterator.next()).j();
            }
        }
    }
}

