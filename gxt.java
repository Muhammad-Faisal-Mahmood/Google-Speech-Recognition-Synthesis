/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

abstract class gxt
extends gxx
implements Serializable {
    private static final long serialVersionUID = 0L;
    transient hcn a = this.f();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        this.a = this.f();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.j().size());
        for (hci hci2 : this.j()) {
            objectOutputStream.writeObject(hci2.a);
            objectOutputStream.writeInt(hci2.a());
        }
    }

    @Override
    public final int a(Object object) {
        return this.a.b(object);
    }

    @Override
    public final int b() {
        return this.a.c;
    }

    @Override
    public final int c(Object object, int n2) {
        fxf.t(true, "occurrences cannot be negative: %s", n2);
        int n3 = this.a.d(object);
        if (n3 == -1) {
            return 0;
        }
        int n4 = this.a.c(n3);
        if (n4 > n2) {
            this.a.m(n3, n4 - n2);
        } else {
            this.a.g(n3);
            n2 = n4;
        }
        this.b -= (long)n2;
        return n4;
    }

    @Override
    public final void clear() {
        hcn hcn2 = this.a;
        ++hcn2.d;
        Arrays.fill(hcn2.a, 0, hcn2.c, null);
        Arrays.fill(hcn2.b, 0, hcn2.c, 0);
        Arrays.fill(hcn2.e, -1);
        Arrays.fill(hcn2.f, -1L);
        hcn2.c = 0;
        this.b = 0L;
    }

    @Override
    public final Iterator d() {
        return new gxq(this);
    }

    @Override
    public final Iterator e() {
        return new gxr(this);
    }

    public abstract hcn f();

    @Override
    public final boolean g(Object object, int n2) {
        fvd.al(n2, "oldCount");
        fvd.al(0, "newCount");
        int n3 = this.a.d(object);
        if (n3 == -1) {
            return n2 == 0;
        }
        if (this.a.c(n3) != n2) {
            return false;
        }
        this.a.g(n3);
        this.b -= (long)n2;
        return true;
    }

    @Override
    public final void h(Object object, int n2) {
        if (n2 == 0) {
            this.a(object);
            return;
        }
        boolean bl2 = true;
        boolean bl3 = n2 > 0;
        fxf.t(bl3, "occurrences cannot be negative: %s", n2);
        int n3 = this.a.d(object);
        long l2 = n2;
        if (n3 == -1) {
            this.a.o(object, n2);
            this.b += l2;
            return;
        }
        long l3 = (long)this.a.c(n3) + l2;
        bl3 = l3 <= Integer.MAX_VALUE ? bl2 : false;
        fxf.u(bl3, "too many occurrences: %s", l3);
        this.a.m(n3, (int)l3);
        this.b += l2;
    }

    @Override
    public final Iterator iterator() {
        return new hcl(this, this.j().iterator());
    }

    @Override
    public final int size() {
        return hhk.ag(this.b);
    }
}

