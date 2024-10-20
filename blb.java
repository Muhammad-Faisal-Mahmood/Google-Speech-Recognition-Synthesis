/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

public final class blb
implements bld {
    public int a = 1;
    public boolean b = false;
    public jm c = new jk();
    private int d = 1;

    public static blb d(ko ko2) {
        if (ko2 == null) {
            return null;
        }
        if (ko2 instanceof GridLayoutManager) {
            blb blb2 = new blb();
            ko2 = (GridLayoutManager)ko2;
            blb2.e(((GridLayoutManager)ko2).b);
            blb2.b = ((LinearLayoutManager)ko2).m;
            blb2.c = ((GridLayoutManager)ko2).g;
            return blb2;
        }
        throw new AssertionError((Object)"GridLayoutManager required.");
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final int b() {
        return this.a;
    }

    @Override
    public final int c() {
        return this.d;
    }

    public final void e(int n2) {
        if (n2 > 0) {
            this.d = n2;
            return;
        }
        throw new AssertionError((Object)"Span count must be bigger than 0");
    }

    @Override
    public final boolean f() {
        return this.b;
    }
}

