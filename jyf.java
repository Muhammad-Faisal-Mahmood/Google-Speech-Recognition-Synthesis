/*
 * Decompiled with CFR 0.152.
 */
public final class jyf
extends jxu {
    private final int f;
    private final int g;

    public jyf(int n2, int n3) {
        super(n2);
        this.f = n2;
        this.g = n3;
        if (n3 != 1) {
            if (n2 > 0) {
                return;
            }
            throw new IllegalArgumentException(a.ah(n2, "Buffered channel capacity must be at least 1, but ", " was specified"));
        }
        n2 = jsk.a;
        String string = new jrz(jxu.class).c();
        StringBuilder stringBuilder = new StringBuilder("This implementation does not support suspension for senders, use ");
        stringBuilder.append(string);
        stringBuilder.append(" instead");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Object C(Object object) {
        kau kau2;
        block4: {
            int n2;
            boolean bl2;
            block5: {
                long l2;
                kbt kbt2 = jxw.c;
                kau2 = (kau)this.d.a;
                while (true) {
                    int n3;
                    long l3 = this.b.b();
                    l2 = l3 & 0xFFFFFFFFFFFFFFFL;
                    bl2 = super.s(l3);
                    l3 = jxw.a;
                    long l4 = l2 / l3;
                    n2 = (int)(l2 % l3);
                    if (kau2.b != l4) {
                        kau kau3 = super.z(l4, kau2);
                        if (kau3 == null) {
                            if (!bl2) continue;
                            return new jya(this.j());
                        }
                        kau2 = kau3;
                    }
                    if ((n3 = super.v(kau2, n2, object, l2, kbt2, bl2)) == 0) break block4;
                    if (n3 == 1) return jon.a;
                    if (n3 == 2) break block5;
                    if (n3 == 3) throw new IllegalStateException("unexpected");
                    if (n3 == 4) break;
                    kau2.d();
                }
                if (l2 >= this.a()) return new jya(this.j());
                kau2.d();
                return new jya(this.j());
            }
            if (bl2) {
                kau2.g();
                return new jya(this.j());
            }
            this.k(kau2.b * (long)jxw.a + (long)n2);
            return jon.a;
        }
        kau2.d();
        return jon.a;
    }

    @Override
    public final Object e(Object object, jqb jqb2) {
        if (!((object = this.C(object)) instanceof jya)) {
            return jon.a;
        }
        object = (jya)object;
        throw this.j();
    }

    @Override
    public final Object g(Object object) {
        return this.C(object);
    }

    @Override
    protected final boolean t() {
        return this.g == 2;
    }
}

