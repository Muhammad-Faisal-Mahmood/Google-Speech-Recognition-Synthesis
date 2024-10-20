/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

final class csd
extends iuc {
    public final Object a = new Object();
    public final dql b;
    public boolean c;
    public int d;
    public int e;

    public csd(dql dql2) {
        this.b = dql2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Object object = this.a;
        synchronized (object) {
            if (!this.c) {
                dql dql2 = this.b;
                dql2.b = SystemClock.elapsedRealtime() - dql2.a;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(long l2) {
        Object object = this.a;
        synchronized (object) {
            this.d += (int)l2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(long l2) {
        Object object = this.a;
        synchronized (object) {
            this.e += (int)l2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(its object) {
        Object object2 = this.a;
        synchronized (object2) {
            dql dql2 = this.b;
            object = (SocketAddress)((its)object).a(ivd.a);
            if (!(object instanceof InetSocketAddress)) {
                if (object instanceof jbe) {
                    dql2.v = 2;
                } else if (object instanceof iyp) {
                    dql2.v = 3;
                }
            }
            return;
        }
    }
}

