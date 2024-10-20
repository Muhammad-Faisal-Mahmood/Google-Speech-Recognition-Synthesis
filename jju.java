/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jju {
    private static final Logger a = Logger.getLogger(jju.class.getName());
    private static final byte[] b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private jju() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[][] a(iwx object) {
        int n2;
        int n3;
        Object object2 = ivp.a;
        int n4 = ((iwx)object).a();
        object2 = new byte[n4][];
        Object[] objectArray = ((iwx)object).d;
        if (objectArray instanceof byte[][]) {
            System.arraycopy(objectArray, 0, object2, 0, ((iwx)object).a());
        } else {
            for (n3 = 0; n3 < ((iwx)object).e; ++n3) {
                byte[] byArray = ((iwx)object).j(n3);
                n2 = n3 + n3;
                object2[n2] = byArray;
                object2[n2 + 1] = ((iwx)object).l(n3);
            }
        }
        n2 = 0;
        n3 = 0;
        while (true) {
            block7: {
                int n5;
                int n6;
                Object object3;
                block10: {
                    block8: {
                        block9: {
                            if (n2 >= n4) break block8;
                            object = object2[n2];
                            object3 = object2[n2 + 1];
                            if (!jju.c((byte[])object, b)) break block9;
                            n6 = n3 + 2;
                            object2[n3] = object;
                            object2[n3 + 1] = ivp.b.g((byte[])object3).getBytes(StandardCharsets.US_ASCII);
                            n3 = n6;
                            break block7;
                        }
                        n5 = ((Object)object3).length;
                        break block10;
                    }
                    if (n3 == n4) {
                        return object2;
                    }
                    return (byte[][])Arrays.copyOfRange(object2, 0, n3);
                }
                for (n6 = 0; n6 < n5; ++n6) {
                    Object object4 = object3[n6];
                    if (object4 >= 32 && object4 <= 126) {
                        continue;
                    }
                    object = new String((byte[])object, StandardCharsets.US_ASCII);
                    Logger logger = a;
                    Level level = Level.WARNING;
                    object3 = Arrays.toString((byte[])object3);
                    StringBuilder stringBuilder = new StringBuilder("Metadata key=");
                    stringBuilder.append((String)object);
                    stringBuilder.append(", value=");
                    stringBuilder.append((String)object3);
                    stringBuilder.append(" contains invalid ASCII characters");
                    logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", stringBuilder.toString());
                    break block7;
                }
                n6 = n3 + 2;
                object2[n3] = object;
                object2[n3 + 1] = object3;
                n3 = n6;
            }
            n2 += 2;
        }
    }

    public static byte[][] b(byte[][] byArray) {
        for (int i2 = 0; i2 < byArray.length; i2 += 2) {
            byte[] byArray2 = byArray[i2];
            int n2 = i2 + 1;
            byte[] byArray3 = byArray[n2];
            if (!jju.c(byArray2, b)) continue;
            for (int i3 = 0; i3 < byArray3.length; ++i3) {
                if (byArray3[i3] != 44) continue;
                ArrayList<byte[]> arrayList = new ArrayList<byte[]>(byArray.length + 10);
                n2 = 0;
                while (true) {
                    if (n2 >= i2) break;
                    arrayList.add(byArray[n2]);
                    ++n2;
                }
                for (i3 = i2; i3 < byArray.length; i3 += 2) {
                    int n3;
                    byArray3 = byArray[i3];
                    byte[] byArray4 = byArray[i3 + 1];
                    if (!jju.c(byArray3, b)) {
                        arrayList.add(byArray3);
                        arrayList.add(byArray4);
                        continue;
                    }
                    i2 = 0;
                    for (n2 = 0; n2 <= (n3 = byArray4.length); ++n2) {
                        block10: {
                            block9: {
                                if (n2 == n3) break block9;
                                n3 = i2;
                                if (byArray4[n2] != 44) break block10;
                            }
                            byArray2 = hjd.d.h(new String(byArray4, i2, n2 - i2, StandardCharsets.US_ASCII));
                            arrayList.add(byArray3);
                            arrayList.add(byArray2);
                            n3 = n2 + 1;
                        }
                        i2 = n3;
                    }
                }
                return (byte[][])arrayList.toArray((T[])new byte[0][]);
            }
            byArray[n2] = hjd.d.h(new String(byArray3, StandardCharsets.US_ASCII));
        }
        return byArray;
    }

    private static boolean c(byte[] byArray, byte[] byArray2) {
        int n2 = byArray.length - byArray2.length;
        if (n2 >= 0) {
            for (int i2 = n2; i2 < byArray.length; ++i2) {
                if (byArray[i2] == byArray2[i2 - n2]) continue;
                return false;
            }
            return true;
        }
        return false;
    }
}

