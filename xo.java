/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
import android.view.View;
import android.view.Window;

class xo
extends wd {
    protected final Window a;
    private final bzb b;

    public xo(Window window, bzb bzb2) {
        this.a = window;
        this.b = bzb2;
    }

    protected final void A() {
        this.a.addFlags(Integer.MIN_VALUE);
    }

    @Override
    public final int g() {
        Object object = this.a.getDecorView().getTag(356039078);
        if (object != null) {
            return (Integer)object;
        }
        return 1;
    }

    @Override
    public final void h(int n2) {
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((n2 & i2) == 0) continue;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 8) continue;
                    ((vy)this.b.a).a();
                    continue;
                }
                this.x(2);
                continue;
            }
            this.x(4);
        }
    }

    @Override
    public final void k(int n2) {
        this.a.getDecorView().setTag(356039078, (Object)n2);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return;
                }
                this.y(2048);
                this.x(4096);
                return;
            }
            this.y(4096);
            this.x(2048);
            return;
        }
        this.y(6144);
    }

    protected final void x(int n2) {
        View view = this.a.getDecorView();
        view.setSystemUiVisibility(n2 | view.getSystemUiVisibility());
    }

    protected final void y(int n2) {
        View view = this.a.getDecorView();
        view.setSystemUiVisibility(~n2 & view.getSystemUiVisibility());
    }

    protected final void z(int n2) {
        this.a.clearFlags(n2);
    }
}

