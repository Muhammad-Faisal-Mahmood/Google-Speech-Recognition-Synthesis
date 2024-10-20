/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.Scroller
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Scroller;

public class kr {
    public RecyclerView a;
    public Scroller b;
    public final kt c = new lm(this);
    private kc d;
    private kc e;

    private static int h(View view, kc kc2) {
        return kc2.d(view) + kc2.b(view) / 2 - (kc2.j() + kc2.k() / 2);
    }

    private static View i(ko ko2, kc kc2) {
        int n2 = ko2.ao();
        View view = null;
        if (n2 == 0) {
            return null;
        }
        int n3 = kc2.j();
        int n4 = kc2.k() / 2;
        int n5 = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < n2; ++i2) {
            View view2 = ko2.aA(i2);
            int n6 = Math.abs(kc2.d(view2) + kc2.b(view2) / 2 - (n3 + n4));
            int n7 = n6 < n5 ? n6 : n5;
            if (n6 < n5) {
                view = view2;
            }
            n5 = n7;
        }
        return view;
    }

    public final void a() {
        block2: {
            Object object;
            Object object2;
            block3: {
                ko ko2;
                object2 = this.a;
                if (object2 == null || (ko2 = ((RecyclerView)object2).n) == null || (object2 = this.d(ko2)) == null) break block2;
                object2 = this.e(ko2, (View)object2);
                boolean bl2 = false;
                object = object2[0];
                if (object != false) break block3;
                if (object2[1] == false) break block2;
                object = bl2;
            }
            this.a.au((int)object, (int)object2[1]);
        }
    }

    public int[] b(int n2, int n3) {
        this.b.fling(0, 0, n2, n3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public final int c(ko ko2, kc kc2, int n2, int n3) {
        float f2;
        int[] nArray = this.b(n2, n3);
        int n4 = ko2.ao();
        int n5 = 1;
        float f3 = 1.0f;
        if (n4 == 0) {
            f2 = f3;
        } else {
            int n6;
            View view = null;
            n2 = Integer.MAX_VALUE;
            n3 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i2 = 0; i2 < n4; ++i2) {
                View view3 = ko2.aA(i2);
                int n7 = ko.bk(view3);
                if (n7 == -1) {
                    n6 = n2;
                } else {
                    n6 = n7 < n2 ? n7 : n2;
                    if (n7 < n2) {
                        view = view3;
                    }
                    n2 = n3;
                    if (n7 > n3) {
                        view2 = view3;
                        n2 = n7;
                    }
                    n3 = n2;
                }
                n2 = n6;
            }
            f2 = f3;
            if (view != null) {
                if (view2 == null) {
                    f2 = f3;
                } else {
                    n6 = Math.min(kc2.d(view), kc2.d(view2));
                    n6 = Math.max(kc2.a(view), kc2.a(view2)) - n6;
                    f2 = n6 == 0 ? f3 : (float)n6 / (float)(n3 - n2 + 1);
                }
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        n2 = n5;
        if (Math.abs(nArray[0]) > Math.abs(nArray[1])) {
            n2 = 0;
        }
        return Math.round((float)nArray[n2] / f2);
    }

    public View d(ko ko2) {
        if (ko2.Z()) {
            return kr.i(ko2, this.g(ko2));
        }
        if (ko2.Y()) {
            return kr.i(ko2, this.f(ko2));
        }
        return null;
    }

    public int[] e(ko ko2, View view) {
        int[] nArray = new int[]{ko2.Y() ? kr.h(view, this.f(ko2)) : 0, ko2.Z() ? kr.h(view, this.g(ko2)) : 0};
        return nArray;
    }

    public final kc f(ko ko2) {
        kc kc2 = this.e;
        if (kc2 == null || kc2.a != ko2) {
            this.e = new ka(ko2);
        }
        return this.e;
    }

    public final kc g(ko ko2) {
        kc kc2 = this.d;
        if (kc2 == null || kc2.a != ko2) {
            this.d = new kb(ko2);
        }
        return this.d;
    }
}

