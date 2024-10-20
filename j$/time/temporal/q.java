/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.chrono.n;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.r;
import j$.time.x;

final class q
implements r {
    public final int a;

    public /* synthetic */ q(int n2) {
        this.a = n2;
    }

    @Override
    public final Object a(m object) {
        switch (this.a) {
            default: {
                a a2 = j$.time.temporal.a.NANO_OF_DAY;
                object = object.e(a2) ? k.Q(object.B(a2)) : null;
                return object;
            }
            case 5: {
                a a3 = j$.time.temporal.a.EPOCH_DAY;
                object = object.e(a3) ? g.V(object.B(a3)) : null;
                return object;
            }
            case 4: {
                ZoneId zoneId = (ZoneId)object.F(l.a);
                object = zoneId != null ? zoneId : (ZoneId)object.F(l.d);
                return object;
            }
            case 3: {
                a a4 = j$.time.temporal.a.OFFSET_SECONDS;
                object = object.e(a4) ? x.R(object.p(a4)) : null;
                return object;
            }
            case 2: {
                return (TemporalUnit)object.F(l.c);
            }
            case 1: {
                return (n)object.F(l.b);
            }
            case 0: 
        }
        return (ZoneId)object.F(l.a);
    }

    public final String toString() {
        switch (this.a) {
            default: {
                return "LocalTime";
            }
            case 5: {
                return "LocalDate";
            }
            case 4: {
                return "Zone";
            }
            case 3: {
                return "ZoneOffset";
            }
            case 2: {
                return "Precision";
            }
            case 1: {
                return "Chronology";
            }
            case 0: 
        }
        return "ZoneId";
    }
}

