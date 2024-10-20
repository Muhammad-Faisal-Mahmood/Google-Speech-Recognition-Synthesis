/*
 * Decompiled with CFR 0.152.
 */
final class djx
implements djw {
    private final dkf a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final czh h;

    public djx(dkf object, jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, gto gto2, czh czh2) {
        block4: {
            this.a = object;
            this.b = jnu2;
            this.c = jnu3;
            this.d = jnu4;
            this.e = jnu5;
            this.f = jnu6;
            this.g = jnu7;
            this.h = czh2;
            if (!((Boolean)gto2.e(Boolean.FALSE)).booleanValue()) {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 109, "PrimesApiImpl.java")).r("Primes instant initialization");
                try {
                    fxf.av();
                    object = ((imj)jnu2).a().iterator();
                    while (object.hasNext()) {
                        ((dmw)object.next()).L();
                    }
                }
                catch (RuntimeException runtimeException) {
                    a.as(dkc.a.h(), "Primes failed to initialize", "com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 'u', "PrimesApiImpl.java", runtimeException);
                    dkf dkf2 = this.a;
                    if (dkf2.a) break block4;
                    dkf2.a = true;
                    ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).r("Shutdown ...");
                }
            }
        }
    }

    @Override
    public final drn a() {
        return ((drj)this.f).a().b();
    }

    @Override
    public final void b() {
        this.h.c();
    }

    @Override
    public final void c(dql dql2) {
        ((dqq)this.e).a().a(dql2);
    }

    @Override
    public final void d() {
        ((dqb)this.d.b()).a();
    }

    @Override
    public final boolean e() {
        return ((djq)this.c).a().b();
    }

    @Override
    public final void f(djt djt2, long l2, long l3) {
        ((drk)this.g).a().a(djt2, l2, l3);
    }

    @Override
    public final void g(djt djt2) {
        ((dqb)this.d.b()).b(djt2);
    }

    @Override
    public final void h(drn drn2, djt djt2) {
        ((drj)this.f).a().c(drn2, djt2);
    }
}

