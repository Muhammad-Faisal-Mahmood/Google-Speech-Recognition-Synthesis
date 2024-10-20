/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

public final class kpn {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    private final long e;
    private final long f;
    private final long g;

    public kpn() {
        throw null;
    }

    public kpn(long l2, long l3, long l4, long l5, long l6) {
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.c = l5;
        this.d = l6;
        long l7 = l2 - -1L;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        this.a = l8 != false && l3 != -1L ? Long.valueOf(l3 - l2) : null;
        if (l8 != false && l4 != -1L) {
            this.b = l4 - l2;
            return;
        }
        this.b = null;
    }

    private static Date d(long l2) {
        if (l2 != -1L) {
            return new Date(l2);
        }
        return null;
    }

    public final Date a() {
        return kpn.d(this.g);
    }

    public final Date b() {
        return kpn.d(this.e);
    }

    public final Date c() {
        return kpn.d(this.f);
    }
}

