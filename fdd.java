/*
 * Decompiled with CFR 0.152.
 */
public final class fdd
implements jnc,
jmz {
    public final int a;
    public final Object b;
    private final int c;

    public fdd(Object object, int n2, int n3) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    @Override
    public final void a(Object object, jnf jnf2) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                n2 = this.a;
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            Object object2 = this.b;
                            object = (fhy)object;
                            ((fhp)object2).c((fhy)object, jnf2);
                            return;
                        }
                        throw new AssertionError();
                    }
                    Object object3 = this.b;
                    object = (fhv)object;
                    ((fhp)object3).b((fhv)object, jnf2);
                    return;
                }
                Object object4 = this.b;
                object = (fir)object;
                ((fhp)object4).d(jnf2);
                return;
            }
            switch (this.a) {
                default: {
                    Object object5 = this.b;
                    object = (hwh)object;
                    ((eue)object5).k(jnf2);
                    return;
                }
                case 9: {
                    Object object6 = this.b;
                    object = (eat)object;
                    ((eue)object6).c((eat)object, jnf2);
                    return;
                }
                case 8: {
                    Object object7 = this.b;
                    object = (edf)object;
                    ((eue)object7).h((edf)object, jnf2);
                    return;
                }
                case 7: {
                    Object object8 = this.b;
                    object = (edf)object;
                    ((eue)object8).g((edf)object, jnf2);
                    return;
                }
                case 6: {
                    Object object9 = this.b;
                    object = (euh)object;
                    ((eue)object9).e((euh)object, jnf2);
                    return;
                }
                case 5: {
                    Object object10 = this.b;
                    object = (eup)object;
                    ((eue)object10).i((eup)object, jnf2);
                    return;
                }
                case 4: {
                    Object object11 = this.b;
                    object = (euq)object;
                    ((eue)object11).j((euq)object, jnf2);
                    return;
                }
                case 3: {
                    Object object12 = this.b;
                    object = (eug)object;
                    ((eue)object12).b((eug)object, jnf2);
                    return;
                }
                case 2: {
                    Object object13 = this.b;
                    object = (eam)object;
                    ((eue)object13).a((eam)object, jnf2);
                    return;
                }
                case 1: {
                    Object object14 = this.b;
                    object = (eul)object;
                    ((eue)object14).f((eul)object, jnf2);
                    return;
                }
                case 0: 
            }
            Object object15 = this.b;
            object = (euj)object;
            ((eue)object15).d((euj)object, jnf2);
            return;
        }
        if (this.a != 0) {
            Object object16 = this.b;
            object = (fdj)object;
            ((fdc)object16).b((fdj)object, jnf2);
            return;
        }
        Object object17 = this.b;
        object = (fdh)object;
        ((fdc)object17).a((fdh)object, jnf2);
    }
}

