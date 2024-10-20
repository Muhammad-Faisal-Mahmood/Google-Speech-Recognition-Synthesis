/*
 * Decompiled with CFR 0.152.
 */
public final class jsw
extends jsv {
    public static final jsw d = new jsw(1, 0);

    public jsw(int n2, int n3) {
        super(n2, n3, 1);
    }

    @Override
    public final boolean b() {
        return this.a > this.b;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof jsw;
        boolean bl4 = bl2 = false;
        if (bl3) {
            if (((jsv)this).b() && ((jsv)((jsw)object)).b()) {
                bl4 = true;
            } else {
                int n2 = this.a;
                object = (jsw)object;
                bl4 = bl2;
                if (n2 == ((jsv)object).a) {
                    if (this.b != ((jsv)object).b) {
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
        if (((jsv)this).b()) {
            return -1;
        }
        return this.a * 31 + this.b;
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

