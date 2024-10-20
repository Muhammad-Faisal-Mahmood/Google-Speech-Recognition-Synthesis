/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class jtt
implements Iterator,
jsm {
    final jtk a;
    private int b;
    private int c;
    private int d;
    private jsw e;

    public jtt(jtk jtk2) {
        this.a = jtk2;
        this.b = -1;
        int n2 = jtk2.a.length();
        if (n2 >= 0) {
            this.c = 0;
            this.d = 0;
            return;
        }
        throw new IllegalArgumentException(a.ah(n2, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    private final void a() {
        int n2 = this.d;
        int n3 = 0;
        if (n2 >= 0) {
            if (n2 > this.a.a.length()) {
                this.e = new jsw(this.c, jse.v((CharSequence)this.a.a));
                this.d = -1;
            } else {
                Object object = this.a;
                n2 = this.d;
                object = ((jtk)object).b.b(((jtk)object).a, n2);
                if (object == null) {
                    this.e = new jsw(this.c, jse.v((CharSequence)this.a.a));
                    this.d = -1;
                } else {
                    object = (joc)object;
                    n2 = ((Number)((joc)object).a).intValue();
                    int n4 = ((Number)((joc)object).b).intValue();
                    this.e = jse.q(this.c, n2);
                    this.c = n2 += n4;
                    if (n4 == 0) {
                        n3 = 1;
                    }
                    this.d = n2 + n3;
                }
            }
            this.b = 1;
            return;
        }
        this.b = 0;
        this.e = null;
    }

    @Override
    public final boolean hasNext() {
        if (this.b == -1) {
            this.a();
        }
        return this.b == 1;
    }

    @Override
    public final void remove() {
        a.b();
    }
}

