/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
import java.util.UUID;

abstract class gnf
extends gmo {
    private final gop a;

    public gnf(String string, gpc gpc2, gop gop2, goz goz2) {
        super(string, gpc2, goz2);
        fxf.q(gop2.d);
        this.a = gop2;
    }

    public gnf(String string, UUID uUID, gop gop2, goz goz2) {
        super(string, uUID, goz2);
        fxf.q(gop2.d);
        this.a = gop2;
    }

    @Override
    public gop i() {
        return gop.e(this.a, this.l());
    }

    @Override
    public gom j(fxf fxf2) {
        return gop.h(fxf2, this.i(), gqv.a);
    }
}

