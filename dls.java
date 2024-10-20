/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$RunningAppProcessInfo
 */
import android.app.ActivityManager;

public final class dls
implements gtq {
    public final int a;

    public /* synthetic */ dls(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(Object object) {
        return ((ActivityManager.RunningAppProcessInfo)object).pid == this.a;
    }
}

