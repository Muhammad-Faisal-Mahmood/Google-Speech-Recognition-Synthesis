/*
 * Decompiled with CFR 0.152.
 */
final class ajj {
    public final anb a;
    public final Object b;
    public final anv[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ajk g;
    public boolean h;
    public ajj i;
    public aob j;
    public long k;
    public diz l;
    private final boolean[] m;
    private final ajx[] n;
    private final aoz o;
    private final ajq p;

    public ajj(ajx[] object, long l2, aoz object2, apb apb2, ajq ajq2, ajk object3, diz diz2) {
        this.n = object;
        this.k = l2;
        this.o = object2;
        this.p = ajq2;
        this.b = ((ajk)object3).a.a;
        this.g = object3;
        this.j = aob.a;
        this.l = diz2;
        this.c = new anv[1];
        this.m = new boolean[1];
        object = ((ajk)object3).a;
        long l3 = ((ajk)object3).b;
        l2 = ((ajk)object3).d;
        object2 = aia.s(((anc)object).a);
        object = ((anc)object).a(aia.r(((anc)object).a));
        object3 = (ajo)ajq2.c.get(object2);
        abr.i(object3);
        ajq2.f.add(object3);
        object2 = (bmu)ajq2.e.get(object3);
        if (object2 != null) {
            ((bmu)object2).a.e((and)((bmu)object2).c);
        }
        ((ajo)object3).c.add(object);
        object2 = ((ajo)object3).a.A((anc)object, apb2, l3);
        ajq2.b.put(object2, object3);
        ajq2.c();
        object = object2;
        if (l2 != -9223372036854775807L) {
            object = new amp((anb)object2, l2);
        }
        this.a = object;
    }

    private static /* synthetic */ void r(ajj ajj2) {
        if (ajj2.m()) {
            int n2 = 0;
            while (true) {
                Object object = ajj2.l;
                if (n2 >= ((diz)object).a) break;
                ((diz)object).b(n2);
                object = ((aoh[])ajj2.l.e)[n2];
                ++n2;
            }
        }
    }

    public final long a() {
        if (!this.e) {
            return this.g.b;
        }
        long l2 = this.f ? this.a.d() : Long.MIN_VALUE;
        if (l2 == Long.MIN_VALUE) {
            return this.g.e;
        }
        return l2;
    }

    public final long b() {
        if (!this.e) {
            return 0L;
        }
        return this.a.e();
    }

    public final long c() {
        return this.g.b + this.k;
    }

    public final long d(long l2) {
        return l2 - this.k;
    }

    public final long e(long l2) {
        return l2 + this.k;
    }

    public final void f(long l2, float f2, long l3) {
        abr.f(this.m());
        l2 = this.d(l2);
        ajg ajg2 = new ajg();
        ajg2.a = l2;
        boolean bl2 = false;
        boolean bl3 = f2 > 0.0f || f2 == -3.4028235E38f;
        abr.d(bl3);
        ajg2.b = f2;
        if (l3 < 0L) {
            bl3 = bl2;
            l2 = l3;
            if (l3 == -9223372036854775807L) {
                bl3 = true;
                l2 = -9223372036854775807L;
            }
        } else {
            bl3 = true;
            l2 = l3;
        }
        anb anb2 = this.a;
        abr.d(bl3);
        ajg2.c = l2;
        anb2.l(new ajh(ajg2));
    }

    public final void g(ana ana2, long l2) {
        this.d = true;
        this.a.j(ana2, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        ajj.r(this);
        anb anb2 = this.a;
        try {
            boolean bl2 = anb2 instanceof amp;
            ajq ajq2 = this.p;
            if (bl2) {
                ajq2.e(((amp)anb2).a);
                return;
            }
            ajq2.e(anb2);
            return;
        }
        catch (RuntimeException runtimeException) {
            afx.c("MediaPeriodHolder", "Period release failed.", runtimeException);
            return;
        }
    }

    public final void i(ajj ajj2) {
        if (ajj2 == this.i) {
            return;
        }
        ajj.r(this);
        this.i = ajj2;
        ajj.r(this);
    }

    public final void j() {
        anb anb2 = this.a;
        if (anb2 instanceof amp) {
            long l2;
            long l3 = l2 = this.g.d;
            if (l2 == -9223372036854775807L) {
                l3 = Long.MIN_VALUE;
            }
            ((amp)anb2).b = l3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean k() {
        boolean bl2;
        boolean bl3 = this.e;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        if (!this.f) return true;
        if (this.a.d() == Long.MIN_VALUE) return true;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean l() {
        boolean bl2;
        boolean bl3 = this.e;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        if (this.k()) return true;
        if (this.a() - this.g.b >= -9223372036854775807L) return true;
        return bl2;
    }

    public final boolean m() {
        return this.i == null;
    }

    public final void n() {
        this.e = true;
        this.j = this.a.h();
        diz diz2 = this.q();
        ajk ajk2 = this.g;
        long l2 = ajk2.b;
        long l3 = ajk2.e;
        long l4 = l2;
        if (l3 != -9223372036854775807L) {
            l4 = l2;
            if (l2 >= l3) {
                l4 = Math.max(0L, l3 - 1L);
            }
        }
        l2 = this.p(diz2, l4);
        l4 = this.k;
        ajk2 = this.g;
        this.k = l4 + (ajk2.b - l2);
        this.g = ajk2.b(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long o(diz diz2, long l2, boolean bl2, boolean[] objectArray) {
        int n2 = 0;
        while (true) {
            int n3 = diz2.a;
            boolean bl3 = true;
            if (n2 >= n3) break;
            boolean[] blArray = this.m;
            if (bl2 || !diz2.c(this.l, n2)) {
                bl3 = false;
            }
            blArray[n2] = bl3;
            ++n2;
        }
        n2 = 0;
        while (true) {
            ajx[] ajxArray = this.n;
            if (n2 > 0) break;
            ajxArray[n2].J();
            ++n2;
        }
        ajj.r(this);
        this.l = diz2;
        ajj.r(this);
        anb anb2 = this.a;
        Object object = diz2.e;
        boolean[] blArray = this.m;
        anv[] anvArray = this.c;
        l2 = anb2.o((aoh[])object, blArray, anvArray, (boolean[])objectArray, l2);
        n2 = 0;
        while (true) {
            ajx[] ajxArray = this.n;
            if (n2 > 0) break;
            ajxArray[n2].J();
            ++n2;
        }
        this.f = false;
        n2 = 0;
        while (true) {
            anv[] anvArray2 = this.c;
            if (n2 > 0) {
                return l2;
            }
            if (anvArray2[0] != null) {
                abr.f(diz2.b(0));
                this.n[0].J();
                this.f = true;
            } else {
                bl2 = ((aoh[])diz2.e)[0] == null;
                abr.f(bl2);
            }
            n2 = 1;
        }
    }

    public final long p(diz diz2, long l2) {
        return this.o(diz2, l2, false, new boolean[1]);
    }

    /*
     * Exception decompiling
     */
    public final diz q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 3486->3489)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
}

