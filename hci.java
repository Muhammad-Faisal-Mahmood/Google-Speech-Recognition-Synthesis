/*
 * Decompiled with CFR 0.152.
 */
public final class hci {
    public final Object a;
    int b;
    final hcn c;

    public hci() {
        throw null;
    }

    public hci(hcn hcn2, int n2) {
        this.c = hcn2;
        this.a = hcn2.a[n2];
        this.b = n2;
    }

    public final int a() {
        int n2;
        block5: {
            block4: {
                n2 = this.b;
                if (n2 == -1) break block4;
                hcn hcn2 = this.c;
                if (n2 < hcn2.c && a.k(this.a, hcn2.a[n2])) break block5;
            }
            this.b = this.c.d(this.a);
        }
        if ((n2 = this.b) == -1) {
            return 0;
        }
        return this.c.b[n2];
    }

    public final boolean equals(Object object) {
        if (object instanceof hci) {
            object = (hci)object;
            if (this.a() == ((hci)object).a() && a.k(this.a, ((hci)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = object == null ? 0 : object.hashCode();
        return n2 ^ this.a();
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        int n2 = this.a();
        if (n2 == 1) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" x ");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

