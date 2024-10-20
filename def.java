/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

public final class def
extends den {
    public final ded a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final gzx h;
    public final gzx i;
    public final String j;
    public final boolean k;
    public final Date l;
    public final hac m;
    public volatile transient String n;
    private volatile transient ddm r;
    private volatile transient ddn s;

    public def(ded ded2, String string, String string2, long l2, long l3, int n2, int n3, gzx gzx2, gzx gzx3, String string3, boolean bl2, Date date, hac hac2) {
        this.a = ded2;
        if (string != null) {
            this.b = string;
            if (string2 != null) {
                this.c = string2;
                this.d = l2;
                this.e = l3;
                this.f = n2;
                this.g = n3;
                if (gzx2 != null) {
                    this.h = gzx2;
                    if (gzx3 != null) {
                        this.i = gzx3;
                        this.j = string3;
                        this.k = bl2;
                        if (date != null) {
                            this.l = date;
                            if (hac2 != null) {
                                this.m = hac2;
                                return;
                            }
                            throw new NullPointerException("Null extraMap");
                        }
                        throw new NullPointerException("Null expiryDate");
                    }
                    throw new NullPointerException("Null validationSchemes");
                }
                throw new NullPointerException("Null downloadUrls");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null namespace");
    }

    @Override
    public final int a() {
        return this.g;
    }

    @Override
    public final int b() {
        return this.f;
    }

    @Override
    public final long c() {
        return this.e;
    }

    @Override
    public final long d() {
        return this.d;
    }

    @Override
    public final ded e() {
        return this.a;
    }

    @Override
    public final dem f() {
        return new dem(this);
    }

    @Override
    public final gzx g() {
        return this.h;
    }

    @Override
    public final gzx h() {
        return this.i;
    }

    @Override
    public final String i() {
        return this.c;
    }

    @Override
    public final String j() {
        return this.b;
    }

    @Override
    public final String k() {
        return this.j;
    }

    @Override
    public final Date l() {
        return this.l;
    }

    @Override
    public final boolean m() {
        return this.k;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ddm n() {
        if (this.r != null) return this.r;
        synchronized (this) {
            if (this.r != null) return this.r;
            Object object = new ddl();
            ((ddl)object).c(this.m);
            this.r = ((ddl)object).a();
            if (this.r != null) {
                return this.r;
            }
            object = new NullPointerException("extras() cannot return null");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ddn o() {
        if (this.s != null) return this.s;
        synchronized (this) {
            if (this.s != null) return this.s;
            String string = this.b;
            Object object = this.c;
            dco dco2 = new dco(string, (String)object);
            this.s = dco2;
            if (this.s != null) {
                return this.s;
            }
            object = new NullPointerException("qualifiedName() cannot return null");
            throw object;
        }
    }
}

