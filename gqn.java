/*
 * Decompiled with CFR 0.152.
 */
public final class gqn {
    public final gpc a;

    private gqn(gpc gpc2) {
        this.a = gpc2;
    }

    public static gqn b() {
        return new gqn(gno.d());
    }

    public static gqn c() {
        return new gqn(gno.l);
    }

    public static Runnable d(gqn object, Runnable runnable) {
        a.s(((gqn)object).a, "Trying to propagate null trace");
        object = ((gqn)object).a;
        jse.e(object, "trace");
        return new gqf((gpf)object, runnable);
    }

    public final gpf a() {
        gpc gpc2 = this.a;
        gpc gpc3 = gno.b();
        gno.w(gpc2);
        return new gmr((Object)gpc3, 5);
    }

    public final boolean e() {
        return this.a == null;
    }

    public final String toString() {
        gpc gpc2 = this.a;
        if (gpc2 == null) {
            return "null ref";
        }
        return gpc2.toString();
    }
}

