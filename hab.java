/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Map;

final class hab
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final Object a;
    private final Object b;

    public hab(hac object) {
        Object[] objectArray = new Object[object.size()];
        Object[] objectArray2 = new Object[object.size()];
        object = ((hac)object).k().k();
        int n2 = 0;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            objectArray[n2] = entry.getKey();
            objectArray2[n2] = entry.getValue();
            ++n2;
        }
        this.a = objectArray;
        this.b = objectArray2;
    }

    final Object readResolve() {
        Object object = this.a;
        if (!(object instanceof hav)) {
            Object object2 = this.b;
            object = (Object[])object;
            gzy gzy2 = new gzy(((Object[])object).length);
            for (int i2 = 0; i2 < ((Object[])object).length; ++i2) {
                gzy2.d(object[i2], ((Object[])object2)[i2]);
            }
            return gzy2.b();
        }
        object = (hav)object;
        Object object3 = (gzm)this.b;
        gzy gzy3 = new gzy(((AbstractCollection)object).size());
        object = ((hav)object).k();
        object3 = ((gzm)object3).k();
        while (object.hasNext()) {
            gzy3.d(object.next(), object3.next());
        }
        return gzy3.b();
    }
}

