/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class km
implements mg {
    final ko a;
    private final int b;

    public km(ko ko2, int n2) {
        this.b = n2;
        this.a = ko2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int a(View view) {
        int n2;
        int n3;
        if (this.b != 0) {
            kp kp2 = (kp)view.getLayoutParams();
            n3 = ko.bi(view);
            n2 = kp2.rightMargin;
            return n3 + n2;
        }
        kp kp3 = (kp)view.getLayoutParams();
        n3 = ko.be(view);
        n2 = kp3.bottomMargin;
        return n3 + n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int b(View view) {
        int n2;
        int n3;
        if (this.b != 0) {
            kp kp2 = (kp)view.getLayoutParams();
            n3 = ko.bf(view);
            n2 = kp2.leftMargin;
            return n3 - n2;
        }
        kp kp3 = (kp)view.getLayoutParams();
        n3 = ko.bj(view);
        n2 = kp3.topMargin;
        return n3 - n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int c() {
        int n2;
        int n3;
        if (this.b != 0) {
            ko ko2 = this.a;
            n3 = ko2.D;
            n2 = ko2.aw();
            return n3 - n2;
        }
        ko ko3 = this.a;
        n3 = ko3.E;
        n2 = ko3.au();
        return n3 - n2;
    }

    @Override
    public final int d() {
        if (this.b != 0) {
            return this.a.av();
        }
        return this.a.ax();
    }

    @Override
    public final View e(int n2) {
        if (this.b != 0) {
            return this.a.aA(n2);
        }
        return this.a.aA(n2);
    }
}

