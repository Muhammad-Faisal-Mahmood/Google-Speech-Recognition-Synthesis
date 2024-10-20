/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.chrono.n;
import j$.time.format.B;
import j$.time.format.w;
import j$.time.format.x;
import j$.time.temporal.p;
import java.util.Locale;

/*
 * Renamed from j$.time.format.b
 */
final class b_0
extends x {
    final w e;

    b_0(w w2) {
        this.e = w2;
    }

    @Override
    public final String d(n n2, p p2, long l2, B b2, Locale locale) {
        return this.e.a(l2, b2);
    }

    @Override
    public final String e(p p2, long l2, B b2, Locale locale) {
        return this.e.a(l2, b2);
    }
}

