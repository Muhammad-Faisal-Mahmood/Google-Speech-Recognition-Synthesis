/*
 * Decompiled with CFR 0.152.
 */
public final class hso
implements iua {
    private static final hei a = hei.m("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override
    public final itz a(ixb ixb2, itw itw2, itx itx2) {
        idi idi2 = (idi)itw2.g(hrz.a);
        if (idi2 != null) {
            ((heg)((heg)a.c()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 30, "CredentialStrategyInterceptor.java")).u("Using CredentialStrategy: %s", idi2.getClass());
            return fvc.T(itx2, idi.D(new djo(14))).a(ixb2, itw2);
        }
        ((heg)((heg)a.c()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 38, "CredentialStrategyInterceptor.java")).r("Did not set CredentialStrategy");
        return itx2.a(ixb2, itw2);
    }
}

