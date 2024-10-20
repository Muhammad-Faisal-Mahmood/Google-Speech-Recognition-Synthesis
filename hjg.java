/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class hjg {
    public static final int a = 0;

    static {
        new hje();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        fxf.K(inputStream);
        fxf.K(outputStream);
        byte[] byArray = new byte[8192];
        long l2 = 0L;
        int n2;
        while ((n2 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static byte[] b(InputStream inputStream) {
        fxf.K(inputStream);
        return hjg.c(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] c(InputStream inputStream, Queue queue, int n2) {
        int n3 = Integer.highestOneBit(n2);
        int n4 = Math.min(8192, Math.max(128, n3 + n3));
        n3 = n2;
        n2 = n4;
        while (n3 < 0x7FFFFFF7) {
            int n5 = Math.min(n2, 0x7FFFFFF7 - n3);
            byte[] byArray = new byte[n5];
            queue.add(byArray);
            n4 = 0;
            while (n4 < n5) {
                int n6 = inputStream.read(byArray, n4, n5 - n4);
                if (n6 == -1) {
                    return hjg.e(queue, n3);
                }
                n4 += n6;
                n3 += n6;
            }
            n4 = n2 < 4096 ? 4 : 2;
            n2 = hhk.ag((long)n2 * (long)n4);
        }
        if (inputStream.read() == -1) {
            return hjg.e(queue, 0x7FFFFFF7);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int d(InputStream inputStream, byte[] byArray, int n2) {
        int n3;
        fxf.K(inputStream);
        int n4 = byArray.length;
        fxf.z(0, n2, n4);
        for (n3 = 0; n3 < n2 && (n4 = inputStream.read(byArray, n3, n2 - n3)) != -1; n3 += n4) {
        }
        return n3;
    }

    private static byte[] e(Queue queue, int n2) {
        int n3;
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] byArray = (byte[])queue.remove();
        int n4 = byArray.length;
        if (n4 == n2) {
            return byArray;
        }
        byArray = Arrays.copyOf(byArray, n2);
        for (n4 = n2 - n4; n4 > 0; n4 -= n3) {
            byte[] byArray2 = (byte[])queue.remove();
            n3 = Math.min(n4, byArray2.length);
            System.arraycopy(byArray2, 0, byArray, n2 - n4, n3);
        }
        return byArray;
    }
}

