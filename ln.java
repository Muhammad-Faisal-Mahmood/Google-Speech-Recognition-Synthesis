/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class ln {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final StaggeredGridLayoutManager g;

    public ln(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        this.a();
    }

    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] nArray = this.f;
        if (nArray != null) {
            Arrays.fill(nArray, -1);
        }
    }
}

