/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class kmg {
    private static final kmf a = new kmf(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int n2 = Runtime.getRuntime().availableProcessors();
        b = n2 = Integer.highestOneBit(n2 + n2 - 1);
        AtomicReference[] atomicReferenceArray = new AtomicReference[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            atomicReferenceArray[i2] = new AtomicReference();
        }
        c = atomicReferenceArray;
    }

    public static final kmf a() {
        kmf kmf2;
        AtomicReference atomicReference = kmg.c();
        kmf kmf3 = atomicReference.getAndSet(kmf2 = a);
        if (kmf3 == kmf2) {
            return new kmf();
        }
        if (kmf3 == null) {
            atomicReference.set(null);
            return new kmf();
        }
        atomicReference.set(kmf3.f);
        kmf3.f = null;
        kmf3.c = 0;
        return kmf3;
    }

    public static final void b(kmf kmf2) {
        jse.e(kmf2, "segment");
        if (kmf2.f == null && kmf2.g == null) {
            kmf kmf3;
            AtomicReference atomicReference;
            kmf kmf4;
            if (!kmf2.d && (kmf4 = (atomicReference = kmg.c()).getAndSet(kmf3 = a)) != kmf3) {
                int n2 = kmf4 != null ? kmf4.c : 0;
                if (n2 >= 65536) {
                    atomicReference.set(kmf4);
                    return;
                }
                kmf2.f = kmf4;
                kmf2.b = 0;
                kmf2.c = n2 + 8192;
                atomicReference.set(kmf2);
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final AtomicReference c() {
        long l2 = Thread.currentThread().getId();
        long l3 = b;
        return c[(int)(l2 & l3 - 1L)];
    }
}

