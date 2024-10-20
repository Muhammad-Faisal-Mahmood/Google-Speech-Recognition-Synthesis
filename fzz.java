/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class fzz
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;

    public fzz(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public final fzy a() {
        Object object = ((imc)this.b).a;
        hth hth2 = ((gar)this.a).a();
        object = (gto)object;
        Executor executor = ((fzw)this.d).a();
        return new fzy(hth2, (gto)object, this.c, executor);
    }
}

