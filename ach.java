/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class ach {
    public final acu h = new acu();

    protected void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        acu acu2 = this.h;
        if (!acu2.c) {
            acu2.c = true;
            wg wg2 = acu2.d;
            synchronized (wg2) {
                Iterator<Object> iterator = acu2.a.values().iterator();
                while (iterator.hasNext()) {
                    acu.a((AutoCloseable)iterator.next());
                }
                iterator = acu2.b.iterator();
                while (iterator.hasNext()) {
                    acu.a((AutoCloseable)iterator.next());
                }
                acu2.b.clear();
            }
        }
        this.d();
    }
}

