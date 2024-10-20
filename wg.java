/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ContentInfo
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 */
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.Collection;
import java.util.Objects;

public final class wg {
    public static uz a(View view, uz uz2) {
        ContentInfo contentInfo = ut$$ExternalSyntheticApiModelOutline0.m((Object)j$.util.Objects.requireNonNull(uz2.a.d()));
        if ((view = ut$$ExternalSyntheticApiModelOutline0.m(view, contentInfo)) == null) {
            return null;
        }
        if (view == contentInfo) {
            return uz2;
        }
        return new uz(new uw((ContentInfo)view));
    }

    public static String[] b(View view) {
        return ut$$ExternalSyntheticApiModelOutline0.m(view);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        sk$$ExternalSyntheticApiModelOutline1.m(editorInfo, charSequence, 0);
    }

    public static final ach d(Class clazz) {
        jse.e(clazz, "modelClass");
        try {
            Object object = clazz.getDeclaredConstructor(null).newInstance(null);
            jse.d(object, "{\n            modelClass\u2026).newInstance()\n        }");
            object = (ach)object;
            return object;
        }
        catch (IllegalAccessException illegalAccessException) {
            Objects.toString(clazz);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(clazz)), illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            Objects.toString(clazz);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(clazz)), instantiationException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Objects.toString(clazz);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(clazz)), noSuchMethodException);
        }
    }

    public static final String e(Collection object) {
        jse.e(object, "collection");
        object = !object.isEmpty() ? jse.P(jns.D((Iterable)object, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
        return object;
    }

    public static final void f(Collection collection) {
        jse.P(jns.D(collection, ",", null, null, null, 62));
        jse.P(" }");
    }

    public static final void g(Collection collection) {
        jse.P(jns.D(collection, ",", null, null, null, 62));
        jse.P("},");
    }

    public static final boolean h(String string, String string2) {
        if (!jse.i(string, string2)) {
            block10: {
                if (string.length() != 0) {
                    int n2;
                    int n3 = 0;
                    int n4 = n2 = 0;
                    while (n3 < string.length()) {
                        int n5 = string.charAt(n3);
                        int n6 = n4;
                        int n7 = n5;
                        if (n4 == 0) {
                            if (n5 != 40) break block10;
                            n6 = 0;
                            n7 = 40;
                        }
                        n5 = n6;
                        if (n7 == 40) {
                            n6 = n2 + 1;
                        } else {
                            n6 = n2--;
                            if (n7 == 41) {
                                n6 = n2;
                                if (n2 == 0) {
                                    n6 = n2;
                                    if (n5 != string.length() - 1) break block10;
                                }
                            }
                        }
                        ++n3;
                        ++n4;
                        n2 = n6;
                    }
                    if (n2 == 0) {
                        string = string.substring(1, string.length() - 1);
                        jse.d(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        return jse.i(((Object)jse.w(string)).toString(), string2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean i(awa object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (!(object2 instanceof awa)) {
            return false;
        }
        String string = ((awa)object).a;
        object2 = (awa)object2;
        if (!jse.i(string, ((awa)object2).a)) {
            return false;
        }
        if (!jse.i(((awa)object).b, ((awa)object2).b)) {
            return false;
        }
        if (!jse.i(((awa)object).c, ((awa)object2).c)) {
            return false;
        }
        object = ((awa)object).d;
        if (object != null && (object2 = ((awa)object2).d) != null) {
            return jse.i(object, object2);
        }
        return true;
    }

    public static final void j(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("?");
            if (i2 >= n2 - 1) continue;
            stringBuilder.append(",");
        }
    }

    public static final int k(awj awj2, String string) {
        int n2 = wg.l(awj2, string);
        if (n2 >= 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder("`");
        stringBuilder.append(string);
        stringBuilder.append('`');
        n2 = wg.l(awj2, stringBuilder.toString());
        if (n2 >= 0) {
            return n2;
        }
        return -1;
    }

    public static final int l(awj awj2, String string) {
        int n2 = awj2.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!jse.i(string, awj2.c(i2))) continue;
            return i2;
        }
        return -1;
    }
}

