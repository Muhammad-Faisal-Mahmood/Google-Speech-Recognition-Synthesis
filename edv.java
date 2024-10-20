/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class edv
implements ewq,
edx,
eem {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer");
    int a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final Lock d;
    private final Condition e;
    private final byte[] f;
    private final String g;
    private int h;
    private boolean i;
    private final AtomicInteger j;
    private final List k;
    private final czh l;

    public edv(int n2, List object, czh czh2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        this.e = reentrantLock.newCondition();
        this.h = 0;
        this.a = 0;
        this.j = new AtomicInteger(0);
        this.f = new byte[n2];
        this.k = object;
        this.l = czh2;
        this.g = object = crh.K(this);
        czh2.n((String)object);
    }

    private final int h() {
        return this.f.length * this.a + this.h - 1;
    }

    @Override
    public final /* synthetic */ int a(byte[] byArray, int n2, int n3, int n4) {
        return dpg.m(this, byArray, n2, n3, n4);
    }

    @Override
    public final int b() {
        return this.j.get();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int c(byte[] var1_1, int var2_4, int var3_5, int var4_6, int var5_7) {
        block12: {
            block11: {
                this.d.lock();
                var9_8 = -1;
                var8_9 = -1;
                do {
                    var7_11 = var8_9;
                    try {
                        this.e(var2_4);
                        var7_11 = var8_9;
                        var8_9 = this.h();
                        if (var8_9 < -1) {
                            var7_11 = var8_9;
                            if (this.c.compareAndSet(false, true)) {
                                var7_11 = var8_9;
                                var2_4 = this.h() + 1;
                                var7_11 = var8_9;
                                var1_1 /* !! */  = (byte[])this.l;
                                var7_11 = var8_9;
                                var10_12 = this.g;
                                var7_11 = var8_9;
                                jse.e(var10_12, "identity");
                                var7_11 = var8_9;
                                var1_1 /* !! */ .a.c((String)var10_12, var2_4);
                                var7_11 = var8_9;
                                var12_14 = dox.n(ecf.a.l());
                                var7_11 = var8_9;
                                var11_16 = doc.c(ebw.a.l());
                                var7_11 = var8_9;
                                var11_16.m(ecd.d);
                                var7_11 = var8_9;
                                var11_16.k((String)var10_12);
                                var7_11 = var8_9;
                                var11_16.l(var2_4);
                                var7_11 = var8_9;
                                var12_14.w(var11_16.j());
                                var7_11 = var8_9;
                                var10_12 = var12_14.v();
                                var7_11 = var8_9;
                                ((evo)var1_1 /* !! */ .d).e((ecf)var10_12);
                                var7_11 = var8_9;
                                ((enc)var1_1 /* !! */ .b).c();
                            }
                            var7_11 = var8_9;
                            var1_1 /* !! */  = (byte[])new elw;
                            var7_11 = var8_9;
                            var1_1 /* !! */ ("Total audio bytes captured exceeded max limit. Buffer: ".concat(String.valueOf(this.g)));
                            var7_11 = var8_9;
                            throw var1_1 /* !! */ ;
                        }
                    }
                    catch (InterruptedException var1_2) {
                        ** GOTO lbl-1000
                    }
                    if (var2_4 >= var5_7) {
                        var2_4 = var9_8;
                        break block11;
                    }
                    var6_10 = var8_9;
                    if (var2_4 > var8_9) {
                        var7_11 = var8_9;
                        if (this.i) {
                            var2_4 = var9_8;
                            break block11;
                        }
                        var7_11 = var8_9;
                        this.e.await();
                        var7_11 = var8_9;
                        this.e(var2_4);
                        var7_11 = var8_9;
                        var6_10 = this.h();
                    }
                    var8_9 = var6_10;
                } while (var2_4 > var6_10);
                var7_11 = var6_10;
                var4_6 = Math.min(Math.min(var4_6, var6_10 - var2_4 + 1), var1_1 /* !! */ .length - var3_5);
                var7_11 = var6_10;
                var10_13 = this.f;
                var7_11 = var6_10;
                var5_7 = ((Object)var10_13).length;
                if ((var5_7 -= (var2_4 %= var5_7)) < var4_6) ** GOTO lbl81
                var7_11 = var6_10;
                ** GOTO lbl-1000
                catch (Throwable var1_3) {
                    break block12;
                }
lbl-1000:
                // 1 sources

                {
                    System.arraycopy(var10_13, var2_4, var1_1 /* !! */ , var3_5, var4_6);
                    var2_4 = var4_6;
                    break block11;
lbl81:
                    // 1 sources

                    var7_11 = var6_10;
                    System.arraycopy(var10_13, var2_4, var1_1 /* !! */ , var3_5, var5_7);
                    var7_11 = var6_10;
                    System.arraycopy(this.f, 0, var1_1 /* !! */ , var3_5 + var5_7, var4_6 - var5_7);
                    var2_4 = var4_6;
                }
            }
            this.d.unlock();
            return var2_4;
lbl-1000:
            // 1 sources

            {
                Thread.currentThread().interrupt();
                var10_13 = this.l;
                var12_15 = this.g;
                var2_4 = var7_11 + 1;
                jse.e(var12_15, "identity");
                var10_13.a.b((String)var12_15, var2_4);
                var11_17 = dox.n(ecf.a.l());
                var13_18 = doc.c(ebw.a.l());
                var13_18.m(ecd.g);
                var13_18.k((String)var12_15);
                var13_18.l(var2_4);
                var11_17.w(var13_18.j());
                var11_17 = var11_17.v();
                ((evo)var10_13.d).e((ecf)var11_17);
                ((heg)((heg)edv.b.h().h(hfo.a, "ALT.BytesAccessorBuffer")).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "copyFromBuffer", 208, "AudioAccessorAudioBuffer.java")).u("#audio# copyFromBuffer interrupted: exception in wait. Buffer: %s", this.g);
                var11_17 = this.g;
                var10_13 = new StringBuilder();
                var10_13.append("Reading from Audio Accessor interrupted. Buffer: ");
                var10_13.append((String)var11_17);
                var12_15 = new elv(var10_13.toString(), var1_2);
                throw var12_15;
            }
        }
        this.d.unlock();
        throw var1_3;
    }

    @Override
    public final List d() {
        return dpg.i(this.k);
    }

    final void e(int n2) {
        int n3;
        block7: {
            block6: {
                this.d.lock();
                try {
                    n3 = this.a;
                    if (n3 <= 0) break block6;
                }
                catch (Throwable throwable) {
                    this.d.unlock();
                    throw throwable;
                }
                n3 = this.f.length * (n3 - 1) + this.h;
                break block7;
            }
            n3 = 0;
        }
        if (n2 < n3) {
            Object object;
            if (this.c.compareAndSet(false, true)) {
                n2 = this.h() + 1;
                object = this.l;
                String string = this.g;
                jse.e(string, "identity");
                ((czh)object).a.e(string, n2);
                Object object2 = dox.n(ecf.a.l());
                cxt cxt2 = doc.c(ebw.a.l());
                cxt2.m(ecd.c);
                cxt2.k(string);
                cxt2.l(n2);
                ((bzo)object2).w(cxt2.j());
                object2 = ((bzo)object2).v();
                ((evo)((czh)object).d).e((ecf)object2);
                ((enc)((czh)object).b).c();
            }
            object = new elw();
            throw object;
        }
        this.d.unlock();
    }

    @Override
    public final void f() {
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((eeq)iterator.next()).b();
        }
        this.d.lock();
        try {
            if (!this.i) {
                this.i = true;
                int n2 = this.h() + 1;
                ((heg)((heg)b.f().h(hfo.a, "ALT.BytesAccessorBuffer")).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "markBufferClosed", 115, "AudioAccessorAudioBuffer.java")).A("#audio# mark buffer(%s) closed, available bytes(%d)", this.g, n2);
                this.l.m(this.g, n2);
            }
            return;
        }
        finally {
            this.e.signalAll();
            this.d.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void g(eft object, byte[] byArray) {
        int n2;
        int n3;
        int n4 = ((eft)object).a;
        if (n4 < 0) {
            ((heg)((heg)((heg)b.h().h(hfo.a, "ALT.BytesAccessorBuffer")).P()).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 128, "AudioAccessorAudioBuffer.java")).r("#audio# skipping an error write request");
            return;
        }
        object = this.k.iterator();
        block5: while (true) {
            n3 = 0;
            while (object.hasNext()) {
                n2 = ((eeq)object.next()).c(byArray, n4);
                if (n3 == 0 && n2 != 3) continue block5;
                n3 = 1;
            }
            break;
        }
        if (n3 != 0) {
            ((heg)((heg)((heg)b.f().h(hfo.a, "ALT.BytesAccessorBuffer")).P()).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 140, "AudioAccessorAudioBuffer.java")).r("#audio# silencing audio due to skip requested...");
            byArray = new byte[n4];
        }
        this.d.lock();
        boolean bl2 = this.i;
        if (bl2) {
            this.d.unlock();
            return;
        }
        bl2 = this.f.length >= n4;
        fxf.r(bl2, "Read size cannot be larger than the size of the buffer");
        object = this.f;
        n2 = ((Object)object).length;
        n3 = this.h;
        if ((n2 -= n3) > n4) {
            System.arraycopy(byArray, 0, object, n3, n4);
        } else {
            System.arraycopy(byArray, 0, object, n3, n2);
            System.arraycopy(byArray, n2, this.f, 0, n4 - n2);
            ((heg)((heg)b.e().h(hfo.a, "ALT.BytesAccessorBuffer")).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 160, "AudioAccessorAudioBuffer.java")).G("#audio# Buffer rewound, buffer: %s, length: %d, rewound: %d", this.g, this.f.length, this.a);
            ++this.a;
        }
        this.h = (this.h + n4) % this.f.length;
        this.j.set(this.h() + 1);
        ((heg)((heg)((heg)b.e().h(hfo.a, "ALT.BytesAccessorBuffer")).g(1, TimeUnit.SECONDS)).j("com/google/android/libraries/search/audio/audiobuffer/AudioAccessorAudioBuffer", "writeToBuffer", 169, "AudioAccessorAudioBuffer.java")).A("#audio# buffer: %s, writing to buffer, available bytes: %d", this.g, this.h() + 1);
        this.e.signalAll();
        return;
    }
}

