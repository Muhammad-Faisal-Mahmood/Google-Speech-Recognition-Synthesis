/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.content.ComponentName
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.text.method.KeyListener
 *  android.text.method.NumberKeyListener
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.inputmethod.InputConnection
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class awg {
    public final Object a;
    public final Object b;

    public awg() {
        this.b = new jua(0, jud.a);
        this.a = new jtz(false, jud.a);
    }

    public awg(int n2, int n3) {
        this.b = new int[]{n2, n3};
        this.a = new float[]{0.0f, 1.0f};
    }

    public awg(int n2, int n3, int n4) {
        this.b = new int[]{n2, n3, n4};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public awg(aex aex2, int ... nArray) {
        this(aex2, nArray, (byte[])null);
    }

    public awg(aex aex2, int[] nArray, byte[] byArray) {
        if (nArray.length == 0) {
            afx.c("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = aex2;
        this.b = nArray;
    }

    public awg(Animator animator) {
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        AnimatorSet animatorSet2 = animatorSet;
        animatorSet.play(animator);
    }

    public awg(ComponentName componentName, IBinder iBinder) {
        this.a = componentName;
        this.b = iBinder;
    }

    public awg(Animation animation) {
        this.b = animation;
        this.a = null;
    }

    public awg(EditText editText) {
        this.a = editText;
        this.b = new bxt(editText);
    }

    public awg(awi awi2) {
        this.a = awi2;
        this.b = new awf(awi2);
    }

    public awg(by by2) {
        this.a = by2;
        this.b = new CopyOnWriteArrayList();
    }

    public awg(bzb bzb2, Executor executor) {
        this.a = bzb2;
        this.b = executor;
    }

    public awg(Object object, Object object2) {
        this.b = object;
        this.a = object2;
    }

    public awg(String string) {
        this.b = new HashMap();
        this.a = string;
    }

    public awg(List list, List list2) {
        int n2 = list.size();
        this.b = new int[n2];
        this.a = new float[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            float f2;
            int n3;
            Object object = this.b;
            ((int[])object)[i2] = n3 = ((Integer)list.get(i2)).intValue();
            object = this.a;
            ((float[])object)[i2] = f2 = ((Float)list2.get(i2)).floatValue();
        }
    }

    public awg(mg mg2) {
        this.b = mg2;
        this.a = new mf();
    }

    public static final boolean g(String string, String string2) {
        if (!(string = ss.a(string)).equals(string2 = ss.a(string2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append('/');
            if (!string.startsWith(stringBuilder.toString())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener l(KeyListener keyListener) {
        KeyListener keyListener2 = keyListener;
        if (awg.k(keyListener)) {
            if (keyListener instanceof zr) {
                keyListener2 = keyListener;
            } else if (keyListener == null) {
                keyListener2 = null;
            } else {
                keyListener2 = keyListener;
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new zr(keyListener);
                }
            }
        }
        return keyListener2;
    }

    public final void A(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.A((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void B(hti object) {
        if (((hti)object).a == 0) {
            Object object2 = ((hti)object).b;
            object = this.a;
            this.b.execute(new aj((bzb)object, (Typeface)object2, 16));
            return;
        }
        object = this.a;
        this.b.execute(new kd(object, 11));
    }

    public final void a() {
        ((awi)this.a).a();
    }

    public final void b(Bundle object) {
        awi awi2 = (awi)this.a;
        if (!awi2.c) {
            awi2.a();
        }
        if (!awi2.a.getLifecycle().a().a(aba.d)) {
            if (!awi2.e) {
                Bundle bundle;
                Bundle bundle2 = bundle = null;
                if (object != null) {
                    bundle2 = bundle;
                    if (object.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                        if (object.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                            bundle2 = object.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                            if (bundle2 == null) {
                                throw new IllegalStateException("Saved state key 'androidx.lifecycle.BundlableSavedStateRegistry.key' was not found");
                            }
                        } else {
                            throw new IllegalStateException("Saved state key 'androidx.lifecycle.BundlableSavedStateRegistry.key' was not found");
                        }
                    }
                }
                awi2.d = bundle2;
                awi2.e = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        object = awi2.a.getLifecycle().a();
        Objects.toString(object);
        throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(object)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(Bundle bundle) {
        jse.e(bundle, "outBundle");
        jse.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        xm.h(bundle2);
        Iterator iterator = this.a;
        awi awi2 = (awi)((Object)iterator);
        Bundle bundle3 = awi2.d;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        xm bundle32 = awi2.g;
        // MONITORENTER : bundle32
        iterator = ((awi)((Object)iterator)).b.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                // MONITOREXIT : bundle32
                if (bundle2.isEmpty()) return;
                xm.h(bundle);
                bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
                return;
            }
            Map.Entry entry = iterator.next();
            bundle2.putBundle((String)entry.getKey(), ((awe)entry.getValue()).a());
        }
    }

    public final void d() {
        synchronized (this) {
            block4: {
                ((jua)this.b).c();
                int n2 = ((jua)this.b).b;
                if (n2 < 0) break block4;
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Unbalanced call to unblock() detected.");
            throw illegalStateException;
        }
    }

    public final boolean e() {
        synchronized (this) {
            block4: {
                boolean bl2 = ((jtz)this.a).b();
                if (!bl2) break block4;
                return false;
            }
            ((jua)this.b).a();
            return true;
        }
    }

    public final File f(Uri object) {
        Object object2 = object.getEncodedPath();
        int n2 = ((String)object2).indexOf(47, 1);
        Object object3 = Uri.decode((String)((String)object2).substring(1, n2));
        object2 = Uri.decode((String)((String)object2).substring(n2 + 1));
        if ((object3 = (File)((HashMap)this.b).get(object3)) != null) {
            object = new File((File)object3, (String)object2);
            try {
                object2 = ((File)object).getCanonicalFile();
            }
            catch (IOException iOException) {
                object.toString();
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(object.toString()));
            }
            if (awg.g(((File)object2).getPath(), ((File)object3).getPath())) {
                return object2;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        }
        Objects.toString(object);
        throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(object)));
    }

    public final View h(int n2, int n3, int n4, int n5) {
        int n6;
        Object object = this.b;
        int n7 = object.d();
        int n8 = object.c();
        object = null;
        for (int i2 = n2; i2 != n3; i2 += n6) {
            Object object2 = this.b;
            View view = object2.e(i2);
            n6 = object2.b(view);
            int n9 = this.b.a(view);
            ((mf)this.a).c(n7, n8, n6, n9);
            ((mf)this.a).b();
            ((mf)this.a).a(n4);
            object2 = (mf)this.a;
            if (!((mf)object2).d()) {
                ((mf)object2).b();
                ((mf)this.a).a(n5);
                boolean bl2 = ((mf)this.a).d();
                n6 = 1;
                if (bl2) {
                    object = view;
                }
                if (n3 > n2) continue;
                n6 = -1;
                continue;
            }
            return view;
        }
        return object;
    }

    public final boolean i(View view) {
        Object object = this.a;
        Object object2 = this.b;
        int n2 = object2.d();
        int n3 = object2.c();
        int n4 = object2.b(view);
        int n5 = object2.a(view);
        ((mf)object).c(n2, n3, n4, n5);
        ((mf)this.a).b();
        ((mf)this.a).a(24579);
        return ((mf)this.a).d();
    }

    public final void j(AttributeSet object, int n2) {
        boolean bl2;
        TypedArray typedArray;
        block6: {
            typedArray = ((EditText)this.a).getContext().obtainStyledAttributes(object, er.i, n2, 0);
            boolean bl3 = typedArray.hasValue(14);
            bl2 = true;
            if (!bl3) break block6;
            bl2 = typedArray.getBoolean(14, true);
        }
        object = (zu)((bxt)this.b).b;
        if (object.a != bl2) {
            object.a = bl2;
            if (bl2) {
                zl.a();
                throw null;
            }
        }
        return;
        finally {
            typedArray.recycle();
        }
    }

    public final InputConnection m(InputConnection inputConnection) {
        InputConnection inputConnection2;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            inputConnection2 = inputConnection;
            if (!(inputConnection instanceof zq)) {
                return new zq((TextView)((bxt)this.b).a, inputConnection);
            }
        }
        return inputConnection2;
    }

    public final void n(be object, Bundle bundle, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.n((be)object, bundle, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(be object, boolean bl2) {
        jse.e(object, "f");
        by by2 = (by)this.a;
        Object object2 = by2.l.c;
        object2 = by2.n;
        if (object2 != null) {
            ((be)object2).getParentFragmentManager().z.o((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void p(be object, Bundle bundle, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.p((be)object, bundle, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void q(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.q((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void r(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.r((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void s(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.s((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void t(be object, boolean bl2) {
        jse.e(object, "f");
        by by2 = (by)this.a;
        Object object2 = by2.l.c;
        object2 = by2.n;
        if (object2 != null) {
            ((be)object2).getParentFragmentManager().z.t((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void u(be object, Bundle bundle, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.u((be)object, bundle, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void v(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.v((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void w(be object, Bundle bundle, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.w((be)object, bundle, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void x(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.x((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void y(be object, boolean bl2) {
        jse.e(object, "f");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.y((be)object, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }

    public final void z(be object, View view, Bundle bundle, boolean bl2) {
        jse.e(object, "f");
        jse.e(view, "v");
        be be2 = ((by)this.a).n;
        if (be2 != null) {
            be2.getParentFragmentManager().z.z((be)object, view, bundle, true);
        }
        if ((object = ((CopyOnWriteArrayList)this.b).iterator()).hasNext()) {
            object = (a)object.next();
            if (bl2) {
                throw null;
            }
            throw null;
        }
    }
}

