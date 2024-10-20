/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

public final class kio
implements kib {
    public final kgp a;
    public final khr b;
    public final klo c;
    public final kln d;
    public int e;
    public final kih f;
    public kgk g;

    public kio(kgp kgp2, khr khr2, klo klo2, kln kln2) {
        jse.e(klo2, "source");
        jse.e(kln2, "sink");
        this.a = kgp2;
        this.b = khr2;
        this.c = klo2;
        this.d = kln2;
        this.f = new kih(klo2);
    }

    public static final void l(kls kls2) {
        kmm kmm2 = kls2.a;
        kls2.a = kmm.j;
        kmm2.k();
        kmm2.l();
    }

    private static final boolean m(kgv kgv2) {
        return jse.H("chunked", kgv.a(kgv2, "Transfer-Encoding"));
    }

    @Override
    public final long a(kgv kgv2) {
        block4: {
            long l2;
            block3: {
                block2: {
                    if (kic.b(kgv2)) break block2;
                    l2 = 0L;
                    break block3;
                }
                if (!kio.m(kgv2)) break block4;
                l2 = -1L;
            }
            return l2;
        }
        return khb.i(kgv2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final kgu b(boolean bl2) {
        int n2 = this.e;
        if (n2 != 1 && n2 != 2) {
            if (n2 != 3) throw new IllegalStateException(a.af(n2, "state: "));
        }
        try {
            kig kig2 = kmp.G(this.f.a());
            kgu kgu2 = new kgu();
            kgu2.e(kig2.a);
            kgu2.a = kig2.b;
            kgu2.d(kig2.c);
            kgu2.c(this.f.b());
            if (bl2 && kig2.b == 100) {
                return null;
            }
            n2 = kig2.b;
            if (n2 == 100 || n2 >= 102 && n2 < 200) {
                this.e = 3;
                return kgu2;
            }
            this.e = 4;
            return kgu2;
        }
        catch (EOFException eOFException) {
            throw new IOException("unexpected end of stream on ".concat(this.b.a.a.i.e()), eOFException);
        }
    }

    @Override
    public final khr c() {
        return this.b;
    }

    @Override
    public final kmi d(kgs object, long l2) {
        block5: {
            int n2;
            block6: {
                block4: {
                    block2: {
                        int n3;
                        block3: {
                            jse.e(object, "request");
                            kgt kgt2 = ((kgs)object).d;
                            if (!jse.H("chunked", ((kgs)object).a("Transfer-Encoding"))) break block2;
                            n3 = this.e;
                            if (n3 != 1) break block3;
                            this.e = 2;
                            object = new kij(this);
                            break block4;
                        }
                        throw new IllegalStateException(a.af(n3, "state: "));
                    }
                    if (l2 == -1L) break block5;
                    n2 = this.e;
                    if (n2 != 1) break block6;
                    this.e = 2;
                    object = new kim(this);
                }
                return object;
            }
            throw new IllegalStateException(a.af(n2, "state: "));
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override
    public final kmk e(kgv object) {
        int n2;
        block7: {
            block3: {
                block6: {
                    block4: {
                        int n3;
                        block5: {
                            block2: {
                                if (kic.b((kgv)object)) break block2;
                                object = this.j(0L);
                                break block3;
                            }
                            if (!kio.m((kgv)object)) break block4;
                            object = ((kgv)object).a;
                            n3 = this.e;
                            if (n3 != 4) break block5;
                            object = ((kgs)object).a;
                            this.e = 5;
                            object = new kik(this, (kgm)object);
                            break block3;
                        }
                        throw new IllegalStateException(a.af(n3, "state: "));
                    }
                    long l2 = khb.i((kgv)object);
                    if (l2 == -1L) break block6;
                    object = this.j(l2);
                    break block3;
                }
                n2 = this.e;
                if (n2 != 4) break block7;
                this.e = 5;
                this.b.e();
                object = new kin(this);
            }
            return object;
        }
        throw new IllegalStateException(a.af(n2, "state: "));
    }

    @Override
    public final void f() {
        this.b.b();
    }

    @Override
    public final void g() {
        this.d.flush();
    }

    @Override
    public final void h() {
        this.d.flush();
    }

    @Override
    public final void i(kgs kgs2) {
        jse.e(kgs2, "request");
        Proxy.Type type = this.b.a.b.type();
        jse.d((Object)type, "type(...)");
        jse.e(kgs2, "request");
        jse.e((Object)type, "proxyType");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(kgs2.b);
        charSequence.append(' ');
        if (!kgs2.a.f && type == Proxy.Type.HTTP) {
            charSequence.append(kgs2.a);
        } else {
            charSequence.append(kmp.H(kgs2.a));
        }
        charSequence.append(" HTTP/1.1");
        charSequence = charSequence.toString();
        this.k(kgs2.c, (String)charSequence);
    }

    public final kmk j(long l2) {
        int n2 = this.e;
        if (n2 == 4) {
            this.e = 5;
            return new kil(this, l2);
        }
        throw new IllegalStateException(a.af(n2, "state: "));
    }

    public final void k(kgk kgk2, String object) {
        int n2 = this.e;
        if (n2 == 0) {
            kln kln2 = this.d;
            kln2.Q((String)object);
            kln2.Q("\r\n");
            int n3 = kgk2.a();
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.d;
                object.Q(kgk2.c(n2));
                object.Q(": ");
                object.Q(kgk2.d(n2));
                object.Q("\r\n");
            }
            this.d.Q("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException(a.af(n2, "state: "));
    }
}

