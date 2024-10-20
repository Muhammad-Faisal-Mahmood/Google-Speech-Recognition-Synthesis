/*
 * Decompiled with CFR 0.152.
 */
public class gih
implements ilw {
    private volatile Object a;
    private final Object b = new Object();
    private final be c;

    public gih(be be2) {
        this.c = be2;
    }

    protected void a(be be2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a;
        Object object = this.b;
        synchronized (object) {
            if (this.a != null) return this.a;
            a.s(this.c.getHost(), "Sting Fragments must be attached before creating the component.");
            Object object2 = this.c;
            fxf.E(((be)object2).getHost() instanceof ilw, "Sting Fragments must be attached to an @Sting Activity or @TikTokFragmentHost. Found: %s", ((be)object2).getHost().getClass());
            this.a(this.c);
            object2 = ((gig)((ilw)this.c.getHost()).bn()).e();
            ((bqv)object2).a = this.c;
            this.a = ((bqv)object2).a();
            return this.a;
        }
    }
}

