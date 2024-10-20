/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package org.chromium.net.impl;

import J.N;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.impl.CronetUrlRequestContext;

public class CronetBidirectionalStream
extends koh {
    public long A;
    public int B;
    public int C;
    public kpv D;
    private final Executor E;
    private final Collection F;
    private kod G;
    private kqk H;
    public final CronetUrlRequestContext a;
    public final kse b;
    public final String c;
    public final int d;
    public final String e;
    public final String[] f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final int k;
    public final long l;
    public final kqx m;
    public ksb n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final Object s = new Object();
    public LinkedList t;
    public LinkedList u;
    public boolean v;
    public boolean w;
    public kpn x;
    public boolean y;
    public boolean z;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String stringArray, kny object3, Executor object2, String string, List list, boolean bl2, Collection collection, boolean bl3, int n2, boolean bl4, int n3, long l2) {
        int n4 = 0;
        this.B = 0;
        this.C = 0;
        this.a = cronetUrlRequestContext;
        this.c = stringArray;
        this.d = 4;
        this.b = new kse((kny)object3);
        this.E = object2;
        this.e = "POST";
        int n5 = list.size();
        stringArray = new String[n5 + n5];
        for (Object object3 : list) {
            stringArray[n4] = (String)object3.getKey();
            stringArray[n4 + 1] = (String)object3.getValue();
            n4 += 2;
        }
        this.f = stringArray;
        this.g = bl2;
        this.t = new LinkedList();
        this.u = new LinkedList();
        this.F = collection;
        this.h = bl3;
        this.i = n2;
        this.j = bl4;
        this.k = n3;
        this.l = l2;
        this.m = cronetUrlRequestContext.f;
    }

    public static boolean j(String string) {
        return true;
    }

    private static ArrayList l(String[] stringArray) {
        ArrayList<AbstractMap.SimpleImmutableEntry<String, String>> arrayList = new ArrayList<AbstractMap.SimpleImmutableEntry<String, String>>(stringArray.length >> 1);
        for (int i2 = 0; i2 < stringArray.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry<String, String>(stringArray[i2], stringArray[i2 + 1]));
        }
        return arrayList;
    }

    private final void m(kod kod2) {
        this.n(new kot((Object)this, (Object)kod2, 5, null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void n(Runnable runnable) {
        try {
            this.E.execute(runnable);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception posting task to executor", (Throwable)rejectedExecutionException);
            Object object = this.s;
            synchronized (object) {
                this.C = 6;
                this.B = 6;
                this.d(false);
                return;
            }
        }
    }

    private void onCanceled() {
        this.n(new jhz(this, 13));
    }

    private void onError(int n2, int n3, int n4, int n5, String string, long l2) {
        kpv kpv2 = this.D;
        if (kpv2 != null) {
            kpv2.d(l2);
        }
        if (n2 != 10 && n2 != 3) {
            this.m(new kqi("Exception in BidirectionalStream: ".concat(String.valueOf(string)), n2, n3));
            return;
        }
        this.m(new ksa("Exception in BidirectionalStream: ".concat(String.valueOf(string)), n2, n3, n4, n5));
    }

    private void onMetricsCollected(long l2, long l3, long l4, long l5, long l6, long l7, long l8, long l9, long l10, long l11, long l12, long l13, long l14, boolean bl2, long l15, long l16, boolean bl3, boolean bl4) {
        try {
            if (this.x == null) {
                Object object = new kpn(l2, l13, l14, l15, l16);
                this.x = object;
                this.y = bl3;
                this.z = bl4;
                object = new kpo(this.c, this.F, this.x, this.c(), this.D, this.G);
                this.a.m((kpo)object, this.n);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Metrics collection should only happen once.");
            throw illegalStateException;
        }
        finally {
            this.n.a();
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int n2, int n3, int n4, long l2) {
        this.D.d(l2);
        if (byteBuffer.position() == n3 && byteBuffer.limit() == n4) {
            if (n2 >= 0 && (n3 += n2) <= n4) {
                Object object = (ByteBuffer)byteBuffer.position(n3);
                object = this.H;
                ((kqk)object).a = byteBuffer;
                boolean bl2 = n2 == 0;
                ((kqk)object).b = bl2;
                this.n((Runnable)object);
                return;
            }
            this.m(new kqp("Invalid number of bytes read", null));
            return;
        }
        this.m(new kqp("ByteBuffer modified externally during read", null));
    }

    private void onResponseHeadersReceived(int n2, String string, String[] stringArray, long l2) {
        try {
            kpv kpv2;
            this.D = kpv2 = new kpv(Arrays.asList(this.c), n2, "", CronetBidirectionalStream.l(stringArray), false, string, null, l2);
            this.n(new jhz(this, 12));
            return;
        }
        catch (Exception exception) {
            this.m(new kqp("Cannot prepare ResponseInfo", null));
            return;
        }
    }

    private void onResponseTrailersReceived(String[] stringArray) {
        this.n(new kot((Object)this, (Object)new kpu(CronetBidirectionalStream.l(stringArray)), 4, null));
    }

    private void onStreamReady(boolean bl2) {
        this.n(new jdj(this, bl2, 2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onWritevCompleted(ByteBuffer[] byteBufferArray, int[] nArray, int[] nArray2, boolean bl2) {
        int n2;
        Object object = this.s;
        synchronized (object) {
            if (this.k()) {
                return;
            }
            this.C = 8;
            if (!this.u.isEmpty()) {
                this.i();
            }
        }
        for (int i2 = 0; i2 < (n2 = byteBufferArray.length); ++i2) {
            ByteBuffer byteBuffer = byteBufferArray[i2];
            if (byteBuffer.position() == nArray[i2] && byteBuffer.limit() == nArray2[i2]) {
                object = (ByteBuffer)byteBuffer.position(byteBuffer.limit());
                boolean bl3 = bl2 && i2 == n2 - 1;
                this.n(new kql(this, byteBuffer, bl3));
                continue;
            }
            this.m(new kqp("ByteBuffer modified externally during write", null));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Object object = this.s;
        synchronized (object) {
            if (!this.k() && this.B != 0) {
                this.C = 5;
                this.B = 5;
                this.d(true);
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
    public final void b(ByteBuffer object) {
        Object object2 = this.s;
        synchronized (object2) {
            jjj.V((ByteBuffer)object);
            jjj.U((ByteBuffer)object);
            if (this.B != 2) {
                object = new IllegalStateException("Unexpected read attempt.");
                throw object;
            }
            if (this.k()) {
                return;
            }
            if (this.H == null) {
                kqk kqk2;
                this.H = kqk2 = new kqk(this);
            }
            this.B = 3;
            if (N.Md_rPmgC(this.A, this, object, ((Buffer)object).position(), ((Buffer)object).limit())) {
                ++this.p;
                return;
            }
            this.B = 2;
            object = new IllegalArgumentException("Unable to call native read");
            throw object;
        }
    }

    public final int c() {
        int n2 = this.B;
        int n3 = this.C;
        if (n2 == n3) {
            if (n2 != 5) {
                if (n2 != 6) {
                    if (n2 == 7) {
                        return 0;
                    }
                    throw new IllegalStateException(a.ah(n2, "Cronet bidirectional stream read state is ", " which is not a valid finished state!"));
                }
                return 1;
            }
            return 2;
        }
        StringBuilder stringBuilder = new StringBuilder("Cronet bidirectional stream read state is ");
        stringBuilder.append(n2);
        stringBuilder.append(" which is different from write state ");
        stringBuilder.append(n3);
        stringBuilder.append("!");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void d(boolean bl2) {
        String string = CronetUrlRequestContext.a;
        String string2 = String.valueOf(this.toString());
        Log.i((String)"cr_".concat(String.valueOf(string)), (String)"destroyNativeStreamLocked ".concat(string2));
        long l2 = this.A;
        if (l2 == 0L) {
            return;
        }
        N.MS2l1kNx(l2, this, bl2);
        if (this.B != 0) {
            this.a.j();
        }
        this.A = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(kod kod2) {
        this.G = kod2;
        Object object = this.s;
        synchronized (object) {
            if (this.k()) {
                return;
            }
            this.C = 6;
            this.B = 6;
            this.d(false);
        }
        try {
            this.b.b(this, this.D, kod2);
        }
        catch (Exception exception) {
            this.g("onFailed", exception);
        }
        this.n.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        Object object = this.s;
        synchronized (object) {
            if (this.k()) {
                return;
            }
            if (this.C == 10 && this.B == 4) {
                this.C = 7;
                this.B = 7;
                this.d(false);
                // MONITOREXIT @DISABLED, blocks:[3, 6] lbl10 : MonitorExitStatement: MONITOREXIT : var2_1
                try {
                    this.b.g(this, this.D);
                }
                catch (Exception exception) {
                    this.g("onSucceeded", exception);
                }
                this.n.a();
                return;
            }
            return;
        }
    }

    public final void g(String string, Exception exception) {
        this.r = true;
        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)a.aj(string, "Exception in ", " method"), (Throwable)exception);
    }

    public final void h(Exception exception) {
        ++this.o;
        kqj kqj2 = new kqj("CalledByNative method has thrown an exception", exception);
        Log.e((String)"cr_".concat(String.valueOf(CronetUrlRequestContext.a)), (String)"Exception in CalledByNative method", (Throwable)exception);
        this.e(kqj2);
    }

    public final void i() {
        int n2 = this.u.size();
        ByteBuffer[] byteBufferArray = new ByteBuffer[n2];
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            ByteBuffer byteBuffer;
            byteBufferArray[i2] = byteBuffer = (ByteBuffer)this.u.poll();
            nArray[i2] = byteBuffer.position();
            nArray2[i2] = byteBuffer.limit();
        }
        this.C = 9;
        this.w = true;
        long l2 = this.A;
        boolean bl2 = this.v && this.t.isEmpty();
        if (N.MwJCBTMQ(l2, this, byteBufferArray, nArray, nArray2, bl2)) {
            return;
        }
        this.C = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    public final boolean k() {
        return this.B != 0 && this.A == 0L;
    }
}

