/*
 * Decompiled with CFR 0.152.
 */
import java.text.Collator;
import java.util.Comparator;

public final class bvk
implements Comparator {
    public final Object a;
    private final int b;

    public bvk(iyd iyd2, int n2) {
        this.b = n2;
        this.a = iyd2;
    }

    public /* synthetic */ bvk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                this.a.a(object);
                this.a.a(object2);
                return object.getClass().getName().compareTo(object2.getClass().getName());
            }
            n2 = amj.a;
            Object object3 = this.a;
            return object3.a(object2) - object3.a(object);
        }
        object = (String)object;
        object2 = (String)object2;
        return ((Collator)this.a).compare((String)object, (String)object2);
    }
}

