/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class rz
extends ViewGroup.MarginLayoutParams {
    public rw a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p = new Rect();
    private boolean q;

    public rz() {
        super(-2, -2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public rz(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        boolean bl2;
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, ru.b);
        this.c = typedArray.getInteger(0, 0);
        this.f = typedArray.getResourceId(1, -1);
        this.d = typedArray.getInteger(2, 0);
        this.e = typedArray.getInteger(6, -1);
        this.g = typedArray.getInt(5, 0);
        this.h = typedArray.getInt(4, 0);
        this.b = bl2 = typedArray.hasValue(3);
        if (bl2) {
            Object object2 = typedArray.getString(3);
            if (TextUtils.isEmpty((CharSequence)object2)) {
                object = null;
            } else {
                CharSequence charSequence;
                if (((String)object2).startsWith(".")) {
                    charSequence = String.valueOf(object.getPackageName()).concat(String.valueOf(object2));
                } else {
                    charSequence = object2;
                    if (((String)object2).indexOf(46) < 0) {
                        charSequence = object2;
                        if (!TextUtils.isEmpty((CharSequence)CoordinatorLayout.a)) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(CoordinatorLayout.a);
                            ((StringBuilder)charSequence).append('.');
                            ((StringBuilder)charSequence).append((String)object2);
                            charSequence = ((StringBuilder)charSequence).toString();
                        }
                    }
                }
                try {
                    Constructor<?> constructor = (Map)CoordinatorLayout.c.get();
                    object2 = constructor;
                    if (constructor == null) {
                        object2 = new Object();
                        CoordinatorLayout.c.set(object2);
                    }
                    Constructor constructor2 = (Constructor)object2.get(charSequence);
                    constructor = constructor2;
                    if (constructor2 == null) {
                        constructor = Class.forName((String)charSequence, false, object.getClassLoader()).getConstructor(CoordinatorLayout.b);
                        constructor.setAccessible(true);
                        object2.put(charSequence, constructor);
                    }
                    object = (rw)constructor.newInstance(object, attributeSet);
                }
                catch (Exception exception) {
                    throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(charSequence)), exception);
                }
            }
            this.a = object;
        }
        typedArray.recycle();
        object = this.a;
        if (object != null) {
            ((rw)object).a(this);
        }
    }

    public rz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public rz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public rz(rz rz2) {
        super((ViewGroup.MarginLayoutParams)rz2);
    }

    public final void a() {
        this.o = false;
    }

    public final void b(rw rw2) {
        rw rw3 = this.a;
        if (rw3 != rw2) {
            if (rw3 != null) {
                rw3.b();
            }
            this.a = rw2;
            this.b = true;
            if (rw2 != null) {
                rw2.a(this);
            }
        }
    }

    public final void c(int n2, boolean bl2) {
        if (n2 != 0) {
            this.q = bl2;
            return;
        }
        this.n = bl2;
    }

    public final boolean d(int n2) {
        if (n2 != 0) {
            return this.q;
        }
        return this.n;
    }
}

