/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.ParcelFileDescriptor
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.system.OsConstants
 *  android.util.Log
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tj
extends tp {
    private static Class a;
    private static Constructor b;
    private static Method c;
    private static Method d;
    private static boolean e = false;

    /*
     * WARNING - void declaration
     */
    private static Object g() {
        void var0_4;
        tj.h();
        try {
            Object t2 = b.newInstance(null);
            return t2;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_4);
    }

    private static void h() {
        Method method;
        GenericDeclaration genericDeclaration;
        Class<?> clazz;
        Constructor<?> constructor;
        block4: {
            if (e) {
                return;
            }
            e = true;
            constructor = null;
            try {
                clazz = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = clazz.getConstructor(null);
                genericDeclaration = clazz.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(clazz, 1).getClass());
                constructor = constructor2;
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi21Impl", (String)genericDeclaration.getClass().getName(), (Throwable)((Object)genericDeclaration));
            method = null;
            genericDeclaration = clazz = null;
        }
        b = constructor;
        a = clazz;
        c = genericDeclaration;
        d = method;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final File i(ParcelFileDescriptor object) {
        try {
            StringBuilder stringBuilder = new StringBuilder("/proc/self/fd/");
            stringBuilder.append(object.getFd());
            String string = Os.readlink((String)stringBuilder.toString());
            if (!OsConstants.S_ISREG((int)Os.stat((String)string).st_mode)) return null;
            return new File(string);
        }
        catch (ErrnoException errnoException) {
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public Typeface a(Context var1_1, uh[] var2_5, int var3_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
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
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Typeface b(Context object, bzb object2, Resources object3, int n2) {
        block11: {
            void var1_7;
            object2 = ((bzb)object2).a;
            Object object4 = tj.g();
            for (sy sy2 : (sy[])object2) {
                object2 = rw.B(object);
                if (object2 == null) return null;
                try {
                    if (!rw.E((File)object2, object3, sy2.f)) break block11;
                    String string = ((File)object2).getPath();
                    int n3 = sy2.b;
                    boolean bl2 = sy2.c;
                    tj.h();
                    try {
                        bl2 = (Boolean)c.invoke(object4, string, n3, bl2);
                        if (!bl2) break block11;
                        ((File)object2).delete();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        // empty catch block
                    }
                    continue;
                    object3 = new RuntimeException((Throwable)object);
                    throw object3;
                }
                catch (Throwable throwable) {
                    ((File)object2).delete();
                    throw throwable;
                }
            }
            tj.h();
            try {
                object = Array.newInstance(a, 1);
                Array.set(object, 0, object4);
                return (Typeface)d.invoke(null, object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException((Throwable)var1_7);
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            throw new RuntimeException((Throwable)var1_7);
            catch (RuntimeException runtimeException) {}
        }
        ((File)object2).delete();
        return null;
    }
}

