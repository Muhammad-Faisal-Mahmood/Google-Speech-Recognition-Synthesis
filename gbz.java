/*
 * Decompiled with CFR 0.152.
 */
final class gbz
implements hpb {
    final gca a;

    public gbz(gca gca2) {
        this.a = gca2;
    }

    @Override
    public final void a(Throwable throwable) {
        this.a.b(throwable);
    }

    @Override
    public final void b(Object object) {
        gca gca2 = this.a;
        gca2.e = object;
        gca2.b = true;
        gca2.a();
    }
}

