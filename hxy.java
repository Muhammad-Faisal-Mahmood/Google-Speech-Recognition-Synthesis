/*
 * Decompiled with CFR 0.152.
 */
final class hxy
implements hyd {
    private final hyd[] a;

    public hxy(hyd ... hydArray) {
        this.a = hydArray;
    }

    @Override
    public final hyc a(Class clazz) {
        for (int i2 = 0; i2 < 2; ++i2) {
            hyd hyd2 = this.a[i2];
            if (!hyd2.b(clazz)) continue;
            return hyd2.a(clazz);
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(clazz.getName())));
    }

    @Override
    public final boolean b(Class clazz) {
        for (int i2 = 0; i2 < 2; ++i2) {
            if (!this.a[i2].b(clazz)) continue;
            return true;
        }
        return false;
    }
}

