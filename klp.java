/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

public class klp
implements Serializable,
Comparable {
    public static final klp a = new klp(new byte[0]);
    private static final long serialVersionUID = 1L;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public klp(byte[] byArray) {
        jse.e(byArray, "data");
        this.b = byArray;
    }

    public static final klp f(byte ... byArray) {
        jse.e(byArray, "data");
        byArray = Arrays.copyOf(byArray, byArray.length);
        jse.d(byArray, "copyOf(...)");
        return new klp(byArray);
    }

    private final void readObject(ObjectInputStream object) {
        int n2 = ((ObjectInputStream)object).readInt();
        jse.e(object, "<this>");
        if (n2 >= 0) {
            int n3;
            Object object2 = new byte[n2];
            for (int i2 = 0; i2 < n2; i2 += n3) {
                n3 = ((InputStream)object).read((byte[])object2, i2, n2 - i2);
                if (n3 != -1) {
                    continue;
                }
                throw new EOFException();
            }
            object2 = new klp((byte[])object2);
            object = klp.class.getDeclaredField("b");
            ((Field)object).setAccessible(true);
            ((Field)object).set(this, object2.b);
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "byteCount < 0: "));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int n2) {
        return this.b[n2];
    }

    public int b() {
        return this.b.length;
    }

    public final String c() {
        int n2;
        byte[] byArray = klh.a;
        byte[] byArray2 = this.b;
        jse.e(byArray2, "<this>");
        jse.e(byArray, "map");
        int n3 = byArray2.length;
        int n4 = n3 - n3 % 3;
        byte[] byArray3 = new byte[(n3 + 2) / 3 * 4];
        n3 = 0;
        int n5 = 0;
        while ((n2 = n3) < n4) {
            byte by2 = byArray2[n2];
            byte by3 = byArray2[n2 + 1];
            n3 = n2 + 3;
            byte by4 = byArray2[n2 + 2];
            byArray3[n5] = byArray[(by2 & 0xFF) >> 2];
            byArray3[n5 + 1] = byArray[(by2 & 3) << 4 | (by3 & 0xFF) >> 4];
            byArray3[n5 + 2] = byArray[(by3 & 0xF) << 2 | (by4 & 0xFF) >> 6];
            n2 = n5 + 4;
            byArray3[n5 + 3] = byArray[by4 & 0x3F];
            n5 = n2;
        }
        n3 = byArray2.length - n4;
        if (n3 != 1) {
            if (n3 == 2) {
                n3 = byArray2[n2];
                n2 = byArray2[n2 + 1];
                byArray3[n5] = byArray[(n3 & 0xFF) >> 2];
                byArray3[n5 + 1] = byArray[(n3 & 3) << 4 | (n2 & 0xFF) >> 4];
                byArray3[n5 + 2] = byArray[(n2 & 0xF) << 2];
                byArray3[n5 + 3] = 61;
            }
        } else {
            n3 = byArray2[n2];
            byArray3[n5] = byArray[(n3 & 0xFF) >> 2];
            byArray3[n5 + 1] = byArray[(n3 & 3) << 4];
            byArray3[n5 + 2] = 61;
            byArray3[n5 + 3] = 61;
        }
        return kmp.p(byArray3);
    }

    public String d() {
        byte[] byArray = this.b;
        int n2 = byArray.length;
        char[] cArray = new char[n2 + n2];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = byArray[i2];
            cArray[n3] = kmo.a[by2 >> 4 & 0xF];
            cArray[n3 + 1] = kmo.a[by2 & 0xF];
            n3 += 2;
        }
        return new String(cArray);
    }

    public final String e() {
        String string;
        String string2 = string = this.d;
        if (string == null) {
            this.d = string2 = kmp.p(this.j());
        }
        return string2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object != this) {
            byte[] byArray;
            int n2;
            int n3;
            if (object instanceof klp && (n3 = ((klp)(object = (klp)object)).b()) == (n2 = (byArray = this.b).length) && ((klp)object).h(0, byArray, 0, n2)) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public klp g() {
        Object object;
        block3: {
            int n2;
            int n3 = 0;
            while (n3 < (n2 = ((byte[])(object = this.b)).length)) {
                int n4;
                byte by2 = object[n3];
                if (by2 >= 65 && by2 <= 90) {
                    object = Arrays.copyOf(object, n2);
                    jse.d(object, "copyOf(...)");
                    object[n3] = (byte)(by2 + 32);
                    for (n4 = n3 + 1; n4 < ((byte[])object).length; ++n4) {
                        n3 = object[n4];
                        if (n3 < 65 || n3 > 90) continue;
                        object[n4] = (byte)(n3 + 32);
                    }
                    object = new klp((byte[])object);
                    break block3;
                }
                n3 = n4;
            }
            object = this;
        }
        return object;
    }

    public boolean h(int n2, byte[] byArray, int n3, int n4) {
        byte[] byArray2;
        jse.e(byArray, "other");
        return n2 >= 0 && n2 <= (byArray2 = this.b).length - n4 && n3 >= 0 && n3 <= byArray.length - n4 && kmp.y(byArray2, n2, byArray, n3, n4);
    }

    public int hashCode() {
        int n2 = this.c;
        if (n2 != 0) {
            return n2;
        }
        this.c = n2 = Arrays.hashCode(this.b);
        return n2;
    }

    public final boolean i(klp klp2) {
        jse.e(klp2, "prefix");
        return this.l(klp2, klp2.b());
    }

    public byte[] j() {
        return this.b;
    }

    public byte[] k() {
        byte[] byArray = this.b;
        byArray = Arrays.copyOf(byArray, byArray.length);
        jse.d(byArray, "copyOf(...)");
        return byArray;
    }

    public boolean l(klp klp2, int n2) {
        jse.e(klp2, "other");
        return klp2.h(0, this.b, 0, n2);
    }

    public void m(klm klm2, int n2) {
        char[] cArray = kmo.a;
        klm2.C(this.b, 0, n2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        block20: {
            block17: {
                block32: {
                    block34: {
                        block35: {
                            block36: {
                                block39: {
                                    block38: {
                                        block37: {
                                            block33: {
                                                block26: {
                                                    block28: {
                                                        block29: {
                                                            block31: {
                                                                block30: {
                                                                    block27: {
                                                                        block21: {
                                                                            block23: {
                                                                                block25: {
                                                                                    block24: {
                                                                                        block22: {
                                                                                            block18: {
                                                                                                block19: {
                                                                                                    var10_1 /* !! */  = this.b;
                                                                                                    var7_2 = var10_1 /* !! */ .length;
                                                                                                    if (var7_2 != 0) break block19;
                                                                                                    var9_3 = "[size=0]";
                                                                                                    break block20;
                                                                                                }
                                                                                                var9_3 = kmo.a;
                                                                                                var3_4 = 0;
                                                                                                var4_5 = 0;
                                                                                                var2_6 = 0;
                                                                                                block0: while (true) {
                                                                                                    var1_7 = var2_6;
                                                                                                    if (var3_4 >= var7_2) break block17;
                                                                                                    var1_7 = var10_1 /* !! */ [var3_4];
                                                                                                    if (var1_7 < 0) break;
                                                                                                    var5_8 /* !! */  = var4_5 + 1;
                                                                                                    if (var4_5 == 64) {
                                                                                                        var1_7 = var2_6;
                                                                                                        break block17;
                                                                                                    }
                                                                                                    if (var1_7 != 10 && var1_7 != 13 && (var1_7 < 32 || var1_7 >= 127)) break block18;
                                                                                                    var1_7 = var2_6 + 1;
                                                                                                    var6_9 /* !! */  = var3_4 + 1;
                                                                                                    var3_4 = var1_7;
                                                                                                    while (true) {
                                                                                                        var1_7 = var6_9 /* !! */ ;
                                                                                                        var2_6 = var3_4;
                                                                                                        var4_5 = var5_8 /* !! */ ;
                                                                                                        if (var6_9 /* !! */  >= var7_2) break;
                                                                                                        var8_10 /* !! */  = (int)var10_1 /* !! */ [var6_9 /* !! */ ];
                                                                                                        var1_7 = var6_9 /* !! */ ++;
                                                                                                        var2_6 = var3_4;
                                                                                                        var4_5 = var5_8 /* !! */ ;
                                                                                                        if (var8_10 /* !! */  < 0) break;
                                                                                                        var1_7 = var3_4;
                                                                                                        if (var5_8 /* !! */  == 64) break block17;
                                                                                                        if (var8_10 /* !! */  == 10 || var8_10 /* !! */  == 13 || var8_10 /* !! */  >= 32 && var8_10 /* !! */  < 127) {
                                                                                                            ++var3_4;
                                                                                                            ++var5_8 /* !! */ ;
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block18;
                                                                                                        break;
                                                                                                    }
lbl41:
                                                                                                    // 4 sources

                                                                                                    while (true) {
                                                                                                        var3_4 = var1_7;
                                                                                                        continue block0;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (var1_7 >> 5 != -2) break block21;
                                                                                                var5_8 /* !! */  = var3_4 + 1;
                                                                                                if (var7_2 > var5_8 /* !! */ ) break block22;
                                                                                                var1_7 = var2_6;
                                                                                                if (var4_5 == 64) break block17;
                                                                                            }
lbl50:
                                                                                            // 18 sources

                                                                                            while (true) {
                                                                                                var1_7 = -1;
                                                                                                break block17;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (((var5_8 /* !! */  = (int)var10_1 /* !! */ [var5_8 /* !! */ ]) & 192) != 128) break block23;
                                                                                        var6_9 /* !! */  = var1_7 << 6 ^ (var5_8 /* !! */  ^ 3968);
                                                                                        if (var6_9 /* !! */  >= 128) break block24;
                                                                                        var1_7 = var2_6;
                                                                                        if (var4_5 == 64) break block17;
                                                                                        ** GOTO lbl50
                                                                                    }
                                                                                    var5_8 /* !! */  = var4_5 + 1;
                                                                                    var1_7 = var2_6;
                                                                                    if (var4_5 == 64) break block17;
                                                                                    if (var6_9 /* !! */  < 160 || var6_9 /* !! */  == 65533) ** GOTO lbl50
                                                                                    var1_7 = var4_5 = var3_4 + 2;
                                                                                    var3_4 = var5_8 /* !! */ ;
                                                                                    if (var6_9 /* !! */  >= 65536) break block25;
                                                                                    var3_4 = var5_8 /* !! */ ;
                                                                                    var1_7 = var4_5;
lbl71:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var4_5 = 1;
                                                                                        ** GOTO lbl77
                                                                                        break;
                                                                                    }
                                                                                }
lbl75:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var4_5 = 2;
lbl77:
                                                                                    // 2 sources

                                                                                    var2_6 += var4_5;
                                                                                    var4_5 = var3_4;
                                                                                    ** GOTO lbl41
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var1_7 = var2_6;
                                                                            if (var4_5 == 64) break block17;
                                                                            ** GOTO lbl50
                                                                        }
                                                                        if (var1_7 >> 4 != -2) break block26;
                                                                        var6_9 /* !! */  = var3_4 + 2;
                                                                        if (var7_2 > var6_9 /* !! */ ) break block27;
                                                                        var1_7 = var2_6;
                                                                        if (var4_5 == 64) break block17;
                                                                        ** GOTO lbl50
                                                                    }
                                                                    var5_8 /* !! */  = (int)var10_1 /* !! */ [var3_4 + 1];
                                                                    if ((var5_8 /* !! */  & 192) != 128) break block28;
                                                                    if (((var6_9 /* !! */  = (int)var10_1 /* !! */ [var6_9 /* !! */ ]) & 192) != 128) break block29;
                                                                    if ((var6_9 /* !! */  = var6_9 /* !! */  ^ -123008 ^ var5_8 /* !! */  << 6 ^ var1_7 << 12) >= 2048) break block30;
                                                                    var1_7 = var2_6;
                                                                    if (var4_5 == 64) break block17;
                                                                    ** GOTO lbl50
                                                                }
                                                                if (var6_9 /* !! */  < 55296 || var6_9 /* !! */  >= 57344) break block31;
                                                                var1_7 = var2_6;
                                                                if (var4_5 == 64) break block17;
                                                                ** GOTO lbl50
                                                            }
                                                            var5_8 /* !! */  = var4_5 + 1;
                                                            var1_7 = var2_6;
                                                            if (var4_5 == 64) break block17;
                                                            if (var6_9 /* !! */  == 65533) ** GOTO lbl50
                                                            var1_7 = var4_5 = var3_4 + 3;
                                                            var3_4 = var5_8 /* !! */ ;
                                                            ** while (var6_9 /* !! */  >= 65536)
lbl112:
                                                            // 1 sources

                                                            var1_7 = var4_5;
                                                            var3_4 = var5_8 /* !! */ ;
                                                            ** while (true)
                                                        }
                                                        var1_7 = var2_6;
                                                        if (var4_5 == 64) break block17;
                                                        ** GOTO lbl50
                                                    }
                                                    var1_7 = var2_6;
                                                    if (var4_5 == 64) break block17;
                                                    ** GOTO lbl50
                                                }
                                                if (var1_7 >> 3 != -2) break block32;
                                                var8_10 /* !! */  = var3_4 + 3;
                                                if (var7_2 > var8_10 /* !! */ ) break block33;
                                                var1_7 = var2_6;
                                                if (var4_5 == 64) break block17;
                                                ** GOTO lbl50
                                            }
                                            var5_8 /* !! */  = (int)var10_1 /* !! */ [var3_4 + 1];
                                            if ((var5_8 /* !! */  & 192) != 128) break block34;
                                            var6_9 /* !! */  = (int)var10_1 /* !! */ [var3_4 + 2];
                                            if ((var6_9 /* !! */  & 192) != 128) break block35;
                                            if (((var8_10 /* !! */  = (int)var10_1 /* !! */ [var8_10 /* !! */ ]) & 192) != 128) break block36;
                                            if ((var1_7 = var8_10 /* !! */  ^ 3678080 ^ var6_9 /* !! */  << 6 ^ var5_8 /* !! */  << 12 ^ var1_7 << 18) <= 0x10FFFF) break block37;
                                            var1_7 = var2_6;
                                            if (var4_5 == 64) break block17;
                                            ** GOTO lbl50
                                        }
                                        if (var1_7 < 55296 || var1_7 >= 57344) break block38;
                                        var1_7 = var2_6;
                                        if (var4_5 == 64) break block17;
                                        ** GOTO lbl50
                                    }
                                    if (var1_7 >= 65536) break block39;
                                    var1_7 = var2_6;
                                    if (var4_5 == 64) break block17;
                                    ** GOTO lbl50
                                }
                                var5_8 /* !! */  = var4_5 + 1;
                                var1_7 = var2_6;
                                if (var4_5 != 64) {
                                    var2_6 += 2;
                                    var1_7 = var3_4 + 4;
                                    var4_5 = var5_8 /* !! */ ;
                                    ** continue;
                                }
                                break block17;
                            }
                            var1_7 = var2_6;
                            if (var4_5 == 64) break block17;
                            ** GOTO lbl50
                        }
                        var1_7 = var2_6;
                        if (var4_5 == 64) break block17;
                        ** GOTO lbl50
                    }
                    var1_7 = var2_6;
                    if (var4_5 == 64) break block17;
                    ** GOTO lbl50
                }
                var1_7 = var2_6;
                if (var4_5 == 64) ** break;
                ** while (true)
            }
            if (var1_7 == -1) {
                var9_3 = this.b;
                var1_7 = ((Object)var9_3).length;
                if (var1_7 <= 64) {
                    var9_3 = this.d();
                    var10_1 /* !! */  = new StringBuilder("[hex=");
                    var10_1 /* !! */ .append((String)var9_3);
                    var10_1 /* !! */ .append("]");
                    var9_3 = var10_1 /* !! */ .toString();
                } else {
                    var9_3 = new klp(jns.ab((byte[])var9_3, 64)).d();
                    var10_1 /* !! */  = new StringBuilder("[size=");
                    var10_1 /* !! */ .append(var1_7);
                    var10_1 /* !! */ .append(" hex=");
                    var10_1 /* !! */ .append((String)var9_3);
                    var10_1 /* !! */ .append("\u2026]");
                    var9_3 = var10_1 /* !! */ .toString();
                }
            } else {
                var10_1 /* !! */  = (byte[])this.e();
                var9_3 = var10_1 /* !! */ .substring(0, var1_7);
                jse.d(var9_3, "substring(...)");
                var9_3 = jse.T(jse.T(jse.T((String)var9_3, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
                if (var1_7 < var10_1 /* !! */ .length()) {
                    var1_7 = this.b.length;
                    var10_1 /* !! */  = new StringBuilder("[size=");
                    var10_1 /* !! */ .append(var1_7);
                    var10_1 /* !! */ .append(" text=");
                    var10_1 /* !! */ .append((String)var9_3);
                    var10_1 /* !! */ .append("\u2026]");
                    var9_3 = var10_1 /* !! */ .toString();
                } else {
                    var9_3 = a.aj((String)var9_3, "[text=", "]");
                }
            }
        }
        return var9_3;
    }
}

