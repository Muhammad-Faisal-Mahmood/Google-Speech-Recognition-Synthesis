/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.f;
import j$.time.format.u;
import j$.time.temporal.a;
import j$.util.Objects;

final class k
implements f {
    static final String[] d = new String[]{"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    static final k e = new k("+HH:MM:ss", "Z");
    private final String a;
    private final int b;
    private final int c;

    static {
        new k("+HH:MM:ss", "0");
    }

    k(String string, String charSequence) {
        Objects.requireNonNull(string, "pattern");
        Objects.requireNonNull(charSequence, "noOffsetText");
        int n2 = 0;
        while (true) {
            String[] stringArray = d;
            if (n2 >= 22) break;
            if (stringArray[n2].equals(string)) {
                this.b = n2;
                this.c = n2 % 11;
                this.a = charSequence;
                return;
            }
            ++n2;
        }
        charSequence = new StringBuilder("Invalid zone offset pattern: ");
        ((StringBuilder)charSequence).append(string);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    private static void a(boolean bl2, int n2, StringBuilder stringBuilder) {
        String string = bl2 ? ":" : "";
        stringBuilder.append(string);
        stringBuilder.append((char)(n2 / 10 + 48));
        stringBuilder.append((char)(n2 % 10 + 48));
    }

    @Override
    public final boolean g(u object, StringBuilder stringBuilder) {
        block9: {
            block11: {
                int n2;
                String string;
                int n3;
                block13: {
                    boolean bl2;
                    int n4;
                    int n5;
                    int n6;
                    boolean bl3;
                    block14: {
                        int n7;
                        block12: {
                            block10: {
                                object = ((u)object).e(j$.time.temporal.a.OFFSET_SECONDS);
                                bl3 = false;
                                if (object == null) {
                                    return false;
                                }
                                long l2 = (Long)object;
                                if (l2 != (long)(n3 = (int)l2)) break block9;
                                string = this.a;
                                if (n3 != 0) break block10;
                                stringBuilder.append(string);
                                break block11;
                            }
                            n6 = Math.abs(n3 / 3600 % 100);
                            n7 = Math.abs(n3 / 60 % 60);
                            n5 = Math.abs(n3 % 60);
                            n2 = stringBuilder.length();
                            object = n3 < 0 ? "-" : "+";
                            stringBuilder.append((String)object);
                            if (this.b < 11 || n6 >= 10) {
                                k.a(false, n6, stringBuilder);
                            } else {
                                stringBuilder.append((char)(n6 + 48));
                            }
                            n4 = this.c;
                            if (n4 >= 3 && n4 <= 8 || n4 >= 9 && n5 > 0) break block12;
                            n3 = n6;
                            if (n4 < 1) break block13;
                            n3 = n6;
                            if (n7 <= 0) break block13;
                        }
                        bl2 = n4 > 0 && n4 % 2 == 0;
                        k.a(bl2, n7, stringBuilder);
                        n6 += n7;
                        if (n4 == 7 || n4 == 8) break block14;
                        n3 = n6;
                        if (n4 < 5) break block13;
                        n3 = n6;
                        if (n5 <= 0) break block13;
                    }
                    bl2 = bl3;
                    if (n4 > 0) {
                        bl2 = bl3;
                        if (n4 % 2 == 0) {
                            bl2 = true;
                        }
                    }
                    k.a(bl2, n5, stringBuilder);
                    n3 = n6 + n5;
                }
                if (n3 == 0) {
                    stringBuilder.setLength(n2);
                    stringBuilder.append(string);
                }
            }
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String string = this.a.replace("'", "''");
        String string2 = d[this.b];
        StringBuilder stringBuilder = new StringBuilder("Offset(");
        stringBuilder.append(string2);
        stringBuilder.append(",'");
        stringBuilder.append(string);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

