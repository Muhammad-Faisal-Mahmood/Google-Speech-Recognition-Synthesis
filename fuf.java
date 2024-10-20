/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;

public final class fuf
extends ys {
    final BottomSheetBehavior a;

    public fuf(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override
    public final void c(int n2) {
        if (n2 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.v) {
                bottomSheetBehavior.M(1);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void d(View view, float f2, float f3) {
        int n2;
        block8: {
            block12: {
                int n3;
                int n4;
                BottomSheetBehavior bottomSheetBehavior;
                block14: {
                    block7: {
                        block13: {
                            block11: {
                                block9: {
                                    block10: {
                                        int n5;
                                        block6: {
                                            n2 = 6;
                                            if (!(f3 < 0.0f)) break block6;
                                            if (this.a.a) break block7;
                                            int n6 = view.getTop();
                                            System.currentTimeMillis();
                                            if (n6 <= this.a.p) break block7;
                                            break block8;
                                        }
                                        bottomSheetBehavior = this.a;
                                        if (!bottomSheetBehavior.t || !bottomSheetBehavior.P(view, f3)) break block9;
                                        if (!(Math.abs(f2) < Math.abs(f3) && f3 > (float)this.a.b) && (n5 = view.getTop()) <= (bottomSheetBehavior.z + (bottomSheetBehavior = this.a).G()) / 2) break block10;
                                        n2 = 5;
                                        break block8;
                                    }
                                    if (!this.a.a && Math.abs(view.getTop() - this.a.G()) >= Math.abs(view.getTop() - this.a.p)) break block8;
                                    break block7;
                                }
                                if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) break block11;
                                if (this.a.a) break block12;
                                int n7 = view.getTop();
                                bottomSheetBehavior = this.a;
                                if (Math.abs(n7 - bottomSheetBehavior.p) >= Math.abs(n7 - bottomSheetBehavior.r)) break block12;
                                break block8;
                            }
                            n4 = view.getTop();
                            bottomSheetBehavior = this.a;
                            if (!bottomSheetBehavior.a) break block13;
                            if (Math.abs(n4 - bottomSheetBehavior.o) >= Math.abs(n4 - bottomSheetBehavior.r)) break block12;
                            break block7;
                        }
                        n3 = bottomSheetBehavior.p;
                        if (n4 >= n3) break block14;
                        if (n4 >= Math.abs(n4 - bottomSheetBehavior.r)) break block8;
                    }
                    n2 = 3;
                    break block8;
                }
                if (Math.abs(n4 - n3) < Math.abs(n4 - bottomSheetBehavior.r)) break block8;
            }
            n2 = 4;
        }
        this.a.N(view, n2, true);
    }

    @Override
    public final boolean e(View view, int n2) {
        Object object = this.a;
        int n3 = ((BottomSheetBehavior)object).w;
        if (n3 == 1) {
            return false;
        }
        if (((BottomSheetBehavior)object).D) {
            return false;
        }
        if (n3 == 3 && ((BottomSheetBehavior)object).C == n2 && (object = (object = ((BottomSheetBehavior)object).B) != null ? (View)((Reference)object).get() : null) != null && object.canScrollVertically(-1)) {
            return false;
        }
        System.currentTimeMillis();
        object = this.a.A;
        return object != null && ((Reference)object).get() == view;
    }

    @Override
    public final int f(View view, int n2) {
        return view.getLeft();
    }

    @Override
    public final int g(View view, int n2) {
        return rw.z(n2, this.a.G(), ((ys)this).h());
    }

    @Override
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior.O()) {
            return bottomSheetBehavior.z;
        }
        return bottomSheetBehavior.r;
    }

    @Override
    public final void i(View view, int n2, int n3) {
        this.a.I(n3);
    }
}

