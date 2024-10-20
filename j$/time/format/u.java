/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.b_0;
import j$.time.chrono.n;
import j$.time.format.DateTimeFormatter;
import j$.time.format.t;
import j$.time.format.y;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.util.Objects;
import java.util.Locale;

final class u {
    private m a;
    private DateTimeFormatter b;
    private int c;

    u(m object, DateTimeFormatter object2) {
        block6: {
            Object object3;
            Object object4;
            ZoneId zoneId;
            block7: {
                b_0 b_02;
                a[] aArray;
                Object object5;
                block9: {
                    block8: {
                        object5 = ((DateTimeFormatter)object2).b();
                        if (object5 == null) break block6;
                        aArray = (a[])object.F(l.e());
                        zoneId = (ZoneId)object.F(l.k());
                        boolean bl2 = Objects.equals(object5, aArray);
                        b_02 = null;
                        if (bl2) {
                            object5 = null;
                        }
                        Objects.equals(null, zoneId);
                        if (object5 == null) break block6;
                        object4 = object5 != null ? object5 : aArray;
                        object3 = b_02;
                        if (object5 == null) break block7;
                        if (!object.e(j$.time.temporal.a.EPOCH_DAY)) break block8;
                        object3 = object4.r((m)object);
                        break block7;
                    }
                    if (object5 != j$.time.chrono.u.d) break block9;
                    object3 = b_02;
                    if (aArray == null) break block7;
                }
                aArray = j$.time.temporal.a.values();
                int n2 = aArray.length;
                int n3 = 0;
                while (true) {
                    object3 = b_02;
                    if (n3 >= n2) break;
                    object3 = aArray[n3];
                    if (((a)object3).B() && object.e((p)object3)) {
                        object2 = String.valueOf(object5);
                        object5 = String.valueOf(object);
                        object = new StringBuilder("Unable to apply override chronology '");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("' because the temporal object being formatted contains date fields but does not represent a whole date: ");
                        ((StringBuilder)object).append((String)object5);
                        throw new RuntimeException(((StringBuilder)object).toString());
                    }
                    ++n3;
                }
            }
            object = new t((b_0)object3, (m)object, (n)object4, zoneId);
        }
        this.a = object;
        this.b = object2;
    }

    final void a() {
        --this.c;
    }

    final y b() {
        return this.b.c();
    }

    final Locale c() {
        return this.b.d();
    }

    final m d() {
        return this.a;
    }

    final Long e(p p2) {
        int n2 = this.c;
        m m2 = this.a;
        if (n2 > 0 && !m2.e(p2)) {
            return null;
        }
        return m2.B(p2);
    }

    final Object f(r object) {
        Object object2 = this.a;
        Object object3 = object2.F((r)object);
        if (object3 == null && this.c == 0) {
            object = String.valueOf(object);
            object3 = String.valueOf(object2);
            object2 = new StringBuilder("Unable to extract ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" from temporal ");
            ((StringBuilder)object2).append((String)object3);
            throw new RuntimeException(((StringBuilder)object2).toString());
        }
        return object3;
    }

    final void g() {
        ++this.c;
    }

    public final String toString() {
        return this.a.toString();
    }
}

