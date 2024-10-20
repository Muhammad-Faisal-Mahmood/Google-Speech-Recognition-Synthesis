/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.f;
import j$.time.format.u;
import java.util.ArrayList;

final class e
implements f {
    private final f[] a;
    private final boolean b;

    e(ArrayList arrayList, boolean bl2) {
        this(arrayList.toArray(new f[arrayList.size()]), bl2);
    }

    e(f[] fArray, boolean bl2) {
        this.a = fArray;
        this.b = bl2;
    }

    public final e a() {
        if (!this.b) {
            return this;
        }
        return new e(this.a, false);
    }

    @Override
    public final boolean g(u u2, StringBuilder stringBuilder) {
        Throwable throwable2;
        boolean bl2;
        block8: {
            int n2 = stringBuilder.length();
            bl2 = this.b;
            if (bl2) {
                u2.g();
            }
            f[] fArray = this.a;
            int n3 = fArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                try {
                    if (fArray[i2].g(u2, stringBuilder)) continue;
                    stringBuilder.setLength(n2);
                    if (bl2) {
                        u2.a();
                    }
                    return true;
                }
                catch (Throwable throwable2) {}
                break block8;
            }
            if (bl2) {
                u2.a();
            }
            return true;
        }
        if (bl2) {
            u2.a();
        }
        throw throwable2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        f[] fArray = this.a;
        if (fArray != null) {
            boolean bl2 = this.b;
            String string = bl2 ? "[" : "(";
            stringBuilder.append(string);
            int n2 = fArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append(fArray[i2]);
            }
            string = bl2 ? "]" : ")";
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

