/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcelable
 */
package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(azs azs2) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat)azs2.t(remoteActionCompat.a);
        remoteActionCompat.b = azs2.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = azs2.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent)azs2.b((Parcelable)remoteActionCompat.d, 4);
        remoteActionCompat.e = azs2.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = azs2.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, azs azs2) {
        azs2.u(remoteActionCompat.a);
        azs2.g(remoteActionCompat.b, 2);
        azs2.g(remoteActionCompat.c, 3);
        azs2.i((Parcelable)remoteActionCompat.d, 4);
        azs2.f(remoteActionCompat.e, 5);
        azs2.f(remoteActionCompat.f, 6);
    }
}

