/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class adu {
    public static final int L = 0;
    public final byte[] A;
    public final int B;
    public final adm C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    private int M;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final aek l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final adq s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new adu(new adt());
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
        agf.z(7);
        agf.z(8);
        agf.z(9);
        agf.z(10);
        agf.z(11);
        agf.z(12);
        agf.z(13);
        agf.z(14);
        agf.z(15);
        agf.z(16);
        agf.z(17);
        agf.z(18);
        agf.z(19);
        agf.z(20);
        agf.z(21);
        agf.z(22);
        agf.z(23);
        agf.z(24);
        agf.z(25);
        agf.z(26);
        agf.z(27);
        agf.z(28);
        agf.z(29);
        agf.z(30);
        agf.z(31);
        agf.z(32);
        agf.z(33);
    }

    public adu(adt object) {
        block13: {
            int n2;
            int n3;
            Object object22;
            int n4;
            List list;
            block10: {
                boolean bl2;
                block12: {
                    block11: {
                        block9: {
                            block8: {
                                this.a = ((adt)object).a;
                                list = agf.t(((adt)object).d);
                                this.d = list;
                                ((adt)object).c.isEmpty();
                                bl2 = ((adt)object).c.isEmpty();
                                n4 = 0;
                                if (bl2) break block9;
                                this.c = ((adt)object).c;
                                List list2 = ((adt)object).c;
                                for (Object object22 : list2) {
                                    if (!TextUtils.equals((CharSequence)((adw)object22).a, (CharSequence)((Object)list))) continue;
                                    list = ((adw)object22).b;
                                    break block8;
                                }
                                list = ((adw)list2.get((int)0)).b;
                            }
                            this.b = null;
                            break block10;
                        }
                        if (!((adt)object).c.isEmpty()) break block11;
                        bl2 = true;
                        break block12;
                    }
                    if (((adt)object).c.size() > 0) break block13;
                    bl2 = false;
                }
                abr.f(bl2);
                this.c = ((adt)object).c;
                this.b = null;
            }
            this.e = 0;
            abr.g(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
            this.f = 0;
            this.g = 0;
            this.h = n3 = ((adt)object).h;
            this.i = n2 = ((adt)object).i;
            if (n2 != -1) {
                n3 = n2;
            }
            this.j = n3;
            this.k = null;
            this.l = ((adt)object).k;
            this.m = null;
            this.n = null;
            this.o = ((adt)object).m;
            this.p = ((adt)object).n;
            this.q = -1;
            object22 = ((adt)object).p;
            list = object22;
            if (object22 == null) {
                list = Collections.emptyList();
            }
            this.r = list;
            this.s = null;
            this.t = ((adt)object).r;
            this.u = false;
            this.v = -1;
            this.w = -1;
            this.x = -1.0f;
            this.y = 0;
            this.z = 1.0f;
            this.A = null;
            this.B = -1;
            this.C = null;
            this.D = ((adt)object).B;
            this.E = ((adt)object).C;
            this.F = ((adt)object).D;
            n3 = n2 = ((adt)object).E;
            if (n2 == -1) {
                n3 = 0;
            }
            this.G = n3;
            n3 = ((adt)object).F;
            if (n3 == -1) {
                n3 = n4;
            }
            this.H = n3;
            this.I = -1;
            this.J = 1;
            this.K = ((adt)object).I;
            return;
        }
        object = ((adw)((adt)object).c.get((int)0)).b;
        throw null;
    }

    public final int a() {
        return -1;
    }

    public final adu b(int n2) {
        adt adt2 = new adt(this);
        adt2.I = n2;
        return new adu(adt2);
    }

    public final boolean c(adu adu2) {
        if (this.r.size() == adu2.r.size()) {
            for (int i2 = 0; i2 < this.r.size(); ++i2) {
                if (Arrays.equals((byte[])this.r.get(i2), (byte[])adu2.r.get(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            int n2;
            object = (adu)object;
            int n3 = this.M;
            if (n3 != 0 && (n2 = ((adu)object).M) != 0 && n3 != n2) {
                return false;
            }
            if (this.h == ((adu)object).h && this.i == ((adu)object).i && this.p == ((adu)object).p && this.t == ((adu)object).t && this.D == ((adu)object).D && this.E == ((adu)object).E && this.F == ((adu)object).F && this.G == ((adu)object).G && this.H == ((adu)object).H && this.K == ((adu)object).K && Float.compare(-1.0f, -1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Objects.equals(this.a, ((adu)object).a) && Objects.equals(null, null) && this.c.equals(((adu)object).c) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(this.o, ((adu)object).o) && Objects.equals(this.d, ((adu)object).d) && Arrays.equals(null, null) && Objects.equals(this.l, ((adu)object).l) && Objects.equals(null, null) && Objects.equals(null, null) && this.c((adu)object) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.M;
        if (n2 == 0) {
            Object object = this.a;
            int n4 = 0;
            n3 = object == null ? 0 : ((String)object).hashCode();
            int n5 = this.c.hashCode();
            object = this.d;
            n2 = object == null ? 0 : ((String)object).hashCode();
            int n6 = this.h;
            int n7 = this.i;
            object = this.l;
            int n8 = object == null ? 0 : ((aek)object).hashCode();
            object = this.o;
            if (object != null) {
                n4 = ((String)object).hashCode();
            }
            this.M = n3 = ((((((((((((((((((((((n3 + 527) * 961 + n5) * 31 + n2) * 923521 + n6) * 31 + n7) * 961 + n8) * 29791 + n4) * 31 + this.p) * 31 + (int)this.t) * 31 - 1) * 31 - 1) * 31 + Float.floatToIntBits(-1.0f)) * 961 + Float.floatToIntBits(1.0f)) * 31 - 1) * 31 + this.D) * 31 + this.E) * 31 + this.F) * 31 + this.G) * 31 + this.H) * 31 - 1) * 31 - 1) * 31 - 1) * 31 + this.K;
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Format(");
        stringBuilder.append(this.a);
        stringBuilder.append(", null, null, ");
        stringBuilder.append(this.o);
        stringBuilder.append(", null, ");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(", [-1, -1, -1.0, null], [");
        stringBuilder.append(this.D);
        stringBuilder.append(", ");
        stringBuilder.append(this.E);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }
}

