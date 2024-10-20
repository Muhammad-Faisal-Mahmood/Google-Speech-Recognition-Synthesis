/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import java.util.Iterator;

public final class wm
implements Iterator,
jsm {
    final ViewGroup a;
    private int b;

    public wm(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override
    public final boolean hasNext() {
        ViewGroup viewGroup = this.a;
        return this.b < viewGroup.getChildCount();
    }

    @Override
    public final void remove() {
        int n2;
        this.b = n2 = this.b - 1;
        this.a.removeViewAt(n2);
    }
}

