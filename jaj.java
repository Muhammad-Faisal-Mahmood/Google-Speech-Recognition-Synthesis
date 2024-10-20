/*
 * Decompiled with CFR 0.152.
 */
public final class jaj
implements jal {
    private final int a;

    public /* synthetic */ jaj(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(kmp kmp2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    kmp2.W();
                    return;
                }
                kmp2.g();
                return;
            }
            kmp2.e();
            return;
        }
        kmp2.X();
    }
}

