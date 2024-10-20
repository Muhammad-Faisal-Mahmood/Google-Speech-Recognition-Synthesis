/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

import org.chromium.base.TokenBase;

public final class Token
extends TokenBase {
    public Token(long l2, long l3) {
        super(l2, l3);
    }

    public final String toString() {
        return String.format("%016X%016X", this.a, this.b);
    }
}

