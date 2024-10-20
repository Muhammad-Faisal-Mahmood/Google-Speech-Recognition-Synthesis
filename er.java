/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class er {
    public static final int[] A;
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
        a = new int[]{2130968663, 2130968670, 2130968671, 2130969001, 2130969002, 2130969003, 2130969004, 2130969005, 2130969006, 2130969047, 2130969077, 2130969078, 2130969119, 2130969277, 2130969285, 2130969297, 2130969298, 2130969306, 2130969333, 2130969366, 2130969499, 2130969642, 2130969720, 2130969741, 2130969742, 2130969914, 2130969918, 2130970092, 2130970106};
        b = new int[]{16842931};
        c = new int[]{16843071};
        d = new int[]{2130968663, 2130968670, 2130968869, 2130969277, 2130969918, 2130970106};
        e = new int[]{16842994, 2130968753, 2130968756, 2130969486, 2130969487, 2130969638, 2130969842, 2130969850};
        f = new int[]{0x1010119, 2130969879, 2130970088, 2130970089};
        g = new int[]{16843074, 2130970082, 2130970083, 2130970084};
        h = new int[]{16842804, 16843117, 16843118, 16843119, 0x1010170, 16843666, 16843667};
        i = new int[]{16842804, 2130968656, 2130968657, 2130968658, 2130968659, 2130968660, 2130969094, 2130969095, 2130969096, 2130969097, 2130969099, 2130969100, 2130969101, 2130969102, 2130969123, 2130969198, 2130969239, 2130969249, 2130969395, 2130969479, 2130969969, 2130970046};
        j = er.$d2j$hex$ed5d483f$decode_I("57000101ae0001010300047f0400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2500047f2e00047f3200047f3300047f3400047f3500047f4e00047f9300047fa900047faa00047fab00047fac00047fad00047fb700047fb800047fea00047ff600047f3401047f3501047f3601047f3a01047f3b01047f3c01047f3d01047f6b01047f6d01047f9001047fb801047feb01047ff001047ff101047ff801047ffe01047f1502047f1602047f1b02047f1c02047f1e02047fd102047fe902047f8a03047f8b03047f8c03047f8d03047f9003047f9103047f9203047f9303047f9403047f9503047f9603047f9703047f9803047f5e04047f5f04047f6004047f7704047f7904047f9504047f9804047f9904047f9a04047fba04047fc204047fc404047fc504047f0505047f0605047f4b05047f9905047f9b05047f9c05047f9d05047f9f05047fa005047fa105047fa205047fb205047fb305047ffd05047ffe05047f0006047f0106047f3006047f4606047f4706047f4806047f4906047f4a06047f4b06047f4c06047f4d06047f4e06047f4f06047f");
        k = new int[]{2130968633};
        l = new int[]{0x1010108, 2130968806, 2130968807, 2130968808};
        m = new int[]{0x1010107, 2130968750, 2130968761, 2130968762};
        n = new int[]{16842927, 16842948, 16843046, 16843047, 16843048, 2130969078, 2130969083, 2130969572, 2130969832};
        o = new int[]{16843436, 16843437};
        p = new int[]{0x101000E, 0x10100D0, 16843156, 16843230, 16843231, 0x10101E0};
        q = new int[]{0x1010002, 0x101000E, 0x10100D0, 0x1010106, 16843156, 16843230, 16843231, 0x10101E1, 16843234, 16843235, 16843236, 16843237, 16843375, 2130968593, 2130968614, 2130968617, 2130968635, 2130969000, 2130969313, 2130969314, 2130969666, 2130969829, 2130970115};
        r = new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 0x1010130, 0x1010131, 2130969736, 2130969908};
        s = new int[]{16843126, 16843465, 2130969683};
        t = new int[]{2130969685, 2130969692};
        u = new int[]{16842930, 16843126, 16843131, 16843362, 2130969720};
        v = new int[]{16843044, 16843045, 16843074, 2130969841, 2130969873, 2130969927, 2130969928, 2130969932, 2130970074, 2130970075, 2130970076, 2130970121, 2130970133, 2130970134};
        w = new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 0x1010161, 16843106, 16843107, 16843108, 16843692, 16843958, 16843959, 16844144, 16844165, 2130969239, 2130969249, 2130969969, 2130970046};
        x = new int[]{16842927, 0x1010140, 2130968751, 2130968870, 2130968871, 2130969001, 2130969002, 2130969003, 2130969004, 2130969005, 2130969006, 2130969499, 2130969502, 2130969562, 2130969573, 2130969639, 2130969640, 2130969720, 2130969914, 2130969916, 2130969917, 2130970092, 2130970096, 2130970097, 2130970098, 2130970099, 2130970100, 2130970101, 2130970103, 2130970104};
        y = new int[]{0x1010000, 16842970, 2130969687, 2130969690, 2130970056};
        z = new int[]{16842964, 2130968672, 2130968673};
        A = new int[]{0x10100D0, 16842994, 16842995};
    }

    private static long[] $d2j$hex$ed5d483f$decode_J(String src) {
        byte[] d2 = er.$d2j$hex$ed5d483f$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$ed5d483f$decode_I(String src) {
        byte[] d2 = er.$d2j$hex$ed5d483f$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$ed5d483f$decode_S(String src) {
        byte[] d2 = er.$d2j$hex$ed5d483f$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$ed5d483f$decode_B(String src) {
        char[] d2 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; ++i2) {
            int ll2;
            int hh2;
            char h2 = d2[2 * i2];
            char l2 = d2[2 * i2 + 1];
            if (h2 >= '0' && h2 <= '9') {
                hh2 = h2 - 48;
            } else if (h2 >= 'a' && h2 <= 'f') {
                hh2 = h2 - 97 + 10;
            } else if (h2 >= 'A' && h2 <= 'F') {
                hh2 = h2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l2 >= '0' && l2 <= '9') {
                ll2 = l2 - 48;
            } else if (l2 >= 'a' && l2 <= 'f') {
                ll2 = l2 - 97 + 10;
            } else if (l2 >= 'A' && l2 <= 'F') {
                ll2 = l2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i2] = (byte)(hh2 << 4 | ll2);
        }
        return ret;
    }
}

