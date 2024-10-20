/*
 * Decompiled with CFR 0.152.
 */
public final class koe {
    public kof a;
    public int b;

    public final boolean equals(Object object) {
        return object instanceof koe && this.a.equals(((koe)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

