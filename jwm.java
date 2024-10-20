/*
 * Decompiled with CFR 0.152.
 */
final class jwm
extends jul {
    private final jwp f;

    public jwm(jqb jqb2, jwp jwp2) {
        super(jqb2, 1);
        this.f = jwp2;
    }

    @Override
    protected final String i() {
        return "AwaitContinuation";
    }

    @Override
    public final Throwable j(jwi jwi2) {
        Throwable throwable;
        Object object = this.f.B();
        if (object instanceof jwo && (throwable = ((jwo)object).d()) != null) {
            return throwable;
        }
        if (object instanceof jut) {
            return ((jut)object).b;
        }
        return jwi2.p();
    }
}

