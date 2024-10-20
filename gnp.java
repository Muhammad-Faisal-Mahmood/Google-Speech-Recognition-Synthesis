/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class gnp {
    public static final gnp a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            gnp gnp2;
            UUID uUID = UUID.randomUUID();
            SecureRandom secureRandom = new SecureRandom();
            a = gnp2 = new gnp(uUID, secureRandom.nextLong());
            return;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public gnp(UUID uUID, long l2) {
        this.b = uUID;
        this.c = new AtomicLong((l2 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
    }

    final long a() {
        long l2;
        long l3;
        long l4;
        AtomicLong atomicLong;
        while (!(atomicLong = this.c).compareAndSet(l4 = this.c.get(), l3 = 25214903917L * (l2 = l4 * 25214903917L + 11L & 0xFFFFFFFFFFFFL) + 11L & 0xFFFFFFFFFFFFL)) {
        }
        int n2 = (int)(l3 >>> 16);
        return ((long)((int)(l2 >>> 16)) << 32) + (long)n2;
    }

    public final UUID b() {
        long l2 = this.a();
        long l3 = this.a();
        return new UUID(l2 & 0xFFFFFFFFFFFF0FFFL ^ this.b.getMostSignificantBits(), l3 >>> 2 ^ this.b.getLeastSignificantBits());
    }
}

