/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class kbd {
    private static final int a;
    private static final kax b;

    static {
        kax kax2;
        a = kbd.c(Throwable.class, -1);
        try {
            kax2 = kbe.a ? kbz.a : kas.a;
        }
        catch (Throwable throwable) {
            kax2 = kbz.a;
        }
        b = kax2;
    }

    public static final Throwable a(Throwable object) {
        if (object instanceof juv) {
            try {
                object = ((juv)object).a();
            }
            catch (Throwable throwable) {
                object = jns.aj(throwable);
            }
            Object object2 = object;
            if (object instanceof jod) {
                object2 = null;
            }
            return (Throwable)object2;
        }
        return (Throwable)b.a(object.getClass()).a(object);
    }

    public static final jrk b(Class object) {
        ero ero2 = ero.t;
        if (a == kbd.c((Class)object, 0)) {
            int n2;
            Object object2 = object.getConstructors();
            int n3 = ((Constructor<?>[])object2).length;
            Object object3 = new ArrayList(n3);
            int n4 = 0;
            while (true) {
                object = null;
                if (n4 >= n3) break;
                object = object2[n4];
                Object object4 = object.getParameterTypes();
                n2 = ((Class<?>[])object4).length;
                object = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? new joc(null, -1) : (jse.i(object4[0], String.class) && jse.i(object4[1], Throwable.class) ? new joc(new kbc(new kbc(object, 1), 4), 3) : new joc(null, -1))) : (jse.i(object4 = object4[0], String.class) ? new joc(new kbc(new kbc(object, 0), 4), 2) : (jse.i(object4, Throwable.class) ? new joc(new kbc(new kbc(object, 2), 4), 1) : new joc(null, -1)))) : new joc(new kbc(new kbc(object, 3), 4), 0);
                object3.add(object);
                ++n4;
            }
            if ((object3 = object3.iterator()).hasNext()) {
                object = object2 = object3.next();
                if (object3.hasNext()) {
                    n4 = ((Number)((joc)object2).b).intValue();
                    while (true) {
                        object = object3.next();
                        n2 = ((Number)((joc)object).b).intValue();
                        n3 = n4 < n2 ? n2 : n4;
                        if (n4 < n2) {
                            object2 = object;
                        }
                        object = object2;
                        if (!object3.hasNext()) break;
                        n4 = n3;
                    }
                }
            }
            object = (joc)object;
            if (object != null && (object = (jrk)object.a) != null) {
                return object;
            }
        }
        return ero2;
    }

    private static final int c(Class object, int n2) {
        int n3;
        Object object2;
        jsd.e((Class)object);
        int n4 = 0;
        while (true) {
            object2 = object.getDeclaredFields();
            int n5 = ((Field[])object2).length;
            int n6 = 0;
            for (int i2 = 0; i2 < n5; ++i2) {
                n3 = n6;
                if (!Modifier.isStatic(object2[i2].getModifiers())) {
                    n3 = n6 + 1;
                }
                n6 = n3;
                continue;
            }
            n3 = n4 + n6;
            object2 = object.getSuperclass();
            n4 = n3;
            object = object2;
            if (object2 != null) continue;
            break;
        }
        try {
            object = n3;
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (object instanceof jod) {
            object2 = n2;
        }
        return ((Number)object2).intValue();
    }
}

