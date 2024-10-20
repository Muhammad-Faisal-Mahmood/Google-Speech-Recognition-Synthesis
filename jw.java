/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class jw
implements gi {
    private static Method a;
    private static Method b;
    private final bkl A;
    private final ak B;
    private Context c;
    private ListAdapter d;
    public jc e;
    public int f = -2;
    public int g;
    public boolean h;
    public boolean i;
    public int j = 0;
    public int k = Integer.MAX_VALUE;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    public final Handler o;
    public boolean p;
    public PopupWindow q;
    public final ak r = new ak(this, 20, null);
    private int s = -2;
    private int t;
    private int u = 1002;
    private boolean v;
    private DataSetObserver w;
    private final jv x;
    private final Rect y;
    private Rect z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ListPopupWindow", (String)"Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ListPopupWindow", (String)"Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public jw(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, null);
    }

    public jw(Context object, AttributeSet attributeSet, int n2, byte[] object2) {
        int n3;
        this.A = new bkl(this, 1);
        this.x = new jv(this);
        this.B = new ak(this, 19, null);
        this.y = new Rect();
        this.c = object;
        this.o = new Handler(object.getMainLooper());
        object2 = object.obtainStyledAttributes(attributeSet, er.o, n2, 0);
        this.g = object2.getDimensionPixelOffset(0, 0);
        this.t = n3 = object2.getDimensionPixelOffset(1, 0);
        if (n3 != 0) {
            this.v = true;
        }
        object2.recycle();
        object = new ho((Context)object, attributeSet, n2);
        this.q = object;
        object.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    @Override
    public final ListView aQ() {
        return this.e;
    }

    public final int b() {
        if (!this.v) {
            return 0;
        }
        return this.t;
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    public void e(ListAdapter object) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new ju(this);
        } else {
            ListAdapter listAdapter = this.d;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = object;
        if (object != null) {
            object.registerDataSetObserver(this.w);
        }
        if ((object = this.e) != null) {
            object.setAdapter(this.d);
        }
    }

    public final void f(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void g(int n2) {
        this.g = n2;
    }

    public final void j(int n2) {
        this.t = n2;
        this.v = true;
    }

    @Override
    public final void k() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks((Runnable)this.r);
    }

    public final int o() {
        if (!this.u()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }

    public jc p(Context context, boolean bl2) {
        return new jc(context, bl2);
    }

    public final void q() {
        jc jc2 = this.e;
        if (jc2 != null) {
            jc2.a = true;
            jc2.requestLayout();
        }
    }

    public final void r(int n2) {
        Drawable drawable = this.q.getBackground();
        if (drawable != null) {
            drawable.getPadding(this.y);
            drawable = this.y;
            this.f = drawable.left + drawable.right + n2;
            return;
        }
        this.f = n2;
    }

    @Override
    public final void s() {
        int n2;
        int n3;
        Object object;
        if (this.e == null) {
            object = this.p(this.c, this.p ^ true);
            this.e = object;
            object.setAdapter(this.d);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new asb(this, 1));
            this.e.setOnScrollListener(this.x);
            object = this.n;
            if (object != null) {
                this.e.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object);
            }
            object = this.e;
            this.q.setContentView((View)object);
        } else {
            object = (ViewGroup)this.q.getContentView();
        }
        object = this.q.getBackground();
        int n4 = 0;
        if (object != null) {
            object.getPadding(this.y);
            object = this.y;
            n2 = n3 = ((Rect)object).top + ((Rect)object).bottom;
            if (!this.v) {
                this.t = -this.y.top;
                n2 = n3;
            }
        } else {
            this.y.setEmpty();
            n2 = 0;
        }
        boolean bl2 = this.q.getInputMethodMode() == 2;
        object = this.l;
        n3 = this.t;
        int n5 = ag$$ExternalSyntheticApiModelOutline1.m(this.q, (View)object, n3, bl2);
        if (this.s == -1) {
            n3 = n5;
        } else {
            n3 = this.f;
            if (n3 != -2) {
                if (n3 != -1) {
                    n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000);
                } else {
                    n3 = this.c.getResources().getDisplayMetrics().widthPixels;
                    object = this.y;
                    n3 = View.MeasureSpec.makeMeasureSpec((int)(n3 - (((Rect)object).left + ((Rect)object).right)), (int)0x40000000);
                }
            } else {
                n3 = this.c.getResources().getDisplayMetrics().widthPixels;
                object = this.y;
                n3 = View.MeasureSpec.makeMeasureSpec((int)(n3 - (((Rect)object).left + ((Rect)object).right)), (int)Integer.MIN_VALUE);
            }
            n3 = this.e.b(n3, n5);
            n2 = n3 > 0 ? (n2 += this.e.getPaddingTop() + this.e.getPaddingBottom()) : 0;
        }
        bl2 = this.w();
        this.q.setWindowLayoutType(this.u);
        boolean bl3 = this.q.isShowing();
        n3 += n2;
        if (bl3) {
            if (this.l.isAttachedToWindow()) {
                n5 = this.f;
                if (n5 == -1) {
                    n2 = -1;
                } else {
                    n2 = n5;
                    if (n5 == -2) {
                        n2 = this.l.getWidth();
                    }
                }
                n5 = this.s;
                if (n5 == -1) {
                    if (!bl2) {
                        n3 = -1;
                    }
                    if (bl2) {
                        object = this.q;
                        n4 = this.f == -1 ? -1 : 0;
                        object.setWidth(n4);
                        this.q.setHeight(0);
                    } else {
                        object = this.q;
                        if (this.f == -1) {
                            n4 = -1;
                        }
                        object.setWidth(n4);
                        this.q.setHeight(-1);
                    }
                } else if (n5 != -2) {
                    n3 = n5;
                }
                this.q.setOutsideTouchable(true);
                object = this.q;
                View view = this.l;
                n5 = this.g;
                n4 = this.t;
                if (n2 < 0) {
                    n2 = -1;
                }
                if (n3 < 0) {
                    n3 = -1;
                }
                object.update(view, n5, n4, n2, n3);
                return;
            }
        } else {
            n4 = this.f;
            if (n4 == -1) {
                n2 = -1;
            } else {
                n2 = n4;
                if (n4 == -2) {
                    n2 = this.l.getWidth();
                }
            }
            n4 = this.s;
            if (n4 == -1) {
                n3 = -1;
            } else if (n4 != -2) {
                n3 = n4;
            }
            this.q.setWidth(n2);
            this.q.setHeight(n3);
            if (Build.VERSION.SDK_INT <= 28) {
                object = a;
                if (object != null) {
                    try {
                        ((Method)object).invoke((Object)this.q, true);
                    }
                    catch (Exception exception) {
                        Log.i((String)"ListPopupWindow", (String)"Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                dp$$ExternalSyntheticApiModelOutline0.m$1(this.q, true);
            }
            this.q.setOutsideTouchable(true);
            this.q.setTouchInterceptor((View.OnTouchListener)this.A);
            if (this.i) {
                this.q.setOverlapAnchor(this.h);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                object = b;
                if (object != null) {
                    try {
                        ((Method)object).invoke((Object)this.q, this.z);
                    }
                    catch (Exception exception) {
                        Log.e((String)"ListPopupWindow", (String)"Could not invoke setEpicenterBounds on PopupWindow", (Throwable)exception);
                    }
                }
            } else {
                dp$$ExternalSyntheticApiModelOutline0.m(this.q, this.z);
            }
            this.q.showAsDropDown(this.l, this.g, this.t, this.j);
            this.e.setSelection(-1);
            if (!this.p || this.e.isInTouchMode()) {
                this.q();
            }
            if (!this.p) {
                this.o.post((Runnable)this.B);
            }
        }
    }

    public final void t(Rect object) {
        object = object != null ? new Rect(object) : null;
        this.z = object;
    }

    @Override
    public final boolean u() {
        return this.q.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }
}

