/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

public final class agf {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    private static HashMap h;
    private static final String[] i;
    private static final String[] j;
    private static final int[] k;

    static {
        String string;
        String string2;
        String string3;
        int n2;
        a = n2 = Build.VERSION.SDK_INT;
        b = string3 = Build.DEVICE;
        c = string2 = Build.MANUFACTURER;
        d = string = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(", ");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append(", ");
        stringBuilder.append(n2);
        e = stringBuilder.toString();
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = agf.$d2j$hex$f00d9f27$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static HashMap A() {
        String[] stringArray = Locale.getISOLanguages();
        int n2 = stringArray.length;
        int n3 = i.length;
        HashMap<Object, String> hashMap = new HashMap<Object, String>(n2 + 88);
        int n4 = 0;
        int n5 = 0;
        while (true) {
            n3 = n4;
            if (n5 >= n2) {
                while (true) {
                    stringArray = i;
                    n5 = stringArray.length;
                    if (n3 >= 88) return hashMap;
                    hashMap.put(stringArray[n3], stringArray[n3 + 1]);
                    n3 += 2;
                }
            }
            String string = stringArray[n5];
            try {
                Object object = new Locale(string);
                object = ((Locale)object).getISO3Language();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    hashMap.put(object, string);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n5;
        }
    }

    public static int a(int[] nArray, int n2, boolean bl2, boolean bl3) {
        int n3;
        int n4 = n3 = Arrays.binarySearch(nArray, n2);
        if (n3 < 0) {
            n3 = -(n3 + 2);
        } else {
            while ((n3 = n4 - 1) >= 0) {
                n4 = n3;
                if (nArray[n3] == n2) continue;
            }
        }
        return n3;
    }

    public static int b(int n2, int n3) {
        return (n2 + n3 - 1) / n3;
    }

    public static int c(int n2, int n3, int n4) {
        return Math.max(n3, Math.min(n2, n4));
    }

    public static int d(byte[] byArray, int n2, int n3, int n4) {
        n4 = 0;
        while (n2 < n3) {
            n4 = k[n4 >>> 24 ^ byArray[n2] & 0xFF] ^ n4 << 8;
            ++n2;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int e(int n2) {
        if (n2 == 2 || n2 == 4) return 6005;
        if (n2 == 10) return 6004;
        if (n2 == 7) return 6005;
        if (n2 == 8) return 6003;
        switch (n2) {
            default: {
                switch (n2) {
                    default: {
                        return 6006;
                    }
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                }
                return 6002;
            }
            case 15: {
                return 6003;
            }
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            case 16: 
            case 18: 
        }
        return 6005;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int f(String stringArray) {
        int n2;
        block5: {
            int n3;
            n2 = 0;
            if (stringArray == null) {
                return 0;
            }
            int n4 = (stringArray = agf.w((String)stringArray, "_")).length;
            if (n4 < 2) {
                return 0;
            }
            String string = stringArray[n4 - 1];
            n4 = n4 >= 3 && "neg".equals(stringArray[n4 - 2]) ? 1 : 0;
            try {
                abr.i(string);
                n2 = n3 = Integer.parseInt(string);
                if (n4 == 0) break block5;
            }
            catch (NumberFormatException numberFormatException) {
                return n2;
            }
            return -n3;
        }
        return n2;
    }

    public static int g(int n2) {
        if (n2 != 8) {
            if (n2 != 16) {
                if (n2 != 24) {
                    if (n2 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static long h(long l2, long l3, long l4) {
        return Math.max(l3, Math.min(l2, l4));
    }

    public static long i(long l2) {
        long l3 = l2;
        if (l2 != -9223372036854775807L) {
            l3 = l2 == Long.MIN_VALUE ? l2 : l2 * 1000L;
        }
        return l3;
    }

    public static long j(long l2, long l3, long l4) {
        return agf.k(l2, l3, l4, RoundingMode.FLOOR);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static long k(long var0, long var2_1, long var4_2, RoundingMode var6_3) {
        block21: {
            block27: {
                block29: {
                    block23: {
                        block28: {
                            block26: {
                                block25: {
                                    block24: {
                                        block22: {
                                            if (var0 == 0L) break block21;
                                            var13_4 = var4_2 == var2_1 ? 0 : (var4_2 < var2_1 ? -1 : 1);
                                            if (var13_4 >= 0 && var4_2 % var2_1 == 0L) {
                                                return hhk.as(var0, hhk.as(var4_2, var2_1, RoundingMode.UNNECESSARY), var6_3);
                                            }
                                            if (var13_4 < 0 && var2_1 % var4_2 == 0L) {
                                                return hhk.au(var0, hhk.as(var2_1, var4_2, RoundingMode.UNNECESSARY));
                                            }
                                            var13_4 = var4_2 == var0 ? 0 : (var4_2 < var0 ? -1 : 1);
                                            if (var13_4 >= 0 && var4_2 % var0 == 0L) {
                                                return hhk.as(var2_1, hhk.as(var4_2, var0, RoundingMode.UNNECESSARY), var6_3);
                                            }
                                            if (var13_4 < 0 && var0 % var4_2 == 0L) {
                                                return hhk.au(var2_1, hhk.as(var0, var4_2, RoundingMode.UNNECESSARY));
                                            }
                                            var17_5 = hhk.au(var0, var2_1);
                                            var15_6 = 0x7FFFFFFFFFFFFFFFL;
                                            if (var17_5 == 0x7FFFFFFFFFFFFFFFL || var17_5 == -9223372036854775808L) break block22;
                                            var0 = hhk.as(var17_5, var4_2, var6_3);
                                            break block23;
                                        }
                                        var17_5 = hhk.at(Math.abs(var2_1), Math.abs(var4_2));
                                        var2_1 = hhk.as(var2_1, var17_5, RoundingMode.UNNECESSARY);
                                        var17_5 = hhk.as(var4_2, var17_5, RoundingMode.UNNECESSARY);
                                        var4_2 = hhk.at(Math.abs(var0), Math.abs(var17_5));
                                        var0 = hhk.as(var0, var4_2, RoundingMode.UNNECESSARY);
                                        var4_2 = hhk.as(var17_5, var4_2, RoundingMode.UNNECESSARY);
                                        var17_5 = hhk.au(var0, var2_1);
                                        if (var17_5 == 0x7FFFFFFFFFFFFFFFL || var17_5 == -9223372036854775808L) break block24;
                                        var0 = hhk.as(var17_5, var4_2, var6_3);
                                        break block23;
                                    }
                                    var9_7 = var2_1;
                                    var7_8 = var4_2;
                                    if (!((var9_7 = (double)var0 * (var9_7 / var7_8)) > 9.223372036854776E18)) break block25;
                                    var0 = var15_6;
                                    break block23;
                                }
                                if (!(var9_7 < -9.223372036854776E18)) break block26;
                                var0 = -9223372036854775808L;
                                break block23;
                            }
                            if (!hhk.ax(var9_7)) break block27;
                            var13_4 = hmi.a[var6_3.ordinal()];
                            var14_9 = 1;
                            switch (var13_4) {
                                default: {
                                    throw new AssertionError();
                                }
                                case 8: {
                                    var7_8 = var11_10 = Math.rint(var9_7);
                                    if (Math.abs(var9_7 - var11_10) == 0.5) {
                                        break;
                                    }
                                    break block28;
                                }
                                case 7: {
                                    var7_8 = var11_11 = Math.rint(var9_7);
                                    if (Math.abs(var9_7 - var11_11) == 0.5) {
                                        var7_8 = var9_7 + Math.copySign(0.5, var9_7);
                                    }
                                    break block28;
                                }
                                case 6: {
                                    var7_8 = Math.rint(var9_7);
                                    break block28;
                                }
                                case 5: {
                                    if (hmj.a(var9_7)) break;
                                    var0 = (long)var9_7;
                                    var13_4 = var9_7 > 0.0 ? (long)1 : (long)-1;
                                    var2_1 = var13_4;
                                    ** GOTO lbl73
                                }
                                case 3: {
                                    if (!(var9_7 > 0.0) || hmj.a(var9_7)) break;
                                    var0 = (long)var9_7;
                                    var2_1 = 1L;
                                    ** GOTO lbl73
                                }
                                case 2: {
                                    if (var9_7 >= 0.0 || hmj.a(var9_7)) break;
                                    var0 = (long)var9_7;
                                    var2_1 = -1L;
lbl73:
                                    // 3 sources

                                    var7_8 = var0 + var2_1;
                                    break block28;
                                }
                                case 1: {
                                    hhk.am(hmj.a(var9_7));
                                }
                                case 4: 
                            }
                            var7_8 = var9_7;
                        }
                        var13_4 = -9.223372036854776E18 - var7_8 < 1.0 ? (long)1 : (long)0;
                        if (!(var7_8 < 9.223372036854776E18)) {
                            var14_9 = 0;
                        }
                        if ((var13_4 & var14_9) == 0) break block29;
                        var0 = (long)var7_8;
                    }
                    return var0;
                }
                var6_3 = String.valueOf((Object)var6_3);
                var19_12 = new StringBuilder("rounded value is out of range for input ");
                var19_12.append(var9_7);
                var19_12.append(" and rounding mode ");
                var19_12.append((String)var6_3);
                throw new ArithmeticException(var19_12.toString());
            }
            throw new ArithmeticException("input is infinite or NaN");
        }
        return 0L;
    }

    public static long l(int n2) {
        return (long)n2 & 0xFFFFFFFFL;
    }

    public static long m(long l2) {
        long l3 = l2;
        if (l2 != -9223372036854775807L) {
            l3 = l2 == Long.MIN_VALUE ? l2 : l2 / 1000L;
        }
        return l3;
    }

    public static Handler n() {
        Looper looper = Looper.myLooper();
        abr.j(looper);
        return new Handler(looper, null);
    }

    public static Handler o() {
        return new Handler(agf.p(), null);
    }

    public static Looper p() {
        Looper looper = Looper.myLooper();
        if (looper != null) {
            return looper;
        }
        return Looper.getMainLooper();
    }

    public static adu q(int n2, int n3, int n4) {
        adt adt2 = new adt();
        adt2.a("audio/raw");
        adt2.B = n3;
        adt2.C = n4;
        adt2.D = n2;
        return new adu(adt2);
    }

    public static String r(String string, Object ... objectArray) {
        return String.format(Locale.US, string, objectArray);
    }

    public static String s(String string) {
        try {
            Object object = Class.forName("android.os.SystemProperties");
            object = (String)((Class)object).getMethod("get", String.class).invoke(object, string);
            return object;
        }
        catch (Exception exception) {
            afx.c("Util", "Failed to read system property ".concat(string), exception);
            return null;
        }
    }

    public static String t(String object) {
        if (object == null) {
            return null;
        }
        String[] stringArray = ((String)object).replace('_', '-');
        Object object2 = object;
        if (!stringArray.isEmpty()) {
            object2 = object;
            if (!stringArray.equals("und")) {
                object2 = stringArray;
            }
        }
        stringArray = fxf.T((String)object2);
        object = agf.x((String)stringArray, "-");
        int n2 = 0;
        String string = object[0];
        if (h == null) {
            h = agf.A();
        }
        String string2 = (String)h.get(string);
        object2 = string;
        object = stringArray;
        if (string2 != null) {
            object = string2.concat(String.valueOf(stringArray.substring(string.length())));
            object2 = string2;
        }
        int n3 = n2;
        if (!"no".equals(object2)) {
            n3 = n2;
            if (!"i".equals(object2)) {
                if ("zh".equals(object2)) {
                    n3 = n2;
                } else {
                    return object;
                }
            }
        }
        while (true) {
            stringArray = j;
            n2 = stringArray.length;
            object2 = object;
            if (n3 >= 18) break;
            if (((String)object).startsWith(stringArray[n3])) {
                object2 = stringArray[n3 + 1];
                object = ((String)object).substring(stringArray[n3].length());
                object2 = String.valueOf(object2).concat(String.valueOf(object));
                break;
            }
            n3 += 2;
        }
        return object2;
    }

    public static boolean u(Context context) {
        return (context = (UiModeManager)context.getApplicationContext().getSystemService("uimode")) != null && context.getCurrentModeType() == 4;
    }

    public static Object[] v(Object[] objectArray, int n2) {
        boolean bl2 = n2 <= objectArray.length;
        abr.d(bl2);
        return Arrays.copyOf(objectArray, n2);
    }

    public static String[] w(String string, String string2) {
        return string.split(string2, -1);
    }

    public static String[] x(String string, String string2) {
        return string.split(string2, 2);
    }

    public static int y(long[] lArray, long l2, boolean bl2) {
        int n2;
        int n3 = n2 = Arrays.binarySearch(lArray, l2);
        if (n2 < 0) {
            n3 = -(n2 + 2);
        } else {
            while ((n2 = n3 - 1) >= 0 && lArray[n2] == l2) {
                n3 = n2;
            }
        }
        n2 = n3;
        if (bl2) {
            n2 = Math.max(0, n3);
        }
        return n2;
    }

    public static void z(int n2) {
        Integer.toString(n2, 36);
    }

    private static long[] $d2j$hex$f00d9f27$decode_J(String src) {
        byte[] d2 = agf.$d2j$hex$f00d9f27$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$f00d9f27$decode_I(String src) {
        byte[] d2 = agf.$d2j$hex$f00d9f27$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$f00d9f27$decode_S(String src) {
        byte[] d2 = agf.$d2j$hex$f00d9f27$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$f00d9f27$decode_B(String src) {
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

