/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class bjn
extends HashMap {
    public final int a;
    public final int b;

    public bjn(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        if (n2 == 2 && n3 <= 0) {
            throw new IllegalArgumentException("Expiration time must be positive if CacheType is CACHE_TYPE_EXPIRED_AFTER_SOME_TIME");
        }
    }
}

