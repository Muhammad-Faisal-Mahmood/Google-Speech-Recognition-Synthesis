/*
 * Decompiled with CFR 0.152.
 */
public final class aft {
    public final Object a;
    public adr b;
    public boolean c;
    public boolean d;

    public aft(Object object) {
        this.a = object;
        this.b = new adr();
    }

    public final void a(afs afs2) {
        this.d = true;
        if (this.c) {
            this.c = false;
            afs2.a(this.a, this.b.a());
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            return this.a.equals(((aft)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

