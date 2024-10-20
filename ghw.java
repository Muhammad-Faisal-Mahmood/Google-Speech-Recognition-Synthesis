/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class ghw
extends abg {
    private gms c;

    public ghw(bh bh2) {
        super(bh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(aaz aaz2) {
        block10: {
            gms gms2;
            block11: {
                block12: {
                    block13: {
                        abg.f("getObserverCount");
                        if (this.a.e <= 0) {
                            super.d(aaz2);
                            return;
                        }
                        gms2 = this.c;
                        jse.e((Object)aaz2, "event");
                        int n2 = aaz2.ordinal();
                        if (n2 == 0) break block11;
                        if (n2 == 1) break block12;
                        if (n2 == 2) break block13;
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 5) {
                                    Objects.toString((Object)aaz2);
                                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf((Object)aaz2)));
                                }
                                gop gop2 = goo.a;
                                jse.d(gop2, "empty(...)");
                                gms2.o("Lifecycle.Destroyed", gop2);
                                break block10;
                            } else {
                                gop gop3 = goo.a;
                                jse.d(gop3, "empty(...)");
                                gms2.o("Lifecycle.Stopped", gop3);
                            }
                            break block10;
                        } else {
                            gop gop4 = goo.a;
                            jse.d(gop4, "empty(...)");
                            gms2.o("Lifecycle.Paused", gop4);
                        }
                        break block10;
                    }
                    gop gop5 = goo.a;
                    jse.d(gop5, "empty(...)");
                    gms2.o("Lifecycle.Resumed", gop5);
                    break block10;
                }
                gop gop6 = goo.a;
                jse.d(gop6, "empty(...)");
                gms2.o("Lifecycle.Started", gop6);
                break block10;
            }
            if (gms2.e == null) {
                gop gop7 = goo.a;
                jse.d(gop7, "empty(...)");
                gms2.o("Lifecycle.Created", gop7);
                gms2.d = true;
            }
        }
        try {
            super.d(aaz2);
            return;
        }
        finally {
            this.c.m(aaz2);
        }
    }

    public final void g(gms gms2) {
        boolean bl2 = this.c == null;
        fxf.B(bl2, "Activity was already created");
        this.c = gms2;
    }
}

