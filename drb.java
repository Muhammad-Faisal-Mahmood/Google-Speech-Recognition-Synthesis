/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.system.Os
 *  android.system.OsConstants
 */
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public final class drb {
    private static volatile gto a;
    private static volatile gto b;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static gto a() {
        Object object;
        block20: {
            long l2;
            block18: {
                int n2;
                int n3;
                long l3;
                block17: {
                    block16: {
                        block15: {
                            Throwable throwable422222;
                            StrictMode.ThreadPolicy threadPolicy;
                            block14: {
                                Object object2;
                                block22: {
                                    block21: {
                                        block19: {
                                            object = a;
                                            if (object != null) return object;
                                            l2 = Os.sysconf((int)OsConstants._SC_CLK_TCK);
                                            l3 = 0L;
                                            object = l2 > 0L ? gto.i(l2) : gsl.a;
                                            if (((gto)object).g()) break block19;
                                            object = gsl.a;
                                            break block20;
                                        }
                                        threadPolicy = StrictMode.allowThreadDiskReads();
                                        byte[] byArray = new byte[440];
                                        n3 = 0;
                                        File file = new File("/proc/self/stat");
                                        object2 = new FileInputStream(file);
                                        n2 = ((FileInputStream)object2).read(byArray);
                                        ((FileInputStream)object2).close();
                                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                                        object2 = gto.i(ByteBuffer.wrap(byArray, 0, n2));
                                        break block21;
                                        catch (Throwable throwable2) {
                                            try {
                                                ((FileInputStream)object2).close();
                                                throw throwable2;
                                            }
                                            catch (Throwable throwable3) {
                                                try {
                                                    throwable2.addSuppressed(throwable3);
                                                    throw throwable2;
                                                }
                                                catch (Throwable throwable422222) {
                                                    break block14;
                                                }
                                                catch (IOException iOException) {
                                                    object2 = gsl.a;
                                                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                                                }
                                            }
                                        }
                                    }
                                    if (((gto)object2).g()) break block22;
                                    object = gsl.a;
                                    break block20;
                                }
                                object2 = ((gto)object2).c();
                                l2 = (Long)((gto)object).c();
                                while (((Buffer)(object = (ByteBuffer)object2)).remaining() > 17) {
                                    if (((ByteBuffer)object).get() != 40) continue;
                                    break block15;
                                }
                                break block16;
                            }
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                            throw throwable422222;
                        }
                        for (n2 = 16; n2 >= 0; --n2) {
                            if (((ByteBuffer)object).get(((Buffer)object).position() + n2) != 41) continue;
                            ((ByteBuffer)object).position(((Buffer)object).position() + n2 + 1);
                            if (((ByteBuffer)object).get() != 32 || !drb.b((ByteBuffer)object, 1) || !drb.b((ByteBuffer)object, 18)) break;
                            n2 = n3;
                            break block17;
                        }
                    }
                    object = gsl.a;
                    break block18;
                }
                while (((Buffer)object).hasRemaining()) {
                    n3 = ((ByteBuffer)object).get();
                    if (n3 == 32) {
                        if (n2 == 0) break;
                        object = gto.i(l3);
                        break block18;
                    }
                    if (n3 < 48 || n3 > 57 || l3 > 0xCCCCCCCCCCCCCCCL) break;
                    l3 = l3 * 10L + (long)(n3 - 48);
                    n2 = 1;
                }
                object = gsl.a;
            }
            object = !((gto)object).g() ? gsl.a : gto.i(TimeUnit.SECONDS.toMillis((Long)((gto)object).c()) / l2);
        }
        a = object;
        return object;
    }

    private static boolean b(ByteBuffer byteBuffer, int n2) {
        block3: {
            while (byteBuffer.hasRemaining()) {
                if (n2 > 0) {
                    if (byteBuffer.get() != 32) continue;
                    --n2;
                    continue;
                }
                break block3;
            }
            if (n2 != 0) {
                return false;
            }
        }
        return true;
    }
}

