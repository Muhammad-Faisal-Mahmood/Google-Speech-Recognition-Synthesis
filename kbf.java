/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class kbf {
    public static final Object a(Object arrayList, Object object) {
        boolean bl2 = jve.a;
        if (arrayList == null) {
            arrayList = object;
        } else if (arrayList instanceof ArrayList) {
            ((ArrayList)arrayList).add(object);
        } else {
            ArrayList<Object> arrayList2 = new ArrayList<Object>(4);
            arrayList2.add(arrayList);
            arrayList2.add(object);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final boolean equals(Object object) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

