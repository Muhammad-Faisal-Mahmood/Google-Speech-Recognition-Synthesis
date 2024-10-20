/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class dax
extends dbu {
    public final gzx a;
    public final boolean b;
    public final byte[] c;
    private volatile transient gzx e;
    private volatile transient String f;

    public dax(gzx gzx2, boolean bl2, byte[] byArray) {
        if (gzx2 != null) {
            this.a = gzx2;
            this.b = bl2;
            this.c = byArray;
            return;
        }
        throw new NullPointerException("Null slices");
    }

    @Override
    public final gzx a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return this.b;
    }

    @Override
    public final byte[] c() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gzx d() {
        if (this.e != null) return this.e;
        synchronized (this) {
            Object object;
            if (this.e != null) return this.e;
            if (this.a.isEmpty()) {
                object = hct.a;
            } else {
                object = gzx.g(((hct)this.a).c);
                gzx gzx2 = this.a;
                int n2 = ((hct)gzx2).c;
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((gzs)object).h(((der)gzx2.get(i2)).f());
                }
                object = ((gzs)object).g();
            }
            this.e = object;
            if (this.e != null) {
                return this.e;
            }
            object = new NullPointerException("packManifests() cannot return null");
            throw object;
        }
    }

    public final boolean equals(Object object) {
        byte[] byArray;
        if (object == this) {
            return true;
        }
        return object instanceof dbu && fvd.z(this.a, ((dbu)(object = (dbu)object)).a()) && this.b == ((dbu)object).b() && Arrays.equals(byArray = this.c, (byte[])(object = object instanceof dax ? (Object)((dax)object).c : (Object)((dbu)object).c()));
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.b ? 1237 : 1231;
        return ((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ Arrays.hashCode(this.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.f != null) return this.f;
        synchronized (this) {
            if (this.f != null) return this.f;
            Object object = new gtn("");
            ((gtn)object).b("slices", this.a);
            ((gtn)object).g("last batch", this.b);
            boolean bl2 = this.c != null;
            ((gtn)object).g("sync metadata", bl2);
            this.f = ((gtn)object).toString();
            if (this.f != null) {
                return this.f;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

