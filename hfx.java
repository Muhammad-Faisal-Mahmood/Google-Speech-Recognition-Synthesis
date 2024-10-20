/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Locale;

public final class hfx {
    public static final Locale a = Locale.ROOT;

    public static String a(Object object, RuntimeException object2) {
        try {
            object2 = ((Throwable)object2).toString();
        }
        catch (RuntimeException runtimeException) {
            object2 = runtimeException.getClass().getSimpleName();
        }
        return hfx.d(object, (String)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(Object object) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    block15: {
                                        block13: {
                                            String string;
                                            block14: {
                                                if (object == null) {
                                                    return "null";
                                                }
                                                try {
                                                    if (object.getClass().isArray()) break block13;
                                                    string = object.toString();
                                                    if (string == null) break block14;
                                                    return string;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    return hfx.a(object, runtimeException);
                                                }
                                            }
                                            string = hfx.d(object, "toString() returned null");
                                            return string;
                                        }
                                        if (!(object instanceof int[])) break block15;
                                        String string = Arrays.toString((int[])object);
                                        return string;
                                    }
                                    if (!(object instanceof long[])) break block16;
                                    String string = Arrays.toString((long[])object);
                                    return string;
                                }
                                if (!(object instanceof byte[])) break block17;
                                String string = Arrays.toString((byte[])object);
                                return string;
                            }
                            if (!(object instanceof char[])) break block18;
                            String string = Arrays.toString((char[])object);
                            return string;
                        }
                        if (!(object instanceof short[])) break block19;
                        String string = Arrays.toString((short[])object);
                        return string;
                    }
                    if (!(object instanceof float[])) break block20;
                    String string = Arrays.toString((float[])object);
                    return string;
                }
                if (!(object instanceof double[])) break block21;
                String string = Arrays.toString((double[])object);
                return string;
            }
            if (!(object instanceof boolean[])) break block22;
            String string = Arrays.toString((boolean[])object);
            return string;
        }
        String string = Arrays.toString((Object[])object);
        return string;
    }

    public static void c(StringBuilder stringBuilder, long l2, boolean bl2) {
        if (l2 == 0L) {
            stringBuilder.append("0");
            return;
        }
        String string = true != bl2 ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int i2 = 63 - Long.numberOfLeadingZeros(l2) & 0xFFFFFFFC; i2 >= 0; i2 -= 4) {
            stringBuilder.append(string.charAt((int)(l2 >>> i2 & 0xFL)));
        }
    }

    private static String d(Object object, String string) {
        String string2 = object.getClass().getName();
        int n2 = System.identityHashCode(object);
        object = new StringBuilder("{");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("@");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

