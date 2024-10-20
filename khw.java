/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public final class khw {
    public final kfs a;
    public List b;
    public int c;
    public List d;
    public final List e;
    public final bzo f;

    public khw(kfs list, bzo object) {
        this.a = list;
        this.f = object;
        this.b = object = jpa.a;
        this.d = object;
        this.e = new ArrayList();
        kgm kgm2 = ((kfs)((Object)list)).i;
        object = ((kfs)((Object)list)).g;
        list = object != null ? jns.d(object) : (((URI)(object = kgm2.f())).getHost() == null ? khb.n(Proxy.NO_PROXY) : ((list = ((kfs)((Object)list)).h.select((URI)object)) != null && !list.isEmpty() ? khb.o(list) : khb.n(Proxy.NO_PROXY)));
        this.b = list;
        this.c = 0;
        jse.e(list, "proxies");
    }

    public final boolean a() {
        return this.b() || !this.e.isEmpty();
        {
        }
    }

    public final boolean b() {
        return this.c < this.b.size();
    }
}

