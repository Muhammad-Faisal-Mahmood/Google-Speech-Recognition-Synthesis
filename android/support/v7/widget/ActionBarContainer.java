/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ActionBarContainer
extends FrameLayout {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    public boolean e;
    private boolean f;
    private View g;
    private View h;
    private int i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        boolean bl2;
        block5: {
            block6: {
                boolean bl3;
                block4: {
                    super(context, attributeSet);
                    this.setBackground(new go(this));
                    context = context.obtainStyledAttributes(attributeSet, er.a);
                    bl3 = false;
                    this.a = context.getDrawable(0);
                    this.b = context.getDrawable(2);
                    this.i = context.getDimensionPixelSize(13, -1);
                    if (this.getId() == 2131427890) {
                        this.d = true;
                        this.c = context.getDrawable(1);
                    }
                    context.recycle();
                    if (!this.d) break block4;
                    bl2 = bl3;
                    if (this.c != null) break block5;
                    break block6;
                }
                bl2 = bl3;
                if (this.a != null) break block5;
                bl2 = bl3;
                if (this.b != null) break block5;
            }
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
    }

    public final void a(boolean bl2) {
        this.f = bl2;
        int n2 = true != bl2 ? 262144 : 393216;
        this.setDescendantFocusability(n2);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            this.a.setState(this.getDrawableState());
        }
        if ((drawable = this.b) != null && drawable.isStateful()) {
            this.b.setState(this.getDrawableState());
        }
        if ((drawable = this.c) != null && drawable.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.b) != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.c) != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = this.findViewById(2131427390);
        this.h = this.findViewById(2131427398);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
        {
        }
    }

    public final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        block8: {
            block9: {
                block7: {
                    super.onLayout(bl2, n2, n3, n4, n5);
                    if (!this.d) break block7;
                    Drawable drawable = this.c;
                    if (drawable == null) break block8;
                    drawable.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                    break block9;
                }
                if (this.a != null) {
                    View view;
                    n3 = this.g.getVisibility();
                    n2 = 1;
                    if (n3 != 0 && ((view = this.h) == null || view.getVisibility() != 0)) {
                        this.a.setBounds(0, 0, 0, 0);
                    } else {
                        this.a.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                    }
                } else {
                    n2 = 0;
                }
                this.e = false;
                if (n2 == 0) break block8;
            }
            this.invalidate();
        }
    }

    public final void onMeasure(int n2, int n3) {
        int n4 = n3;
        if (this.g == null) {
            n4 = n3;
            if (View.MeasureSpec.getMode((int)n3) == Integer.MIN_VALUE) {
                int n5 = this.i;
                n4 = n3;
                if (n5 >= 0) {
                    n4 = View.MeasureSpec.makeMeasureSpec((int)Math.min(n5, View.MeasureSpec.getSize((int)n3)), (int)Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n2, n4);
        if (this.g == null) {
            return;
        }
        View.MeasureSpec.getMode((int)n4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setVisibility(int n2) {
        super.setVisibility(n2);
        Drawable drawable = this.a;
        boolean bl2 = n2 == 0;
        if (drawable != null) {
            drawable.setVisible(bl2, false);
        }
        if ((drawable = this.b) != null) {
            drawable.setVisible(bl2, false);
        }
        if ((drawable = this.c) != null) {
            drawable.setVisible(bl2, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int n2) {
        if (n2 != 0) {
            return super.startActionModeForChild(view, callback, n2);
        }
        return null;
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a && !this.d || drawable == this.c && this.d || super.verifyDrawable(drawable);
    }
}

