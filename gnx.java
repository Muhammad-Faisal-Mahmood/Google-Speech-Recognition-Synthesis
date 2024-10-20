/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public final class gnx
extends gnf
implements gnd {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public gnx(String string, gnd gnd2, gop gop2, boolean bl2, goz goz2) {
        gop2 = gop.e(gop2, goo.b);
        super("<missing root>:".concat(String.valueOf(string)), gnd2, gop2, goz2);
        this.b = gnd2.g();
        this.a = gnd2.h();
        this.c = bl2;
    }

    public gnx(String object, gop gop2, boolean bl2, goz goz2) {
        UUID uUID = gnp.a.b();
        gop2 = gop.e(gop2, goo.b);
        super("<missing root>:".concat(String.valueOf(object)), uUID, gop2, goz2);
        if (gpe.a()) {
            this.b = object = new gnb();
            this.a = gno.q((Throwable)object);
        } else {
            this.b = gnw.a;
            this.a = false;
        }
        this.c = bl2;
    }

    @Override
    public final gpc f(String string, gop gop2, boolean bl2, goz goz2) {
        if (bl2 && !this.c) {
            gno.u();
        }
        bl2 = bl2 && !this.c || this.c;
        return new gnx(string, this, gop2, bl2, goz2);
    }

    @Override
    public final Exception g() {
        return this.b;
    }

    @Override
    public final boolean h() {
        return this.a;
    }

    @Override
    public final gom j(fxf object) {
        gom gom2 = super.j((fxf)object);
        object = gom2;
        if (gom2.c() == 3) {
            object = gom.d(2);
        }
        return object;
    }

    @Override
    public final gop l() {
        return goo.a;
    }

    @Override
    public final gpc m(String string, gop gop2, goz goz2) {
        return this.f(string, gop2, true, goz2);
    }

    @Override
    public final void n(boolean bl2) {
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q(fxf fxf2, Object object) {
    }
}

