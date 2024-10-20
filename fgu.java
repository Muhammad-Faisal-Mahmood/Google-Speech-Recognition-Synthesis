/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fgu {
    public final Optional A;
    public final Optional B;
    public final boolean C;
    public final boolean D;
    public final Optional E;
    public final Optional F;
    public final Optional G;
    public final gzx H;
    public final String I;
    public final Optional J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int a;
    public final String b;
    public final gzx c;
    public final String d;
    public final String e;
    public final fgs f;
    public final Optional g;
    public final idq h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final Optional m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Optional r;
    public final boolean s;
    public final boolean t;
    public final Optional u;
    public final Optional v;
    public final String w;
    public final gzx x;
    public final boolean y;
    public final Optional z;

    public fgu() {
        throw null;
    }

    public fgu(int n2, String string, gzx gzx2, String string2, String string3, fgs fgs2, Optional optional, idq idq2, int n3, boolean bl2, boolean bl3, int n4, int n5, Optional optional2, boolean bl4, boolean bl5, boolean bl6, boolean bl7, Optional optional3, boolean bl8, boolean bl9, Optional optional4, Optional optional5, String string4, gzx gzx3, boolean bl10, Optional optional6, Optional optional7, Optional optional8, boolean bl11, boolean bl12, Optional optional9, Optional optional10, Optional optional11, gzx gzx4, String string5, Optional optional12, boolean bl13, boolean bl14) {
        this.a = n2;
        this.b = string;
        this.c = gzx2;
        this.d = string2;
        this.e = string3;
        this.f = fgs2;
        this.g = optional;
        this.h = idq2;
        this.M = n3;
        this.i = bl2;
        this.j = bl3;
        this.k = n4;
        this.l = n5;
        this.m = optional2;
        this.n = bl4;
        this.o = bl5;
        this.p = bl6;
        this.q = bl7;
        this.r = optional3;
        this.s = bl8;
        this.t = bl9;
        this.u = optional4;
        this.v = optional5;
        this.w = string4;
        this.x = gzx3;
        this.y = bl10;
        this.z = optional6;
        this.A = optional7;
        this.B = optional8;
        this.C = bl11;
        this.D = bl12;
        this.E = optional9;
        this.F = optional10;
        this.G = optional11;
        this.H = gzx4;
        this.I = string5;
        this.J = optional12;
        this.K = bl13;
        this.L = bl14;
    }

    public static fgt a() {
        fgt fgt2 = new fgt(null);
        fgt2.u(1);
        fgt2.t("");
        int n2 = gzx.d;
        fgt2.b(hct.a);
        fgt2.K("");
        fgt2.B("");
        fgt2.o(fgs.a);
        fgt2.f(Optional.empty());
        fgt2.d(idq.a);
        fgt2.d = 3;
        fgt2.D(false);
        fgt2.m(false);
        fgt2.v(0);
        fgt2.J(0);
        fgt2.g(Optional.empty());
        fgt2.z(false);
        fgt2.w(false);
        fgt2.F(false);
        fgt2.E(true);
        fgt2.k(Optional.empty());
        fgt2.q(false);
        fgt2.y(false);
        fgt2.i(Optional.empty());
        fgt2.b = "";
        fgt2.h(hct.a);
        fgt2.j(false);
        fgt2.s(Optional.empty());
        fgt2.x(Optional.empty());
        fgt2.c(Optional.empty());
        fgt2.H(false);
        fgt2.G(false);
        fgt2.r(Optional.empty());
        fgt2.I(Optional.empty());
        fgt2.C(Optional.empty());
        fgt2.p(hct.a);
        fgt2.l(false);
        fgt2.c = "";
        fgt2.A(Optional.empty());
        fgt2.n(false);
        return fgt2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fgu) {
            object = (fgu)object;
            if (this.a == ((fgu)object).a && this.b.equals(((fgu)object).b) && fvd.z(this.c, ((fgu)object).c) && this.d.equals(((fgu)object).d) && this.e.equals(((fgu)object).e) && this.f.equals(((fgu)object).f) && this.g.equals(((fgu)object).g) && this.h.equals(((fgu)object).h)) {
                int n2 = this.M;
                int n3 = ((fgu)object).M;
                if (n2 != 0) {
                    if (n2 == n3 && this.i == ((fgu)object).i && this.j == ((fgu)object).j && this.k == ((fgu)object).k && this.l == ((fgu)object).l && this.m.equals(((fgu)object).m) && this.n == ((fgu)object).n && this.o == ((fgu)object).o && this.p == ((fgu)object).p && this.q == ((fgu)object).q && this.r.equals(((fgu)object).r) && this.s == ((fgu)object).s && this.t == ((fgu)object).t && this.u.equals(((fgu)object).u) && this.v.equals(((fgu)object).v) && this.w.equals(((fgu)object).w) && fvd.z(this.x, ((fgu)object).x) && this.y == ((fgu)object).y && this.z.equals(((fgu)object).z) && this.A.equals(((fgu)object).A) && this.B.equals(((fgu)object).B) && this.C == ((fgu)object).C && this.D == ((fgu)object).D && this.E.equals(((fgu)object).E) && this.F.equals(((fgu)object).F) && this.G.equals(((fgu)object).G) && fvd.z(this.H, ((fgu)object).H) && this.I.equals(((fgu)object).I) && this.J.equals(((fgu)object).J) && this.K == ((fgu)object).K && this.L == ((fgu)object).L) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        int n3 = this.b.hashCode();
        int n4 = this.c.hashCode();
        int n5 = this.d.hashCode();
        int n6 = this.e.hashCode();
        int n7 = this.f.hashCode();
        int n8 = this.g.hashCode();
        int n9 = this.h.hashCode();
        int n10 = this.M;
        a.L(n10);
        boolean bl2 = this.j;
        int n11 = this.m.hashCode();
        int n12 = 1237;
        int n13 = true != bl2 ? 1237 : 1231;
        int n14 = true != this.i ? 1237 : 1231;
        int n15 = this.k;
        int n16 = this.l;
        Optional optional = this.r;
        bl2 = this.q;
        int n17 = optional.hashCode();
        int n18 = true != bl2 ? 1237 : 1231;
        int n19 = true != this.p ? 1237 : 1231;
        int n20 = true != this.o ? 1237 : 1231;
        int n21 = true != this.n ? 1237 : 1231;
        optional = this.u;
        bl2 = this.t;
        int n22 = optional.hashCode();
        int n23 = true != bl2 ? 1237 : 1231;
        int n24 = true != this.s ? 1237 : 1231;
        int n25 = this.v.hashCode();
        int n26 = this.w.hashCode();
        int n27 = this.x.hashCode();
        int n28 = true != this.y ? 1237 : 1231;
        int n29 = this.z.hashCode();
        int n30 = this.A.hashCode();
        int n31 = this.B.hashCode();
        int n32 = true != this.C ? 1237 : 1231;
        int n33 = true != this.D ? 1237 : 1231;
        int n34 = this.E.hashCode();
        int n35 = this.F.hashCode();
        int n36 = this.G.hashCode();
        int n37 = this.H.hashCode();
        int n38 = this.I.hashCode();
        int n39 = this.J.hashCode();
        int n40 = true != this.K ? 1237 : 1231;
        if (this.L) {
            n12 = 1231;
        }
        return ((((((((((((((((((((((((((((((((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n14) * 1000003 ^ n13) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n11) * 1000003 ^ n21) * 1000003 ^ n20) * 1000003 ^ n19) * 1000003 ^ n18) * 1000003 ^ n17) * 1000003 ^ n24) * 1000003 ^ n23) * 1000003 ^ n22) * 1000003 ^ n25) * 1000003 ^ n26) * 1000003 ^ n27) * 1000003 ^ n28) * 1000003 ^ n29) * 1000003 ^ n30) * 1000003 ^ n31) * 1000003 ^ n32) * 1000003 ^ n33) * 1000003 ^ n34) * 1000003 ^ n35) * 1000003 ^ n36) * 1000003 ^ n37) * 1000003 ^ n38) * 1000003 ^ n39) * 1000003 ^ n40) * 1000003 ^ n12;
    }

    public final String toString() {
        Object object = this.h;
        Object object2 = this.g;
        Object object3 = this.f;
        String string = String.valueOf(this.c);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        int n2 = this.M;
        object = n2 != 0 ? fde.c(n2) : "null";
        Object object4 = this.m;
        Object object5 = this.r;
        Object object6 = this.u;
        Object object7 = this.v;
        Object object8 = this.x;
        Object object9 = this.z;
        Object object10 = this.A;
        Object object11 = this.B;
        Object object12 = this.E;
        Object object13 = this.F;
        Object object14 = this.G;
        Object object15 = this.H;
        Object object16 = this.J;
        object4 = String.valueOf(object4);
        object5 = String.valueOf(object5);
        object6 = String.valueOf(object6);
        object7 = String.valueOf(object7);
        object8 = String.valueOf(object8);
        object9 = String.valueOf(object9);
        object10 = String.valueOf(object10);
        object11 = String.valueOf(object11);
        object12 = String.valueOf(object12);
        object13 = String.valueOf(object13);
        object14 = String.valueOf(object14);
        object15 = String.valueOf(object15);
        String string3 = String.valueOf(object16);
        object16 = new StringBuilder("TranscriptionParams{maxResults=");
        ((StringBuilder)object16).append(this.a);
        ((StringBuilder)object16).append(", language=");
        ((StringBuilder)object16).append(this.b);
        ((StringBuilder)object16).append(", additionalLanguages=");
        ((StringBuilder)object16).append(string);
        ((StringBuilder)object16).append(", triggerApplicationId=");
        ((StringBuilder)object16).append(this.d);
        ((StringBuilder)object16).append(", overrideTriggerApplicationId=");
        ((StringBuilder)object16).append(this.e);
        ((StringBuilder)object16).append(", entrypoint=");
        ((StringBuilder)object16).append((String)object3);
        ((StringBuilder)object16).append(", audioRecordingEncoding=");
        ((StringBuilder)object16).append((String)object2);
        ((StringBuilder)object16).append(", applicationDomain=");
        ((StringBuilder)object16).append(string2);
        ((StringBuilder)object16).append(", recognizerMode=");
        ((StringBuilder)object16).append((String)object);
        ((StringBuilder)object16).append(", preferOffline=");
        ((StringBuilder)object16).append(this.i);
        ((StringBuilder)object16).append(", enablePartialResults=");
        ((StringBuilder)object16).append(this.j);
        ((StringBuilder)object16).append(", minSpeechLengthMs=");
        ((StringBuilder)object16).append(this.k);
        ((StringBuilder)object16).append(", speechInputCompleteSilenceLengthMs=");
        ((StringBuilder)object16).append(this.l);
        ((StringBuilder)object16).append(", audioSource=");
        ((StringBuilder)object16).append((String)object4);
        boolean bl2 = this.L;
        boolean bl3 = this.K;
        string = this.I;
        boolean bl4 = this.D;
        boolean bl5 = this.C;
        boolean bl6 = this.y;
        object = this.w;
        boolean bl7 = this.t;
        boolean bl8 = this.s;
        boolean bl9 = this.q;
        boolean bl10 = this.p;
        boolean bl11 = this.o;
        boolean bl12 = this.n;
        ((StringBuilder)object16).append(", muteMicForTalkBack=");
        ((StringBuilder)object16).append(bl12);
        ((StringBuilder)object16).append(", multiSegment=");
        ((StringBuilder)object16).append(bl11);
        ((StringBuilder)object16).append(", requestSodaEvent=");
        ((StringBuilder)object16).append(bl10);
        ((StringBuilder)object16).append(", profanityFilter=");
        ((StringBuilder)object16).append(bl9);
        ((StringBuilder)object16).append(", enableFormatting=");
        ((StringBuilder)object16).append((String)object5);
        ((StringBuilder)object16).append(", hidePartialTrailingPunctuation=");
        ((StringBuilder)object16).append(bl8);
        ((StringBuilder)object16).append(", muteAudioBeeps=");
        ((StringBuilder)object16).append(bl7);
        ((StringBuilder)object16).append(", attributionSource=");
        ((StringBuilder)object16).append((String)object6);
        ((StringBuilder)object16).append(", diarizationConfig=");
        ((StringBuilder)object16).append((String)object7);
        ((StringBuilder)object16).append(", languageModel=");
        ((StringBuilder)object16).append((String)object);
        ((StringBuilder)object16).append(", biasingStrings=");
        ((StringBuilder)object16).append((String)object8);
        ((StringBuilder)object16).append(", enableDeviceContextBiasing=");
        ((StringBuilder)object16).append(bl6);
        ((StringBuilder)object16).append(", langIdConfig=");
        ((StringBuilder)object16).append((String)object9);
        ((StringBuilder)object16).append(", multilangConfig=");
        ((StringBuilder)object16).append((String)object10);
        ((StringBuilder)object16).append(", aiCoreConfig=");
        ((StringBuilder)object16).append((String)object11);
        ((StringBuilder)object16).append(", requestWordTiming=");
        ((StringBuilder)object16).append(bl5);
        ((StringBuilder)object16).append(", requestWordConfidence=");
        ((StringBuilder)object16).append(bl4);
        ((StringBuilder)object16).append(", hostAppId=");
        ((StringBuilder)object16).append((String)object12);
        ((StringBuilder)object16).append(", prebuiltBiasingConfig=");
        ((StringBuilder)object16).append((String)object13);
        ((StringBuilder)object16).append(", s3DataDonationRequest=");
        ((StringBuilder)object16).append((String)object14);
        ((StringBuilder)object16).append(", experimentIds=");
        ((StringBuilder)object16).append((String)object15);
        ((StringBuilder)object16).append(", s3SecondaryRouting=");
        ((StringBuilder)object16).append(string);
        ((StringBuilder)object16).append(", onDeviceRecognitionContext=");
        ((StringBuilder)object16).append(string3);
        ((StringBuilder)object16).append(", enableReuseSodaInstance=");
        ((StringBuilder)object16).append(bl3);
        ((StringBuilder)object16).append(", enablePartialAlignments=");
        ((StringBuilder)object16).append(bl2);
        ((StringBuilder)object16).append("}");
        return ((StringBuilder)object16).toString();
    }
}

