/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

public class abg
extends abb {
    public ob a = new ob();
    public aba b = aba.b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final jzq h;

    public abg(abe abe2) {
        this.c = new WeakReference<abe>(abe2);
        this.h = jzm.a((Object)aba.b);
    }

    public static final void f(String string) {
        if (nz.v().w()) {
            return;
        }
        throw new IllegalStateException(a.aj(string, "Method ", " must be called on the main thread"));
    }

    private final aba g(abd object) {
        ob ob2 = this.a;
        boolean bl2 = ob2.c(object);
        Object object2 = null;
        object = bl2 ? ((oe)ob2.a.get((Object)object)).d : null;
        object = object != null ? ((abf)((oe)object).b).a : null;
        if (!this.g.isEmpty()) {
            object2 = this.g;
            object2 = (aba)((Object)object2.get(object2.size() - 1));
        }
        return wd.n(wd.n(this.b, (aba)((Object)object)), (aba)((Object)object2));
    }

    private final void h(aba aba2) {
        block6: {
            block5: {
                Object object = this.b;
                if (object == aba2) break block5;
                if (object == aba.b && aba2 == aba.a) {
                    object = new StringBuilder("State must be at least CREATED to move to ");
                    ((StringBuilder)object).append((Object)aba2);
                    ((StringBuilder)object).append(", but was ");
                    ((StringBuilder)object).append((Object)this.b);
                    ((StringBuilder)object).append(" in component ");
                    ((StringBuilder)object).append(this.c.get());
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
                this.b = aba2;
                if (this.e || this.d != 0) break block6;
                this.e = true;
                this.k();
                this.e = false;
                if (this.b == aba.a) {
                    this.a = new ob();
                }
            }
            return;
        }
        this.f = true;
    }

    private final void i() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void j(aba aba2) {
        this.g.add(aba2);
    }

    /*
     * Exception decompiling
     */
    private final void k() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
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

    @Override
    public final aba a() {
        return this.b;
    }

    @Override
    public final void b(abd object) {
        jse.e(object, "observer");
        abg.f("addObserver");
        Object object2 = this.b;
        Object object3 = aba.a;
        Object object4 = object3;
        if (object2 != object3) {
            object4 = aba.b;
        }
        object3 = new abf((abd)object, (aba)((Object)object4));
        object2 = this.a;
        object4 = ((ob)object2).a(object);
        if (object4 != null) {
            object4 = ((oe)object4).b;
        } else {
            ((ob)object2).a.put(object, ((oi)object2).d(object, object3));
            object4 = null;
        }
        if ((abf)object4 == null && (object2 = (abe)this.c.get()) != null) {
            boolean bl2 = this.d != 0 || this.e;
            object4 = this.g((abd)object);
            ++this.d;
            while (((aba)((Object)((abf)object3).a)).compareTo(object4) < 0 && this.a.c(object)) {
                this.j((aba)((Object)((abf)object3).a));
                object4 = aay.a((aba)((Object)((abf)object3).a));
                if (object4 != null) {
                    ((abf)object3).a((abe)object2, (aaz)((Object)object4));
                    this.i();
                    object4 = this.g((abd)object);
                    continue;
                }
                object = ((abf)object3).a;
                Objects.toString(object);
                throw new IllegalStateException("no event up from ".concat(String.valueOf(object)));
            }
            if (!bl2) {
                this.k();
            }
            --this.d;
        }
    }

    @Override
    public final void c(abd abd2) {
        jse.e(abd2, "observer");
        abg.f("removeObserver");
        ((oi)this.a).b(abd2);
    }

    public void d(aaz aaz2) {
        jse.e((Object)aaz2, "event");
        abg.f("handleLifecycleEvent");
        this.h(aaz2.a());
    }

    public final void e(aba aba2) {
        jse.e((Object)aba2, "state");
        abg.f("setCurrentState");
        this.h(aba2);
    }
}

