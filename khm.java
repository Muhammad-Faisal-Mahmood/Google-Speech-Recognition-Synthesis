/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public final class khm
implements Runnable {
    public volatile AtomicInteger a;
    final khp b;
    private final kla c;

    public khm(khp khp2, kla kla2) {
        this.b = khp2;
        this.c = kla2;
        this.a = new AtomicInteger(0);
    }

    public final String a() {
        return this.b.b.a.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(ExecutorService executorService) {
        jse.e(executorService, "executorService");
        Object object = khb.a;
        try {
            try {
                executorService.execute(this);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                object = new InterruptedIOException;
                ((InterruptedIOException)object)("executor rejected");
                ((Throwable)object).initCause(rejectedExecutionException);
                this.b.a((IOException)object);
                this.c.c((IOException)object);
                this.b.a.c.c(this);
                return;
            }
        }
        catch (Throwable throwable) {}
        this.b.a.c.c(this);
        throw throwable;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable422;
        khp khp2;
        String string;
        Thread thread;
        block19: {
            Object object;
            block20: {
                boolean bl2;
                block18: {
                    block17: {
                        object = this.b.b();
                        thread = Thread.currentThread();
                        string = thread.getName();
                        thread.setName("OkHttp ".concat((String)object));
                        khp2 = this.b;
                        khp2.e.e();
                        bl2 = false;
                        boolean bl3 = false;
                        object = khp2.d();
                        this.c.d((kgv)object);
                        object = khp2.a.c;
                        break block20;
                        catch (Throwable throwable2) {
                            bl2 = true;
                            break block17;
                        }
                        catch (IOException iOException) {
                            bl2 = true;
                            break block18;
                        }
                        catch (Throwable throwable3) {
                            bl2 = bl3;
                        }
                    }
                    try {
                        void var4_5;
                        khp2.g();
                        if (bl2) throw var4_5;
                        StringBuilder stringBuilder = new StringBuilder("canceled due to ");
                        stringBuilder.append(var4_5);
                        IOException iOException = new IOException(stringBuilder.toString());
                        jns.b(iOException, (Throwable)var4_5);
                        this.c.c(iOException);
                        throw var4_5;
                    }
                    catch (Throwable throwable422) {
                        break block19;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                if (bl2) {
                    kkf kkf2 = kkf.b;
                    boolean bl4 = khp2.l;
                    String string2 = "canceled ";
                    if (!bl4) {
                        string2 = "";
                    }
                    String string3 = khp2.b();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("call to ");
                    stringBuilder.append(string3);
                    kkf2.l(a.ai(stringBuilder.toString(), "Callback failure for "), 4, (Throwable)object);
                } else {
                    this.c.c((IOException)object);
                }
                object = khp2.a.c;
            }
            ((kge)object).c(this);
            return;
        }
        try {
            khp2.a.c.c(this);
            throw throwable422;
        }
        finally {
            thread.setName(string);
        }
    }
}

