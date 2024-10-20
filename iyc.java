/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class iyc {
    public final String a;
    public final Collection b;

    public iyc(ksb ksb2) {
        String string;
        this.a = string = (String)ksb2.b;
        Object object = ksb2.a;
        HashSet<String> hashSet = new HashSet<String>(object.size());
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (ixb)iterator.next();
            a.s(object, "method");
            String string2 = ((ixb)object).c;
            fxf.y(string.equals(string2), "service names %s != %s", string2, string);
            fxf.v(hashSet.add(((ixb)object).b), "duplicate name %s", ((ixb)object).b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList(ksb2.a));
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("name", this.a);
        gtn2.b("schemaDescriptor", null);
        gtn2.b("methods", this.b);
        gtn2.d();
        return gtn2.toString();
    }
}

