/*
 * Decompiled with CFR 0.152.
 */
public final class cyn {
    public final Long a;

    public cyn(Long l2) {
        this.a = l2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cyn) {
            return this.a.equals(((cyn)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

