/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class aeg {
    private static final HashSet a = new HashSet();
    private static String b = "media3.common";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a() {
        synchronized (aeg.class) {
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string) {
        synchronized (aeg.class) {
            if (a.add(string)) {
                String string2 = b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(", ");
                stringBuilder.append(string);
                b = stringBuilder.toString();
                return;
            }
            return;
        }
    }
}

