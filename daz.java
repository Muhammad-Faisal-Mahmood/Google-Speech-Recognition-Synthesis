/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class daz
extends dcm {
    private final gzx b;
    private final gzx c;
    private final gzx d;
    private final gzx e;
    private final boolean f;
    private final boolean g;
    private final byte[] h;
    private volatile transient String i;

    public daz(gzx gzx2, gzx gzx3, gzx gzx4, gzx gzx5, boolean bl2, boolean bl3, byte[] byArray) {
        if (gzx2 != null) {
            this.b = gzx2;
            if (gzx3 != null) {
                this.c = gzx3;
                if (gzx4 != null) {
                    this.d = gzx4;
                    if (gzx5 != null) {
                        this.e = gzx5;
                        this.f = bl2;
                        this.g = bl3;
                        this.h = byArray;
                        return;
                    }
                    throw new NullPointerException("Null removed");
                }
                throw new NullPointerException("Null added");
            }
            throw new NullPointerException("Null newSelection");
        }
        throw new NullPointerException("Null oldSelection");
    }

    @Override
    public final gzx a() {
        return this.d;
    }

    @Override
    public final gzx b() {
        return this.c;
    }

    @Override
    public final gzx c() {
        return this.b;
    }

    @Override
    public final gzx d() {
        return this.e;
    }

    @Override
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object object) {
        byte[] byArray;
        if (object == this) {
            return true;
        }
        return object instanceof dcm && fvd.z(this.b, ((dcm)(object = (dcm)object)).c()) && fvd.z(this.c, ((dcm)object).b()) && fvd.z(this.d, ((dcm)object).a()) && fvd.z(this.e, ((dcm)object).d()) && this.f == ((dcm)object).e() && this.g == ((dcm)object).f() && Arrays.equals(byArray = this.h, (byte[])(object = object instanceof daz ? (Object)((daz)object).h : (Object)((dcm)object).g()));
    }

    @Override
    public final boolean f() {
        return this.g;
    }

    @Override
    public final byte[] g() {
        return this.h;
    }

    public final int hashCode() {
        int n2 = this.b.hashCode();
        int n3 = this.c.hashCode();
        int n4 = this.d.hashCode();
        int n5 = this.e.hashCode();
        boolean bl2 = this.f;
        int n6 = 1237;
        int n7 = true != bl2 ? 1237 : 1231;
        if (this.g) {
            n6 = 1231;
        }
        return ((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n7) * 1000003 ^ n6) * 1000003 ^ Arrays.hashCode(this.h);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.i != null) return this.i;
        synchronized (this) {
            if (this.i != null) return this.i;
            Object object = new gtn("");
            ((gtn)object).b("old", this.b);
            ((gtn)object).b("new", this.c);
            boolean bl2 = this.h != null;
            ((gtn)object).g("metadata", bl2);
            ((gtn)object).g("last batch", this.g);
            this.i = ((gtn)object).toString();
            if (this.i != null) {
                return this.i;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

