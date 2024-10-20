/*
 * Decompiled with CFR 0.152.
 */
final class ayi
extends ayd {
    final ayk a;

    public ayi(ayk ayk2) {
        this.a = ayk2;
    }

    @Override
    public final void a(ayc ayc2) {
        this.a.u.remove(ayc2);
        if (!((ayc)this.a).A()) {
            ayc2 = this.a;
            ayc2.t(ayc2, ayb.c, false);
            ayc2 = this.a;
            ((ayk)ayc2).m = true;
            ayc2.t(ayc2, ayb.b, false);
        }
    }
}

