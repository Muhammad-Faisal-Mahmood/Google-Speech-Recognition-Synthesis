/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 */
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

public abstract class ama
extends aid {
    protected aie A;
    public alz B;
    public bzb C;
    public bzb D;
    private final alt E;
    private final amc F;
    private final ahx G;
    private final ahx H;
    private final MediaCodec.BufferInfo I;
    private adu J;
    private MediaCrypto K;
    private float L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private aly P;
    private boolean Q;
    private boolean R;
    private long S;
    private int T;
    private int U;
    private ByteBuffer V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private long aa;
    private long ab;
    private long ac;
    private boolean ad;
    public final ahx f;
    public final alq g;
    public final ArrayDeque h;
    public final akz i;
    public adu j;
    public alu k;
    public adu l;
    public ArrayDeque m;
    public alx n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ama(alt object, amc amc2) {
        this.E = object;
        this.F = amc2;
        this.G = new ahx(0);
        this.H = new ahx(0);
        this.f = new ahx(2);
        this.g = object = new alq();
        this.I = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.h = new ArrayDeque();
        this.B = alz.a;
        ((ahx)object).a(0);
        ((alq)object).c.order(ByteOrder.nativeOrder());
        this.i = new akz();
        this.O = -1.0f;
        this.t = 0;
        this.T = -1;
        this.U = -1;
        this.o = -9223372036854775807L;
        this.aa = -9223372036854775807L;
        this.ab = -9223372036854775807L;
        this.ac = -9223372036854775807L;
        this.S = -9223372036854775807L;
        this.u = 0;
        this.v = 0;
        this.A = new aie();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean aA(long l2, long l3) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (l3 >= l2) return bl3;
        adu adu2 = this.J;
        if (adu2 == null) return true;
        if (!Objects.equals(adu2.o, "audio/opus")) return true;
        if (!wc.n(l2, l3)) return true;
        return bl2;
    }

    private final boolean aB(int n2) {
        ahx ahx2 = this.G;
        arq arq2 = this.O();
        ((aht)ahx2).clear();
        n2 = this.N(arq2, this.G, n2 | 4);
        if (n2 == -5) {
            this.af(arq2);
            return true;
        }
        if (n2 == -4 && this.G.isEndOfStream()) {
            this.x = true;
            this.av();
        }
        return false;
    }

    private final void au() {
        try {
            alu alu2 = this.k;
            abr.j(alu2);
            alu2.g();
            return;
        }
        finally {
            this.am();
        }
    }

    private final void av() {
        int n2 = this.v;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    this.y = true;
                    this.aa();
                    return;
                }
                this.aw();
                return;
            }
            this.au();
            this.az();
            return;
        }
        this.au();
    }

    private final void aw() {
        this.al();
        this.aj();
    }

    private final void ax() {
        this.T = -1;
        this.H.c = null;
    }

    private final void ay() {
        this.U = -1;
        this.V = null;
    }

    private final void az() {
        abr.i(this.D);
        this.C = this.D;
        this.u = 0;
        this.v = 0;
    }

    @Override
    public final void G(float f2) {
        this.L = f2;
        this.as(this.l);
    }

    @Override
    protected final void K(long l2) {
        long l3;
        long l4;
        if (this.B.c == -9223372036854775807L) {
            this.ao(new alz(-9223372036854775807L, l2));
            return;
        }
        if (this.h.isEmpty() && ((l4 = this.aa) == -9223372036854775807L || (l3 = this.ac) != -9223372036854775807L && l3 >= l4)) {
            this.ao(new alz(-9223372036854775807L, l2));
            l2 = this.B.c;
            return;
        }
        this.h.add(new alz(this.aa, l2));
    }

    @Override
    public boolean Q() {
        throw null;
    }

    @Override
    public boolean R() {
        throw null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void S(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 32->39)] java.lang.IllegalStateException
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

    @Override
    public final int T(adu adu2) {
        try {
            int n2 = this.U(this.F, adu2);
            return n2;
        }
        catch (amg amg2) {
            throw this.d(amg2, adu2, 4002);
        }
    }

    protected abstract int U(amc var1, adu var2);

    protected abstract List V(amc var1, adu var2, boolean var3);

    protected void W(ahx ahx2) {
        throw null;
    }

    protected void X(Exception exception) {
        throw null;
    }

    protected void Y(String string) {
        throw null;
    }

    protected void Z(adu adu2, MediaFormat mediaFormat) {
        throw null;
    }

    @Override
    public final int aC() {
        return 8;
    }

    protected void aa() {
    }

    protected boolean ab(adu adu2) {
        throw null;
    }

    protected float ac(float f2, adu[] aduArray) {
        throw null;
    }

    protected void ad(String string, long l2, long l3) {
        throw null;
    }

    protected abstract boolean ae(alu var1, ByteBuffer var2, int var3, int var4, int var5, boolean var6, adu var7);

    protected void af(arq arq2) {
        throw null;
    }

    protected abstract cya ag(alx var1, adu var2, MediaCrypto var3, float var4);

    public final void ah() {
        this.r = false;
        ((aht)this.g).clear();
        ((aht)this.f).clear();
        this.q = false;
        this.p = false;
        this.i.a();
    }

    public final void ai() {
        if (this.w) {
            this.u = 1;
            this.v = 3;
            return;
        }
        this.aw();
    }

    /*
     * Exception decompiling
     */
    protected final void aj() {
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

    protected final void ak(long l2) {
        this.ac = l2;
        while (!this.h.isEmpty() && l2 >= ((alz)this.h.peek()).b) {
            alz alz2 = (alz)this.h.poll();
            abr.i(alz2);
            this.ao(alz2);
        }
    }

    protected final void al() {
        block4: {
            Object object = this.k;
            if (object == null) break block4;
            object.h();
            object = this.A;
            ++((aie)object).b;
            object = this.n;
            abr.i(object);
            this.Y(((alx)object).a);
        }
        return;
        finally {
            this.k = null;
            this.K = null;
            this.C = null;
            this.an();
        }
    }

    protected final void am() {
        this.ax();
        this.ay();
        this.o = -9223372036854775807L;
        this.Y = false;
        this.S = -9223372036854775807L;
        this.w = false;
        this.W = false;
        this.X = false;
        this.aa = -9223372036854775807L;
        this.ab = -9223372036854775807L;
        this.ac = -9223372036854775807L;
        this.u = 0;
        this.v = 0;
        this.t = this.s ? 1 : 0;
    }

    protected final void an() {
        this.am();
        this.m = null;
        this.n = null;
        this.l = null;
        this.M = null;
        this.N = false;
        this.Z = false;
        this.O = -1.0f;
        this.Q = false;
        this.R = false;
        this.s = false;
        this.t = 0;
    }

    public final void ao(alz alz2) {
        this.B = alz2;
        if (alz2.c != -9223372036854775807L) {
            this.ad = true;
        }
    }

    protected final boolean ap() {
        if (this.k == null) {
            return false;
        }
        int n2 = this.v;
        if (n2 != 3 && (!this.Q || this.Z)) {
            if (n2 == 2) {
                n2 = agf.a;
                abr.f(true);
                try {
                    this.az();
                }
                catch (ail ail2) {
                    afx.f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", ail2);
                    this.al();
                    return true;
                }
            }
            this.au();
            return false;
        }
        this.al();
        return true;
    }

    public final boolean aq() {
        return this.U >= 0;
    }

    protected final boolean ar(adu adu2) {
        return this.D == null && this.ab(adu2);
    }

    public final boolean as(adu object) {
        int n2 = agf.a;
        if (this.k != null && this.v != 3 && this.a != 0) {
            float f2 = this.L;
            abr.i(object);
            float f3 = this.ac(f2, this.C());
            f2 = this.O;
            if (f2 != f3) {
                if (f3 == -1.0f) {
                    this.ai();
                    return false;
                }
                if (f2 != -1.0f || f3 > 44100.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", f3);
                    object = this.k;
                    abr.i(object);
                    object.i(bundle);
                    this.O = f3;
                }
            }
        }
        return true;
    }

    public final void at() {
        if (this.w) {
            this.u = 1;
            this.v = 2;
            return;
        }
        this.az();
    }
}

