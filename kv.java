/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class kv {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final RecyclerView f;
    htf g;

    public kv(RecyclerView object) {
        this.f = object;
        this.a = object = new ArrayList();
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(object);
        this.e = 2;
    }

    public final int a(int n2) {
        if (n2 >= 0 && n2 < this.f.O.a()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.O.g) {
                return n2;
            }
            return recyclerView.g.a(n2);
        }
        StringBuilder stringBuilder = new StringBuilder("invalid position ");
        stringBuilder.append(n2);
        stringBuilder.append(". State item count is ");
        stringBuilder.append(this.f.O.a());
        stringBuilder.append(this.f.m());
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final View b(int n2) {
        return this.o((int)n2, (long)Long.MAX_VALUE).itemView;
    }

    final void c(lg lg2, boolean bl2) {
        int n2;
        RecyclerView.w(lg2);
        Object object = this.f;
        Object object2 = lg2.itemView;
        object = ((RecyclerView)object).S;
        if (object != null) {
            object = (object = ((li)object).j()) instanceof lh ? (us)((lh)object).b.remove(object2) : null;
            wj.m((View)object2, (us)object);
        }
        if (bl2) {
            int n3 = this.f.o.size();
            for (n2 = 0; n2 < n3; ++n2) {
                ((kw)this.f.o.get(n2)).a();
            }
            object = this.f.m;
            if (object != null) {
                ((kf)object).onViewRecycled(lg2);
            }
            object = this.f;
            if (((RecyclerView)object).O != null) {
                ((RecyclerView)object).aa.s(lg2);
            }
        }
        lg2.mBindingAdapter = null;
        lg2.mOwnerRecyclerView = null;
        object2 = this.p();
        n2 = lg2.getItemViewType();
        object = ((htf)object2).l((int)n2).a;
        n2 = ((ku)((SparseArray)((htf)object2).c).get((int)n2)).b;
        if (((ArrayList)object).size() >= 5) {
            wa.v(lg2.itemView);
            return;
        }
        lg2.resetInternal();
        ((ArrayList)object).add(lg2);
    }

    public final void d() {
        this.a.clear();
        this.h();
    }

    public final void e() {
        htf htf2 = this.g;
        if (htf2 != null) {
            RecyclerView recyclerView = this.f;
            kf kf2 = recyclerView.m;
            if (kf2 != null && recyclerView.s) {
                htf2.a.add(kf2);
            }
        }
    }

    public final void f(kf object, boolean bl2) {
        htf htf2 = this.g;
        if (htf2 != null) {
            htf2.a.remove(object);
            if (htf2.a.size() == 0 && !bl2) {
                for (int i2 = 0; i2 < ((SparseArray)htf2.c).size(); ++i2) {
                    object = (SparseArray)htf2.c;
                    object = ((ku)object.get((int)object.keyAt((int)i2))).a;
                    for (int i3 = 0; i3 < ((ArrayList)object).size(); ++i3) {
                        wa.v(((lg)((ArrayList)object).get((int)i3)).itemView);
                    }
                }
            }
        }
    }

    final void g(View object) {
        object = RecyclerView.j((View)object);
        ((lg)object).mScrapContainer = null;
        ((lg)object).mInChangeScrap = false;
        ((lg)object).clearReturnedFromScrapFlag();
        this.k((lg)object);
    }

    public final void h() {
        int n2 = this.c.size();
        while (--n2 >= 0) {
            this.i(n2);
        }
        this.c.clear();
        if (RecyclerView.b) {
            this.f.N.b();
        }
    }

    public final void i(int n2) {
        int n3 = RecyclerView.ab;
        this.c((lg)this.c.get(n2), true);
        this.c.remove(n2);
    }

    public final void j(View view) {
        lg lg2 = RecyclerView.j(view);
        if (lg2.isTmpDetached()) {
            this.f.removeDetachedView(view, false);
        }
        if (lg2.isScrap()) {
            lg2.unScrap();
        } else if (lg2.wasReturnedFromScrap()) {
            lg2.clearReturnedFromScrapFlag();
        }
        this.k(lg2);
        if (this.f.F != null && !lg2.isRecyclable()) {
            this.f.F.d(lg2);
        }
    }

    final void k(lg lg2) {
        boolean bl2 = lg2.isScrap();
        boolean bl3 = true;
        int n2 = 1;
        int n3 = 0;
        if (!bl2 && lg2.itemView.getParent() == null) {
            if (!lg2.isTmpDetached()) {
                if (!lg2.shouldIgnore()) {
                    int n4;
                    bl3 = lg2.doesTransientStatePreventRecycling();
                    kf kf2 = this.f.m;
                    if (!(kf2 != null && bl3 && kf2.onFailedToRecycleView(lg2) || lg2.isRecyclable())) {
                        n4 = 0;
                    } else {
                        if (this.e > 0 && !lg2.hasAnyOfTheFlags(526)) {
                            n4 = n3 = this.c.size();
                            if (n3 >= this.e) {
                                n4 = n3;
                                if (n3 > 0) {
                                    this.i(0);
                                    n4 = n3 - 1;
                                }
                            }
                            n3 = n4;
                            if (RecyclerView.b) {
                                n3 = n4;
                                if (n4 > 0) {
                                    n3 = n4;
                                    if (!this.f.N.d(lg2.mPosition)) {
                                        while ((n3 = n4 - 1) >= 0) {
                                            int n5 = ((lg)this.c.get((int)n3)).mPosition;
                                            n4 = n3;
                                            if (this.f.N.d(n5)) continue;
                                        }
                                        ++n3;
                                    }
                                }
                            }
                            this.c.add(n3, lg2);
                            n3 = 1;
                        } else {
                            n3 = 0;
                        }
                        if (n3 == 0) {
                            this.c(lg2, true);
                            n4 = n2;
                        } else {
                            n4 = 0;
                        }
                    }
                    this.f.aa.s(lg2);
                    if (n3 == 0 && n4 == 0 && bl3) {
                        wa.v(lg2.itemView);
                        lg2.mBindingAdapter = null;
                        lg2.mOwnerRecyclerView = null;
                    }
                    return;
                }
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f.m()));
            }
            StringBuilder stringBuilder = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            stringBuilder.append(lg2);
            stringBuilder.append(this.f.m());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        stringBuilder.append(lg2.isScrap());
        stringBuilder.append(" isAttached:");
        if (lg2.itemView.getParent() == null) {
            bl3 = false;
        }
        stringBuilder.append(bl3);
        stringBuilder.append(this.f.m());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final void l(View object) {
        kk kk2;
        if (!((lg)(object = RecyclerView.j((View)object))).hasAnyOfTheFlags(12) && ((lg)object).isUpdated() && (kk2 = this.f.F) != null && ((lg)object).getUnmodifiedPayloads().isEmpty() && kk2.a && !((lg)object).isInvalid()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            ((lg)object).setScrapContainer(this, true);
            this.b.add(object);
            return;
        }
        if (((lg)object).isInvalid() && !((lg)object).isRemoved() && !this.f.m.hasStableIds()) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(this.f.m()));
        }
        ((lg)object).setScrapContainer(this, false);
        this.a.add(object);
    }

    public final void m(lg lg2) {
        if (lg2.mInChangeScrap) {
            this.b.remove(lg2);
        } else {
            this.a.remove(lg2);
        }
        lg2.mScrapContainer = null;
        lg2.mInChangeScrap = false;
        lg2.clearReturnedFromScrapFlag();
    }

    public final void n() {
        ko ko2 = this.f.n;
        int n2 = ko2 != null ? ko2.z : 0;
        this.e = n2 + 2;
        n2 = this.c.size();
        while (--n2 >= 0 && this.c.size() > this.e) {
            this.i(n2);
        }
    }

    /*
     * Unable to fully structure code
     */
    final lg o(int var1_1, long var2_2) {
        block67: {
            block66: {
                block64: {
                    block62: {
                        block63: {
                            block69: {
                                block68: {
                                    block61: {
                                        if (var1_1 < 0 || var1_1 >= this.f.O.a()) break block67;
                                        if (!this.f.O.g) break block68;
                                        var13_3 = this.b;
                                        if (var13_3 == null || (var5_5 = var13_3.size()) == 0) ** GOTO lbl-1000
                                        for (var4_6 = 0; var4_6 < var5_5; ++var4_6) {
                                            var13_3 = (lg)this.b.get(var4_6);
                                            if (var13_3.wasReturnedFromScrap() || var13_3.getLayoutPosition() != var1_1) continue;
                                            var13_3.addFlags(32);
                                            break block61;
                                        }
                                        if (this.f.m.hasStableIds() && (var4_6 = this.f.g.a(var1_1)) > 0 && var4_6 < this.f.m.getItemCount()) {
                                            var8_7 = this.f.m.getItemId(var4_6);
                                            for (var4_6 = 0; var4_6 < var5_5; ++var4_6) {
                                                var13_3 = (lg)this.b.get(var4_6);
                                                if (var13_3.wasReturnedFromScrap() || var13_3.getItemId() != var8_7) continue;
                                                var13_3.addFlags(32);
                                                break;
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            var13_3 = null;
                                        }
                                    }
                                    if (var13_3 != null) {
                                        var4_6 = 1;
                                        var14_8 = var13_3;
                                    } else {
                                        var4_6 = 0;
                                        var14_8 = var13_3;
                                    }
                                    break block69;
                                }
                                var4_6 = 0;
                                var14_8 = null;
                            }
                            var5_5 = var4_6;
                            var13_3 = var14_8;
                            if (var14_8 != null) break block64;
                            var6_9 = this.a.size();
                            for (var5_5 = 0; var5_5 < var6_9; ++var5_5) {
                                var13_3 = (lg)this.a.get(var5_5);
                                if (var13_3.wasReturnedFromScrap() || var13_3.getLayoutPosition() != var1_1 || var13_3.isInvalid() || !this.f.O.g && var13_3.isRemoved()) continue;
                                var13_3.addFlags(32);
lbl38:
                                // 2 sources

                                while (true) {
                                    var14_8 = var13_3;
                                    break block62;
                                    break;
                                }
                            }
                            var14_8 = this.f.h;
                            var6_9 = var14_8.b.size();
                            for (var5_5 = 0; var5_5 < var6_9; ++var5_5) {
                                var13_3 = (View)var14_8.b.get(var5_5);
                                var15_10 = var14_8.e;
                                var15_10 = RecyclerView.j((View)var13_3);
                                if (var15_10.getLayoutPosition() != var1_1 || var15_10.isInvalid() || var15_10.isRemoved()) {
                                    continue;
                                }
                                break block63;
                            }
                            var13_3 = null;
                        }
                        if (var13_3 == null) ** GOTO lbl79
                        var15_10 = this.f;
                        var14_8 = RecyclerView.j((View)var13_3);
                        var15_10 = var15_10.h;
                        var5_5 = var15_10.e.r((View)var13_3);
                        if (var5_5 < 0) ** GOTO lbl76
                        if (!var15_10.a.f(var5_5)) ** GOTO lbl73
                        var15_10.a.b(var5_5);
                        var15_10.l((View)var13_3);
                        var5_5 = this.f.h.d((View)var13_3);
                        if (var5_5 != -1) {
                            this.f.h.i(var5_5);
                            this.l((View)var13_3);
                            var14_8.addFlags(8224);
                        } else {
                            var13_3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            var13_3.append(var14_8);
                            var13_3.append(this.f.m());
                            throw new IllegalStateException(var13_3.toString());
lbl73:
                            // 1 sources

                            Objects.toString(var13_3);
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(var13_3.toString()));
lbl76:
                            // 1 sources

                            Objects.toString(var13_3);
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(var13_3.toString()));
lbl79:
                            // 1 sources

                            var6_9 = this.c.size();
                            for (var5_5 = 0; var5_5 < var6_9; ++var5_5) {
                                var13_3 = (lg)this.c.get(var5_5);
                                if (var13_3.isInvalid() || var13_3.getLayoutPosition() != var1_1 || var13_3.isAttachedToTransitionOverlay()) continue;
                                this.c.remove(var5_5);
                                ** continue;
                            }
                            var14_8 = null;
                        }
                    }
                    var5_5 = var4_6;
                    var13_3 = var14_8;
                    if (var14_8 != null) {
                        if (var14_8.isRemoved()) {
                            if (this.f.O.g) {
                                while (true) {
                                    var5_5 = 1;
                                    var13_3 = var14_8;
                                    break block64;
                                    break;
                                }
                            }
                        } else {
                            var5_5 = var14_8.mPosition;
                            if (var5_5 < 0 || var5_5 >= this.f.m.getItemCount()) {
                                var13_3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                var13_3.append(var14_8);
                                var13_3.append(this.f.m());
                                throw new IndexOutOfBoundsException(var13_3.toString());
                            }
                            var13_3 = this.f;
                            if (!(var13_3.O.g == false && var13_3.m.getItemViewType(var14_8.mPosition) != var14_8.getItemViewType() || this.f.m.hasStableIds() != false && var14_8.getItemId() != this.f.m.getItemId(var14_8.mPosition))) ** continue;
                        }
                        var14_8.addFlags(4);
                        if (var14_8.isScrap()) {
                            this.f.removeDetachedView(var14_8.itemView, false);
                            var14_8.unScrap();
                        } else if (var14_8.wasReturnedFromScrap()) {
                            var14_8.clearReturnedFromScrapFlag();
                        }
                        this.k((lg)var14_8);
                        var13_3 = null;
                        var5_5 = var4_6;
                    }
                }
                var6_9 = var5_5;
                var14_8 = var13_3;
                if (var13_3 == null) {
                    var6_9 = this.f.g.a(var1_1);
                    if (var6_9 >= 0 && var6_9 < this.f.m.getItemCount()) {
                        var7_11 = this.f.m.getItemViewType(var6_9);
                        var4_6 = var5_5;
                        if (this.f.m.hasStableIds()) {
                            block65: {
                                var8_7 = this.f.m.getItemId(var6_9);
                                for (var4_6 = this.a.size() - 1; var4_6 >= 0; --var4_6) {
                                    var14_8 = (lg)this.a.get(var4_6);
                                    if (var14_8.getItemId() != var8_7 || var14_8.wasReturnedFromScrap()) continue;
                                    if (var7_11 == var14_8.getItemViewType()) {
                                        var14_8.addFlags(32);
                                        var13_3 = var14_8;
                                        if (var14_8.isRemoved()) {
                                            var13_3 = var14_8;
                                            if (!this.f.O.g) {
                                                var14_8.setFlags(2, 14);
                                                var13_3 = var14_8;
                                            }
                                        }
lbl139:
                                        // 6 sources

                                        while (true) {
                                            var14_8 = var13_3;
                                            break block65;
                                            break;
                                        }
                                    }
                                    this.a.remove(var4_6);
                                    this.f.removeDetachedView(var14_8.itemView, false);
                                    this.g(var14_8.itemView);
                                }
                                for (var4_6 = this.c.size() - 1; var4_6 >= 0; --var4_6) {
                                    var13_3 = (lg)this.c.get(var4_6);
                                    if (var13_3.getItemId() != var8_7 || var13_3.isAttachedToTransitionOverlay()) continue;
                                    if (var7_11 == var13_3.getItemViewType()) {
                                        this.c.remove(var4_6);
                                        ** continue;
                                    }
                                    this.i(var4_6);
                                    break;
                                }
                                var14_8 = null;
                            }
                            var4_6 = var5_5;
                            var13_3 = var14_8;
                            if (var14_8 != null) {
                                var14_8.mPosition = var6_9;
                                var4_6 = 1;
                                var13_3 = var14_8;
                            }
                        }
                        var15_10 = var13_3;
                        if (var13_3 == null) {
                            var13_3 = (ku)((SparseArray)this.p().c).get(var7_11);
                            if (var13_3 != null && !var13_3.a.isEmpty()) {
                                var13_3 = var13_3.a;
                                for (var5_5 = var13_3.size() - 1; var5_5 >= 0; --var5_5) {
                                    if (((lg)var13_3.get(var5_5)).isAttachedToTransitionOverlay()) continue;
                                    var13_3 = (lg)var13_3.remove(var5_5);
                                    break;
                                }
                            } else {
                                var13_3 = null;
                            }
                            if (var13_3 != null) {
                                var13_3.resetInternal();
                            }
                            var15_10 = var13_3;
                        }
                        var6_9 = var4_6;
                        var14_8 = var15_10;
                        if (var15_10 == null) {
                            var8_7 = RecyclerView.as();
                            if (var2_2 != 0x7FFFFFFFFFFFFFFFL && (var10_12 = this.g.l((int)var7_11).c) != 0L && var10_12 + var8_7 >= var2_2) {
                                return null;
                            }
                            var13_3 = this.f;
                            var14_8 = var13_3.m.createViewHolder((ViewGroup)var13_3, var7_11);
                            if (RecyclerView.b && (var13_3 = RecyclerView.k(var14_8.itemView)) != null) {
                                var14_8.mNestedRecyclerView = new WeakReference<Object>(var13_3);
                            }
                            var10_12 = RecyclerView.as();
                            var13_3 = this.g.l(var7_11);
                            var13_3.c = htf.m(var13_3.c, var10_12 - var8_7);
                            var6_9 = var4_6;
                        }
                    } else {
                        var13_3 = new StringBuilder("Inconsistency detected. Invalid item position ");
                        var13_3.append(var1_1);
                        var13_3.append("(offset:");
                        var13_3.append(var6_9);
                        var13_3.append(").state:");
                        var13_3.append(this.f.O.a());
                        var13_3.append(this.f.m());
                        throw new IndexOutOfBoundsException(var13_3.toString());
                    }
                }
                if (var6_9 != 0 && !this.f.O.g && var14_8.hasAnyOfTheFlags(8192)) {
                    var14_8.setFlags(0, 8192);
                    if (this.f.O.j) {
                        kk.j((lg)var14_8);
                        var14_8.getUnmodifiedPayloads();
                        var13_3 = kk.k((lg)var14_8);
                        this.f.ax((lg)var14_8, (bvl)var13_3);
                    }
                }
                if (this.f.O.g && var14_8.isBound()) {
                    var14_8.mPreLayoutPosition = var1_1;
lbl216:
                    // 3 sources

                    while (true) {
                        var1_1 = 0;
                        break block66;
                        break;
                    }
                }
                if (var14_8.isBound() && !var14_8.needsUpdate() && !var14_8.isInvalid()) ** GOTO lbl216
                var5_5 = this.f.g.a(var1_1);
                var14_8.mBindingAdapter = null;
                var14_8.mOwnerRecyclerView = this.f;
                var4_6 = var14_8.getItemViewType();
                var8_7 = RecyclerView.as();
                if (var2_2 == 0x7FFFFFFFFFFFFFFFL || (var10_12 = this.g.l((int)var4_6).d) == 0L || var10_12 + var8_7 < var2_2) ** break;
                ** while (true)
                if (var14_8.isTmpDetached()) {
                    var13_3 = this.f;
                    RecyclerView.p((RecyclerView)var13_3, var14_8.itemView, var13_3.getChildCount(), var14_8.itemView.getLayoutParams());
                    var4_6 = 1;
                } else {
                    var4_6 = 0;
                }
                this.f.m.bindViewHolder((lg)var14_8, var5_5);
                if (var4_6 != 0) {
                    RecyclerView.q(this.f, var14_8.itemView);
                }
                var2_2 = RecyclerView.as();
                var13_3 = this.g.l(var14_8.getItemViewType());
                var13_3.d = htf.m(var13_3.d, var2_2 - var8_7);
                if (this.f.ao()) {
                    var13_3 = var14_8.itemView;
                    if (var13_3.getImportantForAccessibility() == 0) {
                        var13_3.setImportantForAccessibility(1);
                    }
                    if ((var15_10 = this.f.S) != null) {
                        var16_13 = var15_10.j();
                        if (var16_13 instanceof lh) {
                            var15_10 = (lh)var16_13;
                            var17_14 = wj.b((View)var13_3);
                            if (var17_14 != null && var17_14 != var15_10) {
                                var15_10.b.put(var13_3, var17_14);
                            }
                        }
                        wj.m((View)var13_3, var16_13);
                    }
                }
                if (this.f.O.g) {
                    var14_8.mPreLayoutPosition = var1_1;
                }
                var1_1 = 1;
            }
            var12_15 = true;
            var13_3 = var14_8.itemView.getLayoutParams();
            if (var13_3 == null) {
                var13_3 = this.f.generateDefaultLayoutParams();
                var14_8.itemView.setLayoutParams((ViewGroup.LayoutParams)var13_3);
            } else if (!this.f.checkLayoutParams((ViewGroup.LayoutParams)var13_3)) {
                var13_3 = this.f.generateLayoutParams((ViewGroup.LayoutParams)var13_3);
                var14_8.itemView.setLayoutParams((ViewGroup.LayoutParams)var13_3);
            } else {
                var13_3 = (kp)var13_3;
            }
            var13_3 = (kp)var13_3;
            var13_3.c = var14_8;
            if (var6_9 == 0 || var1_1 == 0) {
                var12_15 = false;
            }
            var13_3.f = var12_15;
            return var14_8;
        }
        var13_4 = new StringBuilder("Invalid item position ");
        var13_4.append(var1_1);
        var13_4.append("(");
        var13_4.append(var1_1);
        var13_4.append("). Item count:");
        var13_4.append(this.f.O.a());
        var13_4.append(this.f.m());
        throw new IndexOutOfBoundsException(var13_4.toString());
    }

    public final htf p() {
        if (this.g == null) {
            this.g = new htf(null);
            this.e();
        }
        return this.g;
    }
}

