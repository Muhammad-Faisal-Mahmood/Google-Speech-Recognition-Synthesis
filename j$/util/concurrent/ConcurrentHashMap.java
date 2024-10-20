/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.sun.misc.a;
import j$.util.concurrent.ConcurrentMap;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.concurrent.b;
import j$.util.concurrent.c;
import j$.util.concurrent.e;
import j$.util.concurrent.g;
import j$.util.concurrent.i;
import j$.util.concurrent.l;
import j$.util.concurrent.m;
import j$.util.concurrent.o;
import j$.util.concurrent.q;
import j$.util.concurrent.r;
import j$.util.concurrent.s;
import j$.util.concurrent.t;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentHashMap<K, V>
extends AbstractMap<K, V>
implements java.util.concurrent.ConcurrentMap<K, V>,
Serializable,
ConcurrentMap<K, V> {
    static final int g = Runtime.getRuntime().availableProcessors();
    private static final a h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient t e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", o[].class);
        Object object = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", (Class<?>)object), new ObjectStreamField("segmentShift", (Class<?>)object)};
        h = object = j$.sun.misc.a.h();
        i = ((a)object).j(ConcurrentHashMap.class, "sizeCtl");
        j = ((a)object).j(ConcurrentHashMap.class, "transferIndex");
        k = ((a)object).j(ConcurrentHashMap.class, "baseCount");
        l = ((a)object).j(ConcurrentHashMap.class, "cellsBusy");
        m = ((a)object).j(c.class, "value");
        n = ((a)object).a(l[].class);
        int n2 = ((a)object).b(l[].class);
        if ((n2 - 1 & n2) == 0) {
            o = 31 - Integer.numberOfLeadingZeros(n2);
            return;
        }
        throw new ExceptionInInitializerError("array index scale not a power of two");
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int n2) {
        this(n2, 0.75f, 1);
    }

    public ConcurrentHashMap(int n2, float f2, int n3) {
        if (f2 > 0.0f && n2 >= 0 && n3 > 0) {
            long l2;
            int n4 = n2;
            if (n2 < n3) {
                n4 = n3;
            }
            n2 = (l2 = (long)((double)((float)n4 / f2) + 1.0)) >= 0x40000000L ? 0x40000000 : ConcurrentHashMap.l((int)l2);
            this.sizeCtl = n2;
            return;
        }
        throw new IllegalArgumentException();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void a(long var1_1, int var3_2) {
        block39: {
            block38: {
                block37: {
                    block36: {
                        var18_3 = this.c;
                        if (var18_3 != null) break block36;
                        var17_4 /* !! */  = ConcurrentHashMap.h;
                        var13_8 = ConcurrentHashMap.k;
                        var11_9 = this.baseCount;
                        var7_11 = var9_10 = var11_9 + var1_1;
                        if (var17_4 /* !! */ .d(this, var13_8, var11_9, var9_10)) break block37;
                    }
                    if (var18_3 == null || (var4_12 = ((c[])var18_3).length - 1) < 0 || (var17_4 /* !! */  = var18_3[var4_12 & ThreadLocalRandom.b()]) == null) break block38;
                    var18_3 = ConcurrentHashMap.h;
                    var7_11 = ConcurrentHashMap.m;
                    var9_10 = var17_4 /* !! */ .value;
                    var15_13 = var18_3.d(var17_4 /* !! */ , var7_11, var9_10, var9_10 + var1_1);
                    if (!var15_13) break block39;
                    if (var3_2 <= 1) {
                        return;
                    }
                    var7_11 = this.j();
                }
                if (var3_2 >= 0) {
                    while (var7_11 >= (long)(var3_2 = this.sizeCtl) && (var18_3 = this.a) != null && (var4_12 = ((Object)var18_3).length) < 0x40000000) {
                        var4_12 = Integer.numberOfLeadingZeros(var4_12) | 32768;
                        if (var3_2 < 0) {
                            if (var3_2 >>> 16 != var4_12 || var3_2 == var4_12 + 1 || var3_2 == var4_12 + 65535 || (var17_4 /* !! */  = this.b) == null || this.transferIndex <= 0) break;
                            if (ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, var3_2, var3_2 + 1)) {
                                this.m((l[])var18_3, (l[])var17_4 /* !! */ );
                            }
                        } else if (ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, var3_2, (var4_12 << 16) + 2)) {
                            this.m((l[])var18_3, null);
                        }
                        var7_11 = this.j();
                    }
                }
                return;
            }
            var15_13 = true;
        }
        var3_2 = var4_12 = ThreadLocalRandom.b();
        if (var4_12 == 0) {
            ThreadLocalRandom.c();
            var3_2 = ThreadLocalRandom.b();
            var15_13 = true;
        }
        block9: while (true) {
            var5_14 = 0;
            var16_16 = var15_13;
            var4_12 = var3_2;
            while (true) {
                block40: {
                    block30: {
                        block41: {
                            block42: {
                                block29: {
                                    block43: {
                                        block28: {
                                            if ((var18_3 = this.c) == null || (var6_15 = ((c[])var18_3).length) <= 0) break block40;
                                            var17_4 /* !! */  = var18_3[var6_15 - 1 & var4_12];
                                            if (var17_4 /* !! */  != null) break block41;
                                            if (this.cellsBusy != 0) break block42;
                                            var18_3 = new c(var1_1);
                                            if (this.cellsBusy != 0 || !ConcurrentHashMap.h.c(this, ConcurrentHashMap.l, 0, 1)) break block42;
                                            try {
                                                var17_4 /* !! */  = this.c;
                                                if (var17_4 /* !! */  == null) break block28;
                                            }
                                            catch (Throwable var17_5) {
                                                break block29;
                                            }
                                            var3_2 = var17_4 /* !! */ .length;
                                            if (var3_2 <= 0 || var17_4 /* !! */ [var3_2 = var3_2 - 1 & var4_12] != null) break block28;
                                            var17_4 /* !! */ [var3_2] = var18_3;
                                            var3_2 = 1;
                                            break block43;
                                        }
                                        var3_2 = 0;
                                    }
                                    this.cellsBusy = 0;
                                    if (var3_2 == 0) continue;
                                    break block9;
                                }
                                this.cellsBusy = 0;
                                throw var17_5;
                            }
                            while (true) {
                                var3_2 = 0;
                                var15_13 = var16_16;
                                break block30;
                                break;
                            }
                        }
                        if (!var16_16) {
                            var15_13 = true;
                            var3_2 = var5_14;
                        } else {
                            var19_17 = ConcurrentHashMap.h;
                            var9_10 = ConcurrentHashMap.m;
                            var7_11 = var17_4 /* !! */ .value;
                            if (var19_17.d(var17_4 /* !! */ , var9_10, var7_11, var7_11 + var1_1)) break block9;
                            if (this.c != var18_3 || var6_15 >= ConcurrentHashMap.g) ** continue;
                            if (var5_14 == 0) {
                                var3_2 = 1;
                                var15_13 = var16_16;
                            } else {
                                var15_13 = var16_16;
                                var3_2 = var5_14;
                                if (this.cellsBusy == 0) {
                                    var15_13 = var16_16;
                                    var3_2 = var5_14;
                                    if (var19_17.c(this, ConcurrentHashMap.l, 0, 1)) {
                                        block32: {
                                            block31: {
                                                try {
                                                    if (this.c != var18_3) break block31;
                                                    this.c = (c[])Arrays.copyOf(var18_3, var6_15 << 1);
                                                }
                                                catch (Throwable var17_6) {
                                                    break block32;
                                                }
                                            }
                                            this.cellsBusy = 0;
                                            var3_2 = var4_12;
                                            var15_13 = var16_16;
                                            continue block9;
                                        }
                                        this.cellsBusy = 0;
                                        throw var17_6;
                                    }
                                }
                            }
                        }
                    }
                    var4_12 = ThreadLocalRandom.a(var4_12);
                    var16_16 = var15_13;
                    var5_14 = var3_2;
                    continue;
                }
                if (this.cellsBusy == 0 && this.c == var18_3 && ConcurrentHashMap.h.c(this, ConcurrentHashMap.l, 0, 1)) {
                    block35: {
                        block34: {
                            block33: {
                                try {
                                    if (this.c != var18_3) break block33;
                                    var18_3 = new c[2];
                                    var17_4 /* !! */  = new c(var1_1);
                                    var18_3[var4_12 & 1] = var17_4 /* !! */ ;
                                }
                                catch (Throwable var17_7) {
                                    break block35;
                                }
                                this.c = var18_3;
                                var3_2 = 1;
                                break block34;
                            }
                            var3_2 = 0;
                        }
                        this.cellsBusy = 0;
                        if (var3_2 == 0) continue;
                        break block9;
                    }
                    this.cellsBusy = 0;
                    throw var17_7;
                }
                var17_4 /* !! */  = ConcurrentHashMap.h;
                var7_11 = ConcurrentHashMap.k;
                var9_10 = this.baseCount;
                if (var17_4 /* !! */ .d(this, var7_11, var9_10, var9_10 + var1_1)) break block9;
            }
            break;
        }
    }

    static final boolean b(l[] lArray, int n2, l l2) {
        long l3 = n2;
        n2 = o;
        long l4 = n;
        return h.e(lArray, (l3 << n2) + l4, l2);
    }

    static Class c(Object typeArray) {
        if (typeArray instanceof Comparable) {
            Class<?> clazz = typeArray.getClass();
            if (clazz == String.class) {
                return clazz;
            }
            typeArray = clazz.getGenericInterfaces();
            if (typeArray != null) {
                for (Type type : typeArray) {
                    Type[] typeArray2;
                    ParameterizedType parameterizedType;
                    if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType)type).getRawType() != Comparable.class || (typeArray2 = parameterizedType.getActualTypeArguments()) == null || typeArray2.length != 1 || typeArray2[0] != clazz) continue;
                    return clazz;
                }
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final l[] e() {
        Throwable throwable2;
        int n2;
        block8: {
            l[] lArray;
            block5: {
                int n3;
                block7: {
                    block6: {
                        l[] lArray2;
                        while (true) {
                            if ((lArray2 = this.a) != null) {
                                lArray = lArray2;
                                if (lArray2.length != 0) break block5;
                            }
                            if ((n2 = this.sizeCtl) < 0) {
                                Thread.yield();
                                continue;
                            }
                            if (h.c(this, i, n2, -1)) break;
                        }
                        try {
                            lArray2 = this.a;
                            if (lArray2 == null) break block6;
                            n3 = n2;
                            lArray = lArray2;
                            if (lArray2.length != 0) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    n3 = n2 > 0 ? n2 : 16;
                    lArray = new l[n3];
                    this.a = lArray;
                    n3 -= n3 >>> 2;
                }
                this.sizeCtl = n3;
            }
            return lArray;
        }
        this.sizeCtl = n2;
        throw throwable2;
    }

    static final void h(l[] lArray, int n2, l l2) {
        long l3 = n2;
        n2 = o;
        long l4 = n;
        h.l(lArray, (l3 << n2) + l4, l2);
    }

    static final int i(int n2) {
        return (n2 ^ n2 >>> 16) & Integer.MAX_VALUE;
    }

    static final l k(l[] lArray, int n2) {
        long l2 = n2;
        n2 = o;
        long l3 = n;
        return (l)h.g(lArray, (l2 << n2) + l3);
    }

    private static final int l(int n2) {
        int n3 = 1;
        n2 = (n2 = -1 >>> Integer.numberOfLeadingZeros(n2 - 1)) < 0 ? n3 : (n2 >= 0x40000000 ? 0x40000000 : ++n2);
        return n2;
    }

    /*
     * Exception decompiling
     */
    private final void m(l[] var1_1, l[] var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 471->492)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void n(l[] lArray, int n2) {
        int n3 = lArray.length;
        if (n3 < 64) {
            this.o(n3 << 1);
            return;
        }
        l l2 = ConcurrentHashMap.k(lArray, n2);
        if (l2 == null) return;
        if (l2.a < 0) return;
        synchronized (l2) {
            s s2;
            l l3;
            s s3;
            try {
                if (ConcurrentHashMap.k(lArray, n2) != l2) return;
                s3 = null;
                l3 = l2;
                s2 = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                if (l3 == null) {
                    l3 = new r(s3);
                    ConcurrentHashMap.h(lArray, n2, l3);
                    return;
                }
                s s4 = new s(l3.a, l3.b, l3.c, null, null);
                s4.h = s2;
                if (s2 == null) {
                    s3 = s4;
                } else {
                    s2.d = s4;
                }
                l3 = l3.d;
                s2 = s4;
            }
        }
    }

    private final void o(int n2) {
        int n3;
        n2 = n2 >= 0x20000000 ? 0x40000000 : ConcurrentHashMap.l(n2 + (n2 >>> 1) + 1);
        while ((n3 = this.sizeCtl) >= 0) {
            Throwable throwable2;
            block5: {
                int n4;
                block4: {
                    int n5;
                    l[] lArray = this.a;
                    if (lArray != null && (n5 = lArray.length) != 0) {
                        if (n2 <= n3 || n5 >= 0x40000000) break;
                        if (lArray != this.a || !h.c(this, i, n3, (((n5 = Integer.numberOfLeadingZeros(n5)) | 0x8000) << 16) + 2)) continue;
                        this.m(lArray, null);
                        continue;
                    }
                    n5 = n3 > n2 ? n3 : n2;
                    if (!h.c(this, i, n3, -1)) continue;
                    n4 = n3;
                    try {
                        if (this.a != lArray) break block4;
                        this.a = new l[n5];
                        n4 = n5 - (n5 >>> 2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.sizeCtl = n4;
                continue;
            }
            this.sizeCtl = n3;
            throw throwable2;
        }
    }

    static l p(s l2) {
        l l3 = null;
        l l4 = null;
        while (l2 != null) {
            l l5 = new l(l2.a, l2.b, l2.c);
            if (l4 == null) {
                l3 = l5;
            } else {
                l4.d = l5;
            }
            l2 = l2.d;
            l4 = l5;
        }
        return l3;
    }

    /*
     * Unable to fully structure code
     */
    private void readObject(ObjectInputStream var1_1) {
        this.sizeCtl = -1;
        var1_1.defaultReadObject();
        var8_2 = 0L;
        var6_3 = 0L;
        var10_4 = null;
        while (true) {
            var12_6 = var1_1.readObject();
            var11_5 = var1_1.readObject();
            if (var12_6 == null || var11_5 == null) break;
            var10_4 = new l(ConcurrentHashMap.i(var12_6.hashCode()), var12_6, var11_5, var10_4);
            ++var6_3;
        }
        if (var6_3 == 0L) {
            this.sizeCtl = 0;
        } else {
            var3_7 = (var6_3 = (long)((double)((float)var6_3 / 0.75f) + 1.0)) >= 0x40000000L ? 0x40000000 : ConcurrentHashMap.l((int)var6_3);
            var16_8 = new l[var3_7];
            var1_1 = var10_4;
            var6_3 = var8_2;
            while (var1_1 != null) {
                block16: {
                    var14_13 = var1_1.d;
                    var2_9 = var1_1.a;
                    var5_11 = var2_9 & var3_7 - 1;
                    var15_14 = ConcurrentHashMap.k(var16_8, var5_11);
                    if (var15_14 == null) {
                        var2_9 = 1;
                        var8_2 = var6_3;
                    } else {
                        block17: {
                            var11_5 = var1_1.b;
                            if (var15_14.a < 0) {
                                var8_2 = var6_3;
                                if (((r)var15_14).e(var2_9, var11_5, var1_1.c) == null) {
                                    var8_2 = var6_3 + 1L;
                                }
lbl34:
                                // 4 sources

                                while (true) {
                                    var2_9 = 0;
                                    break block16;
                                    break;
                                }
                            }
                            var10_4 = var15_14;
                            var4_10 = 0;
                            while (var10_4 != null) {
                                if (var10_4.a == var2_9 && ((var12_6 = var10_4.b) == var11_5 || var12_6 != null && var11_5.equals(var12_6))) {
                                    var2_9 = 0;
                                    break block17;
                                }
                                ++var4_10;
                                var10_4 = var10_4.d;
                            }
                            var2_9 = 1;
                        }
                        if (var2_9 != 0 && var4_10 >= 8) {
                            ++var6_3;
                            var1_1.d = var15_14;
                            var11_5 = var1_1;
                            var12_6 = null;
                            var13_12 = null;
                            while (var11_5 != null) {
                                var10_4 = new s(var11_5.a, var11_5.b, var11_5.c, null, null);
                                var10_4.h = var13_12;
                                if (var13_12 == null) {
                                    var12_6 = var10_4;
                                } else {
                                    var13_12.d = var10_4;
                                }
                                var11_5 = var11_5.d;
                                var13_12 = var10_4;
                            }
                            ConcurrentHashMap.h(var16_8, var5_11, new r((s)var12_6));
                            var8_2 = var6_3;
                            ** continue;
                        }
                        var8_2 = var6_3;
                    }
                }
                var6_3 = var8_2;
                if (var2_9 != 0) {
                    var6_3 = var8_2 + 1L;
                    var1_1.d = var15_14;
                    ConcurrentHashMap.h(var16_8, var5_11, (l)var1_1);
                }
                var1_1 = var14_13;
            }
            this.a = var16_8;
            this.sizeCtl = var3_7 - (var3_7 >>> 2);
            this.baseCount = var6_3;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int n2;
        int n3 = 0;
        for (n2 = 1; n2 < 16; n2 <<= 1) {
            ++n3;
        }
        Object object = new o[16];
        for (int i2 = 0; i2 < 16; ++i2) {
            object[i2] = new ReentrantLock();
        }
        Object object2 = objectOutputStream.putFields();
        ((ObjectOutputStream.PutField)object2).put("segments", object);
        ((ObjectOutputStream.PutField)object2).put("segmentShift", 32 - n3);
        ((ObjectOutputStream.PutField)object2).put("segmentMask", n2 - 1);
        objectOutputStream.writeFields();
        object2 = this.a;
        if (object2 != null) {
            object2 = new q((l[])object2, ((l[])object2).length, 0, ((l[])object2).length);
            while ((object = ((q)object2).c()) != null) {
                objectOutputStream.writeObject(object.b);
                objectOutputStream.writeObject(object.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void clear() {
        var9_1 = this.a;
        var4_2 = 0L;
        block4: while (true) {
            var1_3 = 0;
            while (true) {
                block10: {
                    if (var9_1 == null || var1_3 >= var9_1.length) break block10;
                    var10_9 = ConcurrentHashMap.k(var9_1, var1_3);
                    if (var10_9 == null) {
                        ++var1_3;
                        continue;
                    }
                    var3_5 = var10_9.a;
                    if (var3_5 == -1) {
                        var9_1 = this.d(var9_1, var10_9);
                        continue block4;
                    }
                    synchronized (var10_9) {
                        var2_4 = var1_3;
                        var6_6 = var4_2;
                        if (ConcurrentHashMap.k(var9_1, var1_3) != var10_9) ** GOTO lbl35
                        var8_7 = var3_5 >= 0 ? var10_9 : (var10_9 instanceof r ? ((r)var10_9).f : null);
                        ** GOTO lbl28
                    }
                }
                if (var4_2 != 0L) {
                    this.a(var4_2, -1);
                }
                return;
                {
                    catch (Throwable var8_8) {}
                    {
                        throw var8_8;
lbl28:
                        // 2 sources

                        while (var8_7 != null) {
                            --var4_2;
                            var8_7 = var8_7.d;
                        }
                        ConcurrentHashMap.h(var9_1, var1_3, null);
                        var2_4 = var1_3 + 1;
                        var6_6 = var4_2;
lbl35:
                        // 2 sources

                        // MONITOREXIT @DISABLED, blocks:[1, 2, 4, 5] lbl35 : MonitorExitStatement: MONITOREXIT : var10_9
                        var1_3 = var2_4;
                        var4_2 = var6_6;
                        continue;
                    }
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object compute(Object var1_1, BiFunction var2_5) {
        block41: {
            if (var1_1 == null) throw null;
            if (var2_5 == null) throw null;
            var7_6 = ConcurrentHashMap.i(var1_1.hashCode());
            var12_7 = this.a;
            var6_8 = 0;
            var13_9 = null;
            var3_10 = 0;
            while (true) {
                block42: {
                    block44: {
                        block45: {
                            if (var12_7 == null || (var4_11 = var12_7.length) == 0) ** GOTO lbl98
                            var8_13 = var4_11 - 1 & var7_6;
                            var15_18 = ConcurrentHashMap.k(var12_7, var8_13);
                            if (var15_18 == null) {
                                block37: {
                                    block40: {
                                        block39: {
                                            block38: {
                                                var14_17 = new m();
                                                // MONITORENTER : var14_17
                                                var10_15 = ConcurrentHashMap.b(var12_7, var8_13, (l)var14_17);
                                                var5_12 = var6_8;
                                                var4_11 = var3_10;
                                                var11_16 = var13_9;
                                                if (!var10_15) break block37;
                                                try {
                                                    var13_9 = var2_5.apply(var1_1, null);
                                                    if (var13_9 == null) break block38;
                                                    var11_16 = new l(var7_6, var1_1, var13_9);
                                                    var3_10 = 1;
                                                    break block39;
                                                }
                                                catch (Throwable var1_2) {
                                                    break block40;
                                                }
                                            }
                                            var11_16 = null;
                                        }
                                        ConcurrentHashMap.h(var12_7, var8_13, (l)var11_16);
                                        var5_12 = 1;
                                        var4_11 = var3_10;
                                        var11_16 = var13_9;
                                    }
                                    ConcurrentHashMap.h(var12_7, var8_13, null);
                                    throw var1_2;
                                }
                                // MONITOREXIT : var14_17
                                var6_8 = var5_12;
                                var3_10 = var4_11;
                                var13_9 = var11_16;
                                if (var5_12 == 0) continue;
                                var3_10 = var5_12;
                                var6_8 = var4_11;
                                var1_1 = var11_16;
                                break block41;
                            }
                            var9_14 = var15_18.a;
                            if (var9_14 == -1) {
                                var12_7 = this.d(var12_7, var15_18);
                                continue;
                            }
                            // MONITORENTER : var15_18
                            var5_12 = var6_8;
                            var4_11 = var3_10;
                            var11_16 = var13_9;
                            if (ConcurrentHashMap.k(var12_7, var8_13) != var15_18) break block42;
                            if (var9_14 >= 0) {
                                var13_9 = null;
                                var11_16 = var15_18;
                                var5_12 = 1;
                                break block45;
                            } else {
                                if (var15_18 instanceof r) {
                                    var14_17 = (r)var15_18;
                                    var11_16 = var14_17.e;
                                    var11_16 = var11_16 != null ? var11_16.b(var7_6, var1_1, null) : null;
                                    var13_9 = var11_16 == null ? null : var11_16.c;
                                    if ((var13_9 = var2_5.apply(var1_1, var13_9)) != null) {
                                        if (var11_16 != null) {
                                            var11_16.c = var13_9;
                                        } else {
                                            var14_17.e(var7_6, var1_1, var13_9);
                                            var3_10 = 1;
                                        }
                                    } else if (var11_16 != null) {
                                        if (var14_17.f((s)var11_16)) {
                                            ConcurrentHashMap.h(var12_7, var8_13, ConcurrentHashMap.p(var14_17.f));
                                        }
                                        var3_10 = -1;
                                    }
                                    var11_16 = var13_9;
                                    var5_12 = 1;
                                    var4_11 = var3_10;
                                } else {
                                    if (var15_18 instanceof m) {
                                        var1_1 = new IllegalStateException("Recursive update");
                                        throw var1_1;
                                    }
                                    var5_12 = var6_8;
                                    var4_11 = var3_10;
                                    var11_16 = var13_9;
                                }
                                // MONITOREXIT : var15_18
                                break block42;
                            }
lbl98:
                            // 1 sources

                            var12_7 = this.e();
                            continue;
                        }
lbl101:
                        // 2 sources

                        while (true) {
                            if (var11_16.a != var7_6 || (var14_17 = var11_16.b) != var1_1 && (var14_17 == null || !var1_1.equals(var14_17))) break block44;
                            break;
                        }
                        var14_17 = var2_5.apply(var1_1, var11_16.c);
                        if (var14_17 != null) {
                            var11_16.c = var14_17;
                            var11_16 = var14_17;
                            var4_11 = var3_10;
                            break block42;
                        } else {
                            var11_16 = var11_16.d;
                            if (var13_9 != null) {
                                var13_9.d = var11_16;
                            } else {
                                ConcurrentHashMap.h(var12_7, var8_13, (l)var11_16);
                            }
                            var11_16 = var14_17;
                            var4_11 = -1;
                        }
                        break block42;
                    }
                    var14_17 = var11_16.d;
                    if (var14_17 == null) {
                        var13_9 = var2_5.apply(var1_1, null);
                        if (var13_9 != null) {
                            if (var11_16.d != null) {
                                var1_1 = new IllegalStateException("Recursive update");
                                throw var1_1;
                            }
                            var11_16.d = var14_17 = new l(var7_6, var1_1, var13_9);
                            var11_16 = var13_9;
                            var4_11 = 1;
                        } else {
                            var11_16 = var13_9;
                            var4_11 = var3_10;
                        }
                    } else {
                        ++var5_12;
                        var13_9 = var11_16;
                        var11_16 = var14_17;
                        ** continue;
                    }
                }
                var6_8 = var5_12;
                var3_10 = var4_11;
                var13_9 = var11_16;
                if (var5_12 != 0) break;
            }
            var3_10 = var5_12;
            var6_8 = var4_11;
            var1_1 = var11_16;
            if (var5_12 >= 8) {
                this.n(var12_7, var8_13);
                var1_1 = var11_16;
                var6_8 = var4_11;
                var3_10 = var5_12;
            }
        }
        if (var6_8 == 0) return var1_1;
        this.a(var6_8, var3_10);
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object computeIfAbsent(Object var1_1, Function var2_5) {
        block29: {
            if (var1_1 == null) throw null;
            if (var2_5 == null) throw null;
            var7_6 = ConcurrentHashMap.i(var1_1.hashCode());
            var13_7 = this.a;
            var12_8 = null;
            var4_9 = 0;
            while (true) {
                block30: {
                    block31: {
                        block34: {
                            block32: {
                                block35: {
                                    block36: {
                                        block33: {
                                            if (var13_7 == null || (var3_10 = var13_7.length) == 0) ** GOTO lbl87
                                            var8_13 = var3_10 - 1 & var7_6;
                                            var14_17 = ConcurrentHashMap.k(var13_7, var8_13);
                                            var5_11 = true;
                                            var6_12 = true;
                                            if (var14_17 == null) {
                                                block27: {
                                                    block28: {
                                                        var14_17 = new m();
                                                        // MONITORENTER : var14_17
                                                        var10_15 = ConcurrentHashMap.b(var13_7, var8_13, var14_17);
                                                        var3_10 = var4_9;
                                                        var11_16 = var12_8;
                                                        if (!var10_15) break block27;
                                                        try {
                                                            var12_8 = var2_5.apply(var1_1);
                                                            var11_16 = var12_8 != null ? new l(var7_6, var1_1, var12_8) : null;
                                                        }
                                                        catch (Throwable var1_2) {
                                                            break block28;
                                                        }
                                                        ConcurrentHashMap.h(var13_7, var8_13, (l)var11_16);
                                                        var3_10 = 1;
                                                        var11_16 = var12_8;
                                                    }
                                                    ConcurrentHashMap.h(var13_7, var8_13, null);
                                                    throw var1_2;
                                                }
                                                // MONITOREXIT : var14_17
                                                var4_9 = var3_10;
                                                var12_8 = var11_16;
                                                if (var3_10 == 0) continue;
                                                var1_1 = var11_16;
                                                break block29;
                                            }
                                            var9_14 = var14_17.a;
                                            if (var9_14 == -1) {
                                                var13_7 = this.d(var13_7, var14_17);
                                                continue;
                                            }
                                            if (var9_14 == var7_6 && ((var11_16 = var14_17.b) == var1_1 || var11_16 != null && var1_1.equals(var11_16)) && (var11_16 = var14_17.c) != null) {
                                                return var11_16;
                                            }
                                            // MONITORENTER : var14_17
                                            var3_10 = var4_9;
                                            var11_16 = var12_8;
                                            if (ConcurrentHashMap.k(var13_7, var8_13) != var14_17) break block32;
                                            if (var9_14 < 0) break block33;
                                            var11_16 = var14_17;
                                            var3_10 = 1;
                                            break block34;
                                        }
                                        if (!(var14_17 instanceof r)) break block35;
                                        var15_18 /* !! */  = (r)var14_17;
                                        var11_16 = var15_18 /* !! */ .e;
                                        if (var11_16 == null || (var11_16 = var11_16.b(var7_6, var1_1, null)) == null) break block36;
                                        var11_16 = var11_16.c;
                                        ** GOTO lbl-1000
                                    }
                                    var11_16 = var12_8 = var2_5.apply(var1_1);
                                    if (var12_8 != null) {
                                        var15_18 /* !! */ .e(var7_6, var1_1, var12_8);
                                        var5_11 = var6_12;
                                        var11_16 = var12_8;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var5_11 = false;
                                    }
                                    var3_10 = 2;
                                    ** GOTO lbl85
                                }
                                if (var14_17 instanceof m) {
                                    var1_1 = new IllegalStateException("Recursive update");
                                    throw var1_1;
                                }
                                var3_10 = var4_9;
                                var11_16 = var12_8;
                            }
lbl83:
                            // 3 sources

                            while (true) {
                                var5_11 = false;
lbl85:
                                // 2 sources

                                // MONITOREXIT : var14_17
                                break block30;
                                break;
                            }
lbl87:
                            // 1 sources

                            var13_7 = this.e();
                            continue;
                        }
lbl90:
                        // 2 sources

                        while (true) {
                            if (var11_16.a != var7_6 || (var12_8 = var11_16.b) != var1_1 && (var12_8 == null || !var1_1.equals(var12_8))) break block31;
                            break;
                        }
                        var11_16 = var11_16.c;
                        ** GOTO lbl83
                    }
                    var12_8 = var11_16.d;
                    if (var12_8 == null) {
                        var12_8 = var2_5.apply(var1_1);
                        if (var12_8 != null) {
                            if (var11_16.d != null) {
                                var1_1 = new IllegalStateException("Recursive update");
                                throw var1_1;
                            }
                            var15_18 /* !! */  = new l(var7_6, var1_1, var12_8);
                            var11_16.d = var15_18 /* !! */ ;
                            var11_16 = var12_8;
                            break block30;
                        } else {
                            var11_16 = var12_8;
                            ** continue;
                        }
                    }
                    ++var3_10;
                    var11_16 = var12_8;
                    ** continue;
                }
                var4_9 = var3_10;
                var12_8 = var11_16;
                if (var3_10 != 0) break;
            }
            if (var3_10 >= 8) {
                this.n(var13_7, var8_13);
            }
            var1_1 = var11_16;
            if (!var5_11) {
                return var11_16;
            }
        }
        if (var1_1 == null) return var1_1;
        this.a(1L, var3_10);
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object computeIfPresent(Object var1_1, BiFunction var2_3) {
        block26: {
            if (var1_1 == null) throw null;
            if (var2_3 == null) throw null;
            var7_4 = ConcurrentHashMap.i(var1_1.hashCode());
            var12_5 = this.a;
            var3_6 = 0;
            var10_7 /* !! */  = null;
            var6_8 = 0;
            while (true) {
                block27: {
                    block28: {
                        block29: {
                            if (var12_5 == null || (var4_9 = var12_5.length) == 0) ** GOTO lbl58
                            var8_11 = var4_9 - 1 & var7_4;
                            var14_15 = ConcurrentHashMap.k(var12_5, var8_11);
                            if (var14_15 == null) {
                                var5_10 = var6_8;
                                break block26;
                            }
                            var9_12 = var14_15.a;
                            if (var9_12 == -1) {
                                var12_5 = this.d(var12_5, var14_15);
                                continue;
                            }
                            // MONITORENTER : var14_15
                            var4_9 = var3_6;
                            var5_10 = var6_8;
                            var11_13 = var10_7 /* !! */ ;
                            if (ConcurrentHashMap.k(var12_5, var8_11) != var14_15) break block27;
                            if (var9_12 >= 0) {
                                var5_10 = 1;
                                var13_14 = null;
                                var11_13 = var14_15;
                                break block29;
                            } else {
                                if (var14_15 instanceof r) {
                                    var13_14 = (r)var14_15;
                                    var15_16 = var13_14.e;
                                    var4_9 = var3_6;
                                    var11_13 = var10_7 /* !! */ ;
                                    if (var15_16 != null) {
                                        var15_16 = var15_16.b(var7_4, var1_1, null);
                                        var4_9 = var3_6;
                                        var11_13 = var10_7 /* !! */ ;
                                        if (var15_16 != null) {
                                            var11_13 = var2_3.apply(var1_1, var15_16.c);
                                            if (var11_13 != null) {
                                                var15_16.c = var11_13;
                                                var4_9 = var3_6;
                                            } else {
                                                if (var13_14.f((s)var15_16)) {
                                                    ConcurrentHashMap.h(var12_5, var8_11, ConcurrentHashMap.p(var13_14.f));
                                                }
                                                var4_9 = -1;
                                            }
                                        }
                                    }
                                    var5_10 = 2;
                                } else {
                                    if (var14_15 instanceof m) {
                                        var1_1 = new IllegalStateException("Recursive update");
                                        throw var1_1;
                                    }
                                    var4_9 = var3_6;
                                    var5_10 = var6_8;
                                    var11_13 = var10_7 /* !! */ ;
                                }
                                // MONITOREXIT : var14_15
                                break block27;
                            }
lbl58:
                            // 1 sources

                            var12_5 = this.e();
                            continue;
                        }
lbl61:
                        // 2 sources

                        while (true) {
                            if (var11_13.a != var7_4 || (var15_16 = var11_13.b) != var1_1 && (var15_16 == null || !var1_1.equals(var15_16))) break block28;
                            break;
                        }
                        var10_7 /* !! */  = var2_3.apply(var1_1, var11_13.c);
                        if (var10_7 /* !! */  != null) {
                            var11_13.c = var10_7 /* !! */ ;
                            var4_9 = var3_6;
                            var11_13 = var10_7 /* !! */ ;
                            break block27;
                        } else {
                            var11_13 = var11_13.d;
                            if (var13_14 != null) {
                                var13_14.d = var11_13;
                            } else {
                                ConcurrentHashMap.h(var12_5, var8_11, (l)var11_13);
                            }
                            var4_9 = -1;
                            var11_13 = var10_7 /* !! */ ;
                        }
                        break block27;
                    }
                    var15_16 = var11_13.d;
                    if (var15_16 == null) {
                        var4_9 = var3_6;
                        var11_13 = var10_7 /* !! */ ;
                    } else {
                        ++var5_10;
                        var13_14 = var11_13;
                        var11_13 = var15_16;
                        ** continue;
                    }
                }
                var3_6 = var4_9;
                var6_8 = var5_10;
                var10_7 /* !! */  = var11_13;
                if (var5_10 != 0) break;
            }
            var10_7 /* !! */  = var11_13;
            var3_6 = var4_9;
        }
        if (var3_6 == 0) return var10_7 /* !! */ ;
        this.a(var3_6, var5_10);
        return var10_7 /* !! */ ;
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl2 = this.get(object) != null;
        return bl2;
    }

    @Override
    public final boolean containsValue(Object object) {
        object.getClass();
        Object object2 = this.a;
        if (object2 != null) {
            Object object3;
            object2 = new q((l[])object2, ((l[])object2).length, 0, ((l[])object2).length);
            while ((object3 = ((q)object2).c()) != null) {
                object3 = ((l)object3).c;
                if (object3 != object && (object3 == null || !object.equals(object3))) continue;
                return true;
            }
        }
        return false;
    }

    final l[] d(l[] lArray, l lArray2) {
        if (lArray2 instanceof g) {
            int n2;
            lArray2 = ((g)lArray2).e;
            int n3 = Integer.numberOfLeadingZeros(lArray.length) | 0x8000;
            while (lArray2 == this.b && this.a == lArray && (n2 = this.sizeCtl) < 0 && n2 >>> 16 == n3 && n2 != n3 + 1 && n2 != 65535 + n3 && this.transferIndex > 0) {
                if (!h.c(this, i, n2, n2 + 1)) continue;
                this.m(lArray, lArray2);
                break;
            }
            return lArray2;
        }
        return this.a;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        b b2 = this.f;
        if (b2 != null) {
            return b2;
        }
        this.f = b2 = new b(this);
        return b2;
    }

    @Override
    public final boolean equals(Object iterator) {
        if (iterator != this) {
            l l2;
            if (!(iterator instanceof Map)) {
                return false;
            }
            iterator = (Map)((Object)iterator);
            l[] object2 = this.a;
            int n2 = object2 == null ? 0 : object2.length;
            q q2 = new q(object2, n2, 0, n2);
            while ((l2 = q2.c()) != null) {
                Object object = l2.c;
                l2 = iterator.get(l2.b);
                if (l2 != null && (l2 == object || ((Object)l2).equals(object))) continue;
                return false;
            }
            for (Map.Entry entry : iterator.entrySet()) {
                Object v2;
                q2 = entry.getKey();
                if (q2 != null && (v2 = entry.getValue()) != null && (q2 = this.get(q2)) != null && (v2 == q2 || v2.equals(q2))) continue;
                return false;
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final Object f(Object var1_1, Object var2_3, boolean var3_4) {
        block22: {
            block20: {
                if (var1_1 == null) throw null;
                if (var2_3 == null) throw null;
                var6_5 = ConcurrentHashMap.i(var1_1.hashCode());
                var9_6 = this.a;
                var5_7 = 0;
                while (true) {
                    block21: {
                        block25: {
                            block23: {
                                block26: {
                                    block24: {
                                        if (var9_6 == null || (var4_8 = var9_6.length) == 0) ** GOTO lbl49
                                        var7_9 = var4_8 - 1 & var6_5;
                                        var12_13 = ConcurrentHashMap.k(var9_6, var7_9);
                                        if (var12_13 == null) {
                                            if (!ConcurrentHashMap.b(var9_6, var7_9, new l(var6_5, var1_1, var2_3))) continue;
                                            var4_8 = var5_7;
                                            break block20;
                                        }
                                        var8_10 = var12_13.a;
                                        if (var8_10 == -1) {
                                            var9_6 = this.d(var9_6, var12_13);
                                            continue;
                                        }
                                        if (var3_4 && var8_10 == var6_5 && ((var10_11 = var12_13.b) == var1_1 || var10_11 != null && var1_1.equals(var10_11)) && (var10_11 = var12_13.c) != null) {
                                            return var10_11;
                                        }
                                        // MONITORENTER : var12_13
                                        var4_8 = var5_7;
                                        if (ConcurrentHashMap.k(var9_6, var7_9) != var12_13) break block23;
                                        if (var8_10 < 0) break block24;
                                        var5_7 = 1;
                                        var11_12 = var12_13;
                                        break block25;
                                    }
                                    if (!(var12_13 instanceof r)) break block26;
                                    var11_12 = ((r)var12_13).e(var6_5, var1_1, var2_3);
                                    if (var11_12 != null) {
                                        var10_11 = var11_12.c;
                                        if (!var3_4) {
                                            var11_12.c = var2_3;
                                        }
                                    } else {
                                        var10_11 = null;
                                    }
                                    var4_8 = 2;
                                    ** GOTO lbl47
                                }
                                if (var12_13 instanceof m) {
                                    var1_1 = new IllegalStateException("Recursive update");
                                    throw var1_1;
                                }
                                var4_8 = var5_7;
                            }
lbl45:
                            // 2 sources

                            while (true) {
                                var10_11 = null;
lbl47:
                                // 2 sources

                                // MONITOREXIT : var12_13
                                break block21;
                                break;
                            }
lbl49:
                            // 1 sources

                            var9_6 = this.e();
                            continue;
                        }
lbl52:
                        // 2 sources

                        while (true) {
                            if (var11_12.a != var6_5 || (var10_11 = var11_12.b) != var1_1 && (var10_11 == null || !var1_1.equals(var10_11))) break block22;
                            break;
                        }
                        var13_14 = var11_12.c;
                        var4_8 = var5_7;
                        var10_11 = var13_14;
                        if (!var3_4) {
                            var11_12.c = var2_3;
                            var4_8 = var5_7;
                            var10_11 = var13_14;
                        }
                    }
                    var5_7 = var4_8;
                    if (var4_8 != 0) break;
                }
                if (var4_8 >= 8) {
                    this.n(var9_6, var7_9);
                }
                if (var10_11 != null) {
                    return var10_11;
                }
            }
            this.a(1L, var4_8);
            return null;
        }
        var10_11 = var11_12.d;
        if (var10_11 == null) {
            var11_12.d = var10_11 = new l(var6_5, var1_1, var2_3);
            var4_8 = var5_7;
            ** continue;
        }
        ++var5_7;
        var11_12 = var10_11;
        ** while (true)
    }

    @Override
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        Object object = this.a;
        if (object != null) {
            l l2;
            object = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while ((l2 = ((q)object).c()) != null) {
                biConsumer.accept(l2.b, l2.c);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Object g(Object var1_1, Object var2_3, Object var3_4) {
        block24: {
            var7_5 = ConcurrentHashMap.i(var1_1.hashCode());
            var10_6 = this.a;
            while (var10_6 != null) {
                var4_7 = var10_6.length;
                if (var4_7 == 0) return null;
                var8_10 = var4_7 - 1 & var7_5;
                var12_13 = ConcurrentHashMap.k(var10_6, var8_10);
                if (var12_13 == null) {
                    return null;
                }
                var4_7 = var12_13.a;
                if (var4_7 == -1) {
                    var10_6 = this.d(var10_6, var12_13);
                    continue;
                }
                synchronized (var12_13) {
                    block22: {
                        block21: {
                            block23: {
                                try {
                                    block26: {
                                        block25: {
                                            if (ConcurrentHashMap.k(var10_6, var8_10) != var12_13) ** GOTO lbl54
                                            var5_8 = 1;
                                            var6_9 = 1;
                                            if (var4_7 < 0) break block25;
                                            var11_12 = null;
                                            var9_11 = var12_13;
                                            break block26;
                                        }
                                        if (!(var12_13 instanceof r)) ** GOTO lbl51
                                        var13_14 = (r)var12_13;
                                        var9_11 = var13_14.e;
                                        var4_7 = var6_9;
                                        if (var9_11 == null) break block21;
                                        var14_15 = var9_11.b(var7_5, var1_1, null);
                                        var4_7 = var6_9;
                                        if (var14_15 == null) break block21;
                                        var11_12 = var14_15.c;
                                        if (var3_4 == null || var3_4 == var11_12) ** GOTO lbl39
                                        var4_7 = var6_9;
                                        if (var11_12 == null) break block21;
                                        var4_7 = var6_9;
                                        if (!var3_4.equals(var11_12)) break block21;
lbl39:
                                        // 2 sources

                                        if (var2_3 != null) {
                                            var14_15.c = var2_3;
                                            var4_7 = var5_8;
                                            var9_11 = var11_12;
                                            break block22;
                                        }
                                        var4_7 = var5_8;
                                        var9_11 = var11_12;
                                        if (var13_14.f(var14_15)) {
                                            ConcurrentHashMap.h(var10_6, var8_10, ConcurrentHashMap.p(var13_14.f));
                                            var4_7 = var5_8;
                                            var9_11 = var11_12;
                                        }
                                        break block22;
lbl51:
                                        // 1 sources

                                        if (var12_13 instanceof m) {
                                            var1_1 = new IllegalStateException("Recursive update");
                                            throw var1_1;
                                        }
lbl54:
                                        // 3 sources

                                        var4_7 = 0;
                                        break block21;
                                    }
lbl57:
                                    // 2 sources

                                    while (true) {
                                        if (var9_11.a != var7_5 || (var13_14 = var9_11.b) != var1_1 && (var13_14 == null || !var1_1.equals(var13_14))) break block23;
                                        var13_14 = var9_11.c;
                                        if (var3_4 != null && var3_4 != var13_14) {
                                            var4_7 = var6_9;
                                            if (var13_14 == null) break block21;
                                            var4_7 = var6_9;
                                            if (!var3_4.equals(var13_14)) break block21;
                                        }
                                        if (var2_3 != null) {
                                            var9_11.c = var2_3;
                                            var4_7 = var5_8;
                                            var9_11 = var13_14;
                                            break block22;
                                        }
                                        if (var11_12 != null) {
                                            var11_12.d = var9_11.d;
                                            var4_7 = var5_8;
                                            var9_11 = var13_14;
                                            break block22;
                                        } else {
                                            ConcurrentHashMap.h(var10_6, var8_10, var9_11.d);
                                            var4_7 = var5_8;
                                            var9_11 = var13_14;
                                        }
                                        break block22;
                                        break;
                                    }
                                }
                                catch (Throwable var1_2) {}
                                throw var1_2;
                            }
                            var13_14 = var9_11.d;
                            if (var13_14 == null) {
                                var4_7 = var6_9;
                            } else {
                                var11_12 = var9_11;
                                var9_11 = var13_14;
                                ** continue;
                            }
                        }
                        var9_11 = null;
                    }
                    ** if (var4_7 != 0) goto lbl94
                }
lbl-1000:
                // 1 sources

                {
                    continue;
                }
lbl94:
                // 1 sources

                break block24;
            }
            return null;
        }
        if (var9_11 == null) return null;
        if (var2_3 != null) return var9_11;
        this.a(-1L, -1);
        return var9_11;
    }

    @Override
    public V get(Object object) {
        block6: {
            Object object2;
            Object object3;
            Object object4;
            int n2;
            block9: {
                int n3;
                block7: {
                    block8: {
                        n2 = ConcurrentHashMap.i(object.hashCode());
                        object4 = this.a;
                        object3 = null;
                        if (object4 == null || (n3 = ((l[])object4).length) <= 0 || (object2 = ConcurrentHashMap.k(object4, n3 - 1 & n2)) == null) break block6;
                        n3 = ((l)object2).a;
                        if (n3 != n2) break block7;
                        object3 = ((l)object2).b;
                        if (object3 == object) break block8;
                        object4 = object2;
                        if (object3 == null) break block9;
                        object4 = object2;
                        if (!object.equals(object3)) break block9;
                    }
                    return (V)((l)object2).c;
                }
                object4 = object2;
                if (n3 < 0) {
                    object4 = ((l)object2).a(n2, object);
                    object = object3;
                    if (object4 != null) {
                        object = object4.c;
                    }
                    return (V)object;
                }
            }
            while ((object3 = object4.d) != null) {
                object4 = object3;
                if (((l)object3).a != n2) continue;
                object2 = ((l)object3).b;
                if (object2 != object) {
                    object4 = object3;
                    if (object2 == null) continue;
                    object4 = object3;
                    if (!object.equals(object2)) continue;
                }
                return (V)((l)object3).c;
            }
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            object2 = object;
        }
        return object2;
    }

    @Override
    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = 0;
        if (object != null) {
            q q2 = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while (true) {
                object = q2.c();
                n2 = n3;
                if (object == null) break;
                n2 = object.b.hashCode();
                n3 += object.c.hashCode() ^ n2;
            }
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        boolean bl2 = this.j() <= 0L;
        return bl2;
    }

    final long j() {
        long l2;
        c[] cArray = this.c;
        long l3 = l2 = this.baseCount;
        if (cArray != null) {
            int n2 = cArray.length;
            int n3 = 0;
            while (true) {
                l3 = l2;
                if (n3 >= n2) break;
                c c2 = cArray[n3];
                l3 = l2;
                if (c2 != null) {
                    l3 = l2 + c2.value;
                }
                ++n3;
                l2 = l3;
            }
        }
        return l3;
    }

    @Override
    public Set<K> keySet() {
        b b2 = this.d;
        if (b2 != null) {
            return b2;
        }
        this.d = b2 = new b(this);
        return b2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object merge(Object var1_1, Object var2_3, BiFunction var3_4) {
        block28: {
            var11_5 = var2_3;
            if (var1_1 == null) throw null;
            if (var11_5 == null) throw null;
            if (var3_4 == null) throw null;
            var8_6 = ConcurrentHashMap.i(var1_1.hashCode());
            var12_7 = this.a;
            var7_8 = 0;
            var13_9 = null;
            var6_10 = 0;
            while (true) {
                block29: {
                    block31: {
                        block32: {
                            if (var12_7 == null || (var4_11 = var12_7.length) == 0) ** GOTO lbl64
                            var9_13 = var4_11 - 1 & var8_6;
                            var15_16 = ConcurrentHashMap.k(var12_7, var9_13);
                            var4_11 = 1;
                            if (var15_16 == null) {
                                if (!ConcurrentHashMap.b(var12_7, var9_13, new l(var8_6, var1_1, var11_5))) continue;
                                var5_12 = var7_8;
                                break block28;
                            }
                            var10_14 = var15_16.a;
                            if (var10_14 == -1) {
                                var12_7 = this.d(var12_7, var15_16);
                                continue;
                            }
                            // MONITORENTER : var15_16
                            var5_12 = var7_8;
                            var4_11 = var6_10;
                            var2_3 = var13_9;
                            if (ConcurrentHashMap.k(var12_7, var9_13) != var15_16) break block29;
                            if (var10_14 >= 0) {
                                var13_9 = null;
                                var2_3 = var15_16;
                                var5_12 = 1;
                                break block32;
                            } else {
                                if (var15_16 instanceof r) {
                                    var14_15 = (r)var15_16;
                                    var2_3 = var14_15.e;
                                    var13_9 = var2_3 == null ? null : var2_3.b(var8_6, var1_1, null);
                                    var2_3 = var13_9 == null ? var11_5 : var3_4.apply(var13_9.c, var11_5);
                                    if (var2_3 != null) {
                                        if (var13_9 != null) {
                                            var13_9.c = var2_3;
                                            var4_11 = var6_10;
                                        } else {
                                            var14_15.e(var8_6, var1_1, var2_3);
                                            var4_11 = 1;
                                        }
                                    } else {
                                        var4_11 = var6_10;
                                        if (var13_9 != null) {
                                            if (var14_15.f((s)var13_9)) {
                                                ConcurrentHashMap.h(var12_7, var9_13, ConcurrentHashMap.p(var14_15.f));
                                            }
                                            var4_11 = -1;
                                        }
                                    }
                                    var5_12 = 2;
                                } else {
                                    if (var15_16 instanceof m) {
                                        var1_1 = new IllegalStateException("Recursive update");
                                        throw var1_1;
                                    }
                                    var5_12 = var7_8;
                                    var4_11 = var6_10;
                                    var2_3 = var13_9;
                                }
                                // MONITOREXIT : var15_16
                                break block29;
                            }
lbl64:
                            // 1 sources

                            var12_7 = this.e();
                            continue;
                        }
lbl67:
                        // 2 sources

                        while (true) {
                            if (var2_3.a != var8_6 || (var14_15 = var2_3.b) != var1_1 && (var14_15 == null || !var1_1.equals(var14_15))) break block31;
                            break;
                        }
                        var14_15 = var3_4.apply(var2_3.c, var11_5);
                        if (var14_15 != null) {
                            var2_3.c = var14_15;
                            var2_3 = var14_15;
                            var4_11 = var6_10;
                            break block29;
                        } else {
                            var2_3 = var2_3.d;
                            if (var13_9 != null) {
                                var13_9.d = var2_3;
                            } else {
                                ConcurrentHashMap.h(var12_7, var9_13, (l)var2_3);
                            }
                            var2_3 = var14_15;
                            var4_11 = -1;
                        }
                        break block29;
                    }
                    var14_15 = var2_3.d;
                    if (var14_15 == null) {
                        var2_3.d = var13_9 = new l(var8_6, var1_1, var11_5);
                        var2_3 = var11_5;
                        var4_11 = 1;
                    } else {
                        ++var5_12;
                        var13_9 = var2_3;
                        var2_3 = var14_15;
                        ** continue;
                    }
                }
                var7_8 = var5_12;
                var6_10 = var4_11;
                var13_9 = var2_3;
                if (var5_12 != 0) break;
            }
            if (var5_12 >= 8) {
                this.n(var12_7, var9_13);
            }
            var11_5 = var2_3;
        }
        if (var4_11 == 0) return var11_5;
        this.a(var4_11, var5_12);
        return var11_5;
    }

    @Override
    public V put(K k2, V v2) {
        return (V)this.f(k2, v2, false);
    }

    @Override
    public final void putAll(Map object2) {
        this.o(object2.size());
        for (Map.Entry entry : object2.entrySet()) {
            this.f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override
    public V putIfAbsent(K k2, V v2) {
        return (V)this.f(k2, v2, true);
    }

    @Override
    public V remove(Object object) {
        return (V)this.g(object, null, null);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        object.getClass();
        boolean bl2 = object2 != null && this.g(object, null, object2) != null;
        return bl2;
    }

    @Override
    public final Object replace(Object object, Object object2) {
        if (object != null && object2 != null) {
            return this.g(object, object2, null);
        }
        throw null;
    }

    @Override
    public final boolean replace(Object object, Object object2, Object object3) {
        if (object != null && object2 != null && object3 != null) {
            boolean bl2 = this.g(object, object3, object2) != null;
            return bl2;
        }
        throw null;
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        Object object = this.a;
        if (object != null) {
            l l2;
            q q2 = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            block0: while ((l2 = q2.c()) != null) {
                object = l2.c;
                Object object2 = l2.b;
                do {
                    l2 = biFunction.apply(object2, object);
                    l2.getClass();
                    if (this.g(object2, l2, object) != null) continue block0;
                    l2 = this.get(object2);
                    object = l2;
                } while (l2 != null);
            }
        }
    }

    @Override
    public final int size() {
        long l2 = this.j();
        int n2 = l2 < 0L ? 0 : (l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2);
        return n2;
    }

    @Override
    public final String toString() {
        Object object = this.a;
        int n2 = object == null ? 0 : ((l[])object).length;
        q q2 = new q((l[])object, n2, 0, n2);
        StringBuilder stringBuilder = new StringBuilder("{");
        object = q2.c();
        if (object != null) {
            while (true) {
                Object object2 = object.b;
                Object object3 = object.c;
                object = object2;
                if (object2 == this) {
                    object = "(this Map)";
                }
                stringBuilder.append(object);
                stringBuilder.append('=');
                object = object3;
                if (object3 == this) {
                    object = "(this Map)";
                }
                stringBuilder.append(object);
                object = q2.c();
                if (object == null) break;
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public Collection<V> values() {
        b b2 = this.e;
        if (b2 != null) {
            return b2;
        }
        this.e = b2 = new b(this);
        return b2;
    }
}

