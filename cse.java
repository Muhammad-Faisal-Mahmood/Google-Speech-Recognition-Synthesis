/*
 * Decompiled with CFR 0.152.
 */
public final class cse
extends fvc {
    public final Object a = new Object();
    public csd b;
    public boolean c = false;
    public final dql d;

    public cse(dql dql2) {
        super((short[])null);
        this.d = dql2;
        if (!fxf.P("application/grpc")) {
            dql2.k = "application/grpc";
        }
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
            csd csd2;
            if (this.b != null) {
                return new iuc();
            }
            this.b = csd2 = new csd(this.d);
            return csd2;
        }
    }
}

