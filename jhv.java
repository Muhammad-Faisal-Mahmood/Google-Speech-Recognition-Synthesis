/*
 * Decompiled with CFR 0.152.
 */
final class jhv
extends iuc {
    long a;
    final jid b;
    private final jib c;

    public jhv(jid jid2, jib jib2) {
        this.b = jid2;
        this.c = jib2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(long l2) {
        Object object;
        if (this.b.q.f != null) {
            return;
        }
        Object object2 = this.b.l;
        synchronized (object2) {
            long l3;
            if (this.b.q.f != null) return;
            object = this.c;
            if (((jib)object).b) {
                return;
            }
            this.a = l3 = this.a + l2;
            jid jid2 = this.b;
            l2 = jid2.u;
            if (l3 <= l2) {
                return;
            }
            if (l3 > jid2.m) {
                ((jib)object).c = true;
            } else {
                l2 = jid2.E.D(l3 - l2);
                object = this.b;
                ((jid)object).u = this.a;
                if (l2 > ((jid)object).n) {
                    this.c.c = true;
                }
            }
            object = this.c;
            object = ((jib)object).c ? this.b.q((jib)object) : null;
        }
        if (object == null) return;
        object.run();
    }
}

