/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class uf
implements um {
    final Object a;
    private final int b;

    public uf(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void a(Object object) {
        ArrayList arrayList;
        if (this.b != 0) {
            hti hti2 = (hti)object;
            object = hti2;
            if (hti2 == null) {
                object = new hti(-3);
            }
            ((awg)this.a).B((hti)object);
            return;
        }
        hti hti3 = (hti)object;
        object = ug.c;
        synchronized (object) {
            arrayList = (ArrayList)ug.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            ug.d.remove(this.a);
        }
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((um)arrayList.get(n2)).a(hti3);
            ++n2;
        }
        return;
    }
}

