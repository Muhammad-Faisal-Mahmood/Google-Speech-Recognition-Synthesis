/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class jtk
implements jtl {
    public final Object a;
    public final Object b;
    private final int c;

    public jtk(CharSequence charSequence, jro jro2, int n2) {
        this.c = n2;
        jse.e(charSequence, "input");
        this.a = charSequence;
        this.b = jro2;
    }

    public jtk(jqz jqz2, jrk jrk2, int n2) {
        this.c = n2;
        this.a = jqz2;
        this.b = jrk2;
    }

    public jtk(jtl jtl2, jrk jrk2, int n2) {
        this.c = n2;
        this.b = jtl2;
        this.a = jrk2;
    }

    @Override
    public final Iterator a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return new jtt(this);
                }
                return new jtr(this);
            }
            return new jti(this);
        }
        return new jtj(this);
    }
}

