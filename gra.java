/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

final class gra
extends AtomicInteger {
    public static final gqw a;
    public final gra b;
    public final String c;
    public volatile gqx currentMetadata;
    public final long d;
    public final gop e;
    public int f;
    public gra g;
    public boolean h = false;
    public volatile long i;
    int j = 2;

    static {
        gqw gqw2;
        try {
            gqw2 = new gqy();
        }
        catch (Error | RuntimeException throwable) {
            gqw2 = new gqz();
        }
        a = gqw2;
    }

    public gra(gra gra2, String string, long l2, gop gop2) {
        this.i = 0L;
        gra gra3 = gra2;
        if (gra2.f()) {
            gra3 = gra2.b;
        }
        this.b = gra3;
        this.c = string;
        this.f = -1;
        this.d = l2;
        this.e = gop2;
    }

    public gra(String string, gop gop2, int n2) {
        long l2 = 0L;
        this.i = 0L;
        this.b = null;
        this.c = string;
        this.f = 0;
        this.d = 0L;
        this.e = gop2;
        if (n2 != 2) {
            l2 = Long.MIN_VALUE;
        }
        this.i = l2;
    }

    final int a() {
        gra gra2 = this.b;
        if (gra2 == null) {
            return -1;
        }
        return gra2.f;
    }

    public final gok b(boolean bl2, int n2) {
        hwp hwp2 = gok.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        String string = this.c;
        hwv hwv2 = hwp2.b;
        hwv hwv3 = (gok)hwv2;
        string.getClass();
        int n3 = ((gok)hwv3).b;
        bl2 = true;
        ((gok)hwv3).b = n3 | 1;
        ((gok)hwv3).c = string;
        n3 = this.f;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        hwv3 = (gok)hwv2;
        ((gok)hwv3).b |= 2;
        ((gok)hwv3).d = n3;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwv3 = hwp2.b;
        ((gok)hwv2).b |= 4;
        ((gok)hwv2).e = n2;
        n2 = this.j;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = hwp2.b;
        hwv2 = (gok)hwv3;
        if (n2 != 0) {
            ((gok)hwv2).l = n2 - 1;
            ((gok)hwv2).b |= 0x200;
            boolean bl3 = this.h;
            if (!hwv3.B()) {
                hwp2.u();
            }
            hwv3 = hwp2.b;
            hwv2 = (gok)hwv3;
            ((gok)hwv2).b |= 0x400;
            ((gok)hwv2).m = bl3;
            long l2 = this.d;
            if (!hwv3.B()) {
                hwp2.u();
            }
            hwv2 = (gok)hwp2.b;
            ((gok)hwv2).b |= 8;
            ((gok)hwv2).f = l2 /= 1000000L;
            l2 = this.i;
            if (l2 != 0L) {
                fxf.A(true);
                long l3 = (0x3FFFFFFFFFFFFFFFL & l2) / 1000000L;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hwv2 = (gok)hwp2.b;
                ((gok)hwv2).b |= 0x20;
                ((gok)hwv2).h = l3;
                fxf.A(true);
                if ((l2 & 0x4000000000000000L) == 0L) {
                    bl2 = false;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hwv2 = (gok)hwp2.b;
                ((gok)hwv2).b |= 0x100;
                ((gok)hwv2).k = bl2;
            }
            return (gok)hwp2.o();
        }
        throw null;
    }

    final gop c() {
        Object object = a.a(this);
        if (object == null) {
            object = goo.a;
        } else {
            gon gon2 = gop.b();
            while (object != null) {
                Object object2 = ((gqx)object).a;
                gon2.a(((gqx)object).c, object2);
                object = ((gqx)object).b;
            }
            object = ((gop)((Object)gon2)).f();
        }
        return object;
    }

    final void d(int n2, gra gra2) {
        this.f = n2;
        this.g = gra2;
    }

    final boolean e() {
        return this.i != 0L;
    }

    final boolean f() {
        return this.f < 0;
    }
}

