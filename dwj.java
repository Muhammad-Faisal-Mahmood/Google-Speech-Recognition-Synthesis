/*
 * Decompiled with CFR 0.152.
 */
public final class dwj
implements gte {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object apply(Object object4) {
        long l2;
        Object object2;
        Object object3 = (duq)object4;
        hwp hwp2 = dwn.a.l();
        if (object3 == null) {
            return (dwn)hwp2.o();
        }
        for (Object object4 : ((duq)object3).f) {
            object2 = dwo.a.l();
            String string = ((dur)object4).e;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            hwv hwv2 = ((hwp)object2).b;
            dwo dwo2 = (dwo)hwv2;
            string.getClass();
            dwo2.b |= 1;
            dwo2.e = string;
            int n2 = ((dur)object4).c;
            int n3 = a.y(n2);
            if (n3 == 0) throw null;
            if (--n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) throw new IllegalStateException("No known flag type");
                            object4 = n2 == 5 ? (hvu)((dur)object4).d : hvu.b;
                            if (!((hwp)object2).b.B()) {
                                ((hwp)object2).u();
                            }
                            hwv2 = (dwo)((hwp)object2).b;
                            object4.getClass();
                            ((dwo)hwv2).c = 6;
                            ((dwo)hwv2).d = object4;
                        } else {
                            object4 = n2 == 4 ? (String)((dur)object4).d : "";
                            if (!hwv2.B()) {
                                ((hwp)object2).u();
                            }
                            hwv2 = (dwo)((hwp)object2).b;
                            object4.getClass();
                            ((dwo)hwv2).c = 5;
                            ((dwo)hwv2).d = object4;
                        }
                    } else {
                        double d2 = n2 == 3 ? (Double)((dur)object4).d : 0.0;
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object4 = (dwo)((hwp)object2).b;
                        ((dwo)object4).c = 4;
                        ((dwo)object4).d = d2;
                    }
                } else {
                    boolean bl2 = n2 == 2 ? (Boolean)((dur)object4).d : false;
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object4 = (dwo)((hwp)object2).b;
                    ((dwo)object4).c = 3;
                    ((dwo)object4).d = bl2;
                }
            } else {
                l2 = n2 == 1 ? (Long)((dur)object4).d : 0L;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object4 = (dwo)((hwp)object2).b;
                ((dwo)object4).c = 2;
                ((dwo)object4).d = l2;
            }
            object2 = (dwo)((hwp)object2).o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (dwn)hwp2.b;
            object2.getClass();
            object4 = ((dwn)hwv2).g;
            if (!object4.c()) {
                ((dwn)hwv2).g = hwv.s((hxk)object4);
            }
            ((dwn)hwv2).g.add(object2);
        }
        object2 = ((duq)object3).e;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        Object object5 = (dwn)object4;
        object2.getClass();
        ((dwn)object5).b = 4 | ((dwn)object5).b;
        ((dwn)object5).e = object2;
        object5 = ((duq)object3).c;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        object2 = (dwn)object4;
        object5.getClass();
        ((dwn)object2).b = 1 | ((dwn)object2).b;
        ((dwn)object2).c = object5;
        l2 = ((duq)object3).i;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        object5 = (dwn)object4;
        ((dwn)object5).b |= 8;
        ((dwn)object5).f = l2;
        if ((((duq)object3).b & 2) == 0) return (dwn)hwp2.o();
        object3 = ((duq)object3).d;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object4 = (dwn)hwp2.b;
        object3.getClass();
        ((dwn)object4).b |= 2;
        ((dwn)object4).d = object3;
        return (dwn)hwp2.o();
    }
}

