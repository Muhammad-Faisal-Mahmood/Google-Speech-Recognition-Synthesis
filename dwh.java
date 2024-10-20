/*
 * Decompiled with CFR 0.152.
 */
public final class dwh
implements cah {
    public final int[] a;

    public /* synthetic */ dwh(int[] nArray) {
        this.a = nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(cai cai2) {
        int n2 = dwi.a;
        int[] nArray = this.a;
        try {
            cai2.c(nArray);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

