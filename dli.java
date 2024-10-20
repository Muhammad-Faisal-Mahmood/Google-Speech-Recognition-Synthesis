/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class dli {
    public dlj a;
    public dld b;
    public final dlh c = new dlh();

    public dli(dlm object, dlq dlq2, jnu object2) {
        dlj dlj2;
        Objects.requireNonNull(object2);
        object2 = fvd.ap(new aim(object2, 11));
        this.a = dlj2 = new dlj(new dlg(this, (gui)object2, object, 1));
        ((dlm)object).a(dlj2);
        this.b = object = new dld(new dlg(this, (gui)object2, dlq2, 0));
        dlq2.g.add(object);
    }

    public final void a(dle dle2) {
        this.c.b.add(dle2);
    }

    public final void b(dle dle2) {
        this.c.b.remove(dle2);
    }
}

