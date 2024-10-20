/*
 * Decompiled with CFR 0.152.
 */
public final class aep {
    public static final int b = 0;
    public final ads a;

    static {
        aay.d(new adr());
        agf.z(0);
    }

    public aep(ads ads2) {
        this.a = ads2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aep)) {
            return false;
        }
        object = (aep)object;
        return this.a.equals(((aep)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

