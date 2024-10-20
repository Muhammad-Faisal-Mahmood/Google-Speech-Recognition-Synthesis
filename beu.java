/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 */
import android.net.ConnectivityManager;

public final class beu
implements bff {
    public final ConnectivityManager a;
    public final long b;

    public beu(ConnectivityManager connectivityManager, long l2) {
        jse.e(connectivityManager, "connManager");
        this.a = connectivityManager;
        this.b = l2;
    }

    @Override
    public final jyx a(baq baq2) {
        jse.e(baq2, "constraints");
        return new jyp(new eof(baq2, this, null, 1));
    }

    @Override
    public final boolean b(bhd bhd2) {
        jse.e(bhd2, "workSpec");
        return bhd2.k.a() != null;
    }

    @Override
    public final boolean c(bhd bhd2) {
        jse.e(bhd2, "workSpec");
        if (!this.b(bhd2)) {
            return false;
        }
        throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    }
}

