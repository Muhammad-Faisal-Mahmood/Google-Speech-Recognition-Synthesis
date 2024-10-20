/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class jns {
    public static void A(Collection collection, Iterable object) {
        jse.e(object, "elements");
        if (object instanceof Collection) {
            collection.addAll(object);
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            collection.add(object.next());
        }
    }

    public static int B(Iterable iterable) {
        jse.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).size();
        }
        return 10;
    }

    public static void C(Iterable object, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, jrk jrk2) {
        int n3;
        int n4;
        jse.e(object, "<this>");
        jse.e(charSequence, "separator");
        jse.e(charSequence2, "prefix");
        jse.e(charSequence3, "postfix");
        jse.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        object = object.iterator();
        int n5 = 0;
        while (true) {
            n4 = n5++;
            n3 = n2;
            if (!object.hasNext()) break;
            charSequence2 = object.next();
            if (n5 > 1) {
                appendable.append(charSequence);
            }
            if (n2 >= 0 && n5 > 0) {
                n3 = 0;
                n4 = n5;
                break;
            }
            jse.r(appendable, charSequence2, jrk2);
        }
        if (n3 >= 0 && n4 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String D(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, jrk jrk2, int n2) {
        jse.e(iterable, "<this>");
        if (1 == (n2 & 1)) {
            charSequence = ", ";
        }
        jse.e(charSequence, "separator");
        if ((n2 & 2) != 0) {
            charSequence2 = "";
        }
        jse.e(charSequence2, "prefix");
        if ((n2 & 4) != 0) {
            charSequence3 = "";
        }
        jse.e(charSequence3, "postfix");
        String string = (n2 & 0x10) != 0 ? "..." : null;
        jse.e(string, "truncated");
        StringBuilder stringBuilder = new StringBuilder();
        if ((n2 & 0x20) != 0) {
            jrk2 = null;
        }
        n2 = (n2 & 8) != 0 ? -1 : 0;
        jns.C(iterable, stringBuilder, charSequence, charSequence2, charSequence3, n2, string, jrk2);
        return stringBuilder.toString();
    }

    public static void E(List list, jrk jrk2) {
        jse.e(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            jse.c(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if (list instanceof jsm && !(list instanceof jsn)) {
                jsl.a(list, "kotlin.collections.MutableIterable");
            }
            jns.H(list, jrk2);
            return;
        }
        int n2 = jns.e(list);
        int n3 = 0;
        jpe jpe2 = new jsw(0, n2).a();
        while (jpe2.a) {
            n2 = jpe2.a();
            Object e2 = list.get(n2);
            if (!((Boolean)jrk2.a(e2)).booleanValue()) continue;
            if (n3 != n2) {
                list.set(n3, e2);
            }
            ++n3;
        }
        if (n3 < list.size() && n3 <= (n2 = jns.e(list))) {
            while (true) {
                list.remove(n2);
                if (n2 == n3) break;
                --n2;
            }
        }
    }

    public static final void F(int n2, Object[] objectArray) {
        jse.e(objectArray, "array");
        if (n2 < objectArray.length) {
            objectArray[n2] = null;
        }
    }

    public static void G(Iterable object, Collection collection) {
        jse.e(object, "<this>");
        object = object.iterator();
        while (object.hasNext()) {
            collection.add(object.next());
        }
    }

    public static void H(Iterable object, jrk jrk2) {
        object = object.iterator();
        while (object.hasNext()) {
            if (((Boolean)jrk2.a(object.next())).booleanValue()) continue;
            object.remove();
        }
    }

    public static /* synthetic */ void I(Iterable iterable, Appendable appendable) {
        jns.C(iterable, appendable, "\n", "", "", -1, "...", null);
    }

    public static final void J(int n2, int n3) {
        if (n2 <= n3) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("toIndex (");
        stringBuilder.append(n2);
        stringBuilder.append(") is greater than size (");
        stringBuilder.append(n3);
        stringBuilder.append(").");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public static boolean K(Object[] object, Object[] objectArray) {
        if (object == objectArray) {
            return true;
        }
        int n2 = ((Object[])object).length;
        if (n2 == objectArray.length) {
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object2 = object[i2];
                Object object3 = objectArray[i2];
                if (object2 == object3) continue;
                if (object2 != null && object3 != null) {
                    if (object2 instanceof Object[] && object3 instanceof Object[]) {
                        if (jns.K((Object[])object2, (Object[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof byte[] && object3 instanceof byte[]) {
                        if (Arrays.equals((byte[])object2, (byte[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof short[] && object3 instanceof short[]) {
                        if (Arrays.equals((short[])object2, (short[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof int[] && object3 instanceof int[]) {
                        if (Arrays.equals((int[])object2, (int[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof long[] && object3 instanceof long[]) {
                        if (Arrays.equals((long[])object2, (long[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof float[] && object3 instanceof float[]) {
                        if (Arrays.equals((float[])object2, (float[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof double[] && object3 instanceof double[]) {
                        if (Arrays.equals((double[])object2, (double[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof char[] && object3 instanceof char[]) {
                        if (Arrays.equals((char[])object2, (char[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof boolean[] && object3 instanceof boolean[]) {
                        if (Arrays.equals((boolean[])object2, (boolean[])object3)) continue;
                        return false;
                    }
                    if (object2 instanceof joh && object3 instanceof joh) {
                        object = (joh)object2;
                        throw null;
                    }
                    if (object2 instanceof jol && object3 instanceof jol) {
                        object = (jol)object2;
                        throw null;
                    }
                    if (object2 instanceof joi && object3 instanceof joi) {
                        object = (joi)object2;
                        throw null;
                    }
                    if (object2 instanceof joj && object3 instanceof joj) {
                        object = (joj)object2;
                        throw null;
                    }
                    if (jse.i(object2, object3)) continue;
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static List L(Object[] object) {
        jse.e(object, "<this>");
        object = Arrays.asList(object);
        jse.d(object, "asList(...)");
        return object;
    }

    public static void M(Object[] objectArray, Object object, int n2, int n3) {
        jse.e(objectArray, "<this>");
        Arrays.fill(objectArray, n2, n3, object);
    }

    public static Object[] N(Object[] objectArray, int n2, int n3) {
        jse.e(objectArray, "<this>");
        jns.J(n3, objectArray.length);
        objectArray = Arrays.copyOfRange(objectArray, n2, n3);
        jse.d(objectArray, "copyOfRange(...)");
        return objectArray;
    }

    public static int O(Object[] objectArray) {
        jse.e(objectArray, "<this>");
        return objectArray.length - 1;
    }

    public static Object P(Object[] objectArray, int n2) {
        jse.e(objectArray, "<this>");
        if (n2 >= 0 && n2 < objectArray.length) {
            return objectArray[n2];
        }
        return null;
    }

    public static List Q(Object[] objectArray) {
        ArrayList arrayList = new ArrayList();
        jns.ad(objectArray, arrayList);
        return arrayList;
    }

    public static List R(Object[] object) {
        jse.e(object, "<this>");
        int n2 = ((Object[])object).length;
        object = n2 != 0 ? (n2 != 1 ? jns.S(object) : jns.d(object[0])) : jpa.a;
        return object;
    }

    public static List S(Object[] objectArray) {
        jse.e(objectArray, "<this>");
        jse.e(objectArray, "<this>");
        return new ArrayList(new jox(objectArray, false));
    }

    public static Set T(Object[] object) {
        jse.e(object, "<this>");
        int n2 = ((Object[])object).length;
        if (n2 != 0) {
            if (n2 != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(jjj.E(n2));
                jns.ae(object, linkedHashSet);
                object = linkedHashSet;
            } else {
                object = jjj.D(object[0]);
            }
        } else {
            object = jpc.a;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean U(Object[] var0, Object var1_1) {
        block4: {
            block5: {
                jse.e(var0, "<this>");
                jse.e(var0, "<this>");
                if (var1_1 != null) break block5;
                var3_2 = var0.length;
                for (var2_4 = 0; var2_4 < var3_2; ++var2_4) {
                    if (var0[var2_4] != null) {
                        continue;
                    }
                    ** GOTO lbl14
                }
                break block4;
            }
            var3_3 = var0.length;
            for (var2_4 = 0; var2_4 < var3_3; ++var2_4) {
                if (!jse.i(var1_1, var0[var2_4])) continue;
lbl14:
                // 2 sources

                if (var2_4 >= 0) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    public static void V(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        jse.e(byArray, "<this>");
        jse.e(byArray2, "destination");
        System.arraycopy(byArray, n3, byArray2, n2, n4 - n3);
    }

    public static void W(int[] nArray, int[] nArray2, int n2, int n3, int n4) {
        jse.e(nArray, "<this>");
        jse.e(nArray2, "destination");
        System.arraycopy(nArray, n3, nArray2, n2, n4 - n3);
    }

    public static void X(Object[] objectArray, Object[] objectArray2, int n2, int n3, int n4) {
        jse.e(objectArray, "<this>");
        jse.e(objectArray2, "destination");
        System.arraycopy(objectArray, n3, objectArray2, n2, n4 - n3);
    }

    public static /* synthetic */ void Y(byte[] byArray, byte[] byArray2, int n2, int n3) {
        jns.V(byArray, byArray2, 0, n2, n3);
    }

    public static /* synthetic */ void Z(int[] nArray, int[] nArray2, int n2) {
        jns.W(nArray, nArray2, 0, 0, n2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final jny a(jnz object, jqz jqz2) {
        void var0_4;
        void var1_5;
        jse.e(object, "mode");
        int n2 = ((Enum)object).ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) throw new joa();
                joo joo2 = new joo((jqz)var1_5);
                return var0_4;
            } else {
                jof jof2 = new jof((jqz)var1_5);
            }
            return var0_4;
        } else {
            jog jog2 = new jog((jqz)var1_5);
        }
        return var0_4;
    }

    public static /* synthetic */ void aa(Object[] objectArray, Object[] objectArray2, int n2, int n3, int n4) {
        if ((n4 & 8) != 0) {
            n3 = objectArray.length;
        }
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        jns.X(objectArray, objectArray2, 0, n2, n3);
    }

    public static byte[] ab(byte[] byArray, int n2) {
        jse.e(byArray, "<this>");
        jns.J(n2, byArray.length);
        byArray = Arrays.copyOfRange(byArray, 0, n2);
        jse.d(byArray, "copyOfRange(...)");
        return byArray;
    }

    public static /* synthetic */ void ac(Object[] objectArray, Object object) {
        jns.M(objectArray, object, 0, objectArray.length);
    }

    public static void ad(Object[] objectArray, Collection collection) {
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (object == null) continue;
            collection.add(object);
        }
    }

    public static void ae(Object[] objectArray, Collection collection) {
        jse.e(objectArray, "<this>");
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection.add(objectArray[i2]);
        }
    }

    public static final void af(int n2, int n3) {
        if (n2 >= 0 && n2 < n3) {
            return;
        }
        throw new IndexOutOfBoundsException(a.an(n3, n2, "index: ", ", size: "));
    }

    public static final void ag(int n2, int n3) {
        if (n2 >= 0 && n2 <= n3) {
            return;
        }
        throw new IndexOutOfBoundsException(a.an(n3, n2, "index: ", ", size: "));
    }

    public static final void ah(int n2, int n3, int n4) {
        if (n2 >= 0 && n3 <= n4) {
            if (n2 <= n3) {
                return;
            }
            throw new IllegalArgumentException(a.an(n3, n2, "fromIndex: ", " > toIndex: "));
        }
        StringBuilder stringBuilder = new StringBuilder("fromIndex: ");
        stringBuilder.append(n2);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n3);
        stringBuilder.append(", size: ");
        stringBuilder.append(n4);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public static final int ai(int n2, int n3) {
        int n4;
        n2 = n4 = n2 + (n2 >> 1);
        if (n4 - n3 < 0) {
            n2 = n3;
        }
        n4 = n2;
        if (-2147483639 + n2 > 0) {
            n4 = 0x7FFFFFF7;
            if (n3 > 0x7FFFFFF7) {
                n4 = Integer.MAX_VALUE;
            }
        }
        return n4;
    }

    public static final Object aj(Throwable throwable) {
        jse.e(throwable, "exception");
        return new jod(throwable);
    }

    public static final void ak(Object object) {
        if (!(object instanceof jod)) {
            return;
        }
        throw ((jod)object).a;
    }

    public static /* synthetic */ void al(jyk jyk2) {
        jyk2.n(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object am(jyh var0, jqz var1_2, jqb var2_3) {
        block10: {
            block9: {
                if (!(var2_3 instanceof jyg)) ** GOTO lbl-1000
                var4_4 = (jyg)var2_3;
                var3_5 = var4_4.c;
                if ((var3_5 & -2147483648) != 0) {
                    var4_4.c = var3_5 + -2147483648;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new jyg((jqb)var2_3);
                }
                var6_6 = var4_4.b;
                var5_7 = jqh.a;
                var3_5 = var4_4.c;
                if (var3_5 != 0) {
                    if (var3_5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var2_3 = var0 = var4_4.a;
                    try {
                        jns.ak(var6_6);
                        break block9;
                    }
                    catch (Throwable var0_1) {
                        break block10;
                    }
                }
                jns.ak(var6_6);
                if (var4_4.d().get(jwi.c) != var0) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                var2_3 = var1_2;
                {
                    var4_4.a = var1_2;
                    var2_3 = var1_2;
                    var4_4.c = 1;
                    var2_3 = var1_2;
                    var2_3 = var1_2;
                    var7_8 = new jul(jjj.n(var4_4), 1);
                    var2_3 = var1_2;
                    var7_8.r();
                    var2_3 = var1_2;
                    var2_3 = var1_2;
                    var6_6 = new etv(var7_8, 19);
                    var2_3 = var1_2;
                    var0.b.l((jrk)var6_6);
                    var2_3 = var1_2;
                    var6_6 = var7_8.a();
                    var2_3 = var1_2;
                    if (var6_6 == jqh.a) {
                        var2_3 = var1_2;
                        jsd.j(var4_4);
                    }
                    var0 = var1_2;
                    if (var6_6 != var5_7) break block9;
                    return var5_7;
                }
            }
            var0.a();
            return jon.a;
        }
        var2_3.a();
        throw var0_1;
    }

    public static final void an(jyj jyj2, Throwable throwable) {
        CancellationException cancellationException = null;
        CancellationException cancellationException2 = null;
        if (throwable != null) {
            if (throwable instanceof CancellationException) {
                cancellationException2 = (CancellationException)throwable;
            }
            cancellationException = cancellationException2;
            if (cancellationException2 == null) {
                cancellationException = jvf.l("Channel was consumed, consumer had failed", throwable);
            }
        }
        jyj2.r(cancellationException);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ jxy ao(int n2, int n3, int n4) {
        if (1 == (n4 & 1)) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if (n2 != -2) {
            if (n2 != -1) {
                if (n2 != 0) {
                    if (n2 == Integer.MAX_VALUE) return new jxu(Integer.MAX_VALUE);
                    if (n3 != 1) return new jyf(n2, n3);
                    return new jxu(n2);
                }
                if (n3 != 1) return new jyf(1, n3);
                return new jxu(0);
            }
            if (n3 != 1) throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return new jyf(1, 2);
        }
        if (n3 != 1) return new jyf(1, n3);
        return new jxu(jxx.a);
    }

    public static /* synthetic */ String ap(int n2) {
        return "DROP_OLDEST";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object aq(long var0, jro var2_1, jqb var3_6) {
        block22: {
            block21: {
                if (!(var3_6 instanceof jxf)) ** GOTO lbl-1000
                var5_7 /* !! */  = (jxf)var3_6;
                var4_8 = var5_7 /* !! */ .b;
                if ((var4_8 & -2147483648) != 0) {
                    var5_7 /* !! */ .b = var4_8 + -2147483648;
                } else lbl-1000:
                // 2 sources

                {
                    var5_7 /* !! */  = new jxf((jqb)var3_6);
                }
                var3_6 = var5_7 /* !! */ .a;
                var7_9 = jqh.a;
                var4_8 = var5_7 /* !! */ .b;
                if (var4_8 == 0) break block21;
                if (var4_8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                var5_7 /* !! */  = var5_7 /* !! */ .c;
                try {
                    jns.ak(var3_6);
                    return var3_6;
                }
                catch (jxd var2_2) {
                    var3_6 = var5_7 /* !! */ ;
                }
                break block22;
            }
            jns.ak(var3_6);
            if (var0 <= 0L) {
                return null;
            }
            var6_10 = new jsj();
            var5_7 /* !! */ .c = var6_10;
            var5_7 /* !! */ .b = 1;
            var8_11 = new jxe(var0, (jqb)var5_7 /* !! */ );
            var6_10.a = var8_11;
            var9_12 = jvf.e(var8_11.e.d()).g(var8_11.b, var8_11, var8_11.a);
            var3_6 = new jvr(var9_12);
            jns.av(var8_11, (jwl)var3_6);
            try {
                if (!(var2_1 /* !! */  instanceof jqm)) {
                    var3_6 = jjj.l((jro)var2_1 /* !! */ , var8_11, var8_11);
                } else {
                    jsl.c(var2_1 /* !! */ , 2);
                    var3_6 = var2_1 /* !! */ .b(var8_11, var8_11);
                }
                ** GOTO lbl44
            }
            catch (Throwable var2_3) {
                var3_6 = new jut(var2_3);
lbl44:
                // 3 sources

                var2_1 /* !! */  = jqh.a;
                if (var3_6 == var2_1 /* !! */ ) ** GOTO lbl67
                try {
                    block20: {
                        var2_1 /* !! */  = var8_11.C(var3_6);
                        if (var2_1 /* !! */  == jwq.b) {
                            var2_1 /* !! */  = jqh.a;
                        } else {
                            if (var2_1 /* !! */  instanceof jut) {
                                var2_1 /* !! */  = ((jut)var2_1 /* !! */ ).b;
                                if (var2_1 /* !! */  instanceof jxd && ((jxd)var2_1 /* !! */ ).a == var8_11) {
                                    var2_1 /* !! */  = var3_6;
                                    if (var3_6 instanceof jut) {
                                        var2_1 /* !! */  = ((jut)var3_6).b;
                                        var3_6 = var8_11.e;
                                        if (jve.b == false) throw var2_1 /* !! */ ;
                                        if (var3_6 instanceof jqp != false) throw kbs.a((Throwable)var2_1 /* !! */ , (jqp)var3_6);
                                        throw var2_1 /* !! */ ;
                                    }
                                    break block20;
                                } else {
                                    var3_6 = var8_11.e;
                                    if (jve.b == false) throw var2_1 /* !! */ ;
                                    if (var3_6 instanceof jqp != false) throw kbs.a((Throwable)var2_1 /* !! */ , (jqp)var3_6);
                                    throw var2_1 /* !! */ ;
                                }
                            }
                            var2_1 /* !! */  = jwq.b(var2_1 /* !! */ );
                        }
                    }
                    if (var2_1 /* !! */  == jqh.a) {
                        jsd.j(var5_7 /* !! */ );
                    }
                    if (var2_1 /* !! */  != var7_9) return var2_1 /* !! */ ;
                    return var7_9;
                }
                catch (jxd var2_4) {
                    var3_6 = var6_10;
                }
            }
        }
        if (var2_5.a != var3_6.a) throw var2_5;
        return null;
    }

    public static final jvq ar(jwi object, boolean bl2, jwl jwl2) {
        object = object instanceof jwp ? ((jwp)object).G(bl2, jwl2) : object.bF(jwl2.b(), bl2, new eia((Object)jwl2, 10, null));
        return object;
    }

    public static final void as(jqf jqf2, CancellationException cancellationException) {
        if ((jqf2 = (jwi)jqf2.get(jwi.c)) != null) {
            jqf2.r(cancellationException);
        }
    }

    public static final void at(jqf jqf2) {
        if ((jqf2 = (jwi)jqf2.get(jwi.c)) != null) {
            jns.au((jwi)jqf2);
        }
    }

    public static final void au(jwi jwi2) {
        if (jwi2.s()) {
            return;
        }
        throw jwi2.p();
    }

    public static /* synthetic */ jvq av(jwi jwi2, jwl jwl2) {
        return jns.ar(jwi2, true, jwl2);
    }

    public static final void aw(String string, String string2, dml dml2) {
        if (!string.isEmpty()) {
            int n2;
            int n3 = string.length();
            int n4 = 0;
            for (n2 = 0; n2 < n3; ++n2) {
                char c2 = string.charAt(n2);
                if (c2 > '\u001f' && c2 < '\u007f') {
                    continue;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", (int)c2, n2, string));
            }
            if (string2 != null) {
                block7: {
                    n3 = 0;
                    while (true) {
                        n2 = n4;
                        if (n3 >= string2.length()) break block7;
                        n2 = string2.charAt(n3);
                        if (n2 <= 31 || n2 >= 127) break;
                        ++n3;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", n2, n3, string2));
                }
                while (n2 < dml2.a.size()) {
                    n3 = n2;
                    if (string.equalsIgnoreCase((String)dml2.a.get(n2))) {
                        dml2.a.remove(n2);
                        dml2.a.remove(n2);
                        n3 = n2 - 2;
                    }
                    n2 = n3 + 2;
                }
                dml2.a.add(string);
                dml2.a.add(string2.trim());
                return;
            }
            throw new IllegalArgumentException("value == null");
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static final void b(Throwable throwable, Throwable throwable2) {
        jse.e(throwable, "<this>");
        jse.e(throwable2, "exception");
        if (throwable != throwable2) {
            jse.e(throwable, "cause");
            jse.e(throwable2, "exception");
            if (jqw.a != null && jqw.a < 19) {
                jse.e(throwable, "cause");
                jse.e(throwable2, "exception");
                Method method = jqv.a;
                if (method != null) {
                    method.invoke((Object)throwable, throwable2);
                    return;
                }
            } else {
                throwable.addSuppressed(throwable2);
            }
        }
    }

    public static final List c(List list) {
        jpk jpk2 = (jpk)list;
        jpk2.h();
        jpk2.d = true;
        if (jpk2.c > 0) {
            return list;
        }
        return jpk.a;
    }

    public static final List d(Object list) {
        list = Collections.singletonList(list);
        jse.d(list, "singletonList(...)");
        return list;
    }

    public static int e(List list) {
        jse.e(list, "<this>");
        return list.size() - 1;
    }

    public static List f(Object ... object) {
        jse.e(object, "elements");
        object = ((Object[])object).length > 0 ? jns.L(object) : jpa.a;
        return object;
    }

    public static List g(Object ... objectArray) {
        return new ArrayList(new jox(objectArray, true));
    }

    public static List h(List list) {
        int n2 = list.size();
        if (n2 != 0) {
            if (n2 != 1) {
                return list;
            }
            return jns.d(list.get(0));
        }
        return jpa.a;
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void j(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static Object k(List list) {
        if (!list.isEmpty()) {
            return list.remove(jns.e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object l(List list) {
        jse.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object m(List list) {
        jse.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(jns.e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static List n(Collection collection, Iterable iterable) {
        jse.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List o(Collection collection, Object object) {
        jse.e(collection, "<this>");
        ArrayList<Object> arrayList = new ArrayList<Object>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(object);
        return arrayList;
    }

    public static List p(Iterable objectArray) {
        jse.e(objectArray, "<this>");
        if (objectArray instanceof Collection) {
            Object[] objectArray2;
            if (objectArray.size() <= 1) {
                return jns.s((Iterable)objectArray);
            }
            objectArray = objectArray2 = objectArray.toArray(new Comparable[0]);
            jse.e(objectArray, "<this>");
            if (objectArray.length > 1) {
                Arrays.sort(objectArray);
            }
            return jns.L(objectArray2);
        }
        objectArray = jns.t((Iterable)objectArray);
        jns.j((List)objectArray);
        return objectArray;
    }

    public static List q(Iterable objectArray, Comparator comparator) {
        jse.e(objectArray, "<this>");
        if (objectArray instanceof Collection) {
            if (objectArray.size() <= 1) {
                return jns.s((Iterable)objectArray);
            }
            objectArray = objectArray.toArray(new Object[0]);
            jse.e(objectArray, "<this>");
            if (objectArray.length > 1) {
                Arrays.sort(objectArray, comparator);
            }
            return jns.L(objectArray);
        }
        if ((objectArray = jns.t((Iterable)objectArray)).size() > 1) {
            Collections.sort(objectArray, comparator);
        }
        return objectArray;
    }

    public static List r(Iterable iterator, int n2) {
        block6: {
            int n3;
            block7: {
                block11: {
                    block10: {
                        block8: {
                            block9: {
                                jse.e(iterator, "<this>");
                                if (n2 < 0) break block6;
                                if (n2 == 0) {
                                    return jpa.a;
                                }
                                boolean bl2 = iterator instanceof Collection;
                                n3 = 0;
                                if (!bl2) break block7;
                                if (n2 >= iterator.size()) {
                                    return jns.s((Iterable)((Object)iterator));
                                }
                                if (n2 != 1) break block7;
                                jse.e(iterator, "<this>");
                                if (!(iterator instanceof List)) break block8;
                                jse.e(iterator, "<this>");
                                if (iterator.isEmpty()) break block9;
                                iterator = iterator.get(0);
                                break block10;
                            }
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (!(iterator = iterator.iterator()).hasNext()) break block11;
                        iterator = iterator.next();
                    }
                    return jns.d(iterator);
                }
                throw new NoSuchElementException("Collection is empty.");
            }
            ArrayList arrayList = new ArrayList(n2);
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                int n4;
                arrayList.add(iterator.next());
                n3 = n4 = n3 + 1;
                if (n4 != n2) continue;
            }
            return jns.h(arrayList);
        }
        throw new IllegalArgumentException(a.ah(n2, "Requested element count ", " is less than zero."));
    }

    public static List s(Iterable iterable) {
        jse.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            int n2 = iterable.size();
            if (n2 != 0) {
                if (n2 != 1) {
                    iterable = jns.u((Collection)iterable);
                } else {
                    iterable = iterable instanceof List ? ((List)iterable).get(0) : iterable.iterator().next();
                    iterable = jns.d(iterable);
                }
            } else {
                iterable = jpa.a;
            }
            return iterable;
        }
        return jns.h(jns.t(iterable));
    }

    public static List t(Iterable iterable) {
        jse.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return jns.u((Collection)iterable);
        }
        ArrayList arrayList = new ArrayList();
        jns.G(iterable, arrayList);
        return arrayList;
    }

    public static List u(Collection collection) {
        jse.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set v(Iterable iterable, Iterable iterable2) {
        jse.e(iterable, "<this>");
        jse.e(iterable2, "other");
        Set set = jns.w(iterable);
        jse.e(iterable2, "elements");
        jse.e(iterable2, "<this>");
        iterable = iterable2;
        if (!(iterable2 instanceof Collection)) {
            iterable = jns.s(iterable2);
        }
        set.retainAll((Collection<?>)iterable);
        return set;
    }

    public static Set w(Iterable linkedHashSet) {
        jse.e(linkedHashSet, "<this>");
        if (linkedHashSet instanceof Collection) {
            linkedHashSet = new LinkedHashSet(linkedHashSet);
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            jns.G(linkedHashSet, linkedHashSet2);
            linkedHashSet = linkedHashSet2;
        }
        return linkedHashSet;
    }

    public static Set x(Iterable linkedHashSet) {
        jse.e(linkedHashSet, "<this>");
        if (linkedHashSet instanceof Collection) {
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            int n2 = linkedHashSet2.size();
            if (n2 != 0) {
                if (n2 != 1) {
                    linkedHashSet2 = new LinkedHashSet(jjj.E(linkedHashSet2.size()));
                    jns.G(linkedHashSet, linkedHashSet2);
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = linkedHashSet instanceof List ? ((List)((Object)linkedHashSet)).get(0) : linkedHashSet.iterator().next();
                    linkedHashSet = jjj.D(linkedHashSet);
                }
            } else {
                linkedHashSet = jpc.a;
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        jns.G(linkedHashSet, linkedHashSet3);
        int n3 = linkedHashSet3.size();
        if (n3 != 0) {
            if (n3 != 1) {
                return linkedHashSet3;
            }
            return jjj.D(linkedHashSet3.iterator().next());
        }
        return jpc.a;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean y(Iterable iterator, Object object) {
        int n2;
        block5: {
            jse.e(iterator, "<this>");
            if (iterator instanceof Collection) return iterator.contains(object);
            jse.e(iterator, "<this>");
            if (iterator instanceof List) {
                n2 = ((List)((Object)iterator)).indexOf(object);
            } else {
                iterator = iterator.iterator();
                n2 = 0;
                while (iterator.hasNext()) {
                    Object t2 = iterator.next();
                    if (n2 < 0) {
                        jns.i();
                    }
                    if (!jse.i(object, t2)) {
                        ++n2;
                        continue;
                    }
                    break block5;
                }
                return false;
            }
        }
        if (n2 < 0) return false;
        return true;
    }

    public static int[] z(Collection object) {
        int[] nArray = new int[object.size()];
        object = object.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            nArray[n2] = ((Number)object.next()).intValue();
            ++n2;
        }
        return nArray;
    }
}

