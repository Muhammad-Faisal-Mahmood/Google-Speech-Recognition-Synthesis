/*
 * Decompiled with CFR 0.152.
 */
public final class ces {
    public final cbm[] a;
    public final boolean b;
    public final int c;
    final cer d;

    public ces(cer cer2, cbm[] cbmArray, boolean bl2, int n2) {
        boolean bl3;
        this.d = cer2;
        this.a = cbmArray;
        boolean bl4 = bl3 = false;
        if (cbmArray != null) {
            bl4 = bl3;
            if (bl2) {
                bl4 = true;
            }
        }
        this.b = bl4;
        this.c = n2;
    }
}

