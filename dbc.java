/*
 * Decompiled with CFR 0.152.
 */
public final class dbc
implements dau {
    public final Object a;
    private final int b;

    public /* synthetic */ dbc(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Object object) {
        switch (this.b) {
            default: {
                object = (dio)object;
                Object object2 = dip.a;
                object2 = (dfd)this.a;
                ((dfd)object2).d();
                ((dfd)object2).g();
                ((dfd)object2).e();
                object.i();
                return;
            }
            case 8: {
                object = (dio)object;
                Object object3 = this.a;
                dya dya2 = dds.e();
                object3 = (dfd)object3;
                dya2.h(((dfd)object3).l());
                dya2.j(((dfd)object3).n());
                dya2.i(((dfd)object3).m());
                dya2.g(((dfd)object3).k());
                dya2.f();
                object.j();
                return;
            }
            case 7: {
                dio dio2 = (dio)object;
                object = (dhv)this.a;
                ((dhv)object).a.e();
                ((dhv)object).a.h().length();
                dio2.g();
                return;
            }
            case 6: {
                object = (bzq)object;
                int n2 = dfp.b;
                ((bzq)object).k((Throwable)this.a);
                return;
            }
            case 5: {
                object = (dck)object;
                fxf.K(this.a);
                object.b();
                return;
            }
            case 4: {
                ((bzq)object).q((String)this.a);
                return;
            }
            case 3: {
                ((bzq)object).j((String)this.a);
                return;
            }
            case 2: {
                ((bzq)object).q((String)this.a);
                return;
            }
            case 1: {
                ((bzq)object).j((String)this.a);
                return;
            }
            case 0: 
        }
        ((bzq)object).k((Throwable)this.a);
    }
}

