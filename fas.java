/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Map$_EL;
import j$.util.Optional;
import j$.util.function.Consumer$_CC;
import java.util.Map;
import java.util.function.Consumer;

public final class fas
implements Consumer {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ fas(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ fas(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public final void accept(Object object) {
        switch (this.c) {
            default: {
                fga fga2 = (fga)object;
                object = this.b;
                fga2.e((String)this.a, (fef)object);
                return;
            }
            case 13: {
                object = (fga)object;
                Object object2 = this.b;
                object.n((String)this.a, (fef)object2);
                return;
            }
            case 12: {
                object = (ffz)object;
                Object object3 = this.b;
                object.f((String)this.a, (fex)object3);
                return;
            }
            case 11: {
                ffz ffz2 = (ffz)object;
                object = this.b;
                ffz2.j((String)this.a, (fgd)object);
                return;
            }
            case 10: {
                object = (fga)object;
                Object object4 = this.b;
                object.n((String)this.a, (fef)object4);
                return;
            }
            case 9: {
                object = (fga)object;
                Object object5 = this.b;
                object.k((String)this.a, (fgc)object5);
                return;
            }
            case 8: {
                object = (hwr)object;
                Object object6 = this.a;
                ((hwr)object).aH((gpm)this.b, object6);
                return;
            }
            case 7: {
                Object object7 = (fef)object;
                Object object8 = this.a;
                ffy ffy2 = (ffy)this.b;
                String string = (String)object8;
                object = ffy2.m(string) ? dxv.aR : dxv.i;
                object = ((dyn)object).b("recognition_session", string);
                gpm gpm2 = hkx.k;
                hwp hwp2 = hkx.a.l();
                Object object9 = ffy2.a;
                Long l2 = 0L;
                long l3 = (Long)Map$_EL.getOrDefault((Map)object9, object8, l2);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object9 = (hkx)hwp2.b;
                ((hkx)object9).b |= 0x40;
                ((hkx)object9).i = l3;
                l3 = (Long)Map$_EL.getOrDefault(ffy2.b, object8, l2);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object8 = (hkx)hwp2.b;
                ((hkx)object8).b |= 0x80;
                ((hkx)object8).j = l3;
                ((dyp)object).n(gpm2, (hkx)hwp2.o());
                object7 = ((fef)object7).a;
                ffy2.a(string, ((dyp)object).i(((fdr)object7).a, ((fdr)object7).b()));
                return;
            }
            case 6: {
                bzo bzo2 = (bzo)object;
                object = (String)this.a;
                bzo2.N((String)object);
                if (((Optional)this.b).isPresent()) {
                    return;
                }
                bzo2.M((String)object);
                return;
            }
            case 5: {
                boolean bl2;
                object = (bzo)object;
                Object object10 = (bmu)this.b;
                boolean bl3 = ((hav)((bmu)object10).c).isEmpty();
                boolean bl4 = bl2 = false;
                if (bl3) {
                    bl4 = bl2;
                    if (((hav)((bmu)object10).a).isEmpty()) {
                        bl4 = bl2;
                        if (((hav)((bmu)object10).b).isEmpty()) {
                            bl4 = true;
                        }
                    }
                }
                Object object11 = this.a;
                object = ((bzo)object).a;
                object10 = dxv.az.c(1);
                ((dyj)object10).r("model_manager", ((fce)object11).a);
                gpm gpm3 = hkj.h;
                hwp hwp3 = hkj.a.l();
                if (!hwp3.b.B()) {
                    hwp3.u();
                }
                object11 = (hkj)hwp3.b;
                ((hkj)object11).b |= 8;
                ((hkj)object11).g = bl4;
                ((dyj)object10).u(gpm3, (hkj)hwp3.o());
                object.a((dyk)object10);
                return;
            }
            case 4: {
                int n2 = ((ezj)this.b).b;
                Object object12 = this.a;
                object = (bzo)object;
                object12 = dxv.aJ.b("model_manager", (String)object12);
                ((bzo)object).a.a((dyk)object12);
                return;
            }
            case 3: {
                object = (faw)object;
                Object object13 = this.b;
                object = new dpw(object13, object, 18, null);
                object13 = String.valueOf(((ezj)object13).b());
                ((fat)this.a).a((Runnable)object, "request_".concat((String)object13));
                return;
            }
            case 2: {
                Object object14 = (fax)object;
                object = this.b;
                object14 = new dpw(object, object14, 17, null);
                object = String.valueOf(((ezj)object).b());
                ((fat)this.a).a((Runnable)object14, "uninstall_".concat((String)object));
                return;
            }
            case 1: {
                Object object15 = this.b;
                object = (bzo)object;
                Object object16 = (fgu)object15;
                Object object17 = fhq.i((fgu)object16);
                object = ((bzo)object).a;
                object15 = this.a;
                object15 = dxv.ay.b("model_manager", (String)object15);
                gpm gpm4 = hkj.h;
                hwp hwp4 = hkj.a.l();
                if (!hwp4.b.B()) {
                    hwp4.u();
                }
                Object object18 = ((fgu)object16).h;
                hwv hwv2 = hwp4.b;
                hkj hkj2 = (hkj)hwv2;
                hkj2.c = ((idq)object18).m;
                hkj2.b = 1 | hkj2.b;
                if (!hwv2.B()) {
                    hwp4.u();
                }
                object16 = ((fgu)object16).d;
                object18 = hwp4.b;
                hwv2 = (hkj)object18;
                object16.getClass();
                ((hkj)hwv2).b |= 2;
                ((hkj)hwv2).d = object16;
                if (!((hwv)object18).B()) {
                    hwp4.u();
                }
                object16 = (hkj)hwp4.b;
                object18 = ((hkj)object16).f;
                if (!object18.c()) {
                    ((hkj)object16).f = hwv.q((hxb)object18);
                }
                object18 = object17.iterator();
                while (object18.hasNext()) {
                    object17 = (iaz)object18.next();
                    ((hkj)object16).f.g(((iaz)object17).r);
                }
                ((dyj)object15).u(gpm4, (hkj)hwp4.o());
                object.a((dyk)object15);
                return;
            }
            case 0: 
        }
        object = (fav)object;
        Object object19 = this.b;
        object = new dpw(object19, object, 16, null);
        object19 = String.valueOf(((ezj)object19).b());
        ((fat)this.a).a((Runnable)object, "install_".concat((String)object19));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 0: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

