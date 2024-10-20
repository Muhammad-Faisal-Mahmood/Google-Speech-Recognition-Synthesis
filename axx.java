/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.view.View
 *  android.view.WindowId
 */
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.WindowId;

public final class axx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public axx() {
        this.d = new int[]{2131230894, 2131230892, 2131230818};
        this.c = new int[]{2131230842, 2131230877, 2131230849, 2131230844, 2131230845, 2131230848, 2131230847};
        this.a = new int[]{2131230891, 2131230893, 2131230835, 2131230887, 2131230888, 2131230889, 2131230890};
        this.f = new int[]{2131230867, 2131230833, 2131230866};
        this.b = new int[]{2131230885, 2131230895};
        this.e = new int[]{2131230821, 2131230827, 2131230822, 2131230828};
    }

    public axx(View view, String string, ayc ayc2, WindowId windowId, aym aym2, Animator animator) {
        this.a = view;
        this.b = string;
        this.c = aym2;
        this.d = windowId;
        this.e = ayc2;
        this.f = animator;
    }

    public static final boolean a(int[] nArray, int n2) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static final ColorStateList b(Context context, int n2) {
        int n3 = lt.b(context, 2130968891);
        int n4 = lt.a(context, 2130968886);
        int n5 = tf.b(n3, n2);
        n3 = tf.b(n3, n2);
        return new ColorStateList((int[][])new int[][]{lt.a, lt.c, lt.b, lt.e}, new int[]{n4, n5, n3, n2});
    }

    public static final LayerDrawable c(lj lj2, Context context, int n2) {
        n2 = context.getResources().getDimensionPixelSize(n2);
        Drawable drawable = lj2.c(context, 2131230881);
        Drawable drawable2 = lj2.c(context, 2131230882);
        if (drawable instanceof BitmapDrawable && drawable.getIntrinsicWidth() == n2 && drawable.getIntrinsicHeight() == n2) {
            context = (BitmapDrawable)drawable;
            lj2 = new BitmapDrawable(context.getBitmap());
        } else {
            lj2 = Bitmap.createBitmap((int)n2, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            context = new Canvas((Bitmap)lj2);
            drawable.setBounds(0, 0, n2, n2);
            drawable.draw((Canvas)context);
            context = new BitmapDrawable((Bitmap)lj2);
            lj2 = new BitmapDrawable((Bitmap)lj2);
        }
        lj2.setTileModeX(Shader.TileMode.REPEAT);
        if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == n2 && drawable2.getIntrinsicHeight() == n2) {
            drawable2 = (BitmapDrawable)drawable2;
        } else {
            Bitmap bitmap = Bitmap.createBitmap((int)n2, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            drawable = new Canvas(bitmap);
            drawable2.setBounds(0, 0, n2, n2);
            drawable2.draw((Canvas)drawable);
            drawable2 = new BitmapDrawable(bitmap);
        }
        lj2 = new LayerDrawable(new Drawable[]{context, drawable2, lj2});
        lj2.setId(0, 0x1020000);
        lj2.setId(1, 16908303);
        lj2.setId(2, 16908301);
        return lj2;
    }

    public static final void d(Drawable drawable, int n2, PorterDuff.Mode mode) {
        Drawable drawable2 = drawable.mutate();
        drawable = mode;
        if (mode == null) {
            drawable = hj.a;
        }
        drawable2.setColorFilter((ColorFilter)hj.b(n2, (PorterDuff.Mode)drawable));
    }
}

