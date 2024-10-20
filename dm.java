/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.graphics.drawable.Drawable
 *  android.view.ContextThemeWrapper
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.widget.AdapterView;

public class dm {
    public final di a;
    private final int b;

    public dm(Context context) {
        this(context, dn.a(context, 0));
    }

    public dm(Context context, int n2) {
        this.a = new di((Context)new ContextThemeWrapper(context, dn.a(context, n2)));
        this.b = n2;
    }

    public final Context a() {
        return this.a.a;
    }

    public dn b() {
        Object object;
        dn dn2 = new dn(this.a.a, this.b);
        dl dl2 = dn2.a;
        di di2 = this.a;
        Object object2 = di2.e;
        if (object2 != null) {
            dl2.x = object2;
        } else {
            object2 = di2.d;
            if (object2 != null) {
                dl2.b((CharSequence)object2);
            }
            if ((object = di2.c) != null) {
                dl2.t = object;
                dl2.s = 0;
                object2 = dl2.u;
                if (object2 != null) {
                    object2.setVisibility(0);
                    dl2.u.setImageDrawable(object);
                }
            }
        }
        object2 = di2.f;
        if (object2 != null) {
            dl2.a((CharSequence)object2);
        }
        if ((object2 = di2.g) != null) {
            dl2.f(-1, (CharSequence)object2, di2.h);
        }
        if ((object2 = di2.i) != null) {
            dl2.f(-2, (CharSequence)object2, di2.j);
        }
        if ((object2 = di2.k) != null) {
            dl2.f(-3, (CharSequence)object2, di2.l);
        }
        if (di2.o != null || di2.p != null) {
            object = (AlertController$RecycleListView)di2.b.inflate(dl2.C, null);
            if (di2.t) {
                object2 = new df(di2, di2.a, dl2.D, di2.o, (AlertController$RecycleListView)((Object)object));
            } else {
                int n2 = di2.u ? dl2.E : dl2.F;
                object2 = di2.p;
                if (object2 == null) {
                    object2 = new dk(di2.a, n2, di2.o);
                }
            }
            dl2.y = object2;
            dl2.z = di2.v;
            if (di2.q != null) {
                object.setOnItemClickListener((AdapterView.OnItemClickListener)new dg(di2, dl2));
            } else if (di2.w != null) {
                object.setOnItemClickListener((AdapterView.OnItemClickListener)new dh(di2, (AlertController$RecycleListView)((Object)object), dl2));
            }
            if (di2.u) {
                object.setChoiceMode(1);
            } else if (di2.t) {
                object.setChoiceMode(2);
            }
            dl2.f = object;
        }
        if ((object2 = di2.r) != null) {
            dl2.g = object2;
            dl2.h = false;
        }
        dn2.setCancelable(this.a.m);
        if (this.a.m) {
            dn2.setCanceledOnTouchOutside(true);
        }
        dn2.setOnCancelListener(null);
        dn2.setOnDismissListener(null);
        object2 = this.a.n;
        if (object2 != null) {
            dn2.setOnKeyListener((DialogInterface.OnKeyListener)object2);
        }
        return dn2;
    }

    public final void c(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void d(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        di di2 = this.a;
        di2.i = charSequence;
        di2.j = onClickListener;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        di di2 = this.a;
        di2.g = charSequence;
        di2.h = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.d = charSequence;
    }
}

