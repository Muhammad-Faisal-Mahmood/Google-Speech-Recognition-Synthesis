/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;

public class jpn {
    public final jpp a;
    public int b;
    public int c;
    private int d;

    public jpn(jpp jpp2) {
        this.a = jpp2;
        this.c = -1;
        this.d = jpp2.f;
        this.b();
    }

    public final void a() {
        if (this.a.f == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void b() {
        while (true) {
            int n2 = this.b;
            jpp jpp2 = this.a;
            if (n2 >= jpp2.e || jpp2.d[n2] >= 0) break;
            this.b = n2 + 1;
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        this.a();
        if (this.c != -1) {
            this.a.f();
            this.a.g(this.c);
            this.c = -1;
            this.d = this.a.f;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}

