/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;

public final class juh
extends jue {
    public final jvt b;
    private final Thread e;

    public juh(jqf jqf2, Thread thread, jvt jvt2) {
        super(jqf2, true);
        this.e = thread;
        this.b = jvt2;
    }

    @Override
    protected final void bG(Object object) {
        if (!jse.i(Thread.currentThread(), this.e)) {
            LockSupport.unpark(this.e);
        }
    }

    @Override
    protected final boolean h() {
        return true;
    }
}

