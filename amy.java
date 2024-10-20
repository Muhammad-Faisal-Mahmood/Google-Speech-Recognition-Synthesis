/*
 * Decompiled with CFR 0.152.
 */
public final class amy
extends aew {
    private final aef b;

    public amy(aef aef2) {
        this.b = aef2;
    }

    @Override
    public final int a(Object object) {
        if (object == amx.c) {
            return 0;
        }
        return -1;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final aeu d(int n2, aeu aeu2, boolean bl2) {
        Object object = null;
        Integer n3 = bl2 ? Integer.valueOf(0) : null;
        if (bl2) {
            object = amx.c;
        }
        aeu2.g(n3, object, 0, -9223372036854775807L, adh.a, true);
        return aeu2;
    }

    @Override
    public final aev e(int n2, aev aev2, long l2) {
        aev2.c(aev.a, this.b, false, true, null, -9223372036854775807L);
        aev2.k = true;
        return aev2;
    }

    @Override
    public final Object f(int n2) {
        return amx.c;
    }
}

