/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;

public final class kca
extends Thread {
    public final jua a;
    public boolean b;
    final kcb c;
    public int d;
    public final cya e;
    private final jsj f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public kca(kcb kcb2, int n2) {
        int n3;
        this.c = kcb2;
        this.setDaemon(true);
        this.setContextClassLoader(kcb2.getClass().getClassLoader());
        this.e = new cya(null);
        this.f = new jsj();
        this.d = 4;
        this.a = new jua(0, jud.a);
        this.nextParkedWorker = kcb.a;
        int n4 = n3 = (int)System.nanoTime();
        if (n3 == 0) {
            n4 = 42;
        }
        this.i = n4;
        this.c(n2);
    }

    private final kcf e() {
        if (this.a(2) == 0) {
            kcf kcf2 = (kcf)this.c.i.y();
            if (kcf2 != null) {
                return kcf2;
            }
            return (kcf)this.c.j.y();
        }
        kcf kcf3 = (kcf)this.c.j.y();
        if (kcf3 != null) {
            return kcf3;
        }
        return (kcf)this.c.i.y();
    }

    private final kcf f(int n2) {
        int n3 = (int)(this.c.h.b & 0x1FFFFFL);
        if (n3 < 2) {
            return null;
        }
        int n4 = this.a(n3);
        kcb kcb2 = this.c;
        long l2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5;
            n4 = n5 = n4 + 1;
            if (n5 > n3) {
                n4 = 1;
            }
            Object object = (kca)kcb2.g.a(n4);
            long l3 = l2;
            if (object != null) {
                l3 = l2;
                if (object != this) {
                    long l4;
                    Object object2;
                    block16: {
                        cya cya2;
                        block15: {
                            cya2 = ((kca)object).e;
                            jsj jsj2 = this.f;
                            if (n2 == 3) {
                                object = cya2.g();
                            } else {
                                boolean bl2;
                                int n6 = ((jua)cya2.e).b;
                                for (n5 = ((jua)cya2.c).b; !(n5 == n6 || (bl2 = n2 == 1) && ((jua)cya2.a).b == 0); ++n5) {
                                    object = object2 = cya2.h(n5, bl2);
                                    if (object2 == null) {
                                        continue;
                                    }
                                    break block15;
                                }
                                object = null;
                            }
                        }
                        if (object != null) {
                            jsj2.a = object;
                            l4 = -1L;
                        } else {
                            do {
                                object = (kcf)((juc)cya2.d).a;
                                l4 = -2L;
                                if (object == null || ((n5 = true != ((kcf)object).h ? 2 : 1) & n2) == 0) break block16;
                                object2 = kch.a;
                                l4 = System.nanoTime() - ((kcf)object).g;
                                if (l4 >= (l3 = kch.b)) continue;
                                l4 = l3 - l4;
                                break block16;
                            } while (!((juc)cya2.d).d(object, null));
                            jsj2.a = object;
                            l4 = -1L;
                        }
                    }
                    if (l4 == -1L) {
                        object = this.f;
                        object2 = (kcf)((jsj)object).a;
                        ((jsj)object).a = null;
                        return object2;
                    }
                    l3 = l2;
                    if (l4 > 0L) {
                        l3 = Math.min(l2, l4);
                    }
                }
            }
            l2 = l3;
        }
        if (l2 == Long.MAX_VALUE) {
            l2 = 0L;
        }
        this.h = l2;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != kcb.a;
    }

    public final int a(int n2) {
        int n3 = this.i;
        n3 ^= n3 << 13;
        n3 ^= n3 >> 17;
        n3 ^= n3 << 5;
        this.i = n3;
        int n4 = n2 - 1;
        if ((n4 & n2) == 0) {
            return n3 & n4;
        }
        return (n3 & Integer.MAX_VALUE) % n2;
    }

    public final kcf b(boolean bl2) {
        block17: {
            Object object;
            block15: {
                block16: {
                    Object object2;
                    int n2 = this.d;
                    object = null;
                    int n3 = 1;
                    if (n2 != 1) {
                        long l2;
                        object2 = this.c;
                        do {
                            block14: {
                                if ((int)((0x7FFFFC0000000000L & (l2 = ((kcb)object2).h.b)) >> 42) != 0) continue;
                                cya cya2 = this.e;
                                while ((object2 = (kcf)((juc)cya2.d).a) != null && ((kcf)object2).h) {
                                    if (!((juc)cya2.d).d(object2, null)) continue;
                                    break block14;
                                }
                                n2 = ((jua)cya2.c).b;
                                n3 = ((jua)cya2.e).b;
                                do {
                                    object2 = object;
                                    if (n2 == n3) break;
                                    if (((jua)cya2.a).b != 0) continue;
                                    object2 = object;
                                    break;
                                } while ((object2 = cya2.h(--n3, true)) == null);
                            }
                            object = object2;
                            if (object2 == null) {
                                object = object2 = (kcf)this.c.j.y();
                                if (object2 == null) {
                                    object = this.f(1);
                                }
                            }
                            break block15;
                        } while (!((kcb)object2).h.c(l2, -4398046511104L + l2));
                        this.d = 1;
                    }
                    if (!bl2) break block16;
                    n2 = this.c.b;
                    if (this.a(n2 + n2) != 0) {
                        n3 = 0;
                    }
                    if (n3 != 0 && (object = this.e()) != null) break block15;
                    object2 = this.e;
                    object = (kcf)((juc)((cya)object2).d).a(null);
                    if (object == null) {
                        object = ((cya)object2).g();
                    }
                    if (object == null && (n3 != 0 || (object = this.e()) == null)) break block17;
                    break block15;
                }
                object = this.e();
                if (object == null) break block17;
            }
            return object;
        }
        return this.f(3);
    }

    public final void c(int n2) {
        String string = n2 == 0 ? "TERMINATED" : String.valueOf(n2);
        kcb kcb2 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(kcb2.e);
        stringBuilder.append("-worker-");
        stringBuilder.append(string);
        this.setName(stringBuilder.toString());
        this.indexInArray = n2;
    }

    public final boolean d(int n2) {
        int n3 = this.d;
        boolean bl2 = true;
        if (n3 != 1) {
            bl2 = false;
        }
        if (bl2) {
            this.c.h.a(0x40000000000L);
        }
        if (n3 != n2) {
            this.d = n2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        boolean bl2 = false;
        block5: while (true) {
            boolean bl3 = bl2;
            boolean bl4 = bl2;
            while (true) {
                block22: {
                    int n2;
                    long l2;
                    Object object;
                    Object object2;
                    block23: {
                        block20: {
                            block21: {
                                if (this.c.d() || this.d == 5) break block20;
                                object2 = this.b(this.b);
                                if (object2 != null) {
                                    this.h = 0L;
                                    this.g = 0L;
                                    if (this.d == 3) {
                                        bl2 = jve.a;
                                        this.d = 2;
                                    }
                                    if (((kcf)object2).h) {
                                        if (this.d(2)) {
                                            this.c.c();
                                        }
                                        kcb.f((kcf)object2);
                                        this.c.h.a(-2097152L);
                                        bl2 = bl4;
                                        if (this.d == 5) continue block5;
                                        bl2 = jve.a;
                                        this.d = 4;
                                        bl2 = bl4;
                                        continue block5;
                                    }
                                    kcb.f((kcf)object2);
                                    bl2 = bl4;
                                    continue block5;
                                }
                                this.b = bl4;
                                if (this.h != 0L) {
                                    if (!bl3) {
                                        bl3 = true;
                                        continue;
                                    }
                                    this.d(3);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.h);
                                    this.h = 0L;
                                    bl2 = bl4;
                                    continue block5;
                                }
                                if (this.g()) break block21;
                                object2 = this.c;
                                if (this.nextParkedWorker != kcb.a) continue;
                                object = ((kcb)object2).f;
                                do {
                                    l2 = ((jub)object).b;
                                    n2 = this.indexInArray;
                                    bl4 = jve.a;
                                    this.nextParkedWorker = ((kcb)object2).g.a((int)(l2 & 0x1FFFFFL));
                                } while (!((kcb)object2).f.c(l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n2));
                                break block22;
                            }
                            this.a.b = -1;
                            break block23;
                        }
                        this.d(5);
                        return;
                    }
                    while (this.g() && this.a.b == -1 && !this.c.d() && this.d != 5) {
                        this.d(3);
                        Thread.interrupted();
                        if (this.g == 0L) {
                            object2 = this.c;
                            this.g = System.nanoTime() + ((kcb)object2).d;
                        }
                        LockSupport.parkNanos(this.c.d);
                        if (System.nanoTime() - this.g < 0L) continue;
                        this.g = 0L;
                        object = this.c;
                        object2 = ((kcb)object).g;
                        synchronized (object2) {
                            bl4 = ((kcb)object).d();
                            if (bl4) {
                                continue;
                            }
                            l2 = ((kcb)object).h.b;
                            n2 = ((kcb)object).b;
                            if ((int)(l2 & 0x1FFFFFL) <= n2) {
                                continue;
                            }
                            bl4 = this.a.b(-1, 1);
                            if (!bl4) {
                                continue;
                            }
                            n2 = this.indexInArray;
                            this.c(0);
                            ((kcb)object).b(this, n2, 0);
                            Object object3 = ((kcb)object).h;
                            int n3 = (int)(jub.a.getAndDecrement(object3) & 0x1FFFFFL);
                            if (n3 != n2) {
                                object3 = ((kcb)object).g.a(n3);
                                jse.b(object3);
                                object3 = (kca)object3;
                                ((kcb)object).g.b(n2, object3);
                                ((kca)object3).c(n2);
                                ((kcb)object).b((kca)object3, n3, n2);
                            }
                            ((kcb)object).g.b(n3, null);
                        }
                        this.d = 5;
                    }
                }
                bl4 = false;
            }
            break;
        }
    }
}

