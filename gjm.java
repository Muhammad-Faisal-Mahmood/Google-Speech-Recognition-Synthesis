/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
public final class gjm
implements jnu {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ gjm(gpm gpm2, Object object, int n2) {
        this.c = n2;
        this.b = gpm2;
        this.a = object;
    }

    public /* synthetic */ gjm(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final Object b() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object = this.a;
                    Object object2 = String.valueOf((String)object.getKey());
                    Object object3 = this.b;
                    String string = "Create gRPC Service Impl ".concat((String)object2);
                    object2 = goo.a;
                    gqv gqv2 = gqv.a;
                    object3 = ((gpm)object3).e(string, (gop)object2, gqv2);
                    try {
                        object = (itt)((jnu)object.getValue()).b();
                        return object;
                    }
                    finally {
                        object3.close();
                    }
                }
                return gop.e(gop.d(((imj)this.a).a()), (gop)((gpm)this.b).b);
            }
            Object object = this.b;
            jse.e(object, "$packageName");
            return (gpm)this.a.a(object);
        }
        gzs gzs2 = new gzs();
        gzs2.h(new gjp(0));
        gzs2.j(((gjx)this.a).a());
        Object object = this.b;
        gka gka2 = gka.a;
        gka2 = (gka)((gto)object).e(gka2);
        gzs2.h(new gjo());
        gzs2.h(new gjp(1));
        return gzs2.g();
    }
}

