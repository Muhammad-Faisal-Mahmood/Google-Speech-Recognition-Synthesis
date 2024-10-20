/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.util.Log
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

public class tp {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
            long l2 = ((Number)field.get(typeface)).longValue();
            return l2;
        }
        catch (IllegalAccessException illegalAccessException) {
            Log.e((String)"TypefaceCompatBaseImpl", (String)"Could not retrieve font from family.", (Throwable)illegalAccessException);
            return 0L;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Log.e((String)"TypefaceCompatBaseImpl", (String)"Could not retrieve font from family.", (Throwable)noSuchFieldException);
            return 0L;
        }
    }

    private static Object h(Object[] objectArray, int n2, to to2) {
        int n3 = objectArray.length;
        int n4 = Integer.MAX_VALUE;
        Object object = null;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5;
            block6: {
                Object object2;
                int n6;
                block5: {
                    n6 = 1;
                    boolean bl2 = (n2 & 2) != 0;
                    n5 = 1 != (n2 & 1) ? 400 : 700;
                    object2 = objectArray[i2];
                    int n7 = Math.abs(to2.a(object2) - n5);
                    n5 = n6;
                    if (to2.b(object2) == bl2) {
                        n5 = 0;
                    }
                    n6 = n7 + n7 + n5;
                    if (object == null) break block5;
                    n5 = n4;
                    if (n4 <= n6) break block6;
                }
                n5 = n6;
                object = object2;
            }
            n4 = n5;
        }
        return object;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface a(Context context, uh[] uhArray, int n2) {
        void var1_4;
        void var2_11;
        block7: {
            void var3_14;
            int n3 = uhArray.length;
            Object var5_16 = null;
            if (n3 <= 0) {
                return null;
            }
            uh uh2 = this.m(uhArray, (int)var3_14);
            InputStream inputStream = context.getContentResolver().openInputStream(uh2.a);
            try {
                context = this.l(context, inputStream);
            }
            catch (Throwable throwable) {
                break block7;
            }
            rw.C(inputStream);
            return context;
            catch (Throwable throwable) {
                Object var2_10 = var5_16;
            }
        }
        rw.C((Closeable)var2_11);
        throw var1_4;
        catch (IOException iOException) {
            void var2_13;
            block8: {
                Object var2_12 = null;
                break block8;
                catch (IOException iOException2) {}
            }
            rw.C((Closeable)var2_13);
            return null;
        }
    }

    public Typeface b(Context context, bzb bzb2, Resources resources, int n2) {
        Object object = new tn(0);
        if ((object = (sy)tp.h((Object[])bzb2.a, n2, (to)object)) == null) {
            return null;
        }
        long l2 = tp.g((Typeface)(context = ti.a(context, resources, ((sy)object).f, ((sy)object).a, 0, n2)));
        if (l2 != 0L) {
            this.a.put(l2, bzb2);
        }
        return context;
    }

    /*
     * Unable to fully structure code
     */
    public Typeface d(Context var1_1, Resources var2_3, int var3_5, String var4_6, int var5_7) {
        var4_6 = rw.B(var1_1);
        var1_1 = null;
        if (var4_6 == null) {
            return null;
        }
        try {
            if (rw.E((File)var4_6, var2_3, var3_5)) {
                var2_3 = Typeface.createFromFile((String)var4_6.getPath());
                var1_1 = var2_3;
            }
        }
        catch (Throwable var1_2) {
            var4_6.delete();
            throw var1_2;
        }
lbl14:
        // 2 sources

        while (true) {
            var4_6.delete();
            return var1_1;
        }
        catch (RuntimeException var2_4) {
            ** continue;
        }
    }

    public Typeface f(Context context, List list, int n2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Typeface l(Context var1_1, InputStream var2_3) {
        var3_5 = rw.B(var1_1 /* !! */ );
        var1_1 /* !! */  = null;
        if (var3_5 == null) {
            return null;
        }
        try {
            if (rw.D(var3_5, var2_3)) {
                var2_3 = Typeface.createFromFile((String)var3_5.getPath());
                var1_1 /* !! */  = var2_3;
            }
        }
        catch (Throwable var1_2) {
            var3_5.delete();
            throw var1_2;
        }
lbl14:
        // 2 sources

        while (true) {
            var3_5.delete();
            return var1_1 /* !! */ ;
        }
        catch (RuntimeException var2_4) {
            ** continue;
        }
    }

    protected uh m(uh[] uhArray, int n2) {
        return (uh)tp.h(uhArray, n2, new tn(1));
    }
}

