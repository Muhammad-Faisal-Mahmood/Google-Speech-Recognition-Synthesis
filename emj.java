/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class emj {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/listener/reporter/MicUpdateReporter");
    public final Executor a;
    private final Set c;
    private final Map d = new HashMap();

    public emj(Set set, Executor executor) {
        this.c = set;
        this.a = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final hou c(emi object) {
        synchronized (this) {
            if (this.d.containsKey(object)) return (hou)this.d.get(object);
            hou hou2 = new hou();
            this.d.put(object, hou2);
            return (hou)this.d.get(object);
        }
    }

    public final void a(int n2, hpn hpn2, hpn hpn3) {
        hhk.T(hpn2, gqk.g(new enw(this, n2, hpn3, 1)), this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            ((heg)((heg)b.f()).j("com/google/android/libraries/search/audio/listener/reporter/MicUpdateReporter", "reportMicUpdate", 132, "MicUpdateReporter.java")).r("#audio# reportMicUpdate");
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                emi emi2 = (emi)iterator.next();
                hou hou2 = this.c(emi2);
                bdr bdr2 = new bdr(emi2, 13);
                gax.c(hou2.a(gqk.j(bdr2), this.a), "Failed to notify MicUpdateListener.", new Object[0]);
            }
            return;
        }
    }
}

