/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.chrono.n;
import j$.time.format.A;
import j$.time.format.B;
import j$.time.format.f;
import j$.time.format.j;
import j$.time.format.u;
import j$.time.format.x;
import j$.time.temporal.l;
import j$.time.temporal.p;

final class o
implements f {
    private final p a;
    private final B b;
    private final x c;
    private volatile j d;

    o(p p2, B b2, x x2) {
        this.a = p2;
        this.b = b2;
        this.c = x2;
    }

    @Override
    public final boolean g(u u2, StringBuilder stringBuilder) {
        Long l2 = u2.e(this.a);
        if (l2 == null) {
            return false;
        }
        Object object = (n)u2.d().F(l.e());
        object = object != null && object != j$.time.chrono.u.d ? this.c.d((n)object, this.a, l2, this.b, u2.c()) : this.c.e(this.a, l2, this.b, u2.c());
        if (object == null) {
            if (this.d == null) {
                this.d = new j(this.a, 1, 19, A.NORMAL);
            }
            return this.d.g(u2, stringBuilder);
        }
        stringBuilder.append((String)object);
        return true;
    }

    public final String toString() {
        Object object = B.FULL;
        Object object2 = this.a;
        Object object3 = this.b;
        if (object3 == object) {
            object3 = String.valueOf(object2);
            object2 = new StringBuilder("Text(");
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(")");
            return ((StringBuilder)object2).toString();
        }
        object2 = String.valueOf(object2);
        object = String.valueOf(object3);
        object3 = new StringBuilder("Text(");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(",");
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(")");
        return ((StringBuilder)object3).toString();
    }
}

