/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;

public final class dav
implements Runnable {
    public final hpn a;
    public final hqa b;
    public final hpn c;

    public /* synthetic */ dav(hpn hpn2, hqa hqa2, hpn hpn3) {
        this.a = hpn2;
        this.b = hqa2;
        this.c = hpn3;
    }

    @Override
    public final void run() {
        hpn hpn2 = this.a;
        hqa hqa2 = this.b;
        try {
            hhk.S(hpn2);
        }
        catch (Throwable throwable) {
            hqa2.n(throwable);
        }
        catch (ExecutionException executionException) {
            hqa2.n(executionException.getCause());
        }
        hqa2.o(this.c);
    }
}

