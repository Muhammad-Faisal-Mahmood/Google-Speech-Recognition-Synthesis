/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.sun.security.action.a;
import java.security.AccessController;

abstract class M {
    static final boolean a = (Boolean)AccessController.doPrivileged(new a(1));

    static void a(Class object, String string) {
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" tripwire tripped but logging not supported: ");
        stringBuilder.append(string);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}

