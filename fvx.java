/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class fvx {
    static final TimeInterpolator a = ftf.c;
    public static final int b = 2130969598;
    public static final int c = 2130969614;
    public static final int d = 2130969601;
    public static final int e = 2130969612;
    static final int[] f = new int[]{16842919, 16842910};
    static final int[] g = new int[]{16843623, 16842908, 16842910};
    static final int[] h = new int[]{16842908, 16842910};
    static final int[] i = new int[]{16843623, 16842910};
    static final int[] j = new int[]{16842910};
    static final int[] k = new int[0];
    public int A = 0;
    public final FloatingActionButton B;
    public ViewTreeObserver.OnPreDrawListener C;
    final AmbientModeSupport$AmbientController D;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();
    private final hth I;
    public fxm l;
    public fxi m;
    public Drawable n;
    public fvh o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public fti w;
    public fti x;
    public float y = 1.0f;
    public int z;

    public fvx(FloatingActionButton floatingActionButton, AmbientModeSupport$AmbientController object) {
        this.B = floatingActionButton;
        this.D = object;
        this.I = object = new hth();
        ((hth)object).m(fvx.p(new fvu(this)));
        ((hth)object).m(fvx.p(new fvt(this)));
        ((hth)object).m(fvx.p(new fvt(this)));
        ((hth)object).m(fvx.p(new fvt(this)));
        ((hth)object).m(fvx.p(new fvv(this)));
        ((hth)object).m(fvx.p(new fvs(this)));
        floatingActionButton.getRotation();
    }

    private static final ValueAnimator p(fvw fvw2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener((Animator.AnimatorListener)fvw2);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)fvw2);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private static final void q(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator((TypeEvaluator)new fvr());
    }

    public float a() {
        return this.r;
    }

    public final int b() {
        if (this.q) {
            return Math.max((this.u - this.B.b()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet c(fti fti2, float f2, float f3, float f4) {
        ArrayList<Property> arrayList = new ArrayList<Property>();
        Object object = View.ALPHA;
        object = ObjectAnimator.ofFloat((Object)this.B, (Property)object, (float[])new float[]{f2});
        fti2.b("opacity").b((Animator)object);
        arrayList.add((Property)object);
        object = View.SCALE_X;
        object = ObjectAnimator.ofFloat((Object)this.B, (Property)object, (float[])new float[]{f3});
        fti2.b("scale").b((Animator)object);
        fvx.q((ObjectAnimator)object);
        arrayList.add((Property)object);
        object = View.SCALE_Y;
        object = ObjectAnimator.ofFloat((Object)this.B, (Property)object, (float[])new float[]{f3});
        fti2.b("scale").b((Animator)object);
        fvx.q((ObjectAnimator)object);
        arrayList.add((Property)object);
        this.e(f4, this.H);
        ftg ftg2 = new ftg();
        object = new fvp(this);
        Matrix matrix = new Matrix(this.H);
        object = ObjectAnimator.ofObject((Object)this.B, (Property)ftg2, (TypeEvaluator)object, (Object[])new Matrix[]{matrix});
        fti2.b("iconScale").b((Animator)object);
        arrayList.add((Property)object);
        fti2 = new AnimatorSet();
        fvc.E((AnimatorSet)fti2, arrayList);
        return fti2;
    }

    public final AnimatorSet d(float f2, float f3, float f4, int n2, int n3) {
        AnimatorSet animatorSet = new AnimatorSet();
        Object object = new ArrayList<ValueAnimator>();
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        FloatingActionButton floatingActionButton = this.B;
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new fvq(this, floatingActionButton.getAlpha(), f2, floatingActionButton.getScaleX(), f3, floatingActionButton.getScaleY(), this.y, f4, new Matrix(this.H)));
        object.add(valueAnimator);
        fvc.E(animatorSet, object);
        object = this.B;
        animatorSet.setDuration((long)fvc.p(object.getContext(), n2, object.getContext().getResources().getInteger(2131492965)));
        animatorSet.setInterpolator(fvc.t(this.B.getContext(), n3, ftf.b));
        return animatorSet;
    }

    public final void e(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.B.getDrawable();
        if (drawable != null && this.z != 0) {
            RectF rectF = this.F;
            RectF rectF2 = this.G;
            rectF.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            float f3 = this.z;
            rectF2.set(0.0f, 0.0f, f3, f3);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            f3 = (float)this.z / 2.0f;
            matrix.postScale(f2, f2, f3, f3);
        }
    }

    public void f(Rect rect) {
        int n2 = this.b();
        float f2 = this.a() + this.t;
        int n3 = Math.max(n2, (int)Math.ceil(f2));
        n2 = Math.max(n2, (int)Math.ceil(f2 * 1.5f));
        rect.set(n3, n2, n3, n2);
    }

    public void g(float f2, float f3, float f4) {
        throw null;
    }

    public final void h(float f2) {
        this.y = f2;
        Matrix matrix = this.H;
        this.e(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void i(fxm fxm2) {
        this.l = fxm2;
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.c(fxm2);
        }
        if ((drawable = this.o) != null) {
            drawable.h = fxm2;
            drawable.invalidateSelf();
        }
    }

    public final void j() {
        this.h(this.y);
    }

    public final void k() {
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController;
        Object object = this.E;
        this.f((Rect)object);
        a.s(this.p, "Didn't initialize content background");
        if (this.m()) {
            ambientModeSupport$AmbientController = new InsetDrawable(this.p, object.left, object.top, object.right, object.bottom);
            this.D.j((Drawable)ambientModeSupport$AmbientController);
        } else {
            this.D.j(this.p);
        }
        ambientModeSupport$AmbientController = this.D;
        int n2 = object.left;
        int n3 = object.top;
        int n4 = object.right;
        int n5 = object.bottom;
        ((FloatingActionButton)ambientModeSupport$AmbientController.a).c.set(n2, n3, n4, n5);
        object = (FloatingActionButton)ambientModeSupport$AmbientController.a;
        int n6 = object.a;
        object.setPadding(n2 + n6, n3 + n6, n4 + n6, n5 + n6);
    }

    public final void l(float f2) {
        fxi fxi2 = this.m;
        if (fxi2 != null) {
            fxi2.k(f2);
        }
    }

    public boolean m() {
        return true;
    }

    public final boolean n() {
        return this.B.isLaidOut() && !this.B.isInEditMode();
    }

    final boolean o() {
        return !this.q || this.B.b() >= this.u;
        {
        }
    }
}

