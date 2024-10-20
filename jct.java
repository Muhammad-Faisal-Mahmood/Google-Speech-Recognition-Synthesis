/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public final class jct
extends jbh {
    private static final jcr b = new jcp(1);
    private static final jcr c = new jcp(0);
    private static final jcr d = new jcp(2);
    private static final jcr e = new jcp(3);
    private static final jcs f = new jcq();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public jct() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    public jct(int n2) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(n2);
    }

    private final int m(jcs jcs2, int n2, Object object, int n3) {
        this.a(n2);
        int n4 = n2;
        int n5 = n3;
        if (!this.g.isEmpty()) {
            this.p();
            n5 = n3;
            n4 = n2;
        }
        while (n4 > 0 && !this.g.isEmpty()) {
            jhg jhg2 = (jhg)this.g.peek();
            n2 = Math.min(n4, jhg2.f());
            n5 = jcs2.a(jhg2, n2, object, n5);
            n4 -= n2;
            this.a -= n2;
            this.p();
        }
        if (n4 <= 0) {
            return n5;
        }
        throw new AssertionError((Object)"Failed executing read operation");
    }

    private final int n(jcr jcr2, int n2, Object object, int n3) {
        try {
            n2 = this.m(jcr2, n2, object, n3);
            return n2;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((jhg)this.g.remove());
            jhg jhg2 = (jhg)this.g.peek();
            if (jhg2 != null) {
                jhg2.b();
            }
            return;
        }
        ((jhg)this.g.remove()).close();
    }

    private final void p() {
        if (((jhg)this.g.peek()).f() == 0) {
            this.o();
        }
    }

    @Override
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((jhg)this.h.remove()).close();
        }
        this.i = true;
        jhg jhg2 = (jhg)this.g.peek();
        if (jhg2 != null) {
            jhg2.b();
        }
    }

    @Override
    public final void c() {
        if (this.i) {
            jhg jhg2 = (jhg)this.g.peek();
            if (jhg2 != null) {
                int n2 = jhg2.f();
                jhg2.c();
                this.a += jhg2.f() - n2;
            }
            while ((jhg2 = (jhg)this.h.pollLast()) != null) {
                jhg2.c();
                this.g.addFirst(jhg2);
                this.a += jhg2.f();
            }
            return;
        }
        throw new InvalidMarkException();
    }

    @Override
    public final void close() {
        while (!this.g.isEmpty()) {
            ((jhg)this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((jhg)this.h.remove()).close();
            }
        }
    }

    @Override
    public final boolean d() {
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            if (((jhg)iterator.next()).d()) continue;
            return false;
        }
        return true;
    }

    @Override
    public final int e() {
        return this.n(b, 1, null, 0);
    }

    @Override
    public final int f() {
        return this.a;
    }

    @Override
    public final jhg g(int n2) {
        if (n2 <= 0) {
            return jhk.a;
        }
        this.a(n2);
        this.a -= n2;
        jhg jhg2 = null;
        jct jct2 = null;
        do {
            jhg jhg3;
            int n3;
            if ((n3 = (jhg3 = (jhg)this.g.peek()).f()) > n2) {
                jhg3 = jhg3.g(n2);
                n2 = 0;
            } else {
                if (this.i) {
                    jhg3 = jhg3.g(n3);
                    this.o();
                } else {
                    jhg3 = (jhg)this.g.poll();
                }
                n2 -= n3;
            }
            if (jhg2 == null) {
                jhg2 = jhg3;
                continue;
            }
            jhg jhg4 = jhg2;
            jct jct3 = jct2;
            if (jct2 == null) {
                n3 = 2;
                if (n2 != 0) {
                    n3 = Math.min(this.g.size() + 2, 16);
                }
                jct3 = new jct(n3);
                jct3.h(jhg2);
                jhg4 = jct3;
            }
            jct3.h(jhg3);
            jct2 = jct3;
            jhg2 = jhg4;
        } while (n2 > 0);
        return jhg2;
    }

    public final void h(jhg jhg2) {
        boolean bl2 = this.i && this.g.isEmpty();
        if (!(jhg2 instanceof jct)) {
            this.g.add(jhg2);
            this.a += jhg2.f();
        } else {
            jhg2 = (jct)jhg2;
            while (!((jct)jhg2).g.isEmpty()) {
                jhg jhg3 = (jhg)((jct)jhg2).g.remove();
                this.g.add(jhg3);
            }
            this.a += ((jct)jhg2).a;
            ((jct)jhg2).a = 0;
            ((jbh)jhg2).close();
        }
        if (bl2) {
            ((jhg)this.g.peek()).b();
        }
    }

    @Override
    public final void i(ByteBuffer byteBuffer) {
        this.n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override
    public final void j(OutputStream outputStream, int n2) {
        this.m(f, n2, outputStream, 0);
    }

    @Override
    public final void k(byte[] byArray, int n2, int n3) {
        this.n(d, n3, byArray, n2);
    }

    @Override
    public final void l(int n2) {
        this.n(c, n2, null, 0);
    }
}

