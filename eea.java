/*
 * Decompiled with CFR 0.152.
 */
public final class eea
implements eee {
    final eeb a;
    private final int b;
    private final juc c;
    private final jtz d;

    public eea(eeb eeb2, int n2) {
        this.a = eeb2;
        this.b = n2;
        this.c = new juc(null, jud.a);
        this.d = new jtz(false, jud.a);
    }

    public final void a(eee eee2) {
        this.c.c(eee2);
    }

    @Override
    public final void b(dzn object) {
        jse.e(object, "audioData");
        if (!this.d.b()) {
            Object object2;
            if (((dzn)object).c == 2) {
                this.d.a = 1;
            }
            if ((object2 = (eee)this.c.a) != null) {
                object2.b((dzn)object);
            }
            if (((dzn)object).c != 2 && ((dzn)object).g >= this.b) {
                object = this.a;
                cxt cxt2 = dox.g(dzn.a.l());
                object2 = dox.k(dzt.a.l());
                ((bzo)object2).u(dzu.b);
                cxt2.g(((bzo)object2).t());
                ((eeb)object).e(this, cxt2.e());
            }
        }
    }
}

