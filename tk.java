/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.fonts.FontVariationAxis
 *  android.util.Log
 */
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class tk
extends tj {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public tk() {
        GenericDeclaration genericDeclaration;
        GenericDeclaration genericDeclaration2;
        GenericDeclaration genericDeclaration3;
        GenericDeclaration genericDeclaration4;
        GenericDeclaration genericDeclaration5;
        Constructor<?> constructor;
        GenericDeclaration genericDeclaration6;
        block3: {
            Object var8_1 = null;
            try {
                genericDeclaration6 = Class.forName("android.graphics.FontFamily");
                constructor = ((Class)genericDeclaration6).getConstructor(null);
                genericDeclaration5 = Integer.TYPE;
                genericDeclaration4 = ((Class)genericDeclaration6).getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, genericDeclaration5, Boolean.TYPE, genericDeclaration5, genericDeclaration5, genericDeclaration5, FontVariationAxis[].class});
                genericDeclaration5 = Integer.TYPE;
                genericDeclaration5 = ((Class)genericDeclaration6).getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, genericDeclaration5, FontVariationAxis[].class, genericDeclaration5, genericDeclaration5});
                genericDeclaration3 = ((Class)genericDeclaration6).getMethod("freeze", null);
                genericDeclaration2 = ((Class)genericDeclaration6).getMethod("abortCreation", null);
                genericDeclaration = this.e((Class)genericDeclaration6);
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary methods for class ".concat(String.valueOf(genericDeclaration6.getClass().getName())), genericDeclaration6);
            Object var9_11 = null;
            constructor = null;
            genericDeclaration6 = constructor;
            genericDeclaration2 = genericDeclaration = (genericDeclaration5 = genericDeclaration6);
            genericDeclaration3 = genericDeclaration;
            genericDeclaration4 = genericDeclaration6;
            genericDeclaration = var9_11;
            genericDeclaration6 = var8_1;
        }
        this.a = genericDeclaration6;
        this.b = constructor;
        this.c = genericDeclaration4;
        this.d = genericDeclaration5;
        this.e = genericDeclaration3;
        this.f = genericDeclaration2;
        this.g = genericDeclaration;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Object g() {
        Object t2;
        Object var1_1 = null;
        try {
            t2 = this.b.newInstance(null);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            return var1_1;
        }
        return t2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void h(Object object) {
        try {
            this.f.invoke(object, null);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }

    private final boolean i(Context context, Object object, String string, int n2, int n3, int n4, FontVariationAxis[] fontVariationAxisArray) {
        try {
            boolean bl2 = (Boolean)this.c.invoke(object, context.getAssets(), string, 0, false, n2, n3, n4, fontVariationAxisArray);
            return bl2;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private final boolean j(Object object) {
        try {
            boolean bl2 = (Boolean)this.e.invoke(object, null);
            return bl2;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private final boolean k() {
        if (this.c == null) {
            Log.w((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.c != null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Typeface a(Context var1_1, uh[] var2_4, int var3_7) {
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

    @Override
    public final Typeface b(Context context, bzb syArray, Resources object, int n2) {
        if (!this.k()) {
            return super.b(context, (bzb)syArray, (Resources)object, n2);
        }
        object = this.g();
        if (object != null) {
            for (sy sy2 : (sy[])syArray.a) {
                if (this.i(context, object, sy2.a, sy2.e, sy2.b, sy2.c ? 1 : 0, ag$$ExternalSyntheticApiModelOutline0.m(sy2.d))) continue;
                this.h(object);
                return null;
            }
            if (this.j(object)) {
                return this.c(object);
            }
        }
        return null;
    }

    protected Typeface c(Object object) {
        try {
            Object object2 = Array.newInstance(this.a, 1);
            Array.set(object2, 0, object);
            object = this.g;
            Integer n2 = -1;
            object = (Typeface)((Method)object).invoke(null, object2, n2, n2);
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    @Override
    public final Typeface d(Context context, Resources object, int n2, String string, int n3) {
        if (!this.k()) {
            return super.d(context, (Resources)object, n2, string, n3);
        }
        object = this.g();
        if (object != null) {
            if (!this.i(context, object, string, 0, -1, -1, null)) {
                this.h(object);
                return null;
            }
            if (this.j(object)) {
                return this.c(object);
            }
        }
        return null;
    }

    protected Method e(Class genericDeclaration) {
        genericDeclaration = Array.newInstance(genericDeclaration, 1).getClass();
        Class<Integer> clazz = Integer.TYPE;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{genericDeclaration, clazz, clazz});
        ((Method)genericDeclaration).setAccessible(true);
        return genericDeclaration;
    }
}

