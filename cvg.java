/*
 * Decompiled with CFR 0.152.
 */
public final class cvg {
    public final String a;

    public cvg() {
        throw null;
    }

    public cvg(String string) {
        this.a = string;
    }

    public static cvg a(String string) {
        int n2 = his.a;
        hiq hiq2 = hir.a.a();
        hiq2.e(string);
        return new cvg(hiq2.n().toString());
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cvg) {
            object = (cvg)object;
            if (this.a.equals(((cvg)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.E(1);
        return this.a.hashCode() ^ 0xD4F15B46;
    }

    public final String toString() {
        return this.a;
    }
}

