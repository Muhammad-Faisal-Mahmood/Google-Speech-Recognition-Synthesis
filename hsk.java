/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class hsk
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ hsk(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ hsk(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public hsk(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.a = object2;
        this.b = object;
    }

    public hsk(Object object, Object object2, int n2, short[] sArray) {
        this.c = n2;
        this.b = object2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                Object object = this.a;
                ((jdc)this.b).c.X(object);
                return;
            }
            case 19: {
                Object object = this.b;
                ((jdc)this.a).c.W((iwx)object);
                return;
            }
            case 18: {
                Object object = this.a;
                ((jdd)this.b).b.f(object);
                return;
            }
            case 17: {
                Object object = (iyh)this.b;
                Throwable throwable = ((iyh)object).p;
                object = ((iyh)object).o;
                ((jdd)this.a).b.c((String)object, throwable);
                return;
            }
            case 16: {
                Object object = this.a;
                object = iyh.e.e(((StringBuilder)object).toString());
                ((jdd)this.b).g((iyh)object, true);
                return;
            }
            case 15: {
                Object object = this.b;
                ((jao)this.a).b((iyh)object);
                return;
            }
            case 14: {
                Object object = this.b;
                ((jao)this.a).b((iyh)object);
                return;
            }
            case 13: {
                Object object = this.a;
                ((htm)this.b).a.X(object);
                return;
            }
            case 12: {
                Object object = this.a;
                ((htm)this.b).a.W((iwx)object);
                return;
            }
            case 11: {
                hta hta2 = (hta)this.b;
                if (!hta2.a) {
                    Object object = this.a;
                    hta2.c.X(object);
                }
                return;
            }
            case 10: {
                hta hta3 = (hta)this.b;
                if (!hta3.a) {
                    Object object = this.a;
                    hta3.c.W((iwx)object);
                }
                return;
            }
            case 9: {
                Object object = this.b;
                ((hte)this.a).i((gpm)object);
                return;
            }
            case 8: {
                Object object = this.a;
                try {
                    object.run();
                    return;
                }
                catch (Throwable throwable) {
                    object = (hte)this.b;
                    ((hte)object).h = true;
                    Object object2 = ((hte)object).j;
                    if (object2 != null) {
                        ((fvc)object2).a(iyh.c(throwable), new iwx());
                        object2 = ((hte)object).i;
                        if (object2 != null && ((hte)object).e.e == 4) {
                            ((itz)object2).c(null, throwable);
                        }
                    }
                    return;
                }
            }
            case 7: {
                Object object = this.b;
                ((hte)this.a).i((gpm)object);
                return;
            }
            case 6: {
                Object object = this.a;
                hte hte2 = (hte)this.b;
                object = new htb(hte2, object);
                hte2.c.add(object);
                hte2.g();
                return;
            }
            case 5: {
                Object object = this.a;
                ((hte)this.b).h((iwx)object);
                return;
            }
            case 4: {
                Object object = this.b;
                ((hte)this.a).b.remove(object);
                return;
            }
            case 3: {
                ((hsu)this.b).b.f(this.a);
                return;
            }
            case 2: {
                hsu hsu2 = (hsu)this.b;
                if (!hsu2.c) {
                    Object object = this.a;
                    if (hsu2.b != null) {
                        try {
                            object.run();
                            return;
                        }
                        catch (Throwable throwable) {
                            hsu2.d.a(iyh.c(throwable), new iwx());
                            return;
                        }
                    }
                    hsu2.a.add(object);
                }
                return;
            }
            case 1: {
                Object object = this.b;
                Object object3 = this.a;
                try {
                    Object object4;
                    Set<Object> set;
                    Object object5 = ((hru)object).f;
                    if (((iwx)object5).i()) {
                        set = Collections.emptySet();
                    } else {
                        object4 = new HashSet(((iwx)object5).e);
                        for (int i2 = 0; i2 < ((iwx)object5).e; ++i2) {
                            set = new Set<Object>(((iwx)object5).j(i2), 0);
                            object4.add(set);
                        }
                        set = DesugarCollections.unmodifiableSet(object4);
                    }
                    set = set.iterator();
                    while (true) {
                        Object object6;
                        if (!set.hasNext()) {
                            set = ((hru)object).e;
                            object3 = (hyf)((dlm)object3).a;
                            set.c();
                            return;
                        }
                        object5 = (String)set.next();
                        if (((hru)object).k.contains(object5)) continue;
                        if (((String)object5).endsWith("-bin")) {
                            object4 = ((hru)object).f;
                            object6 = iwx.f;
                            iwo iwo2 = new iwo((String)object5, (kmp)object6);
                            ((iwx)object4).m(iwo2);
                            continue;
                        }
                        object4 = ((hru)object).f;
                        object6 = iwx.b;
                        iwm iwm2 = new iwm((String)object5, (iwn)object6);
                        ((iwx)object4).m(iwm2);
                    }
                }
                catch (Throwable throwable) {
                    ((hfk)((hfk)((hfk)hru.a.g()).i(throwable)).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseMessageProcessing", 343, "CachingClientInterceptor.java")).r("Could not write to cache");
                    return;
                }
            }
            case 0: 
        }
        ((hsm)this.b).b().f(this.a);
    }
}

