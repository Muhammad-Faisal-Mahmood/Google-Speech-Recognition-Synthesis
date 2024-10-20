/*
 * Decompiled with CFR 0.152.
 */
public final class gkc {
    public final int a;
    public final int b;

    public gkc() {
        throw null;
    }

    public gkc(int n2) {
        this.a = 1;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gkc) {
            object = (gkc)object;
            int n2 = ((gkc)object).a;
            if (this.b == ((gkc)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.E(1);
        int n2 = this.b;
        a.E(n2);
        return n2 ^ 0xD4F15B46;
    }

    public final String toString() {
        String string = this.b != 1 ? "CREDENTIAL" : "DEVICE";
        return a.aj(string, "StorageSpec{type=FILES, directBoot=", "}");
    }
}

