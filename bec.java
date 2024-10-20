/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class bec {
    public final bxt a;
    private final bbt b;
    private final long c;
    private final Object d;
    private final Map e;

    public bec(bbt bbt2, bxt bxt2) {
        long l2 = TimeUnit.MINUTES.toMillis(90L);
        this.b = bbt2;
        this.a = bxt2;
        this.c = l2;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(bzb object) {
        jse.e(object, "token");
        Object object2 = this.d;
        synchronized (object2) {
            object = (Runnable)this.e.remove(object);
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl6 : MonitorExitStatement: MONITOREXIT : var2_3
            if (object != null) {
                this.b.a((Runnable)object);
            }
            return;
        }
    }

    public final void b(bzb object) {
        aks aks2 = new aks((Object)this, object, 8, null);
        Object object2 = this.d;
        synchronized (object2) {
            object = this.e.put(object, aks2);
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl6 : MonitorExitStatement: MONITOREXIT : var2_4
            this.b.b(this.c, aks2);
            return;
        }
    }
}

