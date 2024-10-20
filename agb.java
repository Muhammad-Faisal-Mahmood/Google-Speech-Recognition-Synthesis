/*
 * Decompiled with CFR 0.152.
 */
public final class agb {
    public static final agb a = new agb(-1, -1);
    public final int b;
    public final int c;

    static {
        new agb(0, 0);
    }

    public agb(int n2, int n3) {
        boolean bl2;
        block3: {
            block4: {
                boolean bl3;
                block2: {
                    bl3 = false;
                    if (n2 == -1) break block2;
                    bl2 = bl3;
                    if (n2 < 0) break block3;
                }
                if (n3 == -1) break block4;
                bl2 = bl3;
                if (n3 < 0) break block3;
            }
            bl2 = true;
        }
        abr.d(bl2);
        this.b = n2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof agb) {
            object = (agb)object;
            if (this.b == ((agb)object).b && this.c == ((agb)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        return (n2 >>> 16 | n2 << 16) ^ this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("x");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

