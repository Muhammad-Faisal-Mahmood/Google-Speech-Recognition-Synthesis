/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;

public final class kb
extends kc {
    public kb(ko ko2) {
        super(ko2);
    }

    @Override
    public final int a(View view) {
        kp kp2 = (kp)view.getLayoutParams();
        return ko.be(view) + kp2.bottomMargin;
    }

    @Override
    public final int b(View view) {
        kp kp2 = (kp)view.getLayoutParams();
        return ko.bg(view) + kp2.topMargin + kp2.bottomMargin;
    }

    @Override
    public final int c(View view) {
        kp kp2 = (kp)view.getLayoutParams();
        return ko.bh(view) + kp2.leftMargin + kp2.rightMargin;
    }

    @Override
    public final int d(View view) {
        kp kp2 = (kp)view.getLayoutParams();
        return ko.bj(view) - kp2.topMargin;
    }

    @Override
    public final int e() {
        return this.a.E;
    }

    @Override
    public final int f() {
        ko ko2 = this.a;
        return ko2.E - ko2.au();
    }

    @Override
    public final int g() {
        return this.a.au();
    }

    @Override
    public final int h() {
        return this.a.C;
    }

    @Override
    public final int i() {
        return this.a.B;
    }

    @Override
    public final int j() {
        return this.a.ax();
    }

    @Override
    public final int k() {
        ko ko2 = this.a;
        return ko2.E - ko2.ax() - this.a.au();
    }

    @Override
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bl(view, rect);
        return this.c.bottom;
    }

    @Override
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bl(view, rect);
        return this.c.top;
    }

    @Override
    public final void n(int n2) {
        this.a.aK(n2);
    }
}

