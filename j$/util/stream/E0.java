/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.stream.B0;
import j$.util.stream.C0;
import j$.util.stream.a_0;
import j$.util.z;
import java.util.ArrayList;

final class E0
extends C0 {
    private ArrayList d;

    public final void accept(Object object) {
        this.d.add(object);
    }

    @Override
    public final void c() {
        z.p(this.d, this.b);
        long l2 = this.d.size();
        B0 b0 = this.a;
        b0.e(l2);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(b0);
            Collection$_EL.forEach(arrayList, new a_0(4, b0));
        } else {
            for (Object e2 : this.d) {
                if (b0.j()) break;
                b0.accept(e2);
            }
        }
        b0.c();
        this.d = null;
    }

    @Override
    public final void e(long l2) {
        if (l2 < 0x7FFFFFF7L) {
            ArrayList arrayList = l2 >= 0L ? new ArrayList((int)l2) : new ArrayList();
            this.d = arrayList;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}

