/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public final class dn
extends ei
implements DialogInterface {
    public final dl a = new dl(this.getContext(), this, this.getWindow());

    protected dn(Context context, int n2) {
        super(context, dn.a(context, n2));
    }

    static int a(Context context, int n2) {
        if (n2 >>> 24 > 0) {
            return n2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968629, typedValue, true);
        return typedValue.resourceId;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected final void onCreate(Bundle var1_1) {
        block41: {
            block43: {
                block42: {
                    super.onCreate(var1_1 /* !! */ );
                    var12_2 = this.a;
                    var2_3 = var12_2.B;
                    var12_2.b.setContentView(var12_2.A);
                    var1_1 /* !! */  = var12_2.c.findViewById(2131427799);
                    var16_4 = var1_1 /* !! */ .findViewById(2131427958);
                    var13_5 = var1_1 /* !! */ .findViewById(2131427579);
                    var15_6 /* !! */  = var1_1 /* !! */ .findViewById(2131427457);
                    var14_7 = (ViewGroup)var1_1 /* !! */ .findViewById(2131427590);
                    var11_8 /* !! */  = var12_2.g;
                    var1_1 /* !! */  = var11_8 /* !! */ ;
                    if (var11_8 /* !! */  == null) {
                        var1_1 /* !! */  = null;
                    }
                    var7_9 = 0;
                    var2_3 = var1_1 /* !! */  != null ? 1 : 0;
                    if (var2_3 != 0 && dl.c((View)var1_1 /* !! */ )) ** GOTO lbl-1000
                    var12_2.c.setFlags(131072, 131072);
                    if (var2_3 != 0) lbl-1000:
                    // 2 sources

                    {
                        ((FrameLayout)var12_2.c.findViewById(2131427589)).addView((View)var1_1 /* !! */ , new ViewGroup.LayoutParams(-1, -1));
                        var10_10 = var12_2.h;
                        if (var12_2.f != null) {
                            ((jo)var14_7.getLayoutParams()).weight = 0.0f;
                        }
                    } else {
                        var14_7.setVisibility(8);
                    }
                    var1_1 /* !! */  = var14_7.findViewById(2131427958);
                    var17_11 = var14_7.findViewById(2131427579);
                    var11_8 /* !! */  = var14_7.findViewById(2131427457);
                    var1_1 /* !! */  = dl.e((View)var1_1 /* !! */ , var16_4);
                    var13_5 = dl.e(var17_11, var13_5);
                    var11_8 /* !! */  = dl.e(var11_8 /* !! */ , var15_6 /* !! */ );
                    var12_2.r = (NestedScrollView)var12_2.c.findViewById(2131427846);
                    var12_2.r.setFocusable(false);
                    var12_2.r.setNestedScrollingEnabled(false);
                    var12_2.w = (TextView)var13_5.findViewById(16908299);
                    var16_4 = var12_2.w;
                    if (var16_4 != null) {
                        var15_6 /* !! */  = var12_2.e;
                        if (var15_6 /* !! */  != null) {
                            var16_4.setText((CharSequence)var15_6 /* !! */ );
                        } else {
                            var16_4.setVisibility(8);
                            var12_2.r.removeView((View)var12_2.w);
                            if (var12_2.f != null) {
                                var15_6 /* !! */  = (ViewGroup)var12_2.r.getParent();
                                var2_3 = var15_6 /* !! */ .indexOfChild((View)var12_2.r);
                                var15_6 /* !! */ .removeViewAt(var2_3);
                                var15_6 /* !! */ .addView((View)var12_2.f, var2_3, new ViewGroup.LayoutParams(-1, -1));
                            } else {
                                var13_5.setVisibility(8);
                            }
                        }
                    }
                    var12_2.i = (Button)var11_8 /* !! */ .findViewById(16908313);
                    var12_2.i.setOnClickListener(var12_2.I);
                    if (TextUtils.isEmpty((CharSequence)var12_2.j)) {
                        var12_2.i.setVisibility(8);
                        var2_3 = 0;
                    } else {
                        var12_2.i.setText(var12_2.j);
                        var12_2.i.setVisibility(0);
                        var2_3 = 1;
                    }
                    var12_2.l = (Button)var11_8 /* !! */ .findViewById(16908314);
                    var12_2.l.setOnClickListener(var12_2.I);
                    if (TextUtils.isEmpty((CharSequence)var12_2.m)) {
                        var12_2.l.setVisibility(8);
                    } else {
                        var12_2.l.setText(var12_2.m);
                        var12_2.l.setVisibility(0);
                        var2_3 |= 2;
                    }
                    var12_2.o = (Button)var11_8 /* !! */ .findViewById(16908315);
                    var12_2.o.setOnClickListener(var12_2.I);
                    if (TextUtils.isEmpty((CharSequence)var12_2.p)) {
                        var12_2.o.setVisibility(8);
                    } else {
                        var12_2.o.setText(var12_2.p);
                        var12_2.o.setVisibility(0);
                        var2_3 |= 4;
                    }
                    var15_6 /* !! */  = var12_2.a;
                    var16_4 = new TypedValue();
                    var15_6 /* !! */ .getTheme().resolveAttribute(2130968627, (TypedValue)var16_4, true);
                    if (var16_4.data == 0) ** GOTO lbl-1000
                    if (var2_3 == 1) {
                        dl.d(var12_2.i);
                    } else if (var2_3 == 2) {
                        dl.d(var12_2.l);
                    } else if (var2_3 == 4) {
                        dl.d(var12_2.o);
                    } else if (var2_3 == 0) {
                        var11_8 /* !! */ .setVisibility(8);
                    }
                    if (var12_2.x != null) {
                        var15_6 /* !! */  = new ViewGroup.LayoutParams(-1, -2);
                        var1_1 /* !! */ .addView(var12_2.x, 0, (ViewGroup.LayoutParams)var15_6 /* !! */ );
                        var12_2.c.findViewById(2131427954).setVisibility(8);
                    } else {
                        var12_2.u = (ImageView)var12_2.c.findViewById(16908294);
                        if (!TextUtils.isEmpty((CharSequence)var12_2.d) && var12_2.G) {
                            var12_2.v = (TextView)var12_2.c.findViewById(2131427420);
                            var12_2.v.setText(var12_2.d);
                            var2_3 = var12_2.s;
                            var15_6 /* !! */  = var12_2.t;
                            if (var15_6 /* !! */  != null) {
                                var12_2.u.setImageDrawable((Drawable)var15_6 /* !! */ );
                            } else {
                                var12_2.v.setPadding(var12_2.u.getPaddingLeft(), var12_2.u.getPaddingTop(), var12_2.u.getPaddingRight(), var12_2.u.getPaddingBottom());
                                var12_2.u.setVisibility(8);
                            }
                        } else {
                            var12_2.c.findViewById(2131427954).setVisibility(8);
                            var12_2.u.setVisibility(8);
                            var1_1 /* !! */ .setVisibility(8);
                        }
                    }
                    var3_12 = var14_7 != null && var14_7.getVisibility() != 8 ? 1 : 0;
                    var2_3 = var1_1 /* !! */  != null && var1_1 /* !! */ .getVisibility() != 8 ? 1 : 0;
                    var4_13 = var11_8 /* !! */  != null && var11_8 /* !! */ .getVisibility() != 8;
                    if (!var4_13 && var13_5 != null && (var11_8 /* !! */  = var13_5.findViewById(2131427932)) != null) {
                        var11_8 /* !! */ .setVisibility(0);
                    }
                    if (var2_3 != 0) {
                        var11_8 /* !! */  = var12_2.r;
                        if (var11_8 /* !! */  != null) {
                            var11_8 /* !! */ .setClipToPadding(true);
                        }
                        var1_1 /* !! */  = var12_2.e == null && var12_2.f == null ? null : var1_1 /* !! */ .findViewById(2131427953);
                        if (var1_1 /* !! */  != null) {
                            var1_1 /* !! */ .setVisibility(0);
                        }
                    } else if (var13_5 != null && (var1_1 /* !! */  = var13_5.findViewById(2131427933)) != null) {
                        var1_1 /* !! */ .setVisibility(0);
                    }
                    if (!((var1_1 /* !! */  = var12_2.f) instanceof AlertController$RecycleListView)) break block41;
                    if (!var4_13) break block42;
                    if (var2_3 != 0) break block41;
                    var5_14 = 0;
                    break block43;
                }
                var5_14 = var2_3;
            }
            var1_1 /* !! */  = (AlertController$RecycleListView)var1_1 /* !! */ ;
            var8_15 = var1_1 /* !! */ .getPaddingLeft();
            var5_14 = var5_14 != 0 ? var1_1 /* !! */ .getPaddingTop() : var1_1 /* !! */ .a;
            var9_16 = var1_1 /* !! */ .getPaddingRight();
            var6_17 = var4_13 != false ? var1_1 /* !! */ .getPaddingBottom() : var1_1 /* !! */ .b;
            var1_1 /* !! */ .setPadding(var8_15, var5_14, var9_16, var6_17);
        }
        if (var3_12 == 0) {
            var11_8 /* !! */  = var12_2.f;
            var1_1 /* !! */  = var11_8 /* !! */ ;
            if (var11_8 /* !! */  == null) {
                var1_1 /* !! */  = var12_2.r;
            }
            if (var1_1 /* !! */  != null) {
                var3_12 = true != var4_13 ? var7_9 : 2;
                var11_8 /* !! */  = var12_2.c.findViewById(2131427845);
                var14_7 = var12_2.c.findViewById(2131427844);
                wb.b((View)var1_1 /* !! */ , var2_3 | var3_12, 3);
                if (var11_8 /* !! */  != null) {
                    var13_5.removeView(var11_8 /* !! */ );
                }
                if (var14_7 != null) {
                    var13_5.removeView((View)var14_7);
                }
            }
        }
        if ((var1_1 /* !! */  = var12_2.f) != null && (var11_8 /* !! */  = var12_2.y) != null) {
            var1_1 /* !! */ .setAdapter((ListAdapter)var11_8 /* !! */ );
            var2_3 = var12_2.z;
            if (var2_3 >= 0) {
                var1_1 /* !! */ .setItemChecked(var2_3, true);
                var1_1 /* !! */ .setSelection(var2_3);
            }
        }
    }

    public final boolean onKeyDown(int n2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView != null && nestedScrollView.m(keyEvent)) {
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    public final boolean onKeyUp(int n2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView != null && nestedScrollView.m(keyEvent)) {
            return true;
        }
        return super.onKeyUp(n2, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.b(charSequence);
    }
}

