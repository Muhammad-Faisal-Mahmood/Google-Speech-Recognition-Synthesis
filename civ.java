/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient$SyncSettingUpdatedListener;

public final class civ
extends ccs
implements DeviceContactsSyncClient {
    private static final bxt a;
    private static final ki l;

    static {
        ciq ciq2 = new ciq();
        l = ciq2;
        a = new bxt((Object)"People.API", ciq2, null);
    }

    public civ(Activity activity) {
        super((Context)activity, activity, a, cco.a, ccr.a);
    }

    public civ(Context context) {
        super(context, a, cco.a, ccr.a);
    }

    @Override
    public final ckz getDeviceContactsSyncSetting() {
        cer cer2 = new cer();
        cer2.b = new cbm[]{cii.b};
        cer2.a = new cip(0);
        cer2.c = 2731;
        return this.d(cer2.a());
    }

    @Override
    public final ckz launchDeviceContactsSyncSettingActivity(Context context) {
        a.s(context, "Please provide a non-null context");
        cer cer2 = new cer();
        cer2.b = new cbm[]{cii.b};
        cer2.a = new cgn(context, 2);
        cer2.c = 2733;
        return this.d(cer2.a());
    }

    @Override
    public final ckz registerSyncSettingUpdatedListener(DeviceContactsSyncClient$SyncSettingUpdatedListener object) {
        cei cei2 = this.b(object, "dataChangedListenerKey");
        object = new cgn(cei2, 3);
        cip cip2 = new cip(1);
        cen cen2 = new cen();
        cen2.c = cei2;
        cen2.a = object;
        cen2.b = cip2;
        cen2.d = new cbm[]{cii.a};
        cen2.f = 2729;
        return this.h(cen2.a());
    }

    @Override
    public final ckz unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient$SyncSettingUpdatedListener object) {
        a.s(object, "Listener must not be null");
        kl.as("dataChangedListenerKey", "Listener type must not be empty");
        ceg ceg2 = new ceg(object, "dataChangedListenerKey");
        bzo bzo2 = new bzo(null);
        object = this.i;
        ((cea)object).i(bzo2, 2730, this);
        cdh cdh2 = new cdh(ceg2, bzo2);
        ceg2 = ((cea)object).m;
        ceg2.sendMessage(ceg2.obtainMessage(13, new dvy(cdh2, ((cea)object).i.get(), this)));
        return (ckz)bzo2.a;
    }
}

