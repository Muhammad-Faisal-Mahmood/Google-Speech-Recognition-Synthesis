/*
 * Decompiled with CFR 0.152.
 */
public final class nc
implements abc,
ml {
    final nf a;
    private final abb b;
    private final my c;
    private ml d;

    public nc(nf nf2, abb abb2, my my2) {
        jse.e(abb2, "lifecycle");
        jse.e(my2, "onBackPressedCallback");
        this.a = nf2;
        this.b = abb2;
        this.c = my2;
        abb2.b(this);
    }

    @Override
    public final void a(abe object, aaz object2) {
        if (object2 == aaz.ON_START) {
            nf nf2 = this.a;
            object2 = this.c;
            jse.e(object2, "onBackPressedCallback");
            nf2.a.add(object2);
            object = new nd(nf2, (my)object2);
            ((my)object2).e((ml)object);
            nf2.d();
            ((my)object2).d = new ne(nf2, 0);
            this.d = object;
            return;
        }
        if (object2 == aaz.ON_STOP) {
            object = this.d;
            if (object != null) {
                object.b();
                return;
            }
        } else if (object2 == aaz.ON_DESTROY) {
            this.b();
        }
    }

    @Override
    public final void b() {
        this.b.c(this);
        this.c.f(this);
        ml ml2 = this.d;
        if (ml2 != null) {
            ml2.b();
        }
        this.d = null;
    }
}

