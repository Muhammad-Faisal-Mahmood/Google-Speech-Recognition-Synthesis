/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutorService;

public final class dxy {
    public int a;
    public ExecutorService b;
    public gto c;
    public byte d;

    public dxy() {
        throw null;
    }

    public dxy(byte[] byArray) {
        this.c = gsl.a;
    }

    public final dxz a() {
        Object object;
        if (this.d == 1 && (object = this.b) != null) {
            return new dxz(this.a, (ExecutorService)object, this.c);
        }
        object = new StringBuilder();
        if (this.d == 0) {
            ((StringBuilder)object).append(" maxEventsInMemory");
        }
        if (this.b == null) {
            ((StringBuilder)object).append(" loggingExecutorService");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }
}

