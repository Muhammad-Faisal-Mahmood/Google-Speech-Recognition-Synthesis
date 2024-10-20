/*
 * Decompiled with CFR 0.152.
 */
public class jsv
implements Iterable,
jsm {
    public final int a;
    public final int b;
    public final int c;

    public jsv(int n2, int n3, int n4) {
        if (n4 != 0) {
            this.a = n2;
            this.b = jsd.g(n2, n3, n4);
            this.c = n4;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final jpe a() {
        return new jpe(this.a, this.b, this.c);
    }

    public boolean b() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof jsv;
        boolean bl4 = bl2 = false;
        if (bl3) {
            if (this.b() && ((jsv)object).b()) {
                bl4 = true;
            } else {
                int n2 = this.a;
                object = (jsv)object;
                bl4 = bl2;
                if (n2 == ((jsv)object).a) {
                    bl4 = bl2;
                    if (this.b == ((jsv)object).b) {
                        if (this.c != ((jsv)object).c) {
                            bl4 = bl2;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return bl4;
    }

    public int hashCode() {
        if (this.b()) {
            return -1;
        }
        return (this.a * 31 + this.b) * 31 + this.c;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        int n2 = this.c;
        int n3 = this.a;
        int n4 = this.b;
        if (n2 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            string = "..";
        } else {
            n2 = -n2;
            stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            string = " downTo ";
        }
        stringBuilder.append(string);
        stringBuilder.append(n4);
        stringBuilder.append(" step ");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

