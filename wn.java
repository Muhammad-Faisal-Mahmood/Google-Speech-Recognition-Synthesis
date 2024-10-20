/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import java.util.Iterator;

public final class wn
implements jtl {
    final Object a;
    private final int b;

    public wn(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Iterator a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return this.a;
                    }
                    jtm jtm2 = new jtm();
                    jtm2.a = jjj.m((jro)this.a, jtm2, jtm2);
                    return jtm2;
                }
                return this.a.iterator();
            }
            return new wm((ViewGroup)this.a);
        }
        return new vp(new wn(this.a, 1).a(), wl.a);
    }
}

