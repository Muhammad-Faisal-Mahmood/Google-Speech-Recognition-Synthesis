/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class ghq
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public ghq(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final AmbientModeSupport$AmbientController a() {
        gto gto2 = ((dse)this.a).a();
        gib gib2 = (gib)this.b.b();
        ((ghp)this.c).a();
        return new AmbientModeSupport$AmbientController(gto2);
    }
}

