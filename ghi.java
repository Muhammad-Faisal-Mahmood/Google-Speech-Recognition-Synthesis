/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ghi
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ ghi(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a(Object object) {
        Object object2;
        switch (this.b) {
            default: {
                object2 = this.a;
                object = (hkb)object2;
                ++((hkb)object).g;
                break;
            }
            case 7: {
                Object object3;
                Object object4;
                Object object5 = (Map)object;
                object = new ArrayList();
                Iterator iterator = object5.entrySet().iterator();
                while (true) {
                    object4 = this.a;
                    if (!iterator.hasNext()) break;
                    object3 = (glj)iterator.next().getValue();
                    Object object6 = (glx)object4;
                    gcv gcv2 = ((glx)object6).c;
                    baq baq2 = glx.b(((glj)object3).a);
                    object4 = glx.d(glx.b(((glj)object3).a), ((glx)object6).c());
                    long l2 = ((glj)object3).b;
                    object6 = ((glx)object6).c();
                    gch gch2 = gcl.a(gls.class);
                    gch2.e = gto.i(l2);
                    gch2.c(new gci(gls.b, gsl.a));
                    gch2.f(new gck((String)object4, 3));
                    gch2.b(baq2);
                    gch2.d(new hdq(gls.d((gto)object6)));
                    if (((gto)object6).g()) {
                        gch2.e((String)((gto)object6).c());
                    }
                    object.add(hno.f(gcv2.b(gch2.a()), gqk.b(new ggk(object3, 8)), (Executor)hom.a));
                }
                object3 = object5.keySet();
                object5 = new HashSet();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object5.add(glx.b((Set)object3.next()));
                }
                object3 = (glx)object4;
                object.add(hno.g(((glx)object3).c.c(gls.d(((glx)object3).c())), gqk.d(new fbk(object4, object5, 17, null)), ((glx)object3).b));
                return hhk.aa((Iterable)object).a(gqk.j(new dwp(9)), (Executor)hom.a);
            }
            case 6: {
                Object object7 = (Map)object;
                if (object7.isEmpty()) {
                    object = hpj.a;
                } else {
                    object = new ArrayList();
                    object7 = object7.entrySet().iterator();
                    while (object7.hasNext()) {
                        Object object8;
                        boolean bl2;
                        Object object9 = this.a;
                        glj glj2 = (glj)((Map.Entry)object7.next()).getValue();
                        Object object10 = glj2.a.iterator();
                        boolean bl3 = false;
                        boolean bl4 = bl2 = false;
                        while (object10.hasNext()) {
                            object8 = (gkj)((Object)object10.next());
                            boolean bl5 = object8 == gkj.a;
                            bl3 |= bl5;
                            bl5 = object8 == gkj.c;
                            bl5 = bl4 | bl5;
                            bl4 = object8 == gkj.b;
                            bl2 |= bl4;
                            bl4 = bl5;
                        }
                        object8 = new bao();
                        ((bao)object8).a = bl3;
                        if (bl2) {
                            ((bao)object8).b(bbj.c);
                        } else if (bl4) {
                            ((bao)object8).b(bbj.b);
                        }
                        object8 = ((bao)object8).a();
                        object10 = glj2.a;
                        object9 = (glv)object9;
                        Object object11 = ((glv)object9).b();
                        Serializable serializable = new StringBuilder("SyncTask");
                        if (((gto)object11).g()) {
                            ((StringBuilder)serializable).append("_proc<");
                            ((StringBuilder)serializable).append((String)((gto)object11).c());
                            ((StringBuilder)serializable).append(">");
                        }
                        object10 = new TreeSet(object10).iterator();
                        while (object10.hasNext()) {
                            ((StringBuilder)serializable).append(((gkj)((Object)object10.next())).d);
                            ((StringBuilder)serializable).append('_');
                        }
                        String string = ((StringBuilder)serializable).toString();
                        long l3 = cgw.p().toEpochMilli();
                        object11 = new gcj(Math.max(0L, glj2.b - l3), TimeUnit.MILLISECONDS);
                        serializable = ((glv)object9).b();
                        object10 = gcl.a(glp.class);
                        ((gch)object10).d = object11;
                        ((gch)object10).f(new gck(string, 1));
                        ((gch)object10).b((baq)object8);
                        ((gch)object10).d(new hdq("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"));
                        if (((gto)serializable).g()) {
                            ((gch)object10).e((String)((gto)serializable).c());
                        }
                        object.add(hno.f(((glv)object9).b.b(((gch)object10).a()), gqk.b(new ggk(glj2, 7)), (Executor)hom.a));
                    }
                    object = hhk.aa(object).a(gqk.j(new dwp(8)), (Executor)hom.a);
                }
                return object;
            }
            case 5: {
                object = (Void)object;
                return this.a;
            }
            case 4: {
                long l4 = (Long)object;
                ot ot2 = new ot();
                ot ot3 = new ot();
                long l5 = cgw.p().toEpochMilli();
                object = this.a;
                gld gld2 = (gld)object;
                return fxf.ak(fxf.aj(gld2.h(gld2.g.b()), new gla(gld2, l4, l5, ot3, ot2), gld2.b), new ghi(object, 3), gld2.b);
            }
            case 3: {
                Object object12;
                object = (Map)object;
                ((heg)((heg)gld.a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 306, "SyncManagerImpl.java")).u("Running synclets: %s", Collection$_EL.stream(object.keySet()).map(new fcx(13)).toArray());
                Object object13 = this.a;
                gld gld3 = (gld)object13;
                if (((gto)((imc)gld3.i).a).g()) {
                    object12 = (Boolean)((gto)((imc)gld3.i).a).c();
                }
                if (object.isEmpty()) {
                    object = hhk.K(hdc.a);
                } else {
                    object12 = gld3.g;
                    object12 = fxf.ah(new gku((gky)object12, object.keySet()), ((gky)object12).d);
                    object12 = fxf.an(gld3.h((hpn)object12), new dcf(object13, object12, object, 8), gld3.b);
                    object13 = gld3.d;
                    Objects.requireNonNull(object);
                    object = fxf.am((hpn)object12, new gkv(object, 3), gld3.b);
                    ((gax)object13).d((hpn)object);
                }
                return object;
            }
            case 2: {
                return a.n((jrk)this.a, object);
            }
            case 1: {
                return a.n((jrk)this.a, object);
            }
            case 0: {
                return a.n((jrk)this.a, object);
            }
        }
        try {
            object = ((hkb)object2).b.a();
        }
        catch (Exception exception) {
            ((hnk)object2).n(exception);
            object = hhk.K(null);
        }
        return object;
    }
}

