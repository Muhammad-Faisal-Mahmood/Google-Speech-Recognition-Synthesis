/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.text.method.PasswordTransformationMethod
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class ie {
    public int a = 0;
    public Typeface b;
    public boolean c;
    private final TextView d;
    private lw e;
    private lw f;
    private lw g;
    private lw h;
    private lw i;
    private lw j;
    private final ik k;
    private int l = -1;
    private String m = null;

    public ie(TextView textView) {
        this.d = textView;
        this.k = new ik(textView);
    }

    public static void f(TextView textView, Typeface typeface, int n2) {
        Object object = id.a;
        object = ag$$ExternalSyntheticApiModelOutline0.m(textView);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            id.a(textView, null);
        }
        textView.setTypeface(typeface, n2);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            id.a(textView, (String)object);
        }
    }

    public static final void r(TextView object, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            object = object.getText();
            if (Build.VERSION.SDK_INT < 30) {
                a.Y(object);
                if (Build.VERSION.SDK_INT >= 30) {
                    wg.c(editorInfo, (CharSequence)object);
                    return;
                }
                int n2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
                int n3 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
                int n4 = object.length();
                if (n2 >= 0 && n3 <= n4) {
                    int n5 = editorInfo.inputType & 0xFFF;
                    if (n5 != 129 && n5 != 225 && n5 != 18) {
                        if (n4 > 2048) {
                            int n6 = n3 - n2;
                            n4 = object.length();
                            n5 = n6 > 1024 ? 0 : n6;
                            int n7 = 2048 - n5;
                            int n8 = Math.min(n4 - n3, n7 - Math.min(n2, (int)((double)n7 * 0.8)));
                            n7 = Math.min(n2, n7 - n8);
                            int n9 = n2 - n7;
                            n4 = n7;
                            n2 = n9;
                            if (ye.d((CharSequence)object, n9, 0)) {
                                n2 = n9 + 1;
                                n4 = n7 - 1;
                            }
                            n7 = n8;
                            if (ye.d((CharSequence)object, n3 + n8 - 1, 1)) {
                                n7 = n8 - 1;
                            }
                            n8 = n4 + n5;
                            object = n5 != n6 ? TextUtils.concat((CharSequence[])new CharSequence[]{object.subSequence(n2, n2 + n4), object.subSequence(n3, n7 + n3)}) : object.subSequence(n2, n7 + n8 + n2);
                            ye.c(editorInfo, (CharSequence)object, n4, n8);
                            return;
                        }
                        ye.c(editorInfo, (CharSequence)object, n2, n3);
                        return;
                    }
                    ye.c(editorInfo, null, 0, 0);
                    return;
                }
                ye.c(editorInfo, null, 0, 0);
                return;
            }
            wg.c(editorInfo, (CharSequence)object);
        }
    }

    private static lw s(Context object, hj hj2, int n2) {
        if ((hj2 = hj2.a((Context)object, n2)) != null) {
            object = new lw();
            object.d = true;
            object.a = hj2;
            return object;
        }
        return null;
    }

    private final void t(Drawable drawable, lw lw2) {
        if (drawable != null && lw2 != null) {
            lj.g(drawable, lw2, this.d.getDrawableState());
        }
    }

    private final void u(boolean bl2) {
        Object object = this.b;
        if (object != null) {
            if (this.l == -1) {
                this.d.setTypeface(object, this.a);
            } else {
                this.d.setTypeface(object);
            }
        } else if (bl2) {
            this.d.setTypeface(null);
        }
        object = this.m;
        if (object != null) {
            id.a(this.d, (String)object);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean v(Context object, AmbientDelegate ambientDelegate) {
        int n2;
        void var2_18;
        int[] nArray = er.a;
        this.a = var2_18.m(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            this.l = n2 = var2_18.m(14, -1);
            if (n2 != -1) {
                this.a &= 2;
            }
        }
        if (var2_18.x(16)) {
            this.m = var2_18.u(16);
        }
        n2 = 10;
        boolean bl2 = var2_18.x(10);
        boolean bl3 = false;
        boolean bl4 = false;
        if (!bl2 && !var2_18.x(15)) {
            if (var2_18.x(1)) {
                void var1_5;
                this.c = false;
                n2 = var2_18.m(1, 1);
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            return true;
                        }
                        Typeface typeface = Typeface.MONOSPACE;
                    } else {
                        Typeface typeface = Typeface.SERIF;
                    }
                } else {
                    Typeface typeface = Typeface.SANS_SERIF;
                }
                this.b = var1_5;
                return true;
            }
            if (Build.VERSION.SDK_INT < 28) return false;
            n2 = this.l;
            if (n2 == -1) return false;
            Typeface typeface = this.b;
            if (typeface == null) return false;
            if ((2 & this.a) != 0) {
                bl4 = true;
            }
            this.b = fs$$ExternalSyntheticApiModelOutline0.m(typeface, n2, bl4);
            return true;
        }
        Object var9_20 = null;
        this.b = null;
        if (var2_18.x(15)) {
            n2 = 15;
        }
        int n3 = this.l;
        int n4 = this.a;
        if (!object.isRestricted()) {
            ic ic2 = new ic(this, n3, n4, new WeakReference<TextView>(this.d));
            try {
                void var1_11;
                n3 = this.a;
                n4 = ((TypedArray)var2_18.b).getResourceId(n2, 0);
                if (n4 == 0) {
                    Object var1_8 = var9_20;
                } else {
                    if (var2_18.a == null) {
                        TypedValue typedValue = new TypedValue();
                        var2_18.a = typedValue;
                    }
                    Object object2 = var2_18.c;
                    Object object3 = var2_18.a;
                    ThreadLocal threadLocal = td.a;
                    if (((Context)object2).isRestricted()) {
                        Object var1_9 = var9_20;
                    } else {
                        TypedValue typedValue = (TypedValue)object3;
                        Typeface typeface = td.a((Context)object2, n4, typedValue, n3, ic2, true, false);
                    }
                }
                if (var1_11 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.l != -1) {
                        Typeface typeface = Typeface.create((Typeface)var1_11, (int)0);
                        n3 = this.l;
                        bl4 = (this.a & 2) != 0;
                        this.b = fs$$ExternalSyntheticApiModelOutline0.m(typeface, n3, bl4);
                    } else {
                        this.b = var1_11;
                    }
                }
                bl4 = this.b == null;
                this.c = bl4;
            }
            catch (Resources.NotFoundException | UnsupportedOperationException throwable) {}
        }
        if (this.b != null) return true;
        String string = var2_18.u(n2);
        if (string == null) return true;
        if (Build.VERSION.SDK_INT >= 28 && this.l != -1) {
            Typeface typeface = Typeface.create((String)string, (int)0);
            n2 = this.l;
            bl4 = bl3;
            if ((2 & this.a) != 0) {
                bl4 = true;
            }
            this.b = fs$$ExternalSyntheticApiModelOutline0.m(typeface, n2, bl4);
            return true;
        }
        this.b = Typeface.create((String)string, (int)this.a);
        return true;
    }

    public final int a() {
        return this.k.a();
    }

    public final int b() {
        return this.k.b();
    }

    public final int c() {
        return this.k.c();
    }

    public final int d() {
        return this.k.a;
    }

    public final void e() {
        Drawable[] drawableArray;
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            drawableArray = this.d.getCompoundDrawables();
            this.t(drawableArray[0], this.e);
            this.t(drawableArray[1], this.f);
            this.t(drawableArray[2], this.g);
            this.t(drawableArray[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        drawableArray = this.d.getCompoundDrawablesRelative();
        this.t(drawableArray[0], this.i);
        this.t(drawableArray[2], this.j);
    }

    public final void g() {
        this.k.e();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(AttributeSet var1_1, int var2_2) {
        block57: {
            block58: {
                block55: {
                    block56: {
                        block54: {
                            block52: {
                                block53: {
                                    var15_3 /* !! */  = this.d.getContext();
                                    var18_4 = hj.d();
                                    var12_5 /* !! */  = AmbientDelegate.A(var15_3 /* !! */ , var1_1 /* !! */ , er.h, var2_2, 0);
                                    var14_6 = var12_5 /* !! */ .b;
                                    var13_7 /* !! */  = this.d;
                                    wj.l((View)var13_7 /* !! */ , var13_7 /* !! */ .getContext(), er.h, var1_1 /* !! */ , (TypedArray)var14_6, var2_2, 0);
                                    var7_8 = var12_5 /* !! */ .p(0, -1);
                                    if (var12_5 /* !! */ .x(3)) {
                                        this.e = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(3, 0));
                                    }
                                    if (var12_5 /* !! */ .x(1)) {
                                        this.f = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(1, 0));
                                    }
                                    if (var12_5 /* !! */ .x(4)) {
                                        this.g = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(4, 0));
                                    }
                                    if (var12_5 /* !! */ .x(2)) {
                                        this.h = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(2, 0));
                                    }
                                    if (var12_5 /* !! */ .x(5)) {
                                        this.i = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(5, 0));
                                    }
                                    if (var12_5 /* !! */ .x(6)) {
                                        this.j = ie.s(var15_3 /* !! */ , (hj)var18_4, var12_5 /* !! */ .p(6, 0));
                                    }
                                    var12_5 /* !! */ .v();
                                    var11_9 = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
                                    if (var7_8 != -1) {
                                        var13_7 /* !! */  = AmbientDelegate.y(var15_3 /* !! */ , var7_8, er.w);
                                        if (!var11_9 && var13_7 /* !! */ .x(17)) {
                                            var9_10 = var13_7 /* !! */ .w(17, false);
                                            var7_8 = 1;
                                        } else {
                                            var9_10 = false;
                                            var7_8 = 0;
                                        }
                                        this.v(var15_3 /* !! */ , (AmbientDelegate)var13_7 /* !! */ );
                                        var12_5 /* !! */  = var13_7 /* !! */ .x(18) != false ? var13_7 /* !! */ .u(18) : null;
                                        var13_7 /* !! */ .v();
                                    } else {
                                        var12_5 /* !! */  = null;
                                        var9_10 = false;
                                        var7_8 = 0;
                                    }
                                    var13_7 /* !! */  = AmbientDelegate.A(var15_3 /* !! */ , var1_1 /* !! */ , er.w, var2_2, 0);
                                    var10_11 = var9_10;
                                    var8_12 = var7_8;
                                    if (!var11_9) {
                                        var10_11 = var9_10;
                                        var8_12 = var7_8;
                                        if (var13_7 /* !! */ .x(17)) {
                                            var10_11 = var13_7 /* !! */ .w(17, false);
                                            var8_12 = 1;
                                        }
                                    }
                                    if (var13_7 /* !! */ .x(18)) {
                                        var12_5 /* !! */  = var13_7 /* !! */ .u(18);
                                    }
                                    if (Build.VERSION.SDK_INT >= 28 && var13_7 /* !! */ .x(0) && var13_7 /* !! */ .l(0, -1) == 0) {
                                        this.d.setTextSize(0, 0.0f);
                                    }
                                    this.v(var15_3 /* !! */ , (AmbientDelegate)var13_7 /* !! */ );
                                    var13_7 /* !! */ .v();
                                    if (!var11_9 && var8_12 != 0) {
                                        this.j(var10_11);
                                    }
                                    this.u(false);
                                    if (var12_5 /* !! */  != null) {
                                        ag$$ExternalSyntheticApiModelOutline1.m(this.d, ag$$ExternalSyntheticApiModelOutline1.m((String)var12_5 /* !! */ ));
                                    }
                                    var12_5 /* !! */  = this.k;
                                    var13_7 /* !! */  = var12_5 /* !! */ .i.obtainStyledAttributes(var1_1 /* !! */ , er.i, var2_2, 0);
                                    var14_6 = var12_5 /* !! */ .h;
                                    wj.l((View)var14_6, var14_6.getContext(), er.i, var1_1 /* !! */ , (TypedArray)var13_7 /* !! */ , var2_2, 0);
                                    if (var13_7 /* !! */ .hasValue(5)) {
                                        var12_5 /* !! */ .a = var13_7 /* !! */ .getInt(5, 0);
                                    }
                                    var3_13 = var13_7 /* !! */ .hasValue(4) != false ? var13_7 /* !! */ .getDimension(4, -1.0f) : -1.0f;
                                    var5_14 = var13_7 /* !! */ .hasValue(2) != false ? var13_7 /* !! */ .getDimension(2, -1.0f) : -1.0f;
                                    var4_15 = var13_7 /* !! */ .hasValue(1) != false ? var13_7 /* !! */ .getDimension(1, -1.0f) : -1.0f;
                                    if (var13_7 /* !! */ .hasValue(3) && (var2_2 = var13_7 /* !! */ .getResourceId(3, 0)) > 0) {
                                        var14_6 = var13_7 /* !! */ .getResources().obtainTypedArray(var2_2);
                                        var7_8 = var14_6.length();
                                        var16_16 /* !! */  = new int[var7_8];
                                        if (var7_8 > 0) {
                                            for (var2_2 = 0; var2_2 < var7_8; ++var2_2) {
                                                var16_16 /* !! */ [var2_2] = var14_6.getDimensionPixelSize(var2_2, -1);
                                            }
                                            var12_5 /* !! */ .f = ik.l(var16_16 /* !! */ );
                                            var12_5 /* !! */ .j();
                                        }
                                        var14_6.recycle();
                                    }
                                    var13_7 /* !! */ .recycle();
                                    if (var12_5 /* !! */ .k()) {
                                        if (var12_5 /* !! */ .a == 1) {
                                            if (!var12_5 /* !! */ .g) {
                                                var13_7 /* !! */  = var12_5 /* !! */ .i.getResources().getDisplayMetrics();
                                                if (var5_14 == -1.0f) {
                                                    var5_14 = TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)var13_7 /* !! */ );
                                                }
                                                var6_17 = var4_15;
                                                if (var4_15 == -1.0f) {
                                                    var6_17 = TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)var13_7 /* !! */ );
                                                }
                                                var4_15 = var3_13;
                                                if (var3_13 == -1.0f) {
                                                    var4_15 = 1.0f;
                                                }
                                                var12_5 /* !! */ .g(var5_14, var6_17, var4_15);
                                            }
                                            var12_5 /* !! */ .i();
                                        }
                                    } else {
                                        var12_5 /* !! */ .a = 0;
                                    }
                                    if (mi.c) {
                                        var12_5 /* !! */  = this.k;
                                        if (var12_5 /* !! */ .a != 0 && ((TextView)(var13_7 /* !! */  = (TextView)var12_5 /* !! */ .f)).length > 0) {
                                            var14_6 = this.d;
                                            var12_5 /* !! */  = id.a;
                                            if ((float)ag$$ExternalSyntheticApiModelOutline0.m((TextView)var14_6) != -1.0f) {
                                                var13_7 /* !! */  = this.d;
                                                var12_5 /* !! */  = this.k;
                                                ag$$ExternalSyntheticApiModelOutline0.m(var13_7 /* !! */ , var12_5 /* !! */ .b(), var12_5 /* !! */ .a(), var12_5 /* !! */ .c(), 0);
                                            } else {
                                                ag$$ExternalSyntheticApiModelOutline0.m(this.d, (int[])var13_7 /* !! */ , 0);
                                            }
                                        }
                                    }
                                    var13_7 /* !! */  = (var2_2 = (var17_18 = AmbientDelegate.z(var15_3 /* !! */ , var1_1 /* !! */ , er.i)).p(8, -1)) != -1 ? var18_4.c(var15_3 /* !! */ , var2_2) : null;
                                    var2_2 = var17_18.p(13, -1);
                                    var12_5 /* !! */  = var2_2 != -1 ? var18_4.c(var15_3 /* !! */ , var2_2) : null;
                                    var2_2 = var17_18.p(9, -1);
                                    var14_6 = var2_2 != -1 ? var18_4.c(var15_3 /* !! */ , var2_2) : null;
                                    var2_2 = var17_18.p(6, -1);
                                    var1_1 /* !! */  = var2_2 != -1 ? var18_4.c(var15_3 /* !! */ , var2_2) : null;
                                    var2_2 = var17_18.p(10, -1);
                                    var16_16 /* !! */  = (int[])(var2_2 != -1 ? (int[])var18_4.c(var15_3 /* !! */ , var2_2) : null);
                                    var2_2 = var17_18.p(7, -1);
                                    var15_3 /* !! */  = var2_2 != -1 ? var18_4.c(var15_3 /* !! */ , var2_2) : null;
                                    if (var16_16 /* !! */  != null) break block52;
                                    if (var15_3 /* !! */  == null) break block53;
                                    if (var1_1 /* !! */  == null) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                if (var13_7 /* !! */  != null || var12_5 /* !! */  != null || var14_6 != null || var1_1 /* !! */  != null) {
                                    var16_16 /* !! */  = (int[])this.d.getCompoundDrawablesRelative();
                                    var15_3 /* !! */  = (Context)var16_16 /* !! */ [0];
                                    if (var15_3 /* !! */  == null && var16_16 /* !! */ [2] == null) {
                                        var16_16 /* !! */  = (int[])this.d;
                                        var18_4 = var16_16 /* !! */ .getCompoundDrawables();
                                        var15_3 /* !! */  = var13_7 /* !! */ ;
                                        if (var13_7 /* !! */  == null) {
                                            var15_3 /* !! */  = var18_4[0];
                                        }
                                        var13_7 /* !! */  = var12_5 /* !! */ ;
                                        if (var12_5 /* !! */  == null) {
                                            var13_7 /* !! */  = var18_4[1];
                                        }
                                        var12_5 /* !! */  = var14_6;
                                        if (var14_6 == null) {
                                            var12_5 /* !! */  = var18_4[2];
                                        }
                                        var14_6 = var1_1 /* !! */ ;
                                        if (var1_1 /* !! */  == null) {
                                            var14_6 = var18_4[3];
                                        }
                                        var16_16 /* !! */ .setCompoundDrawablesWithIntrinsicBounds((Drawable)var15_3 /* !! */ , (Drawable)var13_7 /* !! */ , (Drawable)var12_5 /* !! */ , (Drawable)var14_6);
                                    } else {
                                        var13_7 /* !! */  = var12_5 /* !! */ ;
                                        if (var12_5 /* !! */  == null) {
                                            var13_7 /* !! */  = (TextView)var16_16 /* !! */ [1];
                                        }
                                        var12_5 /* !! */  = var1_1 /* !! */ ;
                                        if (var1_1 /* !! */  == null) {
                                            var12_5 /* !! */  = var16_16 /* !! */ [3];
                                        }
                                        this.d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)var15_3 /* !! */ , (Drawable)var13_7 /* !! */ , (Drawable)var16_16 /* !! */ [2], (Drawable)var12_5 /* !! */ );
                                    }
                                }
                                break block54;
                            }
                            if (var1_1 /* !! */  != null) lbl-1000:
                            // 2 sources

                            {
                                var2_2 = 0;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var2_2 = 1;
                            }
                            var18_4 = this.d.getCompoundDrawablesRelative();
                            var13_7 /* !! */  = (TextView)var16_16 /* !! */ ;
                            if (var16_16 /* !! */  == null) {
                                var13_7 /* !! */  = var18_4[0];
                            }
                            var14_6 = var12_5 /* !! */ ;
                            if (var12_5 /* !! */  == null) {
                                var14_6 = var18_4[1];
                            }
                            var12_5 /* !! */  = var15_3 /* !! */ ;
                            if (var15_3 /* !! */  == null) {
                                var12_5 /* !! */  = var18_4[2];
                            }
                            var15_3 /* !! */  = this.d;
                            if (1 == var2_2) {
                                var1_1 /* !! */  = var18_4[3];
                            }
                            var15_3 /* !! */ .setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)var13_7 /* !! */ , (Drawable)var14_6, (Drawable)var12_5 /* !! */ , (Drawable)var1_1 /* !! */ );
                        }
                        if (var17_18.x(11)) {
                            var1_1 /* !! */  = var17_18.q(11);
                            this.d.setCompoundDrawableTintList((ColorStateList)var1_1 /* !! */ );
                        }
                        if (var17_18.x(12)) {
                            var1_1 /* !! */  = a.e(var17_18.m(12, -1), null);
                            this.d.setCompoundDrawableTintMode((PorterDuff.Mode)var1_1 /* !! */ );
                        }
                        var7_8 = var17_18.l(15, -1);
                        var8_12 = var17_18.l(18, -1);
                        if (!var17_18.x(19)) break block55;
                        var1_1 /* !! */  = ((TypedArray)var17_18.b).peekValue(19);
                        if (var1_1 /* !! */  == null || var1_1 /* !! */ .type != 5) break block56;
                        var2_2 = var1_1 /* !! */ .data;
                        var3_13 = TypedValue.complexToFloat((int)var1_1 /* !! */ .data);
                        var2_2 &= 15;
                        break block57;
                    }
                    var3_13 = var17_18.l(19, -1);
                    break block58;
                }
                var3_13 = -1.0f;
            }
            var2_2 = -1;
        }
        var17_18.v();
        if (var7_8 != -1) {
            yj.f(this.d, var7_8);
        }
        if (var8_12 != -1) {
            yj.g(this.d, var8_12);
        }
        if (var3_13 != -1.0f) {
            if (var2_2 == -1) {
                yj.h(this.d, (int)var3_13);
                return;
            }
            yj.i(this.d, var2_2, var3_13);
        }
    }

    public final void i(Context context, int n2) {
        AmbientDelegate ambientDelegate = AmbientDelegate.y(context, n2, er.w);
        if (ambientDelegate.x(17)) {
            this.j(ambientDelegate.w(17, false));
        }
        if (ambientDelegate.x(0) && ambientDelegate.l(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean bl2 = this.v(context, ambientDelegate);
        ambientDelegate.v();
        this.u(bl2);
    }

    final void j(boolean bl2) {
        this.d.setAllCaps(bl2);
    }

    public final void k(int n2, int n3, int n4, int n5) {
        ik ik2 = this.k;
        if (ik2.k()) {
            DisplayMetrics displayMetrics = ik2.i.getResources().getDisplayMetrics();
            ik2.g(TypedValue.applyDimension((int)n5, (float)n2, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n5, (float)n3, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n5, (float)n4, (DisplayMetrics)displayMetrics));
            if (ik2.i()) {
                ik2.e();
            }
        }
    }

    public final void l(int[] nArray, int n2) {
        ik ik2 = this.k;
        if (ik2.k()) {
            int n3 = nArray.length;
            int n4 = 0;
            if (n3 > 0) {
                int[] nArray2;
                int[] nArray3 = new int[n3];
                if (n2 == 0) {
                    nArray2 = Arrays.copyOf(nArray, n3);
                } else {
                    DisplayMetrics displayMetrics = ik2.i.getResources().getDisplayMetrics();
                    while (true) {
                        nArray2 = nArray3;
                        if (n4 >= n3) break;
                        nArray3[n4] = Math.round(TypedValue.applyDimension((int)n2, (float)nArray[n4], (DisplayMetrics)displayMetrics));
                        ++n4;
                    }
                }
                ik2.f = ik.l(nArray2);
                if (!ik2.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(nArray))));
                }
            } else {
                ik2.g = false;
            }
            if (ik2.i()) {
                ik2.e();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void m(int n2) {
        ik ik2 = this.k;
        if (!ik2.k()) return;
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalArgumentException(a.af(n2, "Unknown auto-size text type: "));
            DisplayMetrics displayMetrics = ik2.i.getResources().getDisplayMetrics();
            ik2.g(TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)displayMetrics), 1.0f);
            if (!ik2.i()) return;
            ik2.e();
            return;
        }
        ik2.a = 0;
        ik2.d = -1.0f;
        ik2.e = -1.0f;
        ik2.c = -1.0f;
        ik2.f = new int[0];
        ik2.b = false;
    }

    public final void n(int n2, float f2) {
        if (!mi.c && !this.o()) {
            this.k.f(n2, f2);
        }
    }

    public final boolean o() {
        return this.k.h();
    }

    public final int[] p() {
        return this.k.f;
    }

    public final void q() {
        if (!mi.c) {
            this.g();
        }
    }
}

