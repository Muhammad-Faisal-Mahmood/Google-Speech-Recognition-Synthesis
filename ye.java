/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Process
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  android.view.inputmethod.EditorInfo
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;

public class ye {
    public static void c(EditorInfo editorInfo, CharSequence charSequence, int n2, int n3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        charSequence = charSequence != null ? new SpannableStringBuilder(charSequence) : null;
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n3);
    }

    public static boolean d(CharSequence charSequence, int n2, int n3) {
        if (n3 != 0) {
            return Character.isHighSurrogate(charSequence.charAt(n2));
        }
        return Character.isLowSurrogate(charSequence.charAt(n2));
    }

    public static int e(Context context, String string) {
        a.r(string, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string)) {
            if (ag$$ExternalSyntheticApiModelOutline1.m(new sp((Context)context).d)) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(string, Process.myPid(), Process.myUid());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ColorStateList f(Context var0, int var1_2) {
        var6_3 /* !! */  = var0 /* !! */ .getResources();
        var5_4 = var0 /* !! */ .getTheme();
        var4_5 = new ta(var6_3 /* !! */ , var5_4);
        var0 /* !! */  = td.c;
        synchronized (var0 /* !! */ ) {
            var2_6 /* !! */  = (SparseArray)td.b.get(var4_5);
            var3_7 /* !! */  = null;
            if (var2_6 /* !! */  == null || var2_6 /* !! */ .size() <= 0 || (var7_8 = (dvy)var2_6 /* !! */ .get(var1_2)) == null) ** GOTO lbl15
            var8_9 = var7_8.b;
            var9_10 = var4_5.a.getConfiguration();
            if (((Configuration)var8_9).equals(var9_10) && ((var8_9 = var4_5.b) == null && var7_8.a == 0 || var8_9 != null && var7_8.a == var8_9.hashCode())) {
                var2_6 /* !! */  = var7_8.c;
            } else {
                var2_6 /* !! */ .remove(var1_2);
lbl15:
                // 2 sources

                // MONITOREXIT @DISABLED, blocks:[4, 10] lbl16 : MonitorExitStatement: MONITOREXIT : var0 /* !! */ 
                var2_6 /* !! */  = null;
            }
        }
        var0 /* !! */  = var2_6 /* !! */ ;
        if (var2_6 /* !! */  != null) return (ColorStateList)var0 /* !! */ ;
        var2_6 /* !! */  = (TypedValue)td.a.get();
        var0 /* !! */  = var2_6 /* !! */ ;
        if (var2_6 /* !! */  == null) {
            var0 /* !! */  = new TypedValue();
            td.a.set(var0 /* !! */ );
        }
        var6_3 /* !! */ .getValue(var1_2, (TypedValue)var0 /* !! */ , true);
        if (var0 /* !! */ .type >= 28 && var0 /* !! */ .type <= 31) {
            var0 /* !! */  = var3_7 /* !! */ ;
        } else {
            var0 /* !! */  = var6_3 /* !! */ .getXml(var1_2);
            try {
                var0 /* !! */  = sx.a(var6_3 /* !! */ , (XmlPullParser)var0 /* !! */ , var5_4);
            }
            catch (Exception var0_1) {
                Log.w((String)"ResourcesCompat", (String)"Failed to inflate ColorStateList, leaving it to the framework", (Throwable)var0_1);
                var0 /* !! */  = var3_7 /* !! */ ;
            }
        }
        if (var0 /* !! */  == null) {
            var0 /* !! */  = var6_3 /* !! */ .getColorStateList(var1_2, var5_4);
            return (ColorStateList)var0 /* !! */ ;
        }
        var6_3 /* !! */  = td.c;
        synchronized (var6_3 /* !! */ ) {
            var2_6 /* !! */  = var3_7 /* !! */  = (SparseArray)td.b.get(var4_5);
            if (var3_7 /* !! */  == null) {
                var2_6 /* !! */  = new SparseArray();
                td.b.put(var4_5, var2_6 /* !! */ );
            }
            var3_7 /* !! */  = new dvy((ColorStateList)var0 /* !! */ , var4_5.a.getConfiguration(), var5_4);
            var2_6 /* !! */ .append(var1_2, (Object)var3_7 /* !! */ );
            return (ColorStateList)var0 /* !! */ ;
        }
    }

    @Deprecated
    public static File[] g(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context = Build.VERSION.SDK_INT >= 33 ? ag$$ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, null, null, 2) : ag$$ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, null, null, 0);
        return context;
    }
}

