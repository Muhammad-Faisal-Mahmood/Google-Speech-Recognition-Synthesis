/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.C0;
import java.util.Arrays;

final class F0
extends C0 {
    private Object[] d;
    private int e;

    public final void accept(Object object) {
        Object[] objectArray = this.d;
        int n2 = this.e;
        this.e = n2 + 1;
        objectArray[n2] = object;
    }

    @Override
    public final void c() {
        int n2;
        Object object = this.d;
        int n3 = this.e;
        int n4 = 0;
        Arrays.sort(object, 0, n3, this.b);
        long l2 = this.e;
        object = this.a;
        object.e(l2);
        if (!this.c) {
            for (n2 = n4; n2 < this.e; ++n2) {
                object.accept(this.d[n2]);
            }
        } else {
            for (n2 = 0; n2 < this.e && !object.j(); ++n2) {
                object.accept(this.d[n2]);
            }
        }
        object.c();
        this.d = null;
    }

    @Override
    public final void e(long l2) {
        if (l2 < 0x7FFFFFF7L) {
            this.d = new Object[(int)l2];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}

