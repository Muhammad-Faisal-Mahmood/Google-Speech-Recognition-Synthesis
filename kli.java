/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class kli
extends Thread {
    public kli() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        while (true) {
            block12: {
                block11: {
                    var4_5 = kll.b;
                    var4_5.lock();
                    var3_2 = kll.f;
                    jse.b(var3_2);
                    var3_2 = var3_2.h;
                    if (var3_2 != null) ** GOTO lbl19
                    var1_1 = System.nanoTime();
                    kll.c.await(kll.d, TimeUnit.MILLISECONDS);
                    var3_2 = kll.f;
                    jse.b(var3_2);
                    if (var3_2.h != null || System.nanoTime() - var1_1 < kll.e) break block11;
                    var3_2 = kll.f;
                    ** GOTO lbl34
lbl19:
                    // 1 sources

                    var1_1 = var3_2.c(System.nanoTime());
                    if (var1_1 <= 0L) break block12;
                    kll.c.await(var1_1, TimeUnit.NANOSECONDS);
                }
                var3_2 = null;
                ** GOTO lbl34
            }
            var5_6 = kll.f;
            jse.b(var5_6);
            var5_6.h = var3_2.h;
            var3_2.h = null;
            var3_2.g = 2;
lbl34:
            // 3 sources

            if (var3_2 != kll.f) ** GOTO lbl39
            kll.f = null;
            var4_5.unlock();
            return;
lbl39:
            // 1 sources

            var4_5.unlock();
            if (var3_2 == null) continue;
            var3_2.a();
            catch (Throwable var3_3) {
                try {
                    var4_5.unlock();
                    throw var3_3;
                }
                catch (InterruptedException var3_4) {
                }
            }
        }
    }
}

