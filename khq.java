/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;

public final class khq {
    public static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[Proxy.Type.values().length];
        try {
            nArray[Proxy.Type.DIRECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[Proxy.Type.HTTP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = nArray;
    }
}

