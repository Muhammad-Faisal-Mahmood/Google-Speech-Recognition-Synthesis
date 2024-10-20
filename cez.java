/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class cez
implements cex {
    final cfc a;

    public cez(cfc cfc2) {
        this.a = cfc2;
    }

    @Override
    public final void a(cbk object) {
        if (((cbk)object).b()) {
            object = this.a;
            ((cfc)object).p(null, ((cfm)object).s);
            return;
        }
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = this.a.r;
        if (ambientModeSupport$AmbientController != null) {
            ambientModeSupport$AmbientController.b((cbk)object);
        }
    }
}

