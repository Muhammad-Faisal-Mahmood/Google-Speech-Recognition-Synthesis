/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fgt {
    private boolean A;
    private Optional B;
    private Optional C;
    private Optional D;
    private boolean E;
    private boolean F;
    private Optional G;
    private Optional H;
    private Optional I;
    private gzx J;
    private Optional K;
    private boolean L;
    private boolean M;
    private short N;
    public Optional a;
    public String b;
    public String c;
    public int d;
    private int e;
    private String f;
    private gzx g;
    private String h;
    private String i;
    private fgs j;
    private Optional k;
    private idq l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Optional u;
    private boolean v;
    private boolean w;
    private Optional x;
    private Optional y;
    private gzx z;

    public fgt() {
        throw null;
    }

    public fgt(fgu fgu2) {
        this.k = Optional.empty();
        this.a = Optional.empty();
        this.u = Optional.empty();
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.B = Optional.empty();
        this.C = Optional.empty();
        this.D = Optional.empty();
        this.G = Optional.empty();
        this.H = Optional.empty();
        this.I = Optional.empty();
        this.K = Optional.empty();
        this.e = fgu2.a;
        this.f = fgu2.b;
        this.g = fgu2.c;
        this.h = fgu2.d;
        this.i = fgu2.e;
        this.j = fgu2.f;
        this.k = fgu2.g;
        this.l = fgu2.h;
        this.d = fgu2.M;
        this.m = fgu2.i;
        this.n = fgu2.j;
        this.o = fgu2.k;
        this.p = fgu2.l;
        this.a = fgu2.m;
        this.q = fgu2.n;
        this.r = fgu2.o;
        this.s = fgu2.p;
        this.t = fgu2.q;
        this.u = fgu2.r;
        this.v = fgu2.s;
        this.w = fgu2.t;
        this.x = fgu2.u;
        this.y = fgu2.v;
        this.b = fgu2.w;
        this.z = fgu2.x;
        this.A = fgu2.y;
        this.B = fgu2.z;
        this.C = fgu2.A;
        this.D = fgu2.B;
        this.E = fgu2.C;
        this.F = fgu2.D;
        this.G = fgu2.E;
        this.H = fgu2.F;
        this.I = fgu2.G;
        this.J = fgu2.H;
        this.c = fgu2.I;
        this.K = fgu2.J;
        this.L = fgu2.K;
        this.M = fgu2.L;
        this.N = (short)-1;
    }

    public fgt(byte[] byArray) {
        this.k = Optional.empty();
        this.a = Optional.empty();
        this.u = Optional.empty();
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.B = Optional.empty();
        this.C = Optional.empty();
        this.D = Optional.empty();
        this.G = Optional.empty();
        this.H = Optional.empty();
        this.I = Optional.empty();
        this.K = Optional.empty();
    }

    public final void A(Optional optional) {
        if (optional != null) {
            this.K = optional;
            return;
        }
        throw new NullPointerException("Null onDeviceRecognitionContext");
    }

    public final void B(String string) {
        if (string != null) {
            this.i = string;
            return;
        }
        throw new NullPointerException("Null overrideTriggerApplicationId");
    }

    public final void C(Optional optional) {
        if (optional != null) {
            this.H = optional;
            return;
        }
        throw new NullPointerException("Null prebuiltBiasingConfig");
    }

    public final void D(boolean bl2) {
        this.m = bl2;
        this.N = (short)(this.N | 2);
    }

    public final void E(boolean bl2) {
        this.t = bl2;
        this.N = (short)(this.N | 0x100);
    }

    public final void F(boolean bl2) {
        this.s = bl2;
        this.N = (short)(this.N | 0x80);
    }

    public final void G(boolean bl2) {
        this.F = bl2;
        this.N = (short)(this.N | 0x2000);
    }

    public final void H(boolean bl2) {
        this.E = bl2;
        this.N = (short)(this.N | 0x1000);
    }

    public final void I(Optional optional) {
        if (optional != null) {
            this.I = optional;
            return;
        }
        throw new NullPointerException("Null s3DataDonationRequest");
    }

    public final void J(int n2) {
        this.p = n2;
        this.N = (short)(this.N | 0x10);
    }

    public final void K(String string) {
        if (string != null) {
            this.h = string;
            return;
        }
        throw new NullPointerException("Null triggerApplicationId");
    }

    public final fgu a() {
        if ((this.N & 1) != 0) {
            String string;
            gzx gzx2;
            gzx gzx3;
            String string2;
            int n2;
            idq idq2;
            fgs fgs2;
            String string3;
            CharSequence charSequence;
            gzx gzx4;
            String string4;
            boolean bl2 = this.e > 0;
            fxf.B(bl2, "Negative or zero maxResults");
            if (this.N == -1 && (string4 = this.f) != null && (gzx4 = this.g) != null && (charSequence = this.h) != null && (string3 = this.i) != null && (fgs2 = this.j) != null && (idq2 = this.l) != null && (n2 = this.d) != 0 && (string2 = this.b) != null && (gzx3 = this.z) != null && (gzx2 = this.J) != null && (string = this.c) != null) {
                return new fgu(this.e, string4, gzx4, (String)charSequence, string3, fgs2, this.k, idq2, n2, this.m, this.n, this.o, this.p, this.a, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, string2, gzx3, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, gzx2, string, this.K, this.L, this.M);
            }
            charSequence = new StringBuilder();
            if ((1 & this.N) == 0) {
                ((StringBuilder)charSequence).append(" maxResults");
            }
            if (this.f == null) {
                ((StringBuilder)charSequence).append(" language");
            }
            if (this.g == null) {
                ((StringBuilder)charSequence).append(" additionalLanguages");
            }
            if (this.h == null) {
                ((StringBuilder)charSequence).append(" triggerApplicationId");
            }
            if (this.i == null) {
                ((StringBuilder)charSequence).append(" overrideTriggerApplicationId");
            }
            if (this.j == null) {
                ((StringBuilder)charSequence).append(" entrypoint");
            }
            if (this.l == null) {
                ((StringBuilder)charSequence).append(" applicationDomain");
            }
            if (this.d == 0) {
                ((StringBuilder)charSequence).append(" recognizerMode");
            }
            if ((this.N & 2) == 0) {
                ((StringBuilder)charSequence).append(" preferOffline");
            }
            if ((this.N & 4) == 0) {
                ((StringBuilder)charSequence).append(" enablePartialResults");
            }
            if ((this.N & 8) == 0) {
                ((StringBuilder)charSequence).append(" minSpeechLengthMs");
            }
            if ((this.N & 0x10) == 0) {
                ((StringBuilder)charSequence).append(" speechInputCompleteSilenceLengthMs");
            }
            if ((this.N & 0x20) == 0) {
                ((StringBuilder)charSequence).append(" muteMicForTalkBack");
            }
            if ((this.N & 0x40) == 0) {
                ((StringBuilder)charSequence).append(" multiSegment");
            }
            if ((this.N & 0x80) == 0) {
                ((StringBuilder)charSequence).append(" requestSodaEvent");
            }
            if ((this.N & 0x100) == 0) {
                ((StringBuilder)charSequence).append(" profanityFilter");
            }
            if ((this.N & 0x200) == 0) {
                ((StringBuilder)charSequence).append(" hidePartialTrailingPunctuation");
            }
            if ((this.N & 0x400) == 0) {
                ((StringBuilder)charSequence).append(" muteAudioBeeps");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence).append(" languageModel");
            }
            if (this.z == null) {
                ((StringBuilder)charSequence).append(" biasingStrings");
            }
            if ((this.N & 0x800) == 0) {
                ((StringBuilder)charSequence).append(" enableDeviceContextBiasing");
            }
            if ((this.N & 0x1000) == 0) {
                ((StringBuilder)charSequence).append(" requestWordTiming");
            }
            if ((this.N & 0x2000) == 0) {
                ((StringBuilder)charSequence).append(" requestWordConfidence");
            }
            if (this.J == null) {
                ((StringBuilder)charSequence).append(" experimentIds");
            }
            if (this.c == null) {
                ((StringBuilder)charSequence).append(" s3SecondaryRouting");
            }
            if ((this.N & 0x4000) == 0) {
                ((StringBuilder)charSequence).append(" enableReuseSodaInstance");
            }
            if ((this.N & 0x8000) == 0) {
                ((StringBuilder)charSequence).append(" enablePartialAlignments");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)charSequence).toString()));
        }
        throw new IllegalStateException("Property \"maxResults\" has not been set");
    }

    public final void b(gzx gzx2) {
        if (gzx2 != null) {
            this.g = gzx2;
            return;
        }
        throw new NullPointerException("Null additionalLanguages");
    }

    public final void c(Optional optional) {
        if (optional != null) {
            this.D = optional;
            return;
        }
        throw new NullPointerException("Null aiCoreConfig");
    }

    public final void d(idq idq2) {
        if (idq2 != null) {
            this.l = idq2;
            return;
        }
        throw new NullPointerException("Null applicationDomain");
    }

    public final void e(Optional optional) {
        if (optional != null) {
            this.x = optional;
            return;
        }
        throw new NullPointerException("Null attributionSource");
    }

    public final void f(Optional optional) {
        if (optional != null) {
            this.k = optional;
            return;
        }
        throw new NullPointerException("Null audioRecordingEncoding");
    }

    public final void g(Optional optional) {
        if (optional != null) {
            this.a = optional;
            return;
        }
        throw new NullPointerException("Null audioSource");
    }

    public final void h(gzx gzx2) {
        if (gzx2 != null) {
            this.z = gzx2;
            return;
        }
        throw new NullPointerException("Null biasingStrings");
    }

    public final void i(Optional optional) {
        if (optional != null) {
            this.y = optional;
            return;
        }
        throw new NullPointerException("Null diarizationConfig");
    }

    public final void j(boolean bl2) {
        this.A = bl2;
        this.N = (short)(this.N | 0x800);
    }

    public final void k(Optional optional) {
        if (optional != null) {
            this.u = optional;
            return;
        }
        throw new NullPointerException("Null enableFormatting");
    }

    public final void l(boolean bl2) {
        this.M = bl2;
        this.N = (short)(this.N | Short.MIN_VALUE);
    }

    public final void m(boolean bl2) {
        this.n = bl2;
        this.N = (short)(this.N | 4);
    }

    public final void n(boolean bl2) {
        this.L = bl2;
        this.N = (short)(this.N | 0x4000);
    }

    public final void o(fgs fgs2) {
        if (fgs2 != null) {
            this.j = fgs2;
            return;
        }
        throw new NullPointerException("Null entrypoint");
    }

    public final void p(gzx gzx2) {
        if (gzx2 != null) {
            this.J = gzx2;
            return;
        }
        throw new NullPointerException("Null experimentIds");
    }

    public final void q(boolean bl2) {
        this.v = bl2;
        this.N = (short)(this.N | 0x200);
    }

    public final void r(Optional optional) {
        if (optional != null) {
            this.G = optional;
            return;
        }
        throw new NullPointerException("Null hostAppId");
    }

    public final void s(Optional optional) {
        if (optional != null) {
            this.B = optional;
            return;
        }
        throw new NullPointerException("Null langIdConfig");
    }

    public final void t(String string) {
        if (string != null) {
            this.f = string;
            return;
        }
        throw new NullPointerException("Null language");
    }

    public final void u(int n2) {
        this.e = n2;
        this.N = (short)(this.N | 1);
    }

    public final void v(int n2) {
        this.o = n2;
        this.N = (short)(this.N | 8);
    }

    public final void w(boolean bl2) {
        this.r = bl2;
        this.N = (short)(this.N | 0x40);
    }

    public final void x(Optional optional) {
        if (optional != null) {
            this.C = optional;
            return;
        }
        throw new NullPointerException("Null multilangConfig");
    }

    public final void y(boolean bl2) {
        this.w = bl2;
        this.N = (short)(this.N | 0x400);
    }

    public final void z(boolean bl2) {
        this.q = bl2;
        this.N = (short)(this.N | 0x20);
    }
}

