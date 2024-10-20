/*
 * Decompiled with CFR 0.152.
 */
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

public final class axt
extends ayd {
    final Object a;
    final ArrayList b;
    final Object c;
    final ArrayList d;
    final FragmentTransitionSupport e;

    public axt(FragmentTransitionSupport fragmentTransitionSupport, Object object, ArrayList arrayList, Object object2, ArrayList arrayList2) {
        this.e = fragmentTransitionSupport;
        this.a = object;
        this.b = arrayList;
        this.c = object2;
        this.d = arrayList2;
    }

    @Override
    public final void b(ayc ayc2) {
        ayc2.F(this);
    }

    @Override
    public final void e(ayc object) {
        object = this.a;
        if (object != null) {
            this.e.g(object, this.b, null);
        }
        if ((object = this.c) != null) {
            this.e.g(object, this.d, null);
        }
    }
}

