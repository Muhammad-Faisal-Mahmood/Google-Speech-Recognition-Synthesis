/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class ddo {
    public static final guf a = guf.b(';').d().a();

    public static Set c(Collection object) {
        if (object.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet<ddn> hashSet = new HashSet<ddn>();
        object = ((gzx)object).v();
        while (object.hasNext()) {
            hashSet.add(((ddo)object.next()).b());
        }
        return hashSet;
    }

    public abstract int a();

    public abstract ddn b();

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.b("name", this.b());
        gtn2.e("version", this.a());
        return gtn2.toString();
    }
}

