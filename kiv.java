/*
 * Decompiled with CFR 0.152.
 */
public final class kiv {
    public static final klp a;
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;

    static {
        int n2;
        Object[] objectArray = klp.a;
        a = kmp.v("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        objectArray = new String[256];
        int n3 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            objectArray[n2] = jse.S(khb.k("%8s", Integer.toBinaryString(n2)), ' ', '0');
        }
        d = objectArray;
        String[] stringArray = c;
        stringArray[0] = "";
        stringArray[1] = "END_STREAM";
        objectArray = new int[1];
        objectArray[0] = (String)true;
        stringArray[8] = "PADDED";
        for (n2 = 0; n2 <= 0; ++n2) {
            String string = objectArray[n2];
            stringArray = c;
            stringArray[string | 8] = String.valueOf(stringArray[string]).concat("|PADDED");
        }
        stringArray = c;
        stringArray[4] = "END_HEADERS";
        stringArray[32] = "PRIORITY";
        stringArray[36] = "END_HEADERS|PRIORITY";
        for (n2 = 0; n2 < 3; ++n2) {
            int n4 = (new int[]{4, 32, 36})[n2];
            for (int i2 = 0; i2 <= 0; ++i2) {
                String string = objectArray[i2];
                int n5 = string | n4;
                stringArray = c;
                String string2 = stringArray[string];
                CharSequence charSequence = stringArray[n4];
                CharSequence charSequence2 = new StringBuilder();
                charSequence2.append(string2);
                charSequence2.append("|");
                charSequence2.append((String)charSequence);
                stringArray[n5] = charSequence2.toString();
                string2 = stringArray[string];
                charSequence2 = stringArray[n4];
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append("|");
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append("|PADDED");
                stringArray[n5 | 8] = ((StringBuilder)charSequence).toString();
            }
        }
        n2 = c.length;
        for (n2 = n3; n2 < 64; ++n2) {
            objectArray = c;
            if (objectArray[n2] != null) continue;
            objectArray[n2] = d[n2];
        }
    }

    private kiv() {
    }

    public static final String a(int n2) {
        Object object = b;
        int n3 = ((String[])object).length;
        object = n2 < 10 ? object[n2] : khb.k("0x%02x", n2);
        return object;
    }

    public static final String b(boolean bl2, int n2, int n3, int n4, int n5) {
        Object object;
        String string;
        block7: {
            block8: {
                block9: {
                    block6: {
                        string = kiv.a(n4);
                        if (n5 != 0) break block6;
                        object = "";
                        break block7;
                    }
                    if (n4 == 2 || n4 == 3) break block8;
                    if (n4 == 4 || n4 == 6) break block9;
                    if (n4 == 7 || n4 == 8) break block8;
                    object = c;
                    int n6 = ((String[])object).length;
                    if (n5 < 64) {
                        object = object[n5];
                        jse.b(object);
                    } else {
                        object = d[n5];
                    }
                    if (n4 == 5) {
                        if ((n5 & 4) != 0) {
                            object = jse.T((String)object, "HEADERS", "PUSH_PROMISE");
                        }
                    } else if (n4 == 0 && (n5 & 0x20) != 0) {
                        object = jse.T((String)object, "PRIORITY", "COMPRESSED");
                    }
                    break block7;
                }
                object = n5 == 1 ? "ACK" : d[n5];
                break block7;
            }
            object = d[n5];
        }
        String string2 = true != bl2 ? ">>" : "<<";
        return khb.k("%s 0x%08x %5d %-13s %s", string2, n2, n3, string, object);
    }
}

