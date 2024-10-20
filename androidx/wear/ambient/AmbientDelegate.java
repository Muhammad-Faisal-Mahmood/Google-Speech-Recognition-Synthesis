/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.AttributeSet
 *  com.google.android.wearable.compat.WearableActivityController
 *  com.google.android.wearable.compat.WearableActivityController$AmbientCallback
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.wear.ambient.WearableControllerProvider$1;
import com.google.android.wearable.compat.WearableActivityController;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class AmbientDelegate {
    public Object a;
    public final Object b;
    public final Object c;

    public AmbientDelegate() {
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public AmbientDelegate(abe abe2) {
        this.b = new abg(abe2);
        this.c = new Handler();
    }

    public AmbientDelegate(Activity activity, AmbientDelegate$AmbientCallback ambientDelegate$AmbientCallback) {
        this.c = new WeakReference<Activity>(activity);
        this.b = ambientDelegate$AmbientCallback;
    }

    public AmbientDelegate(Context context) {
        this.c = new Object();
        this.b = context.getApplicationContext();
    }

    private AmbientDelegate(Context context, TypedArray typedArray) {
        this.c = context;
        this.b = typedArray;
    }

    public AmbientDelegate(att object, jrk object2) {
        this.c = object;
        Object object3 = new mz(this, 5);
        List list = jns.o(((att)object).d, new auj((jrk)object3));
        Context context = ((att)object).a;
        String string = ((att)object).b;
        awo awo2 = ((att)object).c;
        bzb bzb2 = ((att)object).n;
        boolean bl2 = ((att)object).e;
        aul aul2 = ((att)object).f;
        object3 = ((att)object).g;
        Executor executor = ((att)object).h;
        boolean bl3 = ((att)object).i;
        boolean bl4 = ((att)object).j;
        Set set = ((att)object).k;
        List list2 = ((att)object).l;
        List list3 = ((att)object).m;
        jse.e(context, "context");
        jse.e((Object)aul2, "journalMode");
        this.b = new avh(new bzb((awp)object2.a(new att(context, string, awo2, bzb2, list, bl2, aul2, (Executor)object3, executor, bl3, bl4, set, list2, list3))));
        object2 = object;
        object2 = ((att)object).f;
        object3 = aul.c;
        object = this.B();
        if (object != null) {
            bl2 = object2 == object3;
            object.c(bl2);
        }
    }

    public AmbientDelegate(brg brg2, brd brd2) {
        this.b = brg2;
        this.c = brd2;
    }

    public AmbientDelegate(dgx dgx2) {
        this.c = new dcx();
        this.b = dgx2;
    }

    public AmbientDelegate(byte[] byArray) {
        this.c = new kjx(null, null);
        this.b = new kjx(null, null);
        this.a = new qb[32];
    }

    public AmbientDelegate(byte[] byArray, byte[] byArray2) {
        this.c = new khv(null);
        this.b = new khv(null);
        this.a = new k[32];
    }

    public static AmbientDelegate A(Context context, AttributeSet attributeSet, int[] nArray, int n2, int n3) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(attributeSet, nArray, n2, n3));
    }

    public static AmbientDelegate y(Context context, int n2, int[] nArray) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(n2, nArray));
    }

    public static AmbientDelegate z(Context context, AttributeSet attributeSet, int[] nArray) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(attributeSet, nArray));
    }

    public final awp B() {
        Object object;
        Object object2 = object = this.b;
        if (!(object instanceof avh)) {
            object2 = null;
        }
        if (object2 != null) {
            return ((avh)object2).b.a;
        }
        return null;
    }

    final void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).dump(string, fileDescriptor, printWriter, stringArray);
        }
    }

    final void b() {
        Object object;
        block7: {
            object = (Activity)((WeakReference)this.c).get();
            if (object != null) {
                block6: {
                    Object object2 = this.b;
                    SharedLibraryVersion.verifySharedLibraryPresent();
                    WearableControllerProvider$1 wearableControllerProvider$1 = new WearableControllerProvider$1((AmbientDelegate$AmbientCallback)object2);
                    if (!WearableControllerProvider.a) {
                        object2 = WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class);
                        StringBuilder stringBuilder = new StringBuilder(".");
                        stringBuilder.append(((Method)object2).getName());
                        boolean bl2 = ".onEnterAmbient".equals(stringBuilder.toString());
                        if (!bl2) break block6;
                        WearableControllerProvider.a = true;
                    }
                    this.a = new WearableActivityController("WearableControllerProvider", object, (WearableActivityController.AmbientCallback)wearableControllerProvider$1);
                    break block7;
                }
                try {
                    object = new NoSuchMethodException();
                    throw object;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
                }
            }
        }
        if ((object = this.a) != null) {
            ((WearableActivityController)object).onCreate();
        }
    }

    final void c() {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).onDestroy();
        }
    }

    final void d() {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).onPause();
        }
    }

    final void e() {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).onResume();
        }
    }

    final void f() {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).onStop();
        }
    }

    final void g() {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).setAmbientEnabled();
        }
    }

    final boolean h() {
        Object object = this.a;
        if (object != null) {
            return ((WearableActivityController)object).isAmbient();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File i() {
        Object object = this.c;
        synchronized (object) {
            if (this.a == null) {
                this.a = ag$$ExternalSyntheticApiModelOutline1.m((Context)this.b);
            }
            Object object2 = this.a;
            return (File)object2;
        }
    }

    public final void j(aaz object) {
        Object object2 = this.a;
        if (object2 != null) {
            ((acg)object2).run();
        }
        this.a = object2 = new acg((abg)this.b, (aaz)((Object)object));
        object = this.c;
        jse.b(object2);
        ((Handler)object).postAtFrontOfQueue((Runnable)object2);
    }

    public final int k(int n2, int n3) {
        return ((TypedArray)this.b).getDimensionPixelOffset(n2, n3);
    }

    public final int l(int n2, int n3) {
        return ((TypedArray)this.b).getDimensionPixelSize(n2, n3);
    }

    public final int m(int n2, int n3) {
        return ((TypedArray)this.b).getInt(n2, n3);
    }

    public final int n(int n2, int n3) {
        return ((TypedArray)this.b).getInteger(n2, n3);
    }

    public final int o(int n2, int n3) {
        return ((TypedArray)this.b).getLayoutDimension(n2, n3);
    }

    public final int p(int n2, int n3) {
        return ((TypedArray)this.b).getResourceId(n2, n3);
    }

    public final ColorStateList q(int n2) {
        ColorStateList colorStateList;
        int n3;
        if (((TypedArray)this.b).hasValue(n2) && (n3 = ((TypedArray)this.b).getResourceId(n2, 0)) != 0 && (colorStateList = ye.f((Context)this.c, n3)) != null) {
            return colorStateList;
        }
        return ((TypedArray)this.b).getColorStateList(n2);
    }

    public final Drawable r(int n2) {
        int n3;
        if (((TypedArray)this.b).hasValue(n2) && (n3 = ((TypedArray)this.b).getResourceId(n2, 0)) != 0) {
            return kh.g((Context)this.c, n3);
        }
        return ((TypedArray)this.b).getDrawable(n2);
    }

    public final Drawable s(int n2) {
        if (((TypedArray)this.b).hasValue(n2) && (n2 = ((TypedArray)this.b).getResourceId(n2, 0)) != 0) {
            Object object = this.c;
            return hj.d().g((Context)object, n2);
        }
        return null;
    }

    public final void setAmbientOffloadEnabled(boolean bl2) {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).setAmbientOffloadEnabled(bl2);
        }
    }

    public final void setAutoResumeEnabled(boolean bl2) {
        Object object = this.a;
        if (object != null) {
            ((WearableActivityController)object).setAutoResumeEnabled(bl2);
        }
    }

    public final CharSequence t(int n2) {
        return ((TypedArray)this.b).getText(n2);
    }

    public final String u(int n2) {
        return ((TypedArray)this.b).getString(n2);
    }

    public final void v() {
        ((TypedArray)this.b).recycle();
    }

    public final boolean w(int n2, boolean bl2) {
        return ((TypedArray)this.b).getBoolean(n2, bl2);
    }

    public final boolean x(int n2) {
        return ((TypedArray)this.b).hasValue(n2);
    }
}

