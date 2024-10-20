/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

public abstract class TokenBase {
    protected final long a;
    protected final long b;

    protected TokenBase(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    private long getHighForSerialization() {
        return this.a;
    }

    private long getLowForSerialization() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object != null) {
            Class<?> clazz = this.getClass();
            if (object.getClass() == clazz) {
                object = (TokenBase)object;
                if (((TokenBase)object).a == this.a && ((TokenBase)object).b == this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = this.a;
        return n2 * 31 + (int)(l2 >>> 32 ^ l2);
    }
}

