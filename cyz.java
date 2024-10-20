/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class cyz
implements hny {
    public final czd a;
    public final List b;
    public final int c;

    public /* synthetic */ cyz(czd czd2, List list, int n2) {
        this.a = czd2;
        this.b = list;
        this.c = n2;
    }

    @Override
    public final hpn a(Object object) {
        czd czd2;
        Object object2;
        Object object3;
        object = (List)object;
        ArrayList<cxr> arrayList = new ArrayList<cxr>();
        HashMap hashMap = this.b.iterator();
        while (hashMap.hasNext()) {
            arrayList.add((cxr)hashMap.next());
        }
        Object object4 = object.iterator();
        while (object4.hasNext()) {
            hashMap = (cth)object4.next();
            object = ctq.a.l();
            object3 = ((cth)((Object)hashMap)).d;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (ctq)((hwp)object).b;
            object3.getClass();
            ((ctq)object2).b = 1 | ((ctq)object2).b;
            ((ctq)object2).c = object3;
            if (((cth)((Object)hashMap)).e.isEmpty()) {
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (ctq)((hwp)object).b;
                ((ctq)object3).b |= 2;
                ((ctq)object3).d = "com.google.android.gms";
            } else {
                object2 = ((cth)((Object)hashMap)).e;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (ctq)((hwp)object).b;
                object2.getClass();
                ((ctq)object3).b |= 2;
                ((ctq)object3).d = object2;
            }
            arrayList.add(new cxr((ctq)((hwp)object).o(), (cth)((Object)hashMap)));
        }
        HashMap<String, czc> hashMap2 = new HashMap<String, czc>();
        hashMap = new HashMap();
        object2 = new HashMap();
        HashMap<String, cth> hashMap3 = new HashMap<String, cth>();
        object3 = new HashSet();
        AtomicLong atomicLong = new AtomicLong(0L);
        ArrayList<hpn> arrayList2 = new ArrayList<hpn>();
        int n2 = arrayList.size();
        int n3 = 0;
        while (true) {
            czd2 = this.a;
            if (n3 >= n2) break;
            cxr cxr2 = (cxr)arrayList.get(n3);
            Set set = czd.b(hashMap, czd.a(cxr2.a));
            String string = czd.a(cxr2.a);
            object = object4 = (czc)hashMap2.get(string);
            if (object4 == null) {
                hashMap2.put(string, new czc());
                object = (czc)hashMap2.get(string);
            }
            object4 = cxr2.a;
            if (((ctq)object4).f) {
                object4 = czd.b((Map)object2, czd.a((ctq)object4));
                hashMap3.put(czd.a(cxr2.a), cxr2.b);
            } else {
                object4 = null;
            }
            int n4 = cxr2.b.o.size();
            for (hwv hwv2 : cxr2.b.o) {
                int n5;
                boolean bl2 = cqq.ac(hwv2);
                int n6 = n5 = a.t(cxr2.b.j);
                if (n5 == 0) {
                    n6 = 1;
                }
                hwv2 = crh.l(hwv2, n6);
                arrayList2.add(fxf.aj(dah.e(czd2.g.m((ctt)hwv2)).d(cxk.class, new buf(14), czd2.e).f(new cym(czd2, 10), czd2.e), new cza((Set)object3, (ctt)hwv2, atomicLong, set, bl2, (czc)object, cxr2, (Set)object4), czd2.e));
            }
            ((czc)object).e = n4;
            ++n3;
        }
        n3 = this.c;
        return crh.w(arrayList2).u(new czb(czd2, hashMap2, hashMap3, atomicLong, n3), czd2.e);
    }
}

