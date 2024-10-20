/*
 * Decompiled with CFR 0.152.
 */
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

final class izn {
    private static final int a;
    private static final Queue b;

    static {
        int n2;
        a = n2 = Math.max(16384, 8192);
        b = new LinkedBlockingQueue(131072 / n2);
    }

    static void a(byte[] byArray) {
        if (byArray.length == a) {
            b.offer(byArray);
        }
    }

    static byte[] b() {
        return izn.c(a);
    }

    static byte[] c(int n2) {
        byte[] byArray;
        if (n2 == a && (byArray = (byte[])b.poll()) != null) {
            return byArray;
        }
        return new byte[n2];
    }
}

