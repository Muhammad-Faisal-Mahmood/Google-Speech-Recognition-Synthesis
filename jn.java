/*
 * Decompiled with CFR 0.152.
 */
public final class jn {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public final boolean a(ld ld2) {
        int n2 = this.c;
        return n2 >= 0 && n2 < ld2.a();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutState{mAvailable=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCurrentPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mItemDirection=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mLayoutDirection=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mStartLine=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mEndLine=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

