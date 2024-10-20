/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

public final class bo
implements awe {
    public final Object a;
    private final int b;

    public bo(dp dp2, int n2) {
        this.b = n2;
        this.a = dp2;
    }

    public /* synthetic */ bo(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Bundle a() {
        Object object;
        int n2;
        gsi gsi2;
        Bundle bundle;
        switch (this.b) {
            default: {
                bundle = new Bundle();
                gsi2 = (gsi)this.a;
                bundle.putString("appVersion", gsi2.j);
                n2 = gsi2.a.b();
                object = new int[n2];
                break;
            }
            case 7: {
                Bundle bundle2 = new Bundle();
                gby gby2 = (gby)this.a;
                Set set = gby2.c;
                bundle2.putParcelableArray("future_wrappers", (Parcelable[])set.toArray(new gca[set.size()]));
                bundle2.putInt("last_process_id", gby2.d);
                gby2.b.e(bundle2);
                return bundle2;
            }
            case 6: {
                Bundle bundle3 = new Bundle();
                Object object2 = (fzc)this.a;
                ((fzc)object2).a.e(bundle3);
                object2 = ((fzc)object2).b;
                if (object2 != null) {
                    bundle3.putInt("KSCH$AC$callbacks_id", ((fyt)object2).a);
                    bundle3.putInt("KSCH$AC$callbacks_state", ((fyt)object2).b);
                }
                return bundle3;
            }
            case 5: {
                Bundle bundle4 = new Bundle();
                fza fza2 = (fza)this.a;
                bundle4.putInt("state_account_id", fza2.a);
                fvc.as(bundle4, "state_account_info", fza2.b);
                bundle4.putInt("state_account_state", fza2.c);
                bundle4.putBoolean("tiktok_accounts_disabled", fza2.d);
                return bundle4;
            }
            case 4: {
                Bundle bundle5 = new Bundle();
                fyx fyx2 = (fyx)this.a;
                bundle5.putInt("state_account_id", fyx2.b);
                fvc.as(bundle5, "state_account_info", fyx2.c);
                bundle5.putInt("state_account_state", fyx2.d);
                bundle5.putBoolean("tiktok_accounts_disabled", fyx2.a);
                return bundle5;
            }
            case 3: {
                Bundle bundle6 = new Bundle();
                nq nq2 = ((mr)this.a).h;
                bundle6.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(nq2.b.values()));
                bundle6.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(nq2.b.keySet()));
                bundle6.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(nq2.d));
                bundle6.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(nq2.g));
                return bundle6;
            }
            case 2: {
                Bundle bundle7 = new Bundle();
                ((dp)this.a).bk();
                return bundle7;
            }
            case 1: {
                bh bh2 = (bh)this.a;
                bh2.c();
                aaz aaz2 = aaz.ON_STOP;
                bh2.a.d(aaz2);
                return new Bundle();
            }
            case 0: {
                return ((by)this.a).b();
            }
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            object[i2] = gsi2.a.a(i2);
        }
        bundle.putIntArray("callback_ids", (int[])object);
        object = gsi2.b;
        bundle.putParcelableArray("futures", (Parcelable[])object.toArray(new gsj[((ov)object).c]));
        return bundle;
    }
}

