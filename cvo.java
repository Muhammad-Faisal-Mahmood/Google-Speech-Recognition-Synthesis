/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cvo
implements gte {
    public final List a;
    public final Set b;
    public final dmt c;

    public /* synthetic */ cvo(dmt dmt2, List list, Set set) {
        this.c = dmt2;
        this.a = list;
        this.b = set;
    }

    @Override
    public final Object apply(Object object) {
        Set set;
        Object object2 = this.a;
        object2.addAll((List)object);
        Iterator iterator = object2.iterator();
        block0: while (true) {
            set = this.b;
            if (!iterator.hasNext()) break;
            cth cth2 = (cth)iterator.next();
            Iterator iterator2 = cth2.o.iterator();
            while (true) {
                Object object3;
                int n2;
                if (!iterator2.hasNext()) continue block0;
                object = this.c;
                object2 = (ctf)iterator2.next();
                int n3 = n2 = a.t(cth2.j);
                if (n2 == 0) {
                    n3 = 1;
                }
                Object object4 = ((dmt)object).a;
                Object object5 = ((dmt)object).b;
                hwp hwp2 = ctt.a.l();
                object = cqq.Z((ctf)object2);
                n2 = cqq.r((Context)object4, (cuv)object5).ordinal();
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            if (!hwp2.b.B()) {
                                hwp2.u();
                            }
                            object2 = hwp2.b;
                            object4 = (ctt)object2;
                            object.getClass();
                            ((ctt)object4).b |= 4;
                            ((ctt)object4).e = object;
                            if (!((hwv)object2).B()) {
                                hwp2.u();
                            }
                            object = (ctt)hwp2.b;
                            ((ctt)object).f = n3 - 1;
                            ((ctt)object).b |= 8;
                        }
                    } else {
                        object5 = ((ctf)object2).d;
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object3 = hwp2.b;
                        object4 = (ctt)object3;
                        object5.getClass();
                        ((ctt)object4).b = 1 | ((ctt)object4).b;
                        ((ctt)object4).c = object5;
                        n2 = ((ctf)object2).e;
                        if (!((hwv)object3).B()) {
                            hwp2.u();
                        }
                        object5 = hwp2.b;
                        object4 = (ctt)object5;
                        ((ctt)object4).b = 2 | ((ctt)object4).b;
                        ((ctt)object4).d = n2;
                        if (!((hwv)object5).B()) {
                            hwp2.u();
                        }
                        object4 = hwp2.b;
                        object5 = (ctt)object4;
                        object.getClass();
                        ((ctt)object5).b |= 4;
                        ((ctt)object5).e = object;
                        if (!((hwv)object4).B()) {
                            hwp2.u();
                        }
                        object = (ctt)hwp2.b;
                        ((ctt)object).f = n3 - 1;
                        ((ctt)object).b |= 8;
                        if ((((ctf)object2).b & 0x20) != 0) {
                            object = object2 = ((ctf)object2).h;
                            if (object2 == null) {
                                object = ikm.a;
                            }
                            if (!hwp2.b.B()) {
                                hwp2.u();
                            }
                            object2 = (ctt)hwp2.b;
                            object.getClass();
                            ((ctt)object2).g = object;
                            ((ctt)object2).b |= 0x10;
                        }
                    }
                } else {
                    object3 = ((ctf)object2).d;
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object4 = hwp2.b;
                    object5 = (ctt)object4;
                    object3.getClass();
                    ((ctt)object5).b = 1 | ((ctt)object5).b;
                    ((ctt)object5).c = object3;
                    n2 = ((ctf)object2).e;
                    if (!((hwv)object4).B()) {
                        hwp2.u();
                    }
                    object4 = hwp2.b;
                    object2 = (ctt)object4;
                    ((ctt)object2).b = 2 | ((ctt)object2).b;
                    ((ctt)object2).d = n2;
                    if (!((hwv)object4).B()) {
                        hwp2.u();
                    }
                    object2 = hwp2.b;
                    object4 = (ctt)object2;
                    object.getClass();
                    ((ctt)object4).b |= 4;
                    ((ctt)object4).e = object;
                    if (!((hwv)object2).B()) {
                        hwp2.u();
                    }
                    object = (ctt)hwp2.b;
                    ((ctt)object).f = n3 - 1;
                    ((ctt)object).b |= 8;
                }
                set.add((ctt)hwp2.o());
            }
            break;
        }
        return set;
    }
}

