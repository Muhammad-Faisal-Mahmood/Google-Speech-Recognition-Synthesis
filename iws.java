/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

public abstract class iws {
    private static final BitSet d;
    public final String a;
    public final byte[] b;
    public final Object c;
    private final String e;

    static {
        int n2;
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (n2 = 48; n2 <= 57; n2 = (int)((char)(n2 + 1))) {
            bitSet.set(n2);
        }
        for (n2 = 97; n2 <= 122; n2 = (int)((char)(n2 + 1))) {
            bitSet.set(n2);
        }
        d = bitSet;
    }

    public iws(String string, boolean bl2, Object object) {
        a.s(string, "name");
        this.e = string;
        string = string.toLowerCase(Locale.ROOT);
        a.s(string, "name");
        fxf.r(string.isEmpty() ^ true, "token must have at least 1 tchar");
        if (string.equals("connection")) {
            iwx.a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2;
            char c3 = c2 = string.charAt(i2);
            if (bl2) {
                c3 = c2;
                if (c2 == ':') {
                    if (i2 == 0) {
                        i2 = 0;
                        continue;
                    }
                    c3 = ':';
                }
            }
            if (d.get(c3)) {
                continue;
            }
            throw new IllegalArgumentException(fvd.aq("Invalid character '%s' in key name '%s'", Character.valueOf(c3), string));
        }
        this.a = string;
        this.b = string.getBytes(StandardCharsets.US_ASCII);
        this.c = object;
    }

    public abstract Object a(byte[] var1);

    public abstract byte[] b(Object var1);

    public boolean c() {
        return false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (iws)object;
            return this.a.equals(((iws)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Key{name='");
        stringBuilder.append(this.a);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

