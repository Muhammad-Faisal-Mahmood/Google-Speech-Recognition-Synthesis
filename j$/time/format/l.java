/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.f;
import j$.time.format.u;

final class l
implements f {
    private final f a;
    private final int b;
    private final char c;

    l(f f2, int n2, char c2) {
        this.a = f2;
        this.b = n2;
        this.c = c2;
    }

    @Override
    public final boolean g(u object, StringBuilder stringBuilder) {
        int n2;
        int n3 = stringBuilder.length();
        boolean bl2 = this.a.g((u)object, stringBuilder);
        if (!bl2) {
            return false;
        }
        int n4 = stringBuilder.length() - n3;
        if (n4 <= (n2 = this.b)) {
            for (int i2 = 0; i2 < n2 - n4; ++i2) {
                stringBuilder.insert(n3, this.c);
            }
            return true;
        }
        object = new StringBuilder("Cannot print as output of ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" characters exceeds pad width of ");
        ((StringBuilder)object).append(n2);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    public final String toString() {
        CharSequence charSequence;
        String string = String.valueOf(this.a);
        char c2 = this.c;
        if (c2 == ' ') {
            charSequence = ")";
        } else {
            charSequence = new StringBuilder(",'");
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append("')");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        StringBuilder stringBuilder = new StringBuilder("Pad(");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }
}

