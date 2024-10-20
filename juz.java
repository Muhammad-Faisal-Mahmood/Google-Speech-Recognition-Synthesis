/*
 * Decompiled with CFR 0.152.
 */
public final class juz
extends jpw
implements jxb {
    public static final gqs b = new gqs();
    public final long a;

    public juz(long l2) {
        super(b);
        this.a = l2;
    }

    @Override
    public final /* synthetic */ Object a(jqf object) {
        object = (object = (jva)object.get(jva.b)) != null ? ((jva)object).a : "coroutine";
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        int n2 = jse.v(string);
        jse.e(string, "<this>");
        n2 = !(string instanceof String) ? jse.J(string, " @", n2, 0, true) : string.lastIndexOf(" @", n2);
        int n3 = n2;
        if (n2 < 0) {
            n3 = string.length();
        }
        StringBuilder stringBuilder = new StringBuilder(((String)object).length() + n3 + 10);
        String string2 = string.substring(0, n3);
        jse.d(string2, "substring(...)");
        stringBuilder.append(string2);
        stringBuilder.append(" @");
        stringBuilder.append((String)object);
        stringBuilder.append('#');
        stringBuilder.append(this.a);
        thread.setName(stringBuilder.toString());
        return string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof juz)) {
            return false;
        }
        object = (juz)object;
        return this.a == ((juz)object).a;
    }

    public final int hashCode() {
        long l2 = this.a;
        return (int)(l2 ^ l2 >>> 32);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineId(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

