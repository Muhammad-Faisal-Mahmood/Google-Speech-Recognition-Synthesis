/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class bsm
extends bso {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final gzx g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final bua k;
    public final btz l;
    public final bty m;
    public final buc n;
    public final String o;
    public final float p;
    public final float q;
    public final boolean r;
    public final gzx s;
    public final int t;

    public bsm(String string, String string2, String string3, String string4, String string5, int n2, String string6, gzx gzx2, boolean bl2, boolean bl3, int n3, bua bua2, btz btz2, bty bty2, buc buc2, String string7, float f2, float f3, boolean bl4, gzx gzx3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.t = n2;
        this.f = string6;
        this.g = gzx2;
        this.h = bl2;
        this.i = bl3;
        this.j = n3;
        this.k = bua2;
        this.l = btz2;
        this.m = bty2;
        this.n = buc2;
        this.o = string7;
        this.p = f2;
        this.q = f3;
        this.r = bl4;
        this.s = gzx3;
    }

    @Override
    public final float a() {
        return this.q;
    }

    @Override
    public final float b() {
        return this.p;
    }

    @Override
    public final int c() {
        return this.j;
    }

    @Override
    public final bsn d() {
        return new bsn(this);
    }

    @Override
    public final bty e() {
        return this.m;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bso) {
            object = (bso)object;
            String string = this.a;
            if ((string == null ? ((bso)object).k() == null : string.equals(((bso)object).k())) && this.b.equals(((bso)object).m()) && this.c.equals(((bso)object).l()) && ((string = this.d) == null ? ((bso)object).p() == null : string.equals(((bso)object).p())) && ((string = this.e) == null ? ((bso)object).n() == null : string.equals(((bso)object).n())) && this.t == ((bso)object).u() && ((string = this.f) == null ? ((bso)object).o() == null : string.equals(((bso)object).o())) && fvd.z(this.g, ((bso)object).j()) && this.h == ((bso)object).r() && this.i == ((bso)object).s() && this.j == ((bso)object).c() && this.k.equals(((bso)object).g()) && this.l.equals(((bso)object).f()) && this.m.equals(((bso)object).e()) && this.n.equals(((bso)object).h()) && ((string = this.o) == null ? ((bso)object).q() == null : string.equals(((bso)object).q())) && Float.floatToIntBits(this.p) == Float.floatToIntBits(((bso)object).b()) && Float.floatToIntBits(this.q) == Float.floatToIntBits(((bso)object).a()) && this.r == ((bso)object).t() && fvd.z(this.s, ((bso)object).i())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final btz f() {
        return this.l;
    }

    @Override
    public final bua g() {
        return this.k;
    }

    @Override
    public final buc h() {
        return this.n;
    }

    public final int hashCode() {
        int n2;
        int n3;
        Object object = this.a;
        int n4 = 0;
        int n5 = object == null ? 0 : ((String)object).hashCode();
        int n6 = this.b.hashCode();
        int n7 = this.c.hashCode();
        object = this.d;
        int n8 = object == null ? 0 : ((String)object).hashCode();
        object = this.e;
        int n9 = object == null ? 0 : ((String)object).hashCode();
        int n10 = this.t;
        a.L(n10);
        object = this.f;
        int n11 = object == null ? 0 : ((String)object).hashCode();
        int n12 = this.g.hashCode();
        boolean bl2 = this.h;
        int n13 = 1237;
        int n14 = true != bl2 ? 1237 : 1231;
        int n15 = true != this.i ? 1237 : 1231;
        int n16 = this.j;
        int n17 = this.k.hashCode();
        int n18 = this.l.hashCode();
        int n19 = this.m.hashCode();
        object = this.n;
        if (((hwv)object).B()) {
            n3 = ((hwv)object).i();
        } else {
            n3 = n2 = ((hwv)object).memoizedHashCode;
            if (n2 == 0) {
                ((hwv)object).memoizedHashCode = n3 = ((hwv)object).i();
            }
        }
        object = this.o;
        if (object != null) {
            n4 = ((String)object).hashCode();
        }
        int n20 = Float.floatToIntBits(this.p);
        n2 = Float.floatToIntBits(this.q);
        if (this.r) {
            n13 = 1231;
        }
        return (((((((((((((((((((n5 ^ 0xF4243) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n20) * 1000003 ^ n2) * 1000003 ^ n13) * 1000003 ^ this.s.hashCode();
    }

    @Override
    public final gzx i() {
        return this.s;
    }

    @Override
    public final gzx j() {
        return this.g;
    }

    @Override
    public final String k() {
        return this.a;
    }

    @Override
    public final String l() {
        return this.c;
    }

    @Override
    public final String m() {
        return this.b;
    }

    @Override
    public final String n() {
        return this.e;
    }

    @Override
    public final String o() {
        return this.f;
    }

    @Override
    public final String p() {
        return this.d;
    }

    @Override
    public final String q() {
        return this.o;
    }

    @Override
    public final boolean r() {
        return this.h;
    }

    @Override
    public final boolean s() {
        return this.i;
    }

    @Override
    public final boolean t() {
        return this.r;
    }

    public final String toString() {
        Serializable serializable = this.s;
        Object object = this.n;
        Object object2 = this.m;
        Object object3 = this.l;
        Object object4 = this.k;
        Object object5 = this.g;
        String string = Integer.toString(a.x(this.t));
        object5 = object5.toString();
        object4 = object4.toString();
        object3 = object3.toString();
        object2 = object2.toString();
        object = object.toString();
        String string2 = serializable.toString();
        serializable = new StringBuilder("InternalVoice{absoluteFilePath=");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(", name=");
        ((StringBuilder)serializable).append(this.b);
        ((StringBuilder)serializable).append(", externalName=");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append(", speakerName=");
        ((StringBuilder)serializable).append(this.d);
        ((StringBuilder)serializable).append(", parentName=");
        ((StringBuilder)serializable).append(this.e);
        ((StringBuilder)serializable).append(", voiceGender=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", serverName=");
        ((StringBuilder)serializable).append(this.f);
        ((StringBuilder)serializable).append(", locales=");
        ((StringBuilder)serializable).append((String)object5);
        ((StringBuilder)serializable).append(", available=");
        ((StringBuilder)serializable).append(this.h);
        ((StringBuilder)serializable).append(", isDefaultVoiceForLocale=");
        ((StringBuilder)serializable).append(this.i);
        ((StringBuilder)serializable).append(", revision=");
        ((StringBuilder)serializable).append(this.j);
        ((StringBuilder)serializable).append(", voiceType=");
        ((StringBuilder)serializable).append((String)object4);
        ((StringBuilder)serializable).append(", voicePlatform=");
        ((StringBuilder)serializable).append((String)object3);
        ((StringBuilder)serializable).append(", usage=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", metadata=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", voicepackName=");
        ((StringBuilder)serializable).append(this.o);
        ((StringBuilder)serializable).append(", durationScaleLow=");
        ((StringBuilder)serializable).append(this.p);
        ((StringBuilder)serializable).append(", durationScaleHigh=");
        ((StringBuilder)serializable).append(this.q);
        ((StringBuilder)serializable).append(", supportsTimepointing=");
        ((StringBuilder)serializable).append(this.r);
        ((StringBuilder)serializable).append(", features=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }

    @Override
    public final int u() {
        return this.t;
    }
}

