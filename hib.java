/*
 * Decompiled with CFR 0.152.
 */
public class hib
extends hhz {
    private static final String a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        String string;
        block2: {
            try {
                string = System.getProperty("line.separator");
                boolean bl2 = string.matches("\\n|\\r(?:\\n)?");
                if (bl2) break block2;
            }
            catch (SecurityException securityException) {}
            string = "\n";
        }
        a = string;
    }

    public static int b(String string, int n2) {
        while (n2 < string.length()) {
            int n3 = n2 + 1;
            if (string.charAt(n2) != '%') {
                n2 = n3;
                continue;
            }
            if (n3 < string.length()) {
                if ((n3 = (int)string.charAt(n3)) != 37 && n3 != 110) {
                    return n2;
                }
                n2 += 2;
                continue;
            }
            throw hia.c("trailing unquoted '%' character", string, n2);
        }
        return -1;
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string, int n2, int n3) {
        int n4 = n2;
        while (n2 < n3) {
            int n5;
            block5: {
                block7: {
                    char c2;
                    block6: {
                        n5 = n2 + 1;
                        if (string.charAt(n2) != '%') break block5;
                        if (n5 == n3) break;
                        c2 = string.charAt(n5);
                        if (c2 != '%') break block6;
                        stringBuilder.append(string, n4, n5);
                        break block7;
                    }
                    if (c2 != 'n') break block5;
                    stringBuilder.append(string, n4, n2);
                    stringBuilder.append(a);
                }
                n2 = n4 = n2 + 2;
                continue;
            }
            n2 = n5;
        }
        if (n4 < n3) {
            stringBuilder.append(string, n4, n3);
        }
    }
}

