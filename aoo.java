/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.hardware.display.DisplayManager
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.view.WindowManager
 *  android.view.accessibility.CaptioningManager
 */
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;

public final class aoo
extends afa {
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final SparseArray s;
    public final SparseBooleanArray t;

    @Deprecated
    public aoo() {
        this.s = new SparseArray();
        this.t = new SparseBooleanArray();
        this.a();
    }

    /*
     * Unable to fully structure code
     */
    public aoo(Context var1_1) {
        block9: {
            super();
            var2_2 = agf.a;
            var4_3 = (CaptioningManager)var1_1.getSystemService("captioning");
            if (var4_3 != null && var4_3.isEnabled()) {
                this.i = 1088;
                if ((var4_3 = var4_3.getLocale()) != null) {
                    this.h = gzx.q(var4_3.toLanguageTag());
                }
            }
            var4_3 = (var4_3 = (DisplayManager)var1_1.getSystemService("display")) != null ? var4_3.getDisplay(0) : null;
            var5_4 = var4_3;
            if (var4_3 == null) {
                var4_3 = (WindowManager)var1_1.getSystemService("window");
                abr.i(var4_3);
                var5_4 = var4_3.getDefaultDisplay();
            }
            if (var5_4.getDisplayId() != 0 || !agf.u(var1_1)) ** GOTO lbl-1000
            var4_3 = agf.a < 28 ? agf.s("sys.display-size") : agf.s("vendor.display-size");
            if (TextUtils.isEmpty((CharSequence)var4_3)) ** GOTO lbl32
            try {
                var6_5 = agf.w(var4_3.trim(), "x");
                if (((String[])var6_5).length != 2) break block9;
                var2_2 = Integer.parseInt(var6_5[0]);
                var3_7 = Integer.parseInt(var6_5[1]);
                if (var2_2 <= 0 || var3_7 <= 0) break block9;
            }
            catch (NumberFormatException var6_6) {
                ** continue;
            }
            var6_5 = new Point(var2_2, var3_7);
            var1_1 = var6_5;
            ** GOTO lbl39
        }
lbl30:
        // 2 sources

        while (true) {
            afx.b("Util", "Invalid display size: ".concat(String.valueOf(var4_3)));
lbl32:
            // 2 sources

            if ("Sony".equals(agf.c) && agf.d.startsWith("BRAVIA") && var1_1.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                var1_1 = new Point(3840, 2160);
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = new Point();
                var4_3 = var5_4.getMode();
                var1_1.x = var4_3.getPhysicalWidth();
                var1_1.y = var4_3.getPhysicalHeight();
            }
lbl39:
            // 3 sources

            var3_7 = var1_1.x;
            var2_2 = var1_1.y;
            this.a = var3_7;
            this.b = var2_2;
            this.c = true;
            this.s = new SparseArray();
            this.t = new SparseBooleanArray();
            this.a();
            return;
        }
    }

    private final void a() {
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = true;
    }
}

