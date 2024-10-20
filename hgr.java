/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;

final class hgr {
    public static final hgt a = hgr.a(hgt.o());

    private static hgt a(String[] stringArray) {
        hgt hgt2;
        try {
            hgt2 = hhd.a;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            hgt2 = null;
        }
        if (hgt2 != null) {
            return hgt2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : stringArray) {
            try {
                hgt2 = (hgt)Class.forName(string).getConstructor(null).newInstance(null);
                return hgt2;
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable;
                if (throwable instanceof InvocationTargetException) {
                    throwable2 = throwable.getCause();
                }
                stringBuilder.append('\n');
                stringBuilder.append(string);
                stringBuilder.append(": ");
                stringBuilder.append(throwable2);
            }
        }
        throw new IllegalStateException(stringBuilder.insert(0, "No logging platforms found:").toString());
    }
}

