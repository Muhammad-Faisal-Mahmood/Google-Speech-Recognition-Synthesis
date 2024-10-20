/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.Gravity
 *  android.view.View
 *  android.view.WindowManager
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class gc {
    public View a;
    public int b = 0x800003;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final fs e;
    private final boolean f;
    private final int g;
    private boolean h;
    private gd i;
    private ga j;
    private final PopupWindow.OnDismissListener k = new gb(this);

    public gc(Context context, fs fs2, View view, boolean bl2) {
        this(context, fs2, view, bl2, 2130968613);
    }

    public gc(Context context, fs fs2, View view, boolean bl2, int n2) {
        this.d = context;
        this.e = fs2;
        this.a = view;
        this.f = bl2;
        this.g = n2;
    }

    public final ga a() {
        if (this.j == null) {
            Object object = ((WindowManager)this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            object.getRealSize(point);
            object = Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(2131165206) ? new fm(this.d, this.a, this.g, this.f) : new gk(this.d, this.e, this.a, this.g, this.f);
            ((ga)object).j(this.e);
            ((ga)object).p(this.k);
            ((ga)object).l(this.a);
            object.d(this.i);
            ((ga)object).m(this.h);
            ((ga)object).n(this.b);
            this.j = object;
        }
        return this.j;
    }

    public final void b() {
        if (this.g()) {
            this.j.k();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean bl2) {
        this.h = bl2;
        ga ga2 = this.j;
        if (ga2 != null) {
            ga2.m(bl2);
        }
    }

    public final void e(gd gd2) {
        this.i = gd2;
        ga ga2 = this.j;
        if (ga2 != null) {
            ga2.d(gd2);
        }
    }

    public final void f(int n2, int n3, boolean bl2, boolean bl3) {
        ga ga2 = this.a();
        ga2.q(bl3);
        if (bl2) {
            int n4 = n2;
            if ((Gravity.getAbsoluteGravity((int)this.b, (int)this.a.getLayoutDirection()) & 7) == 5) {
                n4 = n2 - this.a.getWidth();
            }
            ga2.o(n4);
            ga2.r(n3);
            n2 = (int)(this.d.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            ga2.g = new Rect(n4 - n2, n3 - n2, n4 + n2, n3 + n2);
        }
        ga2.s();
    }

    public final boolean g() {
        ga ga2 = this.j;
        return ga2 != null && ga2.u();
    }

    public final boolean h() {
        if (this.g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        this.f(0, 0, false, false);
        return true;
    }
}

