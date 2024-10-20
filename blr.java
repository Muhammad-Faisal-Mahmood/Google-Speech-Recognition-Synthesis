/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import j$.util.Objects;

public final class blr
extends kr {
    public final Context d;
    public RecyclerView e;
    private kc f;
    private kc g;

    public blr(Context context) {
        this.d = context;
    }

    public static float h(View view, kc kc2) {
        int n2 = kc2.j();
        int n3 = kc2.f();
        int n4 = kc2.d(view);
        int n5 = kc2.a(view);
        if (n4 >= n2 && n5 <= n3) {
            return 1.0f;
        }
        if (n5 <= n2) {
            return 0.0f;
        }
        if (n4 >= n3) {
            return 0.0f;
        }
        if (n4 <= n2 && n5 >= n3) {
            float f2 = n2;
            float f3 = kc2.b(view);
            return ((float)n3 - f2) / f3;
        }
        if (n4 < n2) {
            float f4 = n5;
            float f5 = kc2.b(view);
            return (f4 - (float)n2) / f5;
        }
        float f6 = n3;
        float f7 = kc2.b(view);
        return (f6 - (float)n4) / f7;
    }

    private static int k(int n2, int n3, int n4) {
        return Math.max(n3, Math.min(n4, n2));
    }

    private static int l(View view, kc kc2) {
        return kc2.d(view) - kc2.j();
    }

    private final kc m(ko ko2) {
        kc kc2 = this.g;
        if (kc2 == null || kc2.a != ko2) {
            this.g = new ka(ko2);
        }
        return this.g;
    }

    private final kc n(ko ko2) {
        kc kc2 = this.f;
        if (kc2 == null || kc2.a != ko2) {
            this.f = new kb(ko2);
        }
        return this.f;
    }

    private static boolean o(View view, kc kc2) {
        return kc2.b(view) <= kc2.k();
    }

    @Override
    public final int[] b(int n2, int n3) {
        int[] nArray = super.b(n2, n3);
        Object object = this.e;
        if (object != null && (object = ((RecyclerView)object).n) != null && ((ko)object).ao() != 0) {
            n2 = this.j((ko)object) ? 0 : ((ko)object).ao() - 1;
            View view = Objects.requireNonNull(((ko)object).aA(n2));
            float f2 = blr.h(view, this.i((ko)object));
            n2 = n3 = ((ko)object).E;
            if (f2 > 0.0f) {
                n2 = n3 - ko.bg(view);
            }
            int n4 = nArray[0];
            n3 = -n2;
            nArray[0] = blr.k(n4, n3, n2);
            nArray[1] = blr.k(nArray[1], n3, n2);
        }
        return nArray;
    }

    @Override
    public final View d(ko object) {
        int n2 = ((ko)object).ao();
        if (n2 == 0) {
            return null;
        }
        kc kc2 = this.i((ko)object);
        boolean bl2 = true;
        int n3 = 0;
        if (n2 == 1) {
            if (blr.o((View)(object = ((ko)object).aA(0)), kc2)) {
                return object;
            }
            return null;
        }
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            return null;
        }
        if ((recyclerView = recyclerView.getChildAt(0)).getHeight() > this.e.getHeight() && kc2.d((View)recyclerView) < 0 && (float)kc2.a((View)recyclerView) > (float)this.e.getHeight() * 0.3f) {
            return null;
        }
        View view = Objects.requireNonNull(((ko)object).aA(n2 - 1));
        if (ko.bk(view) != ((ko)object).aq() - 1) {
            bl2 = false;
        }
        float f2 = 0.0f;
        float f3 = bl2 ? blr.h(view, kc2) : 0.0f;
        int n4 = Integer.MAX_VALUE;
        recyclerView = null;
        while (n3 < n2) {
            View view2 = ((ko)object).aA(n3);
            int n5 = kc2.d(view2);
            float f4 = f2;
            int n6 = n4;
            RecyclerView recyclerView2 = recyclerView;
            if (Math.abs(n5) < n4) {
                float f5 = blr.h(view2, kc2);
                f4 = f2;
                n6 = n4;
                recyclerView2 = recyclerView;
                if (f5 > 0.5f) {
                    f4 = f2;
                    n6 = n4;
                    recyclerView2 = recyclerView;
                    if (f5 > f2) {
                        recyclerView2 = view2;
                        n6 = n5;
                        f4 = f5;
                    }
                }
            }
            ++n3;
            f2 = f4;
            n4 = n6;
            recyclerView = recyclerView2;
        }
        object = view;
        if (recyclerView != null) {
            object = bl2 && f3 > f2 ? view : recyclerView;
        }
        if (blr.o((View)object, kc2)) {
            return object;
        }
        return null;
    }

    @Override
    public final int[] e(ko ko2, View view) {
        int[] nArray = new int[2];
        if (this.e.isInTouchMode()) {
            if (ko2.Y()) {
                nArray[0] = blr.l(view, this.m(ko2));
            }
            if (ko2.Z()) {
                nArray[1] = blr.l(view, this.n(ko2));
            }
        }
        return nArray;
    }

    public final kc i(ko object) {
        object = ((ko)object).Z() ? this.n((ko)object) : this.m((ko)object);
        return object;
    }

    public final boolean j(ko ko2) {
        if (ko2 != null && ko2.ao() != 0) {
            int n2 = ko2.ao();
            kc kc2 = this.i(ko2);
            View view = Objects.requireNonNull(ko2.aA(n2 - 1));
            return ko.bk(view) == ko2.aq() - 1 && ko.be(view) <= kc2.f();
        }
        return true;
    }
}

