/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$_CC;
import j$.util.stream.G0;
import j$.util.stream.a_0;
import j$.util.stream.f_0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

class J0
extends f_0
implements Consumer,
Iterable {
    protected Object[] d = new Object[16];
    protected Object[][] e;

    J0() {
    }

    public void accept(Object object) {
        int n2 = this.a;
        Object[] objectArray = this.d;
        if (n2 == objectArray.length) {
            int n3;
            Object[][] objectArrayArray;
            if (this.e == null) {
                objectArrayArray = new Object[8][];
                this.e = objectArrayArray;
                this.c = new long[8];
                objectArrayArray[0] = objectArray;
            }
            if ((n3 = (n2 = this.b) + 1) >= (objectArrayArray = this.e).length || objectArrayArray[n3] == null) {
                long l2;
                if (n2 == 0) {
                    l2 = objectArray.length;
                } else {
                    l2 = this.c[n2];
                    l2 = (long)objectArrayArray[n2].length + l2;
                }
                this.m(l2 + 1L);
            }
            this.a = 0;
            this.b = n2 = this.b + 1;
            this.d = this.e[n2];
        }
        objectArray = this.d;
        n2 = this.a;
        this.a = n2 + 1;
        objectArray[n2] = object;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final void clear() {
        Object[][] objectArray = this.e;
        if (objectArray != null) {
            this.d = objectArray[0];
            for (int i2 = 0; i2 < (objectArray = this.d).length; ++i2) {
                objectArray[i2] = null;
            }
            this.e = null;
            this.c = null;
        } else {
            for (int i3 = 0; i3 < this.a; ++i3) {
                this.d[i3] = null;
            }
        }
        this.a = 0;
        this.b = 0;
    }

    public void forEach(Consumer consumer) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            if (n4 >= this.b) break;
            Object[] objectArray = this.e[n4];
            int n5 = objectArray.length;
            for (n2 = 0; n2 < n5; ++n2) {
                consumer.accept(objectArray[n2]);
            }
            ++n4;
        }
        for (n2 = n3; n2 < this.a; ++n2) {
            consumer.accept(this.d[n2]);
        }
    }

    public final Iterator iterator() {
        return Spliterators.e(this.spliterator());
    }

    protected final void m(long l2) {
        int n2 = this.b;
        long l3 = n2 == 0 ? (long)this.d.length : this.c[n2] + (long)this.e[n2].length;
        if (l2 > l3) {
            Object[][] objectArrayArray;
            if (this.e == null) {
                objectArrayArray = new Object[8][];
                this.e = objectArrayArray;
                this.c = new long[8];
                objectArrayArray[0] = this.d;
            }
            ++n2;
            while (l2 > l3) {
                int n3;
                objectArrayArray = this.e;
                if (n2 >= objectArrayArray.length) {
                    n3 = objectArrayArray.length * 2;
                    this.e = (Object[][])Arrays.copyOf(objectArrayArray, n3);
                    this.c = Arrays.copyOf(this.c, n3);
                }
                n3 = n2 != 0 && n2 != 1 ? Math.min(n2 + 3, 30) : 4;
                n3 = 1 << n3;
                objectArrayArray = this.e;
                objectArrayArray[n2] = new Object[n3];
                long[] lArray = this.c;
                int n4 = n2 - 1;
                lArray[n2] = lArray[n4] + (long)objectArrayArray[n4].length;
                l3 += (long)n3;
                ++n2;
            }
        }
    }

    public Spliterator spliterator() {
        return new G0(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        Object object = new ArrayList();
        Objects.requireNonNull(object);
        this.forEach((Consumer)new a_0(8, object));
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("SpinedBuffer:");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

