/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class kjl
implements Closeable {
    public static final kjx a;
    public final kiy b;
    public final Map c;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final khh h;
    public final khf i;
    public final khf j;
    public final khf k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final kjx q;
    public kjx r;
    public long s;
    public long t;
    public final kjt u;
    public final kjd v;
    public final Set w;
    private long x;
    private long y;
    private final Socket z;

    static {
        kjx kjx2 = new kjx();
        kjx2.g(7, 65535);
        kjx2.g(5, 16384);
        a = kjx2;
    }

    public kjl(kiw object) {
        this.b = ((kiw)object).f;
        this.c = new LinkedHashMap();
        Object object2 = ((kiw)object).c;
        Object var3_3 = null;
        Object object3 = object2;
        if (object2 == null) {
            jse.h("connectionName");
            object3 = null;
        }
        this.d = object3;
        this.f = 3;
        this.h = object3 = ((kiw)object).a;
        this.i = ((khh)object3).a();
        this.j = ((khh)object3).a();
        this.k = ((khh)object3).a();
        object3 = new kjx();
        ((kjx)object3).g(7, 0x1000000);
        this.q = object3;
        this.r = object3 = a;
        this.t = ((kjx)object3).c();
        object3 = object2 = ((kiw)object).b;
        if (object2 == null) {
            jse.h("socket");
            object3 = null;
        }
        this.z = object3;
        object3 = object2 = ((kiw)object).e;
        if (object2 == null) {
            jse.h("sink");
            object3 = null;
        }
        this.u = new kjt((kln)object3);
        object = ((kiw)object).d;
        if (object == null) {
            jse.h("source");
            object = var3_3;
        }
        this.v = new kjd(this, new kjo((klo)object));
        this.w = new LinkedHashSet();
    }

    public static final boolean n(int n2) {
        return (n2 & 1) == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kjs a(int n2) {
        synchronized (this) {
            return (kjs)this.c.get(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kjs b(int n2) {
        synchronized (this) {
            kjs kjs2 = (kjs)this.c.remove(n2);
            this.notifyAll();
            return kjs2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(kiq kjsArray, kiq kiq2, IOException iOException) {
        void var2_5;
        jse.e(kjsArray, "connectionCode");
        jse.e(var2_5, "streamCode");
        Object object = khb.a;
        try {
            this.f((kiq)kjsArray);
        }
        catch (IOException iOException2) {}
        boolean bl2 = this.c.isEmpty();
        int n2 = 0;
        if (!bl2) {
            kjsArray = this.c.values().toArray(new kjs[0]);
            this.c.clear();
        } else {
            kjsArray = null;
        }
        // MONITOREXIT : this
        if (kjsArray != null) {
            while (n2 < kjsArray.length) {
                object = kjsArray[n2];
                try {
                    void var3_6;
                    ((kjs)object).g((kiq)var2_5, (IOException)var3_6);
                }
                catch (IOException iOException3) {}
                ++n2;
            }
        }
        try {
            this.u.close();
        }
        catch (IOException iOException4) {}
        try {
            this.z.close();
        }
        catch (IOException iOException5) {}
        this.i.b();
        this.j.b();
        this.k.b();
    }

    @Override
    public final void close() {
        this.c(kiq.a, kiq.i, null);
    }

    public final void d(IOException iOException) {
        this.c(kiq.b, kiq.b, iOException);
    }

    public final void e() {
        this.u.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(kiq kiq2) {
        jse.e((Object)kiq2, "statusCode");
        kjt kjt2 = this.u;
        synchronized (kjt2) {
            Object object = new jsi();
            synchronized (this) {
                boolean bl2 = this.g;
                if (bl2) {
                    return;
                }
                this.g = true;
                ((jsi)object).a = this.e;
            }
            kjt kjt3 = this.u;
            int n2 = ((jsi)object).a;
            object = khb.a;
            kjt3.k(n2, kiq2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(long l2) {
        synchronized (this) {
            this.x = l2 = this.x + l2;
            if ((l2 -= this.y) >= (long)(this.q.c() / 2)) {
                this.l(0, l2);
                this.y += l2;
                return;
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void h(int var1_1, boolean var2_2, klm var3_3, long var4_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8 : 169->187)] java.lang.Throwable
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

    public final void i(boolean bl2, int n2, int n3) {
        try {
            this.u.g(bl2, n2, n3);
            return;
        }
        catch (IOException iOException) {
            this.d(iOException);
            return;
        }
    }

    public final void j(int n2, kiq kiq2) {
        jse.e((Object)kiq2, "statusCode");
        this.u.h(n2, kiq2);
    }

    public final void k(int n2, kiq object) {
        jse.e(object, "errorCode");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d);
        stringBuilder.append("[");
        stringBuilder.append(n2);
        stringBuilder.append("] writeSynReset");
        object = new kjj(stringBuilder.toString(), this, n2, (kiq)((Object)object));
        this.i.f((khd)object);
    }

    public final void l(int n2, long l2) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append("[");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append("] windowUpdate");
        object = new kjk(((StringBuilder)object).toString(), this, n2, l2);
        this.i.f((khd)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m(long l2) {
        synchronized (this) {
            long l3;
            boolean bl2 = this.g;
            if (bl2) {
                return false;
            }
            return this.n >= this.m || l2 < (l3 = this.p);
            {
            }
        }
    }
}

