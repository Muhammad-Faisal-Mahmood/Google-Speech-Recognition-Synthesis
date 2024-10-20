/*
 * Decompiled with CFR 0.152.
 */
public final class jmp
extends jmo {
    public final itz a;
    public boolean b = false;
    private boolean c = false;

    public jmp(itz itz2) {
        this.a = itz2;
    }

    @Override
    public final void a() {
        this.a.d();
        this.c = true;
    }

    @Override
    public final void b(Throwable throwable) {
        throw null;
    }

    @Override
    public final void c(Object object) {
        fxf.B(this.b ^ true, "Stream was terminated by error, no further calls are allowed");
        fxf.B(this.c ^ true, "Stream is already completed, no further calls are allowed");
        this.a.f(object);
    }

    public final void d() {
        this.a.e(1);
    }
}

