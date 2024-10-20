/*
 * Decompiled with CFR 0.152.
 */
public final class gta
implements gte {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object a(Object object) {
        int n2 = ((bua)object).ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) throw new IllegalArgumentException("unknown enum value: ".concat(object.toString()));
                        object = iay.s;
                    } else {
                        object = iay.r;
                    }
                } else {
                    object = iay.q;
                }
            } else {
                object = iay.l;
            }
        } else {
            object = iay.t;
        }
        fxf.K(object);
        return object;
    }

    @Override
    @Deprecated
    public final Object apply(Object object) {
        throw null;
    }
}

