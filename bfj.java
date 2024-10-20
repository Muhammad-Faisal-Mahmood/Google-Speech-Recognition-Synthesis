/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public final class bfj
extends bfc {
    public bfj(bfs bfs2) {
        super(bfs2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(bhd object) {
        boolean bl2;
        jse.e(object, "workSpec");
        bbj bbj2 = object.k.b;
        bbj bbj3 = bbj.c;
        boolean bl3 = bl2 = true;
        if (bbj2 == bbj3) return bl3;
        if (Build.VERSION.SDK_INT < 30) return false;
        if (bbj2 != bbj.f) return false;
        return bl2;
    }

    @Override
    public final int d() {
        return 7;
    }
}

