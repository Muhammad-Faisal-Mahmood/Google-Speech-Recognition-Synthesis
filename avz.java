/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class avz {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    public avz(String arrayList, boolean bl2, List arrayList2, List list) {
        jse.e(arrayList, "name");
        jse.e(arrayList2, "columns");
        jse.e(list, "orders");
        this.a = arrayList;
        this.b = bl2;
        this.c = arrayList2;
        this.d = list;
        arrayList = list;
        if (list.isEmpty()) {
            int n2 = arrayList2.size();
            arrayList2 = new ArrayList<String>(n2);
            int n3 = 0;
            while (true) {
                arrayList = arrayList2;
                if (n3 >= n2) break;
                arrayList2.add("ASC");
                ++n3;
            }
        }
        this.d = arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof avz)) return false;
        boolean bl2 = this.b;
        object = (avz)object;
        if (bl2 != ((avz)object).b || !jse.i(this.c, ((avz)object).c) || !jse.i(this.d, ((avz)object).d)) {
            return false;
        }
        if (!jse.X(this.a, "index_")) return jse.i(this.a, ((avz)object).a);
        return jse.X(((avz)object).a, "index_");
    }

    public final int hashCode() {
        int n2 = jse.X(this.a, "index_") ? -1184239155 : this.a.hashCode();
        return ((n2 * 31 + this.b) * 31 + ((Object)this.c).hashCode()) * 31 + ((Object)this.d).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n            |Index {\n            |   name = '");
        stringBuilder.append(this.a);
        stringBuilder.append("',\n            |   unique = '");
        stringBuilder.append(this.b);
        stringBuilder.append("',\n            |   columns = {");
        wg.g(this.c);
        stringBuilder.append(jon.a);
        stringBuilder.append("\n            |   orders = {");
        wg.f(this.d);
        stringBuilder.append(jon.a);
        stringBuilder.append("\n            |}\n        ");
        return jse.P(jse.Z(stringBuilder.toString()));
    }
}

