/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class awa {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public awa(String string, Map map, Set set, Set set2) {
        jse.e(map, "columns");
        jse.e(set, "foreignKeys");
        this.a = string;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    /*
     * Exception decompiling
     */
    public static final awa a(awl var0, String var1_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 23[DOLOOP]
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

    public final boolean equals(Object object) {
        return wg.i(this, object);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31 + ((Object)this.b).hashCode()) * 31 + ((Object)this.c).hashCode();
    }

    public final String toString() {
        Collection collection;
        StringBuilder stringBuilder;
        block3: {
            block2: {
                stringBuilder = new StringBuilder("\n            |TableInfo {\n            |    name = '");
                stringBuilder.append(this.a);
                stringBuilder.append("',\n            |    columns = {");
                stringBuilder.append(wg.e(jns.q(this.b.values(), new aog(13))));
                stringBuilder.append("\n            |    foreignKeys = {");
                stringBuilder.append(wg.e(this.c));
                stringBuilder.append("\n            |    indices = {");
                collection = this.d;
                if (collection == null) break block2;
                List list = jns.q(collection, new aog(14));
                collection = list;
                if (list != null) break block3;
            }
            collection = jpa.a;
        }
        stringBuilder.append(wg.e(collection));
        stringBuilder.append("\n            |}\n        ");
        return jse.Z(stringBuilder.toString());
    }
}

