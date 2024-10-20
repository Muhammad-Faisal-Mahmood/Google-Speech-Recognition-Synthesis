/*
 * Decompiled with CFR 0.152.
 */
public final class dvg
implements hxc {
    private final int a;

    public dvg(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ Object a(int n2) {
        Enum enum_;
        switch (this.a) {
            default: {
                ieh ieh2;
                enum_ = ieh2 = ieh.b(n2);
                if (ieh2 != null) break;
                return ieh.a;
            }
            case 9: {
                return a.o(n2);
            }
            case 8: {
                idq idq2;
                idq idq3 = idq2 = idq.b(n2);
                if (idq2 == null) {
                    idq3 = idq.a;
                }
                return idq3;
            }
            case 7: {
                return a.o(n2);
            }
            case 6: {
                return a.o(n2);
            }
            case 5: {
                Object object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? null : ffb.d) : ffb.c) : ffb.b) : ffb.a;
                ffb ffb2 = object;
                if (object == null) {
                    ffb2 = ffb.e;
                }
                return ffb2;
            }
            case 4: {
                return a.o(n2);
            }
            case 3: {
                dzz dzz2;
                dzz dzz3 = dzz2 = dzz.b(n2);
                if (dzz2 == null) {
                    dzz3 = dzz.a;
                }
                return dzz3;
            }
            case 2: {
                hqn hqn2;
                hqn hqn3 = hqn2 = hqn.b(n2);
                if (hqn2 == null) {
                    hqn3 = hqn.a;
                }
                return hqn3;
            }
            case 1: {
                btx btx2;
                btx btx3 = btx2 = btx.b(n2);
                if (btx2 == null) {
                    btx3 = btx.a;
                }
                return btx3;
            }
            case 0: {
                hqn hqn4 = hqn.b(n2);
                enum_ = hqn4;
                if (hqn4 != null) break;
                enum_ = hqn.a;
            }
        }
        return enum_;
    }
}

