/*
 * Decompiled with CFR 0.152.
 */
final class gpz
extends gpb {
    final gpc b;

    public gpz(gol gol2, gpc gpc2) {
        this.b = gpc2;
        super(gol2);
    }

    @Override
    public final void close() {
        this.a.close();
        gpc gpc2 = this.b;
        if (gpc2 != null) {
            gno.w(gpc2);
        }
    }
}

