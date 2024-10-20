/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import com.android.car.ui.FocusArea;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bji {
    public static final List a = Arrays.asList(17, 66, 33, 130);
    public static final List b = Arrays.asList(1, 0x1000000, 0x2000000, 0x20000000);
    public final ViewTreeObserver.OnTouchModeChangeListener A;
    public boolean B;
    public final long C;
    public long D;
    public FocusArea E;
    public final bxt F;
    private boolean G;
    private final SparseIntArray H;
    private final Set I;
    public final ViewGroup c;
    public boolean d;
    public final boolean e;
    public final boolean f;
    public final Drawable g;
    public final Drawable h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public View s;
    public SparseArray t;
    public final SparseIntArray u;
    public SparseArray v;
    public boolean w;
    public final boolean x;
    public View y;
    public final ViewTreeObserver.OnGlobalFocusChangeListener z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public bji(ViewGroup object, AttributeSet attributeSet) {
        int n2;
        int n3;
        int n4;
        TypedArray typedArray;
        HashSet<Integer> hashSet;
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        this.H = sparseIntArray2 = new SparseIntArray();
        this.u = sparseIntArray = new SparseIntArray();
        this.I = hashSet = new HashSet<Integer>();
        int n5 = 1;
        this.B = true;
        this.c = object;
        this.z = new bjj(this, 1);
        Context context = object.getContext();
        Resources resources = context.getResources();
        this.e = resources.getBoolean(2131034117);
        this.f = resources.getBoolean(2131034116);
        this.g = resources.getDrawable(2131230914, context.getTheme());
        this.h = resources.getDrawable(2131230913, context.getTheme());
        this.x = resources.getBoolean(2131034115);
        this.F = new bxt(resources.getInteger(2131492872), resources.getInteger(2131492873), resources.getInteger(2131492870), resources.getInteger(2131492871));
        this.C = resources.getInteger(2131492876);
        this.A = new bjk(this, 1);
        object.setImportantForAccessibility(1);
        object.setWillNotDraw(false);
        if (typedArray == null) {
            return;
        }
        typedArray = context.obtainStyledAttributes((AttributeSet)typedArray, bjm.j);
        this.r = typedArray.getResourceId(1, -1);
        int n6 = n4 = typedArray.getDimensionPixelSize(7, -1);
        if (n4 == -1) {
            n6 = typedArray.getDimensionPixelSize(6, 0);
        }
        n4 = n3 = typedArray.getDimensionPixelSize(5, -1);
        if (n3 == -1) {
            n4 = typedArray.getDimensionPixelSize(6, 0);
        }
        boolean bl2 = (n2 = object.getLayoutDirection()) == 1;
        this.q = bl2;
        n3 = n2 == 1 ? n4 : n6;
        this.i = n3;
        n3 = n2 == 1 ? n6 : n4;
        this.j = n3;
        this.k = n3 = typedArray.getDimensionPixelSize(8, -1);
        if (n3 == -1) {
            this.k = typedArray.getDimensionPixelSize(9, 0);
        }
        this.l = n3 = typedArray.getDimensionPixelSize(4, -1);
        if (n3 == -1) {
            this.l = typedArray.getDimensionPixelSize(9, 0);
        }
        n3 = n2 = typedArray.getDimensionPixelSize(25, -1);
        if (n2 == -1) {
            n3 = typedArray.getDimensionPixelSize(10, n6);
        }
        n6 = n2 = typedArray.getDimensionPixelSize(3, -1);
        if (n2 == -1) {
            n6 = typedArray.getDimensionPixelSize(10, n4);
        }
        n4 = true != (bl2 = this.q) ? n3 : n6;
        this.m = n4;
        if (!bl2) {
            n3 = n6;
        }
        this.n = n3;
        this.o = n4 = typedArray.getDimensionPixelSize(26, -1);
        if (n4 == -1) {
            this.o = typedArray.getDimensionPixelSize(27, this.k);
        }
        this.p = n4 = typedArray.getDimensionPixelSize(0, -1);
        if (n4 == -1) {
            this.p = typedArray.getDimensionPixelSize(27, this.l);
        }
        if (typedArray.hasValue(16)) {
            sparseIntArray2.put(17, typedArray.getResourceId(16, -1));
        }
        if (typedArray.hasValue(19)) {
            sparseIntArray2.put(66, typedArray.getResourceId(19, -1));
        }
        if (typedArray.hasValue(24)) {
            sparseIntArray2.put(33, typedArray.getResourceId(24, -1));
        }
        if (typedArray.hasValue(13)) {
            sparseIntArray2.put(130, typedArray.getResourceId(13, -1));
        }
        n2 = typedArray.getResourceId(20, -1);
        n3 = typedArray.getInt(21, -1);
        n6 = n3 == -1 ? n5 : 0;
        if ((n6 ^ (n4 = n2 == -1 ? 1 : 0)) == 0) {
            if (n2 != -1) {
                if (sparseIntArray2.size() > 0) {
                    IllegalStateException illegalStateException = new IllegalStateException("Don't use nudgeShortcut/nudgeShortcutDirection and nudge*Shortcut in the same focus area. Use nudge*Shortcut only.");
                    throw illegalStateException;
                }
                sparseIntArray2.put(n3, n2);
            }
            if (typedArray.hasValue(14)) {
                sparseIntArray.put(17, typedArray.getResourceId(14, -1));
            }
            if (typedArray.hasValue(17)) {
                sparseIntArray.put(66, typedArray.getResourceId(17, -1));
            }
            if (typedArray.hasValue(22)) {
                sparseIntArray.put(33, typedArray.getResourceId(22, -1));
            }
            if (typedArray.hasValue(11)) {
                sparseIntArray.put(130, typedArray.getResourceId(11, -1));
            }
            if (typedArray.getBoolean(15, false)) {
                hashSet.add(17);
            }
            if (typedArray.getBoolean(18, false)) {
                hashSet.add(66);
            }
            if (typedArray.getBoolean(23, false)) {
                hashSet.add(33);
            }
            if (typedArray.getBoolean(12, false)) {
                hashSet.add(130);
            }
            this.G = typedArray.getBoolean(2, false);
            this.w = typedArray.getBoolean(28, false);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("nudgeShortcut and nudgeShortcutDirection must be specified together");
        throw illegalStateException;
    }

    public static int a(Bundle bundle) {
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt("com.android.car.ui.utils.NUDGE_DIRECTION", -1);
    }

    public final void b() {
        if (this.t == null) {
            View view = this.c.getRootView();
            this.t = new SparseArray();
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                int n2 = (Integer)iterator.next();
                int n3 = this.H.get(n2, -1);
                this.t.put(n2, (Object)view.findViewById(n3));
            }
        }
    }

    public final boolean c() {
        Object object = this.F.b;
        long l2 = SystemClock.uptimeMillis();
        object = ((bjo)object).a(l2);
        boolean bl2 = this.G;
        return AmbientModeSupport$AmbientCallback.k((View)this.c, 1, (View)object, bl2, false);
    }

    public final boolean d(int n2) {
        return this.I.contains(n2);
    }

    public final boolean e() {
        View view = this.c.getRootView();
        return AmbientModeSupport$AmbientCallback.j(view, AmbientModeSupport$AmbientCallback.c(view.findFocus()), null, false);
    }

    public final boolean f() {
        if (SystemClock.uptimeMillis() <= this.D) {
            this.D = 0L;
            return true;
        }
        return false;
    }
}

