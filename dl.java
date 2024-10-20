/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.ViewStub
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public final class dl {
    public final int A;
    public final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    public final boolean G;
    public final Handler H;
    public final View.OnClickListener I = new gp(this, 1);
    public final Context a;
    public final ei b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public boolean h = false;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    NestedScrollView r;
    public int s = 0;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    ListAdapter y;
    int z = -1;

    public dl(Context context, ei ei2, Window window) {
        this.a = context;
        this.b = ei2;
        this.c = window;
        this.H = new dj((DialogInterface)ei2);
        context = context.obtainStyledAttributes(null, er.e, 2130968628, 0);
        this.A = context.getResourceId(0, 0);
        this.B = context.getResourceId(2, 0);
        this.C = context.getResourceId(4, 0);
        this.D = context.getResourceId(5, 0);
        this.E = context.getResourceId(7, 0);
        this.F = context.getResourceId(3, 0);
        this.G = context.getBoolean(6, true);
        context.getDimensionPixelSize(1, 0);
        context.recycle();
        ei2.b().p(1);
    }

    static boolean c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        view = (ViewGroup)view;
        int n2 = view.getChildCount();
        while (n2 > 0) {
            int n3;
            n2 = n3 = n2 - 1;
            if (!dl.c(view.getChildAt(n3))) continue;
            return true;
        }
        return false;
    }

    public static final void d(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    public static final ViewGroup e(View view, View view2) {
        ViewParent viewParent;
        if (view == null) {
            view = view2;
            if (view2 instanceof ViewStub) {
                view = ((ViewStub)view2).inflate();
            }
            return (ViewGroup)view;
        }
        if (view2 != null && (viewParent = view2.getParent()) instanceof ViewGroup) {
            ((ViewGroup)viewParent).removeView(view2);
        }
        view2 = view;
        if (view instanceof ViewStub) {
            view2 = ((ViewStub)view).inflate();
        }
        return (ViewGroup)view2;
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void f(int n2, CharSequence charSequence, DialogInterface.OnClickListener object) {
        object = object != null ? this.H.obtainMessage(n2, object) : null;
        if (n2 != -3) {
            if (n2 != -2) {
                this.j = charSequence;
                this.k = object;
                return;
            }
            this.m = charSequence;
            this.n = object;
            return;
        }
        this.p = charSequence;
        this.q = object;
    }
}

