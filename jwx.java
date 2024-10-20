/*
 * Decompiled with CFR 0.152.
 */
final class jwx
extends jwl {
    private final jul a;

    public jwx(jul jul2) {
        this.a = jul2;
    }

    @Override
    public final void a(Throwable object) {
        object = this.e().B();
        boolean bl2 = jve.a;
        if (object instanceof jut) {
            this.a.bD(jns.aj(((jut)object).b));
            return;
        }
        this.a.bD(jwq.b(object));
    }

    @Override
    public final boolean b() {
        return false;
    }
}

