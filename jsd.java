/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class jsd {
    private jsd() {
    }

    public static final String a(jsb object) {
        String string = object.getClass().getGenericInterfaces()[0].toString();
        object = string;
        if (string.startsWith("kotlin.jvm.functions.")) {
            object = string.substring(21);
        }
        return object;
    }

    public static final Iterator b(Object[] objectArray) {
        jse.e(objectArray, "array");
        return new jtf(objectArray, 1);
    }

    public static final Class c(jta object) {
        jse.e(object, "<this>");
        object = ((jry)object).a();
        jse.c(object, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return object;
    }

    public static final Class d(jta clazz) {
        jse.e(clazz, "<this>");
        Class clazz2 = ((jry)((Object)clazz)).a();
        if (!clazz2.isPrimitive()) {
            jse.c(clazz2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clazz2;
        }
        String string = clazz2.getName();
        clazz = clazz2;
        if (string != null) {
            switch (string.hashCode()) {
                default: {
                    clazz = clazz2;
                    break;
                }
                case 109413500: {
                    clazz = clazz2;
                    if (!string.equals("short")) break;
                    clazz = Short.class;
                    break;
                }
                case 97526364: {
                    clazz = clazz2;
                    if (!string.equals("float")) break;
                    clazz = Float.class;
                    break;
                }
                case 64711720: {
                    clazz = clazz2;
                    if (!string.equals("boolean")) break;
                    clazz = Boolean.class;
                    break;
                }
                case 3625364: {
                    clazz = clazz2;
                    if (!string.equals("void")) break;
                    clazz = Void.class;
                    break;
                }
                case 3327612: {
                    clazz = clazz2;
                    if (!string.equals("long")) break;
                    clazz = Long.class;
                    break;
                }
                case 3052374: {
                    clazz = clazz2;
                    if (!string.equals("char")) break;
                    clazz = Character.class;
                    break;
                }
                case 3039496: {
                    clazz = clazz2;
                    if (!string.equals("byte")) break;
                    clazz = Byte.class;
                    break;
                }
                case 104431: {
                    clazz = clazz2;
                    if (!string.equals("int")) break;
                    clazz = Integer.class;
                    break;
                }
                case -1325958191: {
                    clazz = clazz2;
                    if (!string.equals("double")) break;
                    clazz = Double.class;
                }
            }
        }
        jse.c(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clazz;
    }

    public static final jta e(Class clazz) {
        jse.e(clazz, "<this>");
        int n2 = jsk.a;
        return new jrz(clazz);
    }

    public static final void f(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
                return;
            }
            catch (Throwable throwable2) {
                jns.b(throwable, throwable2);
            }
        }
    }

    public static final int g(int n2, int n3, int n4) {
        block7: {
            block8: {
                block6: {
                    block5: {
                        if (n4 <= 0) break block5;
                        if (n2 < n3) {
                            return n3 - jsd.v(n3, n2, n4);
                        }
                        break block6;
                    }
                    if (n4 >= 0) break block7;
                    if (n2 > n3) break block8;
                }
                return n3;
            }
            return n3 + jsd.v(n2, n3, -n4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final jqt h(Enum[] enumArray) {
        jse.e(enumArray, "entries");
        return new jqt(enumArray);
    }

    public static final void i(jqb jqb2) {
        jse.e(jqb2, "frame");
    }

    public static final void j(jqb jqb2) {
        jse.e(jqb2, "frame");
    }

    public static final hpn k(jvi jvi2) {
        kap kap2 = new kap(jvi2);
        jvi2.w(new ezq(kap2, jvi2, 9, null));
        return kap2;
    }

    public static final Object l(hpn object, jqb jqb2) {
        block3: {
            try {
                if (object.isDone()) {
                    object = a.h((Future)object);
                    return object;
                }
                jul jul2 = new jul(jjj.n(jqb2), 1);
                jul2.r();
                object.c(new bcv(object, jul2, 7), (Executor)hom.a);
                jul2.s(new etv(object, 20));
                object = jul2.a();
                if (object != jqh.a) break block3;
            }
            catch (ExecutionException executionException) {
                throw jsd.m(executionException);
            }
            jsd.j(jqb2);
        }
        return object;
    }

    public static final Throwable m(ExecutionException throwable) {
        throwable = throwable.getCause();
        jse.b(throwable);
        return throwable;
    }

    public static /* synthetic */ hpn n(jvb jvb2, jro jro2) {
        jqg jqg2 = jqg.a;
        jvc jvc2 = jvc.a;
        if (!jvc2.b()) {
            jvb2 = new kaq(jux.b(jvb2, jqg2));
            jvc2.a(jro2, jvb2, (jqb)((Object)jvb2));
            return ((kaq)jvb2).b;
        }
        Objects.toString((Object)jvc2);
        throw new IllegalArgumentException(String.valueOf((Object)jvc2).concat(" start is not supported"));
    }

    public static final Object o(jqf jqf2, Object object, Object object2, jro jro2, jqb jqb2) {
        block5: {
            object2 = kbv.b(jqf2, object2);
            kam kam2 = new kam(jqb2, jqf2);
            if (!(jro2 instanceof jqm)) {
                object = jjj.l(jro2, object, kam2);
            } else {
                jsl.c(jro2, 2);
                object = jro2.b(object, kam2);
            }
            if (object != jqh.a) break block5;
            jsd.j(jqb2);
        }
        return object;
        finally {
            kbv.c(jqf2, object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final Object p(jyx var0, jqb var1_1) {
        block16: {
            block15: {
                block14: {
                    if (!(var1_1 instanceof jzi)) ** GOTO lbl-1000
                    var3_2 = (jzi)var1_1;
                    var2_6 = var3_2.b;
                    if ((var2_6 & -2147483648) != 0) {
                        var3_2.b = var2_6 + -2147483648;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_2 = new jzi((jqb)var1_1);
                    }
                    var4_7 = var3_2.a;
                    var5_8 = jqh.a;
                    var2_6 = var3_2.b;
                    if (var2_6 != 0) {
                        if (var2_6 == 1) {
                            var1_1 = var3_2.d;
                            var0 = var3_2.c;
                            try {
                                jns.ak(var4_7);
                            }
                            catch (jzp var3_3) {
                                break block14;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jns.ak(var4_7);
                    var1_1 = new jsj();
                    var1_1.a = kag.a;
                    var4_7 = new jzh(var1_1, 0);
                    try {
                        var3_2.c = var1_1;
                        var3_2.d = var4_7;
                        var3_2.b = 1;
                        var0 = var0.a((jyy)var4_7, var3_2);
                        if (var0 != var5_8) {
                            var0 = var1_1;
                            break block15;
                        }
                        return var5_8;
                    }
                    catch (jzp var3_4) {
                        var0 = var1_1;
                        var1_1 = var4_7;
                    }
                }
                if (var3_5.a != var1_1) break block16;
            }
            var0 = var0.a;
            if (var0 != kag.a) {
                return var0;
            }
            throw new NoSuchElementException("Expected at least one element");
        }
        throw var3_5;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object q(jyx var0, jyy var1_4, jqb var2_5) {
        block12: {
            block11: {
                if (!(var2_5 instanceof jzd)) ** GOTO lbl-1000
                var4_6 = (jzd)var2_5;
                var3_7 = var4_6.b;
                if ((var3_7 & -2147483648) != 0) {
                    var4_6.b = var3_7 + -2147483648;
                    var2_5 = var4_6;
                } else lbl-1000:
                // 2 sources

                {
                    var2_5 = new jzd((jqb)var2_5);
                }
                var4_6 = var2_5.a;
                var5_8 = jqh.a;
                var3_7 = var2_5.b;
                if (var3_7 != 0) {
                    if (var3_7 == 1) {
                        var1_4 = var2_5.c;
                        try {
                            jns.ak(var4_6);
                            break block11;
                        }
                        catch (Throwable var0_1) {
                            break block12;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var4_6);
                var4_6 = new jsj();
                try {
                    var6_9 = new jzk((jyy)var1_4, var4_6, 1);
                    var2_5.c = var4_6;
                    var2_5.b = 1;
                    var0 = var0.a(var6_9, (jqb)var2_5);
                    if (var0 != var5_8) break block11;
                    return var5_8;
                }
                catch (Throwable var0_2) {
                    var1_4 = var4_6;
                }
            }
            return null;
        }
        var1_4 = (Throwable)var1_4.a;
        if (!(jsd.x((Throwable)var0_3, (Throwable)var1_4) || (var2_5 = (jwi)var2_5.d().get(jwi.c)) != null && var2_5.t() && jsd.x((Throwable)var0_3, var2_5.p()))) {
            if (var1_4 == null) {
                return var0_3;
            }
            if (var0_3 instanceof CancellationException) {
                jns.b((Throwable)var1_4, (Throwable)var0_3);
                throw var1_4;
            }
            jns.b((Throwable)var0_3, (Throwable)var1_4);
            throw var0_3;
        }
        throw var0_3;
    }

    public static final jyx r(jyx jyx2) {
        return jsd.u(jyx2, -1);
    }

    public static final Object s(jyx object, jqb jqb2) {
        if ((object = object.a(kaf.a, jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    /*
     * Exception decompiling
     */
    public static final Object t(jyy var0, jyj var1_3, boolean var2_9, jqb var3_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 186->191)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ jyx u(jyx jyx2, int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = -1;
        }
        n2 = n3 == -1 ? 2 : 1;
        int n4 = n3;
        if (n3 == -1) {
            n4 = 0;
        }
        jyx2 = jyx2 instanceof kad ? ((kad)jyx2).bI(jqg.a, n4, n2) : new jzv(jyx2, jqg.a, n4, n2);
        return jyx2;
    }

    private static final int v(int n2, int n3, int n4) {
        return jsd.w(jsd.w(n2, n4) - jsd.w(n3, n4), n4);
    }

    private static final int w(int n2, int n3) {
        if ((n2 %= n3) >= 0) {
            return n2;
        }
        return n2 + n3;
    }

    private static final boolean x(Throwable throwable, Throwable throwable2) {
        if (throwable2 != null) {
            Throwable throwable3 = throwable2;
            if (jve.b) {
                throwable3 = kbs.c(throwable2);
            }
            throwable2 = throwable;
            if (jve.b) {
                throwable2 = kbs.c(throwable);
            }
            if (jse.i(throwable3, throwable2)) {
                return true;
            }
        }
        return false;
    }
}

