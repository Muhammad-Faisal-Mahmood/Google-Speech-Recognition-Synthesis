/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class gaj
implements Executor {
    public final Object a;
    public final Object b;
    private final int c;

    public gaj(hkb hkb2, Executor executor, int n2) {
        this.c = n2;
        this.b = executor;
        this.a = hkb2;
    }

    public gaj(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ gaj(Object object, Executor executor, int n2) {
        this.c = n2;
        this.a = object;
        this.b = executor;
    }

    @Override
    public final void execute(Runnable object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                try {
                                    this.a.execute((Runnable)object);
                                    return;
                                }
                                catch (RejectedExecutionException rejectedExecutionException) {
                                    ((krk)this.b).j(rejectedExecutionException);
                                    return;
                                }
                            }
                            object = new hsk(this.a, object, 8);
                            this.b.execute((Runnable)object);
                            return;
                        }
                        try {
                            this.b.execute((Runnable)object);
                            return;
                        }
                        catch (RejectedExecutionException rejectedExecutionException) {
                            ((hnk)this.a).n(rejectedExecutionException);
                            return;
                        }
                    }
                    try {
                        this.b.execute((Runnable)object);
                        return;
                    }
                    catch (RejectedExecutionException rejectedExecutionException) {
                        ((hnk)this.a).n(rejectedExecutionException);
                        return;
                    }
                }
                Object object2 = this.b;
                this.a.c((Runnable)object, (Executor)object2);
                return;
            }
            jse.e(object, "task");
            object = new cqg(object, 0);
            object = new ckr(this.a, object, 18, null);
            this.b.execute((Runnable)object);
            return;
        }
        object = new ffe(this.b, object, 12);
        ((hth)this.a).a.execute((Runnable)object);
    }
}

