/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.os.Build$VERSION
 *  android.util.Base64
 *  android.view.View
 */
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class wd {
    private static gzx A(byte[] object, int n2, int n3) {
        if (n3 >= ((byte[])object).length) {
            return gzx.q("");
        }
        Object object2 = new gzs();
        int n4 = wd.y(object, n3, n2);
        int n5 = n3;
        n3 = n4;
        while (n5 < n3) {
            ((gzs)object2).h(new String((byte[])object, n5, n3 - n5, wd.D(n2)));
            n5 = wd.x(n2) + n3;
            n3 = wd.y(object, n5, n2);
        }
        object2 = ((gzs)object2).g();
        object = object2;
        if (((AbstractCollection)object2).isEmpty()) {
            object = gzx.q("");
        }
        return object;
    }

    private static String B(byte[] byArray, int n2, int n3, Charset charset) {
        if (n3 > n2 && n3 <= byArray.length) {
            return new String(byArray, n2, n3 - n2, charset);
        }
        return "";
    }

    private static String C(int n2, int n3, int n4, int n5, int n6) {
        String string = n2 == 2 ? String.format(Locale.US, "%c%c%c", n3, n4, n5) : String.format(Locale.US, "%c%c%c%c", n3, n4, n5, n6);
        return string;
    }

    private static Charset D(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    private static byte[] E(byte[] byArray, int n2, int n3) {
        if (n3 <= n2) {
            return agf.f;
        }
        return Arrays.copyOfRange(byArray, n2, n3);
    }

    static CharSequence a(View view) {
        return fs$$ExternalSyntheticApiModelOutline0.m(view);
    }

    static void b(View view, boolean bl2) {
        fs$$ExternalSyntheticApiModelOutline0.m(view, bl2);
    }

    static void c(View view, CharSequence charSequence) {
        fs$$ExternalSyntheticApiModelOutline0.m(view, charSequence);
    }

    static void d(View view, boolean bl2) {
        fs$$ExternalSyntheticApiModelOutline0.m$1(view, bl2);
    }

    static boolean e(View view) {
        return fs$$ExternalSyntheticApiModelOutline0.m(view);
    }

    static boolean f(View view) {
        return fs$$ExternalSyntheticApiModelOutline0.m$1(view);
    }

    public static void l(Activity object, aaz aaz2) {
        jse.e(object, "activity");
        jse.e((Object)aaz2, "event");
        if (object instanceof abh) {
            ((abh)object).a().d(aaz2);
            return;
        }
        if (object instanceof abe && (object = ((abe)object).getLifecycle()) instanceof abg) {
            ((abg)object).d(aaz2);
        }
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            abr abr2 = abs.Companion;
            abr.a(activity);
        }
        if ((activity = activity.getFragmentManager()).findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            activity.beginTransaction().add((Fragment)new abt(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            activity.executePendingTransactions();
        }
    }

    public static aba n(aba aba2, aba aba3) {
        jse.e((Object)aba2, "state1");
        if (aba3 != null && aba3.compareTo(aba2) < 0) {
            return aba3;
        }
        return aba2;
    }

    public static int o(aga aga2, int n2) {
        int n3;
        int n4;
        byte[] byArray = aga2.a;
        int n5 = n4 = aga2.b;
        int n6 = n2;
        while ((n3 = n5 + 1) < n4 + n6) {
            n2 = n6;
            if ((byArray[n5] & 0xFF) == 255) {
                n2 = n6;
                if (byArray[n3] == 0) {
                    System.arraycopy(byArray, n5 + 2, byArray, n3, n6 - (n5 - n4) - 2);
                    n2 = n6 - 1;
                }
            }
            n5 = n3;
            n6 = n2;
        }
        return n6;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean p(aga var0, int var1_1, int var2_2, boolean var3_3) {
        var8_4 = var0.b;
        block4: while (true) {
            block12: {
                block13: {
                    block14: {
                        var4_5 = var0.a();
                        var6_7 = 1;
                        var14_12 = true;
                        var7_8 = 1;
                        var13_11 = var14_12;
                        if (var4_5 < var2_2) break;
                        if (var1_1 < 3) ** GOTO lbl16
                        var4_5 = var0.c();
                        var9_9 = var0.o();
                        var5_6 = var0.k();
                        break block14;
lbl16:
                        // 1 sources

                        var4_5 = var0.i();
                        var9_9 = var0.i();
                        var5_6 = 0;
                    }
                    if (var4_5 == 0 && var9_9 == 0L && var5_6 == 0) {
                        var13_11 = var14_12;
                        break;
                    }
                    var11_10 = var9_9;
                    if (var1_1 != 4) break block12;
                    var11_10 = var9_9;
                    if (var3_3) break block12;
                    if ((0x808080L & var9_9) == 0L) break block13;
lbl28:
                    // 3 sources

                    while (true) {
                        var13_11 = false;
                        break block4;
                        break;
                    }
                }
                var11_10 = var9_9 >> 24 << 21 | ((var9_9 >> 16 & 255L) << 14 | (var9_9 & 255L | (var9_9 >> 8 & 255L) << 7));
            }
            if (var1_1 == 4) {
                var4_5 = (var5_6 & 64) != 0 ? var7_8 : 0;
                var5_6 &= 1;
            } else if (var1_1 == 3) {
                var4_5 = (var5_6 & 32) != 0 ? 1 : 0;
                var5_6 = (var5_6 & 128) != 0 ? var6_7 : 0;
            } else {
                var4_5 = 0;
                var5_6 = 0;
            }
            var6_7 = var4_5;
            if (var5_6 != 0) {
                var6_7 = var4_5 + 4;
            }
            if (var11_10 < (long)var6_7) ** GOTO lbl28
            if ((long)var0.a() >= var11_10) ** break;
            ** continue;
            var0.w((int)var11_10);
            continue;
            break;
        }
        var0.v(var8_4);
        return var13_11;
        catch (Throwable var15_13) {
            var0.v(var8_4);
            throw var15_13;
        }
    }

    public static int q(int n2) {
        int n3 = 0;
        while (n2 > 0) {
            n2 >>>= 1;
            ++n3;
        }
        return n3;
    }

    public static aek r(List list) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object object = (String)list.get(i2);
            Object object2 = agf.x((String)object, "=");
            if (((String[])object2).length != 2) {
                afx.e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(object)));
                continue;
            }
            if (object2[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    object2 = Base64.decode((String)object2[1], (int)0);
                    Object object3 = new aga((byte[])object2);
                    int n2 = ((aga)object3).c();
                    String string = ael.b(((aga)object3).q(((aga)object3).c(), StandardCharsets.US_ASCII));
                    object2 = ((aga)object3).p(((aga)object3).c());
                    int n3 = ((aga)object3).c();
                    int n4 = ((aga)object3).c();
                    int n5 = ((aga)object3).c();
                    int n6 = ((aga)object3).c();
                    int n7 = ((aga)object3).c();
                    object = new byte[n7];
                    ((aga)object3).r((byte[])object, 0, n7);
                    object3 = new aqh(n2, string, (String)object2, n3, n4, n5, n6, (byte[])object);
                    arrayList.add(object3);
                }
                catch (RuntimeException runtimeException) {
                    afx.f("VorbisUtil", "Failed to parse vorbis picture", runtimeException);
                }
                continue;
            }
            arrayList.add(new aqz(object2[0], object2[1]));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new aek(arrayList);
    }

    public static boolean s(int n2, aga object, boolean bl2) {
        if (((aga)object).a() < 7) {
            if (bl2) {
                return false;
            }
            n2 = ((aga)object).a();
            object = new StringBuilder("too short header: ");
            ((StringBuilder)object).append(n2);
            throw new aem(((StringBuilder)object).toString(), null, true, 1);
        }
        if (((aga)object).h() != n2) {
            if (bl2) {
                return false;
            }
            throw new aem("expected header type ".concat(String.valueOf(Integer.toHexString(n2))), null, true, 1);
        }
        if (((aga)object).h() == 118 && ((aga)object).h() == 111 && ((aga)object).h() == 114 && ((aga)object).h() == 98 && ((aga)object).h() == 105 && ((aga)object).h() == 115) {
            return true;
        }
        if (bl2) {
            return false;
        }
        throw new aem("expected characters 'vorbis'", null, true, 1);
    }

    public static int t(aqe aqe2, adn adn2, int n2, boolean bl2) {
        return aqe2.s(adn2, n2, true);
    }

    public static void u(aqe aqe2, aga aga2, int n2) {
        aqe2.u(aga2, n2);
    }

    /*
     * Exception decompiling
     */
    public static aqs v(int var0, aga var1_1, boolean var2_2, int var3_3, wd var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [17, 16, 15 : 768->773)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static bzb w(aga aga2, boolean bl2, boolean bl3) {
        int n2 = 0;
        if (bl2) {
            wd.s(3, aga2, false);
        }
        aga2.p((int)aga2.m());
        long l2 = aga2.m();
        String[] stringArray = new String[(int)l2];
        while ((long)n2 < l2) {
            stringArray[n2] = aga2.p((int)aga2.m());
            ++n2;
        }
        if (bl3 && (aga2.h() & 1) == 0) {
            throw new aem("framing bit expected to be set", null, true, 1);
        }
        return new bzb(stringArray);
    }

    private static int x(int n2) {
        if (n2 != 0 && n2 != 3) {
            return 2;
        }
        return 1;
    }

    private static int y(byte[] byArray, int n2, int n3) {
        int n4 = wd.z(byArray, n2);
        if (n3 != 0 && n3 != 3) {
            n3 = n4;
            while (n3 < (n4 = byArray.length) - 1) {
                n4 = n3 + 1;
                if ((n3 - n2) % 2 == 0 && byArray[n4] == 0) {
                    return n3;
                }
                n3 = wd.z(byArray, n4);
            }
            return n4;
        }
        return n4;
    }

    private static int z(byte[] byArray, int n2) {
        int n3;
        while (n2 < (n3 = byArray.length)) {
            if (byArray[n2] == 0) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public int g() {
        return 1;
    }

    public void h(int n2) {
    }

    public void i(boolean bl2) {
    }

    public void j(boolean bl2) {
    }

    public void k(int n2) {
    }
}

