/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ksf
extends kpd {
    private final kpd a;

    public ksf(kpd kpd2) {
        super(kpd2.a());
        this.a = kpd2;
    }

    @Override
    public final Executor a() {
        return this.a.a();
    }

    @Override
    public final void b(int n2, long l2, int n3) {
        this.a.b(n2, l2, n3);
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof ksf) {
            return this.a.equals(((ksf)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

