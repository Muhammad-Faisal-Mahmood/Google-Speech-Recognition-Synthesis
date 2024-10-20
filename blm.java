/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.LinearLayoutManager;
import java.util.HashSet;

final class blm
extends LinearLayoutManager {
    final blp a;

    public blm(blp blp2, int n2, boolean bl2) {
        this.a = blp2;
        super(n2, bl2);
    }

    @Override
    public final void p(ld object) {
        super.p((ld)object);
        object = new HashSet(this.a.b).iterator();
        while (object.hasNext()) {
            ((Runnable)object.next()).run();
        }
    }
}

