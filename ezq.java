/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 *  hom
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ezq
extends jsf
implements jrk {
    final Object a;
    final Object b;
    private final int c;

    public ezq(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
        super(1);
    }

    public ezq(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        block19: {
            switch (this.c) {
                default: {
                    object = (Throwable)object;
                    if (object != null) break;
                    Object object2 = this.b;
                    object = this.a.bE();
                    ((kap)object2).a(object);
                    break block19;
                }
                case 8: {
                    object = (Throwable)object;
                    object = this.a;
                    ((jxm)this.b).a.removeCallbacks((Runnable)object);
                    return jon.a;
                }
                case 7: {
                    Object object3;
                    List list = (List)object;
                    jse.e(list, "succeededListeners");
                    Object object4 = this.b.entrySet();
                    object = new ArrayList();
                    object4 = object4.iterator();
                    while (object4.hasNext()) {
                        object3 = object4.next();
                        if (list.contains(((Map.Entry)object3).getKey())) continue;
                        object.add(object3);
                    }
                    list = new jpk(null);
                    object3 = object.iterator();
                    while (true) {
                        object = this.a;
                        if (!object3.hasNext()) break;
                        Map.Entry entry = (Map.Entry)object3.next();
                        Object object5 = new frn(entry, 16);
                        object4 = (ghl)object;
                        hpn hpn2 = fxf.ai((hnx)object5, ((ghl)object4).c);
                        object5 = ((ghl)object4).c;
                        object5 = hhk.R(hpn2, 180L, TimeUnit.SECONDS, (ScheduledExecutorService)object5);
                        gax.c((hpn)object5, "Client StartupAfterPackageReplacedListener failed for key: %s", new hue(entry.getKey()));
                        jse.d(object5, "also(...)");
                        list.add(fxf.ak(fxf.ae(fxf.aE(new hpn[]{object5}).B(new dwp(4), (Executor)hom.a), Exception.class, new ggk(ero.n, 3), (Executor)hom.a), new ghi(new ezq(object, entry, 6), 0), ((ghl)object4).b));
                    }
                    list = jns.c(list);
                    return fxf.aB(list).B(new gkv(list, 1), ((ghl)object).b);
                }
                case 6: {
                    object = (Boolean)object;
                    jse.e(object, "succeeded");
                    if (((Boolean)object).booleanValue()) {
                        ArrayList<Object> arrayList = this.a;
                        object = (String)this.b.getKey();
                        Object object6 = this.a;
                        jse.e(object, "listenerKey");
                        bzq bzq2 = ((ghl)((Object)arrayList)).a();
                        StringBuilder stringBuilder = new StringBuilder();
                        arrayList = new ArrayList<Object>();
                        stringBuilder.append("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                        arrayList.add(object);
                        arrayList.add(Long.valueOf(((ghl)object6).d));
                        object = bzq2.Y(fvc.R(stringBuilder, arrayList));
                        jse.d(object, "execSql(...)");
                        object = fxf.ak((hpn)object, new ghi(ero.o, 2), ((ghl)this.a).b);
                    } else {
                        object = hhk.K(false);
                    }
                    return object;
                }
                case 5: {
                    String string = (String)object;
                    jse.e(string, "packageName");
                    object = ((bzo)this.a).L(string) ? new gkc(1) : new gkc(2);
                    Object object7 = this.b;
                    String string2 = File.separator;
                    String string3 = File.separator;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("phenotype");
                    stringBuilder.append(string3);
                    stringBuilder.append(string);
                    string3 = stringBuilder.toString();
                    string = gda.a;
                    object = ((goi)object7).g((gkc)object, string3, (gda)string);
                    jse.d(object, "getMobStoreUri(...)");
                    return object;
                }
                case 4: {
                    object = (Void)object;
                    return ((gpm)((ggh)this.a).c.b()).u((String)this.b, true);
                }
                case 3: {
                    String string = (String)object;
                    jse.e(string, "mendelPackage");
                    object = ((bzo)this.a).L(string) ? new gkc(1) : new gkc(2);
                    Object object8 = this.b;
                    String string4 = File.separator;
                    String string5 = File.separator;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string4);
                    stringBuilder.append("phenotype");
                    stringBuilder.append(string5);
                    stringBuilder.append(string);
                    string = stringBuilder.toString();
                    stringBuilder = gda.a;
                    object = ((goi)object8).g((gkc)object, string, (gda)stringBuilder);
                    jse.d(object, "getMobStoreUri(...)");
                    return object;
                }
                case 2: {
                    object = (Void)object;
                    Object object9 = this.b;
                    object = this.a;
                    object9 = gto.h(object9);
                    return new cxu((bql)object, (gto)object9);
                }
                case 1: {
                    object = (Throwable)object;
                    if (object instanceof bdp) {
                        Object object10 = this.a;
                        int n2 = ((bdp)object).a;
                        ((bbh)object10).g(n2);
                    }
                    this.b.cancel(false);
                    return jon.a;
                }
                case 0: {
                    Object object11;
                    object = (ezo)object;
                    jse.e(object, "allPacks");
                    object = jns.n(((ezo)object).b, ((ezo)object).c);
                    Object object12 = new ArrayList<Object>();
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        object11 = this.b;
                        object = iterator.next();
                        if (!jse.i(((ezj)object).a, object11)) continue;
                        object12.add(object);
                    }
                    object = new ArrayList();
                    object11 = object12.iterator();
                    while (object11.hasNext()) {
                        object12 = object11.next();
                        if (!((ezj)object12).c()) continue;
                        object.add(object12);
                    }
                    object12 = this.a;
                    object11 = new ArrayList(jns.B((Iterable)object));
                    iterator = object.iterator();
                    while (iterator.hasNext()) {
                        object = (ezj)iterator.next();
                        ((hfk)ezs.a.f()).G("Removing language pack [%s, %d]: %s", ((ezj)object).a, ((ezj)object).b, object);
                        object11.add(((ezs)object12).b.b(object));
                    }
                    return fxf.aD((Iterable)object11).B(new bdr(this.b, 16), ((ezs)this.a).f);
                }
            }
            ((kap)this.b).b((Throwable)object);
        }
        return jon.a;
    }
}

