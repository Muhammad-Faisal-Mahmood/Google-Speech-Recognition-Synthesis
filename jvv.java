/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

final class jvv
extends jvw {
    private final Runnable a;

    public jvv(long l2, Runnable runnable) {
        super(l2);
        this.a = runnable;
    }

    @Override
    public final void run() {
        this.a.run();
    }

    @Override
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}

