/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.ZoneId;
import j$.time.s;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.zone.e;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public final class x
extends ZoneId
implements m,
n,
Comparable {
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final x f = x.R(0);
    public static final x g = x.R(-64800);
    public static final x h = x.R(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;

    private x(int n2) {
        String string;
        this.b = n2;
        if (n2 == 0) {
            string = "Z";
        } else {
            int n3 = Math.abs(n2);
            StringBuilder stringBuilder = new StringBuilder();
            int n4 = n3 / 3600;
            int n5 = n3 / 60 % 60;
            string = n2 < 0 ? "-" : "+";
            stringBuilder.append(string);
            string = n4 < 10 ? "0" : "";
            stringBuilder.append(string);
            stringBuilder.append(n4);
            String string2 = ":";
            string = n5 < 10 ? ":0" : ":";
            stringBuilder.append(string);
            stringBuilder.append(n5);
            n2 = n3 % 60;
            if (n2 != 0) {
                string = string2;
                if (n2 < 10) {
                    string = ":0";
                }
                stringBuilder.append(string);
                stringBuilder.append(n2);
            }
            string = stringBuilder.toString();
        }
        this.c = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static x P(String object) {
        int n2;
        int n3;
        int n4;
        block6: {
            block11: {
                Object object2;
                block8: {
                    block7: {
                        block9: {
                            block10: {
                                Objects.requireNonNull(object, "offsetId");
                                object2 = (x)e.get(object);
                                if (object2 != null) {
                                    return object2;
                                }
                                n4 = ((String)object).length();
                                if (n4 == 2) break block7;
                                object2 = object;
                                if (n4 == 3) break block8;
                                if (n4 == 5) break block9;
                                if (n4 == 6) break block10;
                                if (n4 != 7) {
                                    if (n4 != 9) {
                                        throw new RuntimeException("Invalid ID for ZoneOffset, invalid format: ".concat((String)object));
                                    }
                                    n4 = x.S((String)object, 1, false);
                                    n3 = x.S((String)object, 4, true);
                                    n2 = x.S((String)object, 7, true);
                                    break block6;
                                } else {
                                    n4 = x.S((String)object, 1, false);
                                    n3 = x.S((String)object, 3, false);
                                    n2 = x.S((String)object, 5, false);
                                }
                                break block6;
                            }
                            n4 = x.S((String)object, 1, false);
                            n3 = x.S((String)object, 4, true);
                            break block11;
                        }
                        n4 = x.S((String)object, 1, false);
                        n3 = x.S((String)object, 3, false);
                        break block11;
                    }
                    char c2 = ((String)object).charAt(0);
                    char c3 = ((String)object).charAt(1);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(c2);
                    ((StringBuilder)object).append("0");
                    ((StringBuilder)object).append(c3);
                    object2 = ((StringBuilder)object).toString();
                }
                n4 = x.S((String)object2, 1, false);
                n3 = 0;
                object = object2;
            }
            n2 = 0;
        }
        char c4 = ((String)object).charAt(0);
        if (c4 != '+' && c4 != '-') {
            throw new RuntimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat((String)object));
        }
        if (c4 == '-') {
            return x.Q(-n4, -n3, -n2);
        }
        return x.Q(n4, n3, n2);
    }

    public static x Q(int n2, int n3, int n4) {
        if (n2 >= -18 && n2 <= 18) {
            if (n2 > 0) {
                if (n3 < 0 || n4 < 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
                }
            } else if (n2 < 0) {
                if (n3 > 0 || n4 > 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
                }
            } else if (n3 > 0 && n4 < 0 || n3 < 0 && n4 > 0) {
                throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
            }
            if (n3 >= -59 && n3 <= 59) {
                if (n4 >= -59 && n4 <= 59) {
                    if (Math.abs(n2) == 18 && (n3 | n4) != 0) {
                        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
                    }
                    return x.R(n3 * 60 + n2 * 3600 + n4);
                }
                StringBuilder stringBuilder = new StringBuilder("Zone offset seconds not in valid range: value ");
                stringBuilder.append(n4);
                stringBuilder.append(" is not in the range -59 to 59");
                throw new RuntimeException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Zone offset minutes not in valid range: value ");
            stringBuilder.append(n3);
            stringBuilder.append(" is not in the range -59 to 59");
            throw new RuntimeException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("Zone offset hours not in valid range: value ");
        stringBuilder.append(n2);
        stringBuilder.append(" is not in the range -18 to 18");
        throw new RuntimeException(stringBuilder.toString());
    }

    public static x R(int n2) {
        if (n2 >= -64800 && n2 <= 64800) {
            if (n2 % 900 == 0) {
                Integer n3 = n2;
                ConcurrentHashMap concurrentHashMap = d;
                Object object = (x)concurrentHashMap.get(n3);
                x x2 = object;
                if (object == null) {
                    concurrentHashMap.putIfAbsent(n3, new x(n2));
                    x2 = (x)concurrentHashMap.get(n3);
                    object = x2.c;
                    e.putIfAbsent(object, x2);
                }
                return x2;
            }
            return new x(n2);
        }
        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    private static int S(String string, int n2, boolean bl2) {
        if (bl2 && string.charAt(n2 - 1) != ':') {
            throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: ".concat(string));
        }
        char c2 = string.charAt(n2);
        n2 = string.charAt(n2 + 1);
        if (c2 >= '0' && c2 <= '9' && n2 >= 48 && n2 <= 57) {
            return n2 - 48 + (c2 - 48) * 10;
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: ".concat(string));
    }

    static x T(ObjectInput object) {
        byte by2 = object.readByte();
        object = by2 == 127 ? x.R(object.readInt()) : x.R(by2 * 900);
        return object;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(8, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(p2 instanceof a)) {
            return p2.g(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    @Override
    public final Object F(r r2) {
        if (r2 != l.h() && r2 != l.j()) {
            return l.c(this, r2);
        }
        return this;
    }

    @Override
    public final e I() {
        return j$.time.zone.e.i(this);
    }

    @Override
    final void M(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        this.U(objectOutput);
    }

    public final int N(x x2) {
        return x2.b - this.b;
    }

    public final int O() {
        return this.b;
    }

    final void U(DataOutput dataOutput) {
        int n2 = this.b;
        int n3 = n2 % 900 == 0 ? n2 / 900 : 127;
        dataOutput.writeByte(n3);
        if (n3 == 127) {
            dataOutput.writeInt(n2);
        }
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            if (p2 == j$.time.temporal.a.OFFSET_SECONDS) {
                bl4 = true;
            }
            return bl4;
        }
        bl4 = bl3;
        if (p2 != null) {
            bl4 = bl3;
            if (p2.p(this)) {
                bl4 = true;
            }
        }
        return bl4;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof x) {
            int n2 = ((x)object).b;
            if (this.b != n2) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k k2) {
        a a2 = j$.time.temporal.a.OFFSET_SECONDS;
        return k2.d(this.b, a2);
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String l() {
        return this.c;
    }

    @Override
    public final int p(p p2) {
        if (p2 == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(p2 instanceof a)) {
            return l.d(this, p2).a(this.B(p2), p2);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    @Override
    public final t t(p p2) {
        return l.d(this, p2);
    }

    @Override
    public final String toString() {
        return this.c;
    }
}

