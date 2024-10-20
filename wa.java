/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.Spanned
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.widget.TextView
 */
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.TextView;
import java.util.Objects;

public final class wa {
    public wa() {
    }

    public wa(Context context) {
        context.getApplicationContext();
    }

    public static final bzb A(View view) {
        bzb bzb2;
        bzb bzb3 = bzb2 = (bzb)view.getTag(2131427808);
        if (bzb2 == null) {
            bzb3 = new bzb(null, null, null);
            view.setTag(2131427808, (Object)bzb3);
        }
        return bzb3;
    }

    public static float a(View view) {
        return view.getElevation();
    }

    public static float b(View view) {
        return view.getZ();
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static xn e(View view, xn xn2, Rect rect) {
        WindowInsets windowInsets = xn2.e();
        if (windowInsets != null) {
            return xn.n(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return xn2;
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    static void g(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)view.getTag(2131427928);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f2) {
        view.setElevation(f2);
    }

    public static void k(View view, vk vk2) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131427920, (Object)vk2);
        }
        if (vk2 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)view.getTag(2131427928));
            return;
        }
        view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)new vz(view, vk2));
    }

    public static void l(View view, String string) {
        view.setTransitionName(string);
    }

    static void m(View view) {
        view.stopNestedScroll();
    }

    public static boolean n(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void o(ViewParent viewParent, View view, int n2, int n3, int[] nArray, int n4) {
        if (viewParent instanceof vi) {
            ((vi)viewParent).d(view, n2, n3, nArray, n4);
            return;
        }
        if (n4 == 0) {
            try {
                viewParent.onNestedPreScroll(view, n2, n3, nArray);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), (Throwable)abstractMethodError);
            }
        }
    }

    public static void p(ViewParent viewParent, View view, int n2, int n3, int n4, int n5, int n6, int[] nArray) {
        if (viewParent instanceof vj) {
            ((vj)viewParent).f(view, n2, n3, n4, n5, n6, nArray);
            return;
        }
        nArray[0] = nArray[0] + n4;
        nArray[1] = nArray[1] + n5;
        if (viewParent instanceof vi) {
            ((vi)viewParent).e(view, n2, n3, n4, n5, n6);
            return;
        }
        if (n6 == 0) {
            try {
                viewParent.onNestedScroll(view, n2, n3, n4, n5);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), (Throwable)abstractMethodError);
            }
        }
    }

    public static void q(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof vi) {
            ((vi)viewParent).g(view, view2, n2, n3);
            return;
        }
        if (n3 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, n2);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), (Throwable)abstractMethodError);
            }
        }
    }

    public static void r(ViewParent viewParent, View view, int n2) {
        if (viewParent instanceof vi) {
            ((vi)viewParent).h(view, n2);
            return;
        }
        if (n2 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), (Throwable)abstractMethodError);
            }
        }
    }

    public static boolean s(ViewParent viewParent, View view, float f2, float f3, boolean bl2) {
        try {
            bl2 = viewParent.onNestedFling(view, f2, f3, bl2);
            return bl2;
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static boolean t(ViewParent viewParent, View view, float f2, float f3) {
        try {
            boolean bl2 = viewParent.onNestedPreFling(view, f2, f3);
            return bl2;
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static boolean u(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof vi) {
            return ((vi)viewParent).t(view, view2, n2, n3);
        }
        if (n3 == 0) {
            try {
                boolean bl2 = viewParent.onStartNestedScroll(view, view2, n2);
                return bl2;
            }
            catch (AbstractMethodError abstractMethodError) {
                Log.e((String)"ViewParentCompat", (String)a.ak(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), (Throwable)abstractMethodError);
            }
        }
        return false;
    }

    public static final void v(View object) {
        jse.e(object, "<this>");
        object = new wn(new jqr((View)object, null), 3).a();
        while (object.hasNext()) {
            wa.A((View)object.next()).T();
        }
    }

    public static final uz w(View object, uz object2) {
        if (Log.isLoggable((String)"ReceiveContent", (int)3)) {
            Objects.toString(object2);
        }
        if (((uz)object2).a.b() != 2) {
            object2 = ((uz)object2).a;
            ClipData clipData = object2.c();
            int n2 = object2.a();
            Editable editable = ((hk)((Object)object)).getText();
            Context context = ((TextView)object).getContext();
            int n3 = 0;
            for (int i2 = 0; i2 < clipData.getItemCount(); ++i2) {
                object = clipData.getItemAt(i2);
                if ((n2 & 1) != 0) {
                    object2 = object.coerceToText(context);
                    object = object2;
                    if (object2 instanceof Spanned) {
                        object = object2.toString();
                    }
                } else {
                    object = object.coerceToStyledText(context);
                }
                int n4 = n3;
                if (object != null) {
                    if (n3 == 0) {
                        int n5 = Selection.getSelectionStart((CharSequence)editable);
                        n4 = Selection.getSelectionEnd((CharSequence)editable);
                        n3 = Math.max(0, Math.min(n5, n4));
                        n4 = Math.max(0, Math.max(n5, n4));
                        Selection.setSelection((Spannable)editable, (int)n4);
                        editable.replace(n3, n4, (CharSequence)object);
                    } else {
                        editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                        editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)object);
                    }
                    n4 = 1;
                }
                n3 = n4;
            }
            return null;
        }
        return object2;
    }

    public static final boolean x(int n2, ads ads2) {
        return ads2.a.get(n2);
    }

    public static final akc y(int n2, SparseArray object) {
        object = (akc)object.get(n2);
        abr.i(object);
        return object;
    }

    public static final int z(ads ads2) {
        return ads2.b();
    }
}

