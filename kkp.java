/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class kkp {
    public static final byte[] a = new byte[]{42};
    public static final List b = jns.d("*");
    public static final kkp c = new kkp();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String object) {
        List list = jse.V((CharSequence)object, new char[]{'.'});
        object = list;
        if (jse.i(jns.m(list), "")) {
            jse.e(list, "<this>");
            object = jns.r(list, jse.k(list.size() - 1, 0));
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b() {
        var1_1 = false;
        while (true) {
            block21: {
                var5_11 = new jsj();
                var2_3 = new jsj();
                var3_8 = kkp.class.getResourceAsStream("publicsuffixes.gz");
                if (var3_8 != null) ** GOTO lbl12
                var2_3 = this.e;
                break block21;
lbl12:
                // 2 sources

                var4_9 = new klt(klw.c((InputStream)var3_8));
                var3_8 = new kme(var4_9);
                var5_11.a = var3_8.A(var3_8.f());
                var2_3.a = var3_8.A(var3_8.f());
                jsd.f((Closeable)var3_8, null);
                // MONITORENTER : this
                var3_8 = var5_11.a;
                jse.b(var3_8);
                this.f = (byte[])var3_8;
                var2_3 = var2_3.a;
                jse.b(var2_3);
                this.g = (byte[])var2_3;
                // MONITOREXIT : this
                var2_3 = this.e;
            }
            var2_3.countDown();
            ** GOTO lbl48
            catch (Throwable var2_4) {
                try {
                    throw var2_4;
                }
                catch (Throwable var4_10) {
                    try {
                        jsd.f((Closeable)var3_8, var2_4);
                        throw var4_10;
                    }
                    catch (Throwable var2_5) {
                        this.e.countDown();
                        throw var2_5;
                        {
                            catch (Throwable var2_6) {
                                break;
                            }
                            catch (IOException var2_7) {
                                kkf.b.l("Failed to read public suffix list", 5, var2_7);
                            }
lbl48:
                            // 2 sources

                            if (var1_1 == false) return;
                            Thread.currentThread().interrupt();
                            return;
                            catch (InterruptedIOException var2_2) {}
                            {
                                Thread.interrupted();
                                var1_1 = true;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
        if (var1_1 == false) throw var2_6;
        Thread.currentThread().interrupt();
        throw var2_6;
    }
}

