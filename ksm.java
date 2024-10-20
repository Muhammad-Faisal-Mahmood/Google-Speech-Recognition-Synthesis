/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ksm {
    private static final MessageDigest a = ksm.c();

    public static long a(String string) {
        if (a != null && string != null && !string.isEmpty()) {
            return ksm.b(string.getBytes(StandardCharsets.UTF_8));
        }
        return 0L;
    }

    public static long b(byte[] byArray) {
        MessageDigest messageDigest = a;
        if (messageDigest != null && byArray != null && byArray.length != 0) {
            return ByteBuffer.wrap(messageDigest.digest(byArray)).getLong();
        }
        return 0L;
    }

    private static MessageDigest c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return messageDigest;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
    }
}

