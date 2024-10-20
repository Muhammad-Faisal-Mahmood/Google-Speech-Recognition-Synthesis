/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.AbstractWindowedCursor
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.view.View
 */
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;

public class wf {
    static CharSequence a(View view) {
        return sk$$ExternalSyntheticApiModelOutline1.m(view);
    }

    static void b(View view, CharSequence charSequence) {
        sk$$ExternalSyntheticApiModelOutline1.m(view, charSequence);
    }

    public static ach c(ack object, jta jta2, acr object2) {
        jse.e(object, "factory");
        try {
            ach ach2 = object.c(jta2, (acr)object2);
            object = ach2;
        }
        catch (AbstractMethodError abstractMethodError) {
            try {
                object = object2 = object.b(jsd.c(jta2), (acr)object2);
            }
            catch (AbstractMethodError abstractMethodError2) {
                object = object.a(jsd.c(jta2));
            }
        }
        return object;
    }

    public static void d(View view, aco aco2) {
        jse.e(view, "<this>");
        view.setTag(2131428012, (Object)aco2);
    }

    public static void e(HashMap hashMap, jrk jrk2) {
        int n2;
        jse.e(hashMap, "map");
        HashMap hashMap2 = new HashMap(999);
        Iterator iterator = hashMap.keySet().iterator();
        block0: while (true) {
            n2 = 0;
            while (iterator.hasNext()) {
                int n3;
                Object k2 = iterator.next();
                jse.d(k2, "key");
                hashMap2.put(k2, hashMap.get(k2));
                n2 = n3 = n2 + 1;
                if (n3 != 999) continue;
                jrk2.a(hashMap2);
                hashMap2.clear();
                continue block0;
            }
            break;
        }
        if (n2 > 0) {
            jrk2.a(hashMap2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object f(Class clazz) {
        jse.e(clazz, "klass");
        Object object = clazz.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        String string = clazz.getCanonicalName();
        jse.b(string);
        Class<?> clazz2 = object;
        if (object == null) {
            clazz2 = "";
        }
        object = string;
        if (clazz2.length() != 0) {
            object = string.substring(((String)((Object)clazz2)).length() + 1);
            jse.d(object, "this as java.lang.String).substring(startIndex)");
        }
        string = String.valueOf(jse.S((String)object, '.', '_')).concat("_Impl");
        try {
            if (clazz2.length() == 0) {
                object = string;
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)((Object)clazz2));
                ((StringBuilder)object).append('.');
                ((StringBuilder)object).append(string);
                object = ((StringBuilder)object).toString();
            }
            object = Class.forName((String)object, true, clazz.getClassLoader());
            jse.c(object, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return ((Class)object).getDeclaredConstructor(null).newInstance(null);
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(clazz.getCanonicalName())), instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(clazz.getCanonicalName())), illegalAccessException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            clazz2 = new StringBuilder("Cannot find implementation for ");
            ((StringBuilder)((Object)clazz2)).append(clazz.getCanonicalName());
            ((StringBuilder)((Object)clazz2)).append(". ");
            ((StringBuilder)((Object)clazz2)).append(string);
            ((StringBuilder)((Object)clazz2)).append(" does not exist. Is Room annotation processor correctly configured?");
            throw new RuntimeException(((StringBuilder)((Object)clazz2)).toString(), classNotFoundException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object g(aum object, jqb jqb2) {
        if (!((aum)object).o()) return ((kav)((aum)object).h()).a;
        auq auq2 = (auq)jqb2.d().get(auq.a);
        jqb2 = null;
        if (auq2 != null) throw null;
        object = ((aum)object).b;
        if (object != null) return ((kav)object).a;
        jse.h("coroutineScope");
        object = jqb2;
        return ((kav)object).a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object h(aum var0, boolean var1_1, jrk var2_2, jqb var3_3) {
        block11: {
            block13: {
                block10: {
                    block12: {
                        block7: {
                            block8: {
                                block9: {
                                    if (!(var3_3 instanceof avt)) ** GOTO lbl-1000
                                    var5_4 = (avt)var3_3;
                                    var4_5 = var5_4.d;
                                    if ((var4_5 & -2147483648) != 0) {
                                        var5_4.d = var4_5 + -2147483648;
                                        var3_3 = var5_4;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = new avt((jqb)var3_3);
                                    }
                                    var5_4 = var3_3.c;
                                    var6_6 = jqh.a;
                                    var4_5 = var3_3.d;
                                    if (var4_5 == 0) break block7;
                                    if (var4_5 == 1) break block8;
                                    if (var4_5 != 2) break block9;
                                    var1_1 = var3_3.a;
                                    var2_2 = var3_3.f;
                                    var0 = var3_3.e;
                                    jns.ak(var5_4);
                                    break block10;
                                }
                                if (var4_5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            jns.ak(var5_4);
                            var0 = var5_4;
                            break block11;
                        }
                        jns.ak(var5_4);
                        if (!var0.o() || !var0.q() || !var0.p()) break block12;
                        var2_2 = new avv(var1_1, (aum)var0, null, (jrk)var2_2);
                        var3_3.d = 1;
                        var0 = var2_2 = var0.s((jro)var2_2, (jqb)var3_3);
                        if (var2_2 != var6_6) break block11;
                        break block13;
                    }
                    var3_3.e = (WorkDatabase_Impl)var0;
                    var3_3.f = (mz)var2_2;
                    var3_3.a = var1_1;
                    var3_3.b = false;
                    var3_3.d = 2;
                    var5_4 = var7_7 = wf.g((aum)var0, (jqb)var3_3);
                    if (var7_7 == var6_6) break block13;
                }
                var5_4 = (jqf)var5_4;
                var0 = new avs(null, (aum)var0, var1_1, (jrk)var2_2);
                var3_3.e = null;
                var3_3.f = null;
                var3_3.d = 3;
                var0 = var2_2 = jse.ae((jqf)var5_4, (jro)var0, (jqb)var3_3);
                if (var2_2 != var6_6) break block11;
            }
            var0 = var6_6;
        }
        return var0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Cursor i(aum object, awr awr2, boolean bl2) {
        jse.e(awr2, "sqLiteQuery");
        jse.e(awr2, "query");
        ((aum)object).i();
        ((aum)object).j();
        awr2 = ((aum)object).d().b().a(awr2);
        object = awr2;
        if (!bl2) return object;
        object = awr2;
        if (!(awr2 instanceof AbstractWindowedCursor)) return object;
        object = (AbstractWindowedCursor)awr2;
        int n2 = object.getCount();
        int n3 = object.hasWindow() ? object.getWindow().getNumRows() : n2;
        object = awr2;
        if (n3 >= n2) return object;
        jse.e(awr2, "c");
        try {
            object = new MatrixCursor(awr2.getColumnNames(), awr2.getCount());
            while (awr2.moveToNext()) {
                Object[] objectArray = new Object[awr2.getColumnCount()];
                n2 = awr2.getColumnCount();
                for (n3 = 0; n3 < n2; ++n3) {
                    int n4 = awr2.getType(n3);
                    if (n4 != 0) {
                        if (n4 != 1) {
                            if (n4 != 2) {
                                if (n4 != 3) {
                                    if (n4 != 4) {
                                        object = new IllegalStateException();
                                        throw object;
                                    }
                                    objectArray[n3] = awr2.getBlob(n3);
                                    continue;
                                }
                                objectArray[n3] = awr2.getString(n3);
                                continue;
                            }
                            objectArray[n3] = awr2.getDouble(n3);
                            continue;
                        }
                        objectArray[n3] = awr2.getLong(n3);
                        continue;
                    }
                    objectArray[n3] = null;
                }
                object.addRow(objectArray);
            }
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                jsd.f((Closeable)((Object)awr2), throwable);
                throw throwable2;
            }
        }
        jsd.f((Closeable)((Object)awr2), null);
        return object;
    }

    public static int j(Cursor cursor, String string) {
        jse.e(cursor, "c");
        int n2 = cursor.getColumnIndex(string);
        if (n2 >= 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder("`");
        stringBuilder.append(string);
        stringBuilder.append('`');
        n2 = cursor.getColumnIndex(stringBuilder.toString());
        if (n2 >= 0) {
            return n2;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int k(Cursor var0, String var1_2) {
        jse.e(var0 /* !! */ , "c");
        var2_3 = wf.j(var0 /* !! */ , var1_2);
        if (var2_3 >= 0) {
            return var2_3;
        }
        var6_4 = var0 /* !! */ .getColumnNames();
        jse.d(var6_4, "c.columnNames");
        jse.e(var6_4, "<this>");
        var5_5 = new StringBuilder();
        jse.e(var6_4, "<this>");
        var5_5.append((CharSequence)"");
        var4_6 = var6_4.length;
        var2_3 = 0;
        for (var3_7 = 0; var3_7 < var4_6; ++var3_7) {
            var0 /* !! */  = var6_4[var3_7];
            if (++var2_3 <= 1) ** GOTO lbl21
            var5_5.append((CharSequence)", ");
lbl21:
            // 2 sources

            jse.r(var5_5, var0 /* !! */ , null);
            continue;
        }
        try {
            var5_5.append((CharSequence)"");
            var0 /* !! */  = var5_5.toString();
        }
        catch (Exception var0_1) {
            var0 /* !! */  = "unknown";
        }
        var5_5 = new StringBuilder("column '");
        var5_5.append(var1_2);
        var5_5.append("' does not exist. Available columns: ");
        var5_5.append((String)var0 /* !! */ );
        throw new IllegalArgumentException(var5_5.toString());
    }
}

