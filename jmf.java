/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public final class jmf {
    public String a;
    public String b;
    public int c = -1;

    public static InetAddress b(String object, int n2) {
        int n3;
        int n4;
        byte[] byArray;
        block22: {
            byArray = new byte[16];
            int n5 = 1;
            int n6 = -1;
            int n7 = -1;
            int n8 = 0;
            while (true) {
                n4 = n8;
                n3 = n6;
                if (n5 >= n2) break block22;
                if (n8 == 16) {
                    return null;
                }
                n4 = n5 + 2;
                if (n4 <= n2 && ((String)object).regionMatches(n5, "::", 0, 2)) {
                    if (n6 != -1) {
                        return null;
                    }
                    n8 += 2;
                    if (n4 == n2) {
                        n3 = n8;
                        n4 = n8;
                        break block22;
                    }
                    n6 = n8;
                    n7 = n4;
                } else {
                    n4 = n5;
                    if (n8 != 0) {
                        if (((String)object).regionMatches(n5, ":", 0, 1)) {
                            n4 = n5 + 1;
                        } else {
                            block23: {
                                if (((String)object).regionMatches(n5, ".", 0, 1)) {
                                    int n9;
                                    n3 = n9 = n8 - 2;
                                    n5 = n7;
                                    while (n5 < n2) {
                                        char c2;
                                        if (n3 == 16) break block23;
                                        n7 = n5;
                                        if (n3 != n9) {
                                            if (((String)object).charAt(n5) != '.') break block23;
                                            n7 = n5 + 1;
                                        }
                                        n4 = 0;
                                        for (n5 = n7; n5 < n2 && (c2 = ((String)object).charAt(n5)) >= '0' && c2 <= '9'; ++n5) {
                                            int n10 = n4;
                                            if (n4 == 0) {
                                                if (n7 != n5) break block23;
                                                n10 = 0;
                                            }
                                            if ((n4 = n10 * 10 + c2 - 48) <= 255) {
                                                continue;
                                            }
                                            break block23;
                                        }
                                        if (n5 - n7 != 0) {
                                            byArray[n3] = (byte)n4;
                                            ++n3;
                                            continue;
                                        }
                                        break block23;
                                    }
                                    if (n3 == n8 + 2) {
                                        n4 = n8 + 2;
                                        n3 = n6;
                                        break block22;
                                    }
                                }
                            }
                            return null;
                        }
                    }
                    n7 = n4;
                }
                n4 = 0;
                for (n5 = n7; n5 < n2 && (n3 = jmg.a(((String)object).charAt(n5))) != -1; ++n5) {
                    n4 = (n4 << 4) + n3;
                }
                n3 = n5 - n7;
                if (n3 == 0 || n3 > 4) break;
                byArray[n8] = (byte)(n4 >>> 8 & 0xFF);
                n3 = n8 + 2;
                byArray[n8 + 1] = (byte)(n4 & 0xFF);
                n8 = n3;
            }
            return null;
        }
        if (n4 != 16) {
            if (n3 == -1) {
                return null;
            }
            n2 = n4 - n3;
            System.arraycopy(byArray, n3, byArray, 16 - n2, n2);
            Arrays.fill(byArray, n3, 16 - n4 + n3, (byte)0);
        }
        try {
            object = InetAddress.getByAddress(byArray);
            return object;
        }
        catch (UnknownHostException unknownHostException) {
            throw new AssertionError();
        }
    }

    final int a() {
        int n2 = this.c;
        if (n2 != -1) {
            return n2;
        }
        return jmg.b(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("://");
        if (this.b.indexOf(58) != -1) {
            stringBuilder.append('[');
            stringBuilder.append(this.b);
            stringBuilder.append(']');
        } else {
            stringBuilder.append(this.b);
        }
        int n2 = this.a();
        if (n2 != jmg.b(this.a)) {
            stringBuilder.append(':');
            stringBuilder.append(n2);
        }
        return stringBuilder.toString();
    }
}

