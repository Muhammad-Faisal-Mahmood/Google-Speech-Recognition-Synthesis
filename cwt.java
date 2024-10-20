/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class cwt
implements gte {
    private final int a;

    public /* synthetic */ cwt(int n2) {
        this.a = n2;
    }

    @Override
    public final Object apply(Object object) {
        int n2 = this.a;
        Object object2 = -1;
        Object object3 = false;
        Object object4 = true;
        switch (n2) {
            default: {
                object = (IOException)object;
                return object3;
            }
            case 19: {
                object = (Void)object;
                return object4;
            }
            case 18: {
                object = (IOException)object;
                return object3;
            }
            case 17: {
                object = (Void)object;
                return object4;
            }
            case 16: {
                object = (IOException)object;
                return object3;
            }
            case 15: {
                object = (Void)object;
                return object4;
            }
            case 14: {
                object = (IOException)object;
                return object3;
            }
            case 13: {
                object = (IOException)object;
                return object3;
            }
            case 12: {
                object = (Void)object;
                return object4;
            }
            case 11: {
                object = (Void)object;
                return object4;
            }
            case 10: {
                object2 = (cto)object;
                object = (hwp)((hwv)object2).C(5);
                ((hwp)object).x((hwv)object2);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (cto)((hwp)object).b;
                object4 = cto.a;
                ((cto)object2).d = hyp.b;
                return (cto)((hwp)object).o();
            }
            case 9: {
                return ((cto)object).d;
            }
            case 8: {
                object = (IOException)object;
                return object3;
            }
            case 7: {
                object = (Void)object;
                return object4;
            }
            case 6: {
                object = (cto)object;
                object2 = (hwp)((hwv)object).C(5);
                ((hwp)object2).x((hwv)object);
                if (!((hwp)object2).a.B()) {
                    ((hwp)object2).b = ((hwp)object2).q();
                    return (cto)((hwp)object2).o();
                }
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            case 5: {
                object = (Void)object;
                cwz.a = true;
                return null;
            }
            case 4: {
                object = (List)object;
                object4 = new ArrayList();
                object3 = object.iterator();
                while (object3.hasNext()) {
                    cxr cxr2 = (cxr)object3.next();
                    object = object2 = cxr2.b.c;
                    if (object2 == null) {
                        object = ctg.a;
                    }
                    if (((ctg)object).h) continue;
                    object4.add(cxr2);
                }
                return object4;
            }
            case 3: {
                object = (gto)object;
                boolean bl2 = cwz.a;
                if (!((gto)object).g()) {
                    object = object2;
                } else if ((Integer)(object = (Integer)((gto)object).c()) < 0) {
                    object = object2;
                }
                return object;
            }
            case 2: {
                object = (IOException)object;
                boolean bl3 = cwz.a;
                cyr.p("Failed to update days since last maintenance", new Object[0]);
                return gto.i(object2);
            }
            case 1: {
                object = (Boolean)object;
                boolean bl4 = cwz.a;
                return null;
            }
            case 0: 
        }
        object = (Void)object;
        return object4;
    }
}

