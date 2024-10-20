/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class hjw
extends hjy {
    final int a;
    final long b;
    final double c;

    public hjw(long l2, double d2, int n2) {
        this.a = hjy.c(n2);
        this.b = l2;
        boolean bl2 = d2 > 0.0;
        fxf.y(bl2, "%s (%s) must be > 0", "multiplier", d2);
        this.c = d2;
    }

    public final boolean equals(Object object) {
        if (object instanceof hjw) {
            object = (hjw)object;
            if (this.b == ((hjw)object).b && this.c == ((hjw)object).c && this.a == ((hjw)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}

