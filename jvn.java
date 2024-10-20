/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class jvn
implements Executor {
    public final juy a;

    public jvn(juy juy2) {
        this.a = juy2;
    }

    @Override
    public final void execute(Runnable runnable) {
        if (this.a.b(jqg.a)) {
            this.a.a(jqg.a, runnable);
            return;
        }
        runnable.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}

