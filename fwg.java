/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.Gravity
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

public class fwg
extends jp {
    protected boolean a = true;
    boolean b = false;
    private Drawable c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private int i = 119;

    public fwg(Context context) {
        this(context, null);
    }

    public fwg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fwg(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        context = fwl.c(context, attributeSet, fwi.a, n2, 0);
        this.i = context.getInt(1, this.i);
        attributeSet = context.getDrawable(0);
        if (attributeSet != null) {
            this.setForeground((Drawable)attributeSet);
        }
        this.a = context.getBoolean(2, true);
        context.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.b) {
                this.b = false;
                Rect rect = this.d;
                Rect rect2 = this.e;
                int n2 = this.getRight() - this.getLeft();
                int n3 = this.getBottom() - this.getTop();
                if (this.a) {
                    rect.set(0, 0, n2, n3);
                } else {
                    rect.set(this.getPaddingLeft(), this.getPaddingTop(), n2 - this.getPaddingRight(), n3 - this.getPaddingBottom());
                }
                Gravity.apply((int)this.i, (int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Rect)rect, (Rect)rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }

    public final Drawable getForeground() {
        return this.c;
    }

    public final int getForegroundGravity() {
        return this.i;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        this.b = bl2 | this.b;
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        this.b = true;
    }

    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.unscheduleDrawable(this.c);
            }
            this.c = drawable;
            this.b = true;
            if (drawable != null) {
                this.setWillNotDraw(false);
                drawable.setCallback((Drawable.Callback)this);
                if (drawable.isStateful()) {
                    drawable.setState(this.getDrawableState());
                }
                if (this.i == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    public final void setForegroundGravity(int n2) {
        if (this.i != n2) {
            int n3 = n2;
            if ((0x800007 & n2) == 0) {
                n3 = n2 | 0x800003;
            }
            n2 = n3;
            if ((n3 & 0x70) == 0) {
                n2 = n3 | 0x30;
            }
            this.i = n2;
            if (n2 == 119 && this.c != null) {
                Rect rect = new Rect();
                this.c.getPadding(rect);
            }
            this.requestLayout();
        }
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
        {
        }
    }
}

