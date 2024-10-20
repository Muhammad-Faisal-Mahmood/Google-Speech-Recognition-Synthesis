/*
 * Decompiled with CFR 0.152.
 */
public final class akk {
    public final aeu a;
    public gzx b;
    public anc c;
    public anc d;
    public anc e;
    private hac f;

    public akk(aeu aeu2) {
        this.a = aeu2;
        int n2 = gzx.d;
        this.b = hct.a;
        this.f = hcy.a;
    }

    public static anc b(aes aes2, gzx gzx2, anc anc2, aeu object) {
        int n2;
        aew aew2 = aes2.g();
        Object object2 = (aiy)aes2;
        ((aiy)object2).t();
        boolean bl2 = ((aiy)object2).o.b.p();
        int n3 = 0;
        if (bl2) {
            n2 = 0;
        } else {
            object2 = ((aiy)object2).o;
            n2 = ((ajr)object2).b.a(((ajr)object2).c.a);
        }
        object2 = aew2.p() ? null : aew2.f(n2);
        n2 = !aes2.m() && !aew2.p() ? aew2.m(n2, (aeu)object).b(agf.i(aes2.f())) : -1;
        while (n3 < gzx2.size()) {
            object = (anc)gzx2.get(n3);
            if (akk.e((anc)object, object2, aes2.m(), aes2.a(), aes2.b(), n2)) {
                return object;
            }
            ++n3;
        }
        if (gzx2.isEmpty() && anc2 != null && akk.e(anc2, object2, aes2.m(), aes2.a(), aes2.b(), n2)) {
            return anc2;
        }
        return null;
    }

    private final void d(gzy gzy2, anc anc2, aew aew2) {
        if (anc2 != null) {
            if (aew2.a(anc2.a) != -1) {
                gzy2.d(anc2, aew2);
                return;
            }
            aew2 = (aew)this.f.get(anc2);
            if (aew2 != null) {
                gzy2.d(anc2, aew2);
            }
        }
    }

    private static boolean e(anc anc2, Object object, boolean bl2, int n2, int n3, int n4) {
        block7: {
            block8: {
                boolean bl3;
                block6: {
                    boolean bl4 = anc2.a.equals(object);
                    bl3 = false;
                    if (!bl4) {
                        return false;
                    }
                    if (!bl2) break block6;
                    bl2 = bl3;
                    if (anc2.b != n2) break block7;
                    if (anc2.c != n3) {
                        return false;
                    }
                    break block8;
                }
                bl2 = bl3;
                if (anc2.b != -1) break block7;
                bl2 = bl3;
                if (anc2.e != n4) break block7;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final aew a(anc anc2) {
        return (aew)this.f.get(anc2);
    }

    public final void c(aew aew2) {
        gzy gzy2 = new gzy();
        if (this.b.isEmpty()) {
            this.d(gzy2, this.d, aew2);
            if (!a.k(this.e, this.d)) {
                this.d(gzy2, this.e, aew2);
            }
            if (!a.k(this.c, this.d) && !a.k(this.c, this.e)) {
                this.d(gzy2, this.c, aew2);
            }
        } else {
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                this.d(gzy2, (anc)this.b.get(i2), aew2);
            }
            if (!this.b.contains(this.c)) {
                this.d(gzy2, this.c, aew2);
            }
        }
        this.f = gzy2.b();
    }
}

