/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

public final class lr {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final StaggeredGridLayoutManager f;

    public lr(StaggeredGridLayoutManager staggeredGridLayoutManager, int n2) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = n2;
    }

    public static final lo n(View view) {
        return (lo)view.getLayoutParams();
    }

    public final int a() {
        int n2 = this.f.d ? this.m(this.a.size() - 1, -1) : this.m(0, this.a.size());
        return n2;
    }

    public final int b() {
        int n2 = this.f.d ? this.m(0, this.a.size()) : this.m(this.a.size() - 1, -1);
        return n2;
    }

    public final int c() {
        int n2 = this.c;
        if (n2 != Integer.MIN_VALUE) {
            return n2;
        }
        this.h();
        return this.c;
    }

    public final int d(int n2) {
        int n3 = this.c;
        if (n3 != Integer.MIN_VALUE) {
            return n3;
        }
        if (this.a.size() == 0) {
            return n2;
        }
        this.h();
        return this.c;
    }

    public final int e() {
        int n2 = this.b;
        if (n2 != Integer.MIN_VALUE) {
            return n2;
        }
        this.i();
        return this.b;
    }

    public final int f(int n2) {
        int n3 = this.b;
        if (n3 != Integer.MIN_VALUE) {
            return n3;
        }
        if (this.a.size() == 0) {
            return n2;
        }
        this.i();
        return this.b;
    }

    public final View g(int n2, int n3) {
        View view;
        block9: {
            view = null;
            View view2 = null;
            if (n3 == -1) {
                int n4 = this.a.size();
                n3 = 0;
                while (true) {
                    view = view2;
                    if (n3 >= n4) break block9;
                    View view3 = (View)this.a.get(n3);
                    if (this.f.d) {
                        view = view2;
                        if (StaggeredGridLayoutManager.bk(view3) <= n2) break block9;
                    }
                    if (!this.f.d) {
                        view = view2;
                        if (StaggeredGridLayoutManager.bk(view3) >= n2) break block9;
                    }
                    view = view2;
                    if (view3.hasFocusable()) {
                        ++n3;
                        view2 = view3;
                        continue;
                    }
                    break block9;
                    break;
                }
            }
            n3 = this.a.size() - 1;
            view2 = view;
            while (true) {
                view = view2;
                if (n3 < 0) break;
                View view4 = (View)this.a.get(n3);
                if (this.f.d) {
                    view = view2;
                    if (StaggeredGridLayoutManager.bk(view4) >= n2) break;
                }
                if (!this.f.d) {
                    view = view2;
                    if (StaggeredGridLayoutManager.bk(view4) <= n2) break;
                }
                view = view2;
                if (!view4.hasFocusable()) break;
                --n3;
                view2 = view4;
            }
        }
        return view;
    }

    final void h() {
        ArrayList arrayList = this.a;
        arrayList = (View)arrayList.get(arrayList.size() - 1);
        lo lo2 = lr.n((View)arrayList);
        this.c = this.f.b.a((View)arrayList);
        boolean bl2 = lo2.b;
    }

    final void i() {
        View view = (View)this.a.get(0);
        lo lo2 = lr.n(view);
        this.b = this.f.b.d(view);
        boolean bl2 = lo2.b;
    }

    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void k(int n2) {
        int n3 = this.b;
        if (n3 != Integer.MIN_VALUE) {
            this.b = n3 + n2;
        }
        if ((n3 = this.c) != Integer.MIN_VALUE) {
            this.c = n3 + n2;
        }
    }

    public final void l(int n2) {
        this.b = n2;
        this.c = n2;
    }

    final int m(int n2, int n3) {
        int n4;
        int n5 = this.f.b.j();
        int n6 = this.f.b.f();
        int n7 = n2;
        while (true) {
            int n8;
            n4 = n8 = -1;
            if (n7 == n3) break;
            View view = (View)this.a.get(n7);
            int n9 = this.f.b.d(view);
            int n10 = this.f.b.a(view);
            boolean bl2 = false;
            n4 = n9 <= n6 ? 1 : 0;
            if (n10 >= n5) {
                bl2 = true;
            }
            if (n4 != 0 && bl2 && (n9 < n5 || n10 > n6)) {
                n4 = StaggeredGridLayoutManager.bk(view);
                break;
            }
            if (n3 > n2) {
                n8 = 1;
            }
            n7 += n8;
        }
        return n4;
    }
}

