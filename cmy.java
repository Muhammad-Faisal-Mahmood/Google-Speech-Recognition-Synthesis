/*
 * Decompiled with CFR 0.152.
 */
public final class cmy {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final iex f;
    public final boolean g;
    public final idq h;
    public final int i;
    public final hvu j;
    public final String k;
    public final cmt l;
    public final idt m;
    public final iep n;
    public final ies o;
    public final iem p;
    public final iew q;
    public final idr r;
    public final iel s;
    public final String t;
    public final String u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final giu y;

    public cmy() {
        throw null;
    }

    public cmy(String string, String string2, String string3, boolean bl2, boolean bl3, iex iex2, boolean bl4, idq idq2, int n2, hvu hvu2, String string4, cmt cmt2, giu giu2, idt idt2, iep iep2, ies ies2, iem iem2, iew iew2, idr idr2, iel iel2, String string5, String string6, String string7, boolean bl5, boolean bl6) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bl2;
        this.e = bl3;
        this.f = iex2;
        this.g = bl4;
        this.h = idq2;
        this.i = n2;
        this.j = hvu2;
        this.k = string4;
        this.l = cmt2;
        this.y = giu2;
        this.m = idt2;
        this.n = iep2;
        this.o = ies2;
        this.p = iem2;
        this.q = iew2;
        this.r = idr2;
        this.s = iel2;
        this.t = string5;
        this.u = string6;
        this.v = string7;
        this.w = bl5;
        this.x = bl6;
    }

    public static cmx a() {
        cmx cmx2 = new cmx();
        cmx2.a = "";
        cmx2.o = (short)((short)((short)((short)((short)((short)(cmx2.o | 1) | 2) | 4) | 8) | 0x10) | 0x20);
        cmx2.g(true);
        cmx2.c(false);
        hvu hvu2 = hvu.b;
        if (hvu2 != null) {
            cmx2.d = hvu2;
            cmx2.e(false);
            cmx2.o = (short)((short)(cmx2.o | 0x200) | 0x400);
            cmx2.a(idq.b);
            cmx2.c = 1;
            cmx2.o = (short)((short)(cmx2.o | 0x800) | 0x1000);
            cmx2.f("");
            cmx2.n = "";
            cmx2.o = (short)(cmx2.o | 0x2000);
            cmx2.h("");
            cmx2.b(false);
            cmx2.d(false);
            return cmx2;
        }
        throw new NullPointerException("Null hotwordModel");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cmy) {
            Object object2;
            object = (cmy)object;
            if (this.a.equals(((cmy)object).a) && this.b.equals(((cmy)object).b) && this.c.equals(((cmy)object).c) && this.d == ((cmy)object).d && this.e == ((cmy)object).e && ((object2 = this.f) == null ? ((cmy)object).f == null : ((Enum)object2).equals(((cmy)object).f)) && this.g == ((cmy)object).g && this.h.equals(((cmy)object).h) && this.i == ((cmy)object).i && this.j.equals(((cmy)object).j) && ((object2 = this.k) == null ? ((cmy)object).k == null : ((String)object2).equals(((cmy)object).k)) && ((object2 = this.l) == null ? ((cmy)object).l == null : object2.equals(((cmy)object).l)) && ((object2 = this.y) == null ? ((cmy)object).y == null : object2.equals(((cmy)object).y)) && ((object2 = this.m) == null ? ((cmy)object).m == null : ((hwv)object2).equals(((cmy)object).m)) && ((object2 = this.n) == null ? ((cmy)object).n == null : ((hwv)object2).equals(((cmy)object).n)) && ((object2 = this.o) == null ? ((cmy)object).o == null : ((hwv)object2).equals(((cmy)object).o)) && ((object2 = this.p) == null ? ((cmy)object).p == null : ((hwv)object2).equals(((cmy)object).p)) && ((object2 = this.q) == null ? ((cmy)object).q == null : ((hwv)object2).equals(((cmy)object).q)) && ((object2 = this.r) == null ? ((cmy)object).r == null : ((hwv)object2).equals(((cmy)object).r)) && ((object2 = this.s) == null ? ((cmy)object).s == null : ((hwv)object2).equals(((cmy)object).s)) && this.t.equals(((cmy)object).t) && this.u.equals(((cmy)object).u) && this.v.equals(((cmy)object).v) && this.w == ((cmy)object).w && this.x == ((cmy)object).x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = this.a.hashCode();
        int n10 = this.b.hashCode();
        int n11 = this.c.hashCode();
        Object object = this.f;
        int n12 = 0;
        int n13 = object == null ? 0 : ((Enum)object).hashCode();
        boolean bl2 = this.e;
        boolean bl3 = this.d;
        int n14 = 1231;
        int n15 = true != bl2 ? 1237 : 1231;
        int n16 = true != bl3 ? 1237 : 1231;
        int n17 = true != this.g ? 1237 : 1231;
        int n18 = this.h.hashCode();
        int n19 = this.i;
        int n20 = this.j.hashCode();
        object = this.k;
        int n21 = object == null ? 0 : ((String)object).hashCode();
        object = this.l;
        int n22 = object == null ? 0 : object.hashCode();
        object = this.y;
        int n23 = object == null ? 0 : object.hashCode();
        object = this.m;
        if (object == null) {
            n8 = 0;
        } else if (((hwv)object).B()) {
            n8 = ((hwv)object).i();
        } else {
            n7 = n8 = ((hwv)object).memoizedHashCode;
            if (n8 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n8 = n7;
        }
        object = this.n;
        if (object == null) {
            n6 = 0;
        } else if (((hwv)object).B()) {
            n6 = ((hwv)object).i();
        } else {
            n7 = n6 = ((hwv)object).memoizedHashCode;
            if (n6 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n6 = n7;
        }
        object = this.o;
        if (object == null) {
            n5 = 0;
        } else if (((hwv)object).B()) {
            n5 = ((hwv)object).i();
        } else {
            n7 = n5 = ((hwv)object).memoizedHashCode;
            if (n5 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n5 = n7;
        }
        object = this.p;
        if (object == null) {
            n4 = 0;
        } else if (((hwv)object).B()) {
            n4 = ((hwv)object).i();
        } else {
            n7 = n4 = ((hwv)object).memoizedHashCode;
            if (n4 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n4 = n7;
        }
        object = this.q;
        if (object == null) {
            n3 = 0;
        } else if (((hwv)object).B()) {
            n3 = ((hwv)object).i();
        } else {
            n7 = n3 = ((hwv)object).memoizedHashCode;
            if (n3 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n3 = n7;
        }
        object = this.r;
        if (object == null) {
            n2 = 0;
        } else if (((hwv)object).B()) {
            n2 = ((hwv)object).i();
        } else {
            n7 = n2 = ((hwv)object).memoizedHashCode;
            if (n2 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
            n2 = n7;
        }
        object = this.s;
        if (object == null) {
            n7 = n12;
        } else if (((hwv)object).B()) {
            n7 = ((hwv)object).i();
        } else {
            n7 = n12 = ((hwv)object).memoizedHashCode;
            if (n12 == 0) {
                ((hwv)object).memoizedHashCode = n7 = ((hwv)object).i();
            }
        }
        int n24 = this.t.hashCode();
        int n25 = this.u.hashCode();
        int n26 = this.v.hashCode();
        n12 = true != this.w ? 1237 : 1231;
        if (!this.x) {
            n14 = 1237;
        }
        return ((((((((((((((((((((((((((((((((((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ n16) * 1000003 ^ n15) * 1000003 ^ n13) * 1000003 ^ n17) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ 0x4D5) * 1000003 ^ n20) * 1000003 ^ n21) * 1000003 ^ n22) * 1000003 ^ n23) * 1000003 ^ n8) * 1000003 ^ n6) * 1000003 ^ n5) * 1000003 ^ n4) * 1000003 ^ n3) * 1000003 ^ n2) * 1000003 ^ n7) * 1000003 ^ n24) * 1000003 ^ n25) * 1000003 ^ 0x4D5) * 1000003 ^ n26) * 1000003 ^ n12) * 1000003 ^ n14;
    }

    public final String toString() {
        Object object = this.s;
        Object object2 = this.r;
        Object object3 = this.q;
        Object object4 = this.p;
        Object object5 = this.o;
        Object object6 = this.n;
        Object object7 = this.m;
        Object object8 = this.y;
        Object object9 = this.l;
        Object object10 = this.j;
        Object object11 = this.h;
        String string = String.valueOf(this.f);
        object11 = String.valueOf(object11);
        object10 = String.valueOf(object10);
        object9 = String.valueOf(object9);
        object8 = String.valueOf(object8);
        object7 = String.valueOf(object7);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("SodaParams{sodaResourcesDir=");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(", sodaCacheDir=");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", hotwordModelPath=");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append(", expectAsrAfterHotword=false, requireHotword=false, addHotwordBuffer=false, resetOnFinalResult=false, attachQueryAudio=false, uploadAudiosToServer=false, maskOffensiveWords=");
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append(", enableLongform=");
        ((StringBuilder)object).append(this.e);
        ((StringBuilder)object).append(", enableFormatting=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", hidePartialTrailingPunctuation=");
        ((StringBuilder)object).append(this.g);
        ((StringBuilder)object).append(", forceDisableOpenMic=false, forceDisableSpeakerVerification=false, applicationDomain=");
        ((StringBuilder)object).append((String)object11);
        ((StringBuilder)object).append(", channelCount=");
        ((StringBuilder)object).append(this.i);
        ((StringBuilder)object).append(", boostRecognizerPriority=false, hotwordModel=");
        ((StringBuilder)object).append((String)object10);
        ((StringBuilder)object).append(", locale=");
        ((StringBuilder)object).append(this.k);
        ((StringBuilder)object).append(", sodaCallback=");
        ((StringBuilder)object).append((String)object9);
        ((StringBuilder)object).append(", sodaDataProvider=");
        ((StringBuilder)object).append((String)object8);
        ((StringBuilder)object).append(", clientInfo=");
        ((StringBuilder)object).append((String)object7);
        ((StringBuilder)object).append(", diarizationConfig=");
        ((StringBuilder)object).append((String)object6);
        ((StringBuilder)object).append(", langIdConfig=");
        ((StringBuilder)object).append((String)object5);
        ((StringBuilder)object).append(", audioDumpConfig=");
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(", multilangConfig=");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(", audioOutputConfig=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", aiCoreConfig=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", languageModel=");
        boolean bl2 = this.x;
        boolean bl3 = this.w;
        string = this.v;
        object11 = this.u;
        ((StringBuilder)object).append(this.t);
        ((StringBuilder)object).append(", tisidModelPath=");
        ((StringBuilder)object).append((String)object11);
        ((StringBuilder)object).append(", tisidStandaloneRuntimePreferred=false, personalizedResourcesDir=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", enableConcurrency=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", enablePartialAlignments=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

