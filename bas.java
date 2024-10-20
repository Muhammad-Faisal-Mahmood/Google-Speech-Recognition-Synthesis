/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bas {
    public static final bas a = AmbientMode$AmbientCallback.a(new LinkedHashMap());
    public final Map b;

    public bas(bas bas2) {
        jse.e(bas2, "other");
        this.b = new HashMap(bas2.b);
    }

    public bas(Map map) {
        this.b = new HashMap(map);
    }

    /*
     * Exception decompiling
     */
    public static final bas a(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [47[CATCHBLOCK], 46[CATCHBLOCK]], but top level block is 7[TRYBLOCK]
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

    public final String b(String string) {
        if ((string = this.b.get(string)) instanceof String) {
            return string;
        }
        return null;
    }

    public final Map c() {
        Map map = DesugarCollections.unmodifiableMap(this.b);
        jse.d(map, "unmodifiableMap(values)");
        return map;
    }

    public final boolean d(String string, Class clazz) {
        return (string = this.b.get(string)) != null && clazz.isAssignableFrom(string.getClass());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        block5: {
            if (this == var1_1) {
                return true;
            }
            if (var1_1 == null || !jse.i(this.getClass(), var1_1.getClass())) break block5;
            var1_1 = (bas)var1_1;
            var4_2 = this.b;
            var3_3 = var1_1.b;
            if (!jse.i(var4_2 = var4_2.keySet(), var3_3.keySet())) {
                return false;
            }
            var3_3 = var4_2.iterator();
            while (var3_3.hasNext()) {
                block7: {
                    block6: {
                        var5_5 /* !! */  = (String)var3_3.next();
                        var4_2 = this.b.get(var5_5 /* !! */ );
                        var5_5 /* !! */  = var1_1.b.get(var5_5 /* !! */ );
                        if (var4_2 == null || var5_5 /* !! */  == null) break block6;
                        if (!(var4_2 instanceof Object[])) ** GOTO lbl-1000
                        var6_6 = (Object[])var4_2;
                        if (var5_5 /* !! */  instanceof Object[]) {
                            var2_4 = jns.K(var6_6, (Object[])var5_5 /* !! */ );
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_4 = jse.i(var4_2, var5_5 /* !! */ );
                        }
                        if (var2_4) continue;
                        break block7;
                    }
                    if (var4_2 == var5_5 /* !! */ ) continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator iterator = this.b.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object v2 = entry.getValue();
            int n3 = v2 instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[])v2) : ((Object)entry).hashCode();
            n2 += n3;
        }
        return n2 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Data {");
        stringBuilder.append(jns.D(this.b.entrySet(), null, null, null, wl.g, 31));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

