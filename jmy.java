/*
 * Decompiled with CFR 0.152.
 */
public final class jmy
extends jmo {
    final ixx a;
    volatile boolean b;
    public boolean c;
    public Runnable d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public jmy() {
        throw null;
    }

    public jmy(ixx ixx2, boolean bl2) {
        this.c = true;
        this.h = false;
        this.i = false;
        this.a = ixx2;
        this.e = bl2;
    }

    @Override
    public final void a() {
        iyh iyh2 = iyh.b;
        iwx iwx2 = new iwx();
        this.a.a(iyh2, iwx2);
        this.i = true;
    }

    @Override
    public final void b(Throwable throwable) {
        Object object;
        a.s(throwable, "t");
        Object object2 = throwable;
        while (true) {
            iyi iyi2 = null;
            object = iyi2;
            if (object2 == null) break;
            if (object2 instanceof iyi) {
                object = (iyi)object2;
                object = iyi2;
                break;
            }
            if (object2 instanceof iyj) {
                object = ((iyj)object2).b;
                break;
            }
            object2 = ((Throwable)object2).getCause();
        }
        object2 = object;
        if (object == null) {
            object2 = new iwx();
        }
        this.a.a(iyh.c(throwable), (iwx)object2);
        this.h = true;
    }

    @Override
    public final void c(Object object) {
        if (this.b && this.e) {
            throw new iyj(iyh.c.e("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception"));
        }
        fxf.B(this.h ^ true, "Stream was terminated by error, no further calls are allowed");
        fxf.B(this.i ^ true, "Stream is already completed, no further calls are allowed");
        if (!this.g) {
            this.a.b(new iwx());
            this.g = true;
        }
        this.a.f(object);
    }

    public final void d() {
        this.f = true;
    }

    public final void e(Runnable runnable) {
        fxf.B(this.f ^ true, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        this.d = runnable;
    }
}

