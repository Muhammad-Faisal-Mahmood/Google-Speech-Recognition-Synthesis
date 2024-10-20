/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;

public final class hyo {
    public static final hyo a = new hyo();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final hxz c = new hxz();

    private hyo() {
    }

    public final hyu a(Class object) {
        Object object2;
        block54: {
            Object object3;
            block57: {
                Object object4;
                block56: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    block55: {
                        object4 = "messageType";
                        a.r(object, "messageType");
                        object2 = (hyu)this.b.get(object);
                        if (object2 != null) break block54;
                        object3 = this.c;
                        object2 = hyv.a;
                        hwv.class.isAssignableFrom((Class<?>)object);
                        object3 = ((hxz)object3).a.a((Class)object);
                        if (!object3.b()) break block55;
                        object4 = hyv.a;
                        object2 = hwk.a;
                        object2 = new hyj((hzd)object4, object3.a());
                        object4 = "messageType";
                        break block56;
                    }
                    int n10 = hyl.a;
                    n10 = hxv.a;
                    hzd hzd2 = hyv.a;
                    object2 = object3.c() - 1 != 1 ? hwk.a : null;
                    boolean bl2 = object3 instanceof hyq;
                    n10 = hyb.a;
                    Object object5 = hyi.a;
                    if (!bl2) break block57;
                    object5 = (hyq)object3;
                    Object object6 = ((hyq)object5).b;
                    int n11 = ((String)object6).length();
                    int n12 = 0;
                    if (((String)object6).charAt(0) >= '\ud800') {
                        n10 = 1;
                        while (true) {
                            n8 = n9 = n10 + 1;
                            if (((String)object6).charAt(n10) >= '\ud800') {
                                n10 = n9;
                                continue;
                            }
                            break;
                        }
                    } else {
                        n8 = 1;
                    }
                    n10 = n8 + 1;
                    int n13 = ((String)object6).charAt(n8);
                    n8 = n10;
                    n9 = n13;
                    if (n13 >= 55296) {
                        n9 = n13 & 0x1FFF;
                        n8 = 13;
                        n13 = n10;
                        while (true) {
                            n10 = n13 + 1;
                            if ((n13 = (int)((String)object6).charAt(n13)) < 55296) break;
                            n9 |= (n13 & 0x1FFF) << n8;
                            n8 += 13;
                            n13 = n10;
                        }
                        n9 |= n13 << n8;
                        n8 = n10;
                    }
                    if (n9 == 0) {
                        object3 = hyi.a;
                        n13 = 0;
                        n5 = n9 = (n10 = (n7 = (n6 = 0)));
                    } else {
                        n10 = n8 + 1;
                        n9 = n13 = (int)((String)object6).charAt(n8);
                        n8 = n10;
                        if (n13 >= 55296) {
                            n9 = n13 & 0x1FFF;
                            n8 = 13;
                            n13 = n10;
                            while (true) {
                                n10 = n13 + 1;
                                if ((n13 = (int)((String)object6).charAt(n13)) < 55296) break;
                                n9 |= (n13 & 0x1FFF) << n8;
                                n8 += 13;
                                n13 = n10;
                            }
                            n9 |= n13 << n8;
                            n8 = n10;
                        }
                        n10 = n8 + 1;
                        n4 = n8 = (int)((String)object6).charAt(n8);
                        n13 = n10;
                        if (n8 >= 55296) {
                            n13 = n8 & 0x1FFF;
                            n8 = 13;
                            n7 = n10;
                            while (true) {
                                n10 = n7 + 1;
                                if ((n7 = (int)((String)object6).charAt(n7)) < 55296) break;
                                n13 |= (n7 & 0x1FFF) << n8;
                                n8 += 13;
                                n7 = n10;
                            }
                            n4 = n13 | n7 << n8;
                            n13 = n10;
                        }
                        n8 = n13 + 1;
                        n10 = n7 = (int)((String)object6).charAt(n13);
                        n13 = n8;
                        if (n7 >= 55296) {
                            n13 = n7 & 0x1FFF;
                            n10 = 13;
                            n7 = n8;
                            while (true) {
                                n8 = n7 + 1;
                                if ((n7 = (int)((String)object6).charAt(n7)) < 55296) break;
                                n13 |= (n7 & 0x1FFF) << n10;
                                n10 += 13;
                                n7 = n8;
                            }
                            n10 = n13 | n7 << n10;
                            n13 = n8;
                        }
                        n6 = n13 + 1;
                        if ((n13 = (int)((String)object6).charAt(n13)) >= 55296) {
                            n7 = n13 & 0x1FFF;
                            n8 = 13;
                            while (true) {
                                n13 = n6 + 1;
                                if ((n6 = (int)((String)object6).charAt(n6)) < 55296) break;
                                n7 |= (n6 & 0x1FFF) << n8;
                                n8 += 13;
                                n6 = n13;
                            }
                            n8 = n7 | n6 << n8;
                            n7 = n13;
                            n13 = n8;
                        } else {
                            n7 = n6;
                        }
                        n8 = n7 + 1;
                        n6 = ((String)object6).charAt(n7);
                        if (n6 >= 55296) {
                            n6 &= 0x1FFF;
                            n7 = 13;
                            n12 = n8;
                            while (true) {
                                n8 = n12 + 1;
                                if ((n12 = (int)((String)object6).charAt(n12)) < 55296) break;
                                n6 |= (n12 & 0x1FFF) << n7;
                                n7 += 13;
                                n12 = n8;
                            }
                            n6 |= n12 << n7;
                            n7 = n8;
                            n8 = n6;
                        } else {
                            n7 = n8;
                            n8 = n6;
                        }
                        n3 = n7 + 1;
                        n7 = ((String)object6).charAt(n7);
                        if (n7 >= 55296) {
                            n12 = n7 & 0x1FFF;
                            n7 = 13;
                            while (true) {
                                n6 = n3 + 1;
                                if ((n3 = (int)((String)object6).charAt(n3)) < 55296) break;
                                n12 |= (n3 & 0x1FFF) << n7;
                                n7 += 13;
                                n3 = n6;
                            }
                            n7 = n12 | n3 << n7;
                            n12 = n6;
                        } else {
                            n12 = n3;
                        }
                        n6 = n12 + 1;
                        n3 = ((String)object6).charAt(n12);
                        if (n3 >= 55296) {
                            n12 = n3 & 0x1FFF;
                            n5 = n6;
                            n6 = 13;
                            while (true) {
                                n3 = n5 + 1;
                                if ((n5 = (int)((String)object6).charAt(n5)) < 55296) break;
                                n12 |= (n5 & 0x1FFF) << n6;
                                n6 += 13;
                                n5 = n3;
                            }
                            n12 |= n5 << n6;
                            n6 = n3;
                            n3 = n12;
                        }
                        n5 = ((String)object6).charAt(n6);
                        n12 = n6 + 1;
                        if (n5 >= 55296) {
                            n5 &= 0x1FFF;
                            n6 = 13;
                            n2 = n12;
                            while (true) {
                                n12 = n2 + 1;
                                if ((n2 = (int)((String)object6).charAt(n2)) < 55296) break;
                                n5 |= (n2 & 0x1FFF) << n6;
                                n6 += 13;
                                n2 = n12;
                            }
                            n6 = n5 | n2 << n6;
                        } else {
                            n6 = n5;
                        }
                        n2 = n9 + n9 + n4;
                        object3 = new int[n6 + n7 + n3];
                        n4 = n9;
                        n9 = n6;
                        n3 = n8;
                        n5 = n10;
                        n10 = n13;
                        n6 = n4;
                        n8 = n12;
                        n12 = n3;
                        n13 = n2;
                    }
                    Object[] objectArray = ((hyq)object5).c;
                    n2 = n13;
                    Object object7 = ((hyq)object5).a;
                    Unsafe unsafe = hyi.b;
                    Class<?> clazz = object7.getClass();
                    int n14 = n9 + n7;
                    int[] nArray = new int[n12 * 3];
                    Object[] objectArray2 = new Object[n12 + n12];
                    n7 = n9;
                    n3 = n8;
                    n13 = n14;
                    n4 = 0;
                    n12 = 0;
                    n8 = n2;
                    object7 = object2;
                    n2 = n6;
                    object2 = object6;
                    n6 = n3;
                    while (true) {
                        int n15;
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        int n20;
                        int n21;
                        int n22;
                        block63: {
                            Field field;
                            block70: {
                                block69: {
                                    block64: {
                                        block72: {
                                            block67: {
                                                block65: {
                                                    block71: {
                                                        block68: {
                                                            block66: {
                                                                block58: {
                                                                    block60: {
                                                                        block62: {
                                                                            block59: {
                                                                                block61: {
                                                                                    n22 = n12;
                                                                                    if (n6 >= n11) break;
                                                                                    n21 = n6 + 1;
                                                                                    n12 = ((String)object2).charAt(n6);
                                                                                    if (n12 >= 55296) {
                                                                                        n3 = n12 & 0x1FFF;
                                                                                        n6 = 13;
                                                                                        while (true) {
                                                                                            n12 = n21 + 1;
                                                                                            if ((n21 = (int)((String)object2).charAt(n21)) < 55296) break;
                                                                                            n3 |= (n21 & 0x1FFF) << n6;
                                                                                            n6 += 13;
                                                                                            n21 = n12;
                                                                                        }
                                                                                        n21 = n3 | n21 << n6;
                                                                                        n6 = n12;
                                                                                    } else {
                                                                                        n6 = n21;
                                                                                        n21 = n12;
                                                                                    }
                                                                                    n20 = n6 + 1;
                                                                                    n19 = ((String)object2).charAt(n6);
                                                                                    if (n19 >= 55296) {
                                                                                        n3 = n19 & 0x1FFF;
                                                                                        n12 = 13;
                                                                                        while (true) {
                                                                                            n6 = n20 + 1;
                                                                                            if ((n20 = (int)((String)object2).charAt(n20)) < 55296) break;
                                                                                            n3 |= (n20 & 0x1FFF) << n12;
                                                                                            n12 += 13;
                                                                                            n20 = n6;
                                                                                        }
                                                                                        n19 = n3 | n20 << n12;
                                                                                        n12 = n6;
                                                                                    } else {
                                                                                        n12 = n20;
                                                                                    }
                                                                                    n20 = n4;
                                                                                    if ((n19 & 0x400) != 0) {
                                                                                        object3[n4] = n22;
                                                                                        n20 = n4 + 1;
                                                                                    }
                                                                                    n18 = n19 & 0xFF;
                                                                                    n6 = n19 & 0x800;
                                                                                    if (n18 < 51) break block58;
                                                                                    n4 = n12 + 1;
                                                                                    n17 = ((String)object2).charAt(n12);
                                                                                    if (n17 >= 55296) {
                                                                                        n3 = n17 & 0x1FFF;
                                                                                        n12 = 13;
                                                                                        n17 = n4;
                                                                                        n4 = n3;
                                                                                        while (true) {
                                                                                            n3 = n17 + 1;
                                                                                            if ((n17 = (int)((String)object2).charAt(n17)) < 55296) break;
                                                                                            n4 |= (n17 & 0x1FFF) << n12;
                                                                                            n12 += 13;
                                                                                            n17 = n3;
                                                                                        }
                                                                                        n17 = n4 | n17 << n12;
                                                                                        n12 = n3;
                                                                                    } else {
                                                                                        n12 = n4;
                                                                                    }
                                                                                    n16 = n18 - 51;
                                                                                    if (n16 == 9 || n16 == 17) break block59;
                                                                                    n3 = n6;
                                                                                    n4 = n8;
                                                                                    if (n16 != 12) break block60;
                                                                                    if (((hyq)object5).c() == 1 || n6 != 0) break block61;
                                                                                    n3 = 0;
                                                                                    n4 = n8;
                                                                                    break block60;
                                                                                }
                                                                                n4 = n8 + 1;
                                                                                n3 = n22 / 3;
                                                                                objectArray2[n3 + n3 + 1] = objectArray[n8];
                                                                                n8 = n4;
                                                                                break block62;
                                                                            }
                                                                            n4 = n8 + 1;
                                                                            n3 = n22 / 3;
                                                                            objectArray2[n3 + n3 + 1] = objectArray[n8];
                                                                            n8 = n4;
                                                                        }
                                                                        n4 = n8;
                                                                        n3 = n6;
                                                                    }
                                                                    if ((object6 = objectArray[n8 = n17 + n17]) instanceof Field) {
                                                                        object6 = (Field)object6;
                                                                    } else {
                                                                        objectArray[n8] = object6 = hyi.f(clazz, (String)object6);
                                                                    }
                                                                    n16 = (int)unsafe.objectFieldOffset((Field)object6);
                                                                    object6 = objectArray[++n8];
                                                                    if (object6 instanceof Field) {
                                                                        object6 = (Field)object6;
                                                                    } else {
                                                                        objectArray[n8] = object6 = hyi.f(clazz, (String)object6);
                                                                    }
                                                                    n17 = (int)unsafe.objectFieldOffset((Field)object6);
                                                                    object6 = object2;
                                                                    n8 = 0;
                                                                    n6 = n12;
                                                                    n12 = n8;
                                                                    n15 = n3;
                                                                    n8 = n4;
                                                                    n3 = n13;
                                                                    n13 = n10;
                                                                    break block63;
                                                                }
                                                                n17 = n10;
                                                                n4 = n8 + 1;
                                                                field = hyi.f(clazz, (String)objectArray[n8]);
                                                                if (n18 == 9 || n18 == 17) break block64;
                                                                if (n18 == 27) break block65;
                                                                if (n18 != 49) break block66;
                                                                n10 = n8 + 2;
                                                                break block67;
                                                            }
                                                            if (n18 == 12 || n18 == 30 || n18 == 44) break block68;
                                                            if (n18 != 50) break block69;
                                                            n10 = n8 + 2;
                                                            n3 = n7 + 1;
                                                            object3[n7] = n22;
                                                            n7 = n22 / 3;
                                                            object6 = objectArray[n4];
                                                            n7 += n7;
                                                            objectArray2[n7] = object6;
                                                            if (n6 != 0) {
                                                                n8 += 3;
                                                                objectArray2[n7 + 1] = objectArray[n10];
                                                                n10 = n6;
                                                            } else {
                                                                n8 = n10;
                                                                n10 = 0;
                                                            }
                                                            n7 = n3;
                                                            break block70;
                                                        }
                                                        if (((hyq)object5).c() == 1 || n6 != 0) break block71;
                                                        n10 = 0;
                                                        n8 = n4;
                                                        break block70;
                                                    }
                                                    n10 = n8 + 2;
                                                    n8 = n22 / 3;
                                                    objectArray2[n8 + n8 + 1] = objectArray[n4];
                                                    break block72;
                                                }
                                                n10 = n8 + 2;
                                            }
                                            n8 = n22 / 3;
                                            objectArray2[n8 + n8 + 1] = objectArray[n4];
                                        }
                                        n8 = n10;
                                        n10 = n6;
                                        break block70;
                                    }
                                    n10 = n22 / 3;
                                    objectArray2[n10 + n10 + 1] = field.getType();
                                }
                                n10 = n6;
                                n8 = n4;
                            }
                            n16 = (int)unsafe.objectFieldOffset(field);
                            n4 = 1048575;
                            if ((n19 & 0x1000) != 0 && n18 <= 17) {
                                n4 = n12 + 1;
                                n3 = ((String)object2).charAt(n12);
                                n6 = n4;
                                n12 = n3;
                                if (n3 >= 55296) {
                                    n3 &= 0x1FFF;
                                    n6 = 13;
                                    while (true) {
                                        n12 = n4 + 1;
                                        if ((n4 = (int)((String)object2).charAt(n4)) < 55296) break;
                                        n3 |= (n4 & 0x1FFF) << n6;
                                        n6 += 13;
                                        n4 = n12;
                                    }
                                    n4 = n3 | n4 << n6;
                                    n6 = n12;
                                    n12 = n4;
                                }
                                if ((object6 = objectArray[n4 = n2 + n2 + n12 / 32]) instanceof Field) {
                                    object6 = (Field)object6;
                                } else {
                                    objectArray[n4] = object6 = hyi.f(clazz, (String)object6);
                                }
                                n4 = (int)unsafe.objectFieldOffset((Field)object6);
                                n12 %= 32;
                            } else {
                                n6 = n12;
                                n12 = 0;
                            }
                            object6 = object2;
                            n3 = n13;
                            if (n18 >= 18) {
                                n3 = n13;
                                if (n18 <= 49) {
                                    object3[n13] = n16;
                                    n3 = n13 + 1;
                                }
                            }
                            n13 = n17;
                            n15 = n10;
                            n17 = n4;
                        }
                        nArray[n22] = n21;
                        n10 = (n19 & 0x200) != 0 ? 0x20000000 : 0;
                        n4 = (n19 & 0x100) != 0 ? 0x10000000 : 0;
                        n21 = n15 != 0 ? Integer.MIN_VALUE : 0;
                        nArray[n22 + 1] = n4 | n10 | n21 | n18 << 20 | n16;
                        n21 = n22 + 3;
                        nArray[n22 + 2] = n12 << 20 | n17;
                        n10 = n13;
                        n4 = n20;
                        n12 = n21;
                        n13 = n3;
                    }
                    object2 = new hyi(nArray, objectArray2, n5, n10, ((hyq)object5).a, (int[])object3, n9, n14, hzd2, (idi)object7);
                }
                a.r(object, (String)object4);
                object = (hyu)this.b.putIfAbsent(object, object2);
                if (object != null) {
                    return object;
                }
                break block54;
            }
            object = (hza)object3;
            throw null;
        }
        return object2;
    }

    public final hyu b(Object object) {
        return this.a(object.getClass());
    }
}

