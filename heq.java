/*
 * Decompiled with CFR 0.152.
 */
final class heq
extends her {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public heq(String string, String string2, int n2, String string3) {
        this.b = string;
        this.c = string2;
        this.d = n2;
        this.e = string3;
    }

    @Override
    public final int a() {
        return (char)this.d;
    }

    @Override
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override
    public final String c() {
        return this.e;
    }

    @Override
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object object) {
        if (object instanceof heq) {
            object = (heq)object;
            if (this.c.equals(((heq)object).c) && this.d == ((heq)object).d && this.b().equals(((heq)object).b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.f;
        if (n2 == 0) {
            this.f = n3 = (this.c.hashCode() + 4867) * 31 + this.d;
        }
        return n3;
    }
}

