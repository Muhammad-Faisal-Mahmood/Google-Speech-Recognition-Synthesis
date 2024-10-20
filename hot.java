/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class hot
extends AtomicReference
implements Executor,
Runnable {
    hou a;
    Executor b;
    Runnable c;
    Thread d;

    public hot(Executor executor, hou hou2) {
        super(hos.a);
        this.b = executor;
        this.a = hou2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void execute(Runnable runnable) {
        if (this.get() == hos.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            Object object = Objects.requireNonNull(this.a).a;
            if (((bmt)object).a == this.d) {
                this.a = null;
                boolean bl2 = ((bmt)object).b == null;
                fxf.A(bl2);
                ((bmt)object).b = runnable;
                ((bmt)object).c = Objects.requireNonNull(this.b);
                this.b = null;
                return;
            }
            object = Objects.requireNonNull(this.b);
            this.b = null;
            this.c = runnable;
            object.execute(this);
            return;
        }
        finally {
            this.d = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = Thread.currentThread();
        if (object != this.d) {
            Runnable runnable = Objects.requireNonNull(this.c);
            this.c = null;
            runnable.run();
            return;
        }
        bmt bmt2 = new bmt();
        bmt2.a = object;
        Objects.requireNonNull(this.a).a = bmt2;
        this.a = null;
        try {
            Object object2;
            object = Objects.requireNonNull(this.c);
            this.c = null;
            object.run();
            while ((object = bmt2.b) != null && (object2 = bmt2.c) != null) {
                bmt2.b = null;
                bmt2.c = null;
                object2.execute((Runnable)object);
            }
            return;
        }
        finally {
            bmt2.a = null;
        }
    }
}

