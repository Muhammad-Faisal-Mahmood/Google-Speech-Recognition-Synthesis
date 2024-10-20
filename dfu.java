/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  hom
 */
import android.content.ContentValues;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class dfu {
    static final gtq a = new agx(4);
    public static final int i = 0;
    public final Object b = new Object();
    public final Map c = new HashMap();
    public final dfa d;
    public final dda e;
    public final dcj f;
    public final cxv g;
    public final cxu h;
    private final File j;
    private final Map k = new HashMap();

    static {
        TimeUnit.DAYS.toMillis(2L);
    }

    public dfu(File file, dfa dfa2, dda dda2, dcj dcj2) {
        this.e = dda2;
        this.j = file;
        this.d = dfa2;
        this.f = dcj2;
        this.g = new cxv((Executor)hom.a);
        this.h = new cxu(new AmbientMode$AmbientController(this));
    }

    private static String q(dgd dgd2) {
        gtn gtn2 = new gtn("");
        gtn2.f("reserved all", dgd2.a());
        gtn2.f("reserved ns", dgd2.b());
        gtn2.f("used all", dgd2.c());
        gtn2.f("used ns", dgd2.d());
        gtn2.f("cum. used", dgd2.h);
        gtn2.f("cum. deleted", dgd2.i);
        return gtn2.toString();
    }

    public final int a(ddn ddn2) {
        return Math.max(0, ((det)this.d.a((ddn)ddn2)).g);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dcv b(String object) {
        Object object2 = this.b;
        synchronized (object2) {
            dcv dcv2 = (dcv)this.k.get(object);
            object = dcv2;
            if (dcv2 != null) return object;
            return dcv.a;
        }
    }

    public final ded c(ddn ddn2) {
        return ((det)this.d.a((ddn)ddn2)).a;
    }

    public final dgc d(String string) {
        dgc dgc2 = (dgc)this.c.get(string);
        if (dgc2 != null) {
            return dgc2;
        }
        throw new IllegalArgumentException("Namespace is not registered: ".concat(string));
    }

    public final File e(ddn comparable) {
        File file = this.f((ddn)comparable);
        comparable = file.getParentFile();
        fxf.K(comparable);
        ((File)comparable).mkdirs();
        if (((File)comparable).exists() && ((File)comparable).isDirectory()) {
            return file;
        }
        throw new IOException("Failed to make directories for path: ".concat(comparable.toString()));
    }

    public final File f(ddn ddn2) {
        return new File(this.g(ddn2.b()), ddn2.a());
    }

    public final File g(String string) {
        return new File(this.j, string);
    }

    public final String h(ddn ddn2) {
        return ((det)this.d.a((ddn)ddn2)).f;
    }

    public final String i(ddn ddn2) {
        try {
            String string = this.h(ddn2);
            return string;
        }
        catch (IOException iOException) {
            ((hfk)((hfk)((hfk)ddd.a.h()).i(iOException)).j("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSourceOrLog", 485, "FileManager.java")).u("Failed to get source for %s", ddn2.e());
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(ddn ddn2, boolean bl2, dhu dhu2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/gc/FileManager", "release", 543, "FileManager.java")).D("Releasing file %s, delete: %b", ddn2, bl2);
        File file = this.f(ddn2);
        Object object = this.b;
        // MONITORENTER : object
        if (bl2) {
            if (!this.h.f(file)) {
                this.o(ddn2, dhu2, true);
                return;
            }
            ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/gc/FileManager", "release", 551, "FileManager.java")).u("Released file %s is referenced, postponing deletion", ddn2);
        }
        if (file.exists()) {
            this.d.c(ddn2, 0);
            return;
        }
        this.d.b(ddn2);
        // MONITOREXIT : object
    }

    /*
     * Exception decompiling
     */
    public final void k(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 152[MONITOR]
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

    public final void l(ddn ddn2, String string) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("source", string);
        ((dfl)this.d).d(ddn2, contentValues);
    }

    public final void m(ddn ddn2, ded ded2) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("superpack_name", ded2.b());
        contentValues.put("superpack_version", Integer.valueOf(ded2.a()));
        ((dfl)this.d).d(ddn2, contentValues);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean n(String object) {
        Object object2 = this.b;
        synchronized (object2) {
            boolean bl2;
            object = (dgc)this.c.get(object);
            boolean bl3 = bl2 = false;
            if (object == null) return bl3;
            bl3 = bl2;
            if (!((dgc)object).c) return bl3;
            return true;
        }
    }

    public final void o(ddn ddn2, dhu dhu2, boolean bl2) {
        File file = new File(this.g(ddn2.b()), ddn2.a());
        if (this.h.f(file)) {
            ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/gc/FileManager", "deleteFile", 835, "FileManager.java")).u("Deleting referenced file %s!", dec.g(ddn2.b(), dec.e(file)));
        }
        if (file.exists() && this.e.b(ddn2.b(), file, dhu2)) {
            this.g.a(new dcg(this, ddn2, dhu2, 2));
        }
        if (bl2) {
            this.d.b(ddn2);
        }
    }

    public final void p(ddn ddn2) {
        this.j(ddn2, false, dhu.i);
    }
}

