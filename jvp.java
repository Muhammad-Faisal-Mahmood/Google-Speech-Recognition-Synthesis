/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;

final class jvp
implements jvq {
    private final Future a;

    public jvp(Future future) {
        this.a = future;
    }

    @Override
    public final void bu() {
        this.a.cancel(false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposableFutureHandle[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

