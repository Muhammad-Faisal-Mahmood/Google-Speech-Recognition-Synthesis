/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class b
extends ViewGroup.MarginLayoutParams {
    public float A = 0.0f;
    public float B = 0.0f;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public boolean N = true;
    public boolean O = true;
    public boolean P = false;
    public boolean Q = false;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public float X = 0.5f;
    public m Y = new m();
    public int a = -1;
    public int b = -1;
    public float c = -1.0f;
    public int d = -1;
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
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public float w = 0.5f;
    public float x = 0.5f;
    public String y = null;
    int z = 1;

    public b() {
        super(-2, -2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        context = context.obtainStyledAttributes((AttributeSet)object, f.a);
        int n2 = context.getIndexCount();
        int n3 = 0;
        while (true) {
            block28: {
                int n4;
                block65: {
                    block64: {
                        block63: {
                            block62: {
                                block61: {
                                    block60: {
                                        block59: {
                                            block58: {
                                                block56: {
                                                    block57: {
                                                        float f2;
                                                        float f3;
                                                        block55: {
                                                            block54: {
                                                                block53: {
                                                                    block52: {
                                                                        block51: {
                                                                            block50: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block47: {
                                                                                            block46: {
                                                                                                block45: {
                                                                                                    block44: {
                                                                                                        block43: {
                                                                                                            block42: {
                                                                                                                block41: {
                                                                                                                    block40: {
                                                                                                                        block39: {
                                                                                                                            block38: {
                                                                                                                                block37: {
                                                                                                                                    block36: {
                                                                                                                                        block35: {
                                                                                                                                            block34: {
                                                                                                                                                block33: {
                                                                                                                                                    block32: {
                                                                                                                                                        block31: {
                                                                                                                                                            block30: {
                                                                                                                                                                block29: {
                                                                                                                                                                    if (n3 >= n2) {
                                                                                                                                                                        context.recycle();
                                                                                                                                                                        this.a();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    n4 = context.getIndex(n3);
                                                                                                                                                                    if (n4 != 84) break block29;
                                                                                                                                                                    this.d = n4 = context.getResourceId(84, this.d);
                                                                                                                                                                    if (n4 == -1) {
                                                                                                                                                                        this.d = context.getInt(84, -1);
                                                                                                                                                                    }
                                                                                                                                                                    break block28;
                                                                                                                                                                }
                                                                                                                                                                if (n4 != 85) break block30;
                                                                                                                                                                this.e = n4 = context.getResourceId(85, this.e);
                                                                                                                                                                if (n4 == -1) {
                                                                                                                                                                    this.e = context.getInt(85, -1);
                                                                                                                                                                }
                                                                                                                                                                break block28;
                                                                                                                                                            }
                                                                                                                                                            if (n4 != 87) break block31;
                                                                                                                                                            this.f = n4 = context.getResourceId(87, this.f);
                                                                                                                                                            if (n4 == -1) {
                                                                                                                                                                this.f = context.getInt(87, -1);
                                                                                                                                                            }
                                                                                                                                                            break block28;
                                                                                                                                                        }
                                                                                                                                                        if (n4 != 88) break block32;
                                                                                                                                                        this.g = n4 = context.getResourceId(88, this.g);
                                                                                                                                                        if (n4 == -1) {
                                                                                                                                                            this.g = context.getInt(88, -1);
                                                                                                                                                        }
                                                                                                                                                        break block28;
                                                                                                                                                    }
                                                                                                                                                    if (n4 != 94) break block33;
                                                                                                                                                    this.h = n4 = context.getResourceId(94, this.h);
                                                                                                                                                    if (n4 == -1) {
                                                                                                                                                        this.h = context.getInt(94, -1);
                                                                                                                                                    }
                                                                                                                                                    break block28;
                                                                                                                                                }
                                                                                                                                                if (n4 != 93) break block34;
                                                                                                                                                this.i = n4 = context.getResourceId(93, this.i);
                                                                                                                                                if (n4 == -1) {
                                                                                                                                                    this.i = context.getInt(93, -1);
                                                                                                                                                }
                                                                                                                                                break block28;
                                                                                                                                            }
                                                                                                                                            if (n4 != 65) break block35;
                                                                                                                                            this.j = n4 = context.getResourceId(65, this.j);
                                                                                                                                            if (n4 == -1) {
                                                                                                                                                this.j = context.getInt(65, -1);
                                                                                                                                            }
                                                                                                                                            break block28;
                                                                                                                                        }
                                                                                                                                        if (n4 != 64) break block36;
                                                                                                                                        this.k = n4 = context.getResourceId(64, this.k);
                                                                                                                                        if (n4 == -1) {
                                                                                                                                            this.k = context.getInt(64, -1);
                                                                                                                                        }
                                                                                                                                        break block28;
                                                                                                                                    }
                                                                                                                                    if (n4 != 60) break block37;
                                                                                                                                    this.l = n4 = context.getResourceId(60, this.l);
                                                                                                                                    if (n4 == -1) {
                                                                                                                                        this.l = context.getInt(60, -1);
                                                                                                                                    }
                                                                                                                                    break block28;
                                                                                                                                }
                                                                                                                                if (n4 != 103) break block38;
                                                                                                                                this.K = context.getDimensionPixelOffset(103, this.K);
                                                                                                                                break block28;
                                                                                                                            }
                                                                                                                            if (n4 != 104) break block39;
                                                                                                                            this.L = context.getDimensionPixelOffset(104, this.L);
                                                                                                                            break block28;
                                                                                                                        }
                                                                                                                        if (n4 != 72) break block40;
                                                                                                                        this.a = context.getDimensionPixelOffset(72, this.a);
                                                                                                                        break block28;
                                                                                                                    }
                                                                                                                    if (n4 != 73) break block41;
                                                                                                                    this.b = context.getDimensionPixelOffset(73, this.b);
                                                                                                                    break block28;
                                                                                                                }
                                                                                                                if (n4 != 74) break block42;
                                                                                                                this.c = context.getFloat(74, this.c);
                                                                                                                break block28;
                                                                                                            }
                                                                                                            if (n4 != 0) break block43;
                                                                                                            this.M = context.getInt(0, this.M);
                                                                                                            break block28;
                                                                                                        }
                                                                                                        if (n4 != 89) break block44;
                                                                                                        this.m = n4 = context.getResourceId(89, this.m);
                                                                                                        if (n4 == -1) {
                                                                                                            this.m = context.getInt(89, -1);
                                                                                                        }
                                                                                                        break block28;
                                                                                                    }
                                                                                                    if (n4 != 90) break block45;
                                                                                                    this.n = n4 = context.getResourceId(90, this.n);
                                                                                                    if (n4 == -1) {
                                                                                                        this.n = context.getInt(90, -1);
                                                                                                    }
                                                                                                    break block28;
                                                                                                }
                                                                                                if (n4 != 71) break block46;
                                                                                                this.o = n4 = context.getResourceId(71, this.o);
                                                                                                if (n4 == -1) {
                                                                                                    this.o = context.getInt(71, -1);
                                                                                                }
                                                                                                break block28;
                                                                                            }
                                                                                            if (n4 != 70) break block47;
                                                                                            this.p = n4 = context.getResourceId(70, this.p);
                                                                                            if (n4 == -1) {
                                                                                                this.p = context.getInt(70, -1);
                                                                                            }
                                                                                            break block28;
                                                                                        }
                                                                                        if (n4 != 108) break block48;
                                                                                        this.q = context.getDimensionPixelSize(108, this.q);
                                                                                        break block28;
                                                                                    }
                                                                                    if (n4 != 111) break block49;
                                                                                    this.r = context.getDimensionPixelSize(111, this.r);
                                                                                    break block28;
                                                                                }
                                                                                if (n4 != 109) break block50;
                                                                                this.s = context.getDimensionPixelSize(109, this.s);
                                                                                break block28;
                                                                            }
                                                                            if (n4 != 106) break block51;
                                                                            this.t = context.getDimensionPixelSize(106, this.t);
                                                                            break block28;
                                                                        }
                                                                        if (n4 != 110) break block52;
                                                                        this.u = context.getDimensionPixelSize(110, this.u);
                                                                        break block28;
                                                                    }
                                                                    if (n4 != 107) break block53;
                                                                    this.v = context.getDimensionPixelSize(107, this.v);
                                                                    break block28;
                                                                }
                                                                if (n4 != 80) break block54;
                                                                this.w = context.getFloat(80, this.w);
                                                                break block28;
                                                            }
                                                            if (n4 != 95) break block55;
                                                            this.x = context.getFloat(95, this.x);
                                                            break block28;
                                                        }
                                                        if (n4 != 69) break block56;
                                                        this.y = object = context.getString(69);
                                                        this.z = -1;
                                                        if (object == null) break block28;
                                                        n4 = ((String)object).indexOf(44);
                                                        int n5 = ((String)object).length();
                                                        if (n4 > 0 && n4 < n5 - 1) {
                                                            object = this.y.substring(0, n4);
                                                            if (((String)object).equalsIgnoreCase("W")) {
                                                                this.z = 0;
                                                            } else if (((String)object).equalsIgnoreCase("H")) {
                                                                this.z = 1;
                                                            }
                                                            ++n4;
                                                        } else {
                                                            n4 = 0;
                                                        }
                                                        int n6 = this.y.indexOf(58);
                                                        if (n6 < 0 || n6 >= n5 - 1) break block57;
                                                        String string = this.y.substring(n4, n6);
                                                        object = this.y.substring(n6 + 1);
                                                        if (string.length() <= 0 || ((String)object).length() <= 0) break block28;
                                                        try {
                                                            f3 = Float.parseFloat(string);
                                                            f2 = Float.parseFloat((String)object);
                                                        }
                                                        catch (NumberFormatException numberFormatException) {}
                                                        if (!(f3 > 0.0f) || !(f2 > 0.0f)) break block28;
                                                        if (this.z == 1) {
                                                            Math.abs(f2 / f3);
                                                            break block28;
                                                        }
                                                        Math.abs(f3 / f2);
                                                    }
                                                    object = this.y.substring(n4);
                                                    if (((String)object).length() <= 0) break block28;
                                                    Float.parseFloat((String)object);
                                                    break block28;
                                                }
                                                if (n4 != 82) break block58;
                                                this.A = context.getFloat(82, 0.0f);
                                                break block28;
                                            }
                                            if (n4 != 97) break block59;
                                            this.B = context.getFloat(97, 0.0f);
                                            break block28;
                                        }
                                        if (n4 != 81) break block60;
                                        this.C = context.getInt(81, 0);
                                        break block28;
                                    }
                                    if (n4 != 96) break block61;
                                    this.D = context.getInt(96, 0);
                                    break block28;
                                }
                                if (n4 != 99) break block62;
                                this.E = context.getInt(99, 0);
                                break block28;
                            }
                            if (n4 != 76) break block63;
                            this.F = context.getInt(76, 0);
                            break block28;
                        }
                        if (n4 != 101) break block64;
                        this.G = context.getDimensionPixelSize(101, this.G);
                        break block28;
                    }
                    if (n4 != 100) break block65;
                    this.I = context.getDimensionPixelSize(100, this.I);
                    break block28;
                }
                if (n4 == 78) {
                    this.H = context.getDimensionPixelSize(78, this.H);
                } else if (n4 == 77) {
                    this.J = context.getDimensionPixelSize(77, this.J);
                }
            }
            ++n3;
        }
    }

    public b(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void a() {
        this.Q = false;
        this.N = true;
        this.O = true;
        if (this.width == 0 || this.width == -1) {
            this.N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.O = false;
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.Q = true;
        this.N = true;
        this.O = true;
        if (!(this.Y instanceof o)) {
            this.Y = new o();
        }
        ((o)this.Y).A(this.M);
    }

    public final void resolveLayoutDirection(int n2) {
        super.resolveLayoutDirection(n2);
        this.T = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.V = this.q;
        this.W = this.s;
        this.X = this.w;
        if (this.getLayoutDirection() == 1) {
            n2 = this.m;
            if (n2 != -1) {
                this.T = n2;
            } else {
                n2 = this.n;
                if (n2 != -1) {
                    this.U = n2;
                }
            }
            n2 = this.o;
            if (n2 != -1) {
                this.S = n2;
            }
            if ((n2 = this.p) != -1) {
                this.R = n2;
            }
            if ((n2 = this.u) != -1) {
                this.W = n2;
            }
            if ((n2 = this.v) != -1) {
                this.V = n2;
            }
            this.X = 1.0f - this.w;
        } else {
            n2 = this.m;
            if (n2 != -1) {
                this.S = n2;
            }
            if ((n2 = this.n) != -1) {
                this.R = n2;
            }
            if ((n2 = this.o) != -1) {
                this.T = n2;
            }
            if ((n2 = this.p) != -1) {
                this.U = n2;
            }
            if ((n2 = this.u) != -1) {
                this.V = n2;
            }
            if ((n2 = this.v) != -1) {
                this.W = n2;
            }
        }
        if (this.o == -1 && this.p == -1) {
            n2 = this.f;
            if (n2 != -1) {
                this.T = n2;
            } else {
                n2 = this.g;
                if (n2 != -1) {
                    this.U = n2;
                }
            }
        }
        if (this.n == -1 && this.m == -1) {
            n2 = this.d;
            if (n2 != -1) {
                this.R = n2;
                return;
            }
            n2 = this.e;
            if (n2 != -1) {
                this.S = n2;
            }
        }
    }
}

