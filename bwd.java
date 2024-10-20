/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.backup.BackupManager
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
import android.app.backup.BackupManager;
import android.content.SharedPreferences;

public final class bwd
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final bwe a;

    public /* synthetic */ bwd(bwe bwe2) {
        this.a = bwe2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        BackupManager.dataChanged((String)this.a.a.getPackageName());
    }
}

