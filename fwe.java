/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.text.LineBreakConfig$Builder
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.Log
 *  android.view.Gravity
 *  android.view.View
 */
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.wear.ambient.SharedLibraryVersion;

public final class fwe {
    public final TextPaint A;
    public TimeInterpolator B;
    public TimeInterpolator C;
    public float D;
    public int E = 1;
    public float F = 1.0f;
    public int G = 1;
    public giu H;
    public giu I;
    public SharedLibraryVersion J;
    private final RectF K;
    private float L = 15.0f;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private Typeface S;
    private boolean T;
    private float U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private int Z;
    public final View a;
    private final TextPaint aa;
    private float ab;
    private float ac;
    private float ad;
    private ColorStateList ae;
    private float af;
    private float ag;
    private float ah;
    private ColorStateList ai;
    private float aj;
    private float ak;
    private StaticLayout al;
    private float am;
    private float an;
    private float ao;
    private CharSequence ap;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public int f;
    public final Rect g;
    public final Rect h;
    public int i = 16;
    public int j = 16;
    public float k = 15.0f;
    public ColorStateList l;
    public ColorStateList m;
    public int n;
    public Typeface o;
    public Typeface p;
    public Typeface q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public TextUtils.TruncateAt u = TextUtils.TruncateAt.END;
    public CharSequence v;
    public CharSequence w;
    public boolean x = true;
    public int[] y;
    public boolean z;

