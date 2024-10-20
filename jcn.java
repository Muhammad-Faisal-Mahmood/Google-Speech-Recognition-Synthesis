/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class jcn {
    public String a = "unknown-authority";
    public its b = its.a;
    public String c;
    public ivf d;

    public final boolean equals(Object object) {
        if (!(object instanceof jcn)) {
            return false;
        }
        object = (jcn)object;
        return this.a.equals(((jcn)object).a) && this.b.equals(((jcn)object).b) && a.k(this.c, ((jcn)object).c) && a.k(this.d, ((jcn)object).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}

