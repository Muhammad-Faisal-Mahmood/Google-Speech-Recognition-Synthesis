/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientLifecycleObserverImpl;
import androidx.wear.ambient.AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class AmbientLifecycleObserverKt {
    public static AmbientLifecycleObserver AmbientLifecycleObserver(Activity activity, AmbientLifecycleObserver$AmbientLifecycleCallback ambientLifecycleObserver$AmbientLifecycleCallback) {
        jse.e(activity, "activity");
        jse.e(ambientLifecycleObserver$AmbientLifecycleCallback, "callbacks");
        jse.e(activity, "activity");
        jse.e(ambientLifecycleObserver$AmbientLifecycleCallback, "callback");
        return new AmbientLifecycleObserverImpl(activity, new AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0(), ambientLifecycleObserver$AmbientLifecycleCallback);
    }

    public static AmbientLifecycleObserver AmbientLifecycleObserver(Activity activity, Executor executor, AmbientLifecycleObserver$AmbientLifecycleCallback ambientLifecycleObserver$AmbientLifecycleCallback) {
        jse.e(activity, "activity");
        jse.e(executor, "callbackExecutor");
        jse.e(ambientLifecycleObserver$AmbientLifecycleCallback, "callbacks");
        return new AmbientLifecycleObserverImpl(activity, executor, ambientLifecycleObserver$AmbientLifecycleCallback);
    }

    public static Executor a(boolean bl2) {
        Object object = new ban(bl2);
        object = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), (ThreadFactory)object);
        jse.d(object, "newFixedThreadPool(\n    \u2026)),\n        factory\n    )");
        return object;
    }

    public static int b(bak bak2) {
        jse.e((Object)bak2, "backoffPolicy");
        int n2 = bak2.ordinal();
        if (n2 != 0) {
            if (n2 == 1) {
                return 1;
            }
            throw new joa();
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(bbj bbj2) {
        jse.e((Object)bbj2, "networkType");
        int n2 = bbj2.ordinal();
        if (n2 == 0) return 0;
        int n3 = 1;
        if (n2 == 1) return n3;
        n3 = 2;
        if (n2 == 2) return n3;
        n3 = 3;
        if (n2 == 3) return n3;
        n3 = 4;
        if (n2 == 4) return n3;
        if (Build.VERSION.SDK_INT < 30) throw new IllegalArgumentException(a.ak((Object)bbj2, "Could not convert ", " to int"));
        if (bbj2 != bbj.f) throw new IllegalArgumentException(a.ak((Object)bbj2, "Could not convert ", " to int"));
        return 5;
    }

    public static int d(bbr bbr2) {
        jse.e((Object)bbr2, "policy");
        int n2 = bbr2.ordinal();
        if (n2 != 0) {
            if (n2 == 1) {
                return 1;
            }
            throw new joa();
        }
        return 0;
    }

    public static int e(bbv bbv2) {
        jse.e((Object)bbv2, "state");
        int n2 = bbv2.ordinal();
        if (n2 != 0) {
            int n3 = 1;
            if (n2 != 1) {
                n3 = 2;
                if (n2 != 2) {
                    n3 = 3;
                    if (n2 != 3) {
                        n3 = 4;
                        if (n2 != 4) {
                            if (n2 == 5) {
                                return 5;
                            }
                            throw new joa();
                        }
                    }
                }
            }
            return n3;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bak f(int n2) {
        if (n2 == 0) return bak.a;
        if (n2 != 1) throw new IllegalArgumentException(a.ah(n2, "Could not convert ", " to BackoffPolicy"));
        return bak.b;
    }

    public static bbj g(int n2) {
        bbj bbj2;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && n2 == 5) {
                                return bbj.f;
                            }
                            throw new IllegalArgumentException(a.ah(n2, "Could not convert ", " to NetworkType"));
                        }
                        bbj2 = bbj.e;
                    } else {
                        bbj2 = bbj.d;
                    }
                } else {
                    bbj2 = bbj.c;
                }
            } else {
                bbj2 = bbj.b;
            }
        } else {
            bbj2 = bbj.a;
        }
        return bbj2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bbr h(int n2) {
        if (n2 == 0) return bbr.a;
        if (n2 != 1) throw new IllegalArgumentException(a.ah(n2, "Could not convert ", " to OutOfQuotaPolicy"));
        return bbr.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bbv i(int n2) {
        if (n2 == 0) return bbv.a;
        if (n2 == 1) return bbv.b;
        if (n2 == 2) return bbv.c;
        if (n2 == 3) return bbv.d;
        if (n2 == 4) return bbv.e;
        if (n2 != 5) throw new IllegalArgumentException(a.ah(n2, "Could not convert ", " to State"));
        return bbv.f;
    }

    /*
     * Exception decompiling
     */
    public static bid j(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set k(byte[] object) {
        Throwable throwable4222222;
        block14: {
            jse.e(object, "bytes");
            LinkedHashSet<bap> linkedHashSet = new LinkedHashSet<bap>();
            if (((byte[])object).length == 0) {
                return linkedHashSet;
            }
            object = new ByteArrayInputStream((byte[])object);
            ObjectInputStream objectInputStream = new ObjectInputStream((InputStream)object);
            int n2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < n2; ++i2) {
                Uri uri = Uri.parse((String)objectInputStream.readUTF());
                boolean bl2 = objectInputStream.readBoolean();
                jse.d(uri, "uri");
                bap bap2 = new bap(uri, bl2);
                linkedHashSet.add(bap2);
            }
            jsd.f(objectInputStream, null);
            catch (Throwable throwable2) {
                try {
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    try {
                        jsd.f(objectInputStream, throwable2);
                        throw throwable3;
                    }
                    catch (Throwable throwable4222222) {
                        break block14;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
            }
            jsd.f((Closeable)object, null);
            return linkedHashSet;
        }
        try {
            throw throwable4222222;
        }
        catch (Throwable throwable5) {
            jsd.f((Closeable)object, throwable4222222);
            throw throwable5;
        }
    }

    /*
     * Exception decompiling
     */
    public static byte[] l(bid var0) {
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

    /*
     * Exception decompiling
     */
    public static byte[] m(Set var0) {
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

    public static void n(bhx bhx2, String string, Set object) {
        jse.e(string, "id");
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            bxt bxt2 = new bxt((String)iterator.next(), string);
            object = (bia)bhx2;
            ((bia)object).a.j();
            ((bia)object).a.k();
            try {
                ((bia)bhx2).b.b(bxt2);
                ((bia)bhx2).a.n();
            }
            finally {
                ((bia)object).a.l();
            }
        }
    }

    public static bgs o(bhd bhd2) {
        jse.e(bhd2, "<this>");
        return new bgs(bhd2.b, bhd2.u);
    }

    public static /* synthetic */ int p(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }
}

