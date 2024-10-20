/*
 * Decompiled with CFR 0.152.
 */
public final class ax
implements abc {
    final be a;

    public ax(be be2) {
        this.a = be2;
    }

    @Override
    public final void a(abe abe2, aaz aaz2) {
        if (aaz2 == aaz.ON_STOP && (abe2 = this.a.P) != null) {
            abe2.cancelPendingInputEvents();
        }
    }
}

