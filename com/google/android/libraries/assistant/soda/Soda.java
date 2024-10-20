/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  hom
 */
package com.google.android.libraries.assistant.soda;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Soda
implements cnd {
    private static final bzo B;
    public static final hei a;
    private final String A;
    private final ilo C;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final int c;
    private final Object d;
    private final ReentrantReadWriteLock e;
    private final Lock f;
    private final Lock g;
    private long h;
    private long i;
    private boolean j;
    private hpp k;
    private hpp l;
    private boolean m;
    private cms n;
    private hqa o;
    private cmt p;
    private final hpq q;
    private hpr r;
    private gto s;
    private gto t;
    private boolean u;
    private long v;
    private int w;
    private volatile int x;
    private volatile int y;
    private final String z;

    static {
        a = hei.m("com/google/android/libraries/assistant/soda/Soda");
        B = new bzo();
    }

    public Soda(Context context, hpq hpq2, hpr hpr2, long l2) {
        int n2;
        this.c = n2 = B.a();
        this.d = new Object();
        Serializable serializable = new ReentrantReadWriteLock();
        this.e = serializable;
        this.f = ((ReentrantReadWriteLock)serializable).readLock();
        this.g = ((ReentrantReadWriteLock)serializable).writeLock();
        this.j = false;
        serializable = gsl.a;
        this.s = serializable;
        this.t = serializable;
        this.u = false;
        this.v = 0L;
        this.w = 0;
        this.C = new ilo();
        this.x = 0;
        this.y = 0;
        serializable = new StringBuilder("addAudioBytes_id");
        ((StringBuilder)serializable).append(n2);
        this.z = ((StringBuilder)serializable).toString();
        serializable = new StringBuilder("addTimestampedAudioBytes_id");
        ((StringBuilder)serializable).append(n2);
        this.A = ((StringBuilder)serializable).toString();
        cne.a(context);
        this.q = hpq2;
        this.r = hpr2;
        this.i = l2;
        this.j = true;
        this.t();
    }

    public Soda(Context context, hpq hpq2, hpr hpr2, gto gto2) {
        int n2;
        this.c = n2 = B.a();
        this.d = new Object();
        Serializable serializable = new ReentrantReadWriteLock();
        this.e = serializable;
        this.f = ((ReentrantReadWriteLock)serializable).readLock();
        this.g = ((ReentrantReadWriteLock)serializable).writeLock();
        this.j = false;
        serializable = gsl.a;
        this.s = serializable;
        this.t = serializable;
        this.u = false;
        this.v = 0L;
        this.w = 0;
        this.C = new ilo();
        this.x = 0;
        this.y = 0;
        serializable = new StringBuilder("addAudioBytes_id");
        ((StringBuilder)serializable).append(n2);
        this.z = ((StringBuilder)serializable).toString();
        serializable = new StringBuilder("addTimestampedAudioBytes_id");
        ((StringBuilder)serializable).append(n2);
        this.A = ((StringBuilder)serializable).toString();
        cne.a(context);
        this.t();
        this.q = hpq2;
        this.r = hpr2;
        this.s = gto2;
    }

    private native boolean nativeAddAudio(long var1, ByteBuffer var3, long var4);

    private native boolean nativeAddTimestampedAudio(long var1, ByteBuffer var3, long var4, ByteBuffer var6, long var7);

    public static native long nativeCreateSharedResources(Object var0);

    private native void nativeDelete(long var1);

    private native boolean nativeDeleteDiarizationProcessor(long var1);

    public static native boolean nativeDeleteSharedResources(Object var0, long var1);

    private native boolean nativeDeleteSharedResourcesIfDiarizationProcessorAbsent(long var1);

    private native byte[] nativeInit(long var1, byte[] var3);

    private native boolean nativeRequiresReinitialization(long var1, byte[] var3);

    private native void nativeSetDataProvider(long var1, SodaDataProviderJni var3);

    private native void nativeSetTransportFactory(long var1, SodaTransportFactory var3);

    private native byte[] nativeStartCapture(long var1, byte[] var3);

    private native void nativeStopCapture(long var1);

    private static hpr s(String string, int n2) {
        ivg ivg2 = new ivg(null);
        ivg2.h(string);
        fxf.w(true, "Thread priority (%s) must be >= %s", n2, 1);
        fxf.w(true, "Thread priority (%s) must be <= %s", n2, 10);
        ivg2.b = n2;
        return hhk.F(Executors.newSingleThreadScheduledExecutor(ivg.i(ivg2)));
    }

    private final void t() {
        if (this.j) {
            if (this.i == 0L) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1490, "Soda.java")).r("SodaSharedResources should never be NULL_PTR when provided externally.");
                this.i = Soda.nativeCreateSharedResources(this);
            }
        } else if (this.i == 0L) {
            this.i = Soda.nativeCreateSharedResources(this);
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1497, "Soda.java")).r("Creating new SodaSharedResources");
        } else {
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1499, "Soda.java")).r("Reusing cached SodaSharedResources");
        }
        this.g.lock();
        try {
            this.h = this.nativeConstruct(this.i);
            return;
        }
        finally {
            this.g.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void u(boolean bl2) {
        synchronized (this) {
            this.g.lock();
            try {
                long l2;
                Object object;
                if (this.t.g() && ((giu)this.t.c()).c.g()) {
                    if (this.q != null) {
                        object = ((giu)this.t.c()).g();
                        cmp cmp2 = new cmp(0);
                        fxf.al((hpn)object, cmp2, this.q);
                    } else {
                        ((heg)((heg)a.h()).j("com/google/android/libraries/assistant/soda/Soda", "delete", 1162, "Soda.java")).r("No background executor available to tear down data provider.");
                    }
                }
                if ((l2 = this.h) != 0L) {
                    this.nativeDelete(l2);
                    this.h = 0L;
                    if (this.nativeDeleteSharedResourcesIfDiarizationProcessorAbsent(this.i)) {
                        this.i = 0L;
                    }
                    if (this.i != 0L && this.b() <= 0L) {
                        object = hwg.a.l();
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        ((hwg)((hwp)object).b).b = 3600L;
                        this.n((hwg)((hwp)object).o());
                        if (bl2 && this.s.g()) {
                            ((cmo)this.s.c()).a();
                        }
                    }
                }
                this.m = false;
                return;
            }
            finally {
                this.g.unlock();
            }
        }
    }

    private final void v() {
        if (this.h != 0L) {
            return;
        }
        throw new IllegalStateException("SODA Android is not initialized");
    }

    @Override
    public final long a() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long b() {
        synchronized (this) {
            hpp hpp2 = this.k;
            if (hpp2 == null) return -1L;
            return hpp2.getDelay(TimeUnit.SECONDS);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c() {
        synchronized (this) {
            hpp hpp2 = this.k;
            if (hpp2 != null) {
                long l2 = hpp2.getDelay(TimeUnit.MILLISECONDS);
                return 3600000L - l2;
            }
            return -1L;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final cmt d() {
        Object object = this.d;
        synchronized (object) {
            return this.p;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn e(igx var1_1, InputStream var2_6, gto var3_7) {
        block34: {
            block33: {
                var9_8 = this.o;
                if (var9_8 != null && !var9_8.isDone() && !this.o.isCancelled()) {
                    ((heg)((heg)Soda.a.g()).j("com/google/android/libraries/assistant/soda/Soda", "startCapture", 574, "Soda.java")).r("Another SODA capture session is active. Ignoring startCapture request.");
                    return hhk.J(new cnp());
                }
                if (!var1_1.c) {
                    ((heg)((heg)Soda.a.g()).j("com/google/android/libraries/assistant/soda/Soda", "startCapture", 581, "Soda.java")).r("Blocking calls to Soda.startCapture with InputStream are deprecated.");
                    var9_8 = (hwp)var1_1.C(5);
                    var9_8.x((hwv)var1_1);
                    var1_1 = (hwr)var9_8;
                    if (!var1_1.b.B()) {
                        var1_1.u();
                    }
                    igx.G((igx)var1_1.b);
                    var1_1 = (igx)var1_1.o();
                    this.o = new hqa();
                } else {
                    this.o = null;
                }
                if (this.n == null) {
                    var9_8 = var10_9 = this.q;
                    if (var10_9 == null) {
                        var9_8 = Soda.s("soda-background-%d", 1);
                    }
                    var10_9 = var11_10 = var1_1.e;
                    if (var11_10 == null) {
                        var10_9 = igv.a;
                    }
                    var10_9 = var10_9.b == 1 ? (igw)var10_9.c : igw.a;
                    var10_9 = var11_10 = var10_9.e;
                    if (var11_10 == null) {
                        var10_9 = ids.a;
                    }
                    var4_11 = var10_9.d;
                    var10_9 = var11_10 = var1_1.e;
                    if (var11_10 == null) {
                        var10_9 = igv.a;
                    }
                    var10_9 = var10_9.b == 1 ? (igw)var10_9.c : igw.a;
                    var10_9 = var11_10 = var10_9.e;
                    if (var11_10 == null) {
                        var10_9 = ids.a;
                    }
                    this.n = new cms((hpq)var9_8, this, var4_11, var10_9.e);
                }
                var9_8 = ibi.a.l();
                if (!var9_8.b.B()) {
                    var9_8.u();
                }
                ((ibi)var9_8.b).b = 0;
                var9_8 = (ibi)var9_8.o();
                if (!this.b.compareAndSet(false, true)) break block33;
                this.y = 0;
                this.x = 0;
                var9_8 = var10_9 = var1_1.e;
                if (var10_9 == null) {
                    var9_8 = igv.a;
                }
                var9_8 = var9_8.b == 1 ? (igw)var9_8.c : igw.a;
                var4_11 = a.t(var9_8.c);
                var8_12 = var4_11 != 0 && var4_11 == 3;
                this.u = var8_12;
                var9_8 = var10_9 = var9_8.e;
                if (var10_9 == null) {
                    var9_8 = ids.a;
                }
                var7_13 = var9_8.e;
                var6_14 = a.v(var9_8.c);
                var5_15 = 2;
                var4_11 = var6_14;
                if (var6_14 == 0) {
                    var4_11 = 2;
                }
                var6_14 = var4_11 - 1;
                var4_11 = var5_15;
                if (var6_14 != 1) {
                    if (var6_14 != 2 && var6_14 != 3) {
                        throw new IllegalArgumentException(String.format("Unexpected SampleFormat: %d", new Object[]{var6_14}));
                    }
                    var4_11 = 4;
                }
                this.w = var7_13 * var4_11;
                this.v = 0L;
                this.f.lock();
                this.v();
                var1_1 = this.nativeStartCapture(this.h, var1_1.g());
                ** try [egrp 1[TRYBLOCK] [1 : 704->730)] { 
lbl-1000:
                // 1 sources

                {
                    var1_1 = (ibi)((hwp)ibi.a.l().c((byte[])var1_1, hwj.a())).o();
                }
lbl76:
                // 1 sources

                catch (hxn var1_2) {
                    ((heg)((heg)Soda.a.g()).j("com/google/android/libraries/assistant/soda/Soda", "convertToStatus", 1402, "Soda.java")).r("Failed to deserialize received bytes to com.google.rpc.Status proto");
                    var1_1 = ibi.a.l();
                    if (!var1_1.b.B()) {
                        var1_1.u();
                    }
                    var9_8 = var1_1.b;
                    ((ibi)var9_8).b = 13;
                    if (!var9_8.B()) {
                        var1_1.u();
                    }
                    ((ibi)var1_1.b).c = "failed to deserialize received bytes to com.google.rpc.Status proto";
                    var1_1 = (ibi)var1_1.o();
                }
                var9_8 = var1_1;
                if (var1_1.b != 0) {
                    ((heg)((heg)Soda.a.g()).j("com/google/android/libraries/assistant/soda/Soda", "startCaptureInternal", 1377, "Soda.java")).r("Failed to start a SODA capture session");
                    this.m();
                    this.b.set(false);
                    var9_8 = var1_1;
                }
                break block34;
                finally {
                    this.f.unlock();
                }
            }
            ((heg)((heg)Soda.a.g()).j("com/google/android/libraries/assistant/soda/Soda", "startCaptureInternal", 1385, "Soda.java")).r("Another SODA capture session is active. Ignoring startCapture request.");
            var1_1 = ibi.a.l();
            if (!var1_1.b.B()) {
                var1_1.u();
            }
            var9_8 = var1_1.b;
            ((ibi)var9_8).b = 10;
            if (!var9_8.B()) {
                var1_1.u();
            }
            ((ibi)var1_1.b).c = "another SODA capture session is active, ignoring startCapture request";
            var9_8 = (ibi)var1_1.o();
        }
        if (var9_8.b != 0) {
            return hhk.J(new cnq(var9_8.c));
        }
        var9_8 = this.n;
        var9_8.f = new hqa();
        var1_1 = var9_8.g;
        synchronized (var1_1) {
            var10_9 = var9_8.b;
            var11_10 = new cmq(var9_8, var2_6, var3_7, 0);
            var9_8.h = var10_9.bf((Callable)var11_10);
            var3_7 = var9_8.h;
            var2_6 = new cmr(var9_8, 0);
            hhk.T((hpn)var3_7, (hpb)var2_6, (Executor)hom.a);
        }
        var1_1 = var2_6 = var9_8.f;
        if (this.o == null) return var1_1;
        try {
            ((heg)((heg)Soda.a.h()).j("com/google/android/libraries/assistant/soda/Soda", "startCapture", 617, "Soda.java")).r("Blocking until capture is stopped.");
            var1_1 = (Void)this.o.get();
            return var2_6;
        }
        catch (ExecutionException var1_4) {
        }
        catch (InterruptedException var1_5) {
            // empty catch block
        }
        a.as(Soda.a.g(), "Exception while waiting for stop capture.", "com/google/android/libraries/assistant/soda/Soda", "startCapture", '\u026c', "Soda.java", (Throwable)var1_1);
        return var2_6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final igq f(cnc object) {
        synchronized (this) {
            Object object2;
            Object object3;
            Object object4;
            boolean bl2;
            block34: {
                boolean bl3 = this.m;
                bl2 = true;
                if (bl3) {
                    object = igq.a.l();
                    igr igr2 = igr.c;
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    hwv hwv2 = ((hwp)object).b;
                    igq igq2 = (igq)hwv2;
                    igq2.c = igr2.o;
                    igq2.b |= 1;
                    if (!hwv2.B()) {
                        ((hwp)object).u();
                    }
                    hwv2 = (igq)((hwp)object).b;
                    ((igq)hwv2).b |= 2;
                    ((igq)hwv2).d = "SODA cannot be initialized more than once.";
                    return (igq)((hwp)object).o();
                }
                iez iez2 = ((cnc)object).a;
                object4 = gsl.a;
                object2 = object3 = iez2.e;
                if (object3 == null) {
                    object2 = iey.a;
                }
                object2 = object3 = ((iey)object2).p;
                if (object3 == null) {
                    object2 = iep.a;
                }
                object3 = iek.e;
                ((hws)object2).h((gpm)object3);
                object2 = ((hws)object2).r.l((hwu)((gpm)object3).a);
                object2 = object2 == null ? ((gpm)object3).d : ((gpm)object3).k(object2);
                int n2 = a.t(((iek)object2).c);
                if (n2 == 0) {
                    object2 = object4;
                } else {
                    object2 = object4;
                    if (n2 == 3) {
                        object2 = object4;
                        if (!this.j) {
                            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 333, "Soda.java")).r("Diarization session is being resumed - cancelling timeout.");
                            object2 = gto.i(this.c());
                            object4 = hwg.a.l();
                            if (!((hwp)object4).b.B()) {
                                ((hwp)object4).u();
                            }
                            ((hwg)((hwp)object4).b).b = -1L;
                            this.n((hwg)((hwp)object4).o());
                        }
                    }
                }
                this.g.lock();
                if (this.h == 0L) {
                    this.t();
                }
                this.v();
                if (((cnc)object).b.g()) {
                    this.nativeSetTransportFactory(this.h, (SodaTransportFactory)((cnc)object).b.c());
                }
                object4 = ((cnc)object).c;
                this.t = object4;
                if (((gto)object4).g()) {
                    Object object5 = this.t.c();
                    object4 = object3 = iez2.e;
                    if (object3 == null) {
                        object4 = iey.a;
                    }
                    object4 = object3 = ((iey)object4).u;
                    if (object3 == null) {
                        object4 = iel.a;
                    }
                    if ((n2 = idi.a(((iel)object4).c)) != 0 && n2 != 1 && ((giu)object5).c.f()) {
                        if (this.q != null) {
                            object3 = ((giu)this.t.c()).f(iez2);
                            object4 = new cmp(1);
                            fxf.al((hpn)object3, (hpb)object4, this.q);
                        } else {
                            ((heg)((heg)a.h()).j("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 403, "Soda.java")).r("No background executor available to set up data provider.");
                        }
                    }
                    long l2 = this.h;
                    object4 = new SodaDataProviderJni((giu)((cnc)object).c.c());
                    this.nativeSetDataProvider(l2, (SodaDataProviderJni)object4);
                }
                if ((object = (Object)this.nativeInit(this.h, iez2.g())) != null) break block34;
                this.j();
                object = igq.a.l();
                object2 = igr.g;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = ((hwp)object).b;
                object4 = (igq)object3;
                ((igq)object4).c = ((igr)object2).o;
                ((igq)object4).b |= 1;
                if (!((hwv)object3).B()) {
                    ((hwp)object).u();
                }
                object2 = (igq)((hwp)object).b;
                ((igq)object2).b |= 2;
                ((igq)object2).d = "Unable to parse ConfigResult:  Serialized ConfigResult is null.";
                return (igq)((hwp)object).o();
            }
            try {
                object3 = (igq)((hwp)igq.a.l().c((byte[])object, hwj.a())).o();
            }
            catch (hxn hxn2) {
                this.j();
                hyg hyg2 = igq.a.l();
                object3 = igr.g;
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                object2 = hyg2.b;
                object4 = (igq)object2;
                ((igq)object4).c = ((igr)object3).o;
                ((igq)object4).b |= 1;
                if (!((hwv)object2).B()) {
                    hyg2.u();
                }
                object2 = (igq)hyg2.b;
                ((igq)object2).b |= 2;
                ((igq)object2).d = "Unable to parse ConfigResult: InvalidProtocolBufferException";
                return (igq)hyg2.o();
            }
            object = object4 = igr.b(((igq)object3).c);
            if (object4 == null) {
                object = igr.a;
            }
            if (object != igr.a) {
                bl2 = false;
            }
            this.m = bl2;
            if (!((gto)object2).g()) return object3;
            if (bl2) {
                if (!this.s.g()) return object3;
                object = (cmo)this.s.c();
                ((Long)((gto)object2).c()).longValue();
                object.c();
            } else {
                ((heg)((heg)a.h()).j("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 453, "Soda.java")).r("Resume failed. Deleting soda to ensure processor cached.");
                this.u(false);
            }
            return object3;
            finally {
                this.g.unlock();
            }
        }
    }

    protected final void finalize() {
        this.j();
    }

    public final void g(ByteBuffer byteBuffer, int n2) {
        block14: {
            if (this.u) {
                block13: {
                    ((heg)((heg)((heg)a.g()).g(30, TimeUnit.SECONDS)).j("com/google/android/libraries/assistant/soda/Soda", "addAudio", 946, "Soda.java")).r("Client explicitly committed to provide timestamps, but called addAudio instead of addTimestampedAudio. Proceeding with fake timestamps.");
                    Object object = this.C;
                    Object object2 = ((ilo)object).a;
                    if (object2 != null && ((ByteBuffer)object2).capacity() >= 16) {
                        ((ByteBuffer)((ilo)object).a).clear();
                    } else {
                        ((ilo)object).a = ByteBuffer.allocateDirect(16);
                    }
                    object2 = ((ilo)object).a;
                    long l2 = Long.reverseBytes(this.v);
                    object = (ByteBuffer)object2;
                    ((ByteBuffer)object).putLong(l2);
                    ((ByteBuffer)object).putLong(0L);
                    int n3 = ((Buffer)object).capacity();
                    this.f.lock();
                    this.v();
                    this.v += (long)(n2 / this.w);
                    long l3 = this.h;
                    l2 = n2;
                    long l4 = n3;
                    if (!this.nativeAddTimestampedAudio(l3, byteBuffer, l2, (ByteBuffer)object2, l4)) break block13;
                    this.y += n2;
                }
                if (Build.VERSION.SDK_INT >= 29 && yj.o()) {
                    yj.n(this.A, this.y);
                }
                this.v += (long)(n2 / this.w);
                return;
                finally {
                    this.f.unlock();
                }
            }
            this.f.lock();
            this.v();
            if (this.nativeAddAudio(this.h, byteBuffer, n2)) {
                this.x += n2;
                break block14;
            }
            ((heg)((heg)((heg)a.h()).g(1, TimeUnit.SECONDS)).j("com/google/android/libraries/assistant/soda/Soda", "addAudio", 964, "Soda.java")).r("Failed to add audio to SODA.");
        }
        if (Build.VERSION.SDK_INT >= 29 && yj.o()) {
            yj.n(this.z, this.x);
        }
        return;
        finally {
            this.f.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h() {
        synchronized (this) {
            hpp hpp2 = this.l;
            if (hpp2 != null) {
                hpp2.cancel(false);
                this.l = null;
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void handleShutdown() {
        Object object = this.d;
        synchronized (object) {
            Object object2 = this.p;
            if (object2 != null && ((gto)(object2 = ((fgn)object2).a)).g()) {
                ((fgf)((gto)object2).c()).a();
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    protected void handleSodaEvent(byte[] var1_1) {
        var7_3 = this.d;
        synchronized (var7_3) {
            block45: {
                block46: {
                    var8_4 = (hwr)((hwr)iga.a.l()).c((byte[])var1_1, hwj.a());
                    if (this.p == null) break block45;
                    var1_1 = var5_5 = ((iga)var8_4.b).d;
                    if (var5_5 == null) {
                        var1_1 = ifz.a;
                    }
                    if ((var2_6 = idi.g(var1_1.d)) == 0 || var2_6 != 4) break block46;
                    var9_7 = this.p;
                    var1_1 = var5_5 = ((iga)var8_4.b).d;
                    if (var5_5 == null) {
                        var1_1 = ifz.a;
                    }
                    var10_9 = ief.a.l();
                    var2_6 = var1_1.b;
                    if (var2_6 == 1) {
                        var5_5 = (ifm)var1_1.c;
                        if (var5_5.c.size() > 0) {
                            var11_11 = (String)var5_5.c.get(0);
                            if (!var10_9.b.B()) {
                                var10_9.u();
                            }
                            var6_13 = (ief)var10_9.b;
                            var11_11.getClass();
                            var6_13.b |= 2;
                            var6_13.e = var11_11;
                        }
                        var4_15 = var5_5.b;
                        var2_6 = var3_16 = 3;
                        if ((var4_15 & 32) != 0) {
                            var5_5 = var6_13 = var5_5.e;
                            if (var6_13 == null) {
                                var5_5 = igd.a;
                            }
                            var5_5 = var5_5.b;
                            if (!var10_9.b.B()) {
                                var10_9.u();
                            }
                            var6_13 = (ief)var10_9.b;
                            var5_5.getClass();
                            var6_13.b |= 4;
                            var6_13.f = var5_5;
                            var2_6 = var3_16;
                        }
                    } else if (var2_6 == 4) {
                        var11_11 = (ify)var1_1.c;
                        if (var11_11.c.size() > 0) {
                            var5_5 = (String)var11_11.c.get(0);
                            if (!var10_9.b.B()) {
                                var10_9.u();
                            }
                            var6_13 = (ief)var10_9.b;
                            var5_5.getClass();
                            var6_13.b |= 2;
                            var6_13.e = var5_5;
                        }
                        if ((var11_11.b & 16) != 0) {
                            var5_5 = var6_13 = var11_11.d;
                            if (var6_13 == null) {
                                var5_5 = igd.a;
                            }
                            var5_5 = var5_5.b;
                            if (!var10_9.b.B()) {
                                var10_9.u();
                            }
                            var6_13 = (ief)var10_9.b;
                            var5_5.getClass();
                            var6_13.b |= 4;
                            var6_13.f = var5_5;
                        }
                        var2_6 = 2;
                    } else {
                        var2_6 = 1;
                    }
                    for (Object var1_1 : var1_1.e) {
                        var11_11 = igt.a.l();
                        if (!var11_11.b.B()) {
                            var11_11.u();
                        }
                        var5_5 = (igt)var11_11.b;
                        var5_5.c = var2_6 - 1;
                        var5_5.b |= 1;
                        var1_1 = var5_5 = var1_1.b;
                        if (var5_5 == null) {
                            var1_1 = idu.a;
                        }
                        var12_17 = ieg.a.l();
                        var3_16 = var1_1.b;
                        if (var3_16 == 9) {
                            var1_1 = var5_5 = ieh.b((Integer)var1_1.c);
                            if (var5_5 == null) {
                                var1_1 = ieh.a;
                            }
                            if (!var12_17.b.B()) {
                                var12_17.u();
                            }
                            var5_5 = (ieg)var12_17.b;
                            var5_5.c = var1_1.p;
                            var5_5.b = 1;
                        } else if (var3_16 == 8) {
                            var1_1 = (String)var1_1.c;
                            if (!var12_17.b.B()) {
                                var12_17.u();
                            }
                            var5_5 = (ieg)var12_17.b;
                            var1_1.getClass();
                            var5_5.b = 2;
                            var5_5.c = var1_1;
                        }
                        var5_5 = (ieg)var12_17.o();
                        if (!var11_11.b.B()) {
                            var11_11.u();
                        }
                        var1_1 = (igt)var11_11.b;
                        var5_5.getClass();
                        var1_1.d = var5_5;
                        var1_1.b |= 4;
                        var10_9.P((igt)var11_11.o());
                    }
                    var5_5 = ((iga)var8_4.b).g;
                    if (!var10_9.b.B()) {
                        var10_9.u();
                    }
                    var1_1 = (ief)var10_9.b;
                    var5_5.getClass();
                    var1_1.b |= 1;
                    var1_1.c = var5_5;
                    var8_4.aH(ief.h, (ief)var10_9.o());
                    var9_7.b((iga)var8_4.o());
                    break block45;
                }
                var1_1 = (iga)var8_4.b;
                if ((var1_1.b & 1) == 0) ** GOTO lbl-1000
                var1_1 = var5_5 = var1_1.c;
                if (var5_5 == null) {
                    var1_1 = ifq.b;
                }
                if (var1_1.f.size() > 0) {
                    var9_8 = this.p;
                    var10_10 = ief.a.l();
                    var1_1 = var5_5 = ((iga)var8_4.b).c;
                    if (var5_5 == null) {
                        var1_1 = ifq.b;
                    }
                    if ((var1_1.c & 1) != 0) {
                        var5_5 = var6_14 = var1_1.d;
                        if (var6_14 == null) {
                            var5_5 = ifp.a;
                        }
                        var6_14 = var5_5.b;
                        if (!var10_10.b.B()) {
                            var10_10.u();
                        }
                        var5_5 = (ief)var10_10.b;
                        var6_14.getClass();
                        var5_5.b |= 2;
                        var5_5.e = var6_14;
                    }
                    if ((var1_1.c & 4) != 0) {
                        var5_5 = var6_14 = var1_1.e;
                        if (var6_14 == null) {
                            var5_5 = igd.a;
                        }
                        var6_14 = var5_5.b;
                        if (!var10_10.b.B()) {
                            var10_10.u();
                        }
                        var5_5 = (ief)var10_10.b;
                        var6_14.getClass();
                        var5_5.b |= 4;
                        var5_5.f = var6_14;
                    }
                    var5_5 = new hxd(var1_1.f, ifq.a);
                    var5_5 = var5_5.iterator();
                    while (var5_5.hasNext()) {
                        var6_14 = (ieh)var5_5.next();
                        var1_1 = igt.a.l();
                        if (!var1_1.b.B()) {
                            var1_1.u();
                        }
                        var11_12 = (igt)var1_1.b;
                        var11_12.c = 2;
                        var11_12.b |= 1;
                        var11_12 = ieg.a.l();
                        if (!var11_12.b.B()) {
                            var11_12.u();
                        }
                        var12_18 = (ieg)var11_12.b;
                        var12_18.c = var6_14.p;
                        var12_18.b = 1;
                        var6_14 = (ieg)var11_12.o();
                        if (!var1_1.b.B()) {
                            var1_1.u();
                        }
                        var11_12 = (igt)var1_1.b;
                        var6_14.getClass();
                        var11_12.d = var6_14;
                        var11_12.b |= 4;
                        var10_10.P((igt)var1_1.o());
                    }
                    if (!var10_10.b.B()) {
                        var10_10.u();
                    }
                    var1_1 = (ief)var10_10.b;
                    var1_1.b = 8 | var1_1.b;
                    var1_1.g = true;
                    var8_4.aH(ief.h, (ief)var10_10.o());
                    var9_8.b((iga)var8_4.o());
                } else lbl-1000:
                // 2 sources

                {
                    this.p.b((iga)var8_4.o());
                }
            }
            return;
            catch (Throwable var1_2) {}
            {
                throw var1_2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void handleStart() {
        Object object = this.d;
        synchronized (object) {
            cmt cmt2 = this.p;
            if (cmt2 != null) {
                gof gof2 = ((fgn)cmt2).b.f.d("handleStart");
                try {
                    fgo fgo2 = ((fgn)cmt2).b;
                    cxt cxt2 = fgo2.A;
                    fgm fgm2 = new fgm(cmt2, 0);
                    fgo.e(cxt2.E(fgm2, fgo2.d), "Failed call #handleStart", new Object[0]);
                }
                finally {
                    gof2.close();
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void handleStop(int n2) {
        Object object;
        this.b.set(false);
        Object object2 = this.d;
        synchronized (object2) {
            cmt cmt2 = this.p;
            if (cmt2 != null) {
                object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? cnf.a : cnf.e) : cnf.d) : cnf.c) : cnf.b;
                gof gof2 = ((fgn)cmt2).b.f.d("handleStop");
                try {
                    fgo fgo2 = ((fgn)cmt2).b;
                    cxt cxt2 = fgo2.A;
                    czm czm2 = new czm(cmt2, object, 7, null);
                    fgo.e(cxt2.E(czm2, fgo2.d), "Failed call #handleStop", new Object[0]);
                }
                finally {
                    gof2.close();
                }
            }
        }
        object = this.o;
        if (object != null) {
            ((hnk)object).m(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(igs object) {
        synchronized (this) {
            block12: {
                if (!this.j) {
                    boolean bl2;
                    hei hei2 = a;
                    ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1281, "Soda.java")).u("#clearDiarizationCache: %s", object);
                    if (this.i == 0L) {
                        ((heg)((heg)hei2.h()).j("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1284, "Soda.java")).r("SodaSharedResources is already NULL_PTR, nothing to delete.");
                        return;
                    }
                    object = this.l;
                    if (object != null && object.getDelay(TimeUnit.SECONDS) > 0L) {
                        this.h();
                        ((heg)((heg)hei2.h()).j("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1297, "Soda.java")).r("Deleting soda early to force caching.");
                        this.j();
                    }
                    this.c();
                    object = hwg.a.l();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    ((hwg)((hwp)object).b).b = -1L;
                    this.n((hwg)((hwp)object).o());
                    this.f.lock();
                    if (this.h != 0L) {
                        bl2 = this.nativeDeleteDiarizationProcessor(this.i);
                        ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1318, "Soda.java")).u("DiarizationProcessor deleted from SodaSharedResources: %b", bl2);
                    } else {
                        bl2 = Soda.nativeDeleteSharedResources(this, this.i);
                        this.i = 0L;
                        ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1325, "Soda.java")).u("Deleted SodaSharedResources. Diarization processor present: %b", bl2);
                    }
                    if (!bl2 || !this.s.g()) break block12;
                    ((cmo)this.s.c()).b();
                    return;
                }
            }
            return;
            finally {
                this.f.unlock();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void j() {
        synchronized (this) {
            this.u(true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void k(hwg hwg2, Runnable runnable) {
        synchronized (this) {
            Object object = this.l;
            if (object != null) {
                object.cancel(false);
            }
            if (this.r == null) {
                this.r = Soda.s("soda-lightweight-%d", 5);
            }
            object = this.r;
            ckr ckr2 = new ckr((Object)hwg2, (Object)runnable, 7, null);
            this.l = object.b(ckr2, hwg2.b, TimeUnit.SECONDS);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void l(cmt cmt2) {
        Object object = this.d;
        synchronized (object) {
            this.p = cmt2;
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void m() {
        block11: {
            this.f.lock();
            this.v();
            this.nativeStopCapture(this.h);
            cms cms2 = this.n;
            if (cms2 == null) break block11;
            Object object = cms2.g;
            synchronized (object) {
                hpn hpn2;
                if (cms2.f != null && (hpn2 = cms2.h) != null && !hpn2.isDone() && !cms2.f.isDone()) {
                    cms2.f.cancel(true);
                    hpn2 = new hqa();
                    cms2.i = hpn2;
                }
            }
            object = cms2.i;
            if (object != null) {
                void var1_5;
                try {
                    ((hnk)object).get();
                    return;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (ExecutionException executionException) {
                    // empty catch block
                }
                a.as(cms.a.g(), "Exception occurred when trying to stop pushing SODA audio.", "com/google/android/libraries/assistant/soda/SodaAudioPusher", "stopRunner", '\u00fb', "SodaAudioPusher.java", (Throwable)var1_5);
                return;
            }
        }
        return;
        finally {
            this.f.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(hwg object) {
        synchronized (this) {
            if (!this.j) {
                if (((hwg)object).b == -1L) {
                    object = this.k;
                    this.k = null;
                } else {
                    if (this.r == null) {
                        this.r = Soda.s("soda-lightweight-%d", 5);
                    }
                    ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/Soda", "updateSharedResourcesTimeout", 1236, "Soda.java")).t("Starting new shared resources timeout future for %d seconds.", ((hwg)object).b);
                    hpp hpp2 = this.k;
                    hpr hpr2 = this.r;
                    ckr ckr2 = new ckr((Object)this, object, 6, null);
                    this.k = hpr2.b(ckr2, ((hwg)object).b, TimeUnit.SECONDS);
                    object = hpp2;
                }
                if (object != null) {
                    object.cancel(false);
                    return;
                }
            }
            return;
        }
    }

    public native long nativeConstruct(long var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean o() {
        synchronized (this) {
            boolean bl2;
            hpp hpp2 = this.l;
            return hpp2 != null && !(bl2 = hpp2.isDone());
            {
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean p() {
        synchronized (this) {
            return this.m;
        }
    }

    @Override
    public final boolean q() {
        return this.b.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean r(iez iez2) {
        synchronized (this) {
            if (!this.m) {
                return true;
            }
            this.f.lock();
            try {
                boolean bl2 = this.nativeRequiresReinitialization(this.h, iez2.g());
                return bl2;
            }
            finally {
                this.f.unlock();
            }
        }
    }
}

