/*
 * Decompiled with CFR 0.152.
 */
public final class gir
extends gih {
    public gir(be be2) {
        super(be2);
    }

    @Override
    protected final void a(be be2) {
        if (be2.getActivity() == null) {
            fxf.G(be2.getHost() instanceof gib, "TikTok Fragment %s must be used with a FragmentController from a FragmentHost. Host was %s", be2.getClass().getSimpleName(), be2.getHost().getClass().getSimpleName());
            return;
        }
        fxf.G(be2.getActivity() instanceof ghv, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", be2.getClass().getSimpleName(), be2.getActivity().getClass().getSimpleName());
    }
}

