/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class kjm
implements kib {
    public static final List a = khb.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = khb.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final khr c;
    private final kid d;
    private final kjl e;
    private volatile kjs f;
    private final kgq g;
    private volatile boolean h;

    public kjm(kgp object, khr khr2, kid kid2, kjl kjl2) {
        this.c = khr2;
        this.d = kid2;
        this.e = kjl2;
        object = object.r.contains((Object)kgq.e) ? kgq.e : kgq.d;
        this.g = object;
    }

    @Override
    public final long a(kgv kgv2) {
        if (!kic.b(kgv2)) {
            return 0L;
        }
        return khb.i(kgv2);
    }

    @Override
    public final kgu b(boolean bl2) {
        Object object = this.f;
        if (object != null) {
            Object object2;
            kgq kgq2 = this.g;
            kgk kgk2 = ((kjs)object).a();
            jse.e(kgk2, "headerBlock");
            jse.e((Object)kgq2, "protocol");
            bzo bzo2 = new bzo(null, null, null);
            int n2 = kgk2.a();
            object = null;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string = kgk2.c(i2);
                String string2 = kgk2.d(i2);
                if (jse.i(string, ":status")) {
                    object2 = kmp.G("HTTP/1.1 ".concat(String.valueOf(string2)));
                } else {
                    object2 = object;
                    if (!b.contains(string)) {
                        bzo2.ax(string, string2);
                        object2 = object;
                    }
                }
                object = object2;
            }
            if (object != null) {
                object2 = new kgu();
                ((kgu)object2).e(kgq2);
                ((kgu)object2).a = ((kig)object).b;
                ((kgu)object2).d(((kig)object).c);
                ((kgu)object2).c(bzo2.aw());
                if (bl2 && ((kgu)object2).a == 100) {
                    return null;
                }
                return object2;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override
    public final khr c() {
        return this.c;
    }

    @Override
    public final kmi d(kgs object, long l2) {
        jse.e(object, "request");
        object = this.f;
        jse.b(object);
        return ((kjs)object).c();
    }

    @Override
    public final kmk e(kgv object) {
        object = this.f;
        jse.b(object);
        return ((kjs)object).g;
    }

    @Override
    public final void f() {
        this.h = true;
        kjs kjs2 = this.f;
        if (kjs2 != null) {
            kjs2.h(kiq.i);
        }
    }

    @Override
    public final void g() {
        kjs kjs2 = this.f;
        jse.b(kjs2);
        kjs2.c().close();
    }

    @Override
    public final void h() {
        this.e.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void i(kgs object) {
        boolean bl2;
        int n2;
        Object object2;
        Object object3;
        boolean bl3;
        Object object4;
        block19: {
            block18: {
                jse.e(object, "request");
                if (this.f != null) return;
                object4 = ((kgs)object).d;
                boolean bl4 = false;
                bl3 = object4 != null;
                jse.e(object, "request");
                object3 = ((kgs)object).c;
                object4 = new ArrayList(((kgk)object3).a() + 4);
                object2 = ((kgs)object).b;
                ((ArrayList)object4).add(new kir(kir.c, (String)object2));
                object2 = ((kgs)object).a;
                ((ArrayList)object4).add(new kir(kir.d, kmp.H((kgm)object2)));
                object2 = ((kgs)object).a("Host");
                if (object2 != null) {
                    ((ArrayList)object4).add(new kir(kir.f, (String)object2));
                }
                object = ((kgs)object).a.b;
                ((ArrayList)object4).add(new kir(kir.e, (String)object));
                int n3 = ((kgk)object3).a();
                for (n2 = 0; n2 < n3; ++n2) {
                    object2 = ((kgk)object3).c(n2);
                    object = Locale.US;
                    jse.d(object, "US");
                    object = ((String)object2).toLowerCase((Locale)object);
                    jse.d(object, "toLowerCase(...)");
                    if (a.contains(object) && (!jse.i(object, "te") || !jse.i(((kgk)object3).d(n2), "trailers"))) continue;
                    ((ArrayList)object4).add(new kir((String)object, ((kgk)object3).d(n2)));
                }
                object3 = this.e;
                bl2 = bl3 ^ true;
                object = ((kjl)object3).u;
                // MONITORENTER : object
                // MONITORENTER : object3
                if (((kjl)object3).f > 0x3FFFFFFF) {
                    ((kjl)object3).f(kiq.h);
                }
                if (((kjl)object3).g) {
                    object4 = new kip();
                    throw object4;
                }
                n2 = ((kjl)object3).f;
                ((kjl)object3).f = n2 + 2;
                object2 = new kjs(n2, (kjl)object3, bl2, false, null);
                if (!bl3 || ((kjl)object3).s >= ((kjl)object3).t) break block18;
                bl3 = bl4;
                if (((kjs)object2).e < ((kjs)object2).f) break block19;
            }
            bl3 = true;
        }
        if (((kjs)object2).m()) {
            ((kjl)object3).c.put(n2, object2);
        }
        // MONITOREXIT : object3
        ((kjl)object3).u.f(bl2, n2, (List)object4);
        // MONITOREXIT : object
        if (bl3) {
            ((kjl)object3).u.d();
        }
        this.f = object2;
        if (!this.h) {
            object = this.f;
            jse.b(object);
            ((kjs)object).i.n(this.d.d, TimeUnit.MILLISECONDS);
            object = this.f;
            jse.b(object);
            ((kjs)object).j.n(this.d.e, TimeUnit.MILLISECONDS);
            return;
        }
        object = this.f;
        jse.b(object);
        ((kjs)object).h(kiq.i);
        throw new IOException("Canceled");
    }
}

