/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class abr {
    public static final void a(Activity activity) {
        jse.e(activity, "activity");
        dp$$ExternalSyntheticApiModelOutline0.m(activity, new abs());
    }

    public static final abw b(Bundle object3, Bundle object2) {
        if (object3 == null) {
            if (object2 == null) {
                object3 = new abw();
            } else {
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                for (Object object3 : object2.keySet()) {
                    jse.d(object3, "key");
                    hashMap.put(object3, object2.get((String)object3));
                }
                object3 = new abw(hashMap);
            }
            return object3;
        }
        object2 = abw.class.getClassLoader();
        jse.b(object2);
        object3.setClassLoader((ClassLoader)object2);
        object2 = object3.getParcelableArrayList("keys");
        object3 = object3.getParcelableArrayList("values");
        if (object2 != null && object3 != null && ((ArrayList)object2).size() == ((ArrayList)object3).size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int n2 = object2.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                Object e2 = ((ArrayList)object2).get(i2);
                jse.c(e2, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String)e2, ((ArrayList)object3).get(i2));
            }
            return new abw(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(agr agr2) {
        try {
            agr2.d();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void d(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void e(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException((String)object);
    }

    public static void f(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void g(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }

    public static void h(int n2, int n3) {
        if (n2 >= 0 && n2 < n3) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void i(Object object) {
        object.getClass();
    }

    public static void j(Object object) {
        if (object != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static final File k(Context object) {
        jse.e(object, "context");
        object = object.getDatabasePath("androidx.work.workdb");
        jse.d(object, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return object;
    }

    public static final bcs l(boolean bl2) {
        bct bct2 = new bct();
        if (bl2) {
            return new bcu(bct2);
        }
        return bct2;
    }

    public static bcs m() {
        return abr.l(true);
    }

    public static bzb n(bcs bcs2, bhd bhd2) {
        jse.e(bhd2, "spec");
        return bcs2.d(AmbientLifecycleObserverKt.o(bhd2));
    }

    public static void o(bxt bxt2, bzb bzb2) {
        jse.e(bzb2, "workSpecId");
        bxt2.A(bzb2, -512);
    }
}

