/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.A;
import j$.time.format.c;
import j$.time.format.f;
import j$.time.format.u;
import j$.time.temporal.p;

class j
implements f {
    static final long[] f = new long[]{0L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L};
    final p a;
    final int b;
    final int c;
    private final A d;
    final int e;

    j(p p2, int n2, int n3, A a2) {
        this.a = p2;
        this.b = n2;
        this.c = n3;
        this.d = a2;
        this.e = 0;
    }

    protected j(p p2, int n2, int n3, A a2, int n4) {
        this.a = p2;
        this.b = n2;
        this.c = n3;
        this.d = a2;
        this.e = n4;
    }

    static /* bridge */ /* synthetic */ A a(j j2) {
        return j2.d;
    }

    long b(u u2, long l2) {
        return l2;
    }

    j c() {
        if (this.e == -1) {
            return this;
        }
        A a2 = this.d;
        return new j(this.a, this.b, this.c, a2, -1);
    }

    j d(int n2) {
        int n3 = this.e;
        int n4 = this.c;
        A a2 = this.d;
        return new j(this.a, this.b, n4, a2, n3 + n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean g(u object, StringBuilder stringBuilder) {
        int n2;
        int n3;
        block11: {
            long l2;
            int n4;
            Object object2;
            p p2;
            block12: {
                block13: {
                    p2 = this.a;
                    object2 = ((u)object).e(p2);
                    n4 = 0;
                    if (object2 == null) {
                        return false;
                    }
                    l2 = this.b((u)object, (Long)object2);
                    object2 = ((u)object).b();
                    object = l2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(l2));
                    n3 = ((String)object).length();
                    if (n3 > (n2 = this.c)) {
                        object = String.valueOf(p2);
                        stringBuilder = new StringBuilder("Field ");
                        stringBuilder.append((String)object);
                        stringBuilder.append(" cannot be printed as the value ");
                        stringBuilder.append(l2);
                        stringBuilder.append(" exceeds the maximum print width of ");
                        stringBuilder.append(n2);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    object2.getClass();
                    n2 = this.b;
                    object2 = this.d;
                    if (l2 < 0L) break block12;
                    n3 = j$.time.format.c.a[((Enum)object2).ordinal()];
                    if (n3 == 1) break block13;
                    if (n3 != 2) {
                        n3 = n4;
                        break block11;
                    } else {
                        stringBuilder.append('+');
                        n3 = n4;
                    }
                    break block11;
                }
                n3 = n4;
                if (n2 < 19) {
                    n3 = n4;
                    if (l2 >= f[n2]) {
                        stringBuilder.append('+');
                        n3 = n4;
                    }
                }
                break block11;
            }
            n3 = j$.time.format.c.a[((Enum)object2).ordinal()];
            if (n3 != 1 && n3 != 2 && n3 != 3) {
                if (n3 == 4) {
                    object = String.valueOf(p2);
                    stringBuilder = new StringBuilder("Field ");
                    stringBuilder.append((String)object);
                    stringBuilder.append(" cannot be printed as the value ");
                    stringBuilder.append(l2);
                    stringBuilder.append(" cannot be negative according to the SignStyle");
                    throw new RuntimeException(stringBuilder.toString());
                }
                n3 = n4;
            } else {
                stringBuilder.append('-');
                n3 = n4;
            }
        }
        while (true) {
            if (n3 >= n2 - ((String)object).length()) {
                stringBuilder.append((String)object);
                return true;
            }
            stringBuilder.append('0');
            ++n3;
        }
    }

    public String toString() {
        Object object = this.a;
        Object object2 = this.d;
        int n2 = this.c;
        int n3 = this.b;
        if (n3 == 1 && n2 == 19 && object2 == A.NORMAL) {
            object2 = String.valueOf(object);
            object = new StringBuilder("Value(");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(")");
            return ((StringBuilder)object).toString();
        }
        if (n3 == n2 && object2 == A.NOT_NEGATIVE) {
            object2 = String.valueOf(object);
            object = new StringBuilder("Value(");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(",");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(")");
            return ((StringBuilder)object).toString();
        }
        object = String.valueOf(object);
        object2 = String.valueOf(object2);
        StringBuilder stringBuilder = new StringBuilder("Value(");
        stringBuilder.append((String)object);
        stringBuilder.append(",");
        stringBuilder.append(n3);
        stringBuilder.append(",");
        stringBuilder.append(n2);
        stringBuilder.append(",");
        stringBuilder.append((String)object2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

