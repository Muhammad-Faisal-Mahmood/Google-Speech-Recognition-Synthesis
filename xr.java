/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsetsController
 */
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class xr
extends wd {
    final WindowInsetsController a;
    protected final Window b;

    public xr(Window window) {
        WindowInsetsController windowInsetsController = sk$$ExternalSyntheticApiModelOutline1.m(window);
        new pa();
        this.a = windowInsetsController;
        this.b = window;
    }

    @Override
    public int g() {
        Object object = this.b;
        if (object != null) {
            if ((object = object.getDecorView().getTag(356039078)) != null) {
                return (Integer)object;
            }
            return 1;
        }
        return sk$$ExternalSyntheticApiModelOutline1.m(this.a);
    }

    @Override
    public final void h(int n2) {
        sk$$ExternalSyntheticApiModelOutline1.m$1(this.a, n2 & 0xFFFFFFF7);
    }

    @Override
    public final void i(boolean bl2) {
        if (bl2) {
            if (this.b != null) {
                this.x(16);
            }
            sk$$ExternalSyntheticApiModelOutline1.m(this.a, 16, 16);
            return;
        }
        if (this.b != null) {
            this.y(16);
        }
        sk$$ExternalSyntheticApiModelOutline1.m(this.a, 0, 16);
    }

    @Override
    public final void j(boolean bl2) {
        if (bl2) {
            if (this.b != null) {
                this.x(8192);
            }
            sk$$ExternalSyntheticApiModelOutline1.m(this.a, 8, 8);
            return;
        }
        if (this.b != null) {
            this.y(8192);
        }
        sk$$ExternalSyntheticApiModelOutline1.m(this.a, 0, 8);
    }

    @Override
    public void k(int n2) {
        Window window = this.b;
        if (window != null) {
            window.getDecorView().setTag(356039078, (Object)n2);
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
            return;
        }
        sk$$ExternalSyntheticApiModelOutline1.m$2(this.a, n2);
    }

    protected final void x(int n2) {
        View view = this.b.getDecorView();
        view.setSystemUiVisibility(n2 | view.getSystemUiVisibility());
    }

    protected final void y(int n2) {
        View view = this.b.getDecorView();
        view.setSystemUiVisibility(~n2 & view.getSystemUiVisibility());
    }
}

