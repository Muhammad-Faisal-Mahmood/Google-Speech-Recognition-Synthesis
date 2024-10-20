/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class eny
implements imb {
    private final jnu a;
    private final jnu b;

    public eny(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final enx a() {
        return new enx(((ilt)this.a).a(), (Executor)this.b.b());
    }
}

