/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class kha
implements ThreadFactory {
    public final String a;
    public final boolean b;

    public /* synthetic */ kha(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = new Thread(runnable, this.a);
        ((Thread)runnable).setDaemon(this.b);
        return runnable;
    }
}

