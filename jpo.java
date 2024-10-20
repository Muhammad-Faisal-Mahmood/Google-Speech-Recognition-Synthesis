/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jpo
extends jpn
implements Iterator,
jsm {
    private final int d;

    public jpo(jpp jpp2, int n2) {
        this.d = n2;
        super(jpp2);
    }

    public jpo(jpp jpp2, int n2, byte[] byArray) {
        this.d = n2;
        super(jpp2);
    }

    public final Object next() {
        if (this.d != 0) {
            this.a();
            int n2 = this.b;
            Object object = this.a;
            if (n2 < ((jpp)object).e) {
                this.b = n2 + 1;
                this.c = n2;
                object = ((jpp)object).b[n2];
                this.b();
                return object;
            }
            throw new NoSuchElementException();
        }
        this.a();
        int n3 = this.b;
        Object object = this.a;
        if (n3 < object.e) {
            this.b = n3 + 1;
            this.c = n3;
            object = object.c;
            jse.b(object);
            object = object[this.c];
            this.b();
            return object;
        }
        throw new NoSuchElementException();
    }
}

