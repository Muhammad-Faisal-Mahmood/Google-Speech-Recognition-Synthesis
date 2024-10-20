/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public abstract class gn
extends ViewGroup {
    protected final gm a = new gm(this);
    public final Context b;
    public ActionMenuView c;
    public gy d;
    public int e;
    protected bzb f;
    private boolean g;
    private boolean h;

    gn(Context context) {
        this(context, null);
    }

    public gn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gn(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(2130968581, (TypedValue)attributeSet, true) && attributeSet.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, attributeSet.resourceId);
            return;
        }
        this.b = context;
    }

    public static int a(int n2, int n3, boolean bl2) {
        n2 = bl2 ? (n2 -= n3) : (n2 += n3);
        return n2;
    }

    static /* synthetic */ void b(gn gn2, int n2) {
        super.setVisibility(n2);
    }

    static /* synthetic */ void d(gn gn2) {
        super.setVisibility(0);
    }

    public static final int e(View view, int n2, int n3) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)Integer.MIN_VALUE), n3);
        return Math.max(0, n2 - view.getMeasuredWidth());
    }

    public static final int f(View view, int n2, int n3, int n4, boolean bl2) {
        int n5 = view.getMeasuredWidth();
        int n6 = view.getMeasuredHeight();
        n3 += (n4 - n6) / 2;
        n4 = n6 + n3;
        if (bl2) {
            view.layout(n2 - n5, n3, n2, n4);
            return -n5;
        }
        view.layout(n2, n3, n2 + n5, n4);
        return n5;
    }

    public void c(int n2) {
        throw null;
    }

    public final bzb g(int n2, long l2) {
        Object object = this.f;
        if (object != null) {
            ((bzb)object).U();
        }
        if (n2 == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            object = wj.t((View)this);
            ((bzb)object).V(1.0f);
            ((bzb)object).W(l2);
            gm gm2 = this.a;
            gm2.d((bzb)object, 0);
            ((bzb)object).X(gm2);
            return object;
        }
        bzb bzb2 = wj.t((View)this);
        bzb2.V(0.0f);
        bzb2.W(l2);
        object = this.a;
        ((gm)object).d(bzb2, n2);
        bzb2.X((wq)object);
        return bzb2;
    }

    protected final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.getContext().obtainStyledAttributes(null, er.a, 2130968584, 0);
        this.c(object.getLayoutDimension(13, 0));
        object.recycle();
        object = this.d;
        if (object != null) {
            ((gy)object).h = kh.e(((gy)object).b);
            object = ((gy)object).c;
            if (object != null) {
                ((fs)object).l(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionMasked();
        int n3 = 9;
        int n4 = n2;
        if (n2 == 9) {
            this.h = false;
            n4 = 9;
        }
        if (!this.h) {
            boolean bl2 = super.onHoverEvent(motionEvent);
            if (n4 == 9) {
                n4 = n3;
                if (!bl2) {
                    this.h = true;
                    n4 = n3;
                }
            }
        }
        if (n4 == 10 || n4 == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n2;
        int n3 = n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            this.g = false;
            n3 = 0;
        }
        n2 = n3;
        if (!this.g) {
            boolean bl2 = super.onTouchEvent(motionEvent);
            n2 = n3;
            if (n3 == 0) {
                if (!bl2) {
                    this.g = true;
                }
                n2 = 0;
            }
        }
        if (n2 == 1 || n2 == 3) {
            this.g = false;
        }
        return true;
    }

    public final void setVisibility(int n2) {
        if (n2 != this.getVisibility()) {
            bzb bzb2 = this.f;
            if (bzb2 != null) {
                bzb2.U();
            }
            super.setVisibility(n2);
        }
    }
}

