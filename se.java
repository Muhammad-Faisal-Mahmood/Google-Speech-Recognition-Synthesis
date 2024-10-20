/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

public final class se
extends ye {
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return;
        }
        new Handler(activity.getMainLooper()).post((Runnable)new kd(activity, 9, null));
    }

    public static void b(Activity object, String[] stringArray, int n2) {
        int n3;
        int n4;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n5 = 0;
        for (n4 = 0; n4 < (n3 = stringArray.length); ++n4) {
            if (!TextUtils.isEmpty((CharSequence)stringArray[n4])) {
                if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals((CharSequence)stringArray[n4], (CharSequence)"android.permission.POST_NOTIFICATIONS")) continue;
                hashSet.add(n4);
                continue;
            }
            object = new StringBuilder("Permission request for permissions ");
            ((StringBuilder)object).append(Arrays.toString(stringArray));
            ((StringBuilder)object).append(" must not contain null or empty values");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        n4 = hashSet.size();
        Object object2 = n4 > 0 ? new String[n3 - n4] : stringArray;
        if (n4 > 0) {
            if (n4 != n3) {
                n3 = 0;
                while (n5 < stringArray.length) {
                    n4 = n3;
                    if (!hashSet.contains(n5)) {
                        object2[n3] = stringArray[n5];
                        n4 = n3 + 1;
                    }
                    ++n5;
                    n3 = n4;
                }
            } else {
                return;
            }
        }
        if (object instanceof bh) {
            object2 = (bh)object;
        }
        object.requestPermissions(stringArray, n2);
    }
}

