/*
 * Decompiled with CFR 0.152.
 */
public final class bsn {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public gzx g;
    public boolean h;
    public int i;
    public bua j;
    public btz k;
    public bty l;
    public buc m;
    public String n;
    public float o;
    public float p;
    public boolean q;
    public gzx r;
    public byte s;
    public int t;
    private boolean u;

    public bsn() {
    }

    public bsn(bso bso2) {
        bso2 = (bsm)bso2;
        this.a = ((bsm)bso2).a;
        this.b = ((bsm)bso2).b;
        this.c = ((bsm)bso2).c;
        this.d = ((bsm)bso2).d;
        this.e = ((bsm)bso2).e;
        this.t = ((bsm)bso2).t;
        this.f = ((bsm)bso2).f;
        this.g = ((bsm)bso2).g;
        this.u = ((bsm)bso2).h;
        this.h = ((bsm)bso2).i;
        this.i = ((bsm)bso2).j;
        this.j = ((bsm)bso2).k;
        this.k = ((bsm)bso2).l;
        this.l = ((bsm)bso2).m;
        this.m = ((bsm)bso2).n;
        this.n = ((bsm)bso2).o;
        this.o = ((bsm)bso2).p;
        this.p = ((bsm)bso2).q;
        this.q = ((bsm)bso2).r;
        this.r = ((bsm)bso2).s;
        this.s = (byte)63;
    }

    public final bso a() {
        gzx gzx2;
        Object object;
        bty bty2;
        btz btz2;
        bua bua2;
        gzx gzx3;
        int n2;
        String string;
        String string2;
        if (this.s == 63 && (string2 = this.b) != null && (string = this.c) != null && (n2 = this.t) != 0 && (gzx3 = this.g) != null && (bua2 = this.j) != null && (btz2 = this.k) != null && (bty2 = this.l) != null && (object = this.m) != null && (gzx2 = this.r) != null) {
            return new bsm(this.a, string2, string, this.d, this.e, n2, this.f, gzx3, this.u, this.h, this.i, bua2, btz2, bty2, (buc)object, this.n, this.o, this.p, this.q, gzx2);
        }
        object = new StringBuilder();
        if (this.b == null) {
            ((StringBuilder)object).append(" name");
        }
        if (this.c == null) {
            ((StringBuilder)object).append(" externalName");
        }
        if (this.t == 0) {
            ((StringBuilder)object).append(" voiceGender");
        }
        if (this.g == null) {
            ((StringBuilder)object).append(" locales");
        }
        if ((this.s & 1) == 0) {
            ((StringBuilder)object).append(" available");
        }
        if ((this.s & 2) == 0) {
            ((StringBuilder)object).append(" isDefaultVoiceForLocale");
        }
        if ((this.s & 4) == 0) {
            ((StringBuilder)object).append(" revision");
        }
        if (this.j == null) {
            ((StringBuilder)object).append(" voiceType");
        }
        if (this.k == null) {
            ((StringBuilder)object).append(" voicePlatform");
        }
        if (this.l == null) {
            ((StringBuilder)object).append(" usage");
        }
        if (this.m == null) {
            ((StringBuilder)object).append(" metadata");
        }
        if ((this.s & 8) == 0) {
            ((StringBuilder)object).append(" durationScaleLow");
        }
        if ((this.s & 0x10) == 0) {
            ((StringBuilder)object).append(" durationScaleHigh");
        }
        if ((this.s & 0x20) == 0) {
            ((StringBuilder)object).append(" supportsTimepointing");
        }
        if (this.r == null) {
            ((StringBuilder)object).append(" features");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(boolean bl2) {
        this.u = bl2;
        this.s = (byte)(this.s | 1);
    }
}

