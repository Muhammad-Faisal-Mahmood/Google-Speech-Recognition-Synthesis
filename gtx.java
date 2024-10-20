/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;

public final class gtx {
    public static final SecureRandom a;
    public static final ThreadLocal b;

    static {
        new gtv();
        a = gtx.a();
        new gtw();
        b = new gtu();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}

