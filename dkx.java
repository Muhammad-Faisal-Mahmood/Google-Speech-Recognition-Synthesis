/*
 * Decompiled with CFR 0.152.
 */
public final class dkx {
    public static final dkx a = new dkx(new dla[0]);
    public final dla[] b;
    public final int[] c;

    public dkx(dla[] dlaArray) {
        this.b = dlaArray;
        this.c = new int[dlaArray.length];
        for (int i2 = 0; i2 < dlaArray.length; ++i2) {
            this.c[i2] = dlaArray[i2].c;
        }
    }
}

