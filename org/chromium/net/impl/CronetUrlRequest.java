/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package org.chromium.net.impl;

import J.N;
import android.util.Log;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

public final class CronetUrlRequest
extends kom {
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private krb E;
    private kpn F;
    public long a;
    public boolean b;
    public final Object c = new Object();
    public final CronetUrlRequestContext d;
    public final ksj e;
    public final CronetUploadDataStream f;
    public kod g;
    public kpv h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final Executor l;
    private final List m;
    private final String n;
    private final int o;
    private final String p;
    private final List q;
    private final boolean r;
    private final boolean s;
    private final int t;
    private final boolean u;
    private final int v;
    private final long w;
    private final kqx x;
    private int y;
    private boolean z;

    public CronetUrlRequest(CronetUrlRequestContext object, String string, int n2, kps kps2, Executor executor, boolean bl2, boolean bl3, boolean bl4, int n3, boolean bl5, int n4, long l2, String string2, ArrayList arrayList, kpq kpq2, Executor executor2) {
        ArrayList<String> arrayList2;
        this.m = arrayList2 = new ArrayList<String>();
        Objects.requireNonNull(string, "URL is required");
        Objects.requireNonNull(kps2, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.i = bl3;
        this.d = object;
        this.x = ((CronetUrlRequestContext)object).f;
        this.n = string;
        arrayList2.add(string);
        int n5 = 1;
        if (n2 != 0) {
            n5 = n2 != 1 ? (n2 != 2 ? 4 : 3) : 2;
        }
        this.o = n5;
        this.e = new ksj(kps2);
        this.l = executor;
        this.r = bl2;
        this.s = bl4;
        this.t = n3;
        this.u = bl5;
        this.v = n4;
        this.w = l2;
        this.p = string2;
        this.q = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        object = kpq2 == null ? null : new CronetUploadDataStream(kpq2, executor2, this);
        this.f = object;
    }

    public static /* bridge */ /* synthetic */ void n(CronetUrlRequest cronetUrlRequest) {
        cronetUrlRequest.k = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void o(kod kod2) {
        Object object = this.c;
        synchronized (object) {
            if (this.m()) {
                return;
            }
            this.g = kod2;
            this.g(1);
            return;
        }
    }

    private void onCanceled() {
        this.p(new kra(this, 0));
    }

    private void onError(int n2, int n3, int n4, int n5, String string, long l2) {
        Object object = this.h;
        if (object != null) {
            ((kpv)object).d(l2);
        }
        if (n2 != 10) {
            if (n2 == 3) {
                n2 = 3;
            } else {
                switch (n2) {
                    default: {
                        String string2 = CronetUrlRequestContext.a;
                        object = a.af(n2, "Unknown error code: ");
                        Log.e((String)"cr_".concat(String.valueOf(string2)), (String)object);
                        break;
                    }
                    case 11: {
                        n2 = 11;
                        break;
                    }
                    case 10: {
                        n2 = 10;
                        break;
                    }
                    case 9: {
                        n2 = 9;
                        break;
                    }
                    case 8: {
                        n2 = 8;
                        break;
                    }
                    case 7: {
                        n2 = 7;
                        break;
                    }
                    case 6: {
                        n2 = 6;
                        break;
                    }
                    case 5: {
                        n2 = 5;
                        break;
                    }
                    case 4: {
                        n2 = 4;
                        break;
                    }
                    case 3: {
                        n2 = 3;
                        break;
                    }
                    case 2: {
                        n2 = 2;
                        break;
                    }
                    case 1: {
                        n2 = 1;
                    }
                }
                this.o(new kry("Exception in CronetUrlRequest: ".concat(String.valueOf(string)), n2, n3));
                return;
            }
        }
        this.o(new ksa("Exception in CronetUrlRequest: ".concat(String.valueOf(string)), n2, n3, n4, n5));
    }

    private void onMetricsCollected(long l2, long l3, long l4, long l5, long l6, long l7, long l8, long l9, long l10, long l11, long l12, long l13, long l14, boolean bl2, long l15, long l16, boolean bl3, boolean bl4) {
        if (this.F == null) {
            this.F = new kpn(l2, l13, l14, l15, l16);
            this.z = bl3;
            this.A = bl4;
            return;
        }
        throw new IllegalStateException("Metrics collection should only happen once.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onNativeAdapterDestroyed() {
        Object object = this.c;
        synchronized (object) {
            if (this.g == null) {
                return;
            }
        }
        kra kra2 = new kra(this, 2);
        try {
            this.l.execute(kra2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception posting task to executor", (Throwable)rejectedExecutionException);
            return;
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int n2, int n3, int n4, long l2) {
        this.h.d(l2);
        if (byteBuffer.position() == n3 && byteBuffer.limit() == n4) {
            if (this.E == null) {
                this.E = new krb(this, 0);
            }
            Object object = (ByteBuffer)byteBuffer.position(n3 + n2);
            object = this.E;
            ((krb)object).a = byteBuffer;
            this.p((Runnable)object);
            return;
        }
        this.o(new kqp("ByteBuffer modified externally during read", null));
    }

    private void onRedirectReceived(String string, int n2, String object, String[] stringArray, boolean bl2, String string2, String string3, long l2) {
        List list = this.m;
        object = this.q(n2, (String)object, stringArray, bl2, string2, string3, l2);
        list.add(string);
        this.p(new hst(this, (kpv)object, string, 13));
    }

    private void onResponseStarted(int n2, String string, String[] stringArray, boolean bl2, String string2, String string3, long l2) {
        this.h = this.q(n2, string, stringArray, bl2, string2, string3, l2);
        this.p(new jhz(this, 20));
    }

    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int n2) {
        this.p(new cdw((Object)versionSafeCallbacks$UrlRequestStatusListener, n2, 14, null));
    }

    private void onSucceeded(long l2) {
        this.h.d(l2);
        this.p(new kra(this, 1));
    }

    private final void p(Runnable runnable) {
        try {
            this.l.execute(runnable);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception posting task to executor", (Throwable)rejectedExecutionException);
            this.o(new kqp("Exception posting task to executor", rejectedExecutionException));
            return;
        }
    }

    private final kpv q(int n2, String string, String[] stringArray, boolean bl2, String string2, String string3, long l2) {
        ArrayList<AbstractMap.SimpleImmutableEntry<String, String>> arrayList = new ArrayList<AbstractMap.SimpleImmutableEntry<String, String>>();
        for (int i2 = 0; i2 < stringArray.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry<String, String>(stringArray[i2], stringArray[i2 + 1]));
        }
        return new kpv(new ArrayList(this.m), n2, string, arrayList, bl2, string2, string3, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Object object = this.c;
        synchronized (object) {
            if (!this.m() && this.j) {
                this.g(2);
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
    @Override
    public final void b() {
        Object object = this.c;
        synchronized (object) {
            if (!this.b) {
                IllegalStateException illegalStateException = new IllegalStateException("No redirect to follow.");
                throw illegalStateException;
            }
            this.b = false;
            if (this.m()) {
                return;
            }
            N.Mhp54Oqs(this.a, this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(ByteBuffer object) {
        jjj.V((ByteBuffer)object);
        jjj.U((ByteBuffer)object);
        Object object2 = this.c;
        synchronized (object2) {
            if (!this.k) {
                object = new IllegalStateException("Unexpected read attempt.");
                throw object;
            }
            this.k = false;
            if (this.m()) {
                return;
            }
            if (N.MfCxA8r3(this.a, this, object, ((Buffer)object).position(), ((Buffer)object).limit())) {
                ++this.B;
                return;
            }
            this.k = true;
            object = new IllegalArgumentException("Unable to call native read");
            throw object;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 46[TRYBLOCK] [80 : 670->673)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(jjj object) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener((jjj)object);
        object = this.c;
        synchronized (object) {
            long l2 = this.a;
            if (l2 != 0L) {
                N.MgIIMpT9(l2, this, versionSafeCallbacks$UrlRequestStatusListener);
                return;
            }
        }
        this.p(new jhz(versionSafeCallbacks$UrlRequestStatusListener, 19));
    }

    public final void f() {
        if (!this.i) {
            CronetUrlRequestContext cronetUrlRequestContext = this.d;
            if (Thread.currentThread() == cronetUrlRequestContext.d) {
                throw new kor();
            }
        }
    }

    public final void g(int n2) {
        this.y = n2;
        if (this.a == 0L) {
            return;
        }
        this.d.j();
        long l2 = this.a;
        boolean bl2 = n2 == 2;
        N.M4znfYdB(l2, this, bl2);
        this.a = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        ksb ksb2 = new ksb(new jhz(this, 17, null));
        try {
            Object object = this.F;
            if (object == null) {
                return;
            }
            try {
                Object object2;
                Object object3;
                long l2;
                long l3;
                boolean bl2;
                int n2;
                Object object4;
                Object object5;
                kqx kqx2 = this.x;
                long l4 = this.d.e;
                object = this.h;
                if (object != null) {
                    object5 = ((kpv)object).c();
                    object4 = this.h;
                    object = ((kpv)object4).d;
                    n2 = ((kpv)object4).a;
                    bl2 = ((kpv)object4).c;
                } else {
                    object5 = Collections.emptyMap();
                    object = "";
                    bl2 = false;
                    n2 = 0;
                }
                long l5 = this.F.c;
                if (bl2 && l5 == 0L) {
                    l3 = 0L;
                    l2 = 0L;
                } else {
                    object4 = this.q;
                    if (object4 == null) {
                        l3 = 0L;
                    } else {
                        object4 = object4.iterator();
                        l2 = 0L;
                        while (true) {
                            l3 = l2;
                            if (!object4.hasNext()) break;
                            object3 = (Map.Entry)object4.next();
                            object2 = (String)object3.getKey();
                            l3 = l2;
                            if (object2 != null) {
                                l3 = l2 + (long)((String)object2).length();
                            }
                            l2 = l3;
                            if ((String)object3.getValue() == null) continue;
                            l2 = l3 + (long)((String)object3.getValue()).length();
                        }
                    }
                    l2 = Math.max(0L, l5 - l3);
                }
                long l6 = this.F.d;
                if (bl2 && l6 == 0L) {
                    l5 = 0L;
                    l6 = 0L;
                } else {
                    l5 = jjj.W((Map)object5);
                    l6 = Math.max(0L, l6 - l5);
                }
                object5 = this.F.b() != null && this.F.c() != null ? Duration.ofMillis(this.F.c().getTime() - this.F.b().getTime()) : Duration.ofSeconds(0L);
                object4 = this.F.b() != null && this.F.a() != null ? Duration.ofMillis(this.F.a().getTime() - this.F.b().getTime()) : Duration.ofSeconds(0L);
                bl2 = this.z;
                boolean bl3 = this.A;
                int n3 = jjj.X(this.y);
                int n4 = this.C;
                int n5 = this.B;
                object3 = this.f;
                int n6 = object3 == null ? 0 : ((CronetUploadDataStream)object3).f.get();
                object2 = new kqv(l3, l2, l5, l6, n2, (Duration)object5, (Duration)object4, (String)object, bl2, bl3, n3, n4, n5, n6, false, this.D);
                kqx2.d(l4, (kqv)object2);
            }
            catch (RuntimeException runtimeException) {
                Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Error while trying to log CronetTrafficInfo: ", (Throwable)runtimeException);
            }
            object = new kpo(this.n, null, this.F, this.y, this.h, this.g);
            this.d.m((kpo)object, ksb2);
            return;
        }
        finally {
            ksb2.a();
        }
    }

    public final void i(String string, Exception exception) {
        this.D = true;
        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)a.aj(string, "Exception in ", " method"), (Throwable)exception);
    }

    public final void j(Exception exception) {
        ++this.C;
        kqj kqj2 = new kqj("Exception received from UrlRequest.Callback", exception);
        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception in CalledByNative method", (Throwable)exception);
        this.o(kqj2);
    }

    final void k(Throwable throwable) {
        kqj kqj2 = new kqj("Exception received from UploadDataProvider", throwable);
        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception in upload method", (Throwable)throwable);
        this.o(kqj2);
    }

    public final void l() {
        N.MabZ5m6r(this.a, this);
    }

    public final boolean m() {
        return this.j && this.a == 0L;
    }
}

