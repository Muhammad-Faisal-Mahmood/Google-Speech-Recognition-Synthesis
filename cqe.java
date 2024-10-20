/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;

public final class cqe
extends Thread {
    public Runnable a;
    public Runnable b;
    public final cqp c;

    public cqe(int n2, Runnable object) {
        block2: {
            long l2;
            jse.e(object, "r");
            super((Runnable)object);
            this.c = object = new cqp(this, 0, false, 0, true, 26);
            if (!((cqp)object).c) break block2;
            while (true) {
                long l3;
                block5: {
                    block4: {
                        block3: {
                            l2 = ((cqp)object).f.get();
                            l3 = cqo.i(l2, false, false, false, n2, 0, 0L, 119);
                            if (!cqo.g(l2)) break block3;
                            if (!((cqp)object).f.compareAndSet(l2, l3)) continue;
                            break block4;
                        }
                        if (cqo.d(l2) == cqo.d(l3)) {
                            if (!((cqp)object).f.compareAndSet(l2, l3)) continue;
                        }
                        break block5;
                    }
                    return;
                }
                if (((cqp)object).f.compareAndSet(l2, cqo.i(l3, false, true, false, 0, 0, 0L, 125))) break;
            }
            ((cqp)object).a(cqo.d(l2));
            return;
        }
        throw new IllegalStateException("Cannot override priority of non-boostable thread");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        long l2;
        Object object = this.c;
        ((cqp)object).b = Process.myTid();
        while (!((cqp)object).f.compareAndSet(l2 = ((cqp)object).f.get(), cqo.i(l2, true, true, false, 0, 0, 0L, 124))) {
        }
        if (!cqo.g(l2)) {
            ((cqp)object).a(-21);
        }
        Object var4_4 = null;
        Object var5_5 = null;
        Runnable runnable = this.a;
        object = runnable;
        if (runnable == null) {
            jse.h("startedCallback");
            object = null;
        }
        object.run();
        super.run();
        object = this.b;
        if (object == null) {
            jse.h("finishedCallback");
            object = var5_5;
        }
        object.run();
        this.c.c();
        return;
        {
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            object = this.b;
            if (object == null) {
                jse.h("finishedCallback");
                object = var4_4;
            }
            object.run();
            object = throwable;
        }
        this.c.c();
        throw object;
    }
}

