/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadLocalRandom
extends Random {
    private static final ThreadLocal d;
    private static final AtomicInteger e;
    private static final ThreadLocal f;
    private static final AtomicLong g;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = -5851777807851030925L;
    long a;
    int b;
    boolean c = true;

    static {
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
        d = new ThreadLocal();
        e = new AtomicInteger();
        f = new ThreadLocal();
        g = new AtomicLong(ThreadLocalRandom.e(System.currentTimeMillis()) ^ ThreadLocalRandom.e(System.nanoTime()));
        if (((Boolean)AccessController.doPrivileged(new Object())).booleanValue()) {
            byte[] byArray = SecureRandom.getSeed(8);
            long l2 = (long)byArray[0] & 0xFFL;
            for (int i2 = 1; i2 < 8; ++i2) {
                l2 = l2 << 8 | (long)byArray[i2] & 0xFFL;
            }
            g.set(l2);
        }
    }

    private ThreadLocalRandom() {
    }

    /* synthetic */ ThreadLocalRandom(int n2) {
        this();
    }

    static final int a(int n2) {
        n2 ^= n2 << 13;
        n2 ^= n2 >>> 17;
        n2 ^= n2 << 5;
        ((ThreadLocalRandom)ThreadLocalRandom.f.get()).b = n2;
        return n2;
    }

    static final int b() {
        return ((ThreadLocalRandom)ThreadLocalRandom.f.get()).b;
    }

    static final void c() {
        int n2;
        int n3 = n2 = e.addAndGet(-1640531527);
        if (n2 == 0) {
            n3 = 1;
        }
        long l2 = ThreadLocalRandom.e(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom)f.get();
        threadLocalRandom.a = l2;
        threadLocalRandom.b = n3;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom)f.get();
        if (threadLocalRandom.b == 0) {
            ThreadLocalRandom.c();
        }
        return threadLocalRandom;
    }

    private static int d(long l2) {
        l2 = (l2 ^ l2 >>> 33) * -49064778989728563L;
        return (int)((l2 ^ l2 >>> 33) * -4265267296055464877L >>> 32);
    }

    private static long e(long l2) {
        l2 = (l2 ^ l2 >>> 33) * -49064778989728563L;
        l2 = (l2 ^ l2 >>> 33) * -4265267296055464877L;
        return l2 ^ l2 >>> 33;
    }

    private Object readResolve() {
        return ThreadLocalRandom.current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putField = objectOutputStream.putFields();
        putField.put("rnd", this.a);
        putField.put("initialized", true);
        objectOutputStream.writeFields();
    }

    final long f() {
        long l2;
        this.a = l2 = this.a - 7046029254386353131L;
        return l2;
    }

    @Override
    protected final int next(int n2) {
        return this.nextInt() >>> 32 - n2;
    }

    @Override
    public final boolean nextBoolean() {
        boolean bl2 = ThreadLocalRandom.d(this.f()) < 0;
        return bl2;
    }

    @Override
    public final double nextDouble() {
        return (double)(ThreadLocalRandom.e(this.f()) >>> 11) * (double)1.110223E-16f;
    }

    @Override
    public final double nextDouble(double d2) {
        if (d2 > 0.0) {
            double d3 = (double)(ThreadLocalRandom.e(this.f()) >>> 11) * (double)1.110223E-16f * d2;
            d2 = d3 < d2 ? d3 : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1L);
            return d2;
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override
    public final double nextDouble(double d2, double d3) {
        double d4 = d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
        if (d4 < 0) {
            double d5;
            double d6 = d5 = (double)(this.nextLong() >>> 11) * (double)1.110223E-16f;
            if (d4 < 0) {
                d6 = d2 = (d3 - d2) * d5 + d2;
                if (d2 >= d3) {
                    d6 = Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1L);
                }
            }
            return d6;
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public final float nextFloat() {
        return (float)(ThreadLocalRandom.d(this.f()) >>> 8) * 5.9604645E-8f;
    }

    @Override
    public final double nextGaussian() {
        double d2;
        double d3;
        double d4;
        ThreadLocal threadLocal = d;
        Double d5 = (Double)threadLocal.get();
        if (d5 != null) {
            threadLocal.set(null);
            return d5;
        }
        do {
            d2 = this.nextDouble() * 2.0 - 1.0;
        } while ((d4 = (d3 = this.nextDouble() * 2.0 - 1.0) * d3 + d2 * d2) >= 1.0 || d4 == 0.0);
        d4 = StrictMath.sqrt(StrictMath.log(d4) * -2.0 / d4);
        threadLocal.set(d3 * d4);
        return d2 * d4;
    }

    @Override
    public final int nextInt() {
        return ThreadLocalRandom.d(this.f());
    }

    @Override
    public final int nextInt(int n2) {
        if (n2 > 0) {
            int n3 = ThreadLocalRandom.d(this.f());
            int n4 = n2 - 1;
            int n5 = n3;
            if ((n2 & n4) == 0) {
                n2 = n3 & n4;
            } else {
                while ((n3 = n5 >>> 1) + n4 - (n5 = n3 % n2) < 0) {
                    n5 = ThreadLocalRandom.d(this.f());
                }
                n2 = n5;
            }
            return n2;
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int nextInt(int n2, int n3) {
        int n4;
        if (n2 >= n3) throw new IllegalArgumentException("bound must be greater than origin");
        int n5 = n4 = ThreadLocalRandom.d(this.f());
        if (n2 >= n3) return n5;
        int n6 = n3 - n2;
        int n7 = n6 - 1;
        if ((n6 & n7) == 0) {
            n3 = n4 & n7;
            return n3 + n2;
        }
        int n8 = n4;
        if (n6 > 0) {
            n8 = n4 >>> 1;
            while (true) {
                n3 = n5 = n8 % n6;
                if (n8 + n7 - n5 >= 0) return n3 + n2;
                n8 = ThreadLocalRandom.d(this.f()) >>> 1;
            }
        }
        while (true) {
            if (n8 >= n2) {
                n5 = n8;
                if (n8 < n3) return n5;
            }
            n8 = ThreadLocalRandom.d(this.f());
        }
    }

    @Override
    public final long nextLong() {
        return ThreadLocalRandom.e(this.f());
    }

    @Override
    public final long nextLong(long l2) {
        if (l2 > 0L) {
            long l3 = ThreadLocalRandom.e(this.f());
            long l4 = l2 - 1L;
            if ((l2 & l4) == 0L) {
                l2 = l3 & l4;
            } else {
                long l5;
                while ((l5 = l3 >>> 1) + l4 - (l3 = l5 % l2) < 0L) {
                    l3 = ThreadLocalRandom.e(this.f());
                }
                l2 = l3;
            }
            return l2;
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override
    public long nextLong(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            long l5;
            long l6 = l5 = ThreadLocalRandom.e(this.f());
            if (l4 < 0) {
                l6 = l3 - l2;
                long l7 = l6 - 1L;
                if ((l6 & l7) == 0L) {
                    l6 = (l5 & l7) + l2;
                } else {
                    long l8 = l5;
                    if (l6 > 0L) {
                        l3 = l5 >>> 1;
                        while (l3 + l7 - (l8 = l3 % l6) < 0L) {
                            l3 = ThreadLocalRandom.e(this.f()) >>> 1;
                        }
                        l6 = l8 + l2;
                    } else {
                        while (true) {
                            if (l8 >= l2) {
                                l6 = l8;
                                if (l8 < l3) break;
                            }
                            l8 = ThreadLocalRandom.e(this.f());
                        }
                    }
                }
            }
            return l6;
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public final void setSeed(long l2) {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException();
    }
}

