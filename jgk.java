/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

final class jgk
extends OutputStream {
    public final List a;
    final jgn b;
    private jjw c;

    public jgk(jgn jgn2) {
        this.b = jgn2;
        this.a = new ArrayList();
    }

    @Override
    public final void write(int n2) {
        byte by2 = (byte)n2;
        jjw jjw2 = this.c;
        if (jjw2 != null && jjw2.b() > 0) {
            this.c.c(by2);
            return;
        }
        this.write(new byte[]{by2}, 0, 1);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        jjw jjw2;
        int n4 = n2;
        int n5 = n3;
        if (this.c == null) {
            this.c = jjw2 = this.b.f.a(n3);
            this.a.add(jjw2);
            n5 = n3;
            n4 = n2;
        }
        while (n5 > 0) {
            n2 = Math.min(n5, this.c.b());
            if (n2 == 0) {
                n2 = this.c.a();
                n2 = Math.max(n5, n2 + n2);
                this.c = jjw2 = this.b.f.a(n2);
                this.a.add(jjw2);
                continue;
            }
            this.c.d(byArray, n4, n2);
            n4 += n2;
            n5 -= n2;
        }
    }
}

