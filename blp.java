/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnGenericMotionListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.CarUiRecyclerViewContainer;
import com.android.car.ui.recyclerview.DefaultScrollBar;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class blp
extends FrameLayout
implements CarUiRecyclerView,
boe,
bkt {
    public static final int d = 0;
    private static final Class[] e;
    public final RecyclerView a;
    public final Set b;
    public DefaultScrollBar c;
    private kf f;
    private final bny g = new blo(this);
    private final bnz h;
    private final boolean i;
    private String j;
    private final int k;
    private final int l;
    private final bmc m;
    private final kl n;
    private int o;
    private final boolean p;
    private final boolean q;
    private bld r;

    static {
        Class<Integer> clazz = Integer.TYPE;
        e = new Class[]{Context.class, AttributeSet.class, clazz, clazz};
    }

    public blp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View view;
        Object object;
        int n2;
        boolean bl2;
        this.b = new HashSet();
        new ArrayList();
        this.h = bnz.b(context);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, bjm.c, 0, 0);
        this.i = bl2 = context.getResources().getBoolean(2131034129);
        int n3 = typedArray.getInt(1, 2);
        int n4 = n2 = 2131624012;
        if (bl2) {
            n4 = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? n2 : 2131624009) : 2131624011) : 2131624014;
        }
        this.a = (object = (ViewGroup)bnv.i(view = LayoutInflater.from((Context)context).inflate(n4, (ViewGroup)this, true), 2131427505)) instanceof CarUiRecyclerViewContainer ? (RecyclerView)object.getChildAt(0) : (RecyclerView)object;
        if (Build.VERSION.SDK_INT <= 32 && Build.VERSION.SDK_INT >= 29) {
            this.a.setVerticalScrollBarEnabled(this.isVerticalScrollBarEnabled());
            this.setVerticalScrollBarEnabled(false);
            this.a.setHorizontalScrollBarEnabled(this.isHorizontalScrollBarEnabled());
            this.setHorizontalScrollBarEnabled(false);
            this.a.setVerticalScrollbarThumbDrawable(dp$$ExternalSyntheticApiModelOutline0.m(this));
            this.a.setHorizontalScrollbarThumbDrawable(dp$$ExternalSyntheticApiModelOutline0.m$1(this));
            this.a.setVerticalScrollbarTrackDrawable(dp$$ExternalSyntheticApiModelOutline0.m$2(this));
            this.a.setHorizontalScrollbarTrackDrawable(dp$$ExternalSyntheticApiModelOutline0.m$3(this));
            this.a.setVerticalScrollbarPosition(this.getVerticalScrollbarPosition());
            this.a.setScrollBarSize(this.getScrollBarSize());
            this.a.setScrollBarStyle(this.getScrollBarStyle());
            if (this.isVerticalFadingEdgeEnabled()) {
                this.a.setVerticalFadingEdgeEnabled(true);
                this.a.setFadingEdgeLength(this.getVerticalFadingEdgeLength());
                this.setVerticalFadingEdgeEnabled(false);
                this.setFadingEdgeLength(0);
            }
            if (this.isHorizontalFadingEdgeEnabled()) {
                this.a.setHorizontalFadingEdgeEnabled(true);
                this.a.setFadingEdgeLength(this.getHorizontalFadingEdgeLength());
                this.setHorizontalFadingEdgeEnabled(false);
                this.setFadingEdgeLength(0);
            }
        }
        boolean bl3 = typedArray.getBoolean(7, false);
        n4 = typedArray.getInt(0, 1);
        this.d(this.a, bl3, n4);
        this.k = context.getResources().getDimensionPixelSize(2131165395);
        this.l = context.getResources().getDimensionPixelSize(2131165394);
        n4 = typedArray.getInt(4, 0);
        this.o = typedArray.getInt(5, 2);
        this.q = typedArray.getBoolean(2, false);
        this.n = new bmd(context.getDrawable(2131230947));
        this.m = new bmc(context.getDrawable(2131230912), context.getDrawable(2131230912), this.o);
        this.p = true;
        this.a.setClipToPadding(false);
        object = typedArray.getString(3);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.f(context, (String)object, attributeSet);
        } else if (n4 == 1) {
            this.getContext();
            this.b(new GridLayoutManager(this.o));
        } else {
            this.getContext();
            this.b(new LinearLayoutManager());
        }
        typedArray.recycle();
        if (!bl2) {
            return;
        }
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setHorizontalScrollBarEnabled(false);
        this.j = context.getResources().getString(2132017227);
        this.c(context, bnv.i(view, 2131427506));
    }

    private final void c(Context context, View view) {
        Class<Object> clazz;
        try {
            clazz = !TextUtils.isEmpty((CharSequence)this.j) ? this.getContext().getClassLoader().loadClass(this.j) : DefaultScrollBar.class;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new IllegalArgumentException("Error loading scroll bar component: ".concat(String.valueOf(this.j)), reflectiveOperationException);
        }
        try {
            clazz = clazz.getDeclaredConstructor(null);
            ((Constructor)((Object)clazz)).setAccessible(true);
            this.c = clazz = (DefaultScrollBar)((Constructor)((Object)clazz)).newInstance(null);
            ((DefaultScrollBar)((Object)clazz)).initialize(context, this.a, view);
            this.e(this.k + this.getPaddingTop(), this.l + this.getPaddingBottom());
            return;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new IllegalArgumentException("Error creating scroll bar component: ".concat(String.valueOf(this.j)), reflectiveOperationException);
        }
    }

    private final void d(ViewGroup viewGroup, boolean bl2, int n2) {
        Object object;
        if (bl2) {
            object = n2 != 1 ? "com.android.car.ui.utils.HORIZONTALLY_SCROLLABLE" : "com.android.car.ui.utils.VERTICALLY_SCROLLABLE";
            viewGroup.setContentDescription((CharSequence)object);
        }
        Object var5_5 = null;
        object = bl2 ? new bll(viewGroup) : null;
        viewGroup.setOnGenericMotionListener((View.OnGenericMotionListener)object);
        viewGroup.setFocusable(bl2);
        viewGroup.setDescendantFocusability(131072);
        ag$$ExternalSyntheticApiModelOutline0.m(viewGroup, false);
        object = var5_5;
        if (bl2) {
            object = new bmw((ViewGroup)this, 1);
        }
        viewGroup.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        if (!bl2) {
            viewGroup.setContentDescription((CharSequence)"com.android.car.ui.utils.ROTARY_CONTAINER");
        }
    }

    private final void e(int n2, int n3) {
        DefaultScrollBar defaultScrollBar;
        if (this.i && (defaultScrollBar = this.c) != null) {
            defaultScrollBar.setPadding(n2, n3);
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void f(Context object, String charSequence, AttributeSet object2) {
        block13: {
            Object object3;
            Object object4;
            if (charSequence == null || ((String)(object4 = ((String)charSequence).trim())).isEmpty()) break block13;
            if (((String)object4).charAt(0) == '.') {
                charSequence = String.valueOf(object.getPackageName()).concat(String.valueOf(object4));
            } else {
                charSequence = object4;
                if (!((String)object4).contains(".")) {
                    object3 = RecyclerView.class.getPackage().getName();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object3);
                    ((StringBuilder)charSequence).append(".");
                    ((StringBuilder)charSequence).append((String)object4);
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            try {
                object4 = this.isInEditMode() ? this.getClass().getClassLoader() : object.getClassLoader();
                Serializable serializable = Class.forName((String)charSequence, false, (ClassLoader)object4).asSubclass(ko.class);
                try {
                    object3 = serializable.getConstructor(e);
                    object4 = new Object[]{object, object2, object = Integer.valueOf(0), object};
                    object = object3;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    object4 = null;
                    try {
                        object = serializable.getConstructor(null);
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        noSuchMethodException2.initCause(noSuchMethodException);
                        String string = object2.getPositionDescription();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(string);
                        ((StringBuilder)object4).append(": Error creating LayoutManager ");
                        ((StringBuilder)object4).append((String)charSequence);
                        serializable = new Serializable(((StringBuilder)object4).toString(), noSuchMethodException2);
                        throw serializable;
                    }
                }
                ((Constructor)object).setAccessible(true);
                this.b((ko)((Constructor)object).newInstance((Object[])object4));
                return;
            }
            catch (ClassCastException classCastException) {
                object4 = object2.getPositionDescription();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(": Class is not a LayoutManager ");
                ((StringBuilder)object2).append((String)charSequence);
                throw new IllegalStateException(((StringBuilder)object2).toString(), classCastException);
            }
            catch (IllegalAccessException illegalAccessException) {
                object2 = object2.getPositionDescription();
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(": Cannot access non-public constructor ");
                ((StringBuilder)object4).append((String)charSequence);
                throw new IllegalStateException(((StringBuilder)object4).toString(), illegalAccessException);
            }
            catch (InstantiationException instantiationException) {
                object4 = object2.getPositionDescription();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(": Could not instantiate the LayoutManager: ");
                ((StringBuilder)object2).append((String)charSequence);
                throw new IllegalStateException(((StringBuilder)object2).toString(), instantiationException);
            }
            catch (InvocationTargetException invocationTargetException) {
                object4 = object2.getPositionDescription();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(": Could not instantiate the LayoutManager: ");
                ((StringBuilder)object2).append((String)charSequence);
                throw new IllegalStateException(((StringBuilder)object2).toString(), invocationTargetException);
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = object2.getPositionDescription();
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(": Unable to find LayoutManager ");
                ((StringBuilder)object4).append((String)charSequence);
                throw new IllegalStateException(((StringBuilder)object4).toString(), classNotFoundException);
            }
        }
    }

    public final int a() {
        return ((LinearLayoutManager)Objects.requireNonNull(this.a.n)).K();
    }

    @Override
    public final void addItemDecoration(kl kl2) {
        this.a.t(kl2);
    }

    @Override
    public final void addOnChildAttachStateChangeListener(kq kq2) {
        RecyclerView recyclerView = this.a;
        if (recyclerView.y == null) {
            recyclerView.y = new ArrayList();
        }
        recyclerView.y.add(kq2);
    }

    @Override
    public final void addOnLayoutCompleteListener(Runnable runnable) {
        this.b.add(runnable);
    }

    public final void b(ko ko2) {
        if (ko2 instanceof GridLayoutManager) {
            this.setLayoutStyle(blb.d(ko2));
            return;
        }
        this.setLayoutStyle(ble.d(ko2));
    }

    public final boolean canScrollHorizontally(int n2) {
        return this.a.canScrollHorizontally(n2);
    }

    public final boolean canScrollVertically(int n2) {
        return this.a.canScrollVertically(n2);
    }

    @Override
    public final lg findViewHolderForAdapterPosition(int n2) {
        return this.a.h(n2);
    }

    @Override
    public final kf getAdapter() {
        return this.a.g();
    }

    @Override
    public final int getChildLayoutPosition(View view) {
        return this.a.d(view);
    }

    public final int getPaddingBottom() {
        return this.a.getPaddingBottom();
    }

    public final int getPaddingTop() {
        return this.a.getPaddingTop();
    }

    @Override
    public final RecyclerView getRecyclerView() {
        return this.a;
    }

    @Override
    public final View getView() {
        return this;
    }

    @Override
    public final void invalidateItemDecorations() {
        this.a.M();
    }

    @Override
    public final boolean isLayoutCompleted() {
        kf kf2 = this.getAdapter();
        return kf2 != null && kf2.getItemCount() > 0 && !this.a.ap();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.c(this.g);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.e(this.g);
    }

    @Override
    public final boolean post(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override
    public final void removeOnLayoutCompleteListener(Runnable runnable) {
        if (runnable != null) {
            this.b.remove(runnable);
        }
    }

    public final void requestLayout() {
        Object object;
        super.requestLayout();
        if (this.p) {
            object = this.a.n;
            object = object != null ? ((ko)object).N() : null;
            this.a.requestLayout();
            ko ko2 = this.a.n;
            if (ko2 != null && object != null) {
                ko2.U((Parcelable)object);
            }
        }
        if ((object = this.c) != null) {
            ((DefaultScrollBar)object).requestLayout();
        }
    }

    public final void scrollBy(int n2, int n3) {
        this.a.scrollBy(n2, n3);
    }

    @Override
    public final void scrollToPosition(int n2) {
        this.a.Z(n2);
    }

    @Override
    public final void setAdapter(kf kf2) {
        Object object = this.c;
        if (object != null) {
            ((DefaultScrollBar)object).adapterChanged(kf2);
        }
        if ((object = this.f) instanceof blj) {
            ((blj)object).b();
        }
        this.f = kf2;
        this.a.ab(kf2);
        if (kf2 instanceof blj) {
            ((blj)((Object)kf2)).a();
        }
    }

    public final void setContentDescription(CharSequence charSequence) {
        bld bld2;
        boolean bl2;
        int n2;
        block5: {
            block6: {
                boolean bl3 = false;
                n2 = 1;
                bl2 = bl3;
                if (charSequence == null) break block5;
                if ("com.android.car.ui.utils.HORIZONTALLY_SCROLLABLE".contentEquals(charSequence)) break block6;
                bl2 = bl3;
                if (!"com.android.car.ui.utils.VERTICALLY_SCROLLABLE".contentEquals(charSequence)) break block5;
            }
            bl2 = true;
        }
        if ((bld2 = this.r) != null) {
            n2 = bld2.b();
        }
        this.d(this.a, bl2, n2);
        if (!bl2) {
            super.setContentDescription(charSequence);
        }
    }

    @Override
    public final void setLayoutStyle(bld object) {
        LinearLayoutManager linearLayoutManager;
        this.r = object;
        if (object == null) {
            this.a.ac(null);
            return;
        }
        if (object.a() == 0) {
            this.getContext();
            linearLayoutManager = new blm(this, object.b(), object.f());
        } else {
            this.getContext();
            bln bln2 = new bln(this, object.c(), object.b(), object.f());
            linearLayoutManager = bln2;
            if (object instanceof blb) {
                bln2.g = ((blb)object).c;
                linearLayoutManager = bln2;
            }
        }
        if (this.p) {
            this.a.W(Objects.requireNonNull(this.m));
            this.a.W(Objects.requireNonNull(this.n));
            if (linearLayoutManager instanceof GridLayoutManager) {
                int n2;
                if (this.q) {
                    this.a.t(Objects.requireNonNull(this.m));
                }
                this.o = n2 = ((GridLayoutManager)linearLayoutManager).b;
                object = this.m;
                if (object != null) {
                    ((bmc)object).a = n2;
                }
            } else if (this.q) {
                this.a.t(Objects.requireNonNull(this.n));
            }
        }
        this.a.ac(linearLayoutManager);
    }

    @Override
    public final void setPadding(int n2, int n3, int n4, int n5) {
        RecyclerView recyclerView = this.a;
        int n6 = this.a();
        recyclerView.setPadding(0, n3, 0, n5);
        if (this.i) {
            this.e(this.k + n3, this.l + n5);
            this.scrollToPosition(n6);
        }
        super.setPadding(n2, 0, n4, 0);
    }

    public final void setPaddingRelative(int n2, int n3, int n4, int n5) {
        RecyclerView recyclerView = this.a;
        int n6 = this.a();
        recyclerView.setPaddingRelative(0, n3, 0, n5);
        if (this.i) {
            this.e(this.k + n3, this.l + n5);
            this.scrollToPosition(n6);
        }
        super.setPaddingRelative(n2, 0, n4, 0);
    }
}

