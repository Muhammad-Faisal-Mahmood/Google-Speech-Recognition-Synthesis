/*
 * Decompiled with CFR 0.152.
 */
public final class jsy
extends jsx {
    public jsy(long l2, long l3) {
        super(l2, l3);
    }

    @Override
    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean b(long l2) {
        return this.a <= l2 && l2 <= this.b;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof jsy;
        boolean bl4 = bl2 = false;
        if (bl3) {
            if (((jsx)this).a() && ((jsx)((jsy)object)).a()) {
                bl4 = true;
            } else {
                long l2 = this.a;
                object = (jsy)object;
                bl4 = bl2;
                if (l2 == ((jsx)object).a) {
                    if (this.b != ((jsx)object).b) {
                        bl4 = bl2;
                    } else {
                        return true;
                    }
                }
            }
        }
        return bl4;
    }

    @Override
    public final int hashCode() {
        if (((jsx)this).a()) {
            return -1;
        }
        long l2 = this.a;
        long l3 = this.b;
        return (int)((l2 ^ l2 >>> 32) * 31L + (l3 ^ l3 >>> 32));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("..");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

