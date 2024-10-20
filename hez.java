/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class hez {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final Class e;

    protected hez(String string, Class clazz, boolean bl2) {
        this(string, clazz, bl2, true);
    }

    public hez(String string, Class clazz, boolean bl2, boolean bl3) {
        if (!string.isEmpty()) {
            int n2 = 0;
            if (hhk.g(string.charAt(0))) {
                int n3;
                for (n3 = 1; n3 < string.length(); ++n3) {
                    char c2 = string.charAt(n3);
                    if (hhk.g(c2) || c2 >= '0' && c2 <= '9' || c2 == '_') continue;
                    throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(string));
                }
                this.a = string;
                this.e = clazz;
                this.b = bl2;
                this.c = bl3;
                n3 = System.identityHashCode(this);
                long l2 = 0L;
                while (n2 < 5) {
                    l2 |= 1L << (n3 & 0x3F);
                    n3 >>>= 6;
                    ++n2;
                }
                this.d = l2;
                return;
            }
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(string));
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }

    public void a(Iterator iterator, hey hey2) {
        while (iterator.hasNext()) {
            this.b(iterator.next(), hey2);
        }
    }

    public void b(Object object, hey hey2) {
        hey2.a(this.a, object);
    }

    public final Object c(Object object) {
        return this.e.cast(object);
    }

    public final String toString() {
        Object object = this.e;
        String string = this.getClass().getName();
        object = ((Class)object).getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append(this.a);
        stringBuilder.append("[");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

