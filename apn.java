/*
 * Decompiled with CFR 0.152.
 */
public final class apn
implements aqe {
    private final byte[] a = new byte[4096];

    @Override
    public final /* synthetic */ int d(adn adn2, int n2, boolean bl2) {
        return wd.t(this, adn2, n2, true);
    }

    @Override
    public final void h(adu adu2) {
    }

    @Override
    public final /* synthetic */ void l(aga aga2, int n2) {
        wd.u(this, aga2, n2);
    }

    @Override
    public final void m(long l2, int n2, int n3, int n4, aqd aqd2) {
    }

    @Override
    public final int s(adn adn2, int n2, boolean bl2) {
        if ((n2 = adn2.a(this.a, 0, Math.min(4096, n2))) == -1) {
            return -1;
        }
        return n2;
    }

    @Override
    public final void u(aga aga2, int n2) {
        aga2.w(n2);
    }
}

