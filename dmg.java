/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

abstract class dmg {
    public abstract hyf a(String var1, Object var2);

    public abstract hyf b(hyf var1, hyf var2);

    public abstract String c(hyf var1);

    final List d(Map object) {
        ArrayList<hyf> arrayList = new ArrayList<hyf>();
        for (Map.Entry entry : object.entrySet()) {
            hyf hyf2;
            if (entry.getValue() == null || (hyf2 = this.a((String)entry.getKey(), entry.getValue())) == null) continue;
            arrayList.add(hyf2);
        }
        return arrayList;
    }

    final List e(List object2, List list) {
        if (object2.isEmpty()) {
            return object2;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            hyf hyf2;
            block3: {
                hyf2 = (hyf)iterator.next();
                String string = this.c(hyf2);
                for (Object object2 : list) {
                    if (!string.equals(this.c((hyf)object2))) continue;
                    break block3;
                }
                object2 = null;
            }
            if ((object2 = this.b(hyf2, (hyf)object2)) == null) continue;
            arrayList.add(object2);
        }
        return arrayList;
    }
}

