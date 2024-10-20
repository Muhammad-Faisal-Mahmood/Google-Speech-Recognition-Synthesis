/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.concurrent.TimeoutException;

public final class gcx
implements hny {
    private final int a;

    public /* synthetic */ gcx(int n2) {
        this.a = n2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return ((gmh)object).b();
                            }
                            return ((gmh)object).a();
                        }
                        object = (TimeoutException)object;
                        ((heg)((heg)((heg)gjh.a.g()).i((Throwable)object)).j("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "maybeAddTimeout", 377, "IntentFilterAcledReceiver.java")).r("Receiver future timed out. Cancelling and returning due to HasReceiverTimeout.");
                        return hhk.I();
                    }
                    return ((gcg)object).b();
                }
                return ((gcg)object).c();
            }
            object = (Uri)object;
            return hhk.K("");
        }
        return ((gcg)object).a();
    }
}

