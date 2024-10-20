/*
 * Decompiled with CFR 0.152.
 */
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class jll
extends jlp {
    private final int d;
    private final bmu e;
    private final bmu f;
    private final bmu g;
    private final bmu h;

    public jll(bmu bmu2, bmu bmu3, bmu bmu4, bmu bmu5, Provider provider, int n2) {
        super(provider);
        this.e = bmu2;
        this.f = bmu3;
        this.g = bmu4;
        this.h = bmu5;
        this.d = n2;
    }

    @Override
    public final String a(SSLSocket object) {
        if (this.g.L(object) && (object = (Object)((byte[])this.g.K(object, new Object[0]))) != null) {
            return new String((byte[])object, jls.b);
        }
        return null;
    }

    @Override
    public final void b(SSLSocket sSLSocket, String object, List list) {
        if (object != null) {
            this.e.M(sSLSocket, true);
            this.f.M(sSLSocket, object);
        }
        if (this.h.L(sSLSocket)) {
            object = jll.e(list);
            this.h.K(sSLSocket, object);
        }
    }

    @Override
    public final int c() {
        return this.d;
    }
}

