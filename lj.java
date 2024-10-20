/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.LayerDrawable
 *  android.util.TypedValue
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class lj {
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static lj b;
    private static final oz g;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private axx h;

    static {
        g = new oz(6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter b(int n2, PorterDuff.Mode mode) {
        synchronized (lj.class) {
            oz oz2 = g;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter)oz2.a(oz.c(n2, mode));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(n2, mode);
                mode = (PorterDuffColorFilter)oz2.b(oz.c(n2, mode), porterDuffColorFilter);
                return porterDuffColorFilter;
            }
            return porterDuffColorFilter;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static lj e() {
        synchronized (lj.class) {
            lj lj2;
            if (b != null) return b;
            b = lj2 = new lj();
            return b;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static void g(Drawable drawable, lw lw2, int[] nArray) {
        int[] nArray2 = drawable.getState();
        if (drawable.mutate() == drawable) {
            void var4_6;
            if (drawable instanceof LayerDrawable && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(nArray2);
            }
            boolean bl2 = lw2.d;
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (!bl2) {
                if (!lw2.c) {
                    drawable.clearColorFilter();
                    return;
                }
                Object var4_4 = null;
            } else {
                ColorStateList colorStateList = lw2.a;
            }
            lw2 = lw2.c ? lw2.b : a;
            PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilter;
            if (var4_6 != null) {
                porterDuffColorFilter2 = lw2 == null ? porterDuffColorFilter : lj.b(var4_6.getColorForState(nArray, 0), (PorterDuff.Mode)lw2);
            }
            drawable.setColorFilter(porterDuffColorFilter2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Drawable i(Context objectArray, long l2) {
        synchronized (this) {
            ox ox2 = (ox)this.d.get(objectArray);
            if (ox2 != null) {
                Object object = (WeakReference)ox2.c(l2);
                if (object == null) return null;
                if ((object = (Drawable.ConstantState)((Reference)object).get()) != null) {
                    return object.newDrawable(objectArray.getResources());
                }
                int n2 = pd.b(ox2.b, ox2.d, l2);
                if (n2 < 0) return null;
                objectArray = ox2.c;
                object = objectArray[n2];
                Object object2 = oy.a;
                if (object == object2) return null;
                objectArray[n2] = object2;
                ox2.a = true;
            }
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void j(Context object, long l2, Drawable object2) {
        synchronized (this) {
            Drawable.ConstantState constantState = object2.getConstantState();
            if (constantState == null) {
                return;
            }
            ox ox2 = (ox)this.d.get(object);
            object2 = ox2;
            if (ox2 == null) {
                object2 = new ox();
                this.d.put(object, object2);
            }
            object = new WeakReference(constantState);
            ((ox)object2).f(l2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final ColorStateList a(Context objectArray, int n2) {
        synchronized (this) {
            int n3;
            Object object;
            pb pb2;
            Object object2;
            block16: {
                block23: {
                    block25: {
                        block24: {
                            block22: {
                                block21: {
                                    block20: {
                                        block19: {
                                            block18: {
                                                block17: {
                                                    block15: {
                                                        object2 = this.c;
                                                        pb2 = null;
                                                        object2 = object2 != null && (object2 = (pb)((WeakHashMap)object2).get(objectArray)) != null ? (ColorStateList)pc.a((pb)object2, n2) : null;
                                                        object = object2;
                                                        if (object2 != null) return object;
                                                        object2 = this.h;
                                                        if (object2 != null) break block15;
                                                        object2 = pb2;
                                                        n3 = n2;
                                                        break block16;
                                                    }
                                                    if (n2 != 2131230838) break block17;
                                                    object2 = ye.f((Context)objectArray, 2131099669);
                                                    n3 = n2;
                                                    break block16;
                                                }
                                                if (n2 != 2131230884) break block18;
                                                object2 = ye.f((Context)objectArray, 2131099672);
                                                n3 = n2;
                                                break block16;
                                            }
                                            if (n2 != 2131230883) break block19;
                                            int[][] nArrayArray = new int[3][];
                                            object2 = new int[3];
                                            pb2 = lt.c((Context)objectArray, 2130968976);
                                            if (pb2 != null && pb2.isStateful()) {
                                                object = lt.a;
                                                nArrayArray[0] = (int[])object;
                                                object2[0] = pb2.getColorForState((int[])object, 0);
                                                nArrayArray[1] = lt.d;
                                                object2[1] = lt.b((Context)objectArray, 2130968890);
                                                nArrayArray[2] = lt.e;
                                                object2[2] = pb2.getDefaultColor();
                                            } else {
                                                nArrayArray[0] = lt.a;
                                                object2[0] = lt.a((Context)objectArray, 2130968976);
                                                nArrayArray[1] = lt.d;
                                                object2[1] = lt.b((Context)objectArray, 2130968890);
                                                nArrayArray[2] = lt.e;
                                                object2[2] = lt.b((Context)objectArray, 2130968976);
                                            }
                                            object2 = new ColorStateList((int[][])nArrayArray, (int[])object2);
                                            n3 = n2;
                                            break block16;
                                        }
                                        if (n2 != 2131230826) break block20;
                                        object2 = axx.b((Context)objectArray, lt.b((Context)objectArray, 2130968886));
                                        n3 = n2;
                                        break block16;
                                    }
                                    if (n2 != 2131230820) break block21;
                                    object2 = axx.b((Context)objectArray, 0);
                                    n3 = n2;
                                    break block16;
                                }
                                if (n2 != 2131230825) break block22;
                                object2 = axx.b((Context)objectArray, lt.b((Context)objectArray, 2130968884));
                                n3 = n2;
                                break block16;
                            }
                            if (n2 == 2131230879 || n2 == 2131230880) break block23;
                            if (!axx.a((int[])((axx)object2).c, n2)) break block24;
                            object2 = lt.c((Context)objectArray, 2130968892);
                            n3 = n2;
                            break block16;
                        }
                        if (!axx.a((int[])((axx)object2).b, n2)) break block25;
                        object2 = ye.f((Context)objectArray, 2131099668);
                        n3 = n2;
                        break block16;
                    }
                    if (axx.a((int[])((axx)object2).e, n2)) {
                        object2 = ye.f((Context)objectArray, 2131099667);
                        n3 = n2;
                        break block16;
                    } else {
                        object2 = pb2;
                        n3 = n2;
                        if (n2 == 2131230876) {
                            object2 = ye.f((Context)objectArray, 2131099670);
                            n3 = 2131230876;
                        }
                    }
                    break block16;
                }
                object2 = ye.f((Context)objectArray, 2131099671);
                n3 = n2;
            }
            if (object2 == null) return object2;
            if (this.c == null) {
                object = new WeakHashMap();
                this.c = object;
            }
            pb2 = (pb)this.c.get(objectArray);
            object = pb2;
            if (pb2 == null) {
                object = new pb();
                this.c.put(objectArray, object);
            }
            if ((n2 = ((pb)object).d) != 0 && n3 <= ((pb)object).b[n2 - 1]) {
                ((pb)object).d(n3, object2);
            } else {
                if (((pb)object).a && n2 >= ((pb)object).b.length) {
                    pc.b((pb)object);
                }
                if ((n2 = ((pb)object).d) >= (objectArray = (Object[])((pb)object).b).length) {
                    int n4 = pd.d(n2 + 1);
                    objectArray = Arrays.copyOf((int[])objectArray, n4);
                    jse.d(objectArray, "copyOf(...)");
                    ((pb)object).b = (int[])objectArray;
                    objectArray = Arrays.copyOf(((pb)object).c, n4);
                    jse.d(objectArray, "copyOf(...)");
                    ((pb)object).c = objectArray;
                }
                ((pb)object).b[n2] = n3;
                ((pb)object).c[n2] = object2;
                ((pb)object).d = n2 + 1;
            }
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable c(Context context, int n2) {
        synchronized (this) {
            return this.d(context, n2, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Drawable d(Context var1_1, int var2_2, boolean var3_3) {
        synchronized (this) {
            block24: {
                block28: {
                    block31: {
                        block35: {
                            block34: {
                                block33: {
                                    block32: {
                                        block29: {
                                            block30: {
                                                block27: {
                                                    block26: {
                                                        block25: {
                                                            block23: {
                                                                var9_4 = this.f;
                                                                var5_5 = 0;
                                                                if (var9_4) break block23;
                                                                this.f = true;
                                                                var10_6 = this.c(var1_1 /* !! */ , 2131230896);
                                                                if (var10_6 == null || !(var10_6 instanceof azq) && !"android.graphics.drawable.VectorDrawable".equals(var10_6.getClass().getName())) break block24;
                                                            }
                                                            if (this.e == null) {
                                                                this.e = var10_6 = new TypedValue();
                                                            }
                                                            var14_7 /* !! */  = this.e;
                                                            var1_1 /* !! */ .getResources().getValue(var2_2, var14_7 /* !! */ , true);
                                                            var7_8 = (long)var14_7 /* !! */ .assetCookie << 32 | (long)var14_7 /* !! */ .data;
                                                            var11_9 = this.i(var1_1 /* !! */ , var7_8);
                                                            var12_10 = null;
                                                            var13_11 = null;
                                                            if (var11_9 == null) break block25;
                                                            var4_12 = var2_2;
                                                            break block26;
                                                        }
                                                        if (this.h == null) ** GOTO lbl-1000
                                                        if (var2_2 == 2131230834) {
                                                            var10_6 = new LayerDrawable(new Drawable[]{this.c(var1_1 /* !! */ , 2131230833), this.c(var1_1 /* !! */ , 2131230835)});
                                                        } else if (var2_2 == 2131230869) {
                                                            var10_6 = axx.c(this, var1_1 /* !! */ , 2131165243);
                                                        } else if (var2_2 == 2131230868) {
                                                            var10_6 = axx.c(this, var1_1 /* !! */ , 2131165244);
                                                        } else if (var2_2 == 2131230870) {
                                                            var10_6 = axx.c(this, var1_1 /* !! */ , 2131165245);
                                                            var2_2 = 2131230870;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var10_6 = null;
                                                        }
                                                        var4_12 = var2_2;
                                                        var11_9 = var10_6;
                                                        if (var10_6 != null) {
                                                            var10_6.setChangingConfigurations(var14_7 /* !! */ .changingConfigurations);
                                                            this.j(var1_1 /* !! */ , var7_8, (Drawable)var10_6);
                                                            var11_9 = var10_6;
                                                            var4_12 = var2_2;
                                                        }
                                                    }
                                                    var10_6 = var11_9;
                                                    if (var11_9 == null) {
                                                        var10_6 = var1_1 /* !! */ .getDrawable(var4_12);
                                                    }
                                                    if (var10_6 == null) ** GOTO lbl-1000
                                                    var11_9 = this.a(var1_1 /* !! */ , var4_12);
                                                    if (var11_9 == null) break block27;
                                                    var10_6 = var10_6.mutate();
                                                    var10_6.setTintList((ColorStateList)var11_9);
                                                    if (this.h == null) {
                                                        var1_1 /* !! */  = var13_11;
                                                    } else {
                                                        var1_1 /* !! */  = var13_11;
                                                        if (var4_12 == 2131230883) {
                                                            var1_1 /* !! */  = PorterDuff.Mode.MULTIPLY;
                                                        }
                                                    }
                                                    if (var1_1 /* !! */  != null) {
                                                        var10_6.setTintMode((PorterDuff.Mode)var1_1 /* !! */ );
                                                    }
                                                    var1_1 /* !! */  = var10_6;
                                                    break block28;
                                                }
                                                var13_11 = this.h;
                                                if (var13_11 == null) break block29;
                                                if (var4_12 != 2131230878) break block30;
                                                var11_9 = (LayerDrawable)var10_6;
                                                axx.d(var11_9.findDrawableByLayerId(0x1020000), lt.b(var1_1 /* !! */ , 2130968892), hj.a);
                                                axx.d(var11_9.findDrawableByLayerId(16908303), lt.b(var1_1 /* !! */ , 2130968892), hj.a);
                                                axx.d(var11_9.findDrawableByLayerId(16908301), lt.b(var1_1 /* !! */ , 2130968890), hj.a);
                                                ** GOTO lbl-1000
                                            }
                                            if (var4_12 != 2131230869 && var4_12 != 2131230868 && var4_12 != 2131230870) break block29;
                                            var11_9 = (LayerDrawable)var10_6;
                                            axx.d(var11_9.findDrawableByLayerId(0x1020000), lt.a(var1_1 /* !! */ , 2130968892), hj.a);
                                            axx.d(var11_9.findDrawableByLayerId(16908303), lt.b(var1_1 /* !! */ , 2130968890), hj.a);
                                            axx.d(var11_9.findDrawableByLayerId(16908301), lt.b(var1_1 /* !! */ , 2130968890), hj.a);
                                            ** GOTO lbl-1000
                                        }
                                        if (var13_11 == null) break block31;
                                        var14_7 /* !! */  = var13_11.d;
                                        var11_9 = hj.a;
                                        if (!axx.a((int[])var14_7 /* !! */ , var4_12)) break block32;
                                        var2_2 = 2130968892;
                                        ** GOTO lbl-1000
                                    }
                                    if (!axx.a((int[])var13_11.a, var4_12)) break block33;
                                    var2_2 = 2130968890;
                                    ** GOTO lbl-1000
                                }
                                var9_4 = axx.a((int[])var13_11.f, var4_12);
                                var2_2 = 0x1010031;
                                if (!var9_4) break block34;
                                var11_9 = PorterDuff.Mode.MULTIPLY;
                                ** GOTO lbl-1000
                            }
                            if (var4_12 != 2131230855) break block35;
                            var4_12 = Math.round(40.8f);
                            var2_2 = 0x1010030;
                            ** GOTO lbl103
                        }
                        if (var4_12 == 2131230837) lbl-1000:
                        // 4 sources

                        {
                            var4_12 = -1;
lbl103:
                            // 2 sources

                            var6_13 = 1;
                            var5_5 = var4_12;
                            var4_12 = var6_13;
                        } else {
                            var2_2 = 0;
                            var6_14 = -1;
                            var4_12 = var5_5;
                            var5_5 = var6_14;
                        }
                        if (var4_12 == 0) break block31;
                        var12_10 = var10_6.mutate();
                        var12_10.setColorFilter((ColorFilter)hj.b(lt.b(var1_1 /* !! */ , var2_2), (PorterDuff.Mode)var11_9));
                        if (var5_5 != -1) {
                            var12_10.setAlpha(var5_5);
                        }
                        ** GOTO lbl-1000
                    }
                    if (var3_3) {
                        var1_1 /* !! */  = var12_10;
                    } else lbl-1000:
                    // 5 sources

                    {
                        var1_1 /* !! */  = var10_6;
                    }
                }
                if (var1_1 /* !! */  != null) {
                    iy.b((Drawable)var1_1 /* !! */ );
                }
                return var1_1 /* !! */ ;
            }
            this.f = false;
            var1_1 /* !! */  = new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            throw var1_1 /* !! */ ;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Context object) {
        synchronized (this) {
            object = (ox)this.d.get(object);
            if (object != null) {
                ((ox)object).e();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(axx axx2) {
        synchronized (this) {
            this.h = axx2;
            return;
        }
    }
}

