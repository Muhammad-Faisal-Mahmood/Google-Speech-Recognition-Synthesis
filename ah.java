/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

public class ah {
    public final cy a;

    public ah(cy cy2) {
        jse.e(cy2, "operation");
        this.a = cy2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        void var3_4;
        boolean bl2;
        View view = this.a.c.P;
        if (view != null) {
            cx cx2 = a.O(view);
        } else {
            Object var3_3 = null;
        }
        cx cx3 = this.a.a;
        boolean bl3 = bl2 = true;
        if (var3_4 == cx3) return bl3;
        cx cx4 = cx.b;
        if (var3_4 == cx4) return false;
        if (cx3 == cx4) return false;
        return bl2;
    }
}

