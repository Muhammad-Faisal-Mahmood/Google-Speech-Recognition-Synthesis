/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 */
package org.chromium.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.BundleUtils;

public class ApkAssets {
    private static String a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long[] open(String object, String string) {
        Throwable throwable2;
        StringBuilder stringBuilder;
        block12: {
            Object object2 = null;
            StringBuilder stringBuilder2 = null;
            a = null;
            stringBuilder = stringBuilder2;
            StringBuilder stringBuilder3 = object2;
            try {
                try {
                    Context context;
                    Context context2 = context = jjj.c;
                    stringBuilder = stringBuilder2;
                    stringBuilder3 = object2;
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        context2 = context;
                        stringBuilder = stringBuilder2;
                        stringBuilder3 = object2;
                        if (BundleUtils.c(string)) {
                            stringBuilder = stringBuilder2;
                            stringBuilder3 = object2;
                            context2 = BundleUtils.a(context, string);
                        }
                    }
                    stringBuilder = stringBuilder2;
                    stringBuilder3 = object2;
                    context2 = context2.getAssets().openNonAssetFd((String)object);
                    stringBuilder = context2;
                    stringBuilder3 = context2;
                    object2 = new long[3];
                    stringBuilder = context2;
                    stringBuilder3 = context2;
                    object2[0] = (long)context2.getParcelFileDescriptor().detachFd();
                    stringBuilder = context2;
                    stringBuilder3 = context2;
                    object2[1] = context2.getStartOffset();
                    stringBuilder = context2;
                    stringBuilder3 = context2;
                    object2[2] = context2.getLength();
                    stringBuilder3 = context2;
                    object = object2;
                }
                catch (IOException iOException) {
                    stringBuilder = stringBuilder3;
                    stringBuilder = stringBuilder3;
                    object2 = new StringBuilder("Error while loading asset ");
                    stringBuilder = stringBuilder3;
                    ((StringBuilder)object2).append((String)object);
                    stringBuilder = stringBuilder3;
                    ((StringBuilder)object2).append(" from ");
                    stringBuilder = stringBuilder3;
                    ((StringBuilder)object2).append(string);
                    stringBuilder = stringBuilder3;
                    ((StringBuilder)object2).append(": ");
                    stringBuilder = stringBuilder3;
                    ((StringBuilder)object2).append(iOException);
                    stringBuilder = stringBuilder3;
                    a = ((StringBuilder)object2).toString();
                    stringBuilder = stringBuilder3;
                    if (!iOException.getMessage().equals("")) {
                        stringBuilder = stringBuilder3;
                        if (!iOException.getMessage().equals(object)) {
                            stringBuilder = stringBuilder3;
                            Log.e((String)"cr_ApkAssets", (String)a);
                        }
                    }
                    stringBuilder = stringBuilder3;
                    object = new long[3];
                    stringBuilder = stringBuilder3;
                    Object object3 = object;
                    object3[0] = -1L;
                    object3[1] = -1L;
                    object3[2] = -1L;
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            if (stringBuilder3 == null) return object;
            try {
                stringBuilder3.close();
                return object;
            }
            catch (IOException iOException) {
                Log.e((String)"cr_ApkAssets", (String)"Unable to close AssetFileDescriptor", (Throwable)iOException);
            }
            return object;
        }
        if (stringBuilder == null) throw throwable2;
        try {
            stringBuilder.close();
            throw throwable2;
        }
        catch (IOException iOException) {
            Log.e((String)"cr_ApkAssets", (String)"Unable to close AssetFileDescriptor", (Throwable)iOException);
        }
        throw throwable2;
    }

    private static String takeLastErrorString() {
        String string = a;
        a = null;
        return string;
    }
}

