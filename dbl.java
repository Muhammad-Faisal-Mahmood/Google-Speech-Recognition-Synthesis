/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class dbl
implements ddf {
    public static final crh a = new crh();
    private final gzx b;
    private final crh c;

    public dbl() {
        throw null;
    }

    public dbl(crh crh2, gzx gzx2) {
        this.c = crh2;
        this.b = gzx2;
    }

    private static void b(hus object, dem dem2, ded ded2) {
        object = ((hus)object).j();
        try {
            Cloneable cloneable = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", dbf.a);
            cloneable = cloneable.parse((String)object);
            dem2.i((Date)cloneable);
            return;
        }
        catch (ParseException parseException) {
            throw new dbo(String.format("Error parsing expiry date %s for superpack %s", object, ded2), parseException);
        }
    }

    private static void d(hus hus2, dbi dbi2) {
        hus2.l();
        while (hus2.p()) {
            dbi2.a(hus2.j());
        }
        hus2.n();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final dbx a(InputStream var1_1, String var2_5, int var3_9) {
        block173: {
            block177: {
                block176: {
                    block178: {
                        block174: {
                            block168: {
                                var7_10 = new hji();
                                var8_19 /* !! */  = var7_10;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var11_22 = new InputStreamReader((InputStream)var1_1);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var7_10.c((Closeable)var11_22);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var19_23 = new hus((Reader)var11_22);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var7_10.c((Closeable)var19_23);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var1_1 = hur.a;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                Objects.requireNonNull(var1_1);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var19_23.a = var1_1;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var19_23.m();
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var11_22 = dbx.f();
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var20_24 = ded.c(var2_5, var3_9);
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var18_25 = new ArrayList<dem>();
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var9_20 = var7_10;
                                var10_21 = var7_10;
                                var8_19 /* !! */  = var7_10;
                                var17_26 = new HashMap<Object, Object>();
                                var16_27 = null;
                                var15_28 = null;
                                var1_1 = var7_10;
                                var7_10 = var11_22;
                                while (true) {
                                    block180: {
                                        block181: {
                                            block182: {
                                                block179: {
                                                    var9_20 = var1_1;
                                                    var10_21 = var1_1;
                                                    var8_19 /* !! */  = var1_1;
                                                    var6_31 = var19_23.p();
                                                    if (!var6_31) break block168;
                                                    var9_20 = var1_1;
                                                    var10_21 = var1_1;
                                                    var8_19 /* !! */  = var1_1;
                                                    var12_32 = var19_23.h();
                                                    var9_20 = var1_1;
                                                    var10_21 = var1_1;
                                                    var8_19 /* !! */  = var1_1;
                                                    var4_29 = var12_32.hashCode();
                                                    var11_22 = "name";
                                                    switch (var4_29) {
                                                        default: {
                                                            break;
                                                        }
                                                        case 995046418: {
                                                            if (!var12_32.equals("download_packing_scheme")) break;
                                                            var4_29 = 3;
                                                            break block179;
                                                        }
                                                        case 351608024: {
                                                            if (!var12_32.equals("version")) break;
                                                            var4_29 = 1;
                                                            break block179;
                                                        }
                                                        case 106422650: {
                                                            if (!var12_32.equals("packs")) break;
                                                            var4_29 = 4;
                                                            break block179;
                                                        }
                                                        case 3373707: {
                                                            if (!var12_32.equals("name")) break;
                                                            var4_29 = 0;
                                                            break block179;
                                                        }
                                                        case -1742931994: {
                                                            if (!var12_32.equals("base_download_url")) break;
                                                            var4_29 = 2;
                                                            break block179;
                                                        }
                                                    }
                                                    var4_29 = -1;
                                                }
                                                if (var4_29 == 0 || var4_29 == 1) break block180;
                                                if (var4_29 == 2) break block181;
                                                if (var4_29 == 3) break block182;
                                                if (var4_29 != 4) {
                                                    block169: {
                                                        block170: {
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            var11_22 = this.c.u((hus)var19_23);
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            if (var7_10.e != null) break block169;
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            if (var7_10.f != null) break block170;
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            var13_33 = new gzy();
                                                            var8_19 /* !! */  = var1_1;
                                                            var9_20 = var1_1;
                                                            var10_21 = var1_1;
                                                            var7_10.e = var13_33;
                                                            break block169;
                                                        }
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var13_33 = new gzy();
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var7_10.e = var13_33;
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var13_33 = var7_10.e;
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var14_34 = var7_10.f;
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        ((gzy)var13_33).g((Map)var14_34);
                                                        var8_19 /* !! */  = var1_1;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var7_10.f = null;
                                                    }
                                                    var8_19 /* !! */  = var1_1;
                                                    var9_20 = var1_1;
                                                    var10_21 = var1_1;
                                                    ((gzy)var7_10.e).d(var12_32, var11_22);
                                                    continue;
                                                }
                                                var9_20 = var1_1;
                                                var10_21 = var1_1;
                                                var8_19 /* !! */  = var1_1;
                                                var19_23.l();
                                                while (true) {
                                                    block172: {
                                                        var13_33 = null;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var8_19 /* !! */  = var1_1;
                                                        if (!var19_23.p()) break;
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var8_19 /* !! */  = var1_1;
                                                        var19_23.m();
                                                        var9_20 = var1_1;
                                                        var10_21 = var1_1;
                                                        var8_19 /* !! */  = var1_1;
                                                        var21_35 = den.p();
                                                        var10_21 = var1_1;
                                                        var1_1 = null;
                                                        var14_34 = null;
                                                        var5_30 = 1;
                                                        var9_20 = var11_22;
                                                        var11_22 = var1_1;
                                                        var12_32 = var7_10;
                                                        block161: while (true) {
                                                            block171: {
                                                                block183: {
                                                                    var1_1 = var10_21;
                                                                    var7_10 = var10_21;
                                                                    var8_19 /* !! */  = var10_21;
                                                                    if (!var19_23.p()) break;
                                                                    var1_1 = var10_21;
                                                                    var7_10 = var10_21;
                                                                    var8_19 /* !! */  = var10_21;
                                                                    var23_37 = var19_23.h();
                                                                    var1_1 = var10_21;
                                                                    var7_10 = var10_21;
                                                                    var8_19 /* !! */  = var10_21;
                                                                    var4_29 = var23_37.hashCode();
                                                                    switch (var4_29) {
                                                                        default: {
                                                                            break;
                                                                        }
                                                                        case 1252218203: {
                                                                            if (!var23_37.equals("namespace")) break;
                                                                            var4_29 = 0;
                                                                            break block183;
                                                                        }
                                                                        case 995046418: {
                                                                            if (!var23_37.equals("download_packing_scheme")) break;
                                                                            var4_29 = 8;
                                                                            break block183;
                                                                        }
                                                                        case 542660007: {
                                                                            if (!var23_37.equals("gc_priority")) break;
                                                                            var4_29 = 4;
                                                                            break block183;
                                                                        }
                                                                        case 489126399: {
                                                                            if (!var23_37.equals("compressed_size")) break;
                                                                            var4_29 = 3;
                                                                            break block183;
                                                                        }
                                                                        case 475919162: {
                                                                            if (!var23_37.equals("expiry_date")) break;
                                                                            var4_29 = 10;
                                                                            break block183;
                                                                        }
                                                                        case 31911483: {
                                                                            if (!var23_37.equals("download_urls")) break;
                                                                            var4_29 = 6;
                                                                            break block183;
                                                                        }
                                                                        case 3530753: {
                                                                            if (!var23_37.equals("size")) break;
                                                                            var4_29 = 2;
                                                                            break block183;
                                                                        }
                                                                        case 3373707: {
                                                                            if (!var23_37.equals(var9_20)) break;
                                                                            var4_29 = 1;
                                                                            break block183;
                                                                        }
                                                                        case -120789592: {
                                                                            if (!var23_37.equals("validation_schemes")) break;
                                                                            var4_29 = 7;
                                                                            break block183;
                                                                        }
                                                                        case -267449012: {
                                                                            if (!var23_37.equals("verify_sizes")) break;
                                                                            var4_29 = 9;
                                                                            break block183;
                                                                        }
                                                                        case -1351091333: {
                                                                            if (!var23_37.equals("download_priority")) break;
                                                                            var4_29 = 5;
                                                                            break block183;
                                                                        }
                                                                    }
                                                                    var4_29 = -1;
                                                                }
                                                                switch (var4_29) {
                                                                    default: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var22_36 = this.c;
                                                                        break block171;
                                                                    }
                                                                    case 10: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        dbl.b((hus)var19_23, var21_35, (ded)var20_24);
                                                                        continue block161;
                                                                    }
                                                                    case 9: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.n(var19_23.q());
                                                                        continue block161;
                                                                    }
                                                                    case 8: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var11_22 = var19_23.j();
                                                                        continue block161;
                                                                    }
                                                                    case 7: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var22_36 = new dbg(var21_35, 0);
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        dbl.d((hus)var19_23, (dbi)var22_36);
                                                                        continue block161;
                                                                    }
                                                                    case 6: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var22_36 = new gzs();
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var13_33 = new dbg(var22_36, 1);
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        dbl.d((hus)var19_23, (dbi)var13_33);
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var13_33 = var22_36.g();
                                                                        continue block161;
                                                                    }
                                                                    case 5: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.h(var19_23.b());
                                                                        continue block161;
                                                                    }
                                                                    case 4: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.j(var19_23.b());
                                                                        continue block161;
                                                                    }
                                                                    case 3: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.g(var19_23.c());
                                                                        continue block161;
                                                                    }
                                                                    case 2: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.m(var19_23.c());
                                                                        continue block161;
                                                                    }
                                                                    case 1: {
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var14_34 = var19_23.j();
                                                                        var1_1 = var10_21;
                                                                        var7_10 = var10_21;
                                                                        var8_19 /* !! */  = var10_21;
                                                                        var21_35.k((String)var14_34);
                                                                        continue block161;
                                                                    }
                                                                    case 0: 
                                                                }
                                                                var1_1 = var10_21;
                                                                var7_10 = var10_21;
                                                                var8_19 /* !! */  = var10_21;
                                                                var21_35.l(var19_23.j());
                                                                var5_30 = 0;
                                                                continue;
                                                            }
                                                            var1_1 = var10_21;
                                                            var7_10 = var10_21;
                                                            var8_19 /* !! */  = var10_21;
                                                            var21_35.e(var23_37, var22_36.u((hus)var19_23));
                                                            continue;
                                                            break;
                                                        }
                                                        var1_1 = var10_21;
                                                        var7_10 = var10_21;
                                                        var8_19 /* !! */  = var10_21;
                                                        var19_23.o();
                                                        if (var5_30 == 0) break block172;
                                                        var1_1 = var10_21;
                                                        var7_10 = var10_21;
                                                        var8_19 /* !! */  = var10_21;
                                                        var21_35.l(var2_5);
                                                    }
                                                    if (var14_34 != null) {
                                                        var1_1 = var10_21;
                                                        var7_10 = var10_21;
                                                        var8_19 /* !! */  = var10_21;
                                                        var1_1 = var10_21;
                                                        var7_10 = var10_21;
                                                        var8_19 /* !! */  = var10_21;
                                                        var22_36 = new dbj((gzx)var13_33, (String)var11_22);
                                                        var1_1 = var10_21;
                                                        var7_10 = var10_21;
                                                        var8_19 /* !! */  = var10_21;
                                                        var17_26.put(var14_34, var22_36);
                                                    }
                                                    var1_1 = var10_21;
                                                    var7_10 = var10_21;
                                                    var8_19 /* !! */  = var10_21;
                                                    var21_35.a = var20_24;
                                                    var1_1 = var10_21;
                                                    var7_10 = var10_21;
                                                    var8_19 /* !! */  = var10_21;
                                                    var18_25.add(var21_35);
                                                    var1_1 = var10_21;
                                                    var7_10 = var12_32;
                                                    var11_22 = var9_20;
                                                    continue;
                                                    break;
                                                }
                                                var10_21 = var7_10;
                                                var1_1 = var9_20 = var1_1;
                                                var7_10 = var9_20;
                                                var8_19 /* !! */  = var9_20;
                                                var19_23.n();
                                                var1_1 = var9_20;
                                                var7_10 = var10_21;
                                                continue;
                                            }
                                            var10_21 = var7_10;
                                            var1_1 = var9_20 = var1_1;
                                            var7_10 = var9_20;
                                            var8_19 /* !! */  = var9_20;
                                            var15_28 = var19_23.j();
                                            var1_1 = var9_20;
                                            var7_10 = var10_21;
                                            continue;
                                        }
                                        var10_21 = var7_10;
                                        var1_1 = var9_20 = var1_1;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var16_27 = var19_23.j();
                                        var7_10 = var10_21;
                                        var1_1 = var9_20;
                                        continue;
                                    }
                                    var10_21 = var7_10;
                                    var1_1 = var9_20 = var1_1;
                                    var7_10 = var9_20;
                                    var8_19 /* !! */  = var9_20;
                                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/JsonManifestParser", "parse", 179, "JsonManifestParser.java")).C("Ignoring deprecated field %s, value: %s", var12_32, var19_23.j());
                                    var1_1 = var9_20;
                                    var7_10 = var10_21;
                                    continue;
                                    break;
                                }
                                catch (huq var7_11) {
                                    var1_1 = var9_20;
                                    break block173;
                                }
                                catch (IllegalStateException var7_12) {
                                    var1_1 = var10_21;
                                    break block173;
                                }
                            }
                            var10_21 = var7_10;
                            var1_1 = var9_20 = var1_1;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var19_23.o();
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var11_22 = new dbh((String)var16_27, (String)var15_28);
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var12_32 = var11_22.b;
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var14_34 = var11_22.a;
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var16_27 = var18_25.iterator();
                            block162: while (true) {
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                if (!var16_27.hasNext()) break block174;
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var15_28 = (dem)var16_27.next();
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var11_22 = var15_28.b;
                                if (var11_22 == null) break;
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var19_23 = (dbj)var17_26.get(var11_22);
                                if (var19_23 == null) continue;
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var11_22 = var13_33 = var19_23.b;
                                if (var13_33 == null) {
                                    var11_22 = var12_32;
                                }
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var15_28.c = var11_22;
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var19_23 = var19_23.a;
                                if (var19_23 == null) continue;
                                var1_1 = var9_20;
                                var7_10 = var9_20;
                                var8_19 /* !! */  = var9_20;
                                var5_30 = ((hct)var19_23).c;
                                var4_29 = 0;
                                while (true) {
                                    block175: {
                                        if (var4_29 < var5_30) ** break;
                                        continue block162;
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var11_22 = var13_33 = (String)var19_23.get(var4_29);
                                        if (var14_34 == null) break block175;
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var20_24 = new URL((String)var14_34);
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var11_22 = new URL((URL)var20_24, (String)var13_33);
                                        var1_1 = var9_20;
                                        var7_10 = var9_20;
                                        var8_19 /* !! */  = var9_20;
                                        var11_22 = var11_22.toString();
                                    }
                                    var1_1 = var9_20;
                                    var7_10 = var9_20;
                                    var8_19 /* !! */  = var9_20;
                                    var15_28.d((String)var11_22);
                                    ++var4_29;
                                    continue;
                                    break;
                                }
                                break;
                            }
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var10_21 = new IllegalStateException("Property \"name\" has not been set");
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            throw var10_21;
                        }
                        var1_1 = var9_20;
                        var7_10 = var9_20;
                        var8_19 /* !! */  = var9_20;
                        var11_22 = var18_25.iterator();
                        while (true) {
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            if (!var11_22.hasNext()) break;
                            var1_1 = var9_20;
                            var7_10 = var9_20;
                            var8_19 /* !! */  = var9_20;
                            var10_21.b(((dem)var11_22.next()).a());
                            continue;
                            break;
                        }
                        var1_1 = var9_20;
                        var7_10 = var9_20;
                        var8_19 /* !! */  = var9_20;
                        var10_21.d(var2_5);
                        var1_1 = var9_20;
                        var10_21.e(var3_9);
                        var1_1 = var9_20;
                        var10_21.c(this.b);
                        var1_1 = var9_20;
                        try {
                            var7_10 = var10_21.a();
                        }
                        catch (huq var7_13) {
                            break block176;
                        }
                        catch (IllegalStateException var7_14) {
                            break block176;
                        }
                        catch (Throwable var2_6) {
                            break block177;
                        }
                        var9_20.close();
                        return var7_10;
                        catch (huq var1_2) {
                            break block178;
                        }
                        catch (IllegalStateException var1_3) {
                            var7_10 = var8_19 /* !! */ ;
                        }
                    }
                    var9_20 = var7_10;
                    var7_10 = var1_1;
                }
                var1_1 = var9_20;
                break block173;
                catch (huq var7_15) {
                    var1_1 = var9_20;
                    break block173;
                }
                catch (IllegalStateException var7_16) {
                    var1_1 = var10_21;
                    break block173;
                }
                catch (Throwable var2_7) {
                    var1_1 = var8_19 /* !! */ ;
                }
            }
            var8_19 /* !! */  = var1_1;
            try {
                throw var1_1.b((Throwable)var2_8, dbo.class);
            }
            catch (Throwable var1_4) {
                var8_19 /* !! */ .close();
                throw var1_4;
            }
            catch (huq var7_17) {
                var1_1 = var9_20;
                break block173;
            }
            catch (IllegalStateException var7_18) {
                var1_1 = var10_21;
            }
        }
        var8_19 /* !! */  = var1_1;
        var8_19 /* !! */  = var1_1;
        var8_19 /* !! */  = var1_1;
        var9_20 = new StringBuilder();
        var8_19 /* !! */  = var1_1;
        var9_20.append("Failed to parse manifest for ");
        var8_19 /* !! */  = var1_1;
        var9_20.append(var2_5);
        var8_19 /* !! */  = var1_1;
        var9_20.append(", version: ");
        var8_19 /* !! */  = var1_1;
        var9_20.append(var3_9);
        var8_19 /* !! */  = var1_1;
        var10_21 = new dbo(var9_20.toString(), (Throwable)var7_10);
        var8_19 /* !! */  = var1_1;
        throw var10_21;
    }

    @Override
    public final String c() {
        return "JsonManifestParser";
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dbl) {
            object = (dbl)object;
            if (this.c.equals(((dbl)object).c) && fvd.z(this.b, ((dbl)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.b;
        String string = String.valueOf(this.c);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("JsonManifestParser{extraHandler=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", indexSpecs=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

