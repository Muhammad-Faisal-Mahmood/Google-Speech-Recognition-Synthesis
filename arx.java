/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.List;

public final class arx
implements apo {
    private apq a;
    private aqe b;
    private int c = 0;
    private long d = -1L;
    private arv e;
    private int f = -1;
    private long g = -1L;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int a(app object, apy object2) {
        boolean bl2;
        int n2;
        block13: {
            long l2;
            block14: {
                block16: {
                    int n3;
                    block22: {
                        int n4;
                        block19: {
                            block21: {
                                block20: {
                                    block18: {
                                        block17: {
                                            block15: {
                                                abr.j(this.b);
                                                n2 = agf.a;
                                                n3 = this.c;
                                                n2 = 4;
                                                bl2 = true;
                                                if (n3 == 0) break block13;
                                                l2 = -1L;
                                                if (n3 == 1) break block14;
                                                if (n3 != 2) {
                                                    if (n3 != 3) {
                                                        if (this.g == -1L) {
                                                            bl2 = false;
                                                        }
                                                        abr.f(bl2);
                                                        l2 = this.g;
                                                        long l3 = ((apl)object).c;
                                                        object2 = this.e;
                                                        abr.i(object2);
                                                        if (!object2.c((app)object, l2 - l3)) return 0;
                                                        return -1;
                                                    }
                                                    object.i();
                                                    object2 = ass.c(1684108385, (app)object, new aga(8));
                                                    object.j(8);
                                                    object = (apl)object;
                                                    object2 = Pair.create((Object)((apl)object).c, (Object)((bea)object2).b);
                                                    this.f = ((Long)((Pair)object2).first).intValue();
                                                    long l4 = (Long)((Pair)object2).second;
                                                    long l5 = this.d;
                                                    l2 = l4;
                                                    if (l5 != -1L) {
                                                        l2 = l4;
                                                        if (l4 == 0xFFFFFFFFL) {
                                                            l2 = l5;
                                                        }
                                                    }
                                                    this.g = l4 = (long)this.f + l2;
                                                    l2 = ((apl)object).b;
                                                    if (l2 != -1L && l4 > l2) {
                                                        object = new StringBuilder("Data exceeds input length: ");
                                                        ((StringBuilder)object).append(l4);
                                                        ((StringBuilder)object).append(", ");
                                                        ((StringBuilder)object).append(l2);
                                                        afx.e("WavExtractor", ((StringBuilder)object).toString());
                                                        this.g = l2;
                                                    }
                                                    object = this.e;
                                                    abr.i(object);
                                                    object.a(this.f, this.g);
                                                    this.c = 4;
                                                    return 0;
                                                }
                                                aga aga2 = new aga(16);
                                                object2 = ass.c(1718449184, (app)object, aga2);
                                                bl2 = ((bea)object2).b >= 16L;
                                                abr.f(bl2);
                                                object.h(aga2.a, 0, 16);
                                                aga2.v(0);
                                                int n5 = aga2.f();
                                                int n6 = aga2.f();
                                                n3 = aga2.e();
                                                aga2.e();
                                                n4 = aga2.f();
                                                int n7 = aga2.f();
                                                int n8 = (int)((bea)object2).b - 16;
                                                if (n8 > 0) {
                                                    object2 = new byte[n8];
                                                    object.h((byte[])object2, 0, n8);
                                                } else {
                                                    object2 = agf.f;
                                                }
                                                object.j((int)(object.e() - ((apl)object).c));
                                                object = new ary(n5, n6, n3, n4, n7, (byte[])object2);
                                                n3 = ((ary)object).a;
                                                if (n3 != 17) break block15;
                                                this.e = new aru(this.a, this.b, (ary)object);
                                                break block16;
                                            }
                                            if (n3 != 6) break block17;
                                            this.e = new arw(this.a, this.b, (ary)object, "audio/g711-alaw", -1);
                                            break block16;
                                        }
                                        if (n3 != 7) break block18;
                                        this.e = new arw(this.a, this.b, (ary)object, "audio/g711-mlaw", -1);
                                        break block16;
                                    }
                                    n4 = ((ary)object).e;
                                    if (n3 == 1) break block19;
                                    if (n3 == 3) break block20;
                                    if (n3 == 65534) break block19;
                                    break block21;
                                }
                                if (n4 == 32) break block22;
                            }
                            n2 = 0;
                            break block22;
                        }
                        n2 = agf.g(n4);
                    }
                    if (n2 == 0) throw new aem(a.af(n3, "Unsupported WAV format type: "), null, false, 1);
                    this.e = new arw(this.a, this.b, (ary)object, "audio/raw", n2);
                }
                this.c = 3;
                return 0;
            }
            aga aga3 = new aga(8);
            object2 = bea.a((app)object, aga3);
            if (((bea)object2).a != 1685272116) {
                object.i();
            } else {
                object.f(8);
                aga3.v(0);
                object.h(aga3.a, 0, 8);
                l2 = aga3.l();
                object.j((int)((bea)object2).b + 8);
            }
            this.d = l2;
            this.c = 2;
            return 0;
        }
        object2 = (apl)object;
        bl2 = ((apl)object2).c == 0L;
        abr.f(bl2);
        n2 = this.f;
        if (n2 != -1) {
            object.j(n2);
            this.c = 4;
            return 0;
        }
        if (!ass.a((app)object)) throw new aem("Unsupported or unrecognized wav file type.", null, true, 1);
        object.j((int)(object.e() - ((apl)object2).c));
        this.c = 1;
        return 0;
    }

    @Override
    public final /* synthetic */ List b() {
        int n2 = gzx.d;
        return hct.a;
    }

    @Override
    public final void c(apq apq2) {
        this.a = apq2;
        this.b = apq2.y(0);
        apq2.q();
    }

    @Override
    public final void d(long l2, long l3) {
        int n2 = l2 == 0L ? 0 : 4;
        this.c = n2;
        arv arv2 = this.e;
        if (arv2 != null) {
            arv2.b(l3);
        }
    }

    @Override
    public final boolean e(app app2) {
        return ass.a(app2);
    }

    @Override
    public final /* synthetic */ void f() {
    }
}

