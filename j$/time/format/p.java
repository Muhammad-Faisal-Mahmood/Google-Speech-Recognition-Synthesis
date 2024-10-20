/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.d;
import j$.time.format.A;
import j$.time.format.j;
import j$.time.format.m;
import j$.time.format.u;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.v;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;

final class p
extends j {
    private char g;
    private int h;

    p(char c2, int n2, int n3, int n4, int n5) {
        super(null, n3, n4, A.NOT_NEGATIVE, n5);
        this.g = c2;
        this.h = n2;
    }

    @Override
    final j c() {
        p p2;
        if (this.e == -1) {
            p2 = this;
        } else {
            int n2 = this.h;
            int n3 = this.b;
            p2 = new p(this.g, n2, n3, this.c, -1);
        }
        return p2;
    }

    @Override
    final j d(int n2) {
        int n3 = this.e;
        int n4 = this.b;
        int n5 = this.c;
        return new p(this.g, this.h, n4, n5, n3 + n2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean g(u u2, StringBuilder stringBuilder) {
        void var5_10;
        void var5_19;
        int n2;
        block7: {
            v v2;
            block8: {
                Locale locale = u2.c();
                TemporalUnit temporalUnit = v.h;
                Objects.requireNonNull(locale, "locale");
                Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
                n2 = calendar.getFirstDayOfWeek();
                v2 = v.f(d.SUNDAY.J(n2 - 1), calendar.getMinimalDaysInFirstWeek());
                n2 = this.g;
                if (n2 == 87) break block8;
                if (n2 != 89) {
                    if (n2 != 99 && n2 != 101) {
                        if (n2 != 119) throw new IllegalStateException("unreachable");
                        j$.time.temporal.p p2 = v2.i();
                        break block7;
                    } else {
                        j$.time.temporal.p p3 = v2.c();
                    }
                    break block7;
                } else {
                    void var5_14;
                    j$.time.temporal.p p4 = v2.g();
                    n2 = this.h;
                    if (n2 == 2) {
                        m m2 = new m(p4, m.h, this.e);
                        return var5_19.g(u2, stringBuilder);
                    }
                    if (n2 < 4) {
                        A a2 = A.NORMAL;
                    } else {
                        A a3 = A.EXCEEDS_PAD;
                    }
                    j j2 = new j(p4, n2, 19, (A)var5_14, this.e);
                    return var5_19.g(u2, stringBuilder);
                }
            }
            j$.time.temporal.p p5 = v2.h();
        }
        A a4 = A.NOT_NEGATIVE;
        int n3 = this.c;
        n2 = this.e;
        j j3 = new j((j$.time.temporal.p)var5_10, this.b, n3, a4, n2);
        return var5_19.g(u2, stringBuilder);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Localized(");
        int n2 = this.h;
        char c2 = this.g;
        if (c2 == 'Y') {
            if (n2 == 1) {
                stringBuilder.append("WeekBasedYear");
            } else if (n2 == 2) {
                stringBuilder.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                stringBuilder.append("WeekBasedYear,");
                stringBuilder.append(n2);
                stringBuilder.append(",19,");
                A a2 = n2 < 4 ? A.NORMAL : A.EXCEEDS_PAD;
                stringBuilder.append((Object)a2);
            }
        } else {
            if (c2 != 'W') {
                if (c2 != 'c' && c2 != 'e') {
                    if (c2 == 'w') {
                        stringBuilder.append("WeekOfWeekBasedYear");
                    }
                } else {
                    stringBuilder.append("DayOfWeek");
                }
            } else {
                stringBuilder.append("WeekOfMonth");
            }
            stringBuilder.append(",");
            stringBuilder.append(n2);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

