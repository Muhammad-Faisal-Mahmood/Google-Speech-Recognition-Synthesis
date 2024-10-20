/*
 * Decompiled with CFR 0.152.
 */
public final class jne
implements ixy {
    public final jnc a;
    private final boolean b;

    public jne(jnc jnc2, boolean bl2) {
        this.a = jnc2;
        this.b = bl2;
    }

    @Override
    public final kmp a(ixx ixx2, iwx object) {
        fxf.r(ixx2.e().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        object = new jmy(ixx2, this.b);
        ixx2.d(2);
        return new jnd(this, (jmy)object, ixx2);
    }
}

