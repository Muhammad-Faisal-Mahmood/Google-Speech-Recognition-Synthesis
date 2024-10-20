/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

public final class yl
implements vb {
    final ViewGroup a;
    private final int b;

    public yl(ViewGroup viewGroup, int n2) {
        this.b = n2;
        this.a = viewGroup;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final float a() {
        float f2;
        if (this.b != 0) {
            if (((RecyclerView)this.a).n.Z()) {
                return -((RecyclerView)this.a).K;
            }
            if (!((RecyclerView)this.a).n.Y()) {
                return 0.0f;
            }
            f2 = ((RecyclerView)this.a).J;
            return -f2;
        }
        f2 = ((NestedScrollView)this.a).a();
        return -f2;
    }

    @Override
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView)this.a).ai();
            return;
        }
        ((NestedScrollView)this.a).a.abortAnimation();
    }

    @Override
    public final boolean c(float f2) {
        if (this.b != 0) {
            int n2;
            int n3;
            if (((RecyclerView)this.a).n.Z()) {
                n3 = (int)f2;
                n2 = 0;
            } else if (((RecyclerView)this.a).n.Y()) {
                n2 = (int)f2;
                n3 = 0;
            } else {
                n2 = 0;
                n3 = 0;
            }
            int n4 = n2;
            if (n2 == 0) {
                if (n3 != 0) {
                    n4 = 0;
                } else {
                    return false;
                }
            }
            ((RecyclerView)this.a).ai();
            return ((RecyclerView)this.a).am(n4, n3, 0, Integer.MAX_VALUE);
        }
        if (f2 == 0.0f) {
            return false;
        }
        this.b();
        ViewGroup viewGroup = this.a;
        int n5 = (int)f2;
        ((NestedScrollView)viewGroup).i(n5);
        return true;
    }
}

