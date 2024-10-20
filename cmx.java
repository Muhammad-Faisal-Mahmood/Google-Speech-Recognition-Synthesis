/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class cmx {
    public String a;
    public iex b;
    public int c;
    public hvu d;
    public String e;
    public cmt f;
    public idt g;
    public iep h;
    public ies i;
    public iem j;
    public iew k;
    public idr l;
    public iel m;
    public String n;
    public short o;
    public giu p;
    private String q;
    private String r;
    private boolean s;
    private boolean t;
    private boolean u;
    private idq v;
    private String w;
    private String x;
    private boolean y;
    private boolean z;

    public final void a(idq idq2) {
        if (idq2 != null) {
            this.v = idq2;
            return;
        }
        throw new NullPointerException("Null applicationDomain");
    }

    public final void b(boolean bl2) {
        this.y = bl2;
        this.o = (short)(this.o | 0x4000);
    }

    public final void c(boolean bl2) {
        this.t = bl2;
        this.o = (short)(this.o | 0x80);
    }

    public final void d(boolean bl2) {
        this.z = bl2;
        this.o = (short)(this.o | Short.MIN_VALUE);
    }

    public final void e(boolean bl2) {
        this.u = bl2;
        this.o = (short)(this.o | 0x100);
    }

    public final void f(String string) {
        if (string != null) {
            this.w = string;
            return;
        }
        throw new NullPointerException("Null languageModel");
    }

    public final void g(boolean bl2) {
        this.s = bl2;
        this.o = (short)(this.o | 0x40);
    }

    public final void h(String string) {
        if (string != null) {
            this.x = string;
            return;
        }
        throw new NullPointerException("Null personalizedResourcesDir");
    }

    public final void i(String string) {
        if (string != null) {
            this.q = string;
            return;
        }
        throw new NullPointerException("Null sodaResourcesDir");
    }

    public final cmz j(fpo object) {
        String string;
        Object object2;
        String string2;
        hvu hvu2;
        Object object3;
        Object object4;
        Object object5;
        Object object6 = this.r;
        object6 = object6 == null ? gsl.a : gto.i(object6);
        if (!((gto)object6).g()) {
            if ((this.o & 2) != 0) {
                this.r = "";
            } else {
                throw new IllegalStateException("Property \"requireHotword\" has not been set");
            }
        }
        if (this.o == -1 && (object5 = this.q) != null && (object6 = this.a) != null && (object4 = this.r) != null && (object3 = this.v) != null && (hvu2 = this.d) != null && (string2 = this.w) != null && (object2 = this.n) != null && (string = this.x) != null) {
            object5 = new cmy((String)object5, (String)object6, (String)object4, this.s, this.t, this.b, this.u, (idq)object3, this.c, hvu2, this.e, this.f, this.p, this.g, this.h, this.i, this.j, this.k, this.l, this.m, string2, (String)object2, string, this.y, this.z);
            ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler$SodaParams$Builder", "build", 929, "SodaDetectionHandler.java")).u("sodaParams - %s", object5);
            object6 = (Map)((imc)((fpo)object).c).a;
            object6.getClass();
            ((gto)((imc)((fpo)object).b).a).getClass();
            object3 = ((fpo)object).f;
            object4 = ((fpo)object).d;
            object3 = ((bqw)object3).a();
            object2 = (cmn)object4.b();
            object2.getClass();
            object4 = (hpr)((fpo)object).a.b();
            object4.getClass();
            ((hpq)((fpo)object).e.b()).getClass();
            return new cmz((cmy)object5, (Map)object6, (gto)object3, (cmn)object2, (hpr)object4);
        }
        object = new StringBuilder();
        if (this.q == null) {
            ((StringBuilder)object).append(" sodaResourcesDir");
        }
        if (this.a == null) {
            ((StringBuilder)object).append(" sodaCacheDir");
        }
        if (this.r == null) {
            ((StringBuilder)object).append(" hotwordModelPath");
        }
        if ((this.o & 1) == 0) {
            ((StringBuilder)object).append(" expectAsrAfterHotword");
        }
        if ((this.o & 2) == 0) {
            ((StringBuilder)object).append(" requireHotword");
        }
        if ((this.o & 4) == 0) {
            ((StringBuilder)object).append(" addHotwordBuffer");
        }
        if ((this.o & 8) == 0) {
            ((StringBuilder)object).append(" resetOnFinalResult");
        }
        if ((this.o & 0x10) == 0) {
            ((StringBuilder)object).append(" attachQueryAudio");
        }
        if ((this.o & 0x20) == 0) {
            ((StringBuilder)object).append(" uploadAudiosToServer");
        }
        if ((this.o & 0x40) == 0) {
            ((StringBuilder)object).append(" maskOffensiveWords");
        }
        if ((this.o & 0x80) == 0) {
            ((StringBuilder)object).append(" enableLongform");
        }
        if ((this.o & 0x100) == 0) {
            ((StringBuilder)object).append(" hidePartialTrailingPunctuation");
        }
        if ((this.o & 0x200) == 0) {
            ((StringBuilder)object).append(" forceDisableOpenMic");
        }
        if ((this.o & 0x400) == 0) {
            ((StringBuilder)object).append(" forceDisableSpeakerVerification");
        }
        if (this.v == null) {
            ((StringBuilder)object).append(" applicationDomain");
        }
        if ((this.o & 0x800) == 0) {
            ((StringBuilder)object).append(" channelCount");
        }
        if ((this.o & 0x1000) == 0) {
            ((StringBuilder)object).append(" boostRecognizerPriority");
        }
        if (this.d == null) {
            ((StringBuilder)object).append(" hotwordModel");
        }
        if (this.w == null) {
            ((StringBuilder)object).append(" languageModel");
        }
        if (this.n == null) {
            ((StringBuilder)object).append(" tisidModelPath");
        }
        if ((this.o & 0x2000) == 0) {
            ((StringBuilder)object).append(" tisidStandaloneRuntimePreferred");
        }
        if (this.x == null) {
            ((StringBuilder)object).append(" personalizedResourcesDir");
        }
        if ((this.o & 0x4000) == 0) {
            ((StringBuilder)object).append(" enableConcurrency");
        }
        if ((this.o & 0x8000) == 0) {
            ((StringBuilder)object).append(" enablePartialAlignments");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }
}

