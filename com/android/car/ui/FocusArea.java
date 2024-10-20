/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.FocusFinder
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.LinearLayout
 */
package com.android.car.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import java.util.HashMap;
import java.util.Iterator;

public class FocusArea
extends LinearLayout {
    public final bji a;

    public FocusArea(Context context) {
        this(context, null);
    }

    public FocusArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusArea(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public FocusArea(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.a = new bji((ViewGroup)this, attributeSet);
    }

    public final View a() {
        return this.a.s;
    }

    public final void b(int n2, int n3, int n4, int n5) {
        bji bji2 = this.a;
        bji2.m = n2;
        bji2.o = n3;
        bji2.n = n4;
        bji2.p = n5;
    }

    public final void c(int n2, int n3, int n4, int n5) {
        bji bji2 = this.a;
        if (bji2.i == n2 && bji2.k == n3 && bji2.j == n4 && bji2.l == n5) {
            return;
        }
        bji2.i = n2;
        bji2.k = n3;
        bji2.j = n4;
        bji2.l = n5;
        bji2.c.invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        bji bji2 = this.a;
        if (bji2.e && bji2.d && !bji2.c.isInTouchMode()) {
            bji2.g.setBounds(bji2.i + bji2.c.getScrollX(), bji2.k + bji2.c.getScrollY(), bji2.c.getScrollX() + bji2.c.getWidth() - bji2.j, bji2.c.getScrollY() + bji2.c.getHeight() - bji2.l);
            bji2.g.draw(canvas);
        }
    }

    public final View focusSearch(View view, int n2) {
        if (this.a.w) {
            return FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n2);
        }
        return super.focusSearch(view, n2);
    }

    public final CharSequence getAccessibilityClassName() {
        return "com.android.car.ui.FocusArea";
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bji bji2 = this.a;
        bji2.c.getViewTreeObserver().addOnGlobalFocusChangeListener(bji2.z);
        bji2.c.getViewTreeObserver().addOnTouchModeChangeListener(bji2.A);
        if (bji2.B && AmbientModeSupport$AmbientCallback.o((View)bji2.c)) {
            bji2.B = false;
        }
    }

    protected final void onDetachedFromWindow() {
        bji bji2 = this.a;
        bji2.c.getViewTreeObserver().removeOnTouchModeChangeListener(bji2.A);
        bji2.c.getViewTreeObserver().removeOnGlobalFocusChangeListener(bji2.z);
        bji2.F.i();
        bji2.F.j(null, 0L);
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bji bji2 = this.a;
        if (bji2.f && bji2.d && !bji2.c.isInTouchMode()) {
            bji2.h.setBounds(bji2.i + bji2.c.getScrollX(), bji2.k + bji2.c.getScrollY(), bji2.c.getScrollX() + bji2.c.getWidth() - bji2.j, bji2.c.getScrollY() + bji2.c.getHeight() - bji2.l);
            bji2.h.draw(canvas);
        }
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        bji bji2 = this.a;
        int n2 = bji2.r;
        if (n2 != -1) {
            bji2.s = fs$$ExternalSyntheticApiModelOutline0.m(bji2.c, n2);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo object) {
        super.onInitializeAccessibilityNodeInfo(object);
        Bundle bundle = object.getExtras();
        object = this.a;
        bundle.putInt("com.android.car.ui.utils.FOCUS_AREA_LEFT_BOUND_OFFSET", object.m);
        bundle.putInt("com.android.car.ui.utils.FOCUS_AREA_RIGHT_BOUND_OFFSET", object.n);
        bundle.putInt("com.android.car.ui.utils.FOCUS_AREA_TOP_BOUND_OFFSET", object.o);
        bundle.putInt("com.android.car.ui.utils.FOCUS_AREA_BOTTOM_BOUND_OFFSET", object.p);
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        bji bji2 = this.a;
        n2 = bji2.c.getLayoutDirection();
        bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        if (bji2.q != bl2) {
            bji2.q = bl2;
            n2 = bji2.i;
            bji2.i = bji2.j;
            bji2.j = n2;
            n2 = bji2.m;
            bji2.m = bji2.n;
            bji2.n = n2;
        }
    }

    protected final boolean onRequestFocusInDescendants(int n2, Rect object) {
        if (this.isInTouchMode()) {
            return super.onRequestFocusInDescendants(n2, (Rect)object);
        }
        object = this.a;
        if (((bji)object).B && !((bji)object).f()) {
            return ((bji)object).e();
        }
        return false;
    }

    public final void onWindowFocusChanged(boolean bl2) {
        bji bji2 = this.a;
        String.valueOf(AmbientModeSupport$AmbientCallback.d(bji2.c.getContext()));
        if (bl2 && bji2.B && !bji2.c.isInTouchMode()) {
            bji2 = bji2.c.getRootView();
            int n2 = AmbientModeSupport$AmbientCallback.c(bji2.findFocus());
            if (n2 >= 3) {
                return;
            }
            AmbientModeSupport$AmbientCallback.j((View)bji2, n2, null, false);
            return;
        }
        super.onWindowFocusChanged(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean performAccessibilityAction(int n2, Bundle object) {
        boolean bl2;
        boolean bl3;
        int n3;
        Object object2;
        block20: {
            Rect rect;
            View view;
            block23: {
                block21: {
                    block22: {
                        if (!bji.b.contains(n2)) return super.performAccessibilityAction(n2, object);
                        object2 = this.a;
                        n3 = 130;
                        bl3 = true;
                        if (n2 == 1) break block20;
                        if (n2 != 0x1000000) {
                            if (n2 != 0x2000000) {
                                if (n2 == 0x20000000) return ((bji)object2).d(bji.a(object));
                                return false;
                            } else {
                                int n4 = bji.a(object);
                                if (((bji)object2).d(n4)) return false;
                                long l2 = SystemClock.uptimeMillis();
                                if (((bji)object2).v == null) {
                                    View view2 = ((bji)object2).c.getRootView();
                                    ((bji)object2).v = new SparseArray();
                                    Iterator iterator = bji.a.iterator();
                                    while (iterator.hasNext()) {
                                        n3 = (Integer)iterator.next();
                                        n2 = ((bji)object2).u.get(n3, -1);
                                        ((bji)object2).v.put(n3, (Object)((FocusArea)view2.findViewById(n2)));
                                    }
                                }
                                FocusArea focusArea = (FocusArea)((Object)((bji)object2).v.get(n4));
                                bl2 = focusArea != null && focusArea.a.c();
                                if (bl2) return bl2;
                                FocusArea focusArea2 = ((bji)object2).F.k(n4, l2);
                                if (focusArea2 == null) return false;
                                if (!focusArea2.a.c()) return false;
                                return bl3;
                            }
                        }
                        n2 = bji.a(object);
                        ((bji)object2).b();
                        view = (View)((bji)object2).t.get(n2);
                        if (view == null || view.isFocused()) return false;
                        object2 = ((bji)object2).c.findFocus();
                        if (object2 == null) {
                            Log.e((String)"FocusAreaHelper", (String)"Failed to nudge to nudge shortcut view because there is no focused view in this FocusArea");
                            return false;
                        }
                        rect = AmbientModeSupport$AmbientCallback.e((View)object2);
                        object2 = AmbientModeSupport$AmbientCallback.e(view);
                        if (n2 == 17) break block21;
                        if (n2 == 33) break block22;
                        if (n2 != 66) {
                            if (n2 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            if (rect.top >= ((Rect)object2).top) {
                                if (rect.bottom > ((Rect)object2).top) return false;
                            }
                            break block23;
                        } else {
                            if (rect.left >= ((Rect)object2).left) {
                                if (rect.right > ((Rect)object2).left) return false;
                            }
                            if (rect.right < ((Rect)object2).right) return AmbientModeSupport$AmbientCallback.r(view);
                            return false;
                        }
                    }
                    if (rect.bottom <= ((Rect)object2).bottom) {
                        if (rect.top < ((Rect)object2).bottom) return false;
                    }
                    if (rect.top > ((Rect)object2).top) return AmbientModeSupport$AmbientCallback.r(view);
                    return false;
                }
                if (rect.right <= ((Rect)object2).right) {
                    if (rect.left < ((Rect)object2).right) return false;
                }
                if (rect.left > ((Rect)object2).left) return AmbientModeSupport$AmbientCallback.r(view);
                return false;
            }
            if (rect.bottom >= ((Rect)object2).bottom) return false;
            return AmbientModeSupport$AmbientCallback.r(view);
        }
        bl2 = ((bji)object2).c();
        if (!bl2) return bl2;
        if (((bji)object2).E == null) return bl2;
        int n5 = bji.a(object);
        if (n5 == -1) return bl2;
        FocusArea focusArea = ((bji)object2).E;
        ViewGroup viewGroup = ((bji)object2).c;
        object2 = focusArea.a;
        long l3 = SystemClock.uptimeMillis();
        bl2 = bl3;
        if (((bji)object2).F.k(n5, l3) != null) return bl2;
        if (n5 != 17) {
            n2 = n3;
            if (n5 != 33) {
                if (n5 != 66) {
                    if (n5 != 130) throw new IllegalArgumentException("direction must be FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, or FOCUS_RIGHT.");
                    n2 = 33;
                } else {
                    n2 = 17;
                }
            }
        } else {
            n2 = 66;
        }
        object2 = (bjn)((FocusArea)viewGroup).a.F.a;
        if (((bjn)object2).a == 1) {
            return bl3;
        }
        ((HashMap)object2).put(n2, new elq(focusArea, l3));
        return true;
    }

    public final boolean restoreDefaultFocus() {
        bji bji2 = this.a;
        if (bji2.B && !bji2.f()) {
            return bji2.e();
        }
        return false;
    }
}

