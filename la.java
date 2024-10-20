/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.animation.Interpolator
 */
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

public final class la {
    public int a = -1;
    private int b = 0;
    private int c = 0;
    private int d = Integer.MIN_VALUE;
    private Interpolator e = null;
    private boolean f = false;
    private int g = 0;

    final void a(RecyclerView recyclerView) {
        int n2 = this.a;
        if (n2 >= 0) {
            this.a = -1;
            recyclerView.N(n2);
            this.f = false;
            return;
        }
        if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.d <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            n2 = this.d;
            if (n2 > 0) {
                recyclerView.L.c(this.b, this.c, n2, interpolator);
                this.g = n2 = this.g + 1;
                if (n2 > 10) {
                    Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.g = 0;
    }

    public final void b(int n2, int n3, int n4, Interpolator interpolator) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = interpolator;
        this.f = true;
    }
}

