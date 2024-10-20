/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class hcl
implements Iterator {
    private final hch a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private hci f;

    public hcl(hch hch2, Iterator iterator) {
        this.a = hch2;
        this.b = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
        {
        }
    }

    public final Object next() {
        if (this.hasNext()) {
            int n2;
            int n3 = n2 = this.c;
            if (n2 == 0) {
                hci hci2;
                this.f = hci2 = (hci)this.b.next();
                this.d = n3 = hci2.a();
            }
            this.c = n3 - 1;
            this.e = true;
            return Objects.requireNonNull(this.f).a;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        fvd.ak(this.e);
        if (this.d == 1) {
            this.b.remove();
        } else {
            this.a.remove(Objects.requireNonNull(this.f).a);
        }
        --this.d;
        this.e = false;
    }
}

