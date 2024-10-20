/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class dna {
    public final gte a = new cym(this, 13);
    public volatile boolean b = false;
    private final guh c;
    private volatile Process d;

    public dna(gup gup2) {
        this.c = new guh(gup2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string) {
        if (string.isEmpty()) {
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            }
            catch (IllegalThreadStateException illegalThreadStateException) {
                return;
            }
        }
        if (this.b) return;
        synchronized (this) {
            guh guh2 = this.c;
            if (guh2.a && guh2.a(TimeUnit.MILLISECONDS) < 60000L) {
                return;
            }
            this.c.c();
            this.c.d();
            this.d = (Process)this.a.apply(string);
            return;
        }
    }
}

