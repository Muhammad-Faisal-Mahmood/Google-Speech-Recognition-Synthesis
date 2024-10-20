/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class abj {
    public static final abj a = new abj();
    public static final Map b;
    private static final Map c;

    static {
        c = new HashMap();
        b = new HashMap();
    }

    private abj() {
    }

    public static final aau b(Constructor object, Object object2) {
        IllegalAccessException illegalAccessException2;
        block5: {
            InstantiationException instantiationException2;
            block4: {
                try {
                    object = ((Constructor)object).newInstance(object2);
                    jse.d(object, "{\n            constructo\u2026tance(`object`)\n        }");
                    object = (aau)object;
                    return object;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block4;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block5;
                }
                throw new RuntimeException(invocationTargetException);
            }
            throw new RuntimeException(instantiationException2);
        }
        throw new RuntimeException(illegalAccessException2);
    }

    private static final boolean c(Class clazz) {
        return clazz != null && abd.class.isAssignableFrom(clazz);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(Class var1_1) {
        block24: {
            block23: {
                block27: {
                    block26: {
                        block22: {
                            block21: {
                                block20: {
                                    block25: {
                                        var6_3 = (Integer)abj.c.get(var1_1);
                                        if (var6_3 != null) break block24;
                                        var6_3 = var1_1.getCanonicalName();
                                        var3_5 = 1;
                                        if (var6_3 != null) break block25;
                                        var2_6 = var3_5;
                                        break block23;
                                    }
                                    var8_7 = null;
                                    var4_8 = 0;
                                    var6_3 = var1_1.getPackage();
                                    var9_9 = var1_1.getCanonicalName();
                                    if (var6_3 == null) break block20;
                                    var6_3 = var6_3.getName();
                                    break block21;
                                }
                                var6_3 = "";
                            }
                            jse.d(var6_3, "fullPackage");
                            var7_10 /* !! */  = var9_9;
                            if (var6_3.length() != 0) {
                                jse.d(var9_9, "name");
                                var7_10 /* !! */  = var9_9.substring(var6_3.length() + 1);
                                jse.d(var7_10 /* !! */ , "this as java.lang.String).substring(startIndex)");
                            }
                            jse.d(var7_10 /* !! */ , "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)");
                            jse.e(var7_10 /* !! */ , "className");
                            var7_10 /* !! */  = String.valueOf(jse.T((String)var7_10 /* !! */ , ".", "_")).concat("_LifecycleAdapter");
                            if (var6_3.length() != 0) break block22;
                            var6_3 = var7_10 /* !! */ ;
                            ** GOTO lbl45
                        }
                        var9_9 = new StringBuilder();
                        var9_9.append((String)var6_3);
                        var9_9.append('.');
                        var9_9.append((String)var7_10 /* !! */ );
                        var6_3 = var9_9.toString();
lbl45:
                        // 2 sources

                        var6_3 = Class.forName((String)var6_3);
                        jse.c(var6_3, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                        var7_10 /* !! */  = var6_3.getDeclaredConstructor(new Class[]{var1_1});
                        var6_3 = var7_10 /* !! */ ;
                        try {
                            if (!var7_10 /* !! */ .isAccessible()) {
                                var7_10 /* !! */ .setAccessible(true);
                                var6_3 = var7_10 /* !! */ ;
                            }
                        }
                        catch (NoSuchMethodException var1_2) {
                            throw new RuntimeException(var1_2);
                        }
                        catch (ClassNotFoundException var6_4) {
                            var6_3 = null;
                        }
                        if (var6_3 != null) {
                            abj.b.put(var1_1, jns.d(var6_3));
lbl61:
                            // 2 sources

                            while (true) {
                                var2_6 = 2;
                                break block23;
                                break;
                            }
                        }
                        var6_3 = aar.a;
                        var7_10 /* !! */  = (Boolean)var6_3.b.get(var1_1);
                        if (var7_10 /* !! */  == null) break block26;
                        if (!var7_10 /* !! */ .booleanValue()) break block27;
                        var2_6 = var3_5;
                        break block23;
                    }
                    var7_10 /* !! */  = var6_3.c(var1_1);
                    var5_11 = var7_10 /* !! */ .length;
                    for (var2_6 = 0; var2_6 < var5_11; ++var2_6) {
                        if (var7_10 /* !! */ [var2_6].getAnnotation(OnLifecycleEvent.class) == null) continue;
                        var6_3.a(var1_1, var7_10 /* !! */ );
                        var2_6 = var3_5;
                        break block23;
                    }
                    var6_3.b.put(var1_1, false);
                }
                var6_3 = var1_1.getSuperclass();
                var7_10 /* !! */  = var8_7;
                if (!abj.c(var6_3)) ** GOTO lbl92
                jse.d(var6_3, "superclass");
                if (this.a((Class)var6_3) == 1) {
                    var2_6 = var3_5;
                } else {
                    var6_3 = abj.b.get(var6_3);
                    jse.b(var6_3);
                    var7_10 /* !! */  = new ArrayList<E>((Collection)var6_3);
lbl92:
                    // 2 sources

                    var8_7 = var1_1.getInterfaces();
                    jse.d(var8_7, "klass.interfaces");
                    var5_11 = var8_7.length;
                    for (var2_6 = var4_8; var2_6 < var5_11; ++var2_6) {
                        var9_9 = var8_7[var2_6];
                        var6_3 = var7_10 /* !! */ ;
                        if (abj.c((Class)var9_9)) {
                            jse.d(var9_9, "intrface");
                            if (this.a((Class)var9_9) == 1) {
                                var2_6 = var3_5;
                                break block23;
                            }
                            var6_3 = var7_10 /* !! */ ;
                            if (var7_10 /* !! */  == null) {
                                var6_3 = new ArrayList<E>();
                            }
                            var7_10 /* !! */  = abj.b.get(var9_9);
                            jse.b(var7_10 /* !! */ );
                            var6_3.addAll((Collection)var7_10 /* !! */ );
                        }
                        var7_10 /* !! */  = var6_3;
                    }
                    var2_6 = var3_5;
                    if (var7_10 /* !! */  != null) {
                        abj.b.put(var1_1, var7_10 /* !! */ );
                        ** continue;
                    }
                }
            }
            abj.c.put(var1_1, var2_6);
            return var2_6;
        }
        return var6_3.intValue();
    }
}

