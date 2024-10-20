/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class ill
implements ilw {
    private volatile Object a;
    private final Object b = new Object();
    private final AmbientModeSupport$AmbientController c;

    public ill(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        this.c = ambientModeSupport$AmbientController;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a;
        Object object = this.b;
        synchronized (object) {
            if (this.a != null) return this.a;
            Object object2 = this.c;
            Object object3 = bra.a;
            object3 = new dlm(((AmbientModeSupport$AmbientController)object2).a, null);
            this.a = object2 = new brg((dlm)object3);
            return this.a;
        }
    }
}

