/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;

public final class kx
extends kh {
    final RecyclerView a;

    public kx(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override
    public final void onChanged() {
        this.a.v(null);
        RecyclerView recyclerView = this.a;
        recyclerView.O.f = true;
        recyclerView.U(true);
        if (!this.a.g.l()) {
            this.a.requestLayout();
        }
    }

    @Override
    public final void onItemRangeChanged(int n2, int n3, Object object) {
        this.a.v(null);
        hd hd2 = this.a.g;
        if (n3 > 0) {
            hd2.a.add(hd2.c(4, n2, n3, object));
            hd2.c |= 4;
            if (hd2.a.size() == 1) {
                this.v();
            }
        }
    }

    @Override
    public final void onItemRangeInserted(int n2, int n3) {
        this.a.v(null);
        hd hd2 = this.a.g;
        if (n3 > 0) {
            hd2.a.add(hd2.c(1, n2, n3, null));
            hd2.c |= 1;
            if (hd2.a.size() == 1) {
                this.v();
            }
        }
    }

    @Override
    public final void onItemRangeMoved(int n2, int n3, int n4) {
        block5: {
            block4: {
                this.a.v(null);
                hd hd2 = this.a.g;
                if (n2 == n3) break block4;
                if (n4 != 1) break block5;
                hd2.a.add(hd2.c(8, n2, n3, null));
                hd2.c |= 8;
                if (hd2.a.size() == 1) {
                    this.v();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    @Override
    public final void onItemRangeRemoved(int n2, int n3) {
        this.a.v(null);
        hd hd2 = this.a.g;
        if (n3 > 0) {
            hd2.a.add(hd2.c(2, n2, n3, null));
            hd2.c |= 2;
            if (hd2.a.size() == 1) {
                this.v();
            }
        }
    }

    @Override
    public final void onStateRestorationPolicyChanged() {
        Object object = this.a;
        if (((RecyclerView)object).f != null && (object = ((RecyclerView)object).m) != null && ((kf)object).canRestoreState()) {
            this.a.requestLayout();
        }
    }

    final void v() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.t && recyclerView.s) {
            Runnable runnable = recyclerView.j;
            int[] nArray = wj.a;
            recyclerView.postOnAnimation(runnable);
            return;
        }
        recyclerView.x = true;
        recyclerView.requestLayout();
    }
}

