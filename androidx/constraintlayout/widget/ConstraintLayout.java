/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout
extends ViewGroup {
    final SparseArray a = new SparseArray();
    public final ArrayList b = new ArrayList(4);
    protected final qh c = new qh();
    protected boolean d = true;
    public int e = 257;
    public HashMap f;
    final rg g;
    private int h = 0;
    private int i = 0;
    private int j = Integer.MAX_VALUE;
    private int k = Integer.MAX_VALUE;
    private ro l = null;
    private int m = -1;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.f = new HashMap();
        this.n = new SparseArray();
        this.g = new rg(this, this);
        this.d(null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new HashMap();
        this.n = new SparseArray();
        this.g = new rg(this, this);
        this.d(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.f = new HashMap();
        this.n = new SparseArray();
        this.g = new rg(this, this);
        this.d(attributeSet, n2, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.f = new HashMap();
        this.n = new SparseArray();
        this.g = new rg(this, this);
        this.d(attributeSet, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d(AttributeSet attributeSet, int n2, int n3) {
        block6: {
            rg rg2;
            Object object = this.c;
            ((qg)object).ag = this;
            ((qh)object).aG = rg2 = this.g;
            ((qh)object).a.g = rg2;
            this.a.put(this.getId(), (Object)this);
            this.l = null;
            if (attributeSet == null) break block6;
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, rs.b, n2, n3);
            n3 = attributeSet.getIndexCount();
            n2 = 0;
            while (true) {
                block9: {
                    block7: {
                        int n4;
                        block14: {
                            block13: {
                                block12: {
                                    block11: {
                                        block10: {
                                            block8: {
                                                if (n2 >= n3) break block7;
                                                n4 = attributeSet.getIndex(n2);
                                                if (n4 != 16) break block8;
                                                this.h = attributeSet.getDimensionPixelOffset(16, this.h);
                                                break block9;
                                            }
                                            if (n4 != 17) break block10;
                                            this.i = attributeSet.getDimensionPixelOffset(17, this.i);
                                            break block9;
                                        }
                                        if (n4 != 14) break block11;
                                        this.j = attributeSet.getDimensionPixelOffset(14, this.j);
                                        break block9;
                                    }
                                    if (n4 != 15) break block12;
                                    this.k = attributeSet.getDimensionPixelOffset(15, this.k);
                                    break block9;
                                }
                                if (n4 != 113) break block13;
                                this.e = attributeSet.getInt(113, this.e);
                                break block9;
                            }
                            if (n4 != 56) break block14;
                            n4 = attributeSet.getResourceId(56, 0);
                            if (n4 == 0) break block9;
                            try {
                                rg2 = this.getContext();
                                SparseArray sparseArray = new SparseArray();
                                object = new SparseArray();
                                ki.g((Context)rg2, n4, sparseArray, (SparseArray)object);
                            }
                            catch (Resources.NotFoundException notFoundException) {}
                        }
                        if (n4 == 34) {
                            n4 = attributeSet.getResourceId(34, 0);
                            try {
                                this.l = object = new ro();
                                ((ro)object).c(this.getContext(), n4);
                            }
                            catch (Resources.NotFoundException notFoundException) {
                                this.l = null;
                            }
                            this.m = n4;
                        }
                        break block9;
                    }
                    attributeSet.recycle();
                    break;
                }
                ++n2;
            }
        }
        this.c.U(this.e);
    }

    private final void e() {
        this.d = true;
    }

    /*
     * Exception decompiling
     */
    private final void f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CASE]], but top level block is 11[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private final void g(qg qg2, rf rf2, SparseArray object, int n2, int n3) {
        Object object2 = (View)this.a.get(n2);
        if ((object = (qg)object.get(n2)) != null && object2 != null && object2.getLayoutParams() instanceof rf) {
            rf2.ag = true;
            if (n3 == 6) {
                object2 = (rf)object2.getLayoutParams();
                object2.ag = true;
                object2.av.F = true;
            }
            qg2.K(6).j(((qg)object).K(n3), rf2.D, rf2.C);
            qg2.F = true;
            qg2.K(3).d();
            qg2.K(5).d();
        }
    }

    public final View aX(int n2) {
        return (View)this.a.get(n2);
    }

    public final qg b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof rf) {
                return ((rf)view.getLayoutParams()).av;
            }
            view.setLayoutParams((ViewGroup.LayoutParams)new rf(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof rf) {
                return ((rf)view.getLayoutParams()).av;
            }
        }
        return null;
    }

    protected final boolean c() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0 && this.getLayoutDirection() == 1;
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rf;
    }

    protected final void dispatchDraw(Canvas canvas) {
        int n2;
        int n3;
        Object object = this.b;
        if (object != null && (n3 = object.size()) > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                object = (rd)((Object)this.b.get(n2));
            }
        }
        super.dispatchDraw(canvas);
        if (this.isInEditMode()) {
            float f2 = this.getWidth();
            float f3 = this.getHeight();
            n3 = this.getChildCount();
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.getChildAt(n2);
                if (object.getVisibility() == 8 || (object = object.getTag()) == null || !(object instanceof String) || ((String[])(object = ((String)object).split(","))).length != 4) continue;
                int n4 = Integer.parseInt(object[0]);
                int n5 = Integer.parseInt(object[1]);
                int n6 = Integer.parseInt(object[2]);
                int n7 = Integer.parseInt(object[3]);
                float f4 = (float)n4 / 1080.0f;
                float f5 = (float)n5 / 1920.0f;
                float f6 = (float)n6 / 1080.0f;
                float f7 = (float)n7 / 1920.0f;
                object = new Paint();
                object.setColor(-65536);
                n5 = (int)(f5 * f3);
                n6 = (int)(f4 * f2);
                f5 = (int)(f6 * f2) + n6;
                f4 = n6;
                f6 = n5;
                canvas.drawLine(f4, f6, f5, f6, object);
                f7 = n5 + (int)(f7 * f3);
                canvas.drawLine(f5, f6, f5, f7, object);
                canvas.drawLine(f5, f7, f4, f7, object);
                canvas.drawLine(f4, f7, f4, f6, object);
                object.setColor(-16711936);
                canvas.drawLine(f4, f6, f5, f7, object);
                canvas.drawLine(f4, f7, f5, f6, object);
            }
        }
    }

    public final void forceLayout() {
        this.e();
        super.forceLayout();
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rf();
    }

    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new rf(layoutParams);
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        Object object;
        n4 = this.getChildCount();
        bl2 = this.isInEditMode();
        n3 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            boolean bl3;
            View view = this.getChildAt(n2);
            object = (rf)view.getLayoutParams();
            qg qg2 = object.av;
            if (view.getVisibility() == 8 && !object.ah && !object.ai) {
                bl3 = object.ak;
                if (!bl2) continue;
            }
            bl3 = object.aj;
            n5 = qg2.k();
            int n6 = qg2.l();
            view.layout(n5, n6, qg2.j() + n5, qg2.h() + n6);
            if (!(view instanceof rq)) {
                continue;
            }
            object = (rq)view;
            throw null;
        }
        n4 = this.b.size();
        if (n4 > 0) {
            for (n2 = n3; n2 < n4; ++n2) {
                object = (rd)((Object)this.b.get(n2));
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected final void onMeasure(int var1_1, int var2_2) {
        block97: {
            block98: {
                block96: {
                    block91: {
                        block95: {
                            block92: {
                                block82: {
                                    block81: {
                                        block94: {
                                            block93: {
                                                block80: {
                                                    block89: {
                                                        block90: {
                                                            block87: {
                                                                block88: {
                                                                    block86: {
                                                                        block84: {
                                                                            block85: {
                                                                                if (!this.d) {
                                                                                    var4_3 = this.getChildCount();
                                                                                    for (var3_4 = 0; var3_4 < var4_3; ++var3_4) {
                                                                                        if (!this.getChildAt(var3_4).isLayoutRequested()) continue;
                                                                                        this.d = true;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                this.c.c = this.c();
                                                                                if (this.d) {
                                                                                    this.d = false;
                                                                                    var4_3 = this.getChildCount();
                                                                                    for (var3_4 = 0; var3_4 < var4_3; ++var3_4) {
                                                                                        if (!this.getChildAt(var3_4).isLayoutRequested()) continue;
                                                                                        this.f();
                                                                                        var22_5 = this.c;
                                                                                        var22_5.aH.g((qh)var22_5);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var22_5 = this.c;
                                                                                var23_6 = var22_5.d;
                                                                                var15_7 = this.e;
                                                                                var10_8 = View.MeasureSpec.getMode((int)var1_1);
                                                                                var9_9 = View.MeasureSpec.getSize((int)var1_1);
                                                                                var8_10 = View.MeasureSpec.getMode((int)var2_2);
                                                                                var7_11 = View.MeasureSpec.getSize((int)var2_2);
                                                                                var13_12 = Math.max(0, this.getPaddingTop());
                                                                                var5_13 = Math.max(0, this.getPaddingBottom());
                                                                                var6_14 = var13_12 + var5_13;
                                                                                var3_4 = Math.max(0, this.getPaddingLeft()) + Math.max(0, this.getPaddingRight());
                                                                                var4_3 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
                                                                                if (var4_3 > 0) {
                                                                                    var3_4 = var4_3;
                                                                                }
                                                                                var23_6 = this.g;
                                                                                var23_6.b = var13_12;
                                                                                var23_6.c = var5_13;
                                                                                var23_6.d = var3_4;
                                                                                var23_6.e = var6_14;
                                                                                var23_6.f = var1_1;
                                                                                var23_6.g = var2_2;
                                                                                var4_3 = Math.max(0, this.getPaddingStart());
                                                                                var5_13 = Math.max(0, this.getPaddingEnd());
                                                                                if (var4_3 <= 0 && var5_13 <= 0) {
                                                                                    var4_3 = Math.max(0, this.getPaddingLeft());
                                                                                } else if (this.c()) {
                                                                                    var4_3 = var5_13;
                                                                                }
                                                                                var9_9 -= var3_4;
                                                                                var11_15 = var7_11 - var6_14;
                                                                                var23_6 = this.g;
                                                                                var14_16 = var23_6.e;
                                                                                var16_17 = var23_6.d;
                                                                                var7_11 = this.getChildCount();
                                                                                if (var10_8 == -2147483648) break block84;
                                                                                if (var10_8 == 0) break block85;
                                                                                var5_13 = var10_8 != 0x40000000 ? 0 : Math.min(this.j - var16_17, var9_9);
                                                                                var6_14 = 1;
                                                                                break block86;
                                                                            }
                                                                            if (var7_11 == 0) {
                                                                                var3_4 = this.h;
                                                                                var7_11 = 0;
                                                                                var3_4 = Math.max(0, var3_4);
                                                                            } else {
                                                                                var3_4 = 0;
                                                                            }
                                                                            ** GOTO lbl71
                                                                        }
                                                                        if (var7_11 == 0) {
                                                                            var5_13 = Math.max(0, this.h);
                                                                            var6_14 = 2;
                                                                            var7_11 = 0;
                                                                        } else {
                                                                            var3_4 = var9_9;
lbl71:
                                                                            // 3 sources

                                                                            var6_14 = 2;
                                                                            var5_13 = var3_4;
                                                                        }
                                                                    }
                                                                    if (var8_10 == -2147483648) break block87;
                                                                    if (var8_10 == 0) break block88;
                                                                    if (var8_10 != 0x40000000) {
                                                                        var3_4 = 1;
                                                                        var7_11 = 0;
                                                                    } else {
                                                                        var7_11 = Math.min(this.k - var14_16, var11_15);
                                                                        var3_4 = 1;
                                                                    }
                                                                    break block89;
                                                                }
                                                                var3_4 = var7_11 == 0 ? Math.max(0, this.i) : 0;
                                                                break block90;
                                                            }
                                                            var3_4 = var7_11 == 0 ? Math.max(0, this.i) : var11_15;
                                                        }
                                                        var12_18 = 2;
                                                        var7_11 = var3_4;
                                                        var3_4 = var12_18;
                                                    }
                                                    if (var5_13 != var22_5.j() || var7_11 != var22_5.h()) {
                                                        var22_5.a.c = true;
                                                    }
                                                    var22_5.Z = 0;
                                                    var22_5.aa = 0;
                                                    var12_18 = this.j;
                                                    var23_6 = var22_5.D;
                                                    var23_6[0] = var12_18 - var16_17;
                                                    var23_6[1] = this.k - var14_16;
                                                    var22_5.B(0);
                                                    var22_5.A(0);
                                                    var22_5.P(var6_14);
                                                    var22_5.C(var5_13);
                                                    var22_5.Q(var3_4);
                                                    var22_5.x(var7_11);
                                                    var22_5.B(this.h - var16_17);
                                                    var22_5.A(this.i - var14_16);
                                                    var22_5.ar = var4_3;
                                                    var22_5.as = var13_12;
                                                    var25_19 = var22_5.aH;
                                                    var24_20 = var22_5.aG;
                                                    var14_16 = var22_5.aI.size();
                                                    var21_21 = ql.b(var15_7, 128);
                                                    var13_12 = var22_5.j();
                                                    var12_18 = var22_5.h();
                                                    var3_4 = var21_21 == 0 && !ql.b(var15_7, 64) ? 0 : 1;
                                                    var6_14 = var3_4;
                                                    if (var3_4 != 0) {
                                                        var5_13 = 0;
                                                        block2: while (true) {
                                                            var6_14 = var3_4;
                                                            if (var5_13 >= var14_16) break;
                                                            var23_6 = (qg)var22_5.aI.get(var5_13);
                                                            var4_3 = var23_6.M();
                                                            var6_14 = var23_6.N();
                                                            var4_3 = var4_3 == 3 && var6_14 == 3 && var23_6.X > 0.0f ? 1 : 0;
                                                            var6_14 = var4_3;
                                                            if (var23_6.H()) {
                                                                if (var4_3 != 0) {
                                                                    while (true) {
                                                                        var6_14 = 0;
                                                                        break block2;
                                                                        break;
                                                                    }
                                                                }
                                                                var6_14 = 0;
                                                            }
                                                            if (var23_6.I() && var6_14 != 0 || var23_6 instanceof qm || var23_6.H() || var23_6.I()) ** continue;
                                                            ++var5_13;
                                                        }
                                                    }
                                                    var3_4 = var10_8;
                                                    if (var10_8 == 0x40000000) {
                                                        if (var8_10 != 0x40000000) {
                                                            var3_4 = 0x40000000;
                                                        } else {
                                                            var4_3 = 0x40000000;
                                                            var3_4 = 0x40000000;
lbl145:
                                                            // 2 sources

                                                            while (true) {
                                                                var7_11 = 1;
                                                                var5_13 = var4_3;
                                                                var8_10 = var3_4;
                                                                var4_3 = var7_11;
                                                                break block80;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (var21_21 != 0) {
                                                        var4_3 = var3_4;
                                                        var3_4 = var8_10;
                                                        ** continue;
                                                    }
                                                    var4_3 = 0;
                                                    var5_13 = var3_4;
                                                }
                                                var3_4 = var6_14 & var4_3;
                                                if (var3_4 == 0) break block91;
                                                var7_11 = Math.min(var22_5.D[0], var9_9);
                                                var4_3 = Math.min(var22_5.D[1], var11_15);
                                                var6_14 = var5_13 == 0x40000000 ? 0 : 1;
                                                if (var5_13 == 0x40000000 && var22_5.j() != var7_11) {
                                                    var22_5.C(var7_11);
                                                    var22_5.c();
                                                }
                                                var7_11 = var8_10 == 0x40000000 ? 0 : 1;
                                                if (var8_10 == 0x40000000 && var22_5.h() != var4_3) {
                                                    var22_5.x(var4_3);
                                                    var22_5.c();
                                                }
                                                if (var5_13 != 0x40000000 || var8_10 != 0x40000000) break block92;
                                                var26_22 = var22_5.a;
                                                if (var26_22.b || var26_22.c) {
                                                    var23_6 = var26_22.a.aI;
                                                    var5_13 = var23_6.size();
                                                    for (var4_3 = 0; var4_3 < var5_13; ++var4_3) {
                                                        var27_23 = (qg)var23_6.get(var4_3);
                                                        var27_23.r();
                                                        var27_23.e = false;
                                                        var27_23.h.g();
                                                        var27_23.i.g();
                                                    }
                                                    var26_22.a.r();
                                                    var23_6 = var26_22.a;
                                                    var23_6.e = false;
                                                    var23_6.h.g();
                                                    var26_22.a.i.g();
                                                    var26_22.c = false;
                                                }
                                                var26_22.d(var26_22.d);
                                                var23_6 = var26_22.a;
                                                var23_6.Z = 0;
                                                var23_6.aa = 0;
                                                var10_8 = var23_6.L(0);
                                                var4_3 = var26_22.a.L(1);
                                                if (var26_22.b) {
                                                    var26_22.b();
                                                }
                                                var23_6 = var26_22.a;
                                                var15_7 = var23_6.k();
                                                var11_15 = var23_6.l();
                                                var23_6.h.h.c(var15_7);
                                                var26_22.a.i.h.c(var11_15);
                                                var26_22.c();
                                                if (var10_8 == 2) break block93;
                                                var9_9 = var10_8;
                                                var8_10 = var4_3;
                                                if (var4_3 != 2) break block81;
                                                var5_13 = var21_21 ^ 1;
                                                var4_3 = 2;
                                                break block94;
                                            }
                                            var5_13 = var21_21 != 0 ? 0 : 1;
                                        }
                                        var9_9 = var10_8;
                                        var8_10 = var4_3;
                                        if (1 != var5_13) {
                                            var23_6 = var26_22.e;
                                            var8_10 = var23_6.size();
                                            for (var5_13 = 0; var5_13 < var8_10; ++var5_13) {
                                                var20_24 = (int)((ra)var23_6.get(var5_13)).e();
                                                if (var20_24 != 0) continue;
                                                var9_9 = var10_8;
                                                var8_10 = var4_3;
                                                break block81;
                                            }
                                            var5_13 = var10_8;
                                            if (var10_8 == 2) {
                                                var26_22.a.P(1);
                                                var23_6 = var26_22.a;
                                                var23_6.C(var26_22.a((qh)var23_6, 0));
                                                var23_6 = var26_22.a;
                                                var23_6.h.e.c(var23_6.j());
                                                var5_13 = 2;
                                            }
                                            var9_9 = var5_13;
                                            var8_10 = var4_3;
                                            if (var4_3 == 2) {
                                                var26_22.a.Q(1);
                                                var23_6 = var26_22.a;
                                                var23_6.x(var26_22.a((qh)var23_6, 1));
                                                var23_6 = var26_22.a;
                                                var23_6.i.e.c(var23_6.h());
                                                var8_10 = var4_3;
                                                var9_9 = var5_13;
                                            }
                                        }
                                    }
                                    var23_6 = var26_22.a;
                                    var4_3 = var23_6.aq[0];
                                    if (var4_3 != 1 && var4_3 != 4) {
                                        var4_3 = 0;
                                    } else {
                                        var4_3 = var23_6.j() + var15_7;
                                        var23_6.h.i.c(var4_3);
                                        var26_22.a.h.e.c(var4_3 - var15_7);
                                        var26_22.c();
                                        var23_6 = var26_22.a;
                                        var4_3 = var23_6.aq[1];
                                        if (var4_3 == 1 || var4_3 == 4) {
                                            var4_3 = var23_6.h() + var11_15;
                                            var23_6.i.i.c(var4_3);
                                            var26_22.a.i.e.c(var4_3 - var11_15);
                                        }
                                        var26_22.c();
                                        var4_3 = 1;
                                    }
                                    var23_6 = var26_22.e;
                                    var5_13 = var23_6.size();
                                    for (var10_8 = 0; var10_8 < var5_13; ++var10_8) {
                                        var27_23 = (ra)var23_6.get(var10_8);
                                        if (var27_23.d == var26_22.a && !var27_23.g) continue;
                                        var27_23.c();
                                    }
                                    var23_6 = var26_22.e;
                                    var10_8 = var23_6.size();
                                    for (var5_13 = 0; var5_13 < var10_8; ++var5_13) {
                                        var27_23 = (ra)var23_6.get(var5_13);
                                        if (var4_3 == 0 && var27_23.d == var26_22.a) continue;
                                        if (!var27_23.h.i) {
                                            while (true) {
                                                var20_24 = 0;
                                                break block82;
                                                break;
                                            }
                                        }
                                        if (!var27_23.i.i && !(var27_23 instanceof qv) || !var27_23.e.i && !(var27_23 instanceof qp) && !(var27_23 instanceof qv)) ** continue;
                                    }
                                    var20_24 = 1;
                                }
                                var26_22.a.P(var9_9);
                                var26_22.a.Q(var8_10);
                                var4_3 = var3_4;
                                var3_4 = 2;
                                break block95;
                            }
                            var26_22 = var22_5.a;
                            if (var26_22.b) {
                                var23_6 = var26_22.a.aI;
                                var4_3 = var23_6.size();
                                for (var9_9 = 0; var9_9 < var4_3; ++var9_9) {
                                    var27_23 = (qg)var23_6.get(var9_9);
                                    var27_23.r();
                                    var27_23.e = false;
                                    var28_25 = var27_23.h;
                                    var28_25.e.i = false;
                                    var28_25.g = false;
                                    var28_25.g();
                                    var27_23 = var27_23.i;
                                    var27_23.e.i = false;
                                    var27_23.g = false;
                                    var27_23.g();
                                }
                                var26_22.a.r();
                                var23_6 = var26_22.a;
                                var23_6.e = false;
                                var23_6 = var23_6.h;
                                var23_6.e.i = false;
                                var23_6.g = false;
                                var23_6.g();
                                var23_6 = var26_22.a.i;
                                var23_6.e.i = false;
                                var23_6.g = false;
                                var23_6.g();
                                var26_22.b();
                                var4_3 = var3_4;
                            } else {
                                var4_3 = var3_4;
                            }
                            var26_22.d(var26_22.d);
                            var23_6 = var26_22.a;
                            var23_6.Z = 0;
                            var23_6.aa = 0;
                            var23_6.h.h.c(0);
                            var26_22.a.i.h.c(0);
                            if (var5_13 == 0x40000000) {
                                var20_24 = var22_5.V((boolean)var21_21, 0);
                                var3_4 = 1;
                            } else {
                                var3_4 = 0;
                                var20_24 = 1;
                            }
                            if (var8_10 == 0x40000000) {
                                var20_24 = var22_5.V((boolean)var21_21, 1) & var20_24;
                                ++var3_4;
                            }
                        }
                        var21_21 = var20_24;
                        var5_13 = var3_4;
                        var8_10 = var4_3;
                        if (var20_24 != 0) {
                            var22_5.D((boolean)(var6_14 ^ 1), (boolean)(var7_11 ^ 1));
                            var21_21 = var20_24;
                            var5_13 = var3_4;
                            var8_10 = var4_3;
                        }
                        break block96;
                    }
                    var21_21 = 0;
                    var5_13 = 0;
                    var8_10 = var3_4;
                }
                if (var21_21 != 0 && var5_13 == 2) break block97;
                var5_13 = var22_5.ax;
                if (var14_16 <= 0) break block98;
                var7_11 = var22_5.aI.size();
                var20_24 = var22_5.W(64);
                var23_6 = var22_5.aG;
                for (var6_14 = 0; var6_14 < var7_11; ++var6_14) {
                    block102: {
                        block99: {
                            block100: {
                                block101: {
                                    var27_23 = (qg)var22_5.aI.get(var6_14);
                                    if (var27_23 instanceof qj || var27_23 instanceof qd) continue;
                                    var21_21 = var27_23.G;
                                    if (var20_24 != 0 && (var28_25 = var27_23.h) != null && (var26_22 = var27_23.i) != null && var28_25.e.i && var26_22.e.i) continue;
                                    var10_8 = var27_23.L(0);
                                    var9_9 = var27_23.L(1);
                                    var3_4 = var10_8;
                                    var4_3 = var9_9;
                                    if (var10_8 != 3) break block99;
                                    if (var27_23.s == 1 || var9_9 != 3) break block100;
                                    if (var27_23.t == 1) break block101;
                                    var10_8 = 1;
                                    var4_3 = 3;
                                    var9_9 = 3;
                                    break block102;
                                }
                                var3_4 = 3;
                                var4_3 = 3;
                                break block99;
                            }
                            var3_4 = 3;
                            var4_3 = var9_9;
                        }
                        var10_8 = 0;
                        var9_9 = var4_3;
                        var4_3 = var3_4;
                    }
                    if (var10_8 != 0) continue;
                    if (var22_5.W(1) && !(var27_23 instanceof qm)) {
                        var3_4 = var4_3 == 3 && var27_23.s == 0 && var9_9 != 3 && var27_23.H() == false ? 1 : 0;
                        var10_8 = var3_4;
                        if (var9_9 == 3) {
                            var10_8 = var3_4;
                            if (var27_23.t == 0) {
                                var10_8 = var3_4;
                                if (var4_3 != 3) {
                                    var10_8 = var3_4;
                                    if (!var27_23.H()) {
                                        var10_8 = 1;
                                    }
                                }
                            }
                        }
                        if (var4_3 == 3 || var9_9 == 3) {
                            if (var27_23.X > 0.0f) continue;
                        }
                        if (var10_8 != 0) continue;
                    }
                    var25_19.h((rg)var23_6, (qg)var27_23, 0);
                }
                var4_3 = var23_6.a.getChildCount();
                for (var3_4 = 0; var3_4 < var4_3; ++var3_4) {
                    var26_22 = var23_6.a.getChildAt(var3_4);
                    if (!(var26_22 instanceof rq)) {
                        continue;
                    }
                    var22_5 = (rq)var26_22;
                    var22_5 = var23_6.a;
                    throw null;
                }
                var4_3 = var23_6.a.b.size();
                if (var4_3 > 0) {
                    for (var3_4 = 0; var3_4 < var4_3; ++var3_4) {
                        var26_22 = (rd)var23_6.a.b.get(var3_4);
                        var26_22 = var23_6.a;
                    }
                }
            }
            var25_19.g((qh)var22_5);
            var11_15 = ((ArrayList)var25_19.a).size();
            if (var14_16 > 0) {
                var25_19.i((qh)var22_5, 0, var13_12, var12_18);
            }
            if (var11_15 > 0) {
                var15_7 = var22_5.M();
                var14_16 = var22_5.N();
                var4_3 = Math.max(var22_5.j(), ((qg)var25_19.c).ac);
                var3_4 = Math.max(var22_5.h(), ((qg)var25_19.c).ad);
                var6_14 = 0;
                for (var9_9 = 0; var9_9 < var11_15; ++var9_9) {
                    var23_6 = (qg)((ArrayList)var25_19.a).get(var9_9);
                    if (var23_6 instanceof qm) {
                        var17_26 = var23_6.j();
                        var10_8 = var23_6.h();
                        var20_24 = var25_19.h((rg)var24_20, (qg)var23_6, 1);
                        var18_27 = var23_6.j();
                        var7_11 = var6_14 | var20_24;
                        var16_17 = var23_6.h();
                        var6_14 = var4_3;
                        if (var18_27 != var17_26) {
                            var23_6.C(var18_27);
                            var6_14 = var4_3;
                            if (var15_7 == 2) {
                                var6_14 = var4_3;
                                if (var23_6.i() > var4_3) {
                                    var6_14 = Math.max(var4_3, var23_6.i() + var23_6.K(4).b());
                                }
                            }
                            var7_11 = 1;
                        }
                        var4_3 = var3_4;
                        if (var16_17 != var10_8) {
                            var23_6.x(var16_17);
                            var4_3 = var3_4;
                            if (var14_16 == 2) {
                                var4_3 = var3_4;
                                if (var23_6.g() > var3_4) {
                                    var4_3 = Math.max(var3_4, var23_6.g() + var23_6.K(5).b());
                                }
                            }
                            var7_11 = 1;
                        }
                        var23_6 = (qm)var23_6;
                        var10_8 = var7_11;
                        var7_11 = var6_14;
                        var3_4 = var4_3;
                        var6_14 = var10_8;
                    } else {
                        var7_11 = var4_3;
                    }
                    var4_3 = var7_11;
                }
                var9_9 = 0;
                var7_11 = var6_14;
                var10_8 = var3_4;
                var6_14 = var11_15;
                var23_6 = var24_20;
                while (true) {
                    var24_20 = var22_5;
                    var3_4 = var5_13;
                    if (var9_9 >= 2) break block83;
                    var11_15 = 0;
                    var3_4 = var10_8;
                    for (var10_8 = var11_15; var10_8 < var6_14; ++var10_8) {
                        var24_20 = (qg)((ArrayList)var25_19.a).get(var10_8);
                        if (var24_20 instanceof qk && !(var24_20 instanceof qm) || var24_20 instanceof qj || var24_20.ah == 8 || var8_10 != 0 && var24_20.h.e.i && var24_20.i.e.i || var24_20 instanceof qm) continue;
                        var18_27 = var24_20.j();
                        var17_26 = var24_20.h();
                        var16_17 = var24_20.ab;
                        var11_15 = 1;
                        if (var9_9 == 1) {
                            var11_15 = 2;
                        }
                        var7_11 = var25_19.h((rg)var23_6, (qg)var24_20, var11_15) | var7_11;
                        var19_28 = var24_20.j();
                        var11_15 = var24_20.h();
                        if (var19_28 != var18_27) {
                            var24_20.C(var19_28);
                            if (var15_7 == 2 && var24_20.i() > var4_3) {
                                var4_3 = Math.max(var4_3, var24_20.i() + var24_20.K(4).b());
                            }
                            var7_11 = 1;
                        }
                        if (var11_15 != var17_26) {
                            var24_20.x(var11_15);
                            if (var14_16 == 2 && var24_20.g() > var3_4) {
                                var3_4 = Math.max(var3_4, var24_20.g() + var24_20.K(5).b());
                            }
                            var7_11 = 1;
                        }
                        if (!var24_20.F || var16_17 == var24_20.ab) continue;
                        var7_11 = 1;
                    }
                    if (var7_11 == 0) break;
                    var25_19.i((qh)var22_5, ++var9_9, var13_12, var12_18);
                    var7_11 = 0;
                    var10_8 = var3_4;
                }
                var3_4 = var5_13;
            } else {
                block83: {
                    var3_4 = var5_13;
                    var24_20 = var22_5;
                }
                var22_5 = var24_20;
            }
            var22_5.U(var3_4);
        }
        var22_5 = this.c;
        var23_6 = this.g;
        var5_13 = var22_5.j();
        var3_4 = var22_5.h();
        var20_24 = var22_5.ay;
        var21_21 = var22_5.az;
        var4_3 = var23_6.e;
        var1_1 = ConstraintLayout.resolveSizeAndState((int)(var5_13 + var23_6.d), (int)var1_1, (int)0);
        var3_4 = ConstraintLayout.resolveSizeAndState((int)(var3_4 + var4_3), (int)var2_2, (int)0);
        var2_2 = Math.min(this.j, var1_1 & 0xFFFFFF);
        var3_4 = Math.min(this.k, var3_4 & 0xFFFFFF);
        var1_1 = var2_2;
        if (var20_24 != 0) {
            var1_1 = var2_2 | 0x1000000;
        }
        var2_2 = var3_4;
        if (var21_21 != 0) {
            var2_2 = var3_4 | 0x1000000;
        }
        this.setMeasuredDimension(var1_1, var2_2);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean bl2 = view instanceof Guideline;
        Object object = this.b(view);
        if (bl2 && !(object instanceof qj)) {
            object = (rf)view.getLayoutParams();
            ((rf)((Object)object)).av = new qj();
            ((rf)((Object)object)).ah = true;
            ((qj)((rf)((Object)object)).av).c(((rf)((Object)object)).Z);
        }
        if (view instanceof rd) {
            object = (rd)view;
            ((rd)((Object)object)).f();
            ((rf)view.getLayoutParams()).ai = true;
            if (!this.b.contains(object)) {
                this.b.add(object);
            }
        }
        this.a.put(view.getId(), (Object)view);
        this.d = true;
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(this.b(view));
        this.b.remove(view);
        this.d = true;
    }

    public final void requestLayout() {
        this.e();
        super.requestLayout();
    }

    public final void setId(int n2) {
        this.a.remove(this.getId());
        super.setId(n2);
        this.a.put(this.getId(), (Object)this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

