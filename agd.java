/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public final class agd
implements afp {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public agd(Handler handler) {
        this.b = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ilo h() {
        List list = a;
        synchronized (list) {
            if (!list.isEmpty()) return (ilo)list.remove(list.size() - 1);
            return new ilo();
        }
    }

    @Override
    public final void a(int n2) {
        abr.d(true);
        this.b.removeMessages(n2);
    }

    @Override
    public final boolean b() {
        abr.d(true);
        return this.b.hasMessages(1);
    }

    @Override
    public final void c(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override
    public final void d(int n2) {
        this.b.sendEmptyMessage(n2);
    }

    @Override
    public final ilo e(int n2) {
        ilo ilo2 = agd.h();
        ilo2.a = this.b.obtainMessage(n2);
        return ilo2;
    }

    @Override
    public final ilo f(int n2, Object object) {
        ilo ilo2 = agd.h();
        ilo2.a = this.b.obtainMessage(n2, object);
        return ilo2;
    }

    @Override
    public final void g(ilo ilo2) {
        Object object = ilo2.a;
        abr.i(object);
        this.b.sendMessageAtFrontOfQueue((Message)object);
        ilo2.c();
    }
}

