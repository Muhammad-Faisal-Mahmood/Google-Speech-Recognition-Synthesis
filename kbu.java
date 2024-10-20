/*
 * Decompiled with CFR 0.152.
 */
public final class kbu {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final String a(String string) {
        try {
            string = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            string = null;
        }
        return string;
    }
}

