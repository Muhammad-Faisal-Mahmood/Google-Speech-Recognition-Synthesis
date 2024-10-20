/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class hor
implements hnx {
    final Callable a;

    public hor(Callable callable) {
        this.a = callable;
    }

    @Override
    public final hpn a() {
        return hhk.K(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}

