/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class heo
implements hew,
hfu {
    private static final String a = new String();
    public final long b;
    public hen c;
    public hfe d;
    private final Level e;
    private her f;
    private hgv g;
    private Object[] h;

    protected heo(Level level) {
        long l2 = hgt.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        hhk.h(level, "level");
        this.e = level;
        this.b = l2;
    }

    /*
     * Exception decompiling
     */
    private final void V(String var1_1, Object ... var2_4) {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean W() {
        int n2;
        int n3;
        int n4;
        block10: {
            int n5;
            Object object;
            Object object2;
            Object object3;
            block12: {
                block13: {
                    block11: {
                        object3 = this.f;
                        n4 = 1;
                        if (object3 == null) {
                            this.f = hgt.g().a(heo.class, 1);
                        }
                        if ((object2 = this.f) == her.a) break block11;
                        object = this.c;
                        object3 = object2;
                        if (object == null) break block12;
                        object3 = object2;
                        if (((hen)object).b <= 0) break block12;
                        break block13;
                    }
                    object3 = null;
                    break block12;
                }
                hhk.h(object2, "logSiteKey");
                n5 = ((hen)object).b;
                n3 = 0;
                while (true) {
                    object3 = object2;
                    if (n3 >= n5) break;
                    object3 = object2;
                    if (hem.f.equals(((hfz)object).c(n3))) {
                        object3 = ((hfz)object).e(n3);
                        object3 = object3 instanceof hex ? ((hex)object3).b() : new hfi((hes)object2, object3);
                    }
                    ++n3;
                    object2 = object3;
                }
            }
            n2 = this.b((hes)object3);
            object2 = this.d;
            int n6 = n2;
            if (object2 == null) return n6 != 0;
            object = this.c;
            object3 = (hfd)hfd.a.b((hes)object3, (hfz)object);
            int n7 = ((hfd)object3).c.incrementAndGet();
            object = hfe.c;
            n3 = n5 = -1;
            if (object2 != object) {
                if (!((hfd)object3).b.compareAndSet(false, true)) {
                    n3 = n5;
                } else {
                    ((hfe)object2).a();
                    ((hfd)object3).c.addAndGet(-n7);
                    n3 = -1 + n7;
                }
                break block10;
                finally {
                    ((hfd)object3).b.set(false);
                }
            }
        }
        if (n2 != 0 && n3 > 0) {
            this.c.f(hem.e, n3);
        }
        n3 = n3 >= 0 ? n4 : 0;
        return (n2 & n3) != 0;
    }

    @Override
    public final void A(String string, Object object, int n2) {
        if (this.W()) {
            this.V(string, object, n2);
        }
    }

    @Override
    public final void B(String string, Object object, long l2) {
        if (this.W()) {
            this.V(string, object, l2);
        }
    }

    @Override
    public final void C(String string, Object object, Object object2) {
        if (this.W()) {
            this.V(string, object, object2);
        }
    }

    @Override
    public final void D(String string, Object object, boolean bl2) {
        if (this.W()) {
            this.V(string, object, bl2);
        }
    }

    @Override
    public final void E(String string, boolean bl2, Object object) {
        if (this.W()) {
            this.V(string, bl2, object);
        }
    }

    @Override
    public final void F(String string, boolean bl2, boolean bl3) {
        if (this.W()) {
            this.V(string, bl2, bl3);
        }
    }

    @Override
    public final void G(String string, Object object, Object object2, Object object3) {
        if (this.W()) {
            this.V(string, object, object2, object3);
        }
    }

    @Override
    public final void H(String string, Object object, Object object2, Object object3, Object object4) {
        if (this.W()) {
            this.V(string, object, object2, object3, object4);
        }
    }

    @Override
    public final void I(String string, Object object, Object object2, Object object3, Object object4, Object object5) {
        if (this.W()) {
            this.V(string, object, object2, object3, object4, object5);
        }
    }

    @Override
    public final void J(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        if (this.W()) {
            this.V(string, object, object2, object3, object4, object5, object6);
        }
    }

    @Override
    public final void K(String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        if (this.W()) {
            this.V(string, object, object2, object3, object4, object5, object6, object7);
        }
    }

    @Override
    public final void L(String string, Object[] objectArray) {
        if (this.W()) {
            this.V(string, Arrays.copyOf(objectArray, objectArray.length));
        }
    }

    @Override
    public final boolean M() {
        return this.N() || this.c().k(this.e);
        {
        }
    }

    @Override
    public final boolean N() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(hem.g));
    }

    @Override
    public final Object[] O() {
        if (this.g != null) {
            return this.h;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override
    public final hew P() {
        Object object = hem.b;
        if (this.N()) {
            object = this.d();
        } else {
            this.p((hez)object, 100);
            object = this.d();
        }
        return object;
    }

    @Override
    public final void Q(Object object, double d2) {
        if (this.W()) {
            this.V("partial: %s, stability: %s", object, d2);
        }
    }

    @Override
    public final void R(Object object, float f2) {
        if (this.W()) {
            this.V("Detected language from %s %f", object, Float.valueOf(f2));
        }
    }

    @Override
    public final void S(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        if (this.W()) {
            this.V("Download stopped: %s, %s%s%s%s%s%s, size: %s", object, object2, object3, object4, object5, object6, object7, object8);
        }
    }

    @Override
    public final void T(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        if (this.W()) {
            this.V("#getWordLength [completeMatch: %s, isLatin: %b, latinWordMatch: %s,  containsAscii: %b isScript: %b, scriptWordMatch: %s, containsAccent: %b, includeWhitespaces: %b, textDirectionAtCursor: %d]", object, object2, object3, object4, object5, object6, object7, object8, object9);
        }
    }

    @Override
    public final void U(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        if (this.W()) {
            this.V("Ctor: nativeAudioInput = %d chunkSizeMs=%d source=%d sampleRate=%d channels=%d bytesPerSample=%d dspCaptureSession=%d isLoopbackSession=%b allowNonBlockingApiUse=%b acousticEchoCanellerEnabled=%b", object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
        }
    }

    protected abstract hhz a();

    protected boolean b(hes hes2) {
        throw null;
    }

    protected abstract hdz c();

    protected abstract hew d();

    @Override
    public final long e() {
        return this.b;
    }

    @Override
    public final her f() {
        her her2 = this.f;
        if (her2 != null) {
            return her2;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override
    public final hew g(int n2, TimeUnit timeUnit) {
        if (this.N()) {
            return this.d();
        }
        this.p(hem.d, new hed(n2, timeUnit));
        return this.d();
    }

    @Override
    public final hew h(hez hez2, Object object) {
        hhk.h(hez2, "metadata key");
        if (object != null) {
            this.p(hez2, object);
        }
        return this.d();
    }

    @Override
    public final hew i(Throwable throwable) {
        return this.h(hem.a, throwable);
    }

    @Override
    public final hew j(String object, String string, int n2, String string2) {
        object = new heq((String)object, string, n2, string2);
        if (this.f == null) {
            this.f = object;
        }
        return this.d();
    }

    @Override
    public final hew k(hfj hfj2) {
        hhk.h((Object)hfj2, "stack size");
        if (hfj2 != hfj.e) {
            this.p(hem.i, (Object)hfj2);
        }
        return this.d();
    }

    @Override
    public final hfz l() {
        hen hen2 = this.c;
        if (hen2 != null) {
            return hen2;
        }
        return hfy.a;
    }

    @Override
    public final hgv m() {
        return this.g;
    }

    @Override
    public final Object n() {
        if (this.g == null) {
            return this.h[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override
    public final Level o() {
        return this.e;
    }

    protected final void p(hez hez2, Object object) {
        if (this.c == null) {
            this.c = new hen();
        }
        this.c.f(hez2, object);
    }

    @Override
    public final void q() {
        if (this.W()) {
            this.V(a, "");
        }
    }

    @Override
    public final void r(String string) {
        if (this.W()) {
            this.V(a, string);
        }
    }

    @Override
    public final void s(String string, int n2) {
        if (this.W()) {
            this.V(string, n2);
        }
    }

    @Override
    public final void t(String string, long l2) {
        if (this.W()) {
            this.V(string, l2);
        }
    }

    @Override
    public final void u(String string, Object object) {
        if (this.W()) {
            this.V(string, object);
        }
    }

    @Override
    public final void v(String string, int n2, int n3) {
        if (this.W()) {
            this.V(string, n2, n3);
        }
    }

    @Override
    public final void w(String string, int n2, long l2) {
        if (this.W()) {
            this.V(string, n2, l2);
        }
    }

    @Override
    public final void x(String string, int n2, Object object) {
        if (this.W()) {
            this.V(string, n2, object);
        }
    }

    @Override
    public final void y(String string, long l2, long l3) {
        if (this.W()) {
            this.V(string, l2, l3);
        }
    }

    @Override
    public final void z(String string, long l2, Object object) {
        if (this.W()) {
            this.V(string, l2, object);
        }
    }
}

