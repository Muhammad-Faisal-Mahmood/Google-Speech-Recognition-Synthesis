/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class jls {
    public static final String[] a = new String[0];
    public static final Charset b = Charset.forName("UTF-8");

    public static List a(Object[] objectArray) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[])objectArray.clone()));
    }

    public static Object[] b(Class clazz, Object[] objectArray, Object[] objectArray2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        block0: for (Object object : objectArray) {
            for (Object object2 : objectArray2) {
                if (!object.equals(object2)) continue;
                arrayList.add(object2);
                continue block0;
            }
        }
        return arrayList.toArray((Object[])Array.newInstance(clazz, arrayList.size()));
    }
}

