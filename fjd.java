/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class fjd
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public fjd(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final fjc a() {
        return new fjc(((fcg)this.a).a(), ((fak)this.b).a(), (Executor)this.c.b());
    }
}

