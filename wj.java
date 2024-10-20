/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public final class wj {
    public static final int[] a = new int[]{2131427354, 2131427355, 2131427366, 2131427377, 2131427380, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427356, 2131427357, 2131427358, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427367, 2131427368, 2131427369, 2131427370, 2131427371, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427378, 2131427379};
    private static WeakHashMap b;
    private static Field c;
    private static boolean d = false;
    private static final vw e;

    static {
        e = new vw();
    }

    /*
     * Unable to fully structure code
     */
    public static View.AccessibilityDelegate a(View var0) {
        block4: {
            block6: {
                block5: {
                    if (Build.VERSION.SDK_INT >= 29) break block4;
                    var1_2 = wj.d;
                    var2_3 = null;
                    if (!var1_2) break block5;
                    var0 = var2_3;
                    break block6;
                }
                if (wj.c != null) ** GOTO lbl12
                wj.c = var3_4 = View.class.getDeclaredField("mAccessibilityDelegate");
                var3_4.setAccessible(true);
lbl12:
                // 2 sources

                var3_4 = wj.c.get(var0);
                var0 = var2_3;
                try {
                    if (var3_4 instanceof View.AccessibilityDelegate) {
                        var0 = (View.AccessibilityDelegate)var3_4;
                    }
                }
                catch (Throwable var0_1) {
                    wj.d = true;
                    var0 = var2_3;
                }
            }
            return var0;
        }
        return we.a(var0);
    }

    public static us b(View view) {
        if ((view = wj.a(view)) == null) {
            return null;
        }
        if (view instanceof ur) {
            return ((ur)view).a;
        }
        return new us((View.AccessibilityDelegate)view);
    }

    public static uz c(View view, uz uz2) {
        if (Log.isLoggable((String)"ViewCompat", (int)3)) {
            Objects.toString(uz2);
            view.getClass().getSimpleName();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return wg.a(view, uz2);
        }
        if ((wa)view.getTag(2131427921) != null) {
            if ((uz2 = wa.w(view, uz2)) == null) {
                return null;
            }
            return wa.w(view, uz2);
        }
        return wa.w(view, uz2);
    }

    public static xn d(View view, xn xn2) {
        WindowInsets windowInsets;
        WindowInsets windowInsets2 = xn2.e();
        if (windowInsets2 != null && !(windowInsets = vy.b(view, windowInsets2)).equals((Object)windowInsets2)) {
            return xn.n(windowInsets, view);
        }
        return xn2;
    }

    public static xn e(View view, xn xn2) {
        WindowInsets windowInsets;
        WindowInsets windowInsets2 = xn2.e();
        if (windowInsets2 != null && !(windowInsets = vy.c(view, windowInsets2)).equals((Object)windowInsets2)) {
            return xn.n(windowInsets, view);
        }
        return xn2;
    }

    public static CharSequence f(View view) {
        return (CharSequence)new vt(CharSequence.class).d(view);
    }

    public static List g(View view) {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList = (ArrayList)view.getTag(2131427916);
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            view.setTag(2131427916, arrayList2);
        }
        return arrayList2;
    }

    public static void h(View view, xu xu2) {
        wj.i(view);
        wj.u(xu2.a(), view);
        wj.g(view).add(xu2);
        wj.j(view, 0);
    }

    static void i(View view) {
        us us2;
        us us3 = us2 = wj.b(view);
        if (us2 == null) {
            us3 = new us();
        }
        wj.m(view, us3);
    }

    static void j(View view, int n2) {
        int n3;
        int n4;
        AccessibilityManager accessibilityManager;
        block13: {
            block12: {
                accessibilityManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
                if (!accessibilityManager.isEnabled()) break block12;
                CharSequence charSequence = wj.f(view);
                n3 = n4 = 0;
                if (charSequence != null) {
                    n3 = n4;
                    if (view.isShown()) {
                        n3 = n4;
                        if (view.getWindowVisibility() == 0) {
                            n3 = 1;
                        }
                    }
                }
                int n5 = view.getAccessibilityLiveRegion();
                n4 = 32;
                if (n5 != 0 || n3 != 0) break block13;
                if (n2 == 32) {
                    charSequence = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent((AccessibilityEvent)charSequence);
                    charSequence.setEventType(32);
                    charSequence.setContentChangeTypes(32);
                    charSequence.setSource(view);
                    view.onPopulateAccessibilityEvent((AccessibilityEvent)charSequence);
                    charSequence.getText().add(wj.f(view));
                    accessibilityManager.sendAccessibilityEvent((AccessibilityEvent)charSequence);
                    return;
                }
                if (view.getParent() != null) {
                    accessibilityManager = view.getParent();
                    try {
                        accessibilityManager.notifySubtreeAccessibilityStateChanged(view, view, n2);
                        return;
                    }
                    catch (AbstractMethodError abstractMethodError) {
                        Log.e((String)"ViewCompat", (String)String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), (Throwable)abstractMethodError);
                    }
                }
            }
            return;
        }
        if (1 != n3) {
            n4 = 2048;
        }
        accessibilityManager = AccessibilityEvent.obtain();
        accessibilityManager.setEventType(n4);
        accessibilityManager.setContentChangeTypes(n2);
        if (n3 != 0) {
            accessibilityManager.getText().add(wj.f(view));
            wj.v(view);
        }
        view.sendAccessibilityEventUnchecked((AccessibilityEvent)accessibilityManager);
    }

    public static void k(View view, int n2) {
        wj.u(n2, view);
        wj.j(view, 0);
    }

    public static void l(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n2, int n3) {
        if (Build.VERSION.SDK_INT >= 29) {
            we.b(view, context, nArray, attributeSet, typedArray, n2, n3);
        }
    }

    public static void m(View view, us us2) {
        us us3 = us2;
        if (us2 == null) {
            us3 = us2;
            if (wj.a(view) instanceof ur) {
                us3 = new us();
            }
        }
        wj.v(view);
        us2 = us3 == null ? null : us3.c;
        view.setAccessibilityDelegate((View.AccessibilityDelegate)us2);
    }

    public static void n(View view, CharSequence object) {
        new vt(CharSequence.class).e(view, object);
        if (object != null) {
            boolean bl2;
            object = e;
            WeakHashMap weakHashMap = ((vw)object).a;
            boolean bl3 = view.isShown();
            boolean bl4 = bl2 = false;
            if (bl3) {
                bl4 = bl2;
                if (view.getWindowVisibility() == 0) {
                    bl4 = true;
                }
            }
            weakHashMap.put(view, bl4);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
            if (view.isAttachedToWindow()) {
                ((vw)object).a(view);
            }
            return;
        }
        object = e;
        ((vw)object).a.remove(view);
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
    }

    public static void o(View view, CharSequence charSequence) {
        new vu(CharSequence.class).e(view, charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean p(View view, KeyEvent keyEvent) {
        int n2;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        wi wi2 = wi.c(view);
        if (keyEvent.getAction() == 0) {
            View view2 = wi2.b;
            if (view2 != null) {
                view2.clear();
            }
            if (!wi.a.isEmpty()) {
                ArrayList arrayList = wi.a;
                synchronized (arrayList) {
                    int n3;
                    if (wi2.b == null) {
                        wi2.b = view2 = new WeakHashMap();
                    }
                    n2 = wi.a.size();
                    block3: while ((n3 = n2 - 1) >= 0) {
                        view2 = (View)((WeakReference)wi.a.get(n3)).get();
                        if (view2 == null) {
                            wi.a.remove(n3);
                            n2 = n3;
                            continue;
                        }
                        wi2.b.put(view2, Boolean.TRUE);
                        view2 = view2.getParent();
                        while (true) {
                            n2 = n3;
                            if (!(view2 instanceof View)) continue block3;
                            wi2.b.put(view2, Boolean.TRUE);
                            view2 = view2.getParent();
                        }
                    }
                }
            }
        }
        view = wi2.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            n2 = keyEvent.getKeyCode();
            if (view != null && !KeyEvent.isModifierKey((int)n2)) {
                wi2.a().put(n2, new WeakReference<View>(view));
            }
        }
        return view != null;
    }

    public static boolean q(View object, KeyEvent keyEvent) {
        int n2 = Build.VERSION.SDK_INT;
        boolean bl2 = false;
        if (n2 >= 28) {
            return false;
        }
        object = wi.c((View)object);
        Object object2 = ((wi)object).c;
        if (object2 == null || ((Reference)object2).get() != keyEvent) {
            ((wi)object).c = new WeakReference<KeyEvent>(keyEvent);
            SparseArray sparseArray = ((wi)object).a();
            n2 = keyEvent.getAction();
            object = object2 = null;
            if (n2 == 1) {
                n2 = sparseArray.indexOfKey(keyEvent.getKeyCode());
                object = object2;
                if (n2 >= 0) {
                    object = (WeakReference)sparseArray.valueAt(n2);
                    sparseArray.removeAt(n2);
                }
            }
            object2 = object;
            if (object == null) {
                object2 = (WeakReference)sparseArray.get(keyEvent.getKeyCode());
            }
            if (object2 != null) {
                object = (View)((Reference)object2).get();
                if (object != null && object.isAttachedToWindow()) {
                    wi.d((View)object);
                    return true;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    public static String[] r(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return wg.b(view);
        }
        return (String[])view.getTag(2131427922);
    }

    public static void s(View view, xu xu2, yd yd2) {
        Class clazz = xu2.l;
        wj.h(view, new xu(null, xu2.k, null, yd2, clazz));
    }

    @Deprecated
    public static bzb t(View view) {
        bzb bzb2;
        if (b == null) {
            b = new WeakHashMap();
        }
        bzb bzb3 = bzb2 = (bzb)b.get(view);
        if (bzb2 == null) {
            bzb3 = new bzb(view);
            b.put(view, bzb3);
        }
        return bzb3;
    }

    private static void u(int n2, View object) {
        object = wj.g((View)object);
        for (int i2 = 0; i2 < object.size(); ++i2) {
            if (((xu)object.get(i2)).a() != n2) continue;
            object.remove(i2);
            return;
        }
    }

    private static void v(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}

