/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import java.security.PrivilegedAction;

final class A
implements PrivilegedAction {
    public final Object run() {
        return Boolean.getBoolean("java.util.secureRandomSeed");
    }
}

