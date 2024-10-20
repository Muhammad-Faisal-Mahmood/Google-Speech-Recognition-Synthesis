/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ksg
extends kpe {
    private final kpe a;

    public ksg(kpe kpe2) {
        super(kpe2.a());
        this.a = kpe2;
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
        if (object != null && object instanceof ksg) {
            return this.a.equals(((ksg)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

