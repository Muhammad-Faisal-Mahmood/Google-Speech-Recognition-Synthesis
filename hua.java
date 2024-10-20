/*
 * Decompiled with CFR 0.152.
 */
import com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class hua
extends abi
implements ilw {
    private volatile ilq a;
    private final Object b = new Object();
    private boolean c = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a.bn();
        Object object = this.b;
        synchronized (object) {
            ilq ilq2;
            if (this.a != null) return this.a.bn();
            this.a = ilq2 = new ilq(this);
            return this.a.bn();
        }
    }

    @Override
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            Object object = this.bn();
            Object object2 = (MainProcessEndpointService)this;
            object = (bre)object;
            ((MainProcessEndpointService)object2).a = new htu(((bre)object).a, (ScheduledExecutorService)((bre)object).b.b.b(), (ive)((bre)object).b.L.b(), gto.i((List)((bre)object).b.M.b()));
            ((MainProcessEndpointService)object2).b = (iyu)((bre)object).b.N.b();
            object2 = hdc.a;
        }
        super.onCreate();
    }
}

