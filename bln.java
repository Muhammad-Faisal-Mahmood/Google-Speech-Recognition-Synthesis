/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.GridLayoutManager;
import java.util.HashSet;

final class bln
extends GridLayoutManager {
    final blp H;

    public bln(blp blp2, int n2, int n3, boolean bl2) {
        this.H = blp2;
        super(n2, n3, bl2);
    }

    @Override
    public final void p(ld object) {
        super.p((ld)object);
        object = new HashSet(this.H.b).iterator();
        while (object.hasNext()) {
            ((Runnable)object.next()).run();
        }
    }
}

