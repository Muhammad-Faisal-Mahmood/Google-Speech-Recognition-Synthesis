/*
 * Decompiled with CFR 0.152.
 */
public final class gkk {
    public final gml a;

    public gkk(gml gml2) {
        this.a = gml2;
    }

    public static gkk a(String string) {
        hwp hwp2 = gml.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        gml gml2 = (gml)hwp2.b;
        string.getClass();
        gml2.b |= 1;
        gml2.c = string;
        return new gkk((gml)hwp2.o());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object object) {
        return object instanceof gkk && this.a.c.equals(((gkk)object).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", this.b());
    }
}

