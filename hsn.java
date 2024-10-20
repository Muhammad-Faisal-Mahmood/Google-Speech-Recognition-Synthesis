/*
 * Decompiled with CFR 0.152.
 */
public final class hsn
implements iua {
    private final int a;

    public hsn(int n2) {
        this.a = n2;
    }

    @Override
    public final itz a(ixb object, itw itw2, itx itx2) {
        int n2 = this.a;
        if (n2 != 0) {
            boolean bl2 = true;
            if (n2 != 1) {
                if (itw2.g(hrl.a) != null) {
                    bl2 = false;
                }
                fxf.B(bl2, "AuthContext was set, but no AuthContextManager was bound");
                return itx2.a((ixb)object, itw2);
            }
            String string = ((ixb)object).b;
            return new gjq(itx2.a((ixb)object, itw2), "gRPC:".concat(string), gqn.b());
        }
        object = itw2.g(hrl.a) == null ? itx2.a((ixb)object, itw2) : new hsm(itx2, (ixb)object, itw2);
        return object;
    }
}

