/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

final class jig
extends ixf {
    final jih a;
    private final ixf b;

    public jig(jih jih2, ixf ixf2) {
        this.a = jih2;
        this.b = ixf2;
    }

    @Override
    public final iyh a(ixg object) {
        iyh iyh2 = this.b.a((ixg)object);
        if (iyh2.g()) {
            this.a.c.a();
        } else {
            jih jih2 = this.a;
            object = new jhz(jih2, 3);
            jih2.c.b((Runnable)object);
        }
        return iyh2;
    }

    @Override
    public final void b(iyh object) {
        this.b.b((iyh)object);
        object = new jhz(this, 4, null);
        this.a.d.execute((Runnable)object);
    }

    @Override
    public final void c(ixg object) {
        if (((ixg)object).b.a(jih.b) == null) {
            ixf ixf2 = this.b;
            bmt bmt2 = new bmt(null);
            bmt2.c = ((ixg)object).a;
            bmt2.b = ((ixg)object).b;
            bmt2.a = ((ixg)object).c;
            kpy kpy2 = new kpy(((ixg)object).b);
            object = this.a;
            kpy2.b(jih.b, new AmbientMode$AmbientController(object));
            bmt2.b = kpy2.a();
            ixf2.c(bmt2.c());
            return;
        }
        throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
    }
}

