/*
 * Decompiled with CFR 0.152.
 */
public final class dbg
implements dbi {
    public final Object a;
    private final int b;

    public /* synthetic */ dbg(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Object object) {
        if (this.b != 0) {
            ((gzs)this.a).h(object);
            return;
        }
        dde.f((String)object);
        ((dem)this.a).b().h(object);
    }
}

