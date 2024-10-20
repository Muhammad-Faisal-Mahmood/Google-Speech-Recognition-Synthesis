/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

final class gbw
implements Runnable {
    final List a = new ArrayList();
    Runnable b;

    @Override
    public final void run() {
        fpk.c();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}

