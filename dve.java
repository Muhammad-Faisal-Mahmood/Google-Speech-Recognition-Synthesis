/*
 * Decompiled with CFR 0.152.
 */
public final class dve {
    public static final dve a = new dve(hdd.c);
    public final hay b;

    public dve(hay hay2) {
        this.b = hay2;
    }

    public final boolean equals(Object object) {
        if (object instanceof dve) {
            return this.b.equals(((dve)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return hhk.n(this.b);
    }
}

