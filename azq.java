/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class azq
extends azi {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public azo b;
    public boolean c = true;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h = new float[9];
    private final Matrix i = new Matrix();
    private final Rect j = new Rect();

    public azq() {
        this.b = new azo();
    }

    public azq(azo azo2) {
        this.b = azo2;
        this.d = this.b(azo2.c, azo2.d);
    }

    static int a(int n2, float f2) {
        return n2 & 0xFFFFFF | (int)((float)Color.alpha((int)n2) * f2) << 24;
    }

    final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            Object object = this.f;
            drawable = object;
            if (object == null) {
                drawable = this.d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float f2 = Math.abs(this.h[0]);
            float f3 = Math.abs(this.h[4]);
            float f4 = Math.abs(this.h[1]);
            float f5 = Math.abs(this.h[3]);
            if (f4 != 0.0f || f5 != 0.0f) {
                f2 = 1.0f;
                f3 = 1.0f;
            }
            f5 = this.j.width();
            int n2 = (int)((float)this.j.height() * f3);
            int n3 = Math.min(2048, (int)(f5 * f2));
            n2 = Math.min(2048, n2);
            if (n3 > 0 && n2 > 0) {
                int n4 = canvas.save();
                canvas.translate((float)this.j.left, (float)this.j.top);
                if (this.isAutoMirrored() && this.getLayoutDirection() == 1) {
                    canvas.translate((float)this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                azo azo2 = this.b;
                object = azo2.f;
                if (object == null || n3 != object.getWidth() || n2 != azo2.f.getHeight()) {
                    azo2.f = Bitmap.createBitmap((int)n3, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    azo2.k = true;
                }
                if (!this.c) {
                    this.b.a(n3, n2);
                } else {
                    object = this.b;
                    if (object.k || object.g != object.c || object.h != object.d || object.j != object.e || object.i != object.b.getRootAlpha()) {
                        this.b.a(n3, n2);
                        object = this.b;
                        object.g = object.c;
                        object.h = object.d;
                        object.i = object.b.getRootAlpha();
                        object.j = object.e;
                        object.k = false;
                    }
                }
                object = this.b;
                azo2 = this.j;
                if (object.b.getRootAlpha() >= 255 && drawable == null) {
                    drawable = null;
                } else {
                    if (object.l == null) {
                        object.l = new Paint();
                        object.l.setFilterBitmap(true);
                    }
                    object.l.setAlpha(object.b.getRootAlpha());
                    object.l.setColorFilter((ColorFilter)drawable);
                    drawable = object.l;
                }
                canvas.drawBitmap(object.f, null, (Rect)azo2, (Paint)drawable);
                canvas.restoreToCount(n4);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f;
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new azp(drawable.getConstantState());
        }
        this.b.a = this.getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int)this.b.b.f;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int)this.b.b.e;
    }

    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void inflate(Resources var1_1, XmlPullParser var2_2, AttributeSet var3_3, Resources.Theme var4_4) {
        block40: {
            block41: {
                block42: {
                    block43: {
                        block38: {
                            var15_5 = this.e;
                            if (var15_5 != null) {
                                var15_5.inflate(var1_1, var2_2, var3_3, var4_4);
                                return;
                            }
                            var16_7 = this.b;
                            var16_7.b = new azn();
                            var17_8 /* !! */  = kt.p(var1_1, var4_4, var3_3, azb.a);
                            var19_9 = this.b;
                            var18_10 = var19_9.b;
                            var19_9.d = a.e(kt.n(var17_8 /* !! */ , var2_2, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
                            var12_11 = kt.t(var2_2, "tint");
                            var13_12 = false;
                            if (!var12_11) ** GOTO lbl34
                            var15_5 = new TypedValue();
                            var17_8 /* !! */ .getValue(1, (TypedValue)var15_5);
                            if (var15_5.type == 2) ** GOTO lbl31
                            if (var15_5.type >= 28 && var15_5.type <= 31) {
                                var15_5 = ColorStateList.valueOf((int)var15_5.data);
                            } else {
                                block39: {
                                    var15_5 = var17_8 /* !! */ .getResources();
                                    var6_13 = var17_8 /* !! */ .getResourceId(1, 0);
                                    var7_14 = sx.a;
                                    try {
                                        var15_5 = sx.a((Resources)var15_5, (XmlPullParser)var15_5.getXml(var6_13), var4_4);
                                        break block38;
                                    }
                                    catch (Exception var15_6) {
                                        Log.e((String)"CSLCompat", (String)"Failed to inflate ColorStateList.", (Throwable)var15_6);
                                        break block39;
                                    }
lbl31:
                                    // 1 sources

                                    var15_5.toString();
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(var15_5.toString()));
                                }
                                var15_5 = null;
                            }
                        }
                        if (var15_5 != null) {
                            var19_9.c = var15_5;
                        }
                        var12_11 = var14_15 = var19_9.e;
                        if (kt.t(var2_2, "autoMirrored")) {
                            var12_11 = var17_8 /* !! */ .getBoolean(5, var14_15);
                        }
                        var19_9.e = var12_11;
                        var18_10.g = kt.l(var17_8 /* !! */ , var2_2, "viewportWidth", 7, var18_10.g);
                        var18_10.h = var5_16 = kt.l(var17_8 /* !! */ , var2_2, "viewportHeight", 8, var18_10.h);
                        if (var18_10.g <= 0.0f) break block40;
                        if (var5_16 <= 0.0f) break block41;
                        var5_16 = var18_10.e;
                        var11_17 = 3;
                        var18_10.e = var17_8 /* !! */ .getDimension(3, var5_16);
                        var18_10.f = var5_16 = var17_8 /* !! */ .getDimension(2, var18_10.f);
                        if (var18_10.e <= 0.0f) break block42;
                        if (var5_16 <= 0.0f) break block43;
                        var18_10.setAlpha(kt.l(var17_8 /* !! */ , var2_2, "alpha", 4, var18_10.getAlpha()));
                        var15_5 = var17_8 /* !! */ .getString(0);
                        if (var15_5 != null) {
                            var18_10.j = var15_5;
                            var18_10.l.put(var15_5, var18_10);
                        }
                        var17_8 /* !! */ .recycle();
                        var16_7.a = this.getChangingConfigurations();
                        var16_7.k = true;
                        var19_9 = this.b;
                        var18_10 = var19_9.b;
                        var20_18 = new ArrayDeque<Object>();
                        var20_18.push(var18_10.d);
                        var9_19 = var2_2.getEventType();
                        var7_14 = var2_2.getDepth() + 1;
                        var8_20 = true;
                        var12_11 = var13_12;
                        while (var9_19 != 1 && (var2_2.getDepth() >= var7_14 || var9_19 != var11_17)) {
                            block45: {
                                block44: {
                                    if (var9_19 != 2) break block44;
                                    var15_5 = var2_2.getName();
                                    var17_8 /* !! */  = (azl)var20_18.peek();
                                    if (var17_8 /* !! */  == null) ** GOTO lbl177
                                    if ("path".equals(var15_5)) {
                                        var21_22 = new azk();
                                        var22_23 = kt.p(var1_1, var4_4, var3_3, azb.c);
                                        var21_22.a = null;
                                        if (kt.t(var2_2, "pathData")) {
                                            var15_5 = var22_23.getString(0);
                                            if (var15_5 != null) {
                                                var21_22.n = var15_5;
                                            }
                                            if ((var15_5 = var22_23.getString(2)) != null) {
                                                var21_22.m = kt.i((String)var15_5);
                                            }
                                            var21_22.l = kt.z((TypedArray)var22_23, var2_2, var4_4, "fillColor", 1);
                                            var21_22.d = kt.l((TypedArray)var22_23, var2_2, "fillAlpha", 12, var21_22.d);
                                            var6_13 = kt.n((TypedArray)var22_23, var2_2, "strokeLineCap", 8, -1);
                                            var15_5 = var21_22.h;
                                            if (var6_13 != 0) {
                                                if (var6_13 != 1) {
                                                    if (var6_13 == 2) {
                                                        var15_5 = Paint.Cap.SQUARE;
                                                    }
                                                } else {
                                                    var15_5 = Paint.Cap.ROUND;
                                                }
                                            } else {
                                                var15_5 = Paint.Cap.BUTT;
                                            }
                                            var21_22.h = var15_5;
                                            var6_13 = kt.n((TypedArray)var22_23, var2_2, "strokeLineJoin", 9, -1);
                                            var15_5 = var21_22.i;
                                            if (var6_13 != 0) {
                                                if (var6_13 != 1) {
                                                    if (var6_13 == 2) {
                                                        var15_5 = Paint.Join.BEVEL;
                                                    }
                                                } else {
                                                    var15_5 = Paint.Join.ROUND;
                                                }
                                            } else {
                                                var15_5 = Paint.Join.MITER;
                                            }
                                            var21_22.i = var15_5;
                                            var21_22.j = kt.l((TypedArray)var22_23, var2_2, "strokeMiterLimit", 10, var21_22.j);
                                            var21_22.k = kt.z((TypedArray)var22_23, var2_2, var4_4, "strokeColor", 3);
                                            var21_22.c = kt.l((TypedArray)var22_23, var2_2, "strokeAlpha", 11, var21_22.c);
                                            var21_22.b = kt.l((TypedArray)var22_23, var2_2, "strokeWidth", 4, var21_22.b);
                                            var21_22.f = kt.l((TypedArray)var22_23, var2_2, "trimPathEnd", 6, var21_22.f);
                                            var21_22.g = kt.l((TypedArray)var22_23, var2_2, "trimPathOffset", 7, var21_22.g);
                                            var21_22.e = kt.l((TypedArray)var22_23, var2_2, "trimPathStart", 5, var21_22.e);
                                            var21_22.o = kt.n((TypedArray)var22_23, var2_2, "fillType", 13, var21_22.o);
                                        }
                                        var22_23.recycle();
                                        var17_8 /* !! */ .b.add(var21_22);
                                        if (var21_22.getPathName() != null) {
                                            var18_10.l.put(var21_22.getPathName(), var21_22);
                                        }
                                        var6_13 = var19_9.a;
                                        var6_13 = 3;
                                        var12_11 = false;
                                        var10_21 = false;
                                    } else if ("clip-path".equals(var15_5)) {
                                        var15_5 = new azj();
                                        if (kt.t(var2_2, "pathData")) {
                                            var21_22 = kt.p(var1_1, var4_4, var3_3, azb.d);
                                            var22_23 = var21_22.getString(0);
                                            if (var22_23 != null) {
                                                var15_5.n = var22_23;
                                            }
                                            if ((var22_23 = var21_22.getString(1)) != null) {
                                                var15_5.m = kt.i((String)var22_23);
                                            }
                                            var15_5.o = kt.n((TypedArray)var21_22, var2_2, "fillType", 2, 0);
                                            var21_22.recycle();
                                        }
                                        var17_8 /* !! */ .b.add(var15_5);
                                        if (var15_5.getPathName() != null) {
                                            var18_10.l.put(var15_5.getPathName(), var15_5);
                                        }
                                        var6_13 = var19_9.a;
                                        var6_13 = 3;
                                        var12_11 = false;
                                        var10_21 = var8_20;
                                    } else if ("group".equals(var15_5)) {
                                        var22_23 = new azl();
                                        var21_22 = kt.p(var1_1, var4_4, var3_3, azb.b);
                                        var22_23.l = null;
                                        var22_23.c = kt.l((TypedArray)var21_22, var2_2, "rotation", 5, var22_23.c);
                                        var22_23.d = var21_22.getFloat(1, var22_23.d);
                                        var22_23.e = var21_22.getFloat(2, var22_23.e);
                                        var22_23.f = kt.l((TypedArray)var21_22, var2_2, "scaleX", 3, var22_23.f);
                                        var22_23.g = kt.l((TypedArray)var21_22, var2_2, "scaleY", 4, var22_23.g);
                                        var22_23.h = kt.l((TypedArray)var21_22, var2_2, "translateX", 6, var22_23.h);
                                        var22_23.i = kt.l((TypedArray)var21_22, var2_2, "translateY", 7, var22_23.i);
                                        var12_11 = false;
                                        var15_5 = var21_22.getString(0);
                                        if (var15_5 != null) {
                                            var22_23.m = var15_5;
                                        }
                                        var22_23.l();
                                        var21_22.recycle();
                                        var17_8 /* !! */ .b.add(var22_23);
                                        var20_18.push(var22_23);
                                        if (var22_23.getGroupName() != null) {
                                            var18_10.l.put(var22_23.getGroupName(), var22_23);
                                        }
                                        var6_13 = var19_9.a;
                                        var6_13 = 3;
                                        var10_21 = var8_20;
                                    } else {
                                        var12_11 = false;
lbl177:
                                        // 2 sources

                                        var6_13 = 3;
                                        var10_21 = var8_20;
                                    }
                                    break block45;
                                }
                                var13_12 = var12_11;
                                var6_13 = var11_17;
                                var12_11 = var13_12;
                                var10_21 = var8_20;
                                if (var9_19 == var11_17) {
                                    var6_13 = var11_17;
                                    var12_11 = var13_12;
                                    var10_21 = var8_20;
                                    if ("group".equals(var2_2.getName())) {
                                        var20_18.pop();
                                        var10_21 = var8_20;
                                        var12_11 = var13_12;
                                        var6_13 = var11_17;
                                    }
                                }
                            }
                            var9_19 = var2_2.next();
                            var11_17 = var6_13;
                            var8_20 = var10_21;
                        }
                        if (!var8_20) {
                            this.d = this.b(var16_7.c, var16_7.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(String.valueOf(var17_8 /* !! */ .getPositionDescription()).concat("<vector> tag requires height > 0"));
                }
                throw new XmlPullParserException(String.valueOf(var17_8 /* !! */ .getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            throw new XmlPullParserException(String.valueOf(var17_8 /* !! */ .getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        throw new XmlPullParserException(String.valueOf(var17_8 /* !! */ .getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
    }

    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isStateful() {
        boolean bl2;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        boolean bl3 = super.isStateful();
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        azo azo2 = this.b;
        if (azo2 == null) return false;
        bl4 = bl2;
        if (azo2.b()) return bl4;
        ColorStateList colorStateList = this.b.c;
        if (colorStateList == null) return false;
        if (!colorStateList.isStateful()) return false;
        return bl2;
    }

    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new azo(this.b);
            this.g = true;
        }
        return this;
    }

    @Override
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] nArray) {
        boolean bl2;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        azo azo2 = this.b;
        drawable = azo2.c;
        boolean bl3 = bl2 = false;
        if (drawable != null) {
            PorterDuff.Mode mode = azo2.d;
            bl3 = bl2;
            if (mode != null) {
                this.d = this.b((ColorStateList)drawable, mode);
                this.invalidateSelf();
                bl3 = true;
            }
        }
        if (azo2.b()) {
            bl2 = ((aay)azo2.b.d).h(nArray);
            azo2.k |= bl2;
            if (bl2) {
                this.invalidateSelf();
                return true;
            }
        }
        return bl3;
    }

    public final void scheduleSelf(Runnable runnable, long l2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, l2);
            return;
        }
        super.scheduleSelf(runnable, l2);
    }

    public final void setAlpha(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        if (this.b.b.getRootAlpha() != n2) {
            this.b.b.setRootAlpha(n2);
            this.invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean bl2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(bl2);
            return;
        }
        this.b.e = bl2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        this.invalidateSelf();
    }

    public final void setTint(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(n2);
            return;
        }
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    public final void setTintList(ColorStateList colorStateList) {
        Object object = this.e;
        if (object != null) {
            object.setTintList(colorStateList);
            return;
        }
        object = this.b;
        if (object.c != colorStateList) {
            object.c = colorStateList;
            this.d = this.b(colorStateList, object.d);
            this.invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Object object = this.e;
        if (object != null) {
            object.setTintMode(mode);
            return;
        }
        object = this.b;
        if (object.d != mode) {
            object.d = mode;
            this.d = this.b(object.c, mode);
            this.invalidateSelf();
        }
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(bl2, bl3);
        }
        return super.setVisible(bl2, bl3);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
}

