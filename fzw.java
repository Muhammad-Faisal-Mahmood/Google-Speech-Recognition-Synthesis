/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class fzw
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public fzw(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final Executor a() {
        Object object = (gto)((imc)this.c).a;
        object = ((gto)object).g() && (Boolean)((gto)object).c() != false ? (Executor)this.b.b() : (Executor)this.a.b();
        idi.m(object);
        return object;
    }
}

