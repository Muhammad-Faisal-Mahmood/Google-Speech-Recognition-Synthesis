/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class hoi
extends hok {
    final hol a;
    private final hnx c;

    public hoi(hol hol2, hnx hnx2, Executor executor) {
        this.a = hol2;
        super(hol2, executor);
        this.c = hnx2;
    }

    @Override
    public final String b() {
        return this.c.toString();
    }
}

