/*
 * Decompiled with CFR 0.152.
 */
public class bl {
    public static final int a = 0;
    private static final pa b = new pa();

    public static Class a(ClassLoader object, String string) {
        pa pa2 = b;
        Object object2 = (pa)pa2.get(object);
        pa pa3 = object2;
        if (object2 == null) {
            pa3 = new pa();
            pa2.put(object, pa3);
        }
        if ((object2 = (Class)pa3.get(string)) == null) {
            object = Class.forName(string, false, (ClassLoader)object);
            pa3.put(string, object);
            return object;
        }
        return object2;
    }

    public be b(String string) {
        throw null;
    }
}

