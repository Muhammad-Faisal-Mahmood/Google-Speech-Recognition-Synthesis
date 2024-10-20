/*
 * Decompiled with CFR 0.152.
 */
final class jwg
extends jwl {
    private final jrk a;
    private final jtz f;

    public jwg(jrk jrk2) {
        this.a = jrk2;
        this.f = new jtz(false, jud.a);
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.f.a(false, true)) {
            this.a.a(throwable);
        }
    }

    @Override
    public final boolean b() {
        return true;
    }
}

