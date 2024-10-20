/*
 * Decompiled with CFR 0.152.
 */
public final class hgv {
    public final hhz a;
    public final String b;

    public hgv(hhz hhz2, String string) {
        hhk.h(hhz2, "parser");
        this.a = hhz2;
        hhk.h(string, "message");
        this.b = string;
    }

    public final boolean equals(Object object) {
        if (object instanceof hgv) {
            object = (hgv)object;
            if (this.a.equals(((hgv)object).a) && this.b.equals(((hgv)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.b;
        int n2 = this.a.hashCode();
        return string.hashCode() ^ n2;
    }
}

