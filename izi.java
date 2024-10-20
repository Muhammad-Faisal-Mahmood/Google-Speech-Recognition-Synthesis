/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.IBinder$DeathRecipient
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.os.TransactionTooLargeException
 */
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class izi
implements IBinder.DeathRecipient,
izv {
    public static final Logger e = Logger.getLogger(izi.class.getName());
    public static final itr f = new itr("internal:remote-uid");
    public static final itr g = new itr("internal:server-authority");
    public static final itr h = new itr("internal:inbound-parcelable-policy");
    private final jgp a;
    private final ivn b;
    private final izw c;
    private final LinkedHashSet d = new LinkedHashSet();
    public final ScheduledExecutorService i;
    protected final ConcurrentHashMap j;
    protected its k;
    public iyh l;
    public jad m;
    private final izp n;
    private final AtomicLong o;
    private long p;
    private int q = 1;

    public izi(jgp jgp2, its its2, ivn ivn2) {
        this.a = jgp2;
        this.k = its2;
        this.b = ivn2;
        this.i = (ScheduledExecutorService)jgp2.a();
        this.c = new izw(this);
        this.j = new ConcurrentHashMap();
        this.n = new izp();
        this.o = new AtomicLong();
    }

    private static iyh b(RemoteException remoteException) {
        if (!(remoteException instanceof DeadObjectException) && !(remoteException instanceof TransactionTooLargeException)) {
            return iyh.j.d(remoteException);
        }
        return iyh.k.d(remoteException);
    }

    /*
     * Exception decompiling
     */
    private final void e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK], 10[UNCONDITIONALDOLOOP], 7[CATCHBLOCK]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    protected izu B(int n2) {
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(int var1_1, Parcel var2_2) {
        block53: {
            var5_8 = false;
            if (var1_1 >= 1001) ** GOTO lbl-1000
            if (var1_1 == 1) ** GOTO lbl54
            if (var1_1 == 2) ** GOTO lbl52
            if (var1_1 == 3) ** GOTO lbl31
            if (var1_1 != 4) {
                if (var1_1 != 5) {
                    // MONITOREXIT : this
                    return var5_8;
                }
                this.g((Parcel)var2_2);
                return true;
            }
            var3_9 = var2_2.readInt();
            var4_11 = this.q;
            if (var4_11 != 3) break block53;
            var8_12 = jah.c();
            var8_12.a().writeInt(var3_9);
            this.m.a(5, var8_12);
            var8_12.close();
            return true;
            catch (Throwable var2_3) {
                try {
                    var8_12.close();
                    throw var2_3;
                }
                catch (Throwable var8_13) {
                    var2_3.addSuppressed(var8_13);
                    throw var2_3;
lbl31:
                    // 1 sources

                    var6_17 = var2_2.readLong();
                    if (!this.n.a(var6_17)) return true;
                    izi.e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(this.toString()));
                    this.d.addAll(this.j.keySet());
                    var8_14 = this.d.iterator();
                    while (this.v() && var8_14.hasNext()) {
                        var2_2 = (izu)this.j.get(var8_14.next());
                        var8_14.remove();
                        if (var2_2 == null) continue;
                        // MONITORENTER : var2_2
                        var9_19 = var2_2.e;
                        var10_22 = var2_2.g;
                        // MONITOREXIT : var2_2
                        if (var10_22 != null) {
                            var10_22.e();
                        }
                        if (var9_19 == null) continue;
                        var9_19.g();
                        // MONITOREXIT : var9_19
                    }
                    return true;
lbl52:
                    // 1 sources

                    this.t(iyh.k.e("transport shutdown by peer"), true);
                    return true;
lbl54:
                    // 1 sources

                    this.h((Parcel)var2_2);
                    return true;
lbl-1000:
                    // 1 sources

                    {
                        var3_10 = var2_2.dataSize();
                        var8_15 = this.j;
                        var10_23 = var1_1;
                        var9_21 = var8_15 = (izu)var8_15.get(var10_23);
                        if (var8_15 != null) ** GOTO lbl-1000
                        // MONITORENTER : this
                    }
                    if (!this.w()) {
                        var8_15 = var9_21 = this.B(var1_1);
                        if (var9_21 != null) {
                            var8_15 = (izu)this.j.put(var10_23, var9_21);
                            var5_8 = var8_15 == null;
                            fvd.an(var5_8, "impossible appearance of %s", var8_15);
                            var8_15 = var9_21;
                        }
                    }
                    // MONITOREXIT : this
                    var9_21 = var8_15;
lbl-1000:
                    // 2 sources

                    {
                        if (var9_21 != null) {
                            var9_21.k((Parcel)var2_2);
                        }
                        if (this.o.addAndGet(var3_10) - this.p <= 16384L) return true;
                        // MONITORENTER : this
                    }
                    var2_2 = this.m;
                    fxf.K(var2_2);
                    this.p = var6_18 = this.o.get();
                    var8_15 = jah.c();
                    var8_15.a().writeLong(var6_18);
                    var2_2.a(3, (jah)var8_15);
                    var8_15.close();
                    return true;
                    catch (Throwable var2_4) {
                        try {
                            var8_15.close();
                            throw var2_4;
                        }
                        catch (Throwable var8_16) {
                            try {
                                var2_4.addSuppressed(var8_16);
                                throw var2_4;
                            }
                            catch (RemoteException var2_5) {
                                this.t(izi.b(var2_5), true);
                            }
                        }
                    }
                    // MONITOREXIT : this
                    return true;
                    catch (RemoteException var2_7) {}
                }
            }
        }
        // MONITOREXIT : this
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void binderDied() {
        synchronized (this) {
            this.t(iyh.k.e("binderDied"), true);
            return;
        }
    }

    public final ivn c() {
        return this.b;
    }

    protected void g(Parcel parcel) {
    }

    protected void h(Parcel parcel) {
    }

    public abstract void i(iyh var1);

    public abstract void j();

    public void n() {
        this.a.b(this.i);
    }

    protected void q(izu izu2) {
        this.u(izu2.d);
    }

    /*
     * Exception decompiling
     */
    final void r(jad var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    final void s(int n2, jah jah2) {
        int n3 = jah2.a().dataSize();
        try {
            this.m.a(n2, jah2);
            if (this.n.b(n3)) {
                e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(this.toString()));
            }
            return;
        }
        catch (RemoteException remoteException) {
            throw new iyi(izi.b(remoteException));
        }
    }

    public final void t(iyh iyh2, boolean bl2) {
        if (!this.w()) {
            this.l = iyh2;
            this.y(4);
            this.i(iyh2);
        }
        if (!this.z(5) && (bl2 || this.j.isEmpty())) {
            this.c.a = null;
            this.y(5);
            this.e();
            ArrayList arrayList = new ArrayList(this.j.values());
            this.j.clear();
            this.i.execute(new hst(this, arrayList, iyh2, 8));
        }
    }

    final void u(int n2) {
        if (this.j.remove(n2) != null && this.j.isEmpty()) {
            this.i.execute(new iuk(this, 3, null));
        }
    }

    final boolean v() {
        return !this.n.a;
    }

    final boolean w() {
        return this.z(4) || this.z(5);
        {
        }
    }

    protected final boolean x(jad jad2) {
        this.m = jad2;
        try {
            jad2.b.linkToDeath((IBinder.DeathRecipient)this, 0);
            return true;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }

    public final void y(int n2) {
        block11: {
            boolean bl2;
            int n3;
            block8: {
                block15: {
                    block14: {
                        boolean bl3;
                        block9: {
                            block13: {
                                block12: {
                                    boolean bl4;
                                    block10: {
                                        n3 = this.q;
                                        int n4 = n2 - 1;
                                        bl4 = false;
                                        bl3 = false;
                                        bl2 = false;
                                        boolean bl5 = false;
                                        if (n4 == 1) break block8;
                                        if (n4 == 2) break block9;
                                        if (n4 == 3) break block10;
                                        bl2 = bl5;
                                        if (n3 == 4) {
                                            bl2 = true;
                                        }
                                        fxf.A(bl2);
                                        break block11;
                                    }
                                    if (n3 == 1 || n3 == 2) break block12;
                                    bl2 = bl4;
                                    if (n3 != 3) break block13;
                                }
                                bl2 = true;
                            }
                            fxf.A(bl2);
                            break block11;
                        }
                        if (n3 == 1) break block14;
                        bl2 = bl3;
                        if (n3 != 2) break block15;
                    }
                    bl2 = true;
                }
                fxf.A(bl2);
                break block11;
            }
            if (n3 == 1) {
                bl2 = true;
            }
            fxf.A(bl2);
        }
        this.q = n2;
    }

    public final boolean z(int n2) {
        return this.q == n2;
    }
}

