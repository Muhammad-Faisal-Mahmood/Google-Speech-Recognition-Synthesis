/*
 * Decompiled with CFR 0.152.
 */
public final class bnr
implements bmj {
    public final bnu a;

    public /* synthetic */ bnr(bnu bnu2) {
        this.a = bnu2;
    }

    @Override
    public final void onMenuItemChanged(bml bml2) {
        bnu bnu2 = this.a;
        int n2 = bnu2.e.indexOf(bml2);
        if (n2 >= 0) {
            bnu2.f.set(n2, bnu2.a(bml2));
            bnu2.g.notifyItemChanged(n2);
        } else {
            bnu2.b();
        }
        bnu2.c();
    }
}

