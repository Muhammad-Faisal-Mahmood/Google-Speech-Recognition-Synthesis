/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

public final class lz
implements ge {
    fs a;
    public fu b;
    final Toolbar c;

    public lz(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override
    public final void b(Context object, fs fs2) {
        fs fs3 = this.a;
        if (fs3 != null && (object = this.b) != null) {
            fs3.t((fu)object);
        }
        this.a = fs2;
    }

    @Override
    public final void c(fs fs2, boolean bl2) {
    }

    @Override
    public final void d(gd gd2) {
        throw null;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f(gl gl2) {
        return false;
    }

    @Override
    public final boolean g(fu fu2) {
        Object object = this.c.i;
        if (object instanceof fw) {
            ((fw)((Object)object)).a.onActionViewCollapsed();
        }
        object = this.c;
        object.removeView(object.i);
        object = this.c;
        object.removeView((View)object.h);
        object = this.c;
        object.i = null;
        int n2 = object.v.size();
        while (--n2 >= 0) {
            object.addView((View)object.v.get(n2));
        }
        object.v.clear();
        this.b = null;
        this.c.requestLayout();
        fu2.h(false);
        this.c.w();
        return true;
    }

    @Override
    public final boolean h(fu fu2) {
        int n2;
        Object object;
        Toolbar toolbar = this.c;
        if (toolbar.h == null) {
            toolbar.h = new hl(toolbar.getContext(), null, 2130970109);
            toolbar.h.setImageDrawable(toolbar.f);
            toolbar.h.setContentDescription(toolbar.g);
            object = new ma();
            object.a = toolbar.n & 0x70 | 0x800003;
            object.b = 2;
            toolbar.h.setLayoutParams((ViewGroup.LayoutParams)object);
            toolbar.h.setOnClickListener((View.OnClickListener)new gp(toolbar, 2));
        }
        if ((object = this.c.h.getParent()) != (toolbar = this.c)) {
            if (object instanceof ViewGroup) {
                ((ViewGroup)object).removeView((View)toolbar.h);
            }
            object = this.c;
            object.addView((View)object.h);
        }
        this.c.i = fu2.getActionView();
        this.b = fu2;
        toolbar = this.c.i.getParent();
        if (toolbar != (object = this.c)) {
            if (toolbar instanceof ViewGroup) {
                ((ViewGroup)toolbar).removeView(object.i);
            }
            object = new ma();
            toolbar = this.c;
            object.a = 0x800003 | toolbar.n & 0x70;
            object.b = 2;
            toolbar.i.setLayoutParams((ViewGroup.LayoutParams)object);
            object = this.c;
            object.addView(object.i);
        }
        toolbar = this.c;
        int n3 = toolbar.getChildCount();
        while ((n2 = n3 - 1) >= 0) {
            object = toolbar.getChildAt(n2);
            n3 = n2;
            if (((ma)object.getLayoutParams()).b == 2) continue;
            n3 = n2;
            if (object == toolbar.a) continue;
            toolbar.removeViewAt(n2);
            toolbar.v.add(object);
            n3 = n2;
        }
        this.c.requestLayout();
        fu2.h(true);
        fu2 = this.c.i;
        if (fu2 instanceof fw) {
            ((fw)((Object)fu2)).a.onActionViewExpanded();
        }
        this.c.w();
        return true;
    }

    @Override
    public final void i() {
        if (this.b != null) {
            fs fs2 = this.a;
            if (fs2 != null) {
                int n2 = fs2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (this.a.getItem(i2) != this.b) {
                        continue;
                    }
                    break;
                }
            } else {
                this.g(this.b);
            }
        }
    }
}

