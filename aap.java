/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
final class aap {
    final Map a;
    final Map b;

    public aap(Map arrayList) {
        this.b = arrayList;
        this.a = new HashMap();
        for (Map.Entry entry : arrayList.entrySet()) {
            aaz aaz2 = (aaz)((Object)entry.getValue());
            List list = (List)this.a.get((Object)aaz2);
            arrayList = list;
            if (list == null) {
                arrayList = new ArrayList<aaq>();
                this.a.put(aaz2, arrayList);
            }
            arrayList.add((aaq)entry.getKey());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(List list, abe abe2, aaz aaz2, Object object) {
        if (list != null) {
            int n2 = list.size();
            while (--n2 >= 0) {
                aaq aaq2 = (aaq)list.get(n2);
                try {
                    int n3 = aaq2.a;
                    if (n3 != 0) {
                        if (n3 != 1) {
                            aaq2.b.invoke(object, new Object[]{abe2, aaz2});
                            continue;
                        }
                        aaq2.b.invoke(object, abe2);
                        continue;
                    }
                    aaq2.b.invoke(object, null);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new RuntimeException(illegalAccessException);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
                }
            }
        }
    }
}

