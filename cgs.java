/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class cgs {
    private static volatile int a = -1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MessageDigest a() {
        int n2 = 0;
        while (n2 < 2) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n2;
        }
        return null;
    }
}

