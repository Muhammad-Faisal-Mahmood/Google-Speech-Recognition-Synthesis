/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowManager
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class bnv {
    public static final SparseArray a = new SparseArray();
    private static int[] b;

    public static float a(Resources resources, int n2) {
        return TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)resources.getDisplayMetrics());
    }

    public static float b(Resources resources, int n2) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(n2, typedValue, true);
        return typedValue.getFloat();
    }

    public static int c(Context context, int n2, int n3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n2;
        }
        return n3;
    }

    public static int d(Context context, int n2) {
        context = context.obtainStyledAttributes(0, new int[]{n2});
        n2 = context.getResourceId(0, 0);
        context.recycle();
        return n2;
    }

    public static Activity e(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }

    public static Context f(Context context) {
        while (!(context instanceof Activity) && context instanceof ContextWrapper) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static DisplayMetrics g(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            if (Build.VERSION.SDK_INT >= 30 && sk$$ExternalSyntheticApiModelOutline1.m(context) != null) {
                sk$$ExternalSyntheticApiModelOutline1.m(context).getRealMetrics(displayMetrics);
                return displayMetrics;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {}
        ((WindowManager)context.getSystemService(WindowManager.class)).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static View h(View view, int n2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return view.findViewById(n2);
        }
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(n2, typedValue, true);
        return view.findViewById(typedValue.resourceId);
    }

    public static View i(View object, int n2) {
        Object object2 = bnv.h((View)object, n2);
        if (object2 != null) {
            return object2;
        }
        object2 = object.getResources().getResourceName(n2);
        object = new StringBuilder("ID ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" does not reference a View inside this View");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static String j(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static String k(String string) {
        Method method;
        Class<?> clazz;
        try {
            clazz = Class.forName("android.os.SystemProperties");
        }
        catch (ClassNotFoundException classNotFoundException) {
            Log.w((String)"CarUiUtils", (String)"Cannot find android.os.SystemProperties: ", (Throwable)classNotFoundException);
            return null;
        }
        try {
            method = clazz.getMethod("get", String.class);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.w((String)"CarUiUtils", (String)"Cannot find SystemProperties.get(): ", (Throwable)noSuchMethodException);
            return null;
        }
        try {
            string = (String)method.invoke(clazz, string);
            boolean bl2 = TextUtils.isEmpty((CharSequence)string);
            if (bl2) {
                return null;
            }
            return string;
        }
        catch (Exception exception) {
            Log.w((String)"CarUiUtils", (String)"Failed to invoke SystemProperties.get(): ", (Throwable)exception);
            return null;
        }
    }

    public static List l(List object, Function function) {
        if (object == null) {
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(ag$$ExternalSyntheticApiModelOutline1.m(function, object.next()));
        }
        return arrayList;
    }

    public static void m(View view, int[] nArray, int[] nArray2) {
        if (view instanceof boj) {
            ((boj)view).a(nArray, nArray2);
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                bnv.m(view.getChildAt(i2), nArray, nArray2);
            }
        }
    }

    public static void n(View view, boolean bl2, boolean bl3) {
        Object object;
        if (view == null) {
            return;
        }
        bnv.r(view);
        int[] nArray = null;
        if (bl2) {
            if (bl3) {
                int[] nArray2 = b;
                int n2 = nArray2.length;
                object = new int[n2 + 1];
                object[0] = 16842910;
                System.arraycopy(nArray2, 0, object, 1, n2);
            } else {
                object = new int[]{16842910};
            }
        } else {
            object = bl3 ? b : null;
        }
        if (!bl2) {
            nArray = new int[]{16842910};
        }
        bnv.m(view, object, nArray);
    }

    public static void o(View view, boolean bl2) {
        if (view == null) {
            return;
        }
        bnv.r(view);
        Object object = bl2 ? b : null;
        bnv.m(view, object, null);
    }

    public static boolean p(Activity activity, int n2) {
        activity = activity.getTheme().obtainStyledAttributes(new int[]{n2});
        try {
            boolean bl2 = activity.getBoolean(0, false);
            return bl2;
        }
        finally {
            activity.recycle();
        }
    }

    public static byte[] q(Bitmap bitmap) {
        byte[] byArray;
        byte[] byArray2 = byArray = null;
        if (bitmap != null) {
            try {
                Parcel parcel = Parcel.obtain();
                bitmap.writeToParcel(parcel, 0);
                byArray2 = parcel.marshall();
                parcel.recycle();
            }
            catch (RuntimeException runtimeException) {
                Log.e((String)"CarUiUtils", (String)"failed to write bitmap", (Throwable)runtimeException);
                byArray2 = byArray;
            }
        }
        return byArray2;
    }

    private static void r(View view) {
        if (b != null) {
            return;
        }
        int n2 = view.getResources().getIdentifier("state_ux_restricted", "attr", "android");
        if (n2 == 0) {
            b = new int[]{2130969900};
            return;
        }
        b = new int[]{2130969900, n2};
    }
}

