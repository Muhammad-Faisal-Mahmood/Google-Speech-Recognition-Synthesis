/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class gv
extends jg {
    final gw a;

    public gv(gw gw2, View view) {
        this.a = gw2;
        super(view);
    }

    @Override
    public final gi a() {
        gx gx2 = this.a.a.i;
        if (gx2 == null) {
            return null;
        }
        return gx2.a();
    }

    @Override
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override
    public final boolean c() {
        gy gy2 = this.a.a;
        if (gy2.k != null) {
            return false;
        }
        gy2.k();
        return true;
    }
}

