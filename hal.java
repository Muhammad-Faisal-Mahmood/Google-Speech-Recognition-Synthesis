/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Iterator;

final class hal
extends hdx {
    int a;
    Object b;
    final Iterator c;

    public hal(Iterator iterator) {
        this.c = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
        {
        }
    }

    public final Object next() {
        int n2;
        int n3 = n2 = this.a;
        if (n2 <= 0) {
            hci hci2 = (hci)this.c.next();
            this.b = hci2.a;
            n3 = hci2.a();
        }
        this.a = n3 - 1;
        return Objects.requireNonNull(this.b);
    }
}

