/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class gem {
    public final gbr a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference<Object>(null);
    public gee d;
    public ged e;
    public gei f;
    public final dvy g;
    public final dvy h;
    public final cgw i;
    public AmbientModeSupport$AmbientController j;
    public final bmu k;

    public gem(gds object, cgw cgw2, bmu bmu2, gbr gbr2, Executor executor) {
        geg geg2 = gei.a;
        gsl gsl2 = gsl.a;
        this.f = new gei(0L, geg2, false, gsl2, gsl2);
        this.g = new dvy(2, new fiz(11));
        this.h = new dvy(1, new fiz(12));
        this.i = cgw2;
        this.k = bmu2;
        this.a = gbr2;
        this.e = object = new ged((gds)object, ((gds)object).b, new gdq(), 0L, 1, new gee((gds)object, Long.MIN_VALUE, new gdu(0L), new gdx(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.d = ((ged)object).d;
        this.b = executor;
    }

    public static void e(gdn gdn2) {
        gol gol2 = fxf.aq("BackgroundCallbacks.onBackgroundFetch");
        try {
            gdn2.a();
            return;
        }
        finally {
            gol2.close();
        }
    }

    public static void f(gdn gdn2) {
        gol gol2 = fxf.aq("BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            gdn2.b();
            return;
        }
        finally {
            gol2.close();
        }
    }

    /*
     * Exception decompiling
     */
    public static gei j(gei var0, ivu var1_3) {
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

    final void a() {
        Object object = this.j;
        if (object != null) {
            this.k.V(this.e.a, (AmbientModeSupport$AmbientController)object);
            this.j = null;
        }
        this.g.f();
        this.h.f();
        if (this.f.e.g()) {
            ((ivu)this.f.e.c()).j();
        }
        if (this.f.f.g()) {
            object = this.f;
            if (!((gei)object).f.equals(((gei)object).e)) {
                ((ivu)this.f.f.c()).j();
            }
        }
    }

    final void b() {
        Object object = this.f;
        long l2 = ((gei)object).b;
        object = ((gei)object).e;
        this.f = new gei(l2 + 1L, gei.a, false, (gto)object, gsl.a);
    }

    /*
     * Exception decompiling
     */
    public final void c(gee var1_1) {
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

    public final void d(gee object) {
        fpk.c();
        Object object2 = ((gee)object).c;
        boolean bl2 = ((gdx)object2).a != Long.MAX_VALUE;
        fxf.B(bl2, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        Object object3 = new gdx(((gdx)object2).a + 1L);
        object2 = ((gee)object).e;
        int n2 = ((gee)object).d;
        Object object4 = ((gee)object).b;
        long l2 = ((gee)object).a;
        object2 = new gee(((gee)object).f, l2, (gdu)object4, (gdx)object3, n2 + 1, (Instant)object2);
        object4 = ((gee)object2).c;
        object3 = ((gee)object2).f;
        object = fxf.aq("DataSource loadData()");
        try {
            Object object5 = ((gds)object3).a;
            hom hom2 = hom.a;
            object3 = new hod();
            Object object6 = new gqg(object5, object3, 2);
            object5 = new hqh((hnx)object6);
            hom2.execute((Runnable)object5);
            object6 = new hog((hpn)object5, (hod)object3);
            object3 = new gdr();
            object3 = ((hog)object6).a(gqk.f((hoe)object3), (Executor)hom.a);
            ((gol)object).a(((hog)object3).c());
            object4 = new ivu((hog)object3, (gdx)object4);
            this.h.i(object4);
            ((ivu)object4).i().c(gqk.i(new fbx(this, object2, object4, 9)), (Executor)hom.a);
            return;
        }
        finally {
            ((gol)object).close();
        }
    }

    /*
     * Exception decompiling
     */
    public final void g(Throwable var1_1) {
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

    public final boolean h() {
        if (this.f.c instanceof gdn && this.g.g() && this.h.g()) {
            fxf.A(this.f.d);
            return true;
        }
        return false;
    }

    public final void i(gee gee2, ivu ivu2) {
        fxf.A(ivu2.h().b());
        this.f = gem.j(this.f, ivu2);
        this.d = gee2;
    }
}

