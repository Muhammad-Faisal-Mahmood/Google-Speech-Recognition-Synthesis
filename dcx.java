/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public final class dcx {
    private volatile boolean a;

    public final void a() {
        if (!Thread.interrupted() && !this.a) {
            return;
        }
        throw new CancellationException();
    }

    public final void b() {
        this.a = true;
    }
}

