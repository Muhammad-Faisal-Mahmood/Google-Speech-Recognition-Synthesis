/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public abstract class hjd {
    public static final hjd d;
    public static final hjd e;
    public static final hjd f;

    static {
        Character c2 = Character.valueOf('=');
        d = new hja("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", c2);
        e = new hja("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", c2);
        new hjc("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", c2);
        new hjc("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", c2);
        f = new hiz(new hiy("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] var1, CharSequence var2);

    public abstract void b(Appendable var1, byte[] var2, int var3);

    public abstract int c(int var1);

    public abstract int d(int var1);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String g(byte[] byArray) {
        int n2 = byArray.length;
        fxf.z(0, n2, n2);
        StringBuilder stringBuilder = new StringBuilder(this.d(n2));
        try {
            this.b(stringBuilder, byArray, n2);
            return stringBuilder.toString();
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    public final byte[] h(CharSequence object) {
        block3: {
            int n2;
            Object object2;
            try {
                object2 = this.e((CharSequence)object);
                int n3 = this.c(object2.length());
                object = new byte[n3];
                n2 = this.a((byte[])object, (CharSequence)object2);
                if (n2 == n3) break block3;
            }
            catch (hjb hjb2) {
                throw new IllegalArgumentException(hjb2);
            }
            object2 = new byte[n2];
            System.arraycopy(object, 0, object2, 0, n2);
            object = object2;
        }
        return object;
    }
}

