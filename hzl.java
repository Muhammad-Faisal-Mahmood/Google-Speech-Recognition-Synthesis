/*
 * Decompiled with CFR 0.152.
 */
final class hzl {
    public static final int a = 0;

    static {
        boolean bl2 = hzj.a;
    }

    static int a(String charSequence, byte[] byArray, int n2, int n3) {
        int n4;
        block11: {
            int n5;
            int n6;
            int n7 = ((String)charSequence).length();
            n4 = 0;
            while (true) {
                int n8;
                n6 = n2 + n3;
                if (n4 >= n7 || (n8 = n4 + n2) >= n6 || (n5 = ((String)charSequence).charAt(n4)) >= 128) break;
                byArray[n8] = (byte)n5;
                ++n4;
            }
            if (n4 == n7) {
                n4 = n2 + n7;
            } else {
                char c2;
                block12: {
                    block13: {
                        n2 += n4;
                        n3 = n4;
                        while (true) {
                            n4 = ++n2;
                            if (n3 >= n7) break block11;
                            c2 = ((String)charSequence).charAt(n3);
                            if (c2 < '\u0080' && n2 < n6) {
                                byArray[n2] = (byte)c2;
                            } else if (c2 < '\u0800' && n2 <= n6 - 2) {
                                byArray[n2] = (byte)(c2 >>> 6 | 0x3C0);
                                byArray[n2 + 1] = (byte)(c2 & 0x3F | 0x80);
                                n2 += 2;
                            } else if ((c2 < '\ud800' || c2 > '\udfff') && n2 <= n6 - 3) {
                                byArray[n2] = (byte)(c2 >>> 12 | 0x1E0);
                                byArray[n2 + 1] = (byte)(c2 >>> 6 & 0x3F | 0x80);
                                byArray[n2 + 2] = (byte)(c2 & 0x3F | 0x80);
                                n2 += 3;
                            } else {
                                if (n2 > n6 - 4) break block12;
                                n4 = n3 + 1;
                                if (n4 == ((String)charSequence).length()) break block13;
                                char c3 = ((String)charSequence).charAt(n4);
                                if (!Character.isSurrogatePair(c2, c3)) break;
                                n3 = Character.toCodePoint(c2, c3);
                                byArray[n2] = (byte)(n3 >>> 18 | 0xF0);
                                byArray[n2 + 1] = (byte)(n3 >>> 12 & 0x3F | 0x80);
                                byArray[n2 + 2] = (byte)(n3 >>> 6 & 0x3F | 0x80);
                                n5 = n2 + 4;
                                byArray[n2 + 3] = (byte)(n3 & 0x3F | 0x80);
                                n3 = n4;
                                n2 = n5;
                            }
                            ++n3;
                        }
                        n3 = n4;
                    }
                    throw new hzk(n3 - 1, n7);
                }
                if (!(c2 < '\ud800' || c2 > '\udfff' || (n4 = n3 + 1) != ((String)charSequence).length() && Character.isSurrogatePair(c2, ((String)charSequence).charAt(n4)))) {
                    throw new hzk(n3, n7);
                }
                charSequence = new StringBuilder("Failed writing ");
                ((StringBuilder)charSequence).append(c2);
                ((StringBuilder)charSequence).append(" at index ");
                ((StringBuilder)charSequence).append(n2);
                throw new ArrayIndexOutOfBoundsException(((StringBuilder)charSequence).toString());
            }
        }
        return n4;
    }

    static int b(String charSequence) {
        int n2;
        int n3;
        block10: {
            int n4;
            n3 = ((String)charSequence).length();
            int n5 = 0;
            for (n4 = 0; n4 < n3 && ((String)charSequence).charAt(n4) < '\u0080'; ++n4) {
            }
            int n6 = n3;
            while (true) {
                n2 = n6;
                if (n4 >= n3) break block10;
                n2 = ((String)charSequence).charAt(n4);
                if (n2 >= 2048) break;
                n6 += 127 - n2 >>> 31;
                ++n4;
            }
            int n7 = ((String)charSequence).length();
            n2 = n5;
            while (n4 < n7) {
                char c2 = ((String)charSequence).charAt(n4);
                if (c2 < '\u0800') {
                    n2 += 127 - c2 >>> 31;
                    n5 = n4;
                } else {
                    int n8;
                    n2 = n8 = n2 + 2;
                    n5 = n4;
                    if (c2 >= '\ud800') {
                        n2 = n8;
                        n5 = n4;
                        if (c2 <= '\udfff') {
                            if (Character.codePointAt(charSequence, n4) >= 65536) {
                                n5 = n4 + 1;
                                n2 = n8;
                            } else {
                                throw new hzk(n4, n7);
                            }
                        }
                    }
                }
                n4 = n5 + 1;
            }
            n2 = n6 + n2;
        }
        if (n2 >= n3) {
            return n2;
        }
        long l2 = n2;
        charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        ((StringBuilder)charSequence).append(l2 + 0x100000000L);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(byte[] byArray, int n2, int n3) {
        int n4 = n3 - n2;
        n3 = byArray[n2 - 1];
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) throw new AssertionError();
                n4 = byArray[n2];
                n2 = byArray[n2 + 1];
                if (n3 > -12 || n4 > -65 || n2 > -65) return -1;
                return n2 << 16 ^ (n4 << 8 ^ n3);
            }
            n2 = byArray[n2];
            if (n3 > -12 || n2 > -65) return -1;
            return n2 << 8 ^ n3;
        }
        if (n3 > -12) return -1;
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean d(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 < n3 && byArray[n4] >= 0; ++n4) {
        }
        n2 = n4;
        if (n4 >= n3) {
            return true;
        }
        while ((n4 = n2) < n3) {
            int n5;
            block15: {
                block17: {
                    block14: {
                        block16: {
                            n5 = n4 + 1;
                            n2 = byArray[n4];
                            if (n2 >= 0) break block15;
                            if (n2 >= -32) break block16;
                            if (n5 < n3) {
                                if (n2 < -62) return false;
                                n2 = n4 + 2;
                                if (byArray[n5] <= -65) continue;
                                return false;
                            }
                            break block14;
                        }
                        if (n2 < -16) {
                            if (n5 >= n3 - 1) {
                                n2 = hzl.c(byArray, n5, n3);
                                break block14;
                            } else {
                                if ((n5 = byArray[n5]) > -65) return false;
                                if (n2 == -32) {
                                    if (n5 < -96) return false;
                                }
                                if (n2 == -19) {
                                    if (n5 >= -96) return false;
                                }
                                n2 = n4 + 3;
                                if (byArray[n4 + 2] <= -65) continue;
                                return false;
                            }
                        }
                        if (n5 < n3 - 2) break block17;
                        n2 = hzl.c(byArray, n5, n3);
                    }
                    if (n2 == 0) return true;
                    return false;
                }
                if ((n5 = byArray[n5]) > -65) return false;
                if ((n2 << 28) + (n5 + 112) >> 30 != 0) return false;
                if (byArray[n4 + 2] > -65) return false;
                n2 = n4 + 4;
                if (byArray[n4 + 3] > -65) return false;
                continue;
            }
            n2 = n5;
        }
        return true;
    }
}

