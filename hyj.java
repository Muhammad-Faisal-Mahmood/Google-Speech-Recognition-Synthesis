/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

final class hyj
implements hyu {
    private final hyf a;
    private final hzd b;
    private final boolean c;

    public hyj(hzd hzd2, hyf hyf2) {
        this.b = hzd2;
        this.c = hyf2 instanceof hws;
        this.a = hyf2;
    }

    @Override
    public final int a(Object iterator) {
        int n2;
        Object object;
        hze hze2 = hzd.f(iterator);
        int n3 = hze2.e;
        int n4 = 0;
        int n5 = n3;
        if (n3 == -1) {
            n5 = 0;
            for (n3 = 0; n3 < hze2.b; ++n3) {
                int n6 = hzo.a(hze2.c[n3]);
                object = (hvu)hze2.d[n3];
                n2 = hwd.Z(1);
                n5 += n2 + n2 + hwd.aa(2, n6) + hwd.G(3, (hvu)object);
            }
            hze2.e = n5;
        }
        n3 = n5;
        if (this.c) {
            object = idi.s(iterator);
            n2 = ((hwl)object).b.b;
            n3 = 0;
            while (n4 < n2) {
                n3 += ((hwl)object).c(((hwl)object).b.d(n4));
                ++n4;
            }
            iterator = ((hwl)object).b.a().iterator();
            while (iterator.hasNext()) {
                n3 += ((hwl)object).c((Map.Entry)iterator.next());
            }
            n3 = n5 + n3;
        }
        return n3;
    }

    @Override
    public final int b(Object object) {
        int n2;
        int n3 = n2 = ((Object)hzd.f(object)).hashCode();
        if (this.c) {
            n3 = n2 * 53 + idi.s(object).hashCode();
        }
        return n3;
    }

    @Override
    public final Object e() {
        hyf hyf2 = this.a;
        if (hyf2 instanceof hwv) {
            return ((hwv)hyf2).n();
        }
        return hyf2.aY().s();
    }

    @Override
    public final void g(Object object) {
        this.b.e(object);
        idi.v(object);
    }

    @Override
    public final void h(Object object, Object object2) {
        hyv.o(object, object2);
        if (this.c) {
            hyv.n(object, object2);
        }
    }

    @Override
    public final void i(Object object, byte[] byArray, int n2, int n3, hvj hvj2) {
        Object object2 = (hwv)object;
        Object object3 = ((hwv)object2).unknownFields;
        hze hze2 = object3;
        if (object3 == hze.a) {
            ((hwv)object2).unknownFields = hze2 = new hze();
        }
        object2 = ((hws)object).c();
        object = null;
        while (n2 < n3) {
            n2 = hvk.t(byArray, n2, hvj2);
            int n4 = hvj2.a;
            if (n4 != hzo.a) {
                if (hzo.b(n4) == 2) {
                    object = hvj2.d.b(this.a, hzo.a(n4));
                    if (object != null) {
                        object3 = ((gpm)object).b;
                        n2 = hvk.f(hyo.a.a(object3.getClass()), byArray, n2, n3, hvj2);
                        object3 = hvj2.c;
                        ((hwl)object2).n((hwu)((gpm)object).a, object3);
                        continue;
                    }
                    n2 = hvk.s(n4, byArray, n2, n3, hze2, hvj2);
                    continue;
                }
                n2 = hvk.z(n4, byArray, n2, n3, hvj2);
                continue;
            }
            int n5 = 0;
            object3 = null;
            while (true) {
                n4 = n2;
                if (n2 >= n3) break;
                n2 = hvk.t(byArray, n2, hvj2);
                int n6 = hvj2.a;
                n4 = hzo.a(n6);
                int n7 = hzo.b(n6);
                if (n4 != 2) {
                    if (n4 == 3) {
                        if (object != null) {
                            Object object4 = ((gpm)object).b;
                            n2 = hvk.f(hyo.a.a(object4.getClass()), byArray, n2, n3, hvj2);
                            object4 = hvj2.c;
                            ((hwl)object2).n((hwu)((gpm)object).a, object4);
                            continue;
                        }
                        if (n7 == 2) {
                            n2 = hvk.c(byArray, n2, hvj2);
                            object3 = (hvu)hvj2.c;
                            continue;
                        }
                    }
                } else if (n7 == 0) {
                    n2 = hvk.t(byArray, n2, hvj2);
                    n5 = hvj2.a;
                    object = hvj2.d.b(this.a, n5);
                    continue;
                }
                n4 = n2;
                if (n6 == hzo.b) break;
                n2 = hvk.z(n6, byArray, n2, n3, hvj2);
            }
            if (object3 != null) {
                hze2.e(hzo.c(n5, 2), object3);
            }
            n2 = n4;
        }
        if (n2 == n3) {
            return;
        }
        throw new hxn("Failed to parse the message.");
    }

    @Override
    public final boolean j(Object object, Object object2) {
        if (!((Object)hzd.f(object)).equals(hzd.f(object2))) {
            return false;
        }
        if (this.c) {
            return idi.s(object).equals(idi.s(object2));
        }
        return true;
    }

    @Override
    public final boolean k(Object object) {
        return idi.s(object).j();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void l(Object object, hvz object2, hwj hwj2) {
        hzd hzd2 = this.b;
        Object object3 = hzd2.b(object);
        hwl hwl2 = idi.t(object);
        while (true) {
            Object object4;
            int n2;
            block15: {
                try {
                    while (((hvz)object2).c() != Integer.MAX_VALUE) {
                        boolean bl2;
                        n2 = ((hvz)object2).a;
                        if (n2 == hzo.a) break block15;
                        if (hzo.b(n2) == 2) {
                            object4 = hwj2.b(this.a, hzo.a(n2));
                            if (object4 != null) {
                                idi.u((hvz)object2, object4, hwj2, hwl2);
                                continue;
                            }
                            bl2 = hzd2.a(object3, (hvz)object2, 0);
                        } else {
                            bl2 = ((hvz)object2).P();
                        }
                        if (bl2) {
                            continue;
                        }
                        break;
                    }
                }
                catch (Throwable throwable) {
                    hzd.g(object, (hze)object3);
                    throw throwable;
                }
                hzd.g(object, (hze)object3);
                return;
            }
            object4 = null;
            Object object5 = null;
            n2 = 0;
            {
                while (((hvz)object2).c() != Integer.MAX_VALUE) {
                    int n3 = ((hvz)object2).a;
                    if (n3 == hzo.c) {
                        n2 = ((hvz)object2).i();
                        object4 = hwj2.b(this.a, n2);
                        continue;
                    }
                    if (n3 == hzo.d) {
                        if (object4 != null) {
                            idi.u((hvz)object2, object4, hwj2, hwl2);
                            continue;
                        }
                        object5 = ((hvz)object2).o();
                        continue;
                    }
                    if (((hvz)object2).P()) continue;
                }
                if (((hvz)object2).a != hzo.b) {
                    object2 = new hxn("Protocol message end-group tag did not match expected tag.");
                    throw object2;
                }
                if (object5 == null) continue;
                if (object4 != null) {
                    hyg hyg2 = ((gpm)object4).b.aY();
                    object5 = ((hvu)object5).k();
                    hyg2.j((hvy)object5, hwj2);
                    object4 = ((gpm)object4).a;
                    hyg2 = hyg2.s();
                    hwl2.n((hwu)object4, hyg2);
                    ((hvy)object5).z(0);
                    continue;
                }
                hzd2.c(object3, n2, (hvu)object5);
                continue;
            }
            break;
        }
    }

    @Override
    public final void m(Object object, dlm dlm2) {
        Iterator iterator = idi.s(object).e();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            hwu hwu2 = (hwu)entry.getKey();
            if (hwu2.a() == hzn.i && !hwu2.d && !hwu2.e) {
                if (entry instanceof hxq) {
                    dlm2.E(hwu2.b, ((hxs)((hxq)entry).a.getValue()).a());
                    continue;
                }
                dlm2.E(hwu2.b, entry.getValue());
                continue;
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        object = hzd.f(object);
        for (int i2 = 0; i2 < ((hze)object).b; ++i2) {
            dlm2.E(hzo.a(((hze)object).c[i2]), ((hze)object).d[i2]);
        }
    }
}

