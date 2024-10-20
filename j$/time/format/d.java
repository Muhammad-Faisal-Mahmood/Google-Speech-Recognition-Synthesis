/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.f;
import j$.time.format.u;

final class d
implements f {
    private final char a;

    d(char c2) {
        this.a = c2;
    }

    @Override
    public final boolean g(u u2, StringBuilder stringBuilder) {
        stringBuilder.append(this.a);
        return true;
    }

    public final String toString() {
        char c2 = this.a;
        if (c2 == '\'') {
            return "''";
        }
        StringBuilder stringBuilder = new StringBuilder("'");
        stringBuilder.append(c2);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

