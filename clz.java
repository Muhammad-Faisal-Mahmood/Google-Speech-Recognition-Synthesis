/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient$SyncSettingUpdatedListener;

public final class clz
implements ceh {
    private final int a;

    public clz(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ void a(Object object) {
        if (this.a != 0) {
            ((DeviceContactsSyncClient$SyncSettingUpdatedListener)object).onDeviceContactsSyncSettingUpdated();
            return;
        }
        ((clr)object).a();
    }
}

