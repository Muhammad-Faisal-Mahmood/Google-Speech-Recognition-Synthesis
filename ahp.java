/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ahp
implements agq {
    public gtq a;
    public ahl b;
    public String c;
    private final koc d;
    private final Executor e;
    private final awf f;

    public ahp(koc koc2, Executor executor) {
        abr.i(koc2);
        this.d = koc2;
        this.e = executor;
        this.f = new awf(null);
    }

    public final ahg b() {
        ahs ahs2 = new ahs(this.d, this.e, this.c, this.f, this.a);
        ahl ahl2 = this.b;
        if (ahl2 != null) {
            ahs2.f(ahl2);
        }
        return ahs2;
    }
}

