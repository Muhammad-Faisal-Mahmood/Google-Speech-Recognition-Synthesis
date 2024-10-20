/*
 * Decompiled with CFR 0.152.
 */
final class jcf
extends jcw {
    final iyh a;
    final iwx b;
    final jch c;

    public jcf(jch jch2, iyh iyh2, iwx iwx2) {
        this.a = iyh2;
        this.b = iwx2;
        this.c = jch2;
        super(jch2.b.e);
    }

    @Override
    public final void a() {
        int n2 = jnr.a;
        this.c.b.f.c();
        iyh iyh2 = this.a;
        iwx iwx2 = this.b;
        iyh iyh3 = this.c.a;
        if (iyh3 != null) {
            iwx2 = new iwx();
            iyh2 = iyh3;
        }
        try {
            this.c.c.a(iyh2, iwx2);
            return;
        }
        finally {
            this.c.b.d.a(iyh2.g());
        }
    }
}

