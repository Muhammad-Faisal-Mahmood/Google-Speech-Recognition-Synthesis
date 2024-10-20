/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ContentFrameLayout
extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h = new Rect();
    public AmbientMode$AmbientController i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.i;
        if (object != null) {
            Object object2 = ((AmbientMode$AmbientController)object).a;
            object = (eg)object2;
            io io2 = ((eg)object).p;
            if (io2 != null) {
                io2.a();
            }
            if (((eg)object).s != null) {
                ((eg)object).l.getDecorView().removeCallbacks(((eg)object).t);
                if (((eg)object).s.isShowing()) {
                    try {
                        ((eg)object2).s.dismiss();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {}
                }
                ((eg)object).s = null;
            }
            ((eg)object).C();
            object = ((eg)object).N((int)0).h;
            if (object != null) {
                ((fs)object).close();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected final void onMeasure(int var1_1, int var2_2) {
        var11_3 = this.getContext().getResources().getDisplayMetrics();
        var4_4 = var11_3.widthPixels;
        var5_5 = var11_3.heightPixels;
        var9_6 = View.MeasureSpec.getMode((int)var1_1);
        var8_7 = 1;
        var4_4 = var4_4 < var5_5 ? 1 : 0;
        var7_8 = View.MeasureSpec.getMode((int)var2_2);
        if (var9_6 != -2147483648 || (var10_9 = var4_4 != 0 ? this.e : this.d) == null || var10_9.type == 0) ** GOTO lbl-1000
        if (var10_9.type == 5) {
            var3_10 = var10_9.getDimension(var11_3);
lbl11:
            // 2 sources

            while (true) {
                var5_5 = (int)var3_10;
                break;
            }
        } else {
            if (var10_9.type == 6) {
                var3_10 = var10_9.getFraction((float)var11_3.widthPixels, (float)var11_3.widthPixels);
                ** continue;
            }
            var5_5 = 0;
        }
        if (var5_5 > 0) {
            var10_9 = this.h;
            var6_11 = View.MeasureSpec.makeMeasureSpec((int)Math.min(var5_5 - (var10_9.left + var10_9.right), View.MeasureSpec.getSize((int)var1_1)), (int)0x40000000);
            var1_1 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = 0;
            var6_11 = var1_1;
            var1_1 = var5_5;
        }
        var5_5 = var2_2;
        if (var7_8 == -2147483648) {
            var10_9 = var4_4 != 0 ? this.f : this.g;
            var5_5 = var2_2;
            if (var10_9 != null) {
                var5_5 = var2_2;
                if (var10_9.type != 0) {
                    if (var10_9.type == 5) {
                        var3_10 = var10_9.getDimension(var11_3);
lbl35:
                        // 2 sources

                        while (true) {
                            var7_8 = (int)var3_10;
                            break;
                        }
                    } else {
                        if (var10_9.type == 6) {
                            var3_10 = var10_9.getFraction((float)var11_3.heightPixels, (float)var11_3.heightPixels);
                            ** continue;
                        }
                        var7_8 = 0;
                    }
                    var5_5 = var2_2;
                    if (var7_8 > 0) {
                        var10_9 = this.h;
                        var5_5 = View.MeasureSpec.makeMeasureSpec((int)Math.min(var7_8 - (var10_9.top + var10_9.bottom), View.MeasureSpec.getSize((int)var2_2)), (int)0x40000000);
                    }
                }
            }
        }
        super.onMeasure(var6_11, var5_5);
        var7_8 = this.getMeasuredWidth();
        var6_11 = View.MeasureSpec.makeMeasureSpec((int)var7_8, (int)0x40000000);
        if (var1_1 != 0 || var9_6 != -2147483648 || (var10_9 = var4_4 != 0 ? this.c : this.b) == null || var10_9.type == 0) ** GOTO lbl-1000
        if (var10_9.type == 5) {
            var3_10 = var10_9.getDimension(var11_3);
lbl52:
            // 2 sources

            while (true) {
                var1_1 = (int)var3_10;
                break;
            }
        } else {
            if (var10_9.type == 6) {
                var3_10 = var10_9.getFraction((float)var11_3.widthPixels, (float)var11_3.widthPixels);
                ** continue;
            }
            var1_1 = 0;
        }
        var2_2 = var1_1;
        if (var1_1 > 0) {
            var10_9 = this.h;
            var2_2 = var1_1 - (var10_9.left + var10_9.right);
        }
        if (var7_8 < var2_2) {
            var2_2 = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)0x40000000);
            var1_1 = var8_7;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = 0;
            var2_2 = var6_11;
        }
        if (var1_1 != 0) {
            super.onMeasure(var2_2, var5_5);
        }
    }
}

