/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.Set;

public final class zy {
    private static final zx a = zx.a;

    public static final void a(be be2, String object) {
        jse.e(be2, "fragment");
        object = new zv(be2, (String)object);
        zy.d((aai)object);
        zx zx2 = zy.b(be2);
        if (zx2.b.contains((Object)zw.c) && zy.e(zx2, be2.getClass(), object.getClass())) {
            zy.c(zx2, (aai)object);
        }
    }

    public static final zx b(be be2) {
        while (be2 != null) {
            if (be2.isAdded()) {
                be2.getParentFragmentManager();
            }
            be2 = be2.D;
        }
        return a;
    }

    public static final void c(zx object, aai aai2) {
        be be2 = aai2.a;
        String string = be2.getClass().getName();
        ((zx)object).b.contains((Object)zw.a);
        if (((zx)object).b.contains((Object)zw.b)) {
            object = new aj(string, aai2, 18);
            if (be2.isAdded()) {
                aai2 = be2.getParentFragmentManager().l.d;
                if (jse.i(aai2.getLooper(), Looper.myLooper())) {
                    object.run();
                    return;
                }
                aai2.post((Runnable)object);
                return;
            }
            object.run();
        }
    }

    public static final void d(aai aai2) {
        if (by.S(3)) {
            aai2.a.getClass().getName();
        }
    }

    public static final boolean e(zx object, Class clazz, Class clazz2) {
        object = (Set)((zx)object).c.get(clazz.getName());
        if (object == null) {
            return true;
        }
        if (!jse.i(clazz2.getSuperclass(), aai.class) && jns.y((Iterable)object, clazz2.getSuperclass())) {
            return false;
        }
        return !object.contains(clazz2);
    }
}

