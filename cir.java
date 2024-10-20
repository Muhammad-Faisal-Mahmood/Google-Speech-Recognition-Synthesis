/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

final class cir
extends cin {
    final bzo a;

    public cir(bzo bzo2) {
        this.a = bzo2;
    }

    @Override
    public final void c(Status status, ciw ciw2) {
        if (status.a()) {
            int n2 = ciw2.c;
            int n3 = 1;
            if (n2 != 1) {
                n3 = 2;
                if (n2 != 2) {
                    n3 = 3;
                    if (n2 != 3) {
                        n3 = 0;
                    }
                }
            }
            kl.aA(status, new DeviceContactsSyncSetting(n3), this.a);
            return;
        }
        kl.aA(status, null, this.a);
    }
}

