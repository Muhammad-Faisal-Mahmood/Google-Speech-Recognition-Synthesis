/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public final class rf
extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D = 0;
    boolean E = true;
    boolean F = true;
    public float G = 0.5f;
    public float H = 0.5f;
    public String I = null;
    float J = 0.0f;
    int K = 1;
    public float L = -1.0f;
    public float M = -1.0f;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public int Q = 0;
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public float V = 1.0f;
    public float W = 1.0f;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public int a = -1;
    public boolean aa = false;
    public boolean ab = false;
    public String ac = null;
    public int ad = 0;
    public boolean ae = true;
    public boolean af = true;
    public boolean ag = false;
    public boolean ah = false;
    public boolean ai = false;
    public boolean aj = false;
    public boolean ak = false;
    public int al = -1;
    public int am = -1;
    public int an = -1;
    public int ao = -1;
    public int ap;
    public int aq;
    public float ar = 0.5f;
    public int as;
    public int at;
    public float au;
    public qg av;
    public boolean aw = false;
    public int b = -1;
    public float c = -1.0f;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public float r = 0.0f;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = Integer.MIN_VALUE;
    public int x = Integer.MIN_VALUE;
    public int y = Integer.MIN_VALUE;
    public int z = Integer.MIN_VALUE;

    public rf() {
        super(-2, -2);
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.av = new qg();
    }

    public rf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.av = new qg();
        context = context.obtainStyledAttributes(attributeSet, rs.b);
        int n2 = context.getIndexCount();
        block68: for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = context.getIndex(i2);
            int n4 = re.a.get(n3);
            switch (n4) {
                default: {
                    block44 : switch (n4) {
                        default: {
                            switch (n4) {
                                default: {
                                    break block44;
                                }
                                case 67: {
                                    this.d = context.getBoolean(n3, this.d);
                                    break block44;
                                }
                                case 66: {
                                    this.ad = context.getInt(n3, this.ad);
                                    break block44;
                                }
                                case 65: {
                                    ro.e((Object)this, (TypedArray)context, n3, 1);
                                    this.F = true;
                                    break block44;
                                }
                                case 64: 
                            }
                            ro.e((Object)this, (TypedArray)context, n3, 0);
                            this.E = true;
                            break;
                        }
                        case 55: {
                            this.C = context.getDimensionPixelSize(n3, this.C);
                            break;
                        }
                        case 54: {
                            this.D = context.getDimensionPixelSize(n3, this.D);
                            break;
                        }
                        case 53: {
                            this.o = n4 = context.getResourceId(n3, this.o);
                            if (n4 != -1) continue block68;
                            this.o = context.getInt(n3, -1);
                            break;
                        }
                        case 52: {
                            this.n = n4 = context.getResourceId(n3, this.n);
                            if (n4 != -1) continue block68;
                            this.n = context.getInt(n3, -1);
                            break;
                        }
                        case 51: {
                            this.ac = context.getString(n3);
                            break;
                        }
                        case 50: {
                            this.Y = context.getDimensionPixelOffset(n3, this.Y);
                            break;
                        }
                        case 49: {
                            this.X = context.getDimensionPixelOffset(n3, this.X);
                            break;
                        }
                        case 48: {
                            this.O = context.getInt(n3, 0);
                            break;
                        }
                        case 47: {
                            this.N = context.getInt(n3, 0);
                            break;
                        }
                        case 46: {
                            this.M = context.getFloat(n3, this.M);
                            break;
                        }
                        case 45: {
                            this.L = context.getFloat(n3, this.L);
                            break;
                        }
                        case 44: {
                            ro.f(this, context.getString(n3));
                            break;
                        }
                    }
                    continue block68;
                }
                case 38: {
                    this.W = Math.max(0.0f, context.getFloat(n3, this.W));
                    this.Q = 2;
                    continue block68;
                }
                case 37: {
                    try {
                        this.U = context.getDimensionPixelSize(n3, this.U);
                    }
                    catch (Exception exception) {
                        if (context.getInt(n3, this.U) != -2) continue block68;
                        this.U = -2;
                    }
                    continue block68;
                }
                case 36: {
                    try {
                        this.S = context.getDimensionPixelSize(n3, this.S);
                    }
                    catch (Exception exception) {
                        if (context.getInt(n3, this.S) != -2) continue block68;
                        this.S = -2;
                    }
                    continue block68;
                }
                case 35: {
                    this.V = Math.max(0.0f, context.getFloat(n3, this.V));
                    this.P = 2;
                    continue block68;
                }
                case 34: {
                    try {
                        this.T = context.getDimensionPixelSize(n3, this.T);
                    }
                    catch (Exception exception) {
                        if (context.getInt(n3, this.T) != -2) continue block68;
                        this.T = -2;
                    }
                    continue block68;
                }
                case 33: {
                    try {
                        this.R = context.getDimensionPixelSize(n3, this.R);
                    }
                    catch (Exception exception) {
                        if (context.getInt(n3, this.R) != -2) continue block68;
                        this.R = -2;
                    }
                    continue block68;
                }
                case 32: {
                    this.Q = n3 = context.getInt(n3, 0);
                    if (n3 != 1) continue block68;
                    Log.e((String)"ConstraintLayout", (String)"layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    continue block68;
                }
                case 31: {
                    this.P = n3 = context.getInt(n3, 0);
                    if (n3 != 1) continue block68;
                    Log.e((String)"ConstraintLayout", (String)"layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    continue block68;
                }
                case 30: {
                    this.H = context.getFloat(n3, this.H);
                    continue block68;
                }
                case 29: {
                    this.G = context.getFloat(n3, this.G);
                    continue block68;
                }
                case 28: {
                    this.ab = context.getBoolean(n3, this.ab);
                    continue block68;
                }
                case 27: {
                    this.aa = context.getBoolean(n3, this.aa);
                    continue block68;
                }
                case 26: {
                    this.B = context.getDimensionPixelSize(n3, this.B);
                    continue block68;
                }
                case 25: {
                    this.A = context.getDimensionPixelSize(n3, this.A);
                    continue block68;
                }
                case 24: {
                    this.z = context.getDimensionPixelSize(n3, this.z);
                    continue block68;
                }
                case 23: {
                    this.y = context.getDimensionPixelSize(n3, this.y);
                    continue block68;
                }
                case 22: {
                    this.x = context.getDimensionPixelSize(n3, this.x);
                    continue block68;
                }
                case 21: {
                    this.w = context.getDimensionPixelSize(n3, this.w);
                    continue block68;
                }
                case 20: {
                    this.v = n4 = context.getResourceId(n3, this.v);
                    if (n4 != -1) continue block68;
                    this.v = context.getInt(n3, -1);
                    continue block68;
                }
                case 19: {
                    this.u = n4 = context.getResourceId(n3, this.u);
                    if (n4 != -1) continue block68;
                    this.u = context.getInt(n3, -1);
                    continue block68;
                }
                case 18: {
                    this.t = n4 = context.getResourceId(n3, this.t);
                    if (n4 != -1) continue block68;
                    this.t = context.getInt(n3, -1);
                    continue block68;
                }
                case 17: {
                    this.s = n4 = context.getResourceId(n3, this.s);
                    if (n4 != -1) continue block68;
                    this.s = context.getInt(n3, -1);
                    continue block68;
                }
                case 16: {
                    this.m = n4 = context.getResourceId(n3, this.m);
                    if (n4 != -1) continue block68;
                    this.m = context.getInt(n3, -1);
                    continue block68;
                }
                case 15: {
                    this.l = n4 = context.getResourceId(n3, this.l);
                    if (n4 != -1) continue block68;
                    this.l = context.getInt(n3, -1);
                    continue block68;
                }
                case 14: {
                    this.k = n4 = context.getResourceId(n3, this.k);
                    if (n4 != -1) continue block68;
                    this.k = context.getInt(n3, -1);
                    continue block68;
                }
                case 13: {
                    this.j = n4 = context.getResourceId(n3, this.j);
                    if (n4 != -1) continue block68;
                    this.j = context.getInt(n3, -1);
                    continue block68;
                }
                case 12: {
                    this.i = n4 = context.getResourceId(n3, this.i);
                    if (n4 != -1) continue block68;
                    this.i = context.getInt(n3, -1);
                    continue block68;
                }
                case 11: {
                    this.h = n4 = context.getResourceId(n3, this.h);
                    if (n4 != -1) continue block68;
                    this.h = context.getInt(n3, -1);
                    continue block68;
                }
                case 10: {
                    this.g = n4 = context.getResourceId(n3, this.g);
                    if (n4 != -1) continue block68;
                    this.g = context.getInt(n3, -1);
                    continue block68;
                }
                case 9: {
                    this.f = n4 = context.getResourceId(n3, this.f);
                    if (n4 != -1) continue block68;
                    this.f = context.getInt(n3, -1);
                    continue block68;
                }
                case 8: {
                    this.e = n4 = context.getResourceId(n3, this.e);
                    if (n4 != -1) continue block68;
                    this.e = context.getInt(n3, -1);
                    continue block68;
                }
                case 7: {
                    this.c = context.getFloat(n3, this.c);
                    continue block68;
                }
                case 6: {
                    this.b = context.getDimensionPixelOffset(n3, this.b);
                    continue block68;
                }
                case 5: {
                    this.a = context.getDimensionPixelOffset(n3, this.a);
                    continue block68;
                }
                case 4: {
                    float f2;
                    this.r = f2 = context.getFloat(n3, this.r) % 360.0f;
                    if (!(f2 < 0.0f)) continue block68;
                    this.r = (360.0f - f2) % 360.0f;
                    continue block68;
                }
                case 3: {
                    this.q = context.getDimensionPixelSize(n3, this.q);
                    continue block68;
                }
                case 2: {
                    this.p = n4 = context.getResourceId(n3, this.p);
                    if (n4 != -1) continue block68;
                    this.p = context.getInt(n3, -1);
                    continue block68;
                }
                case 1: {
                    this.Z = context.getInt(n3, this.Z);
                }
            }
        }
        context.recycle();
        this.a();
    }

    public rf(ViewGroup.LayoutParams object) {
        super(object);
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.av = new qg();
        if (!(object instanceof rf)) {
            return;
        }
        object = (rf)((Object)object);
        this.a = object.a;
        this.b = object.b;
        this.c = object.c;
        this.d = object.d;
        this.e = object.e;
        this.f = object.f;
        this.g = object.g;
        this.h = object.h;
        this.i = object.i;
        this.j = object.j;
        this.k = object.k;
        this.l = object.l;
        this.m = object.m;
        this.n = object.n;
        this.o = object.o;
        this.p = object.p;
        this.q = object.q;
        this.r = object.r;
        this.s = object.s;
        this.t = object.t;
        this.u = object.u;
        this.v = object.v;
        this.w = object.w;
        this.x = object.x;
        this.y = object.y;
        this.z = object.z;
        this.A = object.A;
        this.B = object.B;
        this.C = object.C;
        this.D = object.D;
        this.G = object.G;
        this.H = object.H;
        this.I = object.I;
        this.J = object.J;
        this.K = object.K;
        this.L = object.L;
        this.M = object.M;
        this.N = object.N;
        this.O = object.O;
        this.aa = object.aa;
        this.ab = object.ab;
        this.P = object.P;
        this.Q = object.Q;
        this.R = object.R;
        this.T = object.T;
        this.S = object.S;
        this.U = object.U;
        this.V = object.V;
        this.W = object.W;
        this.X = object.X;
        this.Y = object.Y;
        this.Z = object.Z;
        this.ae = object.ae;
        this.af = object.af;
        this.ag = object.ag;
        this.ah = object.ah;
        this.al = object.al;
        this.am = object.am;
        this.an = object.an;
        this.ao = object.ao;
        this.ap = object.ap;
        this.aq = object.aq;
        this.ar = object.ar;
        this.ac = object.ac;
        this.ad = object.ad;
        this.av = object.av;
        this.E = object.E;
        this.F = object.F;
    }

    public final void a() {
        this.ah = false;
        this.ae = true;
        this.af = true;
        if (this.width == -2 && this.aa) {
            this.ae = false;
            if (this.P == 0) {
                this.P = 1;
            }
        }
        if (this.height == -2 && this.ab) {
            this.af = false;
            if (this.Q == 0) {
                this.Q = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.ae = false;
            if (this.width == 0 && this.P == 1) {
                this.width = -2;
                this.aa = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.af = false;
            if (this.height == 0 && this.Q == 1) {
                this.height = -2;
                this.ab = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ah = true;
        this.ae = true;
        this.af = true;
        if (!(this.av instanceof qj)) {
            this.av = new qj();
        }
        ((qj)this.av).c(this.Z);
    }

    /*
     * Unable to fully structure code
     */
    public final void resolveLayoutDirection(int var1_1) {
        var4_2 = this.leftMargin;
        var5_3 = this.rightMargin;
        super.resolveLayoutDirection(var1_1);
        var1_1 = this.getLayoutDirection();
        this.an = -1;
        this.ao = -1;
        this.al = -1;
        this.am = -1;
        this.ap = this.w;
        this.aq = this.y;
        this.ar = var2_4 = this.G;
        this.as = var6_5 = this.a;
        this.at = var7_6 = this.b;
        this.au = var3_7 = this.c;
        if (var1_1 == 1) {
            var1_1 = this.s;
            if (var1_1 != -1) {
                this.an = var1_1;
lbl19:
                // 2 sources

                while (true) {
                    var1_1 = 1;
                    break;
                }
            } else {
                var1_1 = this.t;
                if (var1_1 != -1) {
                    this.ao = var1_1;
                    ** continue;
                }
                var1_1 = 0;
            }
            var8_8 = this.u;
            if (var8_8 != -1) {
                this.am = var8_8;
                var1_1 = 1;
            }
            if ((var8_8 = this.v) != -1) {
                this.al = var8_8;
                var1_1 = 1;
            }
            if ((var8_8 = this.A) != -2147483648) {
                this.aq = var8_8;
            }
            if ((var8_8 = this.B) != -2147483648) {
                this.ap = var8_8;
            }
            if (var1_1 != 0) {
                this.ar = 1.0f - var2_4;
            }
            if (this.ah && this.Z == 1 && this.d) {
                if (var3_7 != -1.0f) {
                    this.au = 1.0f - var3_7;
                    this.as = -1;
                    this.at = -1;
                } else if (var6_5 != -1) {
                    this.at = var6_5;
                    this.as = -1;
lbl49:
                    // 2 sources

                    while (true) {
                        this.au = -1.0f;
                        break;
                    }
                } else if (var7_6 != -1) {
                    this.as = var7_6;
                    this.at = -1;
                    ** continue;
                }
            }
        } else {
            var1_1 = this.s;
            if (var1_1 != -1) {
                this.am = var1_1;
            }
            if ((var1_1 = this.t) != -1) {
                this.al = var1_1;
            }
            if ((var1_1 = this.u) != -1) {
                this.an = var1_1;
            }
            if ((var1_1 = this.v) != -1) {
                this.ao = var1_1;
            }
            if ((var1_1 = this.A) != -2147483648) {
                this.ap = var1_1;
            }
            if ((var1_1 = this.B) != -2147483648) {
                this.aq = var1_1;
            }
        }
        if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
            var1_1 = this.g;
            if (var1_1 != -1) {
                this.an = var1_1;
                if (this.rightMargin <= 0 && var5_3 > 0) {
                    this.rightMargin = var5_3;
                }
            } else {
                var1_1 = this.h;
                if (var1_1 != -1) {
                    this.ao = var1_1;
                    if (this.rightMargin <= 0 && var5_3 > 0) {
                        this.rightMargin = var5_3;
                    }
                }
            }
            if ((var1_1 = this.e) != -1) {
                this.al = var1_1;
                if (this.leftMargin <= 0 && var4_2 > 0) {
                    this.leftMargin = var4_2;
                    return;
                }
            } else {
                var1_1 = this.f;
                if (var1_1 != -1) {
                    this.am = var1_1;
                    if (this.leftMargin <= 0 && var4_2 > 0) {
                        this.leftMargin = var4_2;
                    }
                }
            }
        }
    }
}

