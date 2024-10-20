/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class iox
implements iow {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.c("45408304", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.d("40", new dwe(9), "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", hav2, true, true);
        c = dwg.d("13", new dwe(10), "EAAYAg", "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final dpo a(Context context) {
        return (dpo)b.b(context);
    }

    @Override
    public final ket b(Context context) {
        return (ket)c.b(context);
    }

    @Override
    public final boolean c(Context context) {
        return (Boolean)a.b(context);
    }
}

