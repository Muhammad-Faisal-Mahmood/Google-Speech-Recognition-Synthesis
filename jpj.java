/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class jpj
implements ListIterator,
jsm {
    private int a;
    private int b;
    private int c;
    private final int d;
    private final jov e;

    public jpj(jpi jpi2, int n2, int n3) {
        this.d = n3;
        this.e = jpi2;
        this.a = n2;
        this.b = -1;
        jpi jpi3 = jpi2;
        this.c = jpi.c(jpi2);
    }

    public jpj(jpk jpk2, int n2, int n3) {
        this.d = n3;
        this.e = jpk2;
        this.a = n2;
        this.b = -1;
        jpk jpk3 = jpk2;
        this.c = jpk.c(jpk2);
    }

    private final void a() {
        if (jpk.c((jpk)this.e) == this.c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void b() {
        if (jpk.c(((jpi)this.e).d) == this.c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void add(Object object) {
        if (this.d != 0) {
            this.b();
            int n2 = this.a;
            this.a = n2 + 1;
            ((jpi)this.e).add(n2, object);
            this.b = -1;
            this.c = jpi.c((jpi)this.e);
            return;
        }
        this.a();
        int n3 = this.a;
        this.a = n3 + 1;
        ((jpk)this.e).add(n3, object);
        this.b = -1;
        this.c = jpk.c((jpk)this.e);
    }

    @Override
    public final boolean hasNext() {
        if (this.d != 0) {
            jov jov2 = this.e;
            return this.a < ((jpi)jov2).c;
        }
        jov jov3 = this.e;
        return this.a < ((jpk)jov3).c;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.d != 0) {
            return this.a > 0;
        }
        return this.a > 0;
    }

    @Override
    public final Object next() {
        if (this.d != 0) {
            this.b();
            jov jov2 = this.e;
            int n2 = this.a;
            jov2 = (jpi)jov2;
            if (n2 < ((jpi)jov2).c) {
                this.a = n2 + 1;
                this.b = n2;
                return ((jpi)jov2).a[((jpi)jov2).b + n2];
            }
            throw new NoSuchElementException();
        }
        this.a();
        jov jov3 = this.e;
        int n3 = this.a;
        jov3 = (jpk)jov3;
        if (n3 < ((jpk)jov3).c) {
            this.a = n3 + 1;
            this.b = n3;
            return ((jpk)jov3).b[n3];
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        if (this.d != 0) {
            return this.a;
        }
        return this.a;
    }

    public final Object previous() {
        if (this.d != 0) {
            this.b();
            int n2 = this.a;
            if (n2 > 0) {
                int n3;
                this.a = n3 = n2 - 1;
                this.b = n3;
                jpi jpi2 = (jpi)this.e;
                n2 = jpi2.b;
                return jpi2.a[n2 + n3];
            }
            throw new NoSuchElementException();
        }
        this.a();
        int n4 = this.a;
        if (n4 > 0) {
            this.a = --n4;
            this.b = n4;
            return ((jpk)this.e).b[n4];
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        int n2 = this.d;
        return this.a - 1;
    }

    @Override
    public final void remove() {
        if (this.d != 0) {
            this.b();
            int n2 = this.b;
            if (n2 != -1) {
                this.e.b(n2);
                this.a = this.b;
                this.b = -1;
                this.c = jpi.c((jpi)this.e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.a();
        int n3 = this.b;
        if (n3 != -1) {
            this.e.b(n3);
            this.a = this.b;
            this.b = -1;
            this.c = jpk.c((jpk)this.e);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }

    public final void set(Object object) {
        if (this.d != 0) {
            this.b();
            int n2 = this.b;
            if (n2 != -1) {
                ((jpi)this.e).set(n2, object);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a();
        int n3 = this.b;
        if (n3 != -1) {
            ((jpk)this.e).set(n3, object);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
    }
}

