/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class ggf
extends jsf
implements jrk {
    final jrq a;
    final String b;
    final int c;
    final ggh d;
    final hqp e;

    public ggf(jrq jrq2, String string, int n2, ggh ggh2, hqp hqp2) {
        this.a = jrq2;
        this.b = string;
        this.c = n2;
        this.d = ggh2;
        this.e = hqp2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2;
        Object object2 = this.e;
        String[] stringArray = this.d.e;
        int n3 = this.c;
        Object object3 = (byte[])object;
        if (object2 != null) {
            object2 = ((hqp)object2).i;
            jse.d(object2, "getLogSourceNameList(...)");
            jse.e(stringArray, "<this>");
            jse.e(object2, "elements");
            jse.e(object2, "<this>");
            object = object2 instanceof Collection ? Integer.valueOf(object2.size()) : null;
            if (object != null) {
                n2 = ((Number)object).intValue();
                n2 = stringArray.size() + n2;
            } else {
                n2 = stringArray.size();
                n2 += n2;
            }
            object = new LinkedHashSet(jjj.E(n2));
            ((AbstractCollection)object).addAll(stringArray);
            jns.A(object, (Iterable)object2);
            stringArray = jns.s(jns.w(object)).toArray(new String[0]);
        } else {
            stringArray = stringArray.toArray(new String[0]);
        }
        object = object3;
        if (object3 == null) {
            object = this.e;
            object = object != null && (object = ((hqp)object).j) != null ? (Object)((hvu)object).y() : null;
        }
        object3 = this.b;
        object2 = this.a;
        n2 = n3;
        return ((dus)((ggn)object2).c).e((String)object3, n2, stringArray, (byte[])object);
    }
}

