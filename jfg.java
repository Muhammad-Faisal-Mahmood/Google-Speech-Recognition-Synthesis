/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class jfg
extends ivb {
    public final ius a;
    private final ivl b;
    private final itx c;
    private final Executor d;
    private final ixb e;
    private itw f;
    private itz g;

    public jfg(ivl object, itx itx2, Executor object2, ixb ixb2, itw itw2) {
        this.b = object;
        this.c = itx2;
        this.e = ixb2;
        object = itw2.c;
        if (object != null) {
            object2 = object;
        }
        this.d = object2;
        this.f = itw2.c((Executor)object2);
        this.a = ius.k();
    }

    @Override
    public final void a(fvc fvc2, iwx object) {
        new iwc(this.e, (iwx)object, this.f, jfs.f);
        Object object2 = this.b.a();
        Object object3 = (iyh)((ksb)object2).a;
        if (((iyh)object3).g()) {
            object2 = ((ksb)object2).b;
            object3 = this.e;
            if ((object2 = ((jgd)object2).b((ixb)object3)) != null) {
                this.f = this.f.f(jgb.a, object2);
            }
            this.g = object2 = this.c.a(this.e, this.f);
            ((itz)object2).a(fvc2, (iwx)object);
            return;
        }
        object = jeb.b((iyh)object3);
        this.d.execute(new jff(this, fvc2, (iyh)object));
        this.g = jfs.g;
    }

    @Override
    public final void c(String string, Throwable throwable) {
        itz itz2 = this.g;
        if (itz2 != null) {
            itz2.c(string, throwable);
        }
    }

    @Override
    protected final itz g() {
        return this.g;
    }
}

