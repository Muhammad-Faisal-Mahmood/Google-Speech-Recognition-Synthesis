/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class hda
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Object[] a;
    final int[] b;

    public hda(hch object) {
        object = (hap)object;
        int n2 = ((hap)object).o().size();
        this.a = new Object[n2];
        this.b = new int[n2];
        object = ((hap)object).o().iterator();
        n2 = 0;
        while (object.hasNext()) {
            hci hci2 = (hci)object.next();
            this.a[n2] = hci2.a;
            this.b[n2] = hci2.a();
            ++n2;
        }
    }

    Object readResolve() {
        Object[] objectArray;
        ham ham2 = new ham(this.a.length);
        for (int i2 = 0; i2 < (objectArray = this.a).length; ++i2) {
            ham2.d(objectArray[i2], this.b[i2]);
        }
        return ham2.a();
    }
}

