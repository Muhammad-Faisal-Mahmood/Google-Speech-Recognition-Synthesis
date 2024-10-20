/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.os.Build$VERSION
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.Window
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;

public final class fva
extends dm {
    private final Drawable b;
    private final Rect c;

    public fva(Context context) {
        int n2 = fva.l(context);
        Object object = fyl.a(context, null, 2130968628, 2132083130);
        if (n2 != 0) {
            object = new nx((Context)object, n2);
        }
        super((Context)object, fva.l(context));
        object = this.a();
        context = object.getTheme();
        Object object2 = fwl.c(object, null, fvb.a, 2130968628, 2132083130);
        int n3 = object2.getDimensionPixelSize(2, object.getResources().getDimensionPixelSize(2131166325));
        int n4 = object2.getDimensionPixelSize(3, object.getResources().getDimensionPixelSize(2131166326));
        n2 = object2.getDimensionPixelSize(1, object.getResources().getDimensionPixelSize(2131166324));
        int n5 = object2.getDimensionPixelSize(0, object.getResources().getDimensionPixelSize(2131166323));
        object2.recycle();
        int n6 = object.getResources().getConfiguration().getLayoutDirection();
        int n7 = n6 == 1 ? n2 : n3;
        if (n6 != 1) {
            n3 = n2;
        }
        this.c = new Rect(n7, n4, n3, n5);
        n2 = fvc.j(object, fvc.r(object, 2130968966, this.getClass().getCanonicalName()));
        object2 = object.obtainStyledAttributes(null, fvb.a, 2130968628, 2132083130);
        n2 = object2.getColor(4, n2);
        object2.recycle();
        object2 = new fxi(new fxm(fxm.f(object, null, 2130968628, 2132083130)));
        ((fxi)object2).i((Context)object);
        ((fxi)object2).l(ColorStateList.valueOf((int)n2));
        if (Build.VERSION.SDK_INT >= 28) {
            object = new TypedValue();
            context.resolveAttribute(16844145, (TypedValue)object, true);
            float f2 = object.getDimension(this.a().getResources().getDisplayMetrics());
            if (object.type == 5 && f2 >= 0.0f) {
                ((fxi)object2).c(((fxi)object2).a.a.b(f2));
            }
        }
        this.b = object2;
    }

    private static int l(Context context) {
        if ((context = fvc.q(context, 2130969512)) == null) {
            return 0;
        }
        return context.data;
    }

    @Override
    public final dn b() {
        dn dn2 = super.b();
        Window window = dn2.getWindow();
        View view = window.getDecorView();
        float f2 = wa.a(view);
        ((fxi)this.b).k(f2);
        Drawable drawable = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable((Drawable)new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        view.setOnTouchListener((View.OnTouchListener)new fuz(dn2, this.c));
        return dn2;
    }

    public final void h(CharSequence charSequence) {
        super.d(charSequence);
    }

    public final void i(DialogInterface.OnClickListener onClickListener) {
        di di2 = this.a;
        di2.i = di2.a.getText(2132017264);
        di2.j = onClickListener;
    }

    public final void j(DialogInterface.OnClickListener onClickListener) {
        di di2 = this.a;
        di2.g = di2.a.getText(2132017266);
        di2.h = onClickListener;
    }

    public final void k(CharSequence charSequence) {
        super.g(charSequence);
    }
}

