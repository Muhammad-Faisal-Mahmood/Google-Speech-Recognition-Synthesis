/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ksh
extends kpm {
    private final kpm a;

    public ksh(kpm kpm2) {
        super(kpm2.b());
        this.a = kpm2;
    }

    @Override
    public final void a(kpo kpo2) {
        this.a.a(kpo2);
    }

    @Override
    public final Executor b() {
        return this.a.b();
    }
}

