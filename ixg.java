/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ixg {
    public final List a;
    public final its b;
    public final ixd c;

    public ixg(List list, its its2, ixd ixd2) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        a.s(its2, "attributes");
        this.b = its2;
        this.c = ixd2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof ixg)) {
            return false;
        }
        object = (ixg)object;
        return a.k(this.a, ((ixg)object).a) && a.k(this.b, ((ixg)object).b) && a.k(this.c, ((ixg)object).c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("addresses", this.a);
        gtn2.b("attributes", this.b);
        gtn2.b("serviceConfig", this.c);
        return gtn2.toString();
    }
}

