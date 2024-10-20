/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class avy {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public avy(String string, String string2, String string3, List list, List list2) {
        jse.e(string, "referenceTable");
        jse.e(string2, "onDelete");
        jse.e(string3, "onUpdate");
        jse.e(list, "columnNames");
        jse.e(list2, "referenceColumnNames");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = list;
        this.e = list2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof avy)) return false;
        String string = this.a;
        object = (avy)object;
        if (jse.i(string, ((avy)object).a) && jse.i(this.b, ((avy)object).b) && jse.i(this.c, ((avy)object).c)) {
            if (jse.i(this.d, ((avy)object).d)) return jse.i(this.e, ((avy)object).e);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + ((Object)this.d).hashCode()) * 31 + ((Object)this.e).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        stringBuilder.append(this.a);
        stringBuilder.append("',\n            |   onDelete = '");
        stringBuilder.append(this.b);
        stringBuilder.append("',\n            |   onUpdate = '");
        stringBuilder.append(this.c);
        stringBuilder.append("',\n            |   columnNames = {");
        wg.g(jns.p(this.d));
        stringBuilder.append(jon.a);
        stringBuilder.append("\n            |   referenceColumnNames = {");
        wg.f(jns.p(this.e));
        stringBuilder.append(jon.a);
        stringBuilder.append("\n            |}\n        ");
        return jse.P(jse.Z(stringBuilder.toString()));
    }
}

