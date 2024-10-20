/*
 * Decompiled with CFR 0.152.
 */
public class doc {
    public doc() {
    }

    public doc(byte[] byArray) {
    }

    public doc(short[] sArray) {
    }

    public static hpn a(dzl dzl2, dzj dzj2) {
        return dzl2.k((dzj)dzj2).a;
    }

    public static void b(String[] stringArray,  /* corrupt varargs signature?! */ StringBuilderStringBuilder stringBuilder) {
        if (stringArray != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(stringArray[i2]);
            }
        }
    }

    public static /* synthetic */ cxt c(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static edb d(ebb hyg2) {
        jse.e(hyg2, "<this>");
        hyg2 = (eba)hyg2;
        if ((((eba)hyg2).b & 1) != 0) {
            edb edb2 = ((eba)hyg2).c;
            hyg2 = edb2;
            if (edb2 == null) {
                hyg2 = edb.a;
            }
            return hyg2;
        }
        return null;
    }

    public static int e(int n2) {
        if (n2 != 0) {
            int n3 = 1;
            if (n2 != 1) {
                n3 = 2;
                if (n2 != 2) {
                    if (n2 != 5) {
                        if (n2 != 6) {
                            if (n2 != 8) {
                                switch (n2) {
                                    default: {
                                        return 0;
                                    }
                                    case 102: {
                                        return 8;
                                    }
                                    case 101: {
                                        return 7;
                                    }
                                    case 100: 
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
            }
            return n3;
        }
        return 9;
    }

    public static /* synthetic */ bzb f(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb g(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb h(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb k(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb l(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzb m(hwr hwr2) {
        jse.e(hwr2, "builder");
        return new bzb(hwr2);
    }
}

