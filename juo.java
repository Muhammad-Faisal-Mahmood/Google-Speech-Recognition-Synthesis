/*
 * Decompiled with CFR 0.152.
 */
final class juo
extends jwl {
    public final jul a;

    public juo(jul jul2) {
        this.a = jul2;
    }

    @Override
    public final void a(Throwable throwable) {
        throwable = this.a.j(this.e());
        jul jul2 = this.a;
        if (jul2.w()) {
            Object object = jul2.a;
            jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            kaz kaz2 = (kaz)object;
            juc juc2 = kaz2.f;
            while (true) {
                if (jse.i(object = juc2.a, kba.b)) {
                    if (!kaz2.f.d(kba.b, throwable)) continue;
                } else if (!(object instanceof Throwable)) {
                    if (kaz2.f.d(object, null)) break;
                    continue;
                }
                break;
            }
        } else {
            jul2.A(throwable);
            jul2.p();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }
}

