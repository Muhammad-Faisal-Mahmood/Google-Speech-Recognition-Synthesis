/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class aog
implements Comparator {
    private final int a;

    public /* synthetic */ aog(int n2) {
        this.a = n2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compare(Object object, Object object2) {
        int n2 = this.a;
        int n3 = 0;
        int n4 = 0;
        switch (n2) {
            default: {
                object = (den)object;
                object2 = (den)object2;
                return ((den)object).o().c(((den)object2).o());
            }
            case 19: {
                object = (File)object;
                object2 = (File)object2;
                return -Long.compare(((File)object).lastModified(), ((File)object2).lastModified());
            }
            case 18: {
                object = (ctt)object;
                object2 = (ctt)object2;
                return cqq.D((hyf)object).compareTo(cqq.D((hyf)object2));
            }
            case 17: {
                object = ((cxr)object).a;
                object2 = (cxr)object2;
                return cqq.D((hyf)object).compareTo(cqq.D(((cxr)object2).a));
            }
            case 16: {
                object = (ctq)object;
                object2 = (ctq)object2;
                return cqq.D((hyf)object).compareTo(cqq.D((hyf)object2));
            }
            case 15: {
                object = ((izk)object).c;
                object2 = (izk)object2;
                return ((String)((buc)object).d.get(0)).compareTo((String)((buc)((izk)object2).c).d.get(0));
            }
            case 14: {
                return jjj.t((Comparable)((Object)((avz)object).a), (Comparable)((Object)((avz)object2).a));
            }
            case 13: {
                return jjj.t((Comparable)((Object)((avx)object).a), (Comparable)((Object)((avx)object2).a));
            }
            case 12: {
                return jjj.t((Integer)((Map.Entry)object).getKey(), (Integer)((Map.Entry)object2).getKey());
            }
            case 11: {
                return jjj.t((Integer)((Map.Entry)object).getKey(), (Integer)((Map.Entry)object2).getKey());
            }
            case 10: {
                object = (api)object;
                object2 = (api)object2;
                return Float.compare(((api)object).c, ((api)object2).c);
            }
            case 9: {
                object = (api)object;
                object2 = (api)object2;
                return ((api)object).a - ((api)object2).a;
            }
            case 8: {
                aow aow2 = (aow)object;
                object2 = (aow)object2;
                object = aow2.e && aow2.h ? aox.a : new hdf(aox.a);
                gyv gyv2 = gyv.b;
                aop aop2 = aow2.f;
                return gyv2.d(aow2.k, ((aow)object2).k, (Comparator)object).d(aow2.j, ((aow)object2).j, (Comparator)object).a();
            }
            case 7: {
                aow aow3 = (aow)object;
                aow aow4 = (aow)object2;
                object = object2 = gyv.b.e(aow3.h, aow4.h).b(aow3.m, aow4.m).e(aow3.n, aow4.n).e(aow3.i, aow4.i).e(aow3.e, aow4.e).e(aow3.g, aow4.g).d(aow3.l, aow4.l, hde.a).e(aow3.o, aow4.o).e(aow3.p, aow4.p);
                if (!aow3.o) return ((gyv)object).a();
                object = object2;
                if (!aow3.p) return ((gyv)object).a();
                object = ((gyv)object2).b(aow3.q, aow4.q);
                return ((gyv)object).a();
            }
            case 6: {
                object = (List)object;
                object2 = (List)object2;
                return ((aot)object.get(0)).a((aot)object2.get(0));
            }
            case 5: {
                object = (List)object;
                object2 = (List)object2;
                return gyv.b.d((aow)Collections.max(object, new aog(7)), (aow)Collections.max(object2, new aog(7)), new aog(7)).b(object.size(), object2.size()).d((aow)Collections.max(object, new aog(8)), (aow)Collections.max(object2, new aog(8)), new aog(8)).a();
            }
            case 4: {
                object = (List)object;
                object2 = (List)object2;
                return ((aol)Collections.max(object)).a((aol)Collections.max(object2));
            }
            case 3: {
                object = (List)object;
                object2 = (List)object2;
                return ((aom)object.get(0)).a((aom)object2.get(0));
            }
            case 2: {
                void var3_7;
                object = (Integer)object;
                object2 = (Integer)object2;
                n3 = (Integer)object;
                int n5 = -1;
                if (n3 != -1) {
                    if ((Integer)object2 != -1) return (Integer)object - (Integer)object2;
                    return (int)var3_7;
                }
                if ((Integer)object2 != -1) int n6;
                return n6;
                int n7 = n4;
                return (int)var3_7;
            }
            case 1: {
                void var3_13;
                object = (byte[])object;
                byte[] byArray = (byte[])object2;
                object2 = ub.a;
                n4 = ((Object)object).length;
                int n8 = byArray.length;
                if (n4 != n8) {
                    int n9 = n4 - n8;
                    return (int)var3_13;
                } else {
                    n4 = 0;
                    while (true) {
                        Object object3 = n3;
                        if (n4 >= ((Object)object).length) return (int)var3_13;
                        object3 = object[n4];
                        byte by2 = byArray[n4];
                        if (object3 != by2) {
                            int n10 = object3 - by2;
                            return (int)var3_13;
                        }
                        ++n4;
                    }
                }
            }
            case 0: 
        }
        object = (adu)object;
        return ((adu)object2).j - ((adu)object).j;
    }
}

