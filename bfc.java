/*
 * Decompiled with CFR 0.152.
 */
public abstract class bfc
implements bff {
    public final bfs a;

    public bfc(bfs bfs2) {
        this.a = bfs2;
    }

    @Override
    public final jyx a(baq baq2) {
        jse.e(baq2, "constraints");
        return new jyp(new aux_(this, null, 3));
    }

    @Override
    public final boolean c(bhd bhd2) {
        jse.e(bhd2, "workSpec");
        return this.b(bhd2) && this.e(this.a.b());
    }

    public abstract int d();

    public boolean e(Object object) {
        throw null;
    }
}

