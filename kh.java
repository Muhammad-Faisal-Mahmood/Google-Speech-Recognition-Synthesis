/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.provider.Settings$Secure
 *  android.text.StaticLayout$Builder
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;

public class kh {
    public kh() {
    }

    public kh(byte[] byArray) {
    }

    public static void c(View view, ng ng2) {
        jse.e(view, "<this>");
        view.setTag(2131428010, (Object)ng2);
    }

    public static void d(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            inputConnection = view.getParent();
            while (inputConnection instanceof View) {
                if (inputConnection instanceof mj) {
                    editorInfo.hintText = ((mj)inputConnection).a();
                    return;
                }
                inputConnection = inputConnection.getParent();
            }
        }
    }

    public static int e(Context context) {
        context = context.getResources().getConfiguration();
        int n2 = context.screenWidthDp;
        int n3 = context.screenHeightDp;
        if (context.smallestScreenWidthDp <= 600 && n2 <= 600) {
            if (n2 < 500 && (n2 <= 480 || n3 <= 640)) {
                if (n2 >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }

    public static void f(Context context) {
        context.getResources().getBoolean(2131034112);
    }

    public static Drawable g(Context context, int n2) {
        return lj.e().c(context, n2);
    }

    public static tw h(Configuration configuration) {
        return tw.c(ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(configuration)));
    }

    public static void i(Configuration configuration, tw tw2) {
        ag$$ExternalSyntheticApiModelOutline1.m(configuration, ag$$ExternalSyntheticApiModelOutline1.m(tw2.e()));
    }

    public static PackageInfo j(Context context) {
        try {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new IllegalStateException(nameNotFoundException);
        }
    }

    public static void k(iiw iiw2, bzx bzx2, List list, List list2) {
        list.add(iiw2);
        list2.add(bzx2);
    }

    public static int l(List list) {
        return list.size();
    }

    public static axg m(Context context) {
        axg axg2 = new axg(context);
        axf axf2 = axg2.a;
        float f2 = axg2.b.getDisplayMetrics().density;
        axf2.d(2.5f * f2);
        axf2.n = 7.5f * f2;
        axf2.g();
        axf2.o = (int)(f2 * 10.0f);
        axg2.invalidateSelf();
        int n2 = context.getResources().getColor(2131101830);
        axg2.a.c(new int[]{n2});
        axg2.a.g();
        axg2.invalidateSelf();
        axg2.start();
        return axg2;
    }

    public static String n(int n2) {
        return a.af(n2, "v");
    }

    public static String o(Context context, ezj ezj2) {
        if (kh.r(context)) {
            long l2 = ezj2.e / 1000000L;
            return String.format(Locale.US, "%d MB [v%d]", l2, ezj2.b);
        }
        return String.format(Locale.US, "%d MB", ezj2.e / 1000000L);
    }

    public static void p(Context context, ImageView imageView) {
        imageView.setMinimumWidth(kh.v(context));
        imageView.setMinimumHeight(kh.v(context));
    }

    public static void q(dm dm2, DialogInterface.OnClickListener onClickListener, String string, String string2, String string3, String string4) {
        dm2.g(string);
        dm2.d(string2);
        dm2.f(string3, onClickListener);
        dm2.e(string4, onClickListener);
    }

    public static boolean r(Context context) {
        return Settings.Secure.getInt((ContentResolver)context.getContentResolver(), (String)"development_settings_enabled", (int)0) != 0;
    }

    public static String s(Resources resources, String string) {
        if (!brt.b()) {
            return resources.getString(2132017499);
        }
        throw new IllegalStateException("Did not find example string for ".concat(String.valueOf(string)));
    }

    public static String t(Resources object, String stringArray) {
        block4: {
            Object var5_2 = null;
            if (stringArray == null) {
                return null;
            }
            String[] stringArray2 = stringArray;
            if (stringArray.equals("cmn")) {
                stringArray2 = "zh";
            }
            stringArray = object.getStringArray(2130903053);
            int n2 = stringArray.length;
            int n3 = 0;
            while (true) {
                object = var5_2;
                if (n3 >= n2) break block4;
                object = stringArray[n3].split(":");
                if (((String[])object).length != 2) break;
                String string = object[0];
                object = object[1];
                if (!(string.equalsIgnoreCase((String)stringArray2) || stringArray2.length() == 3 && brz.b(new Locale(string)).equalsIgnoreCase((String)stringArray2))) {
                    ++n3;
                    continue;
                }
                break block4;
                break;
            }
            throw new IllegalStateException("Invalid example text configuration");
        }
        return object;
    }

    public static bxt u(List object, List list) {
        hwr hwr2 = (hwr)ikd.a.l();
        hyg hyg2 = (hwr)iix.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hws hws2 = (iix)((hwr)hyg2).b;
        Object object2 = ((iix)hws2).c;
        if (!object2.c()) {
            ((iix)hws2).c = hwv.s((hxk)object2);
        }
        hvc.g((Iterable)object, ((iix)hws2).c);
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object = (iix)((hwr)hyg2).b;
        ((iix)object).b |= 2;
        ((iix)object).e = false;
        hws2 = (iix)((hwp)hyg2).o();
        object = (hwr)iiu.a.l();
        object2 = iit.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        hyg2 = (iit)((hwp)object2).b;
        hws2.getClass();
        ((iit)hyg2).c = hws2;
        ((iit)hyg2).b = 2;
        hyg2 = (iit)((hwp)object2).o();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hws2 = (iiu)((hwr)object).b;
        hyg2.getClass();
        ((iiu)hws2).G();
        ((iiu)hws2).c.add(hyg2);
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        hyg2 = (ikd)hwr2.b;
        object = (iiu)((hwp)object).o();
        object.getClass();
        ((ikd)hyg2).c = object;
        ((ikd)hyg2).b |= 1;
        return new bxt(hwr2, list.toArray(new bzx[list.size()]));
    }

    private static int v(Context context) {
        return (int)TypedValue.applyDimension((int)1, (float)25.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
    }

    public void a(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean b(TextView textView) {
        return (Boolean)ik.d(textView, "getHorizontallyScrolling", false);
    }

    public void onChanged() {
    }

    public void onItemRangeChanged(int n2, int n3) {
    }

    public void onItemRangeChanged(int n2, int n3, Object object) {
        this.onItemRangeChanged(n2, n3);
    }

    public void onItemRangeInserted(int n2, int n3) {
    }

    public void onItemRangeMoved(int n2, int n3, int n4) {
    }

    public void onItemRangeRemoved(int n2, int n3) {
    }

    public void onStateRestorationPolicyChanged() {
    }
}

