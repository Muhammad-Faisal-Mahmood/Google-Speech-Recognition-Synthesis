/*
 * Decompiled with CFR 0.152.
 */
public final class cqc
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public cqc(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final cpu a() {
        return new cpu((gto)((imc)this.a).a, ((bqw)this.b).a(), (hpr)this.c.b());
    }
}

