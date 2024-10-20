/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class krq {
    public final ksj a;
    final Executor b;
    final Executor c;
    public final krs d;

    public krq(krs krs2, kps kps2, Executor executor) {
        this.d = krs2;
        this.a = new ksj(kps2);
        if (krs2.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = new krv(executor);
        this.c = executor;
    }

    public final void a(krt krt2) {
        try {
            Executor executor = this.b;
            krs krs2 = this.d;
            kot kot2 = new kot((Object)krs2, (Object)krt2, 13, null);
            executor.execute(kot2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.d.g(new kqp("Exception posting task to executor", rejectedExecutionException));
            return;
        }
    }

    public final void b() {
        kra kra2 = new kra(this, 9);
        this.d.c.execute(kra2);
    }

    final void c() {
        this.a(new kri(this, 4));
    }
}

