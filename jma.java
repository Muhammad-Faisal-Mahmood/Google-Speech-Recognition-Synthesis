/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class jma {
    private static final String[] a;
    private static final String[] b;
    private static final String[] c;

    /*
     * WARNING - void declaration
     */
    static {
        void var1_6;
        String[] stringArray;
        int n2;
        a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        b = new String[64];
        c = new String[256];
        int bl2 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            stringArray = String.format("%8s", Integer.toBinaryString(n2)).replace(' ', '0');
            jma.c[n2] = stringArray;
        }
        String[] stringArray2 = b;
        stringArray2[0] = "";
        stringArray2[1] = "END_STREAM";
        stringArray = (String[])new int[1];
        stringArray[0] = true;
        stringArray2[8] = "PADDED";
        for (n2 = 0; n2 <= 0; ++n2) {
            Object object = stringArray[n2];
            stringArray2 = b;
            stringArray2[object | 8] = String.valueOf(stringArray2[object]).concat("|PADDED");
        }
        stringArray2 = b;
        stringArray2[4] = "END_HEADERS";
        stringArray2[32] = "PRIORITY";
        stringArray2[36] = "END_HEADERS|PRIORITY";
        n2 = 0;
        while (true) {
            int n3 = bl2;
            if (n2 >= 3) break;
            int n4 = (new int[]{4, 32, 36})[n2];
            for (n3 = 0; n3 <= 0; ++n3) {
                String string = stringArray[n3];
                int n5 = string | n4;
                stringArray2 = b;
                String string2 = stringArray2[string];
                String string3 = stringArray2[n4];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("|");
                stringBuilder.append(string3);
                stringArray2[n5] = stringBuilder.toString();
                string2 = stringArray2[string];
                string3 = stringArray2[n4];
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("|");
                stringBuilder.append(string3);
                stringBuilder.append("|PADDED");
                stringArray2[n5 | 8] = stringBuilder.toString();
            }
            ++n2;
        }
        while (var1_6 < 64) {
            stringArray = b;
            if (stringArray[var1_6] == null) {
                stringArray[var1_6] = c[var1_6];
            }
            ++var1_6;
        }
    }

    jma() {
    }

    public static String a(boolean bl2, int n2, int n3, byte by2, byte by3) {
        String string;
        String string2;
        block5: {
            block6: {
                block7: {
                    block4: {
                        string2 = by2 < 10 ? a[by2] : String.format("0x%02x", by2);
                        if (by3 != 0) break block4;
                        string = "";
                        break block5;
                    }
                    if (by2 == 2 || by2 == 3) break block6;
                    if (by2 == 4 || by2 == 6) break block7;
                    if (by2 == 7 || by2 == 8) break block6;
                    string = by3 < 64 ? b[by3] : c[by3];
                    if (by2 == 5) {
                        if ((by3 & 4) != 0) {
                            string = string.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (by2 == 0 && (by3 & 0x20) != 0) {
                        string = string.replace("PRIORITY", "COMPRESSED");
                    }
                    break block5;
                }
                string = by3 == 1 ? "ACK" : c[by3];
                break block5;
            }
            string = c[by3];
        }
        Locale locale = Locale.US;
        String string3 = true != bl2 ? ">>" : "<<";
        return String.format(locale, "%s 0x%08x %5d %-13s %s", string3, n2, n3, string2, string);
    }
}

