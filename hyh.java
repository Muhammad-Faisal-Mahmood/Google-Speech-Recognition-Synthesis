/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class hyh {
    private static final char[] a;

    static {
        char[] cArray = new char[80];
        a = cArray;
        Arrays.fill(cArray, ' ');
    }

    static void a(StringBuilder stringBuilder, int n2, String object, Object iterator) {
        int n3;
        block12: {
            block11: {
                block10: {
                    if (!(iterator instanceof List)) break block10;
                    iterator = ((List)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        hyh.a(stringBuilder, n2, (String)object, iterator.next());
                    }
                    break block11;
                }
                if (iterator instanceof Map) {
                    iterator = ((Map)((Object)iterator)).entrySet().iterator();
                    while (iterator.hasNext()) {
                        hyh.a(stringBuilder, n2, (String)object, (Map.Entry)iterator.next());
                    }
                }
                break block12;
            }
            return;
        }
        stringBuilder.append('\n');
        hyh.c(n2, stringBuilder);
        CharSequence charSequence = object;
        if (!((String)object).isEmpty()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Character.toLowerCase(((String)object).charAt(0)));
            for (n3 = 1; n3 < ((String)object).length(); ++n3) {
                char c2 = ((String)object).charAt(n3);
                if (Character.isUpperCase(c2)) {
                    ((StringBuilder)charSequence).append("_");
                }
                ((StringBuilder)charSequence).append(Character.toLowerCase(c2));
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        if (iterator instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(fvc.aD(hvu.t((String)((Object)iterator))));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof hvu) {
            stringBuilder.append(": \"");
            stringBuilder.append(fvc.aD((hvu)((Object)iterator)));
            stringBuilder.append('\"');
            return;
        }
        if (iterator instanceof hwv) {
            stringBuilder.append(" {");
            hyh.b((hwv)((Object)iterator), stringBuilder, n2 + 2);
            stringBuilder.append("\n");
            hyh.c(n2, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        if (iterator instanceof Map.Entry) {
            n3 = n2 + 2;
            stringBuilder.append(" {");
            object = (Map.Entry)((Object)iterator);
            hyh.a(stringBuilder, n3, "key", object.getKey());
            hyh.a(stringBuilder, n3, "value", object.getValue());
            stringBuilder.append("\n");
            hyh.c(n2, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(iterator);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public static void b(hyf var0, StringBuilder var1_1, int var2_2) {
        var7_3 = new HashSet<String>();
        var8_4 = new HashMap<K, V>();
        var9_5 = new TreeMap<K, V>();
        var11_6 = var0.getClass().getDeclaredMethods();
        var5_7 = ((Method[])var11_6).length;
        var4_8 = 0;
        for (var3_9 = 0; var3_9 < var5_7; ++var3_9) {
            var10_10 = var11_6[var3_9];
            if (Modifier.isStatic(var10_10.getModifiers()) || var10_10.getName().length() < 3) continue;
            if (var10_10.getName().startsWith("set")) {
                var7_3.add(var10_10.getName());
                continue;
            }
            if (!Modifier.isPublic(var10_10.getModifiers()) || var10_10.getParameterTypes().length != 0) continue;
            if (var10_10.getName().startsWith("has")) {
                var8_4.put(var10_10.getName(), var10_10);
                continue;
            }
            if (!var10_10.getName().startsWith("get")) continue;
            var9_5.put(var10_10.getName(), var10_10);
        }
        for (Object var12_12 : var9_5.entrySet()) {
            block14: {
                block12: {
                    block18: {
                        block17: {
                            block16: {
                                block15: {
                                    block13: {
                                        var11_6 = ((String)var12_12.getKey()).substring(3);
                                        if (var11_6.endsWith("List") && !var11_6.endsWith("OrBuilderList") && !var11_6.equals("List") && (var13_13 = (Method)var12_12.getValue()) != null && var13_13.getReturnType().equals(List.class)) {
                                            hyh.a(var1_1, var2_2, var11_6.substring(0, var11_6.length() - 4), hwv.w((Method)var13_13, var0, new Object[0]));
                                            continue;
                                        }
                                        if (var11_6.endsWith("Map") && !var11_6.equals("Map") && (var13_13 = (Method)var12_12.getValue()) != null && var13_13.getReturnType().equals(Map.class) && !var13_13.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(var13_13.getModifiers())) {
                                            hyh.a(var1_1, var2_2, var11_6.substring(0, var11_6.length() - 3), hwv.w((Method)var13_13, var0, new Object[0]));
                                            continue;
                                        }
                                        if (!var7_3.contains("set".concat(String.valueOf(var11_6))) || var11_6.endsWith("Bytes") && var9_5.containsKey("get".concat(String.valueOf(var11_6.substring(0, var11_6.length() - 5))))) continue;
                                        var13_13 = (Method)var12_12.getValue();
                                        var12_12 = (Method)var8_4.get("has".concat(String.valueOf(var11_6)));
                                        if (var13_13 == null) continue;
                                        var13_13 = hwv.w((Method)var13_13, var0, new Object[0]);
                                        if (var12_12 != null) break block12;
                                        if (!(var13_13 instanceof Boolean)) break block13;
                                        if (!((Boolean)var13_13).booleanValue()) continue;
                                        break block14;
                                    }
                                    if (!(var13_13 instanceof Integer)) break block15;
                                    if ((Integer)var13_13 == 0) continue;
                                    break block14;
                                }
                                if (!(var13_13 instanceof Float)) break block16;
                                if (Float.floatToRawIntBits(((Float)var13_13).floatValue()) == 0) continue;
                                break block14;
                            }
                            if (!(var13_13 instanceof Double)) break block17;
                            if (Double.doubleToRawLongBits((Double)var13_13) == 0L) continue;
                            break block14;
                        }
                        if (!(var13_13 instanceof String)) break block18;
                        var6_11 = var13_13.equals("");
                        ** GOTO lbl59
                    }
                    if (var13_13 instanceof hvu) {
                        var6_11 = var13_13.equals(hvu.b);
lbl59:
                        // 2 sources

                        if (var6_11) continue;
                    } else if (!(var13_13 instanceof hyf != false ? var13_13 != ((hyf)var13_13).t() : var13_13 instanceof Enum == false || ((Enum)var13_13).ordinal() != 0)) continue;
                    break block14;
                }
                if (!((Boolean)hwv.w((Method)var12_12, var0, new Object[0])).booleanValue()) continue;
            }
            hyh.a(var1_1, var2_2, (String)var11_6, var13_13);
        }
        if (var0 instanceof hws) {
            var9_5 = ((hws)var0).r.e();
            while (var9_5.hasNext()) {
                var8_4 = (Map.Entry)var9_5.next();
                var3_9 = ((hwu)var8_4.getKey()).b;
                var7_3 = new StringBuilder("[");
                var7_3.append(var3_9);
                var7_3.append("]");
                hyh.a(var1_1, var2_2, var7_3.toString(), var8_4.getValue());
            }
        }
        if ((var0 = ((hwv)var0).unknownFields) != null) {
            for (var3_9 = var4_8; var3_9 < var0.b; ++var3_9) {
                hyh.a(var1_1, var2_2, String.valueOf(hzo.a(var0.c[var3_9])), var0.d[var3_9]);
            }
        }
    }

    private static void c(int n2, StringBuilder stringBuilder) {
        while (n2 > 0) {
            int n3 = 80;
            if (n2 <= 80) {
                n3 = n2;
            }
            stringBuilder.append(a, 0, n3);
            n2 -= n3;
        }
    }
}

