/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public abstract class hap
extends haq
implements Collection,
hch {
    private static final long serialVersionUID = 912559L;
    private transient gzx a;
    private transient hav b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        hdx hdx2 = this.o().k();
        while (hdx2.hasNext()) {
            hci hci2 = (hci)hdx2.next();
            Arrays.fill(objectArray, n2, hci2.a() + n2, hci2.a);
            n2 += hci2.a();
        }
        return n2;
    }

    @Override
    @Deprecated
    public final int c(Object object, int n2) {
        throw null;
    }

    @Override
    public final boolean contains(Object object) {
        return this.a(object) > 0;
    }

    @Override
    public final boolean equals(Object object) {
        return fvd.o(this, object);
    }

    @Override
    public final gzx f() {
        gzx gzx2;
        gzx gzx3 = gzx2 = this.a;
        if (gzx2 == null) {
            if (this.isEmpty()) {
                int n2 = gzx.d;
                gzx3 = hct.a;
            } else {
                gzx3 = gzx.h(this.toArray());
            }
            this.a = gzx3;
        }
        return gzx3;
    }

    @Override
    @Deprecated
    public final boolean g(Object object, int n2) {
        throw null;
    }

    @Override
    @Deprecated
    public final void h(Object object, int n2) {
        throw null;
    }

    @Override
    public final int hashCode() {
        return hhk.n(this.o());
    }

    @Override
    public final hdx k() {
        return new hal(this.o().k());
    }

    public abstract hav n();

    public final hav o() {
        hav hav2;
        hav hav3 = hav2 = this.b;
        if (hav2 == null) {
            hav3 = this.isEmpty() ? hdc.a : new han(this);
            this.b = hav3;
        }
        return hav3;
    }

    public abstract hci p(int var1);

    @Override
    public final String toString() {
        return this.o().toString();
    }

    @Override
    public abstract Object writeReplace();
}

