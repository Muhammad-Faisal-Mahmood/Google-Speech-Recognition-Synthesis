/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class aw
extends bj {
    final be a;

    public aw(be be2) {
        this.a = be2;
    }

    @Override
    public final View a(int n2) {
        Object object = this.a.P;
        if (object != null) {
            return object.findViewById(n2);
        }
        object = new StringBuilder("Fragment ");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(" does not have a view");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    @Override
    public final boolean b() {
        return this.a.P != null;
    }
}

