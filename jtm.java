/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jtm
extends jtn
implements Iterator,
jqb,
jsm {
    public jqb a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int n2 = this.b;
        RuntimeException runtimeException = n2 != 4 ? (n2 != 5 ? new IllegalStateException(a.af(n2, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.")) : new NoSuchElementException();
        return runtimeException;
    }

    @Override
    public final Object a(Object object, jqb jqb2) {
        this.c = object;
        this.b = 3;
        this.a = jqb2;
        object = jqh.a;
        jsd.j(jqb2);
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final Object b(Iterator object, jqb jqb2) {
        if (object.hasNext()) {
            this.d = object;
            this.b = 2;
            this.a = jqb2;
            object = jqh.a;
            jsd.j(jqb2);
            if (object == jqh.a) {
                return object;
            }
        }
        return jon.a;
    }

    @Override
    public final void bD(Object object) {
        jns.ak(object);
        this.b = 4;
    }

    @Override
    public final jqf d() {
        return jqg.a;
    }

    @Override
    public final boolean hasNext() {
        while (true) {
            Object object;
            int n2;
            if ((n2 = this.b) != 0) {
                if (n2 != 1) {
                    if (n2 != 2 && n2 != 3) {
                        if (n2 == 4) {
                            return false;
                        }
                        throw this.c();
                    }
                    return true;
                }
                object = this.d;
                jse.b(object);
                if (object.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            object = this.a;
            jse.b(object);
            this.a = null;
            object.bD(jon.a);
        }
    }

    public final Object next() {
        int n2 = this.b;
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    this.b = 0;
                    Object object = this.c;
                    this.c = null;
                    return object;
                }
                throw this.c();
            }
            this.b = 1;
            Iterator iterator = this.d;
            jse.b(iterator);
            return iterator.next();
        }
        if (this.hasNext()) {
            return this.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        a.b();
    }
}

