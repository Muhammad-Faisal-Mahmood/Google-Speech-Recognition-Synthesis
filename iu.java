/*
 * Decompiled with CFR 0.152.
 */
public final class iu {
    public lg a;
    public lg b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public iu(lg lg2, lg lg3, int n2, int n3, int n4, int n5) {
        this.a = lg2;
        this.b = lg3;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChangeInfo{oldHolder=");
        stringBuilder.append(this.a);
        stringBuilder.append(", newHolder=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fromX=");
        stringBuilder.append(this.c);
        stringBuilder.append(", fromY=");
        stringBuilder.append(this.d);
        stringBuilder.append(", toX=");
        stringBuilder.append(this.e);
        stringBuilder.append(", toY=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

