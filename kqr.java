/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.util.StateSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.Resources;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class kqr {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public kqr() {
        this.a = -1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public kqr(Context var1_1, int var2_4) {
        super();
        this.b();
        var9_5 = var1_1 /* !! */ .getResources().getXml(var2_4);
        var11_6 = Xml.asAttributeSet((XmlPullParser)var9_5);
        while ((var2_4 = var9_5.next()) != 2) {
            if (var2_4 != 1) continue;
            super("No start tag found");
            throw var1_1 /* !! */ ;
        }
        if (!var9_5.getName().equals("selector")) ** GOTO lbl75
        var10_7 = var1_1 /* !! */ .getTheme();
        var6_8 = var9_5.getDepth() + 1;
        while ((var2_4 = var9_5.next()) != 1 && ((var3_9 = var9_5.getDepth()) >= var6_8 || var2_4 != 3)) {
            if (var2_4 != 2 || var3_9 > var6_8 || !var9_5.getName().equals("item")) continue;
            var8_13 /* !! */  = var1_1 /* !! */ .getResources();
            var8_13 /* !! */  = var10_7 == null ? var8_13 /* !! */ .obtainAttributes(var11_6, fxj.a) : var10_7.obtainStyledAttributes(var11_6, fxj.a, 0, 0);
            var2_4 = var8_13 /* !! */ .getResourceId(0, 0);
            var3_9 = var8_13 /* !! */ .getResourceId(1, 0);
            var12_15 = new fxa(0.0f);
            var13_16 = fxm.e(var1_1 /* !! */ , var2_4, var3_9, (fxd)var12_15);
            var12_15 = new fxm((gch)var13_16);
            var8_13 /* !! */ .recycle();
            var7_12 = var11_6.getAttributeCount();
            var8_13 /* !! */  = (Resources)new int[var7_12];
            var3_9 = 0;
            var2_4 = 0;
lbl28:
            // 2 sources

            while (var3_9 < var7_12) {
                var5_11 = var11_6.getAttributeNameResource(var3_9);
                var4_10 = var2_4;
                if (var5_11 == 2130969802) break block14;
                var4_10 = var2_4;
                if (var5_11 == 2130969813) break block14;
                var4_10 = var5_11;
                if (var11_6.getAttributeBooleanValue(var3_9, false)) break block15;
            }
            break block16;
        }
        ** GOTO lbl75
        {
            block16: {
                block14: {
                    block15: {
                        var4_10 = -var5_11;
                    }
                    var8_13 /* !! */ [var2_4] = (Resources)var4_10;
                    var4_10 = var2_4 + 1;
                }
                ++var3_9;
                var2_4 = var4_10;
                ** GOTO lbl28
            }
            try {
                var8_13 /* !! */  = (Resources)StateSet.trimStateSet((int[])var8_13 /* !! */ , (int)var2_4);
                var2_4 = this.a;
                if (var2_4 == 0 || ((Resources)var8_13 /* !! */ ).length == 0) {
                    this.b = var12_15;
                }
                if (var2_4 >= ((int[][])(var13_16 = this.d)).length) {
                    var3_9 = var2_4 + 10;
                    var14_17 = new int[var3_9][];
                    System.arraycopy(var13_16, 0, var14_17, 0, var2_4);
                    this.d = var14_17;
                    var13_16 = new fxm[var3_9];
                    System.arraycopy(this.c, 0, var13_16, 0, var2_4);
                    this.c = var13_16;
                }
                var13_16 = this.d;
                var2_4 = this.a;
                ((int[][])var13_16)[var2_4] = (int[])var8_13 /* !! */ ;
                ((fxm[])this.c)[var2_4] = var12_15;
                this.a = var2_4 + 1;
                continue;
            }
            catch (Throwable var1_2) {
                if (var9_5 == null) throw var1_2;
                try {
                    var9_5.close();
                    throw var1_2;
                }
                catch (Throwable var8_14) {
                    var1_2.addSuppressed(var8_14);
                    throw var1_2;
lbl75:
                    // 2 sources

                    if (var9_5 == null) return;
                    try {
                        var9_5.close();
                        return;
                    }
                    catch (Resources.NotFoundException | IOException | XmlPullParserException var1_3) {
                        this.b();
                        return;
                        break;
                    }
                }
            }
        }
    }

    public kqr(byte[] byArray) {
    }

    private final void b() {
        this.b = new fxm();
        this.d = new int[10][];
        this.c = new fxm[10];
    }

    public final css a() {
        fxf.K(this.b);
        if (this.c == null) {
            this.c = "Download result code: ".concat(String.valueOf(((csr)((Object)this.b)).name()));
        }
        return new css(this);
    }
}

