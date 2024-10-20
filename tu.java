/*
 * Decompiled with CFR 0.152.
 */
@Deprecated
public final class tu {
    public boolean a;
    public boolean b;
    public fkg c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        fkg fkg2;
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            fkg2 = this.c;
        }
        if (fkg2 == null) return;
        try {
            fkg2.e();
            return;
        }
        finally {
            synchronized (this) {
                this.b = false;
                this.notifyAll();
            }
        }
    }
}