    public fwe(View view) {
        TextPaint textPaint;
        this.a = view;
        this.aa = textPaint = new TextPaint(129);
        this.A = new TextPaint((Paint)textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.K = new RectF();
        this.e = this.a();
        this.e(view.getContext().getResources().getConfiguration());
    }

    public static boolean j(Rect rect, int n2, int n3, int n4, int n5) {
        return rect.left == n2 && rect.top == n3 && rect.right == n4 && rect.bottom == n5;
    }

    private static float k(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5 = f4;
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f4);
        }
        timeInterpolator = ftf.a;
        return f2 + f5 * (f3 - f2);
    }

    private static int l(int n2, int n3, float f2) {
        float f3 = Color.alpha((int)n2);
        float f4 = Color.alpha((int)n3);
        float f5 = Color.red((int)n2);
        float f6 = Color.red((int)n3);
        float f7 = Color.green((int)n2);
        float f8 = Color.green((int)n3);
        float f9 = Color.blue((int)n2);
        float f10 = Color.blue((int)n3);
        float f11 = 1.0f - f2;
        return Color.argb((int)Math.round(f3 * f11 + f4 * f2), (int)Math.round(f5 * f11 + f6 * f2), (int)Math.round(f7 * f11 + f8 * f2), (int)Math.round(f9 * f11 + f10 * f2));
    }

    private final int m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] nArray = this.y;
        if (nArray != null) {
            return colorStateList.getColorForState(nArray, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void n(float var1_1, boolean var2_2) {
        block34: {
            block40: {
                block33: {
                    block32: {
                        block31: {
                            block39: {
                                block37: {
                                    block38: {
                                        block36: {
                                            block35: {
                                                if (this.v == null) break block35;
                                                var5_3 = this.h.width();
                                                var6_4 = this.g.width();
                                                if (fwe.p(var1_1, 1.0f)) {
                                                    var3_5 = this.L;
                                                    var4_6 = this.aj;
                                                    this.U = 1.0f;
                                                    var13_7 /* !! */  = this.o;
                                                    var1_1 = var5_3;
                                                } else {
                                                    var3_5 = this.k;
                                                    var4_6 = this.D;
                                                    var13_7 /* !! */  = this.r;
                                                    this.U = fwe.p(var1_1, 0.0f) != false ? 1.0f : fwe.k(this.k, this.L, var1_1, this.C) / this.k;
                                                    var1_1 = this.L / this.k;
                                                    var1_1 = var2_2 == false && this.c == false && var6_4 * var1_1 > var5_3 ? Math.min(var5_3 / var1_1, var6_4) : var6_4;
                                                }
                                                if (var1_1 > 0.0f) {
                                                    var6_4 = this.V;
                                                    var5_3 = this.ak;
                                                    var15_9 = this.S;
                                                    var14_10 = this.al;
                                                    var7_11 = var14_10 != null && var1_1 != (float)var14_10.getWidth() ? 1 : 0;
                                                    var7_11 = var6_4 == var3_5 && var5_3 == var4_6 && var7_11 == 0 && var15_9 == var13_7 /* !! */  && !this.z ? 0 : 1;
                                                    this.V = var3_5;
                                                    this.ak = var4_6;
                                                    this.S = var13_7 /* !! */ ;
                                                    this.z = false;
                                                    var13_7 /* !! */  = this.aa;
                                                    var2_2 = this.U != 1.0f;
                                                    var13_7 /* !! */ .setLinearText(var2_2);
                                                } else {
                                                    var7_11 = 0;
                                                }
                                                if (this.w == null || var7_11 != 0) break block36;
                                            }
                                            return;
                                        }
                                        this.aa.setTextSize(this.V);
                                        this.aa.setTypeface(this.S);
                                        this.aa.setLetterSpacing(this.ak);
                                        var14_10 = this.v;
                                        var8_12 = this.a.getLayoutDirection() == 1 ? 1 : 0;
                                        var7_11 = var8_12;
                                        if (!this.x) break block37;
                                        var13_7 /* !! */  = var8_12 != 0 ? ul.b : ul.a;
                                        var9_13 = var14_10.length();
                                        if (var14_10 == null || var9_13 < 0 || var14_10.length() - var9_13 < 0) break block38;
                                        var7_11 = 2;
                                        block18: for (var8_12 = 0; var8_12 < var9_13 && var7_11 == 2; ++var8_12) {
                                            var7_11 = Character.getDirectionality(var14_10.charAt(var8_12));
                                            if (var7_11 == 0) ** GOTO lbl-1000
                                            if (var7_11 == 1 || var7_11 == 2) ** GOTO lbl-1000
                                            switch (var7_11) {
                                                default: {
                                                    var7_11 = 2;
                                                    continue block18;
                                                }
                                                case 16: 
                                                case 17: lbl-1000:
                                                // 2 sources

                                                {
                                                    var7_11 = 0;
                                                    continue block18;
                                                }
                                                case 14: 
                                                case 15: lbl-1000:
                                                // 2 sources

                                                {
                                                    var7_11 = 1;
                                                }
                                            }
                                        }
                                        var7_11 = var7_11 != 0 ? (var7_11 != 1 ? (int)var13_7 /* !! */ .a : 0) : 1;
                                        break block37;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                this.T = var7_11;
                                var8_12 = this.q() != false ? this.E : 1;
                                if (var8_12 != 1) break block39;
                                var13_7 /* !! */  = Layout.Alignment.ALIGN_NORMAL;
                                var8_12 = 1;
                                ** GOTO lbl91
                            }
                            var9_13 = Gravity.getAbsoluteGravity((int)this.i, (int)var7_11) & 7;
                            if (var9_13 == 1) ** GOTO lbl90
                            if (var9_13 == 5) ** GOTO lbl88
                            if (this.T) {
                                while (true) {
                                    var13_7 /* !! */  = Layout.Alignment.ALIGN_OPPOSITE;
                                    break block31;
                                    break;
                                }
                            }
lbl85:
                            // 3 sources

                            while (true) {
                                var13_7 /* !! */  = Layout.Alignment.ALIGN_NORMAL;
                                break block31;
                                break;
                            }
lbl88:
                            // 1 sources

                            if (!this.T) ** continue;
                            ** continue;
lbl90:
                            // 1 sources

                            var13_7 /* !! */  = Layout.Alignment.ALIGN_CENTER;
                        }
                        var15_9 = this.v;
                        var18_14 = this.aa;
                        var9_13 = (int)var1_1;
                        var11_15 = var15_9.length();
                        var17_16 = this.u;
                        var1_1 = this.F;
                        var10_17 = this.G;
                        var16_18 = this.J;
                        var14_10 = var15_9;
                        if (var15_9 != null) break block32;
                        var14_10 = "";
                    }
                    var12_19 = Math.max(0, var9_13);
                    var9_13 = var8_12;
                    var15_9 = var14_10;
                    if (var8_12 != 1) break block33;
                    var15_9 = TextUtils.ellipsize((CharSequence)var14_10, (TextPaint)var18_14, (float)var12_19, (TextUtils.TruncateAt)var17_16);
                    var9_13 = 1;
                }
                var8_12 = Math.min(var15_9.length(), var11_15);
                var14_10 = var13_7 /* !! */ ;
                if (var7_11 == 0) ** GOTO lbl122
                var14_10 = var13_7 /* !! */ ;
                if (var9_13 != 1) ** GOTO lbl122
                var14_10 = Layout.Alignment.ALIGN_OPPOSITE;
lbl122:
                // 3 sources

                var15_9 = StaticLayout.Builder.obtain((CharSequence)var15_9, (int)0, (int)var8_12, (TextPaint)var18_14, (int)var12_19);
                var15_9.setAlignment((Layout.Alignment)var14_10);
                var15_9.setIncludePad(false);
                if (var7_11 == 0) ** GOTO lbl131
                var13_7 /* !! */  = TextDirectionHeuristics.RTL;
                break block40;
lbl131:
                // 1 sources

                var13_7 /* !! */  = TextDirectionHeuristics.LTR;
            }
            var15_9.setTextDirection((TextDirectionHeuristic)var13_7 /* !! */ );
            if (var17_16 == null) ** GOTO lbl139
            var15_9.setEllipsize(var17_16);
lbl139:
            // 2 sources

            var15_9.setMaxLines(var9_13);
            if (var1_1 == 1.0f) break block34;
            var15_9.setLineSpacing(0.0f, var1_1);
        }
        if (var9_13 > 1) {
            var15_9.setHyphenationFrequency(var10_17);
        }
        if (var16_18 == null) ** GOTO lbl155
        try {
            var13_7 /* !! */  = new LineBreakConfig.Builder();
            a$$ExternalSyntheticApiModelOutline0.m((StaticLayout.Builder)var15_9, a$$ExternalSyntheticApiModelOutline0.m(a$$ExternalSyntheticApiModelOutline0.m((LineBreakConfig.Builder)var13_7 /* !! */ , 1)));
lbl155:
            // 2 sources

            var13_7 /* !! */  = var15_9.build();
        }
        catch (fwk var13_8) {
            Log.e((String)"CollapsingTextHelper", (String)var13_8.getCause().getMessage(), (Throwable)var13_8);
            var13_7 /* !! */  = null;
        }
        a.Y(var13_7 /* !! */ );
        this.al = var13_7 /* !! */ ;
        this.w = var13_7 /* !! */ .getText();
    }

    private final void o(float f2) {
        this.n(f2, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean p(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-5f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean q() {
        boolean bl2;
        int n2 = this.E;
        boolean bl3 = bl2 = false;
        if (n2 <= 1) return bl3;
        if (!this.T) return true;
        if (this.c) return true;
        return bl2;
    }

    private static final float r(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float a() {
        float f2 = this.d;
        return f2 + (1.0f - f2) * 0.5f;
    }

    public final int b() {
        return this.m(this.m);
    }

    public final void c() {
        int n2;
        float f2;
        Rect rect;
        RectF rectF;
        float f3 = this.b;
        if (this.c) {
            rectF = this.K;
            rect = f3 < this.e ? this.g : this.h;
            rectF.set(rect);
        } else {
            this.K.left = fwe.k(this.g.left, this.h.left, f3, this.B);
            this.K.top = fwe.k(this.M, this.N, f3, this.B);
            this.K.right = fwe.k(this.g.right, this.h.right, f3, this.B);
            this.K.bottom = fwe.k(this.g.bottom, this.h.bottom, f3, this.B);
        }
        if (this.c) {
            if (f3 < this.e) {
                this.Q = this.O;
                this.R = this.M;
                this.o(0.0f);
                f2 = 0.0f;
            } else {
                this.Q = this.P;
                this.R = this.N - (float)Math.max(0, this.f);
                this.o(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.Q = fwe.k(this.O, this.P, f3, this.B);
            this.R = fwe.k(this.M, this.N, f3, this.B);
            this.o(f3);
            f2 = f3;
        }
        this.an = 1.0f - fwe.k(0.0f, 1.0f, 1.0f - f3, ftf.b);
        this.a.postInvalidateOnAnimation();
        this.ao = fwe.k(1.0f, 0.0f, f3, ftf.b);
        this.a.postInvalidateOnAnimation();
        rect = this.m;
        rectF = this.l;
        if (rect != rectF) {
            this.aa.setColor(fwe.l(this.m((ColorStateList)rectF), this.b(), f2));
        } else {
            this.aa.setColor(this.b());
        }
        f2 = this.aj;
        float f4 = this.D;
        if (f2 != f4) {
            this.aa.setLetterSpacing(fwe.k(f4, f2, f3, ftf.b));
        } else {
            this.aa.setLetterSpacing(f2);
        }
        this.W = fwe.k(this.af, this.ab, f3, null);
        this.X = fwe.k(this.ag, this.ac, f3, null);
        this.Y = fwe.k(this.ah, this.ad, f3, null);
        this.Z = n2 = fwe.l(this.m(this.ai), this.m(this.ae), f3);
        this.aa.setShadowLayer(this.W, this.X, this.Y, n2);
        if (this.c) {
            n2 = this.aa.getAlpha();
            f2 = this.e;
            f2 = f3 <= f2 ? ftf.a(1.0f, 0.0f, this.d, f2, f3) : ftf.a(0.0f, 1.0f, f2, 1.0f, f3);
            f3 = n2;
            this.aa.setAlpha((int)(f2 * f3));
            if (Build.VERSION.SDK_INT >= 31) {
                rect = this.aa;
                rect.setShadowLayer(this.W, this.X, this.Y, fvc.g(this.Z, rect.getAlpha()));
            }
        }
        this.a.postInvalidateOnAnimation();
    }

    public final void d(Canvas canvas) {
        int n2 = canvas.save();
        if (this.w != null && this.K.width() > 0.0f && this.K.height() > 0.0f) {
            this.aa.setTextSize(this.V);
            float f2 = this.Q;
            float f3 = this.R;
            float f4 = this.U;
            if (f4 != 1.0f && !this.c) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (this.q() && (!this.c || this.b > this.e)) {
                Object object;
                f2 = this.Q;
                f4 = this.al.getLineStart(0);
                int n3 = this.aa.getAlpha();
                canvas.translate(f2 - f4, f3);
                if (!this.c) {
                    f3 = n3;
                    this.aa.setAlpha((int)(this.ao * f3));
                    if (Build.VERSION.SDK_INT >= 31) {
                        object = this.aa;
                        object.setShadowLayer(this.W, this.X, this.Y, fvc.g(this.Z, object.getAlpha()));
                    }
                    this.al.draw(canvas);
                }
                if (!this.c) {
                    f3 = n3;
                    this.aa.setAlpha((int)(this.an * f3));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    object = this.aa;
                    object.setShadowLayer(this.W, this.X, this.Y, fvc.g(this.Z, object.getAlpha()));
                }
                int n4 = this.al.getLineBaseline(0);
                object = this.ap;
                int n5 = object.length();
                f3 = n4;
                canvas.drawText((CharSequence)object, 0, n5, 0.0f, f3, (Paint)this.aa);
                if (Build.VERSION.SDK_INT >= 31) {
                    this.aa.setShadowLayer(this.W, this.X, this.Y, this.Z);
                }
                if (!this.c) {
                    String string = this.ap.toString().trim();
                    object = string;
                    if (string.endsWith("\u2026")) {
                        object = string.substring(0, string.length() - 1);
                    }
                    this.aa.setAlpha(n3);
                    canvas.drawText((String)object, 0, Math.min(this.al.getLineEnd(0), ((String)object).length()), 0.0f, f3, (Paint)this.aa);
                }
            } else {
                canvas.translate(f2, f3);
                this.al.draw(canvas);
            }
            canvas.restoreToCount(n2);
        }
    }

    public final void e(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.q;
            if (typeface != null) {
                this.p = fvc.m(configuration, typeface);
            }
            if ((typeface = this.t) != null) {
                this.s = fvc.m(configuration, typeface);
            }
            typeface = this.p;
            configuration = typeface;
            if (typeface == null) {
                configuration = this.q;
            }
            this.o = configuration;
            typeface = this.s;
            configuration = typeface;
            if (typeface == null) {
                configuration = this.t;
            }
            this.r = configuration;
            this.g(true);
        }
    }

    public final void f() {
        this.g(false);
    }

    public final void g(boolean bl2) {
        block13: {
            float f2;
            StaticLayout staticLayout;
            boolean bl3;
            block12: {
                block11: {
                    if (this.a.getHeight() <= 0) break block11;
                    bl3 = bl2;
                    if (this.a.getWidth() > 0) break block12;
                }
                if (!bl2) break block13;
                bl3 = true;
            }
            this.n(1.0f, bl3);
            CharSequence charSequence = this.w;
            if (charSequence != null && (staticLayout = this.al) != null) {
                this.ap = TextUtils.ellipsize((CharSequence)charSequence, (TextPaint)this.aa, (float)staticLayout.getWidth(), (TextUtils.TruncateAt)this.u);
            }
            charSequence = this.ap;
            float f3 = 0.0f;
            this.am = charSequence != null ? fwe.r(this.aa, charSequence) : 0.0f;
            int n2 = Gravity.getAbsoluteGravity((int)this.j, (int)(this.T ? 1 : 0));
            int n3 = n2 & 0x70;
            if (n3 != 48) {
                if (n3 != 80) {
                    charSequence = this.aa;
                    f2 = (charSequence.descent() - charSequence.ascent()) / 2.0f;
                    this.N = (float)this.h.centerY() - f2;
                } else {
                    this.N = (float)this.h.bottom + this.aa.ascent();
                }
            } else {
                this.N = this.h.top;
            }
            this.P = (n2 &= 0x800007) != 1 ? (n2 != 5 ? (float)this.h.left : (float)this.h.right - this.am) : (float)this.h.centerX() - this.am / 2.0f;
            this.n(0.0f, bl3);
            charSequence = this.al;
            f2 = charSequence != null ? (float)charSequence.getHeight() : 0.0f;
            charSequence = this.al;
            if (charSequence != null && this.E > 1) {
                f3 = charSequence.getWidth();
            } else {
                charSequence = this.w;
                if (charSequence != null) {
                    f3 = fwe.r(this.aa, charSequence);
                }
            }
            charSequence = this.al;
            n2 = charSequence != null ? charSequence.getLineCount() : 0;
            this.n = n2;
            n2 = Gravity.getAbsoluteGravity((int)this.i, (int)(this.T ? 1 : 0));
            n3 = n2 & 0x70;
            this.M = n3 != 48 ? (n3 != 80 ? (float)this.g.centerY() - (f2 /= 2.0f) : (float)this.g.bottom - f2 + this.aa.descent()) : (float)this.g.top;
            this.O = (n2 &= 0x800007) != 1 ? (n2 != 5 ? (float)this.g.left : (float)this.g.right - f3) : (float)this.g.centerX() - f3 / 2.0f;
            this.o(this.b);
            this.c();
        }
    }

    public final void h(int n2) {
        float f2;
        fww fww2 = new fww(this.a.getContext(), n2);
        Object object = fww2.i;
        if (object != null) {
            this.m = object;
        }
        if ((f2 = fww2.j) != 0.0f) {
            this.L = f2;
        }
        if ((object = fww2.a) != null) {
            this.ae = object;
        }
        this.ac = fww2.e;
        this.ad = fww2.f;
        this.ab = fww2.g;
        this.aj = fww2.h;
        object = this.I;
        if (object != null) {
            ((giu)object).b();
        }
        this.I = new giu(new fwd(this, 1), fww2.a());
        fww2.c(this.a.getContext(), this.I);
        this.f();
    }

    public final void i(int n2) {
        float f2;
        fww fww2 = new fww(this.a.getContext(), n2);
        Object object = fww2.i;
        if (object != null) {
            this.l = object;
        }
        if ((f2 = fww2.j) != 0.0f) {
            this.k = f2;
        }
        if ((object = fww2.a) != null) {
            this.ai = object;
        }
        this.ag = fww2.e;
        this.ah = fww2.f;
        this.af = fww2.g;
        this.D = fww2.h;
        object = this.H;
        if (object != null) {
            ((giu)object).b();
        }
        this.H = new giu(new fwd(this, 0), fww2.a());
        fww2.c(this.a.getContext(), this.H);
        this.f();
    }
}

