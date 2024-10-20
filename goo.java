/*
 * Decompiled with CFR 0.152.
 */
public final class goo
extends gop
implements gon {
    public static final gop a = new goo(null, new pa(0)).f();
    static final gop b;

    static {
        gon gon2 = gop.b();
        gon2.a(gop.e, true);
        b = ((gop)((Object)gon2)).f();
    }

    public goo(gop gop2, pa pa2) {
        super(gop2, pa2);
    }

    @Override
    public final void a(fxf fxf2, Object object) {
        fxf.B(this.d ^ true, "Can't mutate after handing to trace");
        fxf.K(object);
        fxf.B(this.j(fxf2) ^ true, "Key already present");
        this.c.put(fxf2, object);
    }
}

