/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class hqk {
    private static final Charset a = Charset.forName("UTF-8");

    public static Long a(String string) {
        long l2;
        if (string == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes(a));
            l2 = ByteBuffer.wrap(messageDigest.digest()).getLong();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        return l2;
    }
}

