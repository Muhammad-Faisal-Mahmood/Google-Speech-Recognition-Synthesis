/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.regex.Pattern;

public final class afm {
    public static final String[] a = new String[]{"", "A", "B", "C"};
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");

    public static Pair a(adu object) {
        object = ((adu)object).k;
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static Pair b(String var0, String[] var1_1, adm var2_2) {
        block65: {
            block61: {
                block66: {
                    block63: {
                        block64: {
                            block62: {
                                if (((String[])var1_1).length < 4) {
                                    afx.e("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(var0)));
                                    return null;
                                }
                                var2_2 = afm.b.matcher(var1_1[1]);
                                if (!var2_2.matches()) {
                                    afx.e("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(var0)));
                                    return null;
                                }
                                var0 = var2_2.group(1);
                                var5_3 = "1".equals(var0);
                                var3_4 = 6;
                                if (!var5_3) break block62;
                                var4_5 = 1;
                                break block63;
                            }
                            if (!"2".equals(var0)) break block64;
                            var4_5 = 2;
                            break block63;
                        }
                        if (!"6".equals(var0)) break block65;
                        var4_5 = 6;
                    }
                    var1_1 = var1_1[3];
                    if (var1_1 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var0 = null;
                            break block61;
                            break;
                        }
                    }
                    switch (var1_1.hashCode()) {
                        default: {
                            break;
                        }
                        case 2312995: {
                            if (!var1_1.equals("L186")) break;
                            var3_4 = 12;
                            break block66;
                        }
                        case 2312992: {
                            if (!var1_1.equals("L183")) break;
                            var3_4 = 11;
                            break block66;
                        }
                        case 2312989: {
                            if (!var1_1.equals("L180")) break;
                            var3_4 = 10;
                            break block66;
                        }
                        case 2312902: {
                            if (!var1_1.equals("L156")) break;
                            var3_4 = 9;
                            break block66;
                        }
                        case 2312899: {
                            if (!var1_1.equals("L153")) break;
                            var3_4 = 8;
                            break block66;
                        }
                        case 2312896: {
                            if (!var1_1.equals("L150")) break;
                            var3_4 = 7;
                            break block66;
                        }
                        case 2312806: {
                            if (!var1_1.equals("L123")) break;
                            break block66;
                        }
                        case 2312803: {
                            if (!var1_1.equals("L120")) break;
                            var3_4 = 5;
                            break block66;
                        }
                        case 2193831: {
                            if (!var1_1.equals("H186")) break;
                            var3_4 = 25;
                            break block66;
                        }
                        case 2193828: {
                            if (!var1_1.equals("H183")) break;
                            var3_4 = 24;
                            break block66;
                        }
                        case 2193825: {
                            if (!var1_1.equals("H180")) break;
                            var3_4 = 23;
                            break block66;
                        }
                        case 2193738: {
                            if (!var1_1.equals("H156")) break;
                            var3_4 = 22;
                            break block66;
                        }
                        case 2193735: {
                            if (!var1_1.equals("H153")) break;
                            var3_4 = 21;
                            break block66;
                        }
                        case 2193732: {
                            if (!var1_1.equals("H150")) break;
                            var3_4 = 20;
                            break block66;
                        }
                        case 2193642: {
                            if (!var1_1.equals("H123")) break;
                            var3_4 = 19;
                            break block66;
                        }
                        case 2193639: {
                            if (!var1_1.equals("H120")) break;
                            var3_4 = 18;
                            break block66;
                        }
                        case 74854: {
                            if (!var1_1.equals("L93")) break;
                            var3_4 = 4;
                            break block66;
                        }
                        case 74851: {
                            if (!var1_1.equals("L90")) break;
                            var3_4 = 3;
                            break block66;
                        }
                        case 74761: {
                            if (!var1_1.equals("L63")) break;
                            var3_4 = 2;
                            break block66;
                        }
                        case 74758: {
                            if (!var1_1.equals("L60")) break;
                            var3_4 = 1;
                            break block66;
                        }
                        case 74665: {
                            if (!var1_1.equals("L30")) break;
                            var3_4 = 0;
                            break block66;
                        }
                        case 71010: {
                            if (!var1_1.equals("H93")) break;
                            var3_4 = 17;
                            break block66;
                        }
                        case 71007: {
                            if (!var1_1.equals("H90")) break;
                            var3_4 = 16;
                            break block66;
                        }
                        case 70917: {
                            if (!var1_1.equals("H63")) break;
                            var3_4 = 15;
                            break block66;
                        }
                        case 70914: {
                            if (!var1_1.equals("H60")) break;
                            var3_4 = 14;
                            break block66;
                        }
                        case 70821: {
                            if (!var1_1.equals("H30")) break;
                            var3_4 = 13;
                            break block66;
                        }
                    }
                    var3_4 = -1;
                }
                switch (var3_4) {
                    default: {
                        ** continue;
                    }
                    case 25: {
                        var0 = 0x2000000;
                        break;
                    }
                    case 24: {
                        var0 = 0x800000;
                        break;
                    }
                    case 23: {
                        var0 = 0x200000;
                        break;
                    }
                    case 22: {
                        var0 = 524288;
                        break;
                    }
                    case 21: {
                        var0 = 131072;
                        break;
                    }
                    case 20: {
                        var0 = 32768;
                        break;
                    }
                    case 19: {
                        var0 = 8192;
                        break;
                    }
                    case 18: {
                        var0 = 2048;
                        break;
                    }
                    case 17: {
                        var0 = 512;
                        break;
                    }
                    case 16: {
                        var0 = 128;
                        break;
                    }
                    case 15: {
                        var0 = 32;
                        break;
                    }
                    case 14: {
                        var0 = 8;
                        break;
                    }
                    case 13: {
                        var0 = 2;
                        break;
                    }
                    case 12: {
                        var0 = 0x1000000;
                        break;
                    }
                    case 11: {
                        var0 = 0x400000;
                        break;
                    }
                    case 10: {
                        var0 = 0x100000;
                        break;
                    }
                    case 9: {
                        var0 = 262144;
                        break;
                    }
                    case 8: {
                        var0 = 65536;
                        break;
                    }
                    case 7: {
                        var0 = 16384;
                        break;
                    }
                    case 6: {
                        var0 = 4096;
                        break;
                    }
                    case 5: {
                        var0 = 1024;
                        break;
                    }
                    case 4: {
                        var0 = 256;
                        break;
                    }
                    case 3: {
                        var0 = 64;
                        break;
                    }
                    case 2: {
                        var0 = 16;
                        break;
                    }
                    case 1: {
                        var0 = 4;
                        break;
                    }
                    case 0: {
                        var0 = 1;
                    }
                }
            }
            if (var0 == null) {
                afx.e("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(var1_1)));
                return null;
            }
            return new Pair((Object)var4_5, var0);
        }
        afx.e("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(var0)));
        return null;
    }
}

