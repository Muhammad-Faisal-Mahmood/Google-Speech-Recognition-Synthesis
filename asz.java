/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;

public final class asz
extends kh {
    private final kf a;
    private final RecyclerView b;
    private final String c;

    public asz(kf kf2, RecyclerView recyclerView, String string) {
        this.a = kf2;
        this.b = recyclerView;
        this.c = string;
    }

    private final void v() {
        this.a.unregisterAdapterDataObserver(this);
        int n2 = ((ate)this.a).d(this.c);
        if (n2 != -1) {
            this.b.Z(n2);
        }
    }

    @Override
    public final void onChanged() {
        this.v();
    }

    @Override
    public final void onItemRangeChanged(int n2, int n3) {
        this.v();
    }

    @Override
    public final void onItemRangeChanged(int n2, int n3, Object object) {
        this.v();
    }

    @Override
    public final void onItemRangeInserted(int n2, int n3) {
        this.v();
    }

    @Override
    public final void onItemRangeMoved(int n2, int n3, int n4) {
        this.v();
    }

    @Override
    public final void onItemRangeRemoved(int n2, int n3) {
        this.v();
    }
}

