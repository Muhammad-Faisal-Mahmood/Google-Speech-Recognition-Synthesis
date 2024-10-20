/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.List;

final class jer {
    public List a;
    public int b;
    public int c;

    public jer(List list) {
        this.a = list;
    }

    public final its a() {
        return ((iux)this.a.get((int)this.b)).c;
    }

    public final SocketAddress b() {
        return (SocketAddress)((iux)this.a.get((int)this.b)).b.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}

