/*
 * Decompiled with CFR 0.152.
 */
public final class dcd
implements dau {
    private final int a;

    public /* synthetic */ dcd(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(Object object) {
        switch (this.a) {
            default: {
                dio dio2 = (dio)object;
                object = dip.a;
                dio2.l();
                return;
            }
            case 7: {
                ((dio)object).h();
                return;
            }
            case 6: {
                object = (dio)object;
                Object object2 = dip.a;
                object.l();
                return;
            }
            case 5: {
                object = (dio)object;
                long l2 = din.a;
                object.k();
                return;
            }
            case 4: {
                object = (dds)object;
                int n2 = dij.a;
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/JobTaskScheduler", "<init>", 110, "JobTaskScheduler.java")).u("Buffered schedule call removed for %s", object);
                return;
            }
            case 3: {
                ((Runnable)object).run();
                return;
            }
            case 2: {
                ((dck)object).a();
                return;
            }
            case 1: {
                ((dck)object).a();
                return;
            }
            case 0: 
        }
        ((dck)object).c();
    }
}

