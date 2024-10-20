/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.ZoneId;
import j$.time.format.f;
import j$.time.format.u;
import j$.time.temporal.r;

class q
implements f {
    private final r a;
    private final String b;

    q(r r2, String string) {
        this.a = r2;
        this.b = string;
    }

    @Override
    public boolean g(u object, StringBuilder stringBuilder) {
        if ((object = (ZoneId)((u)object).f(this.a)) == null) {
            return false;
        }
        stringBuilder.append(((ZoneId)object).l());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}

