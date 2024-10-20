/*
 * Decompiled with CFR 0.152.
 */
final class ayj
extends ayd {
    final ayk a;

    public ayj(ayk ayk2) {
        this.a = ayk2;
    }

    @Override
    public final void b(ayc ayc2) {
        int n2;
        ayk ayk2 = this.a;
        ayk2.v = n2 = ayk2.v - 1;
        if (n2 == 0) {
            ayk2.w = false;
            ayk2.s();
        }
        ayc2.F(this);
    }

    @Override
    public final void e(ayc ayc2) {
        ayc2 = this.a;
        if (!((ayk)ayc2).w) {
            ayc2.z();
            this.a.w = true;
        }
    }
}

