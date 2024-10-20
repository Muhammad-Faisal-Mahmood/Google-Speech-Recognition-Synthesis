/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 */
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.Iterator;

public final class fyg
extends he {
    public final jw a;
    public final int b;
    public final ColorStateList c;
    private final AccessibilityManager d;
    private final Rect e = new Rect();
    private final int f;

    public fyg(Context context, AttributeSet object) {
        super(fyl.a(context, (AttributeSet)object, 2130968654, 0), (AttributeSet)object, 2130968654);
        int n2;
        Context context2 = this.getContext();
        context = fwl.c(context2, (AttributeSet)object, fyh.a, 2130968654, 2132084148);
        if (context.hasValue(0) && context.getInt(0, 0) == 0) {
            this.setKeyListener(null);
        }
        this.f = n2 = context.getResourceId(3, 2131624072);
        context.getDimensionPixelOffset(1, 2131166415);
        if (context.hasValue(2)) {
            ColorStateList.valueOf((int)context.getColor(2, 0));
        }
        this.b = context.getColor(4, 0);
        this.c = fvc.o(context2, (TypedArray)context, 5);
        this.d = (AccessibilityManager)context2.getSystemService("accessibility");
        object = new jw(context2, null, 2130969489);
        this.a = object;
        ((jw)object).y();
        ((jw)object).l = this;
        ((jw)object).x();
        ((jw)object).e(this.getAdapter());
        ((jw)object).m = new eyt((Object)this, 2);
        if (context.hasValue(6)) {
            int n3 = context.getResourceId(6, 0);
            object = this.getResources().getStringArray(n3);
            this.setAdapter((ListAdapter)new fyf(this, this.getContext(), n2, (String[])object));
        }
        context.recycle();
    }

    public static /* synthetic */ CharSequence a(fyg fyg2, Object object) {
        return fyg2.convertSelectionToString(object);
    }

    private final fyi b() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (!(viewParent instanceof fyi)) continue;
            return (fyi)viewParent;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean c() {
        Object object = this.d;
        if (object != null && object.isTouchExplorationEnabled()) return true;
        object = this.d;
        if (object == null || !object.isEnabled() || (object = this.d.getEnabledAccessibilityServiceList(16)) == null) return false;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (AccessibilityServiceInfo)iterator.next();
            if (object.getSettingsActivityName() == null || !object.getSettingsActivityName().contains("SwitchAccess")) continue;
            return true;
        }
        return false;
    }

    public final void dismissDropDown() {
        if (this.c()) {
            this.a.k();
            return;
        }
        super.dismissDropDown();
    }

    public final CharSequence getHint() {
        if (this.b() == null) {
            return super.getHint();
        }
        throw null;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b() == null) {
            return;
        }
        throw null;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.k();
    }

    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        if (View.MeasureSpec.getMode((int)n2) == Integer.MIN_VALUE) {
            int n4 = this.getMeasuredWidth();
            ListAdapter listAdapter = this.getAdapter();
            fyi fyi2 = this.b();
            n3 = 0;
            if (listAdapter != null && fyi2 != null) {
                int n5 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
                int n6 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
                n2 = Math.max(0, this.a.o());
                int n7 = Math.min(listAdapter.getCount(), n2 + 15);
                Drawable drawable = null;
                int n8 = 0;
                n2 = n3;
                for (n4 = Math.max(0, n7 - 15); n4 < n7; ++n4) {
                    int n9 = listAdapter.getItemViewType(n4);
                    n3 = n9 != n2 ? n9 : n2;
                    if (n9 != n2) {
                        drawable = null;
                    }
                    if ((drawable = listAdapter.getView(n4, (View)drawable, (ViewGroup)fyi2)).getLayoutParams() == null) {
                        drawable.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    drawable.measure(n5, n6);
                    n8 = Math.max(n8, drawable.getMeasuredWidth());
                    n2 = n3;
                }
                drawable = this.a.c();
                if (drawable != null) {
                    drawable.getPadding(this.e);
                    n2 = this.e.left;
                    n2 = this.e.right;
                }
                throw null;
            }
            this.setMeasuredDimension(Math.min(Math.max(n4, 0), View.MeasureSpec.getSize((int)n2)), this.getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean bl2) {
        if (this.c()) {
            return;
        }
        super.onWindowFocusChanged(bl2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(this.getAdapter());
    }

    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        jw jw2 = this.a;
        if (jw2 != null) {
            jw2.f(drawable);
        }
    }

    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = this.getOnItemSelectedListener();
    }

    public final void setRawInputType(int n2) {
        super.setRawInputType(n2);
        if (this.b() == null) {
            return;
        }
        throw null;
    }

    public final void showDropDown() {
        if (this.c()) {
            this.a.s();
            return;
        }
        super.showDropDown();
    }
}

