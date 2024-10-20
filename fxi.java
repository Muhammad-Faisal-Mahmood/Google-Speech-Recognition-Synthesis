/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.AndroidRuntimeException
 *  android.util.Log
 *  android.util.StateSet
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.StateSet;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.BitSet;

public class fxi
extends Drawable
implements fxx {
    public static final int j = 0;
    private static final String k = "fxi";
    private static final Paint l;
    private static final fxh[] m;
    private final RectF A;
    private boolean B;
    private boolean C;
    private fxm D;
    private zk E;
    private float[] F;
    private final AmbientModeSupport$AmbientController G;
    private final AmbientModeSupport$AmbientController H = new AmbientModeSupport$AmbientController(this);
    public fxg a;
    public final fxv[] b = new fxv[4];
    public final fxv[] c = new fxv[4];
    public final BitSet d = new BitSet(8);
    public boolean e;
    public boolean f;
    public int g;
    public float[] h;
    zh[] i;
    private final Matrix n = new Matrix();
    private final Path o = new Path();
    private final Path p = new Path();
    private final RectF q = new RectF();
    private final RectF r = new RectF();
    private final Region s = new Region();
    private final Region t = new Region();
    private final Paint u;
    private final Paint v;
    private final fwz w;
    private final fxo x;
    private PorterDuffColorFilter y;
    private PorterDuffColorFilter z;

    static {
        gch gch2 = new gch(null);
        int n2 = 0;
        fxh[] fxhArray = fxf.e(0);
        gch2.j((fxf)fxhArray);
        gch2.k((fxf)fxhArray);
        gch2.i((fxf)fxhArray);
        gch2.h((fxf)fxhArray);
        gch2.g(0.0f);
        fxhArray = new Paint(1);
        l = fxhArray;
        fxhArray.setColor(-1);
        fxhArray.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m = new fxh[4];
        while (true) {
            fxhArray = m;
            int n3 = fxhArray.length;
            if (n2 >= 4) break;
            fxhArray[n2] = new fxh(n2);
            ++n2;
        }
    }

    public fxi() {
        this(new fxm());
    }

    protected fxi(fxg fxg2) {
        Paint paint;
        Paint paint2;
        this.u = paint2 = new Paint(1);
        this.v = paint = new Paint(1);
        this.w = new fwz();
        fxo fxo2 = Looper.getMainLooper().getThread() == Thread.currentThread() ? fxn.a : new fxo();
        this.x = fxo2;
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.i = new zh[4];
        this.a = fxg2;
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        this.A();
        this.z(this.getState());
        this.G = new AmbientModeSupport$AmbientController(this);
    }

    public fxi(fxm fxm2) {
        this(new fxg(fxm2));
    }

    private final boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        fxg fxg2 = this.a;
        this.y = this.s(fxg2.g, fxg2.h, this.u, true);
        fxg2 = this.a;
        ColorStateList colorStateList = fxg2.f;
        this.z = this.s(null, fxg2.h, this.v, false);
        boolean bl2 = this.a.u;
        return !Objects.equals(porterDuffColorFilter, this.y) || !Objects.equals(porterDuffColorFilter2, this.z);
        {
        }
    }

    private static final float B(RectF rectF, fxm fxm2, float[] fArray) {
        if (fArray == null) {
            if (fxm2.d(rectF)) {
                return fxm2.b.a(rectF);
            }
        } else if (fvd.b(fArray) && fxm2.c()) {
            return fArray[0];
        }
        return -1.0f;
    }

    private static int r(int n2, int n3) {
        return n2 * (n3 + (n3 >>> 7)) >>> 8;
    }

    private final PorterDuffColorFilter s(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean bl2) {
        if (colorStateList != null && mode != null) {
            int n2;
            int n3 = n2 = colorStateList.getColorForState(this.getState(), 0);
            if (bl2) {
                n3 = this.e(n2);
            }
            this.g = n3;
            colorStateList = new PorterDuffColorFilter(n3, mode);
        } else {
            mode = null;
            colorStateList = mode;
            if (bl2) {
                int n4;
                int n5 = paint.getColor();
                this.g = n4 = this.e(n5);
                colorStateList = mode;
                if (n4 != n5) {
                    colorStateList = new PorterDuffColorFilter(n4, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        return colorStateList;
    }

    private final RectF t() {
        this.r.set(this.h());
        RectF rectF = this.r;
        float f2 = this.b();
        rectF.inset(f2, f2);
        return this.r;
    }

    private final void u(RectF rectF, Path path) {
        Object object = this.a;
        fxm fxm2 = object.a;
        float[] fArray = this.h;
        float f2 = object.k;
        object = this.G;
        this.x.b(fxm2, fArray, f2, rectF, (AmbientModeSupport$AmbientController)object, path);
        if (this.a.j != 1.0f) {
            this.n.reset();
            fxm2 = this.n;
            f2 = this.a.j;
            fxm2.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.n);
        }
        path.computeBounds(this.A, true);
    }

    private final void v(Canvas canvas) {
        int n2;
        if (this.d.cardinality() > 0) {
            Log.w((String)k, (String)"Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int n3 = this.a.s;
        int n4 = n2 = 0;
        if (n3 != 0) {
            canvas.drawPath(this.o, this.w.e);
            n4 = n2;
        }
        while (n4 < 4) {
            Object object = this.b;
            fxv[] fxvArray = this.w;
            object[n4].c((fwz)fxvArray, this.a.r, canvas);
            fxvArray = this.c;
            object = this.w;
            fxvArray[n4].c((fwz)object, this.a.r, canvas);
            ++n4;
        }
        if (this.B) {
            n4 = this.f();
            n3 = this.g();
            n2 = -n4;
            int n5 = -n3;
            canvas.translate((float)n2, (float)n5);
            canvas.drawPath(this.o, l);
            canvas.translate((float)n4, (float)n3);
        }
    }

    private final void w(Canvas canvas, Paint paint, Path path, fxm fxm2, float[] fArray, RectF rectF) {
        float f2 = fxi.B(rectF, fxm2, fArray);
        if (f2 >= 0.0f) {
            canvas.drawRoundRect(rectF, f2 *= this.a.k, f2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private final void x(int[] object, boolean bl2) {
        RectF rectF = this.h();
        if (this.a.w != null && !rectF.isEmpty()) {
            int n2;
            int n3 = this.E == null ? 1 : 0;
            boolean bl3 = bl2 | n3;
            if (this.h == null) {
                this.h = new float[4];
            }
            Object object2 = this.a.w;
            n3 = n2 = ((izk)object2).a((int[])object);
            if (n2 < 0) {
                n3 = ((izk)object2).a(StateSet.WILD_CARD);
            }
            object = ((fxm[])((izk)object2).b)[n3];
            for (n3 = 0; n3 < 4; ++n3) {
                float f2 = fxo.a(n3, (fxm)object).a(rectF);
                if (bl3) {
                    this.h[n3] = f2;
                    n2 = 1;
                } else {
                    n2 = 0;
                }
                object2 = this.i[n3];
                if (object2 == null) continue;
                ((zh)object2).c(f2);
                if (n2 == 0) continue;
                object2 = this.i[n3];
                if (((zh)object2).r.b > 0.0) {
                    if (yx.a().b()) {
                        if (!((zh)object2).l) continue;
                        ((zh)object2).s = true;
                        continue;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                }
                throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
            }
            if (bl3) {
                this.invalidateSelf();
            }
        }
    }

    private final boolean y() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    private final boolean z(int[] nArray) {
        int n2;
        int n3;
        boolean bl2;
        ColorStateList colorStateList = this.a.d;
        boolean bl3 = bl2 = false;
        if (colorStateList != null) {
            n3 = this.u.getColor();
            n2 = this.a.d.getColorForState(nArray, n3);
            bl3 = bl2;
            if (n3 != n2) {
                this.u.setColor(n2);
                bl3 = true;
            }
        }
        if (this.a.e != null && (n2 = this.v.getColor()) != (n3 = this.a.e.getColorForState(nArray, n2))) {
            this.v.setColor(n3);
            return true;
        }
        return bl3;
    }

    public final float a() {
        return this.a.o;
    }

    public final float b() {
        if (this.y()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override
    public final void c(fxm fxm2) {
        fxg fxg2 = this.a;
        fxg2.a = fxm2;
        fxg2.w = null;
        this.h = null;
        this.F = null;
        this.invalidateSelf();
    }

    public final float d() {
        float f2 = this.a();
        float f3 = this.a.p;
        return f2 + 0.0f;
    }

    public final void draw(Canvas canvas) {
        gch gch2;
        int n2;
        Object object;
        this.u.setColorFilter((ColorFilter)this.y);
        int n3 = this.u.getAlpha();
        int n4 = fxi.r(n3, this.a.m);
        this.u.setAlpha(n4);
        this.v.setColorFilter((ColorFilter)this.z);
        float f2 = this.a.l;
        this.v.setStrokeWidth(f2);
        int n5 = this.v.getAlpha();
        n4 = fxi.r(n5, this.a.m);
        this.v.setAlpha(n4);
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            if (this.e) {
                this.u(this.h(), this.o);
                this.e = false;
            }
            object = this.a;
            n4 = object.q;
            if (!(object.r <= 0 || object.a.d(this.h()) || (object = (Object)this.h) != null && fvd.b((float[])object) && this.a.a.c() || this.o.isConvex() || Build.VERSION.SDK_INT >= 29)) {
                canvas.save();
                n2 = this.f();
                n4 = this.g();
                canvas.translate((float)n2, (float)n4);
                if (!this.B) {
                    this.v(canvas);
                    canvas.restore();
                } else {
                    float f3 = this.A.width();
                    f2 = this.getBounds().width();
                    float f4 = this.A.height();
                    float f5 = this.getBounds().height();
                    n4 = (int)(f3 - f2);
                    if (n4 >= 0 && (n2 = (int)(f4 - f5)) >= 0) {
                        int n6 = (int)this.A.width();
                        int n7 = this.a.r;
                        int n8 = (int)this.A.height();
                        int n9 = this.a.r;
                        object = Bitmap.createBitmap((int)(n6 + (n7 + n7) + n4), (int)(n8 + (n9 + n9) + n2), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        gch2 = new Canvas((Bitmap)object);
                        n9 = this.getBounds().left;
                        n6 = this.a.r;
                        n7 = this.getBounds().top;
                        n8 = this.a.r;
                        f2 = n9 - n6 - n4;
                        f5 = n7 - n8 - n2;
                        gch2.translate(-f2, -f5);
                        this.v((Canvas)gch2);
                        canvas.drawBitmap((Bitmap)object, f2, f5, null);
                        object.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
            this.w(canvas, this.u, this.o, this.a.a, this.h, this.h());
        }
        if (this.y()) {
            if (this.f) {
                object = this.a.a;
                AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = this.H;
                gch2 = new gch((fxm)object);
                gch2.d = ambientModeSupport$AmbientController.i(((fxm)object).b);
                gch2.k = ambientModeSupport$AmbientController.i(((fxm)object).c);
                gch2.b = ambientModeSupport$AmbientController.i(((fxm)object).e);
                gch2.f = ambientModeSupport$AmbientController.i(((fxm)object).d);
                this.D = new fxm(gch2);
                if (this.h == null) {
                    this.F = null;
                } else {
                    if (this.F == null) {
                        this.F = new float[4];
                    }
                    f2 = this.b();
                    n4 = 0;
                    while (true) {
                        object = this.h;
                        n2 = ((fxg)object).length;
                        if (n4 >= 4) break;
                        this.F[n4] = Math.max(0.0f, (float)(object[n4] - f2));
                        ++n4;
                    }
                }
                this.x.b(this.D, this.F, this.a.k, this.t(), null, this.p);
                this.f = false;
            }
            this.w(canvas, this.v, this.p, this.D, this.F, this.t());
        }
        this.u.setAlpha(n3);
        this.v.setAlpha(n5);
    }

    protected final int e(int n2) {
        float f2 = this.d();
        Object object = this.a;
        float f3 = ((fxg)((Object)object)).n;
        object = ((fxg)((Object)object)).b;
        int n3 = n2;
        if (object != null) {
            n3 = ((fve)object).a(n2, f2 + f3);
        }
        return n3;
    }

    public final int f() {
        fxg fxg2 = this.a;
        double d2 = fxg2.s;
        int n2 = fxg2.t;
        return (int)(d2 * Math.sin(Math.toRadians(0.0)));
    }

    public final int g() {
        fxg fxg2 = this.a;
        double d2 = fxg2.s;
        int n2 = fxg2.t;
        return (int)(d2 * Math.cos(Math.toRadians(0.0)));
    }

    public final int getAlpha() {
        return this.a.m;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        int n2 = this.a.q;
        RectF rectF = this.h();
        if (rectF.isEmpty()) {
            return;
        }
        float f2 = fxi.B(rectF, this.a.a, this.h);
        if (f2 >= 0.0f) {
            outline.setRoundRect(this.getBounds(), f2 * this.a.k);
            return;
        }
        if (this.e) {
            this.u(rectF, this.o);
            this.e = false;
        }
        fvc.f(outline, this.o);
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public final Region getTransparentRegion() {
        this.s.set(this.getBounds());
        this.u(this.h(), this.o);
        this.t.setPath(this.o, this.s);
        this.s.op(this.t, Region.Op.DIFFERENCE);
        return this.s;
    }

    public final RectF h() {
        this.q.set(this.getBounds());
        return this.q;
    }

    public final void i(Context context) {
        this.a.b = new fve(context);
        this.p();
    }

    public final void invalidateSelf() {
        this.e = true;
        this.f = true;
        super.invalidateSelf();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isStateful() {
        izk izk2;
        ColorStateList colorStateList;
        boolean bl2;
        boolean bl3 = super.isStateful();
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        ColorStateList colorStateList2 = this.a.g;
        if (colorStateList2 != null) {
            bl4 = bl2;
            if (colorStateList2.isStateful()) return bl4;
        }
        fxg fxg2 = this.a;
        ColorStateList colorStateList3 = fxg2.f;
        ColorStateList colorStateList4 = fxg2.e;
        if (colorStateList4 != null) {
            bl4 = bl2;
            if (colorStateList4.isStateful()) return bl4;
        }
        if ((colorStateList = this.a.d) != null) {
            bl4 = bl2;
            if (colorStateList.isStateful()) return bl4;
        }
        if ((izk2 = this.a.w) == null) return false;
        if (izk2.a <= 1) return false;
        return bl2;
    }

    public final void j(zk zk2) {
        if (this.E != zk2) {
            this.E = zk2;
            int n2 = 0;
            while (true) {
                Object object = this.i;
                int n3 = ((zh[])object).length;
                if (n2 >= 4) break;
                if (object[n2] == null) {
                    object[n2] = new zh(this, m[n2]);
                }
                object = this.i[n2];
                zk zk3 = new zk();
                zk3.c((float)zk2.b);
                double d2 = zk2.a;
                zk3.e((float)(d2 * d2));
                object.r = zk3;
                ++n2;
            }
            this.x(this.getState(), true);
            this.invalidateSelf();
        }
    }

    public final void k(float f2) {
        fxg fxg2 = this.a;
        if (fxg2.o != f2) {
            fxg2.o = f2;
            this.p();
        }
    }

    public final void l(ColorStateList colorStateList) {
        fxg fxg2 = this.a;
        if (fxg2.d != colorStateList) {
            fxg2.d = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public final void m(float f2) {
        fxg fxg2 = this.a;
        if (fxg2.k != f2) {
            fxg2.k = f2;
            this.e = true;
            this.f = true;
            this.invalidateSelf();
        }
    }

    public final Drawable mutate() {
        this.a = new fxg(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        fxg fxg2 = this.a;
        if (fxg2.e != colorStateList) {
            fxg2.e = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public final void o(float f2) {
        this.a.l = f2;
        this.invalidateSelf();
    }

    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (this.a.w != null && !rect.isEmpty()) {
            this.x(this.getState(), this.C);
        }
        this.C = rect.isEmpty();
    }

    protected final boolean onStateChange(int[] nArray) {
        izk izk2 = this.a.w;
        boolean bl2 = false;
        if (izk2 != null) {
            this.x(nArray, false);
        }
        boolean bl3 = this.z(nArray);
        boolean bl4 = this.A();
        if (bl3 || bl4) {
            bl2 = true;
        }
        if (bl2) {
            this.invalidateSelf();
        }
        return bl2;
    }

    public final void p() {
        float f2 = this.d();
        double d2 = 0.75f * f2;
        this.a.r = (int)Math.ceil(d2);
        d2 = f2 * 0.25f;
        this.a.s = (int)Math.ceil(d2);
        this.A();
        super.invalidateSelf();
    }

    public final void q(izk izk2) {
        fxg fxg2 = this.a;
        if (fxg2.w != izk2) {
            fxg2.w = izk2;
            this.x(this.getState(), true);
            this.invalidateSelf();
        }
    }

    public final void setAlpha(int n2) {
        fxg fxg2 = this.a;
        if (fxg2.m != n2) {
            fxg2.m = n2;
            super.invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    public final void setTint(int n2) {
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        this.A();
        super.invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        fxg fxg2 = this.a;
        if (fxg2.h != mode) {
            fxg2.h = mode;
            this.A();
            super.invalidateSelf();
        }
    }
}

