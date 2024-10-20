/*
 * Decompiled with CFR 0.152.
 */
import J.N;
import java.util.ArrayList;
import org.chromium.base.JavaHandlerThread;
import org.chromium.net.NetworkChangeNotifier;

public final class knf
implements Runnable {
    public final long a;
    public final Object b;
    private final int c;

    public /* synthetic */ knf(long l2, ArrayList arrayList, int n2) {
        this.c = n2;
        this.a = l2;
        this.b = arrayList;
    }

    public knf(Object object, long l2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = l2;
    }

    @Override
    public final void run() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                long l2 = this.a;
                ((NetworkChangeNotifier)((koy)((Object)this.b)).b.l.a).e(l2);
                return;
            }
            ((JavaHandlerThread)this.b).a.quit();
            N.MYwg$x8E(this.a);
            return;
        }
        Object object = this.b;
        N.Ml5G_GLY(this.a, object);
    }
}

