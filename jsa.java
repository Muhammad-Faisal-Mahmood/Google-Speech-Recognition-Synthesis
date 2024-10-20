/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class jsa {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection objectArray) {
        block9: {
            int n2 = objectArray.size();
            if (n2 == 0) {
                objectArray = a;
            } else {
                Iterator iterator = objectArray.iterator();
                if (!iterator.hasNext()) {
                    objectArray = a;
                } else {
                    int n3;
                    objectArray = new Object[n2];
                    n2 = 0;
                    while (true) {
                        objectArray[n2] = iterator.next();
                        n3 = n2 + 1;
                        if (n3 >= objectArray.length) {
                            if (iterator.hasNext()) {
                                int n4;
                                n2 = n4 = n3 * 3 + 1 >>> 1;
                                if (n4 <= n3) {
                                    n2 = 0x7FFFFFFD;
                                    if (n3 >= 0x7FFFFFFD) {
                                        throw new OutOfMemoryError();
                                    }
                                }
                                objectArray = Arrays.copyOf(objectArray, n2);
                                jse.d(objectArray, "copyOf(...)");
                                n2 = n3;
                                continue;
                            }
                            break block9;
                        }
                        n2 = n3;
                        if (!iterator.hasNext()) break;
                    }
                    objectArray = Arrays.copyOf(objectArray, n3);
                    jse.d(objectArray, "copyOf(...)");
                }
            }
        }
        return objectArray;
    }

    public static final Object[] b(Collection object, Object[] objectArray) {
        block12: {
            Iterator iterator;
            int n2;
            int n3;
            block15: {
                block14: {
                    block13: {
                        objectArray.getClass();
                        n3 = object.size();
                        n2 = 0;
                        if (n3 != 0) break block13;
                        object = objectArray;
                        if (objectArray.length <= 0) break block12;
                        break block14;
                    }
                    iterator = object.iterator();
                    if (iterator.hasNext()) break block15;
                    object = objectArray;
                    if (objectArray.length <= 0) break block12;
                }
                objectArray[0] = null;
                return objectArray;
            }
            if (n3 <= objectArray.length) {
                object = objectArray;
            } else {
                object = Array.newInstance(objectArray.getClass().getComponentType(), n3);
                jse.c(object, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            while (true) {
                object[n2] = iterator.next();
                n3 = n2 + 1;
                if (n3 >= ((Object[])object).length) {
                    if (iterator.hasNext()) {
                        int n4;
                        n2 = n4 = n3 * 3 + 1 >>> 1;
                        if (n4 <= n3) {
                            n2 = 0x7FFFFFFD;
                            if (n3 >= 0x7FFFFFFD) {
                                throw new OutOfMemoryError();
                            }
                        }
                        object = Arrays.copyOf(object, n2);
                        jse.d(object, "copyOf(...)");
                        n2 = n3;
                        continue;
                    }
                    break block12;
                }
                n2 = n3;
                if (!iterator.hasNext()) break;
            }
            if (object == objectArray) {
                objectArray[n3] = null;
                object = objectArray;
            } else {
                object = Arrays.copyOf(object, n3);
                jse.d(object, "copyOf(...)");
            }
        }
        return object;
    }
}

