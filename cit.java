/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.api.Status;

final class cit
extends cin {
    final bzo a;

    public cit(bzo bzo2) {
        this.a = bzo2;
    }

    @Override
    public final void e(Status status) {
        bzo bzo2 = this.a;
        if (status.a()) {
            bzo2.e(true);
            return;
        }
        bzo2.d(kl.ax(status));
    }
}

