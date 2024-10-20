/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;

final class ark
extends ars {
    private apt a;
    private arj o;

    private static boolean d(byte[] byArray) {
        return byArray[0] == -1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final long a(aga var1_1) {
        block13: {
            block16: {
                block17: {
                    block15: {
                        block12: {
                            block14: {
                                if (!ark.d(var1_1.a)) break block13;
                                var3_2 = (var1_1.a[2] & 255) >> 4;
                                var5_3 = -1;
                                var2_4 = var3_2;
                                if (var3_2 == 6) break block14;
                                var2_4 = var3_2;
                                if (var3_2 != 7) break block15;
                                var2_4 = 7;
                            }
                            var1_1.w(4);
                            var7_5 = var1_1.a[var1_1.b];
                            for (var3_2 = 7; var3_2 >= 0; --var3_2) {
                                var4_6 = 1 << var3_2;
                                if (((long)var4_6 & var7_5) != 0L) continue;
                                if (var3_2 < 6) {
                                    var7_5 &= (long)(var4_6 - 1);
                                    var3_2 = 7 - var3_2;
                                } else {
                                    if (var3_2 != 7) break;
                                    var3_2 = 1;
                                }
                                break block12;
                            }
                            var3_2 = 0;
                        }
                        if (var3_2 == 0) break block16;
                        for (var4_6 = 1; var4_6 < var3_2; ++var4_6) {
                            var6_7 = var1_1.a[var1_1.b + var4_6];
                            if ((var6_7 & 192) == 128) {
                                var7_5 = var7_5 << 6 | (long)(var6_7 & 63);
                                continue;
                            }
                            throw new NumberFormatException(a.ap(var7_5, "Invalid UTF-8 sequence continuation byte: "));
                        }
                        var1_1.b += var3_2;
                    }
                    switch (var2_4) {
                        default: {
                            var2_4 = var5_3;
                            break block17;
                        }
                        case 8: 
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: 
                        case 14: 
                        case 15: {
                            var2_4 -= 8;
                            var3_2 = 256;
                            ** GOTO lbl51
                        }
                        case 7: {
                            var2_4 = var1_1.k();
                            ** GOTO lbl46
                        }
                        case 6: {
                            var2_4 = var1_1.h();
lbl46:
                            // 2 sources

                            ++var2_4;
                            break block17;
                        }
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            var2_4 -= 2;
                            var3_2 = 576;
lbl51:
                            // 2 sources

                            var2_4 = var3_2 << var2_4;
                            break block17;
                        }
                        case 1: 
                    }
                    var2_4 = 192;
                }
                var1_1.v(0);
                return var2_4;
            }
            throw new NumberFormatException(a.ap(var7_5, "Invalid UTF-8 sequence first byte: "));
        }
        return -1L;
    }

    @Override
    protected final void b(boolean bl2) {
        super.b(bl2);
        if (bl2) {
            this.a = null;
            this.o = null;
        }
    }

    @Override
    protected final boolean c(aga object, long l2, arq object2) {
        Object[] objectArray = ((aga)object).a;
        apt apt2 = this.a;
        if (apt2 == null) {
            int n2;
            apt apt3;
            this.a = apt3 = new apt((byte[])objectArray, 17);
            objectArray = Arrays.copyOfRange(objectArray, 9, ((aga)object).c);
            objectArray[4] = -128;
            object = new adt();
            ((adt)object).a("audio/flac");
            int n3 = n2 = apt3.d;
            if (n2 <= 0) {
                n3 = -1;
            }
            ((adt)object).n = n3;
            ((adt)object).B = apt3.f;
            ((adt)object).C = apt3.e;
            ((adt)object).D = agf.g(apt3.g);
            ((adt)object).p = Collections.singletonList(objectArray);
            ((adt)object).k = null;
            ((arq)object2).a = new adu((adt)object);
            return true;
        }
        int n4 = 0;
        if ((objectArray[0] & 0x7F) == 3) {
            Object[] objectArray2;
            ((aga)object).w(1);
            int n5 = ((aga)object).i();
            long l3 = ((aga)object).b;
            l2 = n5;
            long[] lArray = new long[n5 /= 18];
            objectArray = new long[n5];
            while (true) {
                object2 = lArray;
                objectArray2 = objectArray;
                if (n4 >= n5) break;
                long l4 = ((aga)object).n();
                if (l4 == -1L) {
                    object2 = Arrays.copyOf(lArray, n4);
                    objectArray2 = Arrays.copyOf((long[])objectArray, n4);
                    break;
                }
                lArray[n4] = l4;
                objectArray[n4] = (byte)((aga)object).n();
                ((aga)object).w(2);
                ++n4;
            }
            ((aga)object).w((int)(l3 + l2 - (long)((aga)object).b));
            object = new awg(object2, objectArray2);
            this.a = object2 = new apt(apt2.a, apt2.b, apt2.c, apt2.d, apt2.e, apt2.f, apt2.g, apt2.h, (awg)object, null);
            this.o = new arj((apt)object2, (awg)object);
            return true;
        }
        if (ark.d(objectArray)) {
            object = this.o;
            if (object != null) {
                ((arj)object).a = l2;
                ((arq)object2).b = object;
            }
            abr.i(((arq)object2).a);
            return false;
        }
        return true;
    }
}

