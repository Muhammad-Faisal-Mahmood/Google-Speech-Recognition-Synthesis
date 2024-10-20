/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.Process
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class gby
extends ach {
    public final Executor a;
    public final gbt b = new gbt("FuturesMixinRF");
    public final Set c;
    public final int d;
    public boolean e = false;
    private final Context f;

    public gby(abw abw2, Context object, Executor object2) {
        this.a = object2;
        this.f = object;
        this.d = Process.myPid();
        Bundle bundle = (Bundle)abw2.a("future_saved_state");
        if (bundle != null) {
            int n2 = bundle.getInt("last_process_id");
            object = Build.VERSION.SDK_INT >= 30 && (object2 = (ActivityManager)object.getSystemService("activity")) != null && !(object = sk$$ExternalSyntheticApiModelOutline1.m((ActivityManager)object2, object.getPackageName(), n2, 1)).isEmpty() ? gto.i(sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m(object.get(0)))) : gsl.a;
            Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            n2 = parcelableArray.length;
            this.c = new HashSet(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3;
                gca gca2 = (gca)parcelableArray[i2];
                if (gca2.c.g() && (n3 = ((Integer)gca2.c.c()).intValue()) != 1) {
                    if (n3 == 2) {
                        object2 = new StringBuilder("ParcelableFuture was Parceled by a lifecycle change before it completed.");
                        if (((gto)object).g()) {
                            ((StringBuilder)object2).append(" process exit reason code: ");
                            ((StringBuilder)object2).append(((gto)object).c());
                        }
                        object2 = new gcb(((StringBuilder)object2).toString());
                    } else {
                        object2 = new IllegalStateException(a.af(n3, "ParcelableFuture read in unexpected value for hasResult: "));
                    }
                    gca2.b((Throwable)object2);
                }
                this.c.add(gca2);
            }
        } else {
            this.c = new HashSet(1);
        }
        this.b.d(bundle);
        abw2.b("future_saved_state", new bo(this, 7));
    }

    /*
     * Exception decompiling
     */
    public static void a(gbv var0, gca var1_3) {
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

    public final void b(gbv gbv2) {
        this.b.c(gbv2);
    }
}

