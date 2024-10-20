/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

public final class kgs {
    public final kgm a;
    public final String b;
    public final kgk c;
    public final kgt d;
    public final Map e;
    public kfv f;

    public kgs(kgm kgm2, String string, kgk kgk2, kgt kgt2, Map map) {
        jse.e(string, "method");
        jse.e(map, "tags");
        this.a = kgm2;
        this.b = string;
        this.c = kgk2;
        this.d = kgt2;
        this.e = map;
    }

    public final String a(String string) {
        return this.c.b(string);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a);
        if (this.c.a() != 0) {
            stringBuilder.append(", headers=[");
            Iterator iterator = this.c.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (n2 < 0) {
                    jns.i();
                }
                Object object2 = (joc)object;
                object = (String)((joc)object2).a;
                object2 = (String)((joc)object2).b;
                if (n2 > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append((String)object);
                stringBuilder.append(':');
                stringBuilder.append((String)object2);
                ++n2;
            }
            stringBuilder.append(']');
        }
        if (!this.e.isEmpty()) {
            stringBuilder.append(", tags=");
            stringBuilder.append(this.e);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

