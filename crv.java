/*
 * Decompiled with CFR 0.152.
 */
public final class crv
implements ckv {
    public final crw a;

    public /* synthetic */ crv(crw crw2) {
        this.a = crw2;
    }

    @Override
    public final void a(ckz object) {
        boolean bl2 = ((cld)object).c;
        crw crw2 = this.a;
        if (bl2) {
            crw2.cancel(false);
            return;
        }
        if (((ckz)object).e()) {
            crw2.m(((ckz)object).d());
            return;
        }
        if ((object = ((ckz)object).c()) != null) {
            crw2.n((Throwable)object);
            return;
        }
        throw new IllegalStateException();
    }
}

