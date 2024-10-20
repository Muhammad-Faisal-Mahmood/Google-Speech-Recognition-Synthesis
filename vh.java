/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
import android.view.View;
import android.view.ViewParent;

public final class vh {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public vh(View view) {
        this.d = view;
    }

    private final ViewParent j(int n2) {
        if (n2 != 0) {
            return this.c;
        }
        return this.b;
    }

    private final void k(int n2, ViewParent viewParent) {
        if (n2 != 0) {
            this.c = viewParent;
            return;
        }
        this.b = viewParent;
    }

    private final int[] l() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final void a(boolean bl2) {
        if (this.a) {
            wa.m(this.d);
        }
        this.a = bl2;
    }

    public final void b(int n2) {
        ViewParent viewParent = this.j(n2);
        if (viewParent != null) {
            wa.r(viewParent, this.d, n2);
            this.k(n2, null);
        }
    }

    public final boolean c(float f2, float f3, boolean bl2) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return wa.s(viewParent, this.d, f2, f3, bl2);
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return wa.t(viewParent, this.d, f2, f3);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean e(int n2, int n3, int[] nArray, int[] nArray2, int n4) {
        int n5;
        int n6;
        if (!this.a) return false;
        ViewParent viewParent = this.j(n4);
        if (viewParent == null) {
            return false;
        }
        if (n2 == 0) {
            if (n3 == 0) {
                if (nArray2 == null) return false;
                nArray2[0] = 0;
                nArray2[1] = 0;
                return false;
            }
            n2 = 0;
        }
        if (nArray2 != null) {
            this.d.getLocationInWindow(nArray2);
            n6 = nArray2[0];
            n5 = nArray2[1];
        } else {
            nArray2 = null;
            n6 = 0;
            n5 = 0;
        }
        int[] nArray3 = nArray;
        if (nArray == null) {
            nArray3 = this.l();
        }
        nArray3[0] = 0;
        nArray3[1] = 0;
        wa.o(viewParent, this.d, n2, n3, nArray3, n4);
        if (nArray2 != null) {
            this.d.getLocationInWindow(nArray2);
            nArray2[0] = nArray2[0] - n6;
            nArray2[1] = nArray2[1] - n5;
        }
        if (nArray3[0] != 0) return true;
        if (nArray3[1] == 0) return false;
        return true;
    }

    public final boolean f(int n2, int n3, int n4, int n5, int[] nArray) {
        return this.g(n2, n3, n4, n5, nArray, 0, null);
    }

    public final boolean g(int n2, int n3, int n4, int n5, int[] nArray, int n6, int[] nArray2) {
        block6: {
            int n7;
            int n8;
            ViewParent viewParent;
            block7: {
                block8: {
                    block9: {
                        block10: {
                            if (!this.a) break block6;
                            viewParent = this.j(n6);
                            if (viewParent == null) {
                                return false;
                            }
                            if (n2 != 0) break block7;
                            if (n3 != 0) break block8;
                            if (n4 != 0) break block9;
                            if (n5 == 0) break block10;
                            n2 = 0;
                            n4 = n3 = 0;
                            break block7;
                        }
                        if (nArray != null) {
                            nArray[0] = 0;
                            nArray[1] = 0;
                        }
                        break block6;
                    }
                    n2 = 0;
                    n3 = 0;
                    break block7;
                }
                n2 = 0;
            }
            if (nArray != null) {
                this.d.getLocationInWindow(nArray);
                n8 = nArray[0];
                n7 = nArray[1];
            } else {
                nArray = null;
                n8 = 0;
                n7 = 0;
            }
            if (nArray2 == null) {
                nArray2 = this.l();
                nArray2[0] = 0;
                nArray2[1] = 0;
            }
            wa.p(viewParent, this.d, n2, n3, n4, n5, n6, nArray2);
            if (nArray != null) {
                this.d.getLocationInWindow(nArray);
                nArray[0] = nArray[0] - n8;
                nArray[1] = nArray[1] - n7;
            }
            return true;
        }
        return false;
    }

    public final boolean h(int n2) {
        return this.j(n2) != null;
    }

    public final boolean i(int n2, int n3) {
        if (!this.h(n3)) {
            if (this.a) {
                View view = this.d;
                for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                    if (wa.u(viewParent, view, this.d, n2, n3)) {
                        this.k(n3, viewParent);
                        wa.q(viewParent, view, this.d, n2, n3);
                        return true;
                    }
                    if (!(viewParent instanceof View)) continue;
                    view = (View)viewParent;
                }
            }
            return false;
        }
        return true;
    }
}

