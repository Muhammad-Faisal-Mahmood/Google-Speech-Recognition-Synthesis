/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ThreadLocalRandom;

final class z
extends ThreadLocal {
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}

