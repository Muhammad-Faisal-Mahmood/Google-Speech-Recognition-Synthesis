/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;

public final class ivn {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public ivn(String string, String string2, long l2) {
        a.s(string, "typeName");
        fxf.r(string.isEmpty() ^ true, "empty type");
        this.c = string;
        this.d = string2;
        this.a = l2;
    }

    public static ivn a(Class object, String string) {
        a.s(object, "type");
        String string2 = ((Class)object).getSimpleName();
        object = !string2.isEmpty() ? string2 : ((Class)object).getName().substring(((Class)object).getPackage().getName().length() + 1);
        return ivn.b((String)object, string);
    }

    public static ivn b(String string, String string2) {
        return new ivn(string, string2, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.c);
        stringBuilder2.append("<");
        stringBuilder2.append(this.a);
        stringBuilder2.append(">");
        stringBuilder.append(stringBuilder2.toString());
        if (this.d != null) {
            stringBuilder.append(": (");
            stringBuilder.append(this.d);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }
}

