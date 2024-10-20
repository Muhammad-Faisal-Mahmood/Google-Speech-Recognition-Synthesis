/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class cni
implements cnj {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber");
    private static final hav d = hav.r(idq.e, idq.h, idq.k, idq.f);
    private static final hav e = hav.p(idq.c, idq.j);
    public Optional b = Optional.empty();
    Optional c;
    private final Context f;
    private final hpq g;
    private Optional h = Optional.empty();
    private final Optional i;
    private final Optional j;
    private int k = 1;

    public cni(Context context, hpq hpq2) {
        this.c = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.g = hpq2;
        this.f = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hpn b(bqe object) {
        synchronized (cni.class) {
            Object object2 = ((bqe)object).a;
            if (((AbstractCollection)object2).isEmpty()) {
                object = new cnn("No results returned from the service.");
                return hhk.J((Throwable)object);
            }
            object = iej.a.l();
            object2 = ((bqc)object2.get((int)0)).a;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            iej iej2 = (iej)((hwp)object).b;
            iej2.b |= 1;
            iej2.c = object2;
            return hhk.K((iej)((hwp)object).o());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn a(bpm object, gzx object2, idq object3) {
        synchronized (this) {
            Object object4 = Collection$_EL.stream((Collection)object2);
            boa boa2 = new boa(15);
            object4 = object4.filter(boa2).findFirst();
            if (((Optional)object4).isPresent()) {
                object2 = object4;
            } else {
                int n2 = e.contains(object3) ? 241 : (d.contains(object3) ? 238 : 222);
                object2 = Collection$_EL.stream((Collection)object2);
                object3 = new fbd(n2, 1);
                object2 = object2.filter(object3).findFirst();
            }
            this.c = object2;
            if (((Optional)object2).isEmpty()) {
                this.k = 4;
                object = new cnn("Speech recognition feature not found.");
                return hhk.J((Throwable)object);
            }
            object2 = this.j;
            object3 = new cnh(this, (bpm)object);
            object = ((Optional)object2).or(object3);
            this.h = object;
            this.k = 3;
            object = (bqf)((Optional)object).get();
            object3 = ((bpy)object).a();
            object2 = new bps(object, 2);
            hno.g((hpn)object3, (hny)object2, ((bpy)object).d);
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "getSpeechRecognitionService", 252, "AiCoreTranscriber.java")).u("Successfully connected to the SpeechRecognitionService with feature: %s", ((bpq)this.c.get()).a);
            return hpj.a;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final hpn c(iei var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 15[TRYBLOCK] [26 : 570->572)] java.lang.Throwable
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
    public final hpn d(idq object) {
        synchronized (this) {
            Object object2;
            Object object3;
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "setUp", 108, "AiCoreTranscriber.java")).r("#setUp");
            int n2 = this.k;
            if (n2 != 1 && n2 != 5) {
                object = new cnn("AICore connection has already been attempted. Try calling tearDown before attempting another setUp.");
                return hhk.J((Throwable)object);
            }
            this.k = 2;
            this.i.isPresent();
            Object object4 = this.f;
            Object object5 = new cut(null);
            ((cut)object5).c = object4;
            ((cut)object5).c(bpn.a);
            object4 = Executors.newCachedThreadPool();
            if (object4 == null) {
                object = new NullPointerException("Null workerExecutor");
                throw object;
            }
            ((cut)object5).b = object4;
            ((cut)object5).a = (byte)3;
            ((cut)object5).c(this.g);
            if (((cut)object5).a == 3 && (object3 = ((cut)object5).c) != null && (object2 = ((cut)object5).b) != null && (object4 = ((cut)object5).d) != null) {
                object5 = new bpo((Context)object3, (ExecutorService)object2, (Executor)object4);
                object4 = new bqb((bpo)object5);
                object5 = Optional.of(object4);
                this.b = object5;
                object3 = ((Optional)object5).get();
                object4 = ((bqb)object3).b();
                object5 = new ain(4);
                object5 = grf.g(hno.f((hpn)object4, (gte)object5, ((bqb)object3).d));
                object4 = new bpu(this, object, 6);
                return ((grf)object5).i((hny)object4, this.g);
            }
            object = new StringBuilder();
            if (((cut)object5).c == null) {
                ((StringBuilder)object).append(" context");
            }
            if (((cut)object5).b == null) {
                ((StringBuilder)object).append(" workerExecutor");
            }
            if (((cut)object5).d == null) {
                ((StringBuilder)object).append(" callbackExecutor");
            }
            if ((1 & ((cut)object5).a) == 0) {
                ((StringBuilder)object).append(" bindImportantEnabled");
            }
            if ((2 & ((cut)object5).a) == 0) {
                ((StringBuilder)object).append(" bindWaivePriorityEnabled");
            }
            object5 = new IllegalStateException("Missing required properties:".concat(object.toString()));
            throw object5;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn e() {
        synchronized (this) {
            hei hei2 = a;
            ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "tearDown", 183, "AiCoreTranscriber.java")).r("#tearDown");
            if (!this.b.isPresent()) return hpj.a;
            ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "tearDown", 185, "AiCoreTranscriber.java")).r("Closing the AICore connection.");
            ((bqb)this.b.get()).c();
            this.b = Optional.empty();
            this.h = Optional.empty();
            this.k = 5;
            return hpj.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean f() {
        synchronized (this) {
            return this.b.isEmpty();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean g() {
        synchronized (this) {
            return this.b.isPresent();
        }
    }
}

