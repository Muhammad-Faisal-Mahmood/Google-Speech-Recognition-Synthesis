/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class as
extends bj {
    final bj a;
    final at b;

    public as(at at2, bj bj2) {
        this.b = at2;
        this.a = bj2;
    }

    @Override
    public final View a(int n2) {
        bj bj2 = this.a;
        if (bj2.b()) {
            return bj2.a(n2);
        }
        bj2 = this.b.c;
        if (bj2 != null) {
            return bj2.findViewById(n2);
        }
        return null;
    }

    @Override
    public final boolean b() {
        return this.a.b() || this.b.d;
        {
        }
    }
}

