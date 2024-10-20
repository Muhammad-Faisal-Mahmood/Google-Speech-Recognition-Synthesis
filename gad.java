/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class gad
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public gad(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final hth a() {
        frr frr2 = (frr)this.a.b();
        Executor executor = ((fzw)this.b).a();
        cqm cqm2 = (cqm)this.c.b();
        return new hth(frr2, (Object)executor);
    }
}

