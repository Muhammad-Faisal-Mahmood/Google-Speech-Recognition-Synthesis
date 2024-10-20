/*
 * Decompiled with CFR 0.152.
 */
public final class duu
implements ckq {
    /*
     * WARNING - void declaration
     */
    @Override
    public final Object a(ckz object5) {
        cjj cjj2 = (cjj)((ckz)object5).d();
        hwp hwp2 = duq.a.l();
        Object[] objectArray = cjj2.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        duq duq2 = (duq)hwv2;
        objectArray.getClass();
        int n2 = duq2.b;
        int n3 = 1;
        duq2.b = n2 | 1;
        duq2.c = objectArray;
        String string = cjj2.c;
        if (!hwv2.B()) {
            hwp2.u();
        }
        objectArray = hwp2.b;
        duq duq3 = (duq)objectArray;
        string.getClass();
        duq3.b |= 4;
        duq3.e = string;
        boolean bl2 = cjj2.f;
        if (!objectArray.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        duq duq4 = (duq)hwv3;
        duq4.b |= 8;
        duq4.h = bl2;
        long l2 = cjj2.g;
        if (!hwv3.B()) {
            hwp2.u();
        }
        duq duq5 = (duq)hwp2.b;
        duq5.b |= 0x10;
        duq5.i = l2;
        byte[] byArray = cjj2.b;
        n2 = 2;
        if (byArray != null) {
            hvu hvu2 = hvu.q(byArray);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            duq duq6 = (duq)hwp2.b;
            duq6.b |= 2;
            duq6.d = hvu2;
        }
        for (cji cji2 : cjj2.d) {
            Object object;
            for (cjp cjp2 : cji2.b) {
                block37: {
                    void var1_18;
                    Object object2;
                    block35: {
                        Object object3;
                        Object object4;
                        int n4;
                        block26: {
                            block36: {
                                block27: {
                                    block34: {
                                        block32: {
                                            block28: {
                                                block33: {
                                                    block29: {
                                                        block30: {
                                                            block31: {
                                                                n4 = cjp2.g;
                                                                if (n4 == n3) break block26;
                                                                if (n4 == n2) break block27;
                                                                if (n4 == 3) break block28;
                                                                if (n4 == 4) break block29;
                                                                if (n4 != 5) break block30;
                                                                object = dur.a.l();
                                                                object4 = cjp2.a;
                                                                if (!((hwp)object).b.B()) {
                                                                    ((hwp)object).u();
                                                                }
                                                                object2 = (dur)((hwp)object).b;
                                                                object4.getClass();
                                                                ((dur)object2).b |= n3;
                                                                ((dur)object2).e = object4;
                                                                if (cjp2.g != 5) break block31;
                                                                byte[] byArray2 = cjp2.f;
                                                                kl.at(byArray2);
                                                                hvu hvu3 = hvu.q(byArray2);
                                                                if (!((hwp)object).b.B()) {
                                                                    ((hwp)object).u();
                                                                }
                                                                object2 = (dur)((hwp)object).b;
                                                                ((dur)object2).c = 5;
                                                                ((dur)object2).d = hvu3;
                                                                dur dur2 = (dur)((hwp)object).o();
                                                                break block32;
                                                            }
                                                            throw new IllegalArgumentException("Not a bytes type");
                                                        }
                                                        throw new IllegalArgumentException(a.af(n4, "Unrecognized flag type: "));
                                                    }
                                                    object = dur.a.l();
                                                    object2 = cjp2.a;
                                                    if (!((hwp)object).b.B()) {
                                                        ((hwp)object).u();
                                                    }
                                                    object4 = (dur)((hwp)object).b;
                                                    object2.getClass();
                                                    ((dur)object4).b |= n3;
                                                    ((dur)object4).e = object2;
                                                    if (cjp2.g != 4) break block33;
                                                    object2 = cjp2.e;
                                                    kl.at(object2);
                                                    if (!((hwp)object).b.B()) {
                                                        ((hwp)object).u();
                                                    }
                                                    dur dur3 = (dur)((hwp)object).b;
                                                    dur3.c = 4;
                                                    dur3.d = object2;
                                                    dur dur4 = (dur)((hwp)object).o();
                                                    break block32;
                                                }
                                                throw new IllegalArgumentException("Not a String type");
                                            }
                                            object = dur.a.l();
                                            object4 = cjp2.a;
                                            if (!((hwp)object).b.B()) {
                                                ((hwp)object).u();
                                            }
                                            object2 = ((hwp)object).b;
                                            object3 = (dur)object2;
                                            object4.getClass();
                                            ((dur)object3).b |= n3;
                                            ((dur)object3).e = object4;
                                            if (cjp2.g != 3) break block34;
                                            double d2 = cjp2.d;
                                            if (!((hwv)object2).B()) {
                                                ((hwp)object).u();
                                            }
                                            dur dur5 = (dur)((hwp)object).b;
                                            dur5.c = 3;
                                            dur5.d = d2;
                                            dur dur6 = (dur)((hwp)object).o();
                                            n3 = 1;
                                        }
                                        n2 = 2;
                                        break block35;
                                    }
                                    throw new IllegalArgumentException("Not a double type");
                                }
                                object = dur.a.l();
                                object4 = cjp2.a;
                                if (!((hwp)object).b.B()) {
                                    ((hwp)object).u();
                                }
                                object3 = ((hwp)object).b;
                                object2 = (dur)object3;
                                object4.getClass();
                                ((dur)object2).b |= 1;
                                ((dur)object2).e = object4;
                                n3 = cjp2.g;
                                n2 = 2;
                                if (n3 != 2) break block36;
                                bl2 = cjp2.c;
                                if (!((hwv)object3).B()) {
                                    ((hwp)object).u();
                                }
                                dur dur7 = (dur)((hwp)object).b;
                                dur7.c = 2;
                                dur7.d = bl2;
                                dur dur8 = (dur)((hwp)object).o();
                                n3 = 1;
                                break block35;
                            }
                            throw new IllegalArgumentException("Not a boolean type");
                        }
                        object = dur.a.l();
                        object3 = cjp2.a;
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        object2 = ((hwp)object).b;
                        object4 = (dur)object2;
                        object3.getClass();
                        n4 = ((dur)object4).b;
                        n3 = 1;
                        ((dur)object4).b = n4 | 1;
                        ((dur)object4).e = object3;
                        if (cjp2.g != 1) break block37;
                        l2 = cjp2.b;
                        if (!((hwv)object2).B()) {
                            ((hwp)object).u();
                        }
                        dur dur9 = (dur)((hwp)object).b;
                        dur9.c = 1;
                        dur9.d = l2;
                        dur dur10 = (dur)((hwp)object).o();
                    }
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object = (duq)hwp2.b;
                    var1_18.getClass();
                    object2 = ((duq)object).f;
                    if (!object2.c()) {
                        ((duq)object).f = hwv.s((hxk)object2);
                    }
                    ((duq)object).f.add(var1_18);
                    continue;
                }
                throw new IllegalArgumentException("Not a long type");
            }
            objectArray = cji2.c;
            if (objectArray == null) continue;
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                Object object6 = objectArray[i2];
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                duq duq7 = (duq)hwp2.b;
                object6.getClass();
                object = duq7.g;
                if (!object.c()) {
                    duq7.g = hwv.s((hxk)object);
                }
                duq7.g.add(object6);
            }
        }
        return (duq)hwp2.o();
    }
}

