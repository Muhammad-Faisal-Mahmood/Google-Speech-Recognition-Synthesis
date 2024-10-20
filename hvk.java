/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class hvk {
    public static final int a = 0;
    private static volatile int b = 100;

    static long A(byte[] byArray, int n2) {
        return (long)byArray[n2] & 0xFFL | ((long)byArray[n2 + 1] & 0xFFL) << 8 | ((long)byArray[n2 + 2] & 0xFFL) << 16 | ((long)byArray[n2 + 3] & 0xFFL) << 24 | ((long)byArray[n2 + 4] & 0xFFL) << 32 | ((long)byArray[n2 + 5] & 0xFFL) << 40 | ((long)byArray[n2 + 6] & 0xFFL) << 48 | ((long)byArray[n2 + 7] & 0xFFL) << 56;
    }

    private static void B(int n2) {
        if (n2 < b) {
            return;
        }
        throw new hxn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static double a(byte[] byArray, int n2) {
        return Double.longBitsToDouble(hvk.A(byArray, n2));
    }

    static float b(byte[] byArray, int n2) {
        return Float.intBitsToFloat(hvk.d(byArray, n2));
    }

    static int c(byte[] byArray, int n2, hvj hvj2) {
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a;
        if (n3 >= 0) {
            if (n3 <= byArray.length - n2) {
                if (n3 == 0) {
                    hvj2.c = hvu.b;
                    return n2;
                }
                hvj2.c = hvu.s(byArray, n2, n3);
                return n2 + n3;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int d(byte[] byArray, int n2) {
        byte by2 = byArray[n2];
        byte by3 = byArray[n2 + 1];
        byte by4 = byArray[n2 + 2];
        return (byArray[n2 + 3] & 0xFF) << 24 | ((by3 & 0xFF) << 8 | by2 & 0xFF | (by4 & 0xFF) << 16);
    }

    static int e(hyu hyu2, byte[] byArray, int n2, int n3, int n4, hvj hvj2) {
        Object object = hyu2.e();
        n2 = hvk.x(object, hyu2, byArray, n2, n3, n4, hvj2);
        hyu2.g(object);
        hvj2.c = object;
        return n2;
    }

    static int f(hyu hyu2, byte[] byArray, int n2, int n3, hvj hvj2) {
        Object object = hyu2.e();
        n2 = hvk.y(object, hyu2, byArray, n2, n3, hvj2);
        hyu2.g(object);
        hvj2.c = object;
        return n2;
    }

    static int g(hyu hyu2, int n2, byte[] byArray, int n3, int n4, hxk hxk2, hvj hvj2) {
        n3 = hvk.f(hyu2, byArray, n3, n4, hvj2);
        hxk2.add(hvj2.c);
        while (n3 < n4) {
            int n5 = hvk.t(byArray, n3, hvj2);
            if (n2 != hvj2.a) break;
            n3 = hvk.f(hyu2, byArray, n5, n4, hvj2);
            hxk2.add(hvj2.c);
        }
        return n3;
    }

    static int h(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hvm)hxk2;
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a + n2;
        while (n2 < n3) {
            n2 = hvk.w(byArray, n2, hvj2);
            boolean bl2 = hvj2.b != 0L;
            ((hvm)hxk2).e(bl2);
        }
        if (n2 == n3) {
            return n2;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hwf)hxk2;
        int n3 = hvk.t(byArray, n2, hvj2);
        int n4 = n3 + (n2 = hvj2.a);
        if (n4 <= byArray.length) {
            int n5 = ((hwf)hxk2).c + n2 / 8;
            int n6 = ((hwf)hxk2).b.length;
            if (n5 <= n6) {
                n2 = n3;
            } else {
                n2 = n6;
                if (n6 == 0) {
                    ((hwf)hxk2).b = new double[Math.max(n5, 10)];
                    n2 = n3;
                } else {
                    while (n2 < n5) {
                        n2 = hvh.a(n2);
                    }
                    ((hwf)hxk2).b = Arrays.copyOf(((hwf)hxk2).b, n2);
                    n2 = n3;
                }
            }
            while (n2 < n4) {
                ((hwf)hxk2).f(hvk.a(byArray, n2));
                n2 += 8;
            }
            if (n2 == n4) {
                return n2;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hww)hxk2;
        int n3 = hvk.t(byArray, n2, hvj2);
        int n4 = n3 + (n2 = hvj2.a);
        if (n4 <= byArray.length) {
            int n5 = ((hww)hxk2).c + n2 / 4;
            int n6 = ((hww)hxk2).b.length;
            if (n5 <= n6) {
                n2 = n3;
            } else {
                n2 = n6;
                if (n6 == 0) {
                    ((hww)hxk2).b = new int[Math.max(n5, 10)];
                    n2 = n3;
                } else {
                    while (n2 < n5) {
                        n2 = hvh.a(n2);
                    }
                    ((hww)hxk2).b = Arrays.copyOf(((hww)hxk2).b, n2);
                    n2 = n3;
                }
            }
            while (n2 < n4) {
                ((hww)hxk2).g(hvk.d(byArray, n2));
                n2 += 4;
            }
            if (n2 == n4) {
                return n2;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hxw)hxk2;
        int n3 = hvk.t(byArray, n2, hvj2);
        int n4 = n3 + (n2 = hvj2.a);
        if (n4 <= byArray.length) {
            int n5 = ((hxw)hxk2).c + n2 / 8;
            int n6 = ((hxw)hxk2).b.length;
            if (n5 <= n6) {
                n2 = n3;
            } else {
                n2 = n6;
                if (n6 == 0) {
                    ((hxw)hxk2).b = new long[Math.max(n5, 10)];
                    n2 = n3;
                } else {
                    while (n2 < n5) {
                        n2 = hvh.a(n2);
                    }
                    ((hxw)hxk2).b = Arrays.copyOf(((hxw)hxk2).b, n2);
                    n2 = n3;
                }
            }
            while (n2 < n4) {
                ((hxw)hxk2).e(hvk.A(byArray, n2));
                n2 += 8;
            }
            if (n2 == n4) {
                return n2;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hwn)hxk2;
        int n3 = hvk.t(byArray, n2, hvj2);
        int n4 = n3 + (n2 = hvj2.a);
        if (n4 <= byArray.length) {
            int n5 = ((hwn)hxk2).d + n2 / 4;
            int n6 = ((hwn)hxk2).c.length;
            if (n5 <= n6) {
                n2 = n3;
            } else {
                n2 = n6;
                if (n6 == 0) {
                    ((hwn)hxk2).c = new float[Math.max(n5, 10)];
                    n2 = n3;
                } else {
                    while (n2 < n5) {
                        n2 = hvh.a(n2);
                    }
                    ((hwn)hxk2).c = Arrays.copyOf(((hwn)hxk2).c, n2);
                    n2 = n3;
                }
            }
            while (n2 < n4) {
                ((hwn)hxk2).g(hvk.b(byArray, n2));
                n2 += 4;
            }
            if (n2 == n4) {
                return n2;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hww)hxk2;
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a + n2;
        while (n2 < n3) {
            n2 = hvk.t(byArray, n2, hvj2);
            ((hww)hxk2).g(hvy.H(hvj2.a));
        }
        if (n2 == n3) {
            return n2;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hxw)hxk2;
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a + n2;
        while (n2 < n3) {
            n2 = hvk.w(byArray, n2, hvj2);
            ((hxw)hxk2).e(hvy.J(hvj2.b));
        }
        if (n2 == n3) {
            return n2;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hww)hxk2;
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a + n2;
        while (n2 < n3) {
            n2 = hvk.t(byArray, n2, hvj2);
            ((hww)hxk2).g(hvj2.a);
        }
        if (n2 == n3) {
            return n2;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int p(byte[] byArray, int n2, hxk hxk2, hvj hvj2) {
        hxk2 = (hxw)hxk2;
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a + n2;
        while (n2 < n3) {
            n2 = hvk.w(byArray, n2, hvj2);
            ((hxw)hxk2).e(hvj2.b);
        }
        if (n2 == n3) {
            return n2;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int q(byte[] byArray, int n2, hvj hvj2) {
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a;
        if (n3 >= 0) {
            if (n3 == 0) {
                hvj2.c = "";
                return n2;
            }
            hvj2.c = new String(byArray, n2, n3, hxl.a);
            return n2 + n3;
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int r(byte[] byArray, int n2, hvj hvj2) {
        n2 = hvk.t(byArray, n2, hvj2);
        int n3 = hvj2.a;
        if (n3 >= 0) {
            if (n3 == 0) {
                hvj2.c = "";
                return n2;
            }
            hvj2.c = fvc.av(byArray, n2, n3);
            return n2 + n3;
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int s(int n2, byte[] byArray, int n3, int n4, hze hze2, hvj hvj2) {
        if (hzo.a(n2) != 0) {
            int n5 = hzo.b(n2);
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        int n6;
                        if (n5 != 3) {
                            if (n5 == 5) {
                                hze2.e(n2, hvk.d(byArray, n3));
                                return n3 + 4;
                            }
                            throw new hxn("Protocol message contained an invalid tag (zero).");
                        }
                        hze hze3 = new hze();
                        int n7 = n2 & 0xFFFFFFF8 | 4;
                        hvj2.e = n5 = hvj2.e + 1;
                        hvk.B(n5);
                        n5 = 0;
                        while (true) {
                            n6 = n3;
                            if (n3 >= n4) break;
                            n6 = hvk.t(byArray, n3, hvj2);
                            n3 = hvj2.a;
                            if (n3 == n7) {
                                n5 = n3;
                                break;
                            }
                            n6 = hvk.s(n3, byArray, n6, n4, hze3, hvj2);
                            n5 = n3;
                            n3 = n6;
                        }
                        --hvj2.e;
                        if (n6 <= n4 && n5 == n7) {
                            hze2.e(n2, hze3);
                            return n6;
                        }
                        throw new hxn("Failed to parse the message.");
                    }
                    n4 = hvk.t(byArray, n3, hvj2);
                    n3 = hvj2.a;
                    if (n3 >= 0) {
                        if (n3 <= byArray.length - n4) {
                            if (n3 == 0) {
                                hze2.e(n2, hvu.b);
                            } else {
                                hze2.e(n2, hvu.s(byArray, n4, n3));
                            }
                            return n4 + n3;
                        }
                        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                hze2.e(n2, hvk.A(byArray, n3));
                return n3 + 8;
            }
            n3 = hvk.w(byArray, n3, hvj2);
            hze2.e(n2, hvj2.b);
            return n3;
        }
        throw new hxn("Protocol message contained an invalid tag (zero).");
    }

    static int t(byte[] byArray, int n2, hvj hvj2) {
        int n3 = n2 + 1;
        if ((n2 = byArray[n2]) >= 0) {
            hvj2.a = n2;
            return n3;
        }
        return hvk.u(n2, byArray, n3, hvj2);
    }

    static int u(int n2, byte[] byArray, int n3, hvj hvj2) {
        int n4 = byArray[n3];
        int n5 = n3 + 1;
        n2 &= 0x7F;
        if (n4 >= 0) {
            hvj2.a = n2 | n4 << 7;
            return n5;
        }
        n4 = n2 | (n4 & 0x7F) << 7;
        n2 = n3 + 2;
        if ((n5 = byArray[n5]) >= 0) {
            hvj2.a = n4 | n5 << 14;
            return n2;
        }
        n5 = n4 | (n5 & 0x7F) << 14;
        n4 = n3 + 3;
        if ((n2 = byArray[n2]) >= 0) {
            hvj2.a = n5 | n2 << 21;
            return n4;
        }
        n5 |= (n2 & 0x7F) << 21;
        n2 = n3 + 4;
        if ((n4 = byArray[n4]) >= 0) {
            hvj2.a = n5 | n4 << 28;
            return n2;
        }
        while (true) {
            n3 = n2 + 1;
            if (byArray[n2] >= 0) break;
            n2 = n3;
        }
        hvj2.a = n5 | (n4 & 0x7F) << 28;
        return n3;
    }

    static int v(int n2, byte[] byArray, int n3, int n4, hxk hxk2, hvj hvj2) {
        hxk2 = (hww)hxk2;
        n3 = hvk.t(byArray, n3, hvj2);
        ((hww)hxk2).g(hvj2.a);
        while (n3 < n4) {
            int n5 = hvk.t(byArray, n3, hvj2);
            if (n2 != hvj2.a) break;
            n3 = hvk.t(byArray, n5, hvj2);
            ((hww)hxk2).g(hvj2.a);
        }
        return n3;
    }

    static int w(byte[] byArray, int n2, hvj hvj2) {
        long l2 = byArray[n2];
        int n3 = n2 + 1;
        if (l2 >= 0L) {
            hvj2.b = l2;
            return n3;
        }
        n2 += 2;
        byte by2 = byArray[n3];
        l2 = l2 & 0x7FL | (long)(by2 & 0x7F) << 7;
        n3 = 7;
        while (by2 < 0) {
            by2 = byArray[n2];
            l2 |= (long)(by2 & 0x7F) << (n3 += 7);
            ++n2;
        }
        hvj2.b = l2;
        return n2;
    }

    static int x(Object object, hyu hyu2, byte[] byArray, int n2, int n3, int n4, hvj hvj2) {
        int n5;
        hyu2 = (hyi)hyu2;
        hvj2.e = n5 = hvj2.e + 1;
        hvk.B(n5);
        n2 = ((hyi)hyu2).c(object, byArray, n2, n3, n4, hvj2);
        --hvj2.e;
        hvj2.c = object;
        return n2;
    }

    static int y(Object object, hyu hyu2, byte[] byArray, int n2, int n3, hvj hvj2) {
        int n4 = n2 + 1;
        int n5 = byArray[n2];
        n2 = n4;
        int n6 = n5;
        if (n5 < 0) {
            n2 = hvk.u(n5, byArray, n4, hvj2);
            n6 = hvj2.a;
        }
        if (n6 >= 0 && n6 <= n3 - n2) {
            hvj2.e = n3 = hvj2.e + 1;
            hvk.B(n3);
            n3 = n6 + n2;
            hyu2.i(object, byArray, n2, n3, hvj2);
            --hvj2.e;
            hvj2.c = object;
            return n3;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int z(int n2, byte[] byArray, int n3, int n4, hvj hvj2) {
        if (hzo.a(n2) != 0) {
            int n5 = hzo.b(n2);
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        int n6;
                        if (n5 != 3) {
                            if (n5 == 5) {
                                return n3 + 4;
                            }
                            throw new hxn("Protocol message contained an invalid tag (zero).");
                        }
                        int n7 = n2 & 0xFFFFFFF8 | 4;
                        n2 = 0;
                        while (true) {
                            n6 = n2;
                            n5 = n3;
                            if (n3 >= n4) break;
                            n3 = hvk.t(byArray, n3, hvj2);
                            n6 = n2 = hvj2.a;
                            n5 = n3;
                            if (n2 == n7) break;
                            n3 = hvk.z(n2, byArray, n3, n4, hvj2);
                        }
                        if (n5 <= n4 && n6 == n7) {
                            return n5;
                        }
                        throw new hxn("Failed to parse the message.");
                    }
                    return hvk.t(byArray, n3, hvj2) + hvj2.a;
                }
                return n3 + 8;
            }
            return hvk.w(byArray, n3, hvj2);
        }
        throw new hxn("Protocol message contained an invalid tag (zero).");
    }
}

