/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;

public final class ggb
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;

    public ggb(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
    }

    public final cya a() {
        return new cya(((duw)this.a).a(), (AmbientModeSupport$AmbientController)this.b.b(), ima.c(this.c), ima.c(this.d), (Executor)this.e.b());
    }
}

