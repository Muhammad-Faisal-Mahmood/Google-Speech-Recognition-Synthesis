/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 */
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ahs
extends agl
implements ahg {
    public final afn b;
    public kpt c;
    ahr d;
    public agt e;
    public kpv f;
    public IOException g;
    public boolean h;
    private final koc i;
    private final Executor j;
    private final String k;
    private final gtq l;
    private boolean m;
    private long n;
    private ByteBuffer o;
    private volatile long p;
    private final awf q;
    private final awf r;

    static {
        aeg.b("media3.datasource.cronet");
    }

    protected ahs(koc koc2, Executor executor, String string, awf awf2, gtq gtq2) {
        super(true);
        this.i = koc2;
        abr.i(executor);
        this.j = executor;
        this.k = string;
        this.q = awf2;
        this.l = gtq2;
        this.r = new awf(null);
        this.b = new afn();
    }

    private static String k(Map object, String string) {
        if ((object = (List)object.get(string)) != null && !object.isEmpty()) {
            return (String)object.get(0);
        }
        return null;
    }

    private final ByteBuffer l() {
        if (this.o == null) {
            ByteBuffer byteBuffer;
            this.o = byteBuffer = ByteBuffer.allocateDirect(32768);
            byteBuffer.limit(0);
        }
        return this.o;
    }

    private final void m(ByteBuffer object, agt object2) {
        object2 = this.c;
        int n2 = agf.a;
        ((kpt)object2).c((ByteBuffer)object);
        try {
            if (!this.b.c(8000L)) {
                object2 = new SocketTimeoutException();
                throw object2;
            }
        }
        catch (SocketTimeoutException socketTimeoutException) {
            if (object == this.o) {
                this.o = null;
            }
            this.g = new ahd(socketTimeoutException, 2002, 2);
        }
        catch (InterruptedException interruptedException) {
            if (object == this.o) {
                this.o = null;
            }
            Thread.currentThread().interrupt();
            this.g = new InterruptedIOException();
        }
        object = this.g;
        if (object != null) {
            if (object instanceof ahd) {
                throw (ahd)object;
            }
            throw ahd.a((IOException)object, 2);
        }
    }

    private static void n(kpt kpt2) {
        afn afn2 = new afn();
        kpt2.e(new aho(new int[1], afn2));
        afn2.a();
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        Object object;
        Object object2;
        abr.f(this.m);
        if (n3 == 0) {
            return 0;
        }
        if (this.n == 0L) {
            return -1;
        }
        ByteBuffer byteBuffer = this.l();
        if (!byteBuffer.hasRemaining()) {
            this.b.f();
            byteBuffer.clear();
            object2 = this.e;
            int n4 = agf.a;
            this.m(byteBuffer, (agt)object2);
            if (this.h) {
                this.n = 0L;
                return -1;
            }
            byteBuffer.flip();
            abr.f(byteBuffer.hasRemaining());
        }
        Object object3 = object = this.n;
        if (object == -1L) {
            object3 = Long.MAX_VALUE;
        }
        Object object4 = byteBuffer.remaining();
        object = n3;
        object2 = new long[3];
        object2[0] = object3;
        object2[1] = object4;
        object2[2] = object;
        fxf.q(true);
        object = object2[0];
        for (n3 = 1; n3 < 3; ++n3) {
            object4 = object2[n3];
            object3 = object;
            if (object4 < object) {
                object3 = object4;
            }
            object = object3;
        }
        n3 = (int)object;
        byteBuffer.get(byArray, n2, n3);
        object3 = this.n;
        if (object3 != -1L) {
            this.n = object3 - (long)n3;
        }
        this.g(n3);
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(agt var1_1) {
        block34: {
            block36: {
                block35: {
                    abr.i(var1_1);
                    abr.f(this.m ^ true);
                    this.b.f();
                    this.p = SystemClock.elapsedRealtime() + 8000L;
                    this.e = var1_1;
                    try {
                        var11_6 = new ahr(this);
                        this.d = var11_6;
                        var13_7 = var1_1.a.toString();
                        var12_8 = this.j;
                        var11_6 = this.d;
                        var11_6 = this.i.f((String)var13_7, (kps)var11_6, (Executor)var12_8);
                        ((ksc)var11_6).d = 3;
                        ((ksc)var11_6).g = true;
                        var12_8 = new Object();
                        var12_8.putAll(this.q.h());
                        var12_8.putAll(this.r.h());
                        var12_8.putAll(var1_1.d);
                        for (Map.Entry var14_10 : var12_8.entrySet()) {
                            var13_7 = (String)var14_10.getKey();
                            var14_9 = (String)var14_10.getValue();
                            ((ksc)var11_6).aj((String)var13_7, var14_9);
                        }
                        var12_8 = var1_1.c;
                        var4_12 = var1_1.e;
                        var6_13 = var1_1.f;
                        var12_8 = ahh.c(var4_12);
                        if (var12_8 != null) {
                            ((ksc)var11_6).aj("Range", (String)var12_8);
                        }
                        if ((var12_8 = this.k) != null) {
                            ((ksc)var11_6).aj("User-Agent", (String)var12_8);
                        }
                        var12_8 = var1_1.a();
                        ((ksc)var11_6).ai((String)var12_8);
                        var12_8 = var1_1.c;
                        this.c = var11_6 = ((ksc)var11_6).ah();
                        var11_6.d();
                        this.j();
                    }
                    catch (IOException var1_5) {
                        if (var1_5 instanceof ahd == false) throw new ahq(var1_5, 2000);
                        throw (ahd)var1_5;
                    }
                    try {
                        var4_12 = SystemClock.elapsedRealtime();
                        var10_14 = false;
                        while (!var10_14 && var4_12 < this.p) {
                            var10_14 = this.b.c(this.p - var4_12 + 5L);
                            var4_12 = SystemClock.elapsedRealtime();
                        }
                        var12_8 = this.g;
                        if (var12_8 != null) {
                            var1_1 = var12_8.getMessage();
                            if (var1_1 != null && fxf.T((String)var1_1).contains("err_cleartext_not_permitted")) {
                                var1_1 = new ahc((IOException)var12_8);
                                throw var1_1;
                            }
                            ahs.n((kpt)var11_6);
                            var1_1 = new ahq((IOException)var12_8, 2001);
                            throw var1_1;
                        }
                        if (var10_14) {
                            var13_7 = this.f;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (InterruptedException var1_4) {
                        Thread.currentThread().interrupt();
                        throw new ahq(new InterruptedIOException(), 1004);
                    }
                    abr.i(var13_7);
                    var2_15 = var13_7.a;
                    var11_6 = var13_7.c();
                    if (var2_15 < 200 || var2_15 > 299) break block34;
                    var14_11 = this.l;
                    if (var14_11 != null && (var12_8 = ahs.k((Map)var11_6, "Content-Type")) != null) {
                        if (var14_11.a(var12_8) == false) throw new ahe((String)var12_8);
                    }
                    if (var2_15 != 200) break block35;
                    var4_12 = var6_13 = var1_1.e;
                    if (var6_13 != 0L) break block36;
                }
                var4_12 = 0L;
            }
            var12_8 = var13_7.b().iterator();
            do {
                var10_14 = var12_8.hasNext();
                var6_13 = -1L;
                if (!var10_14) ** GOTO lbl-1000
            } while (!((String)(var13_7 = (Map.Entry)var12_8.next()).getKey()).equalsIgnoreCase("Content-Encoding"));
            if (!((String)var13_7.getValue()).equalsIgnoreCase("identity")) {
                var6_13 = var1_1.f;
                this.n = -1L;
            } else lbl-1000:
            // 2 sources

            {
                var8_16 = var1_1.f;
                var8_16 = ahh.a(ahs.k((Map)var11_6, "Content-Length"), ahs.k((Map)var11_6, "Content-Range"));
                if (var8_16 != -1L) {
                    var6_13 = var8_16 - var4_12;
                }
                this.n = var6_13;
            }
            this.m = true;
            this.i((agt)var1_1);
            if (var4_12 == 0L) {
                return this.n;
            }
            var11_6 = this.l();
            while (var4_12 > 0L) {
                try {
                    this.b.f();
                    var11_6.clear();
                    this.m((ByteBuffer)var11_6, (agt)var1_1);
                    if (Thread.currentThread().isInterrupted()) ** GOTO lbl126
                    if (!this.h) {
                        var11_6.flip();
                        abr.f(var11_6.hasRemaining());
                        var2_15 = (int)Math.min((long)var11_6.remaining(), var4_12);
                        var11_6.position(var11_6.position() + var2_15);
                    }
                    ** GOTO lbl-1000
                }
                catch (IOException var1_2) {
                    if (var1_2 instanceof ahd != false) throw (ahd)var1_2;
                    if (!(var1_2 instanceof SocketTimeoutException)) {
                        var2_15 = 2001;
                        throw new ahq(var1_2, var2_15);
                    }
                    var2_15 = 2002;
                    throw new ahq(var1_2, var2_15);
                }
                var4_12 -= (long)var2_15;
            }
            return this.n;
lbl-1000:
            // 1 sources

            {
                var1_1 = new ahq();
                throw var1_1;
lbl126:
                // 1 sources

                var1_1 = new InterruptedIOException();
                throw var1_1;
            }
        }
        if (var2_15 == 416 && var1_1.e == (var4_12 = ahh.b(ahs.k((Map)var11_6, "Content-Range")))) {
            this.m = true;
            this.i((agt)var1_1);
            var4_12 = var1_1.f;
            return 0L;
        }
        try {
            var1_1 = agf.f;
            var11_6 = this.l();
            while (!this.h) {
                this.b.f();
                var11_6.clear();
                this.m((ByteBuffer)var11_6, this.e);
                var11_6.flip();
                if (var11_6.remaining() <= 0) continue;
                var3_17 = ((Object)var1_1).length;
                var1_1 = Arrays.copyOf((byte[])var1_1, var11_6.remaining() + var3_17);
                var11_6.get((byte[])var1_1, var3_17, var11_6.remaining());
            }
        }
        catch (IOException var1_3) {
            var3_18 = agf.a;
        }
        if (var2_15 == 416) {
            var1_1 = new ags(2008);
            throw new ahf(var2_15, (IOException)var1_1);
        }
        var1_1 = null;
        throw new ahf(var2_15, (IOException)var1_1);
lbl-1000:
        // 1 sources

        {
            var1_1 = new SocketTimeoutException();
            ahs.n((kpt)var11_6);
            var12_8 = new Object((IOException)var1_1, 2002);
            throw var12_8;
        }
    }

    @Override
    public final Uri c() {
        kpv kpv2 = this.f;
        if (kpv2 == null) {
            return null;
        }
        return Uri.parse((String)kpv2.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        synchronized (this) {
            Object object = this.c;
            if (object != null) {
                ((kpt)object).a();
                this.c = null;
            }
            if ((object = this.d) != null) {
                ((ahr)object).a = true;
                this.d = null;
            }
            if ((object = this.o) != null) {
                ((ByteBuffer)object).limit(0);
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            if (this.m) {
                this.m = false;
                this.h();
                return;
            }
            return;
        }
    }

    @Override
    public final Map e() {
        Object object = this.f;
        object = object == null ? Collections.emptyMap() : ((kpv)object).c();
        return object;
    }
}

