/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.io.IOException;
import java.util.concurrent.Executor;

public final class frt
extends frb {
    private final hyf a;

    public frt(hyf hyf2) {
        this.a = hyf2;
    }

    @Override
    public final hpn a(IOException iOException, bzq bzq2) {
        if (!(iOException.getCause() instanceof hxn)) {
            return hhk.J(iOException);
        }
        return hmv.g(bzq2.H(hhk.K(this.a)), IOException.class, new frm(iOException, 6), (Executor)hom.a);
    }
}

