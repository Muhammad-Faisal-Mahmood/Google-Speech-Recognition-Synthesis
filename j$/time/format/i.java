/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.B;
import j$.time.format.f;
import j$.time.format.u;
import j$.time.temporal.a;

final class i
implements f {
    public final int a;
    private final Object b;

    public /* synthetic */ i(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    private static void a(StringBuilder stringBuilder, int n2) {
        stringBuilder.append((char)(n2 / 10 + 48));
        stringBuilder.append((char)(n2 % 10 + 48));
    }

    @Override
    public final boolean g(u object, StringBuilder stringBuilder) {
        block15: {
            boolean bl2;
            block14: {
                block13: {
                    switch (this.a) {
                        default: {
                            stringBuilder.append((String)this.b);
                            return true;
                        }
                        case 0: 
                    }
                    object = ((u)object).e(j$.time.temporal.a.OFFSET_SECONDS);
                    if (object != null) break block13;
                    bl2 = false;
                    break block14;
                }
                stringBuilder.append("GMT");
                long l2 = (Long)object;
                int n2 = (int)l2;
                if (l2 != (long)n2) break block15;
                if (n2 != 0) {
                    int n3 = Math.abs(n2 / 3600 % 100);
                    int n4 = Math.abs(n2 / 60 % 60);
                    int n5 = Math.abs(n2 % 60);
                    object = n2 < 0 ? "-" : "+";
                    stringBuilder.append((String)object);
                    object = B.FULL;
                    if ((B)((Object)this.b) == object) {
                        i.a(stringBuilder, n3);
                        stringBuilder.append(':');
                        i.a(stringBuilder, n4);
                        if (n5 != 0) {
                            stringBuilder.append(':');
                            i.a(stringBuilder, n5);
                        }
                    } else {
                        if (n3 >= 10) {
                            stringBuilder.append((char)(n3 / 10 + 48));
                        }
                        stringBuilder.append((char)(n3 % 10 + 48));
                        if (n4 != 0 || n5 != 0) {
                            stringBuilder.append(':');
                            i.a(stringBuilder, n4);
                            if (n5 != 0) {
                                stringBuilder.append(':');
                                i.a(stringBuilder, n5);
                            }
                        }
                    }
                }
                bl2 = true;
            }
            return bl2;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        switch (this.a) {
            default: {
                String string = ((String)this.b).replace("'", "''");
                StringBuilder stringBuilder = new StringBuilder("'");
                stringBuilder.append(string);
                stringBuilder.append("'");
                return stringBuilder.toString();
            }
            case 0: 
        }
        String string = String.valueOf((Object)((B)((Object)this.b)));
        StringBuilder stringBuilder = new StringBuilder("LocalizedOffset(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

