/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class hxl {
    static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        b = byArray;
        c = ByteBuffer.wrap(byArray);
        hvy.L(byArray);
    }

    public static int a(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    static int b(int n2, byte[] byArray, int n3, int n4) {
        for (int i2 = n3; i2 < n3 + n4; ++i2) {
            n2 = n2 * 31 + byArray[i2];
        }
        return n2;
    }

    static void c(Object object) {
        object.getClass();
    }

    static void d(hyf hyf2) {
        if (!(hyf2 instanceof hve)) {
            return;
        }
        hyf2 = (hve)hyf2;
        throw null;
    }
}

