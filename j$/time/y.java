/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.ZoneId;
import j$.time.s;
import j$.time.zone.e;
import j$.time.zone.f;
import j$.time.zone.i;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

final class y
extends ZoneId {
    public static final int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    private final String b;
    private final transient e c;

    y(String string, e e2) {
        this.b = string;
        this.c = e2;
    }

    static y N(String string, boolean bl2) {
        Objects.requireNonNull(string, "zoneId");
        int n2 = string.length();
        if (n2 >= 2) {
            f f22;
            block5: {
                e e2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    char c2 = string.charAt(i2);
                    if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 == '/' && i2 != 0 || c2 >= '0' && c2 <= '9' && i2 != 0 || c2 == '~' && i2 != 0 || c2 == '.' && i2 != 0 || c2 == '_' && i2 != 0 || c2 == '+' && i2 != 0 || c2 == '-' && i2 != 0) {
                        continue;
                    }
                    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(string));
                }
                try {
                    e2 = i.a(string, true);
                }
                catch (f f22) {
                    if (bl2) break block5;
                    e2 = null;
                }
                return new y(string, e2);
            }
            throw f22;
        }
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(string));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(7, this);
    }

    @Override
    public final e I() {
        e e2 = this.c;
        if (e2 == null) {
            e2 = i.a(this.b, false);
        }
        return e2;
    }

    @Override
    final void M(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.b);
    }

    final void O(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override
    public final String l() {
        return this.b;
    }
}

