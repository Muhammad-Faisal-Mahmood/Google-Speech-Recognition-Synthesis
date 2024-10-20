/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class giq
extends iln {
    public giq(be be2) {
        super(be2);
    }

    public static final void a(be be2, hyf hyf2) {
        iln.e(be2);
        be2 = be2.l;
        fxf.K(hyf2);
        fvc.as((Bundle)be2, "TIKTOK_FRAGMENT_ARGUMENT", hyf2);
    }

    @Override
    protected final void c(be be2) {
        fxf.L(be2.getActivity(), "Fragment %s has no parent Activity -- Did you forget @ActivityAgnosticPeer?", be2.getClass().getSimpleName());
        fxf.G(be2.getActivity() instanceof ghv, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", be2.getClass().getSimpleName(), be2.getActivity().getClass().getSimpleName());
    }
}

