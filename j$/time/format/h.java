/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.nio.file.attribute.a;
import j$.time.format.f;
import j$.time.format.u;
import j$.time.i;
import j$.time.temporal.m;
import j$.time.x;

final class h
implements f {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean g(u object, StringBuilder stringBuilder) {
        int n2;
        j$.time.temporal.a a2;
        Long l2 = ((u)object).e(j$.time.temporal.a.INSTANT_SECONDS);
        m m2 = ((u)object).d();
        object = m2.e(a2 = j$.time.temporal.a.NANO_OF_SECOND) ? Long.valueOf(((u)object).d().B(a2)) : null;
        int n3 = 0;
        if (l2 == null) {
            return false;
        }
        long l3 = l2;
        long l4 = object != null ? (Long)object : 0L;
        int n4 = a2.F(l4);
        if (l3 >= -62167219200L) {
            l4 = l3 - 253402300800L;
            l3 = a.f(l4, 315569520000L) + 1L;
            object = i.R(a.h(l4, 315569520000L) - 62167219200L, 0, x.f);
            if (l3 > 0L) {
                stringBuilder.append('+');
                stringBuilder.append(l3);
            }
            stringBuilder.append(object);
            if (((i)object).L() == 0) {
                stringBuilder.append(":00");
            }
        } else {
            l4 = (l3 += 62167219200L) / 315569520000L;
            object = i.R((l3 %= 315569520000L) - 62167219200L, 0, x.f);
            n2 = stringBuilder.length();
            stringBuilder.append(object);
            if (((i)object).L() == 0) {
                stringBuilder.append(":00");
            }
            if (l4 < 0L) {
                if (((i)object).M() == -10000) {
                    stringBuilder.replace(n2, n2 + 2, Long.toString(l4 - 1L));
                } else if (l3 == 0L) {
                    stringBuilder.insert(n2, l4);
                } else {
                    stringBuilder.insert(n2 + 1, Math.abs(l4));
                }
            }
        }
        if (n4 > 0) {
            stringBuilder.append('.');
            n2 = 100000000;
            while (n4 > 0 || n3 % 3 != 0 || n3 < -2) {
                int n5 = n4 / n2;
                stringBuilder.append((char)(n5 + 48));
                n4 -= n5 * n2;
                n2 /= 10;
                ++n3;
            }
        }
        stringBuilder.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}

