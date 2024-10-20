/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

final class amx
extends amt {
    public static final Object c = new Object();
    public final Object d;
    private final Object e;

    public amx(aew aew2, Object object, Object object2) {
        super(aew2);
        this.e = object;
        this.d = object2;
    }

    public static amx s(aef aef2) {
        return new amx(new amy(aef2), aev.a, c);
    }

    @Override
    public final int a(Object object) {
        Object object2 = object;
        if (c.equals(object)) {
            Object object3 = this.d;
            object2 = object;
            if (object3 != null) {
                object2 = object3;
            }
        }
        return this.b.a(object2);
    }

    @Override
    public final aeu d(int n2, aeu aeu2, boolean bl2) {
        this.b.d(n2, aeu2, bl2);
        if (Objects.equals(aeu2.b, this.d) && bl2) {
            aeu2.b = c;
        }
        return aeu2;
    }

    @Override
    public final aev e(int n2, aev aev2, long l2) {
        this.b.e(n2, aev2, l2);
        if (Objects.equals(aev2.b, this.e)) {
            aev2.b = aev.a;
        }
        return aev2;
    }

    @Override
    public final Object f(int n2) {
        Object object;
        Object object2 = object = this.b.f(n2);
        if (Objects.equals(object, this.d)) {
            object2 = c;
        }
        return object2;
    }

    public final amx r(aew aew2) {
        return new amx(aew2, this.e, this.d);
    }
}

