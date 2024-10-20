/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
import android.os.IBinder;
import java.util.concurrent.Executor;

final class jab
extends jad {
    private final jim d;

    public jab(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new jim(executor);
    }

    @Override
    public final void a(int n2, jah jah2) {
        mp mp2 = new mp(this, n2, jah2.a(), 9);
        this.d.execute(mp2);
        jah2.b();
    }
}

