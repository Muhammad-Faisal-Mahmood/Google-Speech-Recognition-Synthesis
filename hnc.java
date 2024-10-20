/*
 * Decompiled with CFR 0.152.
 */
final class hnc
implements Runnable {
    final hnk a;
    final hpn b;

    public hnc(hnk hnk2, hpn hpn2) {
        this.a = hnk2;
        this.b = hpn2;
    }

    @Override
    public final void run() {
        Object object = hnk.j;
        if (this.a.value == this) {
            Object object2 = this.b;
            object = this.a;
            if (hnk.j.f((hnk)object, this, object2 = hnk.h((hpn)object2))) {
                hnk.j(this.a, false);
            }
        }
    }
}

