/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 */
import android.content.pm.PackageManager;

public final class gde
implements imb {
    private final jnu a;

    public gde(jnu jnu2) {
        this.a = jnu2;
    }

    public final PackageManager a() {
        PackageManager packageManager = ((ilt)this.a).a().getPackageManager();
        idi.m(packageManager);
        return packageManager;
    }
}

