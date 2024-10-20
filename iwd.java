/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class iwd {
    public final List a;
    public final its b;
    public final Object c;

    public iwd(List list, its its2, Object object) {
        a.s(list, "addresses");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        a.s(its2, "attributes");
        this.b = its2;
        this.c = object;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof iwd)) {
            return false;
        }
        object = (iwd)object;
        return a.k(this.a, ((iwd)object).a) && a.k(this.b, ((iwd)object).b) && a.k(this.c, ((iwd)object).c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("addresses", this.a);
        gtn2.b("attributes", this.b);
        gtn2.b("loadBalancingPolicyConfig", this.c);
        return gtn2.toString();
    }
}

