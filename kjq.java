/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kjq
implements kmk {
    public final long a;
    public boolean b;
    public final klm c;
    public final klm d;
    public boolean e;
    final kjs f;

    public kjq(kjs kjs2, long l2, boolean bl2) {
        this.f = kjs2;
        this.a = l2;
        this.b = bl2;
        this.c = new klm();
        this.d = new klm();
    }

    @Override
    public final kmm a() {
        return this.f.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final long b(klm object, long l2) {
        kjs kjs2;
        block16: {
            long l3;
            Object object2;
            boolean bl2;
            do {
                block18: {
                    kjl kjl2;
                    block17: {
                        Object object3;
                        kjs2 = this.f;
                        // MONITORENTER : kjs2
                        kjs2.i.e();
                        object2 = kjs2.b();
                        Object var11_9 = null;
                        kjl2 = null;
                        if (object2 != null && !this.b) {
                            object3 = kjs2.k;
                            object2 = object3;
                            if (object3 == null) {
                                object3 = kjs2.b();
                                jse.b(object3);
                                object2 = new kjy((kiq)((Object)object3));
                            }
                        } else {
                            object2 = null;
                        }
                        if (this.e) break block16;
                        object3 = this.d;
                        l3 = ((klm)object3).b;
                        boolean bl3 = false;
                        bl2 = false;
                        if (l3 <= 0L) break block17;
                        long l4 = ((klm)object3).b((klm)object, Math.min(8192L, l3));
                        kjs2.c = l3 = kjs2.c + l4;
                        long l5 = l3 - kjs2.d;
                        if (object2 == null) {
                            kjl2 = kjs2.b;
                            object2 = var11_9;
                            l3 = l4;
                            bl2 = bl3;
                            if (l5 >= (long)(kjl2.q.c() / 2)) {
                                kjl2.l(kjs2.a, l5);
                                kjs2.d = kjs2.c;
                                object2 = var11_9;
                                l3 = l4;
                                bl2 = bl3;
                            }
                            break block18;
                        } else {
                            l3 = l4;
                            bl2 = bl3;
                        }
                        break block18;
                    }
                    if (!this.b && object2 == null) {
                        kjs2.k();
                        bl2 = true;
                        object2 = kjl2;
                    }
                    l3 = -1L;
                }
                kjs2.i.b();
            } while (bl2);
            if (l3 != -1L) {
                return l3;
            }
            if (object2 != null) throw object2;
            return -1L;
        }
        try {
            object = new IOException("stream closed");
            throw object;
        }
        catch (Throwable throwable) {
            kjs2.i.b();
            throw throwable;
        }
    }

    public final void c(long l2) {
        byte[] byArray = khb.a;
        this.f.b.g(l2);
    }

    @Override
    public final void close() {
        kjs kjs2 = this.f;
        synchronized (kjs2) {
            this.e = true;
            klm klm2 = this.d;
            long l2 = klm2.b;
            klm2.v();
            kjs2.notifyAll();
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl9 : MonitorExitStatement: MONITOREXIT : var3_1
            if (l2 > 0L) {
                this.c(l2);
            }
            this.f.e();
            return;
        }
    }
}

