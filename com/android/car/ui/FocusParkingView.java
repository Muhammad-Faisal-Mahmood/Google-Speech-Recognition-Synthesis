/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 *  android.view.inputmethod.InputMethodManager
 */
package com.android.car.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import com.android.car.ui.FocusArea;

public class FocusParkingView
extends View {
    ViewGroup a;
    public boolean b = true;
    public long c;
    public long d;
    private View e;
    private bjo f;
    private boolean g;
    private final ViewTreeObserver.OnGlobalFocusChangeListener h = new bjj((Object)this, 0);
    private final ViewTreeObserver.OnTouchModeChangeListener i = new bjk((Object)this, 0);

    public FocusParkingView(Context context) {
        super(context);
        this.b(context, null);
    }

    public FocusParkingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b(context, attributeSet);
    }

    public FocusParkingView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.b(context, attributeSet);
    }

    public FocusParkingView(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.b(context, attributeSet);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.b = context.obtainStyledAttributes(attributeSet, bjm.i).getBoolean(0, true);
        }
        this.c = this.getResources().getInteger(2131492876);
        ag$$ExternalSyntheticApiModelOutline0.m(this, 1);
        this.setVisibility(0);
        this.setEnabled(true);
        this.setClickable(false);
        this.setAlpha(0.0f);
        ag$$ExternalSyntheticApiModelOutline0.m(this, false);
        context = this.getResources();
        this.f = new bjo(context.getInteger(2131492872), context.getInteger(2131492873));
        this.g = context.getBoolean(2131034119);
    }

    private final boolean c(boolean bl2) {
        if (bl2 && this.isInTouchMode()) {
            return false;
        }
        Object object = this.e;
        if (object != null && object.isFocused() && this.e.isAttachedToWindow()) {
            return true;
        }
        object = this.e;
        if (object != null && !object.isAttachedToWindow() && this.e.getParent() != null && (object = this.a) != null && object.isAttachedToWindow() && this.a.isShown()) {
            ViewGroup viewGroup = this.a;
            object = viewGroup instanceof RecyclerView ? (RecyclerView)viewGroup : null;
            if (viewGroup.requestFocus()) {
                if (object != null && ((RecyclerView)object).ap()) {
                    this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new bjl(this, (RecyclerView)object));
                }
                return true;
            }
        }
        object = this.f.a(SystemClock.uptimeMillis());
        if (AmbientModeSupport$AmbientCallback.j(this.getRootView(), 1, (View)object, this.g)) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void a(View view) {
        View view2 = this.e;
        if (view2 != null) {
            this.f.b(view2, SystemClock.uptimeMillis());
        }
        this.e = view;
        Object var3_3 = null;
        if (view == null) {
            view2 = var3_3;
        } else {
            view = view.getParent();
            while (true) {
                view2 = var3_3;
                if (view == null) break;
                view2 = var3_3;
                if (!(view instanceof ViewGroup)) break;
                view2 = var3_3;
                if (view instanceof FocusArea || AmbientModeSupport$AmbientCallback.q(view2 = (ViewGroup)view)) break;
                view = view.getParent();
            }
        }
        this.a = view2;
    }

    public final CharSequence getAccessibilityClassName() {
        return FocusParkingView.class.getName();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalFocusChangeListener(this.h);
        this.getViewTreeObserver().addOnTouchModeChangeListener(this.i);
        if (this.b && AmbientModeSupport$AmbientCallback.o(this)) {
            this.b = false;
        }
    }

    protected final void onDetachedFromWindow() {
        this.getViewTreeObserver().removeOnTouchModeChangeListener(this.i);
        this.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.h);
        this.f.b(null, 0L);
        this.e = null;
        super.onDetachedFromWindow();
    }

    protected final void onMeasure(int n2, int n3) {
        this.setMeasuredDimension(1, 1);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        String.valueOf(AmbientModeSupport$AmbientCallback.d(this.getContext()));
        if (!bl2) {
            super.requestFocus(130, null);
            this.a(null);
        } else if (this.b && (this.isFocused() || this.getRootView().findFocus() instanceof FocusParkingView)) {
            this.c(true);
        }
        super.onWindowFocusChanged(bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean performAccessibilityAction(int n2, Bundle bundle) {
        if (n2 != 1) {
            if (n2 == 0x4000000) return this.c(false);
            if (n2 == 0x8000000) return ((InputMethodManager)this.getContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(this.getWindowToken(), 0);
            if (n2 == 0x10000000) return false;
            return super.performAccessibilityAction(n2, bundle);
        }
        if (this.hasFocus()) return false;
        return super.requestFocus(130, null);
    }

    public final boolean requestFocus(int n2, Rect rect) {
        if (this.b) {
            if (SystemClock.uptimeMillis() <= this.d) {
                this.d = 0L;
            } else {
                return this.c(true);
            }
        }
        return super.requestFocus(n2, rect);
    }
}

