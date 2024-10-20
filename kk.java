/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.view.View
 */
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public final class kk {
    private static TimeInterpolator o;
    boolean a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    ArrayList k;
    public ArrayList l;
    public AmbientMode$AmbientController m = null;
    private final ArrayList n = new ArrayList();

    public kk() {
    }

    public kk(byte[] byArray) {
        this.a = true;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public static void i(List list) {
        int n2 = list.size();
        while (--n2 >= 0) {
            ((lg)list.get((int)n2)).itemView.animate().cancel();
        }
    }

    public static void j(lg lg2) {
        int n2 = lg2.mFlags;
        if (!lg2.isInvalid() && (n2 & 4) == 0) {
            lg2.getOldPosition();
            lg2.getAbsoluteAdapterPosition();
        }
    }

    public static final bvl k(lg lg2) {
        bvl bvl2 = new bvl();
        bvl2.d(lg2);
        return bvl2;
    }

    private final void m(List list, lg lg2) {
        int n2;
        int n3 = list.size();
        while ((n2 = n3 - 1) >= 0) {
            iu iu2 = (iu)list.get(n2);
            n3 = n2;
            if (!this.o(iu2, lg2)) continue;
            n3 = n2;
            if (iu2.a != null) continue;
            n3 = n2;
            if (iu2.b != null) continue;
            list.remove(iu2);
            n3 = n2;
        }
    }

    private final void n(iu iu2) {
        lg lg2 = iu2.a;
        if (lg2 != null) {
            this.o(iu2, lg2);
        }
        if ((lg2 = iu2.b) != null) {
            this.o(iu2, lg2);
        }
    }

    private final boolean o(iu iu2, lg lg2) {
        block4: {
            block3: {
                block2: {
                    if (iu2.b != lg2) break block2;
                    iu2.b = null;
                    break block3;
                }
                if (iu2.a != lg2) break block4;
                iu2.a = null;
            }
            lg2.itemView.setAlpha(1.0f);
            lg2.itemView.setTranslationX(0.0f);
            lg2.itemView.setTranslationY(0.0f);
            this.a(lg2);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(lg lg2) {
        Object object = this.m;
        if (object != null) {
            boolean bl2 = true;
            lg2.setIsRecyclable(true);
            if (lg2.mShadowedHolder != null && lg2.mShadowingHolder == null) {
                lg2.mShadowedHolder = null;
            }
            lg2.mShadowingHolder = null;
            if (!lg2.shouldBeKeptAsChild()) {
                Object object2;
                RecyclerView recyclerView;
                View view;
                block14: {
                    block15: {
                        view = lg2.itemView;
                        recyclerView = (RecyclerView)((AmbientMode$AmbientController)object).a;
                        recyclerView.af();
                        object2 = recyclerView.h;
                        int n2 = ((in)object2).c;
                        if (n2 == 1) {
                            if (((in)object2).d != view) {
                                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                            }
                        } else {
                            if (n2 == 2) {
                                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                            }
                            try {
                                ((in)object2).c = 2;
                                n2 = ((in)object2).e.r(view);
                                if (n2 == -1) {
                                    ((in)object2).l(view);
                                    break block14;
                                }
                                if (!((in)object2).a.f(n2)) break block15;
                                ((in)object2).a.g(n2);
                                ((in)object2).l(view);
                                ((in)object2).e.u(n2);
                                break block14;
                            }
                            finally {
                                ((in)object2).c = 0;
                            }
                        }
                    }
                    bl2 = false;
                }
                if (bl2) {
                    object2 = RecyclerView.j(view);
                    recyclerView.e.m((lg)object2);
                    recyclerView.e.k((lg)object2);
                }
                recyclerView.ag(bl2 ^ true);
                if (!bl2 && lg2.isTmpDetached()) {
                    object = ((AmbientMode$AmbientController)object).a;
                    lg2 = lg2.itemView;
                    ((RecyclerView)object).removeDetachedView((View)lg2, false);
                    return;
                }
            }
        }
    }

    public final void b() {
        int n2 = this.n.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((kj)this.n.get(i2)).a();
        }
        this.n.clear();
    }

    public final void c() {
        if (!this.h()) {
            this.b();
        }
    }

    public final void d(lg lg2) {
        ArrayList arrayList;
        int n2;
        View view = lg2.itemView;
        view.animate().cancel();
        int n3 = this.d.size();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (((iv)this.d.get((int)n2)).a != lg2) continue;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            this.a(lg2);
            this.d.remove(n2);
            n3 = n2;
        }
        this.m(this.e, lg2);
        if (this.b.remove(lg2)) {
            view.setAlpha(1.0f);
            this.a(lg2);
        }
        if (this.c.remove(lg2)) {
            view.setAlpha(1.0f);
            this.a(lg2);
        }
        n3 = this.h.size();
        while (--n3 >= 0) {
            arrayList = (ArrayList)this.h.get(n3);
            this.m(arrayList, lg2);
            if (!arrayList.isEmpty()) continue;
            this.h.remove(n3);
        }
        n3 = this.g.size();
        while ((n2 = n3 - 1) >= 0) {
            arrayList = (ArrayList)this.g.get(n2);
            n3 = arrayList.size();
            while (--n3 >= 0) {
                if (((iv)arrayList.get((int)n3)).a != lg2) continue;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.a(lg2);
                arrayList.remove(n3);
                if (!arrayList.isEmpty()) break;
                this.g.remove(n2);
                break;
            }
            n3 = n2;
        }
        n3 = this.f.size();
        while (--n3 >= 0) {
            arrayList = (ArrayList)this.f.get(n3);
            if (!arrayList.remove(lg2)) continue;
            view.setAlpha(1.0f);
            this.a(lg2);
            if (!arrayList.isEmpty()) continue;
            this.f.remove(n3);
        }
        this.k.remove(lg2);
        this.i.remove(lg2);
        this.l.remove(lg2);
        this.j.remove(lg2);
        this.c();
    }

    public final void e() {
        int n2;
        Object object;
        Object object2;
        int n3 = this.d.size();
        while (--n3 >= 0) {
            object2 = (iv)this.d.get(n3);
            object = ((iv)object2).a.itemView;
            object.setTranslationY(0.0f);
            object.setTranslationX(0.0f);
            this.a(((iv)object2).a);
            this.d.remove(n3);
        }
        n3 = this.b.size();
        while (--n3 >= 0) {
            this.a((lg)this.b.get(n3));
            this.b.remove(n3);
        }
        n3 = this.c.size();
        while (--n3 >= 0) {
            object = (lg)this.c.get(n3);
            ((lg)object).itemView.setAlpha(1.0f);
            this.a((lg)object);
            this.c.remove(n3);
        }
        n3 = this.e.size();
        while (--n3 >= 0) {
            this.n((iu)this.e.get(n3));
        }
        this.e.clear();
        if (!this.h()) {
            return;
        }
        n3 = this.g.size();
        while ((n2 = n3 - 1) >= 0) {
            object = (ArrayList)this.g.get(n2);
            n3 = ((ArrayList)object).size();
            while (--n3 >= 0) {
                object2 = (iv)((ArrayList)object).get(n3);
                View view = ((iv)object2).a.itemView;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.a(((iv)object2).a);
                ((ArrayList)object).remove(n3);
                if (!((ArrayList)object).isEmpty()) continue;
                this.g.remove(object);
            }
            n3 = n2;
        }
        n3 = this.f.size();
        while ((n2 = n3 - 1) >= 0) {
            object2 = (ArrayList)this.f.get(n2);
            n3 = ((ArrayList)object2).size();
            while (--n3 >= 0) {
                object = (lg)((ArrayList)object2).get(n3);
                ((lg)object).itemView.setAlpha(1.0f);
                this.a((lg)object);
                ((ArrayList)object2).remove(n3);
                if (!((ArrayList)object2).isEmpty()) continue;
                this.f.remove(object2);
            }
            n3 = n2;
        }
        n3 = this.h.size();
        while ((n2 = n3 - 1) >= 0) {
            object = (ArrayList)this.h.get(n2);
            n3 = ((ArrayList)object).size();
            while (--n3 >= 0) {
                this.n((iu)((ArrayList)object).get(n3));
                if (!((ArrayList)object).isEmpty()) continue;
                this.h.remove(object);
            }
            n3 = n2;
        }
        kk.i(this.k);
        kk.i(this.j);
        kk.i(this.i);
        kk.i(this.l);
        this.b();
    }

    public final void f(lg lg2) {
        if (o == null) {
            o = new ValueAnimator().getInterpolator();
        }
        lg2.itemView.animate().setInterpolator(o);
        this.d(lg2);
    }

    public final boolean g(lg lg2, int n2, int n3, int n4, int n5) {
        View view = lg2.itemView;
        int n6 = (int)view.getTranslationX();
        int n7 = (int)lg2.itemView.getTranslationY();
        this.f(lg2);
        int n8 = n2 + n6;
        n6 = n4 - n8;
        n3 += n7;
        n7 = n5 - n3;
        n2 = n6;
        if (n6 == 0) {
            n2 = 0;
            if (n7 == 0) {
                this.a(lg2);
                return false;
            }
        }
        if (n2 != 0) {
            view.setTranslationX((float)(-n2));
        }
        if (n7 != 0) {
            view.setTranslationY((float)(-n7));
        }
        this.d.add(new iv(lg2, n8, n3, n4, n5));
        return true;
    }

    public final boolean h() {
        return !this.c.isEmpty() || !this.e.isEmpty() || !this.d.isEmpty() || !this.b.isEmpty() || !this.j.isEmpty() || !this.k.isEmpty() || !this.i.isEmpty() || !this.l.isEmpty() || !this.g.isEmpty() || !this.f.isEmpty() || !this.h.isEmpty();
        {
        }
    }

    public final boolean l(lg lg2, lg lg3, bvl bvl2, bvl bvl3) {
        boolean bl2;
        int n2;
        int n3;
        int n4 = bvl2.b;
        int n5 = bvl2.a;
        if (lg3.shouldIgnore()) {
            n3 = bvl2.b;
            n2 = bvl2.a;
        } else {
            n3 = bvl3.b;
            n2 = bvl3.a;
        }
        if (lg2 == lg3) {
            bl2 = this.g(lg2, n4, n5, n3, n2);
        } else {
            float f2 = lg2.itemView.getTranslationX();
            float f3 = lg2.itemView.getTranslationY();
            float f4 = lg2.itemView.getAlpha();
            this.f(lg2);
            float f5 = n3 - n4;
            float f6 = n2 - n5;
            lg2.itemView.setTranslationX(f2);
            lg2.itemView.setTranslationY(f3);
            lg2.itemView.setAlpha(f4);
            if (lg3 != null) {
                int n6 = (int)(f6 - f3);
                int n7 = (int)(f5 - f2);
                this.f(lg3);
                lg3.itemView.setTranslationX((float)(-n7));
                lg3.itemView.setTranslationY((float)(-n6));
                lg3.itemView.setAlpha(0.0f);
            }
            this.e.add(new iu(lg2, lg3, n4, n5, n3, n2));
            bl2 = true;
        }
        return bl2;
    }
}

