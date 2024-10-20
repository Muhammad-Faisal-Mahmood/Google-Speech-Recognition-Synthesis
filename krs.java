/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.util.Objects;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

public final class krs
extends kom {
    public static final String a = "krs";
    public final krq b;
    public final Executor c;
    public final String d;
    public final Map e;
    public final List f;
    public final AtomicInteger g;
    public final boolean h;
    public final String i;
    public ksi j;
    public Executor k;
    public volatile int l;
    public String m;
    public ReadableByteChannel n;
    public String o;
    public HttpURLConnection p;
    public final krg q;
    public final int r;
    public final kqx s;
    public final long t;
    public int u;
    public int v;
    public boolean w;
    public kpv x;
    public krk y;
    private final AtomicBoolean z;

    /*
     * Exception decompiling
     */
    public krs(krg var1_1, kps var2_2, Executor var3_3, Executor var4_4, String var5_5, String var6_6, boolean var7_7, boolean var8_8, int var9_9, boolean var10_10, int var11_11, String var12_12, ArrayList var13_13, kpq var14_14, Executor var15_15) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    @Override
    public final void a() {
        int n2 = this.g.getAndSet(8);
        if (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5) {
            return;
        }
        this.j();
        this.i();
        krq krq2 = this.b;
        Object object = this.x;
        krq2.d.f();
        object = new kot(krq2, object, 16);
        krq2.b.execute((Runnable)object);
    }

    @Override
    public final void b() {
        this.n(3, 1, new kra(this, 8));
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        jjj.U(byteBuffer);
        jjj.V(byteBuffer);
        this.n(4, 5, new kot((Object)this, (Object)new krn(this, byteBuffer), 14, null));
    }

    @Override
    public final void d() {
        this.l = 10;
        this.q.c.incrementAndGet();
        this.n(0, 1, new kra((Object)this, 5));
    }

    @Override
    public final void e(jjj object) {
        int n2 = this.g.get();
        int n3 = this.l;
        switch (n2) {
            default: {
                throw new IllegalStateException(a.af(n2, "Switch is exhaustive: "));
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                n3 = 0;
                break;
            }
            case 0: 
            case 6: 
            case 7: 
            case 8: {
                n3 = -1;
            }
            case 1: 
        }
        krq krq2 = this.b;
        object = new cdw((Object)new VersionSafeCallbacks$UrlRequestStatusListener((jjj)object), n3, 15, null);
        krq2.b.execute((Runnable)object);
    }

    public final void f() {
        kra kra2 = new kra((Object)this, 6);
        this.c.execute(kra2);
    }

    public final void g(kod object) {
        int n2;
        while ((n2 = this.g.get()) != 0) {
            block4: {
                if (n2 != 6 && n2 != 7 && n2 != 8) {
                    if (!this.g.compareAndSet(n2, 6)) continue;
                    this.j();
                    this.i();
                    Object object2 = this.b;
                    kpv kpv2 = this.x;
                    ((krq)object2).d.f();
                    object = new hst((krq)object2, kpv2, (kod)object, 15);
                    try {
                        ((krq)object2).b.execute((Runnable)object);
                        return;
                    }
                    catch (kor kor2) {
                        object2 = ((krq)object2).c;
                        if (object2 == null) break block4;
                        object2.execute((Runnable)object);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Can't enter error state before start");
    }

    public final void h(Throwable throwable) {
        this.g(new kqj("Exception received from UploadDataProvider", throwable));
    }

    public final void i() {
        if (this.j != null && this.z.compareAndSet(false, true)) {
            try {
                Executor executor = this.k;
                Objects.requireNonNull(this.j);
                kro kro2 = new kro();
                kot kot2 = new kot((Object)this, (Object)kro2, 12, null);
                executor.execute(kot2);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                Log.e((String)a, (String)"Exception when closing uploadDataProvider", (Throwable)rejectedExecutionException);
            }
        }
    }

    public final void j() {
        kra kra2 = new kra((Object)this, 4);
        this.c.execute(kra2);
    }

    public final void k() {
        this.l = 13;
        kot kot2 = new kot((Object)this, (Object)new kri(this, 3), 11, null);
        this.c.execute(kot2);
    }

    public final void l() {
        kot kot2 = new kot((Object)this, (Object)new kri(this, 2), 11, null);
        this.c.execute(kot2);
    }

    public final void m(String string, Exception exception) {
        Log.e((String)a, (String)a.aj(string, "Exception in ", " method"), (Throwable)exception);
        this.w = true;
    }

    public final void n(int n2, int n3, Runnable runnable) {
        if (!this.g.compareAndSet(n2, n3)) {
            n3 = this.g.get();
            if (n3 != 8 && n3 != 6) {
                throw new IllegalStateException(a.an(n3, n2, "Invalid state transition - expected ", " but was "));
            }
            return;
        }
        runnable.run();
    }
}

