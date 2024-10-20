/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.chrono.n;
import j$.time.format.A;
import j$.time.format.e;
import j$.time.format.s;
import j$.time.format.u;
import j$.time.format.y;
import j$.time.format.z;
import j$.time.temporal.a;
import j$.time.temporal.h;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public final class DateTimeFormatter {
    public static final DateTimeFormatter e;
    private final e a;
    private final Locale b;
    private final y c;
    private final j$.time.chrono.u d;

    static {
        Object object = new s();
        a a2 = j$.time.temporal.a.YEAR;
        Enum enum_ = A.EXCEEDS_PAD;
        ((s)object).p(a2, 4, 10, (A)enum_);
        ((s)object).e('-');
        a a3 = j$.time.temporal.a.MONTH_OF_YEAR;
        ((s)object).o(a3, 2);
        ((s)object).e('-');
        a a4 = j$.time.temporal.a.DAY_OF_MONTH;
        ((s)object).o(a4, 2);
        Object object2 = z.STRICT;
        j$.time.chrono.u u2 = j$.time.chrono.u.d;
        HashMap<Object, String> hashMap = ((s)object).y((z)((Object)object2), u2);
        object = new s();
        ((s)object).t();
        ((s)object).a((DateTimeFormatter)((Object)hashMap));
        ((s)object).i();
        ((s)object).y((z)((Object)object2), u2);
        object = new s();
        ((s)object).t();
        ((s)object).a((DateTimeFormatter)((Object)hashMap));
        ((s)object).s();
        ((s)object).i();
        ((s)object).y((z)((Object)object2), u2);
        Object object3 = new s();
        a a5 = j$.time.temporal.a.HOUR_OF_DAY;
        ((s)object3).o(a5, 2);
        ((s)object3).e(':');
        object = j$.time.temporal.a.MINUTE_OF_HOUR;
        ((s)object3).o((p)object, 2);
        ((s)object3).s();
        ((s)object3).e(':');
        a a6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        ((s)object3).o(a6, 2);
        ((s)object3).s();
        ((s)object3).b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        object3 = ((s)object3).y((z)((Object)object2), null);
        Object object4 = new s();
        ((s)object4).t();
        ((s)object4).a((DateTimeFormatter)object3);
        ((s)object4).i();
        ((s)object4).y((z)((Object)object2), null);
        object4 = new s();
        ((s)object4).t();
        ((s)object4).a((DateTimeFormatter)object3);
        ((s)object4).s();
        ((s)object4).i();
        ((s)object4).y((z)((Object)object2), null);
        object4 = new s();
        ((s)object4).t();
        ((s)object4).a((DateTimeFormatter)((Object)hashMap));
        ((s)object4).e('T');
        ((s)object4).a((DateTimeFormatter)object3);
        hashMap = ((s)object4).y((z)((Object)object2), u2);
        object3 = new s();
        ((s)object3).t();
        ((s)object3).a((DateTimeFormatter)((Object)hashMap));
        ((s)object3).v();
        ((s)object3).i();
        ((s)object3).w();
        object3 = ((s)object3).y((z)((Object)object2), u2);
        object4 = new s();
        ((s)object4).a((DateTimeFormatter)object3);
        ((s)object4).s();
        ((s)object4).e('[');
        ((s)object4).u();
        ((s)object4).q();
        ((s)object4).e(']');
        ((s)object4).y((z)((Object)object2), u2);
        object3 = new s();
        ((s)object3).a((DateTimeFormatter)((Object)hashMap));
        ((s)object3).s();
        ((s)object3).i();
        ((s)object3).s();
        ((s)object3).e('[');
        ((s)object3).u();
        ((s)object3).q();
        ((s)object3).e(']');
        ((s)object3).y((z)((Object)object2), u2);
        hashMap = new s();
        ((s)((Object)hashMap)).t();
        ((s)((Object)hashMap)).p(a2, 4, 10, (A)enum_);
        ((s)((Object)hashMap)).e('-');
        ((s)((Object)hashMap)).o(j$.time.temporal.a.DAY_OF_YEAR, 3);
        ((s)((Object)hashMap)).s();
        ((s)((Object)hashMap)).i();
        ((s)((Object)hashMap)).y((z)((Object)object2), u2);
        hashMap = new s();
        ((s)((Object)hashMap)).t();
        ((s)((Object)hashMap)).p(h.c, 4, 10, (A)enum_);
        ((s)((Object)hashMap)).f("-W");
        ((s)((Object)hashMap)).o(h.b, 2);
        ((s)((Object)hashMap)).e('-');
        enum_ = j$.time.temporal.a.DAY_OF_WEEK;
        ((s)((Object)hashMap)).o((p)((Object)enum_), 1);
        ((s)((Object)hashMap)).s();
        ((s)((Object)hashMap)).i();
        ((s)((Object)hashMap)).y((z)((Object)object2), u2);
        hashMap = new s();
        ((s)((Object)hashMap)).t();
        ((s)((Object)hashMap)).c();
        e = ((s)((Object)hashMap)).y((z)((Object)object2), null);
        hashMap = new s();
        ((s)((Object)hashMap)).t();
        ((s)((Object)hashMap)).o(a2, 4);
        ((s)((Object)hashMap)).o(a3, 2);
        ((s)((Object)hashMap)).o(a4, 2);
        ((s)((Object)hashMap)).s();
        ((s)((Object)hashMap)).v();
        ((s)((Object)hashMap)).h("+HHMMss", "Z");
        ((s)((Object)hashMap)).w();
        ((s)((Object)hashMap)).y((z)((Object)object2), u2);
        hashMap = new HashMap<Object, String>();
        Long l2 = 1L;
        hashMap.put(l2, "Mon");
        Long l3 = 2L;
        hashMap.put(l3, "Tue");
        Long l4 = 3L;
        hashMap.put(l4, "Wed");
        Long l5 = 4L;
        hashMap.put(l5, "Thu");
        object3 = 5L;
        hashMap.put(object3, "Fri");
        Long l6 = 6L;
        hashMap.put(l6, "Sat");
        object4 = 7L;
        hashMap.put(object4, "Sun");
        object2 = new HashMap();
        ((HashMap)object2).put(l2, "Jan");
        ((HashMap)object2).put(l3, "Feb");
        ((HashMap)object2).put(l4, "Mar");
        ((HashMap)object2).put(l5, "Apr");
        ((HashMap)object2).put(object3, "May");
        ((HashMap)object2).put(l6, "Jun");
        ((HashMap)object2).put(object4, "Jul");
        ((HashMap)object2).put(8L, "Aug");
        ((HashMap)object2).put(9L, "Sep");
        ((HashMap)object2).put(10L, "Oct");
        ((HashMap)object2).put(11L, "Nov");
        ((HashMap)object2).put(12L, "Dec");
        object3 = new s();
        ((s)object3).t();
        ((s)object3).v();
        ((s)object3).s();
        ((s)object3).k((a)enum_, hashMap);
        ((s)object3).f(", ");
        ((s)object3).r();
        ((s)object3).p(a4, 1, 2, A.NOT_NEGATIVE);
        ((s)object3).e(' ');
        ((s)object3).k(a3, (HashMap)object2);
        ((s)object3).e(' ');
        ((s)object3).o(a2, 4);
        ((s)object3).e(' ');
        ((s)object3).o(a5, 2);
        ((s)object3).e(':');
        ((s)object3).o((p)object, 2);
        ((s)object3).s();
        ((s)object3).e(':');
        ((s)object3).o(a6, 2);
        ((s)object3).r();
        ((s)object3).e(' ');
        ((s)object3).h("+HHMM", "GMT");
        ((s)object3).y(z.SMART, u2);
    }

    DateTimeFormatter(e object, Locale locale, z z2, j$.time.chrono.u u2) {
        y y2 = y.a;
        this.a = Objects.requireNonNull(object, "printerParser");
        this.b = Objects.requireNonNull(locale, "locale");
        this.c = Objects.requireNonNull(y2, "decimalStyle");
        object = Objects.requireNonNull(z2, "resolverStyle");
        this.d = u2;
    }

    public static DateTimeFormatter ofPattern(String string) {
        s s2 = new s();
        s2.j(string);
        return s2.x();
    }

    public final String a(m object) {
        u u2;
        StringBuilder stringBuilder = new StringBuilder(32);
        Objects.requireNonNull(object, "temporal");
        Objects.requireNonNull(stringBuilder, "appendable");
        try {
            u2 = new u((m)object, this);
            object = this.a;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.getMessage(), iOException);
        }
        ((e)object).g(u2, stringBuilder);
        return stringBuilder.toString();
    }

    public final n b() {
        return this.d;
    }

    public final y c() {
        return this.c;
    }

    public final Locale d() {
        return this.b;
    }

    final e e() {
        return this.a.a();
    }

    public final String toString() {
        String string = this.a.toString();
        if (!string.startsWith("[")) {
            string = string.substring(1, string.length() - 1);
        }
        return string;
    }
}

