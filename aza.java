/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Picture
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class aza
extends ayc {
    private static final String[] v = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    public int u = 3;

    public static final void N(aym aym2) {
        int n2 = aym2.b.getVisibility();
        aym2.a.put("android:visibility:visibility", n2);
        Object object = aym2.b.getParent();
        aym2.a.put("android:visibility:parent", object);
        object = new int[2];
        aym2.b.getLocationOnScreen((int[])object);
        aym2.a.put("android:visibility:screenLocation", object);
    }

    /*
     * Unable to fully structure code
     */
    private static final ayz O(aym var0, aym var1_1) {
        block9: {
            block12: {
                block14: {
                    block13: {
                        block10: {
                            block11: {
                                var4_2 = new ayz();
                                var4_2.a = false;
                                var4_2.b = false;
                                if (var0 != null && var0.a.containsKey("android:visibility:visibility")) {
                                    var4_2.c = (Integer)var0.a.get("android:visibility:visibility");
                                    var4_2.e = (ViewGroup)var0.a.get("android:visibility:parent");
                                } else {
                                    var4_2.c = -1;
                                    var4_2.e = null;
                                }
                                if (var1_1 != null && var1_1.a.containsKey("android:visibility:visibility")) {
                                    var4_2.d = (Integer)var1_1.a.get("android:visibility:visibility");
                                    var4_2.f = (ViewGroup)var1_1.a.get("android:visibility:parent");
                                } else {
                                    var4_2.d = -1;
                                    var4_2.f = null;
                                }
                                if (var0 == null || var1_1 == null) break block10;
                                var2_3 = var4_2.c;
                                var3_4 = var4_2.d;
                                if (var2_3 == var3_4 && var4_2.e == var4_2.f) break block9;
                                if (var2_3 == var3_4) break block11;
                                if (var2_3 == 0) break block12;
                                if (var3_4 != 0) break block9;
                                break block13;
                            }
                            if (var4_2.f == null) break block12;
                            if (var4_2.e != null) break block9;
                            break block13;
                        }
                        if (var0 != null || var4_2.d != 0) break block14;
                    }
                    var4_2.b = true;
lbl32:
                    // 2 sources

                    while (true) {
                        var4_2.a = true;
                        break block9;
                        break;
                    }
                }
                if (var1_1 != null || var4_2.c != 0) break block9;
            }
            var4_2.b = false;
            ** while (true)
        }
        return var4_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean B(aym object, aym aym2) {
        boolean bl2 = false;
        if (object == null) {
            if (aym2 == null) return false;
        }
        if (object != null && aym2 != null) {
            Map map = aym2.a;
            Map map2 = ((aym)object).a;
            if (map.containsKey("android:visibility:visibility") != map2.containsKey("android:visibility:visibility")) return false;
        }
        object = aza.O((aym)object, aym2);
        boolean bl3 = bl2;
        if (!((ayz)object).a) return bl3;
        if (((ayz)object).c == 0) return true;
        if (((ayz)object).d == 0) return true;
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Animator a(ViewGroup var1_1, aym var2_2, aym var3_3) {
        block32: {
            block30: {
                block37: {
                    block47: {
                        block39: {
                            block46: {
                                block41: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block43: {
                                                    block40: {
                                                        block31: {
                                                            block38: {
                                                                block36: {
                                                                    block33: {
                                                                        block34: {
                                                                            block35: {
                                                                                var17_4 = var2_2;
                                                                                var19_5 = aza.O(var2_2, var3_3);
                                                                                var15_6 = var19_5.a;
                                                                                var18_7 = null;
                                                                                if (!var15_6 || var19_5.e == null && var19_5.f == null) break block32;
                                                                                var15_6 = var19_5.b;
                                                                                var7_8 = 1;
                                                                                if (!var15_6) break block33;
                                                                                if ((this.u & 1) != 1 || var3_3 == null) break block34;
                                                                                var1_1 /* !! */  = var17_4;
                                                                                if (var17_4 != null) break block35;
                                                                                var1_1 /* !! */  = (View)var3_3.b.getParent();
                                                                                if (aza.O((aym)this.k((View)var1_1 /* !! */ , (boolean)false), (aym)this.l((View)var1_1 /* !! */ , (boolean)false)).a) break block34;
                                                                                var1_1 /* !! */  = null;
                                                                            }
                                                                            return this.f(var3_3.b, (aym)var1_1 /* !! */ );
                                                                        }
                                                                        return null;
                                                                    }
                                                                    var8_9 /* !! */  = var19_5.d;
                                                                    if ((this.u & 2) != 2) lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        while (true) {
                                                                            var2_2 = var18_7;
                                                                            break block30;
                                                                            break;
                                                                        }
                                                                    }
                                                                    ** while (var17_4 == null)
lbl26:
                                                                    // 1 sources

                                                                    var21_10 = var17_4.b;
                                                                    var17_4 = var3_3 != null ? var3_3.b : null;
                                                                    var19_5 = (View)var21_10.getTag(2131427839);
                                                                    if (var19_5 == null) break block36;
                                                                    var18_7 = null;
                                                                    var17_4 = var19_5;
                                                                    break block37;
                                                                }
                                                                if (var17_4 == null || var17_4.getParent() == null) break block38;
                                                                if (var8_9 /* !! */  == 4) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        var18_7 = null;
                                                                        var7_8 = 0;
                                                                        break block31;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var21_10 == var17_4) {
                                                                    ** continue;
                                                                }
                                                                ** GOTO lbl-1000
                                                            }
                                                            if (var17_4 != null) {
                                                                var7_8 = 0;
                                                                var18_7 = var17_4;
                                                                var17_4 = null;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var17_4 = null;
                                                                var18_7 = null;
                                                                var7_8 = 1;
                                                            }
                                                        }
                                                        if (var7_8 == 0) break block39;
                                                        if (var21_10.getParent() != null) break block40;
                                                        var19_5 = var21_10;
                                                        var7_8 = 0;
                                                        var18_7 = var17_4;
                                                        var17_4 = var19_5;
                                                        break block37;
                                                    }
                                                    if (!(var21_10.getParent() instanceof View)) break block39;
                                                    var22_11 = (View)var21_10.getParent();
                                                    if (aza.O((aym)this.l((View)var22_11, (boolean)true), (aym)this.k((View)var22_11, (boolean)true)).a) break block41;
                                                    var20_12 /* !! */  = new Matrix();
                                                    var7_8 = -var22_11.getScrollX();
                                                    var9_13 /* !! */  = -var22_11.getScrollY();
                                                    var20_12 /* !! */ .setTranslate((float)var7_8, (float)var9_13 /* !! */ );
                                                    ayr.a.e(var21_10, var20_12 /* !! */ );
                                                    ayr.a.f((View)var1_1 /* !! */ , var20_12 /* !! */ );
                                                    var18_7 = new RectF(0.0f, 0.0f, (float)var21_10.getWidth(), (float)var21_10.getHeight());
                                                    var20_12 /* !! */ .mapRect((RectF)var18_7);
                                                    var11_14 = Math.round(var18_7.left);
                                                    var9_13 /* !! */  = Math.round(var18_7.top);
                                                    var10_15 = Math.round(var18_7.right);
                                                    var12_16 = Math.round(var18_7.bottom);
                                                    var22_11 = new ImageView(var21_10.getContext());
                                                    var22_11.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                    var15_6 = var21_10.isAttachedToWindow();
                                                    var16_17 = var1_1 /* !! */ .isAttachedToWindow();
                                                    if (var15_6) break block42;
                                                    if (var16_17) break block43;
                                                    var20_12 /* !! */  = null;
                                                    break block44;
                                                }
                                                var19_5 = (ViewGroup)var21_10.getParent();
                                                var7_8 = var19_5.indexOfChild(var21_10);
                                                var1_1 /* !! */ .getOverlay().add(var21_10);
                                                break block45;
                                            }
                                            var19_5 = null;
                                            var7_8 = 0;
                                        }
                                        var14_18 = Math.round(var18_7.width());
                                        var13_19 = Math.round(var18_7.height());
                                        if (var14_18 > 0 && var13_19 > 0) {
                                            var5_20 = var14_18;
                                            var6_21 = Math.min(1.0f, 1048576.0f / (float)(var14_18 * var13_19));
                                            var4_22 = var13_19;
                                            var13_19 = Math.round(var5_20 * var6_21);
                                            var14_18 = Math.round(var4_22 * var6_21);
                                            var20_12 /* !! */ .postTranslate(-var18_7.left, -var18_7.top);
                                            var20_12 /* !! */ .postScale(var6_21, var6_21);
                                            if (ayl.a) {
                                                var18_7 = new Picture();
                                                var23_23 = var18_7.beginRecording(var13_19, var14_18);
                                                var23_23.concat(var20_12 /* !! */ );
                                                var21_10.draw(var23_23);
                                                var18_7.endRecording();
                                                var18_7 = fs$$ExternalSyntheticApiModelOutline0.m((Picture)var18_7);
                                            } else {
                                                var18_7 = Bitmap.createBitmap((int)var13_19, (int)var14_18, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                                                var23_24 = new Canvas((Bitmap)var18_7);
                                                var23_24.concat(var20_12 /* !! */ );
                                                var21_10.draw(var23_24);
                                            }
                                        } else {
                                            var18_7 = null;
                                        }
                                        var20_12 /* !! */  = var18_7;
                                        if (!var15_6) {
                                            var1_1 /* !! */ .getOverlay().remove(var21_10);
                                            var19_5.addView(var21_10, var7_8);
                                            var20_12 /* !! */  = var18_7;
                                        }
                                    }
                                    if (var20_12 /* !! */  != null) {
                                        var22_11.setImageBitmap((Bitmap)var20_12 /* !! */ );
                                    }
                                    var22_11.measure(View.MeasureSpec.makeMeasureSpec((int)(var10_15 - var11_14), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(var12_16 - var9_13 /* !! */ ), (int)0x40000000));
                                    var22_11.layout(var11_14, (int)var9_13 /* !! */ , var10_15, var12_16);
                                    var19_5 = var22_11;
                                    break block46;
                                }
                                var7_8 = var22_11.getId();
                                var19_5 = var18_7;
                                if (var22_11.getParent() == null) {
                                    var19_5 = var18_7;
                                    if (var7_8 != -1) {
                                        var1_1 /* !! */ .findViewById(var7_8);
                                        var19_5 = var18_7;
                                    }
                                }
                            }
                            var18_7 = var17_4;
                            break block47;
                        }
                        var19_5 = var18_7;
                        var18_7 = var17_4;
                    }
                    var7_8 = 0;
                    var17_4 = var19_5;
                }
                if (var17_4 != null) {
                    if (var7_8 == 0) {
                        var18_7 = (int[])var2_2.a.get("android:visibility:screenLocation");
                        var8_9 /* !! */  = (int)var18_7[0];
                        var9_13 /* !! */  = var18_7[1];
                        var18_7 = new int[2];
                        var1_1 /* !! */ .getLocationOnScreen((int[])var18_7);
                        var17_4.offsetLeftAndRight(var8_9 /* !! */  - var18_7[0] - var17_4.getLeft());
                        var17_4.offsetTopAndBottom((int)(var9_13 /* !! */  - var18_7[1] - var17_4.getTop()));
                        var1_1 /* !! */ .getOverlay().add((View)var17_4);
                    }
                    var2_2 = var3_3 = this.g((View)var17_4, var2_2, var3_3);
                    if (var7_8 == 0) {
                        if (var3_3 == null) {
                            var1_1 /* !! */ .getOverlay().remove((View)var17_4);
                            var2_2 = var3_3;
                        } else {
                            var21_10.setTag(2131427839, var17_4);
                            var1_1 /* !! */  = new ayy(this, var1_1 /* !! */ , (View)var17_4, var21_10);
                            var3_3.addListener((Animator.AnimatorListener)var1_1 /* !! */ );
                            var3_3.addPauseListener((Animator.AnimatorPauseListener)var1_1 /* !! */ );
                            this.j().D((axz)var1_1 /* !! */ );
                            var2_2 = var3_3;
                        }
                    }
                } else if (var18_7 != null) {
                    var7_8 = var18_7.getVisibility();
                    ayr.d((View)var18_7, 0);
                    var2_2 = this.g((View)var18_7, var2_2, var3_3);
                    if (var2_2 != null) {
                        var1_1 /* !! */  = new ayx((View)var18_7, var8_9 /* !! */ );
                        var2_2.addListener((Animator.AnimatorListener)var1_1 /* !! */ );
                        this.j().D((axz)var1_1 /* !! */ );
                    } else {
                        ayr.d((View)var18_7, var7_8);
                    }
                } else {
                    var2_2 = null;
                }
            }
            return var2_2;
        }
        return null;
    }

    @Override
    public final void b(aym aym2) {
        aza.N(aym2);
    }

    @Override
    public void c(aym aym2) {
        throw null;
    }

    @Override
    public final String[] e() {
        return v;
    }

    public Animator f(View view, aym aym2) {
        throw null;
    }

    public Animator g(View view, aym aym2, aym aym3) {
        throw null;
    }
}

