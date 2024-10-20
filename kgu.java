/*
 * Decompiled with CFR 0.152.
 */
public final class kgu {
    public int a = -1;
    public kgj b;
    public kgx c;
    public kgv d;
    public kgv e;
    public kgv f;
    public long g;
    public long h;
    public kmb i;
    public bzo j;
    private kgs k;
    private kgq l;
    private String m;

    public kgu() {
        this.j = new bzo(null, null, null);
    }

    public kgu(kgv kgv2) {
        this.k = kgv2.a;
        this.l = kgv2.b;
        this.a = kgv2.d;
        this.m = kgv2.c;
        this.b = kgv2.e;
        this.j = kgv2.f.e();
        this.c = kgv2.g;
        this.d = kgv2.h;
        this.e = kgv2.i;
        this.f = kgv2.j;
        this.g = kgv2.k;
        this.h = kgv2.l;
        this.i = kgv2.m;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void b(String string, kgv kgv2) {
        if (kgv2 == null) return;
        if (kgv2.g != null) throw new IllegalArgumentException(string.concat(".body != null"));
        if (kgv2.h != null) throw new IllegalArgumentException(string.concat(".networkResponse != null"));
        if (kgv2.i != null) throw new IllegalArgumentException(string.concat(".cacheResponse != null"));
        if (kgv2.j == null) return;
        throw new IllegalArgumentException(string.concat(".priorResponse != null"));
    }

    public final kgv a() {
        int n2 = this.a;
        if (n2 >= 0) {
            kgs kgs2 = this.k;
            if (kgs2 != null) {
                kgq kgq2 = this.l;
                if (kgq2 != null) {
                    String string = this.m;
                    if (string != null) {
                        return new kgv(kgs2, kgq2, string, n2, this.b, this.j.aw(), this.c, this.d, this.e, this.f, this.g, this.h, this.i);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(a.af(n2, "code < 0: "));
    }

    public final void c(kgk kgk2) {
        this.j = kgk2.e();
    }

    public final void d(String string) {
        jse.e(string, "message");
        this.m = string;
    }

    public final void e(kgq kgq2) {
        jse.e((Object)kgq2, "protocol");
        this.l = kgq2;
    }

    public final void f(kgs kgs2) {
        jse.e(kgs2, "request");
        this.k = kgs2;
    }
}

