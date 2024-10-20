/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;

public final class gbn
implements Runnable {
    public final gbq a;
    public final hqa b;
    public final gbo c;

    public /* synthetic */ gbn(gbq gbq2, hqa hqa2, gbo gbo2) {
        this.a = gbq2;
        this.b = hqa2;
        this.c = gbo2;
    }

    @Override
    public final void run() {
        Object object;
        gbo gbo2 = this.c;
        Object object2 = this.b;
        try {
            object = hhk.S((Future)object2);
            object2 = this.a;
        }
        catch (Throwable throwable) {
            gbo2.o((hpn)object2);
            return;
        }
        ((gbq)object2).c.m(object);
        gbo2.o(((gbq)object2).c);
    }
}

