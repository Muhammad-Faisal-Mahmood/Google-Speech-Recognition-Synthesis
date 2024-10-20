/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class jc
extends ListView {
    public boolean a;
    public ak b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private ja i;
    private final boolean j;
    private boolean k;
    private yh l;

    public jc(Context context, boolean bl2) {
        super(context, null, 2130969109);
        this.j = bl2;
        this.setCacheColorHint(0);
    }

    private final void c(boolean bl2) {
        ja ja2 = this.i;
        if (ja2 != null) {
            ja2.a = bl2;
        }
    }

    private final void d() {
        Drawable drawable = this.getSelector();
        if (drawable != null && this.k && this.isPressed()) {
            drawable.setState(this.getDrawableState());
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean a(MotionEvent var1_1, int var2_2) {
        block32: {
            block37: {
                block34: {
                    block35: {
                        block36: {
                            var8_3 = var1_1.getActionMasked();
                            var7_4 = 0;
                            if (var8_3 == 1) break block34;
                            if (var8_3 == 2) break block35;
                            if (var8_3 == 3) break block36;
                            var10_5 = true;
                            var2_2 = var7_4;
                            break block32;
                        }
lbl10:
                        // 2 sources

                        while (true) {
                            var10_5 = false;
                            var2_2 = var7_4;
                            break block32;
                            break;
                        }
                    }
                    var10_5 = true;
                    break block37;
                }
                var10_5 = false;
            }
            ** while ((var9_6 = var1_1.findPointerIndex((int)var2_2)) < 0)
lbl21:
            // 1 sources

            var2_2 = (int)var1_1.getX(var9_6);
            var7_4 = this.pointToPosition(var2_2, var9_6 = (int)var1_1.getY(var9_6));
            if (var7_4 == -1) {
                var2_2 = 1;
            } else {
                block33: {
                    var11_7 = this.getChildAt(var7_4 - this.getFirstVisiblePosition());
                    var5_8 = var2_2;
                    var6_9 = var9_6;
                    this.k = true;
                    this.drawableHotspotChanged(var5_8, var6_9);
                    if (!this.isPressed()) {
                        this.setPressed(true);
                    }
                    this.layoutChildren();
                    var2_2 = this.h;
                    if (var2_2 != -1 && (var12_10 = this.getChildAt(var2_2 - this.getFirstVisiblePosition())) != null && var12_10 != var11_7 && var12_10.isPressed()) {
                        var12_10.setPressed(false);
                    }
                    this.h = var7_4;
                    var11_7.drawableHotspotChanged(var5_8 - (float)var11_7.getLeft(), var6_9 - (float)var11_7.getTop());
                    if (!var11_7.isPressed()) {
                        var11_7.setPressed(true);
                    }
                    if ((var12_10 = this.getSelector()) != null) {
                        if (var7_4 != -1) {
                            var2_2 = 1;
                        } else {
                            var2_2 = 0;
                            var7_4 = -1;
                        }
                    } else {
                        var2_2 = 0;
                    }
                    if (var2_2 != 0) {
                        var12_10.setVisible(false, false);
                    }
                    var13_11 = this.c;
                    var13_11.set(var11_7.getLeft(), var11_7.getTop(), var11_7.getRight(), var11_7.getBottom());
                    var13_11.left -= this.d;
                    var13_11.top -= this.e;
                    var13_11.right += this.f;
                    var13_11.bottom += this.g;
                    if (Build.VERSION.SDK_INT >= 33) {
                        var10_5 = a$$ExternalSyntheticApiModelOutline0.m((AbsListView)this);
                    } else {
                        var13_11 = jb.a;
                        if (var13_11 != null) {
                            try {
                                var10_5 = var13_11.getBoolean((Object)this);
                                break block33;
                            }
                            catch (IllegalAccessException var13_12) {
                                var13_12.printStackTrace();
                            }
                        }
                        var10_5 = false;
                    }
                }
                if (var11_7.isEnabled() != var10_5) {
                    var10_5 ^= true;
                    if (Build.VERSION.SDK_INT >= 33) {
                        a$$ExternalSyntheticApiModelOutline0.m((AbsListView)this, var10_5);
                    } else {
                        var13_11 = jb.a;
                        if (var13_11 != null) {
                            try {
                                var13_11.set((Object)this, var10_5);
                            }
                            catch (IllegalAccessException var13_13) {
                                var13_13.printStackTrace();
                            }
                        }
                    }
                    if (var7_4 != -1) {
                        this.refreshDrawableState();
                    }
                }
                if (var2_2 != 0) {
                    var13_11 = this.c;
                    var3_14 = var13_11.exactCenterX();
                    var4_15 = var13_11.exactCenterY();
                    var10_5 = this.getVisibility() == 0;
                    var12_10.setVisible(var10_5, false);
                    var12_10.setHotspot(var3_14, var4_15);
                }
                if ((var12_10 = this.getSelector()) != null && var7_4 != -1) {
                    var12_10.setHotspot(var5_8, var6_9);
                }
                this.c(false);
                this.refreshDrawableState();
                if (var8_3 == 1) {
                    this.performItemClick(var11_7, var7_4, this.getItemIdAtPosition(var7_4));
                }
                var10_5 = true;
                var2_2 = 0;
            }
        }
        if (!var10_5 || var2_2 != 0) {
            this.k = false;
            this.setPressed(false);
            this.drawableStateChanged();
            var11_7 = this.getChildAt(this.h - this.getFirstVisiblePosition());
            if (var11_7 != null) {
                var11_7.setPressed(false);
            }
        }
        if (var10_5) {
            if (this.l == null) {
                this.l = new yh(this);
            }
            this.l.c(true);
            this.l.onTouch((View)this, (MotionEvent)var1_1);
        } else {
            var1_1 = this.l;
            if (var1_1 != null) {
                var1_1.c(false);
            }
        }
        return var10_5;
    }

    public final int b(int n2, int n3) {
        int n4 = this.getListPaddingTop() + this.getListPaddingBottom();
        int n5 = this.getDividerHeight();
        Drawable drawable = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        if (listAdapter == null) {
            return n4;
        }
        if (n5 <= 0 || drawable == null) {
            n5 = 0;
        }
        int n6 = listAdapter.getCount();
        int n7 = 0;
        drawable = null;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n8 = listAdapter.getItemViewType(i2);
            int n9 = n8 != n7 ? n8 : n7;
            if (n8 != n7) {
                drawable = null;
            }
            View view = listAdapter.getView(i2, (View)drawable, (ViewGroup)this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            drawable = layoutParams;
            if (layoutParams == null) {
                drawable = this.generateDefaultLayoutParams();
                view.setLayoutParams((ViewGroup.LayoutParams)drawable);
            }
            n7 = drawable.height > 0 ? View.MeasureSpec.makeMeasureSpec((int)drawable.height, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n2, n7);
            view.forceLayout();
            n7 = n4;
            if (i2 > 0) {
                n7 = n4 + n5;
            }
            if ((n4 = n7 + view.getMeasuredHeight()) >= n3) {
                return n3;
            }
            n7 = n9;
            drawable = view;
        }
        return n4;
    }

    protected final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.c.isEmpty() && (drawable = this.getSelector()) != null) {
            drawable.setBounds(this.c);
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        this.c(true);
        this.d();
    }

    public final boolean hasFocus() {
        return this.j || super.hasFocus();
        {
        }
    }

    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
        {
        }
    }

    public final boolean isFocused() {
        return this.j || super.isFocused();
        {
        }
    }

    public final boolean isInTouchMode() {
        return this.j && this.a || super.isInTouchMode();
    }

    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent object) {
        Object object2;
        int n2;
        int n3 = n2 = object.getActionMasked();
        if (n2 == 10) {
            if (this.b == null) {
                object2 = new ak((Object)this, 15, null);
                this.b = object2;
                ((jc)((Object)((ak)object2).a)).post((Runnable)object2);
            }
            n3 = 10;
        }
        boolean bl2 = super.onHoverEvent(object);
        if (n3 != 9 && n3 != 7) {
            this.setSelection(-1);
        } else {
            n3 = this.pointToPosition((int)object.getX(), (int)object.getY());
            if (n3 != -1 && n3 != this.getSelectedItemPosition()) {
                View view = this.getChildAt(n3 - this.getFirstVisiblePosition());
                if (view.isEnabled()) {
                    this.requestFocus();
                    if (Build.VERSION.SDK_INT >= 30 && iz.d) {
                        try {
                            Method method = iz.a;
                            object = n3;
                            object2 = -1;
                            method.invoke((Object)this, object, view, false, object2, object2);
                            iz.b.invoke((Object)this, object);
                            iz.c.invoke((Object)this, object);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            invocationTargetException.printStackTrace();
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            illegalAccessException.printStackTrace();
                        }
                    } else {
                        this.setSelectionFromTop(n3, view.getTop() - this.getTop());
                    }
                }
                this.d();
            }
        }
        return bl2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        ak ak2 = this.b;
        if (ak2 != null) {
            jc jc2 = (jc)((Object)ak2.a);
            jc2.b = null;
            jc2.removeCallbacks(ak2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        ja ja2 = drawable != null ? new ja(drawable) : null;
        this.i = ja2;
        super.setSelector((Drawable)ja2);
        ja2 = new Rect();
        if (drawable != null) {
            drawable.getPadding((Rect)ja2);
        }
        this.d = ((Rect)ja2).left;
        this.e = ((Rect)ja2).top;
        this.f = ((Rect)ja2).right;
        this.g = ((Rect)ja2).bottom;
    }
}

