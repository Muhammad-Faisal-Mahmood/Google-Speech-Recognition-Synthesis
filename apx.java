/*
 * Decompiled with CFR 0.152.
 */
public final class apx {
    public static final String[] a = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = new int[]{44100, 48000, 32000};
    public static final int[] c = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (apx.b(n2) && (n6 = n2 >>> 19 & 3) != 1 && (n5 = n2 >>> 17 & 3) != 0 && (n4 = n2 >>> 12 & 0xF) != 0 && n4 != 15 && (n3 = n2 >>> 10 & 3) != 3) {
            int n7 = n4 - 1;
            n4 = b[n3];
            if (n6 == 2) {
                n3 = n4 / 2;
            } else {
                n3 = n4;
                if (n6 == 0) {
                    n3 = n4 / 4;
                }
            }
            int n8 = n2 >>> 9 & 1;
            if (n5 == 3) {
                n2 = n6 == 3 ? c[n7] : d[n7];
                return (n2 * 12 / n3 + n8) * 4;
            }
            n2 = n6 == 3 ? (n5 == 2 ? e[n7] : f[n7]) : g[n7];
            n4 = 144;
            if (n6 == 3) {
                return n2 * 144 / n3 + n8;
            }
            if (n5 == 1) {
                n4 = 72;
            }
            return n4 * n2 / n3 + n8;
        }
        return -1;
    }

    public static boolean b(int n2) {
        return (n2 & 0xFFE00000) == -2097152;
    }
}

