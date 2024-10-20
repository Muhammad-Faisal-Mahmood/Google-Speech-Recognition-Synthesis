/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;

public abstract class n {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object object, Object object2) {
        do {
            if (!atomicReference.compareAndSet(object, object2)) continue;
            return true;
        } while (atomicReference.get() == object);
        return false;
    }

    static String b(Object object, Object object2) {
        String string;
        String string2;
        block5: {
            block4: {
                string2 = "null";
                if (object == null) break block4;
                string = object.toString();
                object = string;
                if (string != null) break block5;
            }
            object = "null";
        }
        int n2 = ((String)object).length();
        string = string2;
        if (object2 != null && (string = object2.toString()) == null) {
            string = string2;
        }
        int n3 = string.length();
        object2 = new char[n2 + n3 + 1];
        ((String)object).getChars(0, n2, (char[])object2, 0);
        object2[n2] = 61;
        string.getChars(0, n3, (char[])object2, n2 + 1);
        return new String((char[])object2);
    }
}

