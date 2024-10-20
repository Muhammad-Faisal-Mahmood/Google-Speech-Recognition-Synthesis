/*
 * Decompiled with CFR 0.152.
 */
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class hjk {
    public static final FileInputStream a(File file) {
        return new FileInputStream(file);
    }

    public static final byte[] b(File object, hhk object2) {
        long l2;
        block12: {
            block13: {
                int n2;
                int n3;
                object2 = new hji();
                FileInputStream fileInputStream = hjk.a((File)object);
                ((hji)object2).c(fileInputStream);
                l2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
                boolean bl2 = l2 >= 0L;
                fxf.u(bl2, "expectedSize (%s) must be non-negative", l2);
                if (l2 > 0x7FFFFFF7L) break block12;
                int n4 = (int)l2;
                object = new byte[n4];
                for (n2 = n4; n2 > 0; n2 -= n3) {
                    int n5 = n4 - n2;
                    n3 = ((InputStream)fileInputStream).read((byte[])object, n5, n2);
                    if (n3 != -1) continue;
                    object = Arrays.copyOf((byte[])object, n5);
                    break block13;
                }
                try {
                    n2 = ((InputStream)fileInputStream).read();
                    if (n2 == -1) break block13;
                }
                catch (Throwable throwable) {
                    try {
                        throw ((hji)object2).a(throwable);
                    }
                    catch (Throwable throwable2) {
                        ((hji)object2).close();
                        throw throwable2;
                    }
                }
                ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>(22);
                arrayDeque.add(object);
                arrayDeque.add(new byte[]{(byte)n2});
                object = hjg.c(fileInputStream, arrayDeque, n4 + 1);
            }
            ((hji)object2).close();
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(" bytes is too large to fit in a byte array");
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError(((StringBuilder)object).toString());
        throw outOfMemoryError;
    }
}

