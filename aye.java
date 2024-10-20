/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class aye
extends ayd {
    final ot a;
    final ayf b;

    public aye(ayf ayf2, ot ot2) {
        this.b = ayf2;
        this.a = ot2;
    }

    @Override
    public final void b(ayc ayc2) {
        ayf ayf2 = this.b;
        ((ArrayList)this.a.get(ayf2.b)).remove(ayc2);
        ayc2.F(this);
    }
}

