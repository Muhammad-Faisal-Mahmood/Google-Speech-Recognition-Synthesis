/*
 * Decompiled with CFR 0.152.
 */
public final class amp
implements anb,
ana {
    public final anb a;
    public long b;
    private ana c;
    private amo[] d;
    private long e;

    public amp(anb anb2, long l2) {
        this.a = anb2;
        this.d = new amo[0];
        this.e = 0L;
        this.b = l2;
    }

    @Override
    public final long a(long l2, aka aka2) {
        block3: {
            aka aka3;
            block5: {
                long l3;
                long l4;
                block4: {
                    if (l2 == 0L) break block3;
                    l4 = agf.h(aka2.c, 0L, l2);
                    long l5 = aka2.d;
                    l3 = this.b;
                    l3 = l3 == Long.MIN_VALUE ? Long.MAX_VALUE : (l3 -= l2);
                    l3 = agf.h(l5, 0L, l3);
                    if (l4 != aka2.c) break block4;
                    aka3 = aka2;
                    if (l3 == aka2.d) break block5;
                }
                aka3 = new aka(l4, l3);
            }
            return this.a.a(l2, aka3);
        }
        return 0L;
    }

    @Override
    public final void c(anb object) {
        object = this.c;
        abr.i(object);
        object.c(this);
    }

    @Override
    public final long d() {
        long l2;
        long l3 = this.a.d();
        if (l3 != Long.MIN_VALUE && ((l2 = this.b) == Long.MIN_VALUE || l3 < l2)) {
            return l3;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long e() {
        long l2;
        long l3 = this.a.e();
        if (l3 != Long.MIN_VALUE && ((l2 = this.b) == Long.MIN_VALUE || l3 < l2)) {
            return l3;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long f() {
        boolean bl2;
        long l2;
        block7: {
            block6: {
                if (this.n()) {
                    long l3 = this.e;
                    this.e = -9223372036854775807L;
                    long l4 = this.f();
                    if (l4 != -9223372036854775807L) {
                        return l4;
                    }
                    return l3;
                }
                l2 = this.a.f();
                if (l2 == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                boolean bl3 = false;
                bl2 = l2 >= 0L;
                abr.f(bl2);
                long l5 = this.b;
                if (l5 == Long.MIN_VALUE) break block6;
                bl2 = bl3;
                if (l2 > l5) break block7;
            }
            bl2 = true;
        }
        abr.f(bl2);
        return l2;
    }

    @Override
    public final long g(long l2) {
        boolean bl2;
        long l3;
        block4: {
            block3: {
                this.e = -9223372036854775807L;
                amo[] amoArray = this.d;
                int n2 = amoArray.length;
                boolean bl3 = false;
                for (int i2 = 0; i2 < n2; ++i2) {
                    amo amo2 = amoArray[i2];
                    if (amo2 == null) continue;
                    amo2.b = false;
                }
                l3 = this.a.g(l2);
                if (l3 == l2) break block3;
                bl2 = bl3;
                if (l3 < 0L) break block4;
                l2 = this.b;
                if (l2 == Long.MIN_VALUE) break block3;
                bl2 = bl3;
                if (l3 > l2) break block4;
            }
            bl2 = true;
        }
        abr.f(bl2);
        return l3;
    }

    @Override
    public final aob h() {
        return this.a.h();
    }

    @Override
    public final void i() {
        this.a.i();
    }

    @Override
    public final void j(ana ana2, long l2) {
        this.c = ana2;
        this.a.j(this, l2);
    }

    @Override
    public final void k(long l2) {
        this.a.k(l2);
    }

    @Override
    public final boolean l(ajh ajh2) {
        return this.a.l(ajh2);
    }

    @Override
    public final boolean m() {
        return this.a.m();
    }

    final boolean n() {
        return this.e != -9223372036854775807L;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final long o(aoh[] var1_1, boolean[] var2_2, anv[] var3_3, boolean[] var4_4, long var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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
    public final void p(long l2) {
        this.a.p(l2);
    }
}

