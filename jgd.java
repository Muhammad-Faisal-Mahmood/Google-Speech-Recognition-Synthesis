/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class jgd {
    public final jic a;
    public final Object b;
    public final Map c;
    private final jgb d;
    private final Map e;
    private final Map f;

    public jgd(jgb map, Map map2, Map map3, jic jic2, Object object, Map map4) {
        this.d = map;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map3));
        this.a = jic2;
        this.b = object;
        map = map4 != null ? DesugarCollections.unmodifiableMap(new HashMap(map4)) : null;
        this.c = map;
    }

    final ivl a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new jgc(this);
    }

    final jgb b(ixb object) {
        jgb jgb2;
        jgb jgb3 = jgb2 = (jgb)this.e.get(((ixb)object).b);
        if (jgb2 == null) {
            object = ((ixb)object).c;
            jgb3 = (jgb)this.f.get(object);
        }
        if (jgb3 == null) {
            return this.d;
        }
        return jgb3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (jgd)object;
            if (a.k(this.d, ((jgd)object).d) && a.k(this.e, ((jgd)object).e) && a.k(this.f, ((jgd)object).f) && a.k(this.a, ((jgd)object).a) && a.k(this.b, ((jgd)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("defaultMethodConfig", this.d);
        gtn2.b("serviceMethodMap", this.e);
        gtn2.b("serviceMap", this.f);
        gtn2.b("retryThrottling", this.a);
        gtn2.b("loadBalancingConfig", this.b);
        return gtn2.toString();
    }
}

