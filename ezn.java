/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class ezn
implements Callable {
    public final hpn a;
    public final hpn b;
    public final faq c;
    public final ezs d;

    public /* synthetic */ ezn(hpn hpn2, hpn hpn3, faq faq2, ezs ezs2) {
        this.a = hpn2;
        this.b = hpn3;
        this.c = faq2;
        this.d = ezs2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object call() {
        Object object;
        faq faq2 = this.c;
        jse.e(faq2, "$languagePackRequest");
        gzx gzx2 = (gzx)hhk.S(this.a);
        Object object2 = (gzx)hhk.S(this.b);
        jse.b(object2);
        Object object3 = new ArrayList<Object>();
        Iterator iterator = object2.iterator();
        while (true) {
            boolean bl2 = iterator.hasNext();
            boolean bl3 = true;
            if (!bl2) break;
            ezs ezs2 = this.d;
            object = iterator.next();
            object2 = (ezj)object;
            if (!ezs2.e) {
                ((hfk)ezs.a.b()).r("Rollbacks not enabled.");
            } else if (gzx2.isEmpty()) {
                ((hfk)ezs.a.g()).r("No downloadable packs available. Return installed packs.");
            } else {
                jse.b(gzx2);
                if (!(gzx2 instanceof Collection) || !gzx2.isEmpty()) {
                    for (Object object42 : gzx2) {
                        if (!((ezj)object42).a.equals(((ezj)object2).a) || ((ezj)object42).b < ((ezj)object2).b) continue;
                        break;
                    }
                } else {
                    bl3 = false;
                }
                ((hfk)ezs.a.b()).D("Due to rollback enablement, inspecting validity of pack %s. Result: %b", ((ezj)object2).b(), bl3);
                if (!bl3) continue;
            }
            object3.add(object);
        }
        object = new ArrayList(jns.B(object3));
        iterator = object3.iterator();
        while (iterator.hasNext()) {
            object2 = (ezj)iterator.next();
            jse.b(gzx2);
            jse.e(object2, "installedPack");
            jse.e(gzx2, "downloadablePacks");
            object3 = object2;
            if (((ezj)object2).d.isEmpty()) {
                Object object42;
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (Object object42 : gzx2) {
                    if (!((ezj)object42).d((ezj)object2)) continue;
                    arrayList.add(object42);
                }
                object3 = new ArrayList();
                object42 = arrayList.iterator();
                while (object42.hasNext()) {
                    Object e2 = object42.next();
                    if (!((ezj)e2).c()) continue;
                    object3.add(e2);
                }
                ArrayList<Object> arrayList2 = new ArrayList<Object>();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object42 = object3.next();
                    if (((ezj)object42).d.isEmpty()) continue;
                    arrayList2.add(object42);
                }
                if (arrayList2.isEmpty()) {
                    ((hfk)ezs.a.b()).A("No feature-containing match found for [%s, %d].", ((ezj)object2).a, ((ezj)object2).b);
                    object3 = object2;
                } else {
                    if (arrayList2.size() > 1) {
                        ((hfk)ezs.a.f()).G("Multiple downloadable packs found for [%s %d] which could perform a feature override. Merging configs with one of them arbitrarily: %s", ((ezj)object2).a, ((ezj)object2).b, arrayList2.get(0));
                    }
                    object3 = ((ezj)arrayList2.get((int)0)).d;
                    object3 = new ezj(((ezj)object2).a, ((ezj)object2).b, ((ezj)object2).h, ((ezj)object2).c, (hac)object3, ((ezj)object2).e, ((ezj)object2).f, ((ezj)object2).g);
                }
            }
            object.add((Object)object3);
        }
        return crh.B(crh.C(fvd.T(object), faq2));
    }
}

