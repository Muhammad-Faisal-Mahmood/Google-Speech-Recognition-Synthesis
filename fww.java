/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

public final class fww {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ColorStateList i;
    public final float j;
    public Typeface k;
    private final int l;
    private boolean m = false;
    private boolean n = false;

    public fww(Context context, int n2) {
        TypedArray typedArray = context.obtainStyledAttributes(n2, fwu.b);
        this.j = typedArray.getDimension(0, 0.0f);
        this.i = fvc.o(context, typedArray, 3);
        fvc.o(context, typedArray, 4);
        fvc.o(context, typedArray, 5);
        this.c = typedArray.getInt(2, 0);
        this.d = typedArray.getInt(1, 1);
        int n3 = fvc.n(typedArray, 15, 10);
        this.l = typedArray.getResourceId(n3, 0);
        this.b = typedArray.getString(n3);
        typedArray.getBoolean(17, false);
        this.a = fvc.o(context, typedArray, 6);
        this.e = typedArray.getFloat(7, 0.0f);
        this.f = typedArray.getFloat(8, 0.0f);
        this.g = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
        context = context.obtainStyledAttributes(n2, fwu.a);
        context.hasValue(0);
        this.h = context.getFloat(0, 0.0f);
        context.getString(fvc.n((TypedArray)context, 3, 1));
        context.recycle();
    }

    static /* bridge */ /* synthetic */ void b(fww fww2) {
        fww2.m = true;
    }

    private final void d() {
        block1: {
            block5: {
                String string;
                block6: {
                    block2: {
                        block3: {
                            block4: {
                                if (this.k == null && (string = this.b) != null) {
                                    this.k = Typeface.create((String)string, (int)this.c);
                                }
                                if (this.k != null) break block1;
                                int n2 = this.d;
                                if (n2 == 1) break block2;
                                if (n2 == 2) break block3;
                                if (n2 == 3) break block4;
                                this.k = Typeface.DEFAULT;
                                break block5;
                            }
                            string = Typeface.MONOSPACE;
                            break block6;
                        }
                        string = Typeface.SERIF;
                        break block6;
                    }
                    string = Typeface.SANS_SERIF;
                }
                this.k = string;
            }
            this.k = Typeface.create((Typeface)this.k, (int)this.c);
        }
    }

    public final Typeface a() {
        this.d();
        return this.k;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(Context var1_1, giu var2_4) {
        block14: {
            block13: {
                block12: {
                    if (this.m) ** GOTO lbl44
                    var3_5 = this.l;
                    if (var3_5 == 0) ** GOTO lbl43
                    var5_6 /* !! */  = td.a;
                    var4_8 = var1_1.isRestricted();
                    var6_9 = null;
                    var5_6 /* !! */  = var4_8 != false ? null : td.a(var1_1, var3_5, new TypedValue(), 0, null, false, true);
                    if (var5_6 /* !! */  == null) break block12;
                    this.k = var5_6 /* !! */ ;
lbl10:
                    // 2 sources

                    while (true) {
                        this.m = true;
                        ** GOTO lbl44
                        break;
                    }
                }
                if (!this.n) break block13;
                var5_6 /* !! */  = var6_9;
                ** GOTO lbl40
            }
            this.n = true;
            var3_5 = this.l;
            var7_10 = var1_1.getResources();
            if (var3_5 == 0 || !var7_10.getResourceTypeName(var3_5).equals("font")) break block14;
            try {
                var5_6 /* !! */  = var7_10.getXml(var3_5);
                while (var5_6 /* !! */ .getEventType() != 1) {
                    block15: {
                        if (var5_6 /* !! */ .getEventType() != 2 || !var5_6 /* !! */ .getName().equals("font-family")) break block15;
                        var7_10 = var7_10.obtainAttributes(Xml.asAttributeSet((XmlPullParser)var5_6 /* !! */ ), sd.b);
                        var5_6 /* !! */  = var7_10.getString(7);
                        var7_10.recycle();
                        ** GOTO lbl39
                    }
                    var5_6 /* !! */ .next();
                }
            }
            catch (Throwable var5_7) {
                ** continue;
            }
        }
        while (true) {
            var5_6 /* !! */  = null;
lbl39:
            // 2 sources

            var5_6 /* !! */  = var5_6 /* !! */  == null ? var6_9 : ((var5_6 /* !! */  = Typeface.create((String)var5_6 /* !! */ , (int)0)) == Typeface.DEFAULT ? var6_9 : Typeface.create((Typeface)var5_6 /* !! */ , (int)this.c));
lbl40:
            // 2 sources

            if (var5_6 /* !! */  != null) {
                this.k = var5_6 /* !! */ ;
                ** continue;
            }
lbl43:
            // 3 sources

            this.d();
lbl44:
            // 3 sources

            if ((var3_5 = this.l) == 0) {
                this.m = true;
                var3_5 = 0;
            }
            if (!this.m) {
                try {
                    var5_6 /* !! */  = new fwv(this, var2_4);
                    var6_9 = td.a;
                    if (var1_1.isRestricted()) {
                        var5_6 /* !! */ .c(-4);
                        return;
                    }
                    var6_9 = new TypedValue();
                    td.a(var1_1, var3_5, (TypedValue)var6_9, 0, (tb)var5_6 /* !! */ , false, false);
                    return;
                }
                catch (Exception var1_2) {
                    this.m = true;
                    var2_4.d();
                    return;
                }
                catch (Resources.NotFoundException var1_3) {
                    this.m = true;
                    var2_4.d();
                    return;
                }
            }
            var2_4.c(this.k);
            return;
        }
    }
}

