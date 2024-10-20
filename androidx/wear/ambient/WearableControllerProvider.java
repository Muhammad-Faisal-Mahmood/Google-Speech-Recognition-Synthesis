/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  com.google.android.wearable.compat.WearableActivityController
 *  com.google.android.wearable.compat.WearableActivityController$AmbientCallback
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.wear.ambient.WearableControllerProvider$1;
import com.google.android.wearable.compat.WearableActivityController;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.concurrent.Executor;

public final class WearableControllerProvider {
    public static volatile boolean a;

    public WearableControllerProvider() {
    }

    public WearableControllerProvider(byte[] byArray) {
        Collections.emptyList();
        Collections.emptyList();
    }

    public WearableControllerProvider(char[] cArray) {
    }

    public static final hpn a(Executor executor, jqz jqz2) {
        return kl.o(new bpt(executor, jqz2, 1));
    }

    public static /* synthetic */ String b(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return "null";
                    }
                    return "STOPPED";
                }
                return "CONFIGURED";
            }
            return "STARTED";
        }
        return "READY";
    }

    public static /* synthetic */ String c(int n2) {
        switch (n2) {
            default: {
                return "null";
            }
            case 15: {
                return "LANGUAGE_PACK_ERROR";
            }
            case 14: {
                return "INVALID_INTENT";
            }
            case 13: {
                return "ONLINE_NO_PROGRESS";
            }
            case 12: {
                return "SODA_INITIALIZATION_ERROR";
            }
            case 11: {
                return "SODA_ERROR";
            }
            case 10: {
                return "OFFLINE_RECOGNITION_UNAVAILABLE";
            }
            case 9: {
                return "CREATE_RECORDING_FAILED";
            }
            case 8: {
                return "NO_SPEECH_DETECTED";
            }
            case 7: {
                return "S3_ERROR";
            }
            case 6: {
                return "GRPC_ERROR";
            }
            case 5: {
                return "NETWORK_REQUEST_BUILDING";
            }
            case 4: {
                return "MICROPHONE_AUDIO_BUFFER_OVERFLOW";
            }
            case 3: {
                return "MICROPHONE_UNAVAILABLE";
            }
            case 2: {
                return "CANCELLED";
            }
            case 1: 
        }
        return "GENERIC";
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
        {
        }
    }

    public final WearableActivityController getWearableController(Activity object, AmbientDelegate$AmbientCallback object2) {
        block4: {
            SharedLibraryVersion.verifySharedLibraryPresent();
            object2 = new WearableControllerProvider$1((AmbientDelegate$AmbientCallback)object2);
            if (!a) {
                Method method = WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class);
                StringBuilder stringBuilder = new StringBuilder(".");
                stringBuilder.append(method.getName());
                boolean bl2 = ".onEnterAmbient".equals(stringBuilder.toString());
                if (!bl2) break block4;
                a = true;
            }
            return new WearableActivityController("WearableControllerProvider", object, (WearableActivityController.AmbientCallback)object2);
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

