/*
 * Decompiled with CFR 0.152.
 */
final class arw
implements arv {
    private final apq a;
    private final aqe b;
    private final ary c;
    private final adu d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public arw(apq object, aqe aqe2, ary ary2, String string, int n2) {
        this.a = object;
        this.b = aqe2;
        this.c = ary2;
        int n3 = ary2.b;
        int n4 = ary2.e;
        int n5 = ary2.d;
        n4 = n3 * n4 / 8;
        if (n5 == n4) {
            n3 = ary2.c * n4;
            n5 = n3 * 8;
            this.e = n4 = Math.max(n4, n3 / 10);
            object = new adt();
            ((adt)object).a(string);
            ((adt)object).h = n5;
            ((adt)object).i = n5;
            ((adt)object).n = n4;
            ((adt)object).B = ary2.b;
            ((adt)object).C = ary2.c;
            ((adt)object).D = n2;
            this.d = new adu((adt)object);
            return;
        }
        throw new aem(a.an(n5, n4, "Expected block size: ", "; got: "), null, true, 1);
    }

    @Override
    public final void a(int n2, long l2) {
        long l3 = n2;
        arz arz2 = new arz(this.c, 1, l3, l2);
        this.a.v(arz2);
        this.b.h(this.d);
    }

    @Override
    public final void b(long l2) {
        this.f = l2;
        this.g = 0;
        this.h = 0L;
    }

    @Override
    public final boolean c(app object, long l2) {
        int n2;
        int n3;
        long l3;
        long l4;
        while ((l4 = (l3 = l2 - 0L) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0 && (n3 = this.g) < (n2 = this.e)) {
            l4 = (int)Math.min((long)(n2 - n3), l2);
            if ((l4 = (long)this.b.d((adn)object, (int)l4, true)) == -1) {
                l2 = 0L;
                continue;
            }
            this.g += l4;
            l2 -= (long)l4;
        }
        object = this.c;
        n3 = this.g;
        n2 = ((ary)object).d;
        if ((n3 /= n2) > 0) {
            long l5 = this.f;
            l2 = agf.j(this.h, 1000000L, ((ary)object).c);
            n2 = n3 * n2;
            int n4 = this.g - n2;
            this.b.m(l5 + l2, 1, n2, n4, null);
            this.h += (long)n3;
            this.g = n4;
        }
        return l4 <= 0;
    }
}

