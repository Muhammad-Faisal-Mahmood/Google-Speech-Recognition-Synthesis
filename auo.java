/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.TreeMap;

public final class auo
implements awr,
awq {
    public static final TreeMap a = new TreeMap();
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    private final int f;
    private volatile String g;
    private final int[] h;
    private int i;

    public auo(int n2) {
        this.f = n2++;
        this.h = new int[n2];
        this.b = new long[n2];
        this.c = new double[n2];
        this.d = new String[n2];
        this.e = new byte[n2][];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final auo a(String object, int n2) {
        Object object2;
        void var1_1;
        TreeMap treeMap = a;
        synchronized (treeMap) {
            object2 = treeMap.ceilingEntry((int)var1_1);
            if (object2 != null) {
                treeMap.remove(object2.getKey());
                object2 = (auo)object2.getValue();
                ((auo)object2).i((String)object, (int)var1_1);
                jse.d(object2, "sqliteQuery");
                return object2;
            }
        }
        object2 = new auo((int)var1_1);
        ((auo)object2).i((String)object, (int)var1_1);
        return object2;
    }

    @Override
    public final String b() {
        String string = this.g;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override
    public final void c(int n2, byte[] byArray) {
        throw null;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void d(int n2, double d2) {
        throw null;
    }

    @Override
    public final void e(int n2, long l2) {
        this.h[n2] = 2;
        this.b[n2] = l2;
    }

    @Override
    public final void f(int n2) {
        throw null;
    }

    @Override
    public final void g(int n2, String string) {
        jse.e(string, "value");
        this.h[n2] = 4;
        this.d[n2] = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void h(awq awq2) {
        int n2 = this.i;
        if (n2 <= 0) return;
        int n3 = 1;
        while (true) {
            int n4;
            if ((n4 = this.h[n3]) != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        Object object;
                        if (n4 != 4) {
                            if (n4 == 5) {
                                object = this.e[n3];
                                if (object == null) throw new IllegalArgumentException("Required value was null.");
                                awq2.c(n3, (byte[])object);
                            }
                        } else {
                            object = this.d[n3];
                            if (object == null) throw new IllegalArgumentException("Required value was null.");
                            awq2.g(n3, (String)object);
                        }
                    } else {
                        awq2.d(n3, this.c[n3]);
                    }
                } else {
                    awq2.e(n3, this.b[n3]);
                }
            } else {
                awq2.f(n3);
            }
            if (n3 == n2) return;
            ++n3;
        }
    }

    public final void i(String string, int n2) {
        this.g = string;
        this.i = n2;
    }

    public final void j() {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            block5: {
                treeMap.put(this.f, this);
                if (treeMap.size() <= 15) break block5;
                Iterator iterator = treeMap.descendingKeySet().iterator();
                jse.d(iterator, "queryPool.descendingKeySet().iterator()");
                for (int i2 = treeMap.size() - 10; i2 > 0; --i2) {
                    iterator.next();
                    iterator.remove();
                    continue;
                }
            }
            return;
        }
    }
}

