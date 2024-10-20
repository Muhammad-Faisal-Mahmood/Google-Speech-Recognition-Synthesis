/*
 * Decompiled with CFR 0.152.
 */
public class jsx
implements Iterable,
jsm {
    public final long a;
    public final long b;
    private final long c;

    public jsx(long l2, long l3) {
        this.a = l2;
        this.b = l3;
        this.c = 1L;
    }

    public boolean a() {
        return this.a > this.b;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof jsx;
        boolean bl4 = bl2 = false;
        if (bl3) {
            if (this.a() && ((jsx)object).a()) {
                bl4 = true;
            } else {
                long l2 = this.a;
                object = (jsx)object;
                bl4 = bl2;
                if (l2 == ((jsx)object).a) {
                    if (this.b != ((jsx)object).b) {
                        bl4 = bl2;
                    } else {
                        l2 = ((jsx)object).c;
                        return true;
                    }
                }
            }
        }
        return bl4;
    }

    public int hashCode() {
        if (this.a()) {
            return -1;
        }
        long l2 = this.a;
        long l3 = this.b;
        return (int)(((l2 ^ l2 >>> 32) * 31L + (l3 ^ l3 >>> 32)) * 31L + 1L);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("..");
        stringBuilder.append(this.b);
        stringBuilder.append(" step 1");
        return stringBuilder.toString();
    }
}

