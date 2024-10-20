/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

final class jna
extends kmp {
    private final jnf a;
    private final ixx b;
    private boolean c = false;
    private final jmy d;

    public jna(jnf jnf2, jmy jmy2, ixx ixx2) {
        super(null);
        this.a = jnf2;
        this.d = jmy2;
        this.b = ixx2;
    }

    @Override
    public final void W() {
        Optional<iyj> optional = this.d;
        Object object = ((jmy)((Object)optional)).d;
        if (object != null) {
            object.run();
        } else {
            ((jmy)((Object)optional)).b = true;
        }
        if (!this.c) {
            object = this.a;
            iyj iyj2 = new iyj(iyh.c.e("client cancelled"));
            optional = (heg)((heg)((heg)fix.a.h().h(hfo.a, "GoogleAsrService")).i(iyj2)).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl$4", "onError", 334, "GoogleAsrServiceImpl.java");
            object = (fiw)object;
            optional.u("[%s] #recognitionSession onError", ((fiw)object).a);
            optional = Optional.ofNullable(iyj2);
            ((fiw)object).c.r(optional);
        }
    }

    @Override
    public final void X() {
    }

    @Override
    public final void e() {
        this.c = true;
        this.a.a();
    }

    @Override
    public final void f(Object object) {
        this.a.c(object);
        if (this.d.c) {
            this.b.d(1);
        }
    }

    @Override
    public final void g() {
    }
}

