/*
 * Decompiled with CFR 0.152.
 */
public final class ld {
    public int a = -1;
    public int b = 0;
    public int c = 0;
    public int d = 1;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;
    public int o;
    public int p;

    public final int a() {
        int n2 = this.g ? this.b - this.c : this.e;
        return n2;
    }

    public final void b(int n2) {
        if ((this.d & n2) != 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Layout state should be one of ");
        stringBuilder.append(Integer.toBinaryString(n2));
        stringBuilder.append(" but it is ");
        stringBuilder.append(Integer.toBinaryString(this.d));
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("State{mTargetPosition=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mData=null, mItemCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mIsMeasuring=");
        stringBuilder.append(this.i);
        stringBuilder.append(", mPreviousLayoutItemCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mStructureChanged=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mInPreLayout=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mRunSimpleAnimations=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mRunPredictiveAnimations=");
        stringBuilder.append(this.k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

