/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public final class gny
extends gnf {
    public static final UUID a = UUID.randomUUID();

    private gny(gny gny2, String string, gop gop2, goz goz2) {
        super(string, gny2, gop2, goz2);
    }

    public gny(String string, UUID uUID, gop gop2, goz goz2) {
        super(string, uUID, gop2, goz2);
    }

    @Override
    public final gop l() {
        return goo.a;
    }

    @Override
    public final gpc m(String string, gop gop2, goz goz2) {
        return new gny(this, string, gop2, goz2);
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

