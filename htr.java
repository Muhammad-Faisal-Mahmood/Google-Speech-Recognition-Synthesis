/*
 * Decompiled with CFR 0.152.
 */
public final class htr
extends fvc {
    private final Object a = new Object();
    private htq b;
    private final htp c;

    public htr(htp htp2) {
        super((short[])null);
        this.c = htp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final iuc b() {
        Object object = this.a;
        synchronized (object) {
            htq htq2;
            if (this.b != null) {
                return new iuc();
            }
            this.b = htq2 = new htq(this.c);
            return htq2;
        }
    }
}

