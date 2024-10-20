/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.wear.ambient;

import android.content.Context;
import androidx.wear.ambient.SharedLibraryVersion$PresenceHolder;
import androidx.wear.ambient.SharedLibraryVersion$VersionHolder;
import androidx.work.WorkerParameters;
import java.io.Closeable;
import java.io.IOException;

public final class SharedLibraryVersion {
    public SharedLibraryVersion() {
    }

    public SharedLibraryVersion(String string, WorkerParameters workerParameters) {
        jse.e(string, "workerClassName");
        jse.e(workerParameters, "workerParameters");
    }

    public static /* synthetic */ int a(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static final String b(String string) {
        if (string.startsWith("lib") && string.endsWith(".so")) {
            return string;
        }
        return System.mapLibraryName(string);
    }

    public static void c(Context context, String string) {
        new awf(null).q(context, string, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static awf e(bop bop2) {
        awf awf2 = new awf(null);
        awf2.b = bop2;
        return awf2;
    }

    public static void verifySharedLibraryPresent() {
        if (SharedLibraryVersion$PresenceHolder.a) {
            return;
        }
        throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
    }

    public static int version() {
        SharedLibraryVersion.verifySharedLibraryPresent();
        return SharedLibraryVersion$VersionHolder.a;
    }
}

