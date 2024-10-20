/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 */
import android.widget.AbsListView;

final class jv
implements AbsListView.OnScrollListener {
    final jw a;

    public jv(jw jw2) {
        this.a = jw2;
    }

    public final void onScroll(AbsListView absListView, int n2, int n3, int n4) {
    }

    public final void onScrollStateChanged(AbsListView object, int n2) {
        if (n2 == 1 && !this.a.w() && this.a.q.getContentView() != null) {
            object = this.a;
            object.o.removeCallbacks((Runnable)object.r);
            this.a.r.run();
        }
    }
}

