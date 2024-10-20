/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

public abstract class izu
implements jjq {
    private InputStream a;
    protected final izi b;
    protected final its c;
    final int d;
    protected jag e;
    protected jjo f;
    protected jjr g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private izs n = izs.a;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public izu(izi izi2, its its2, int n2) {
        this.b = izi2;
        this.c = its2;
        this.d = n2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void f(iyh iyh2, iyh iyh3, boolean bl2) {
        if (this.p()) return;
        boolean bl3 = this.n != izs.a;
        this.m(izs.f);
        if (bl3) {
            this.f.h();
        }
        if (!bl2) {
            izi izi2 = this.b;
            int n2 = this.d;
            jah jah2 = jah.c();
            jah2.a().writeInt(0);
            int n3 = jjj.h(jah2.a(), iyh2);
            jjj.j(jah2.a(), n3 | 8);
            izi2.s(n2, jah2);
            jah2.close();
            catch (Throwable throwable) {
                try {
                    jah2.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        throwable.addSuppressed(throwable2);
                        throw throwable;
                    }
                    catch (iyi iyi2) {
                        izi.e.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", iyi2);
                    }
                }
            }
        }
        if (bl3) {
            this.a(iyh3);
        }
        this.o();
    }

    private final void q() {
        if (this.i == 0) {
            izt izt2;
            int n2 = 0;
            while (n2 < this.j.size() && (izt2 = (izt)this.j.get(n2)) != null) {
                int n3;
                n2 = n3 = n2 + 1;
                if (!izt2.d) continue;
                this.i = n3;
                this.t();
                break;
            }
        }
    }

    private final boolean r() {
        return this.a != null || this.i > 0;
        {
        }
    }

    private final boolean s() {
        return this.k && this.h >= this.l;
    }

    private final void t() {
        fxf.K(this.f);
        jjo.f(this.f);
        jjo.f(this.f);
        ++this.o;
    }

    protected abstract void a(iyh var1);

    protected abstract void b();

    public abstract void c(int var1, Parcel var2);

    public abstract void d(int var1, Parcel var2);

    public boolean e() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final InputStream g() {
        synchronized (this) {
            Object object = this.a;
            if (object != null) {
                this.a = null;
            } else if (this.p > 0 && this.r()) {
                int n2 = this.i;
                this.i = 0;
                if (n2 == 1) {
                    izt izt2 = (izt)this.j.remove(0);
                    int n3 = izt2.c;
                    object = izt2.a;
                    if (object == null) {
                        object = new izm(izt2.b);
                    }
                } else {
                    byte[][] byArrayArray = new byte[n2][];
                    int n4 = 0;
                    for (int i2 = 0; i2 < n2; n4 += ((Object)object).length, ++i2) {
                        object = ((izt)this.j.remove((int)0)).b;
                        fxf.K(object);
                        byArrayArray[i2] = (byte[])object;
                    }
                    object = new izm(byArrayArray, n4);
                }
                this.h += n2;
                this.q();
            } else {
                object = null;
            }
            if (object != null) {
                --this.p;
            } else {
                this.r = false;
                if (this.s() && !this.p()) {
                    this.m(izs.d);
                    this.j();
                    return null;
                }
            }
            return object;
        }
    }

    public final void h(iyh iyh2) {
        this.f(iyh2, iyh2, false);
    }

    final void i(iyh iyh2) {
        this.f(iyh.c, iyh2, false);
    }

    final void j() {
        int n2;
        if (this.q) {
            return;
        }
        this.q = true;
        while ((n2 = this.n.ordinal()) != 2 ? n2 == 3 && this.g != null && this.k : this.g != null && !this.r && (this.r() ? this.p != 0 : this.s())) {
            n2 = this.n.ordinal();
            if (n2 != 2) {
                if (n2 != 3) {
                    throw new AssertionError();
                }
            } else {
                if (this.r) continue;
                if (this.r()) {
                    this.r = true;
                    this.g.d(this);
                    continue;
                }
                if (!this.k) continue;
                this.m(izs.d);
            }
            if (!this.k) continue;
            this.m(izs.e);
            this.b();
        }
        this.q = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void k(Parcel var1_1) {
        synchronized (this) {
            var6_3 = this.p();
            if (var6_3) {
                return;
            }
            try {
                block27: {
                    block26: {
                        var4_4 = var1_1.readInt();
                        if (jjj.k(var4_4, 8)) {
                            var1_1 = jjj.i(var4_4, (Parcel)var1_1);
                            this.f((iyh)var1_1, (iyh)var1_1, true);
                            return;
                        }
                        var3_5 = var1_1.readInt();
                        var6_3 = jjj.k(var4_4, 1);
                        var7_6 = jjj.k(var4_4, 2);
                        var8_7 = jjj.k(var4_4, 4);
                        if (var6_3) {
                            this.c(var4_4, (Parcel)var1_1);
                            this.m(izs.c);
                        }
                        if (!var7_6) break block27;
                        if ((var4_4 & 64) != 0) {
                            var9_8 = (iyu)this.c.a(izi.h);
                            if (var9_8 != null && var9_8.c) {
                                var5_9 = var1_1.dataPosition();
                                var9_8 = this.getClass().getClassLoader();
                                var2_10 = jai.f;
                                var10_11 /* !! */  = (byte[])var1_1.readParcelable((ClassLoader)var9_8);
                                var9_8 = new jai(null, (Parcelable)var10_11 /* !! */ , true);
                                var2_10 = var1_1.dataPosition() - var5_9;
                                var6_3 = true;
                                var10_11 /* !! */  = null;
                                break block26;
                            } else {
                                var9_8 = iyh.f.e("Parcelable messages not allowed");
                                var1_1 = new iyi((iyh)var9_8);
                                throw var1_1;
                            }
                        }
                        var2_10 = var1_1.readInt();
                        var10_11 /* !! */  = izn.c(var2_10);
                        if (var2_10 > 0) {
                            var1_1.readByteArray(var10_11 /* !! */ );
                        }
                        var6_3 = (var4_4 & 128) == 0;
                        var9_8 = null;
                    }
                    if (this.j != null) ** GOTO lbl52
                    if (this.o == 0 && var6_3 && var3_5 == this.h) {
                        var6_3 = this.a == null;
                        fxf.A(var6_3);
                        var11_12 = var9_8;
                        if (var9_8 == null) {
                            var11_12 = new izm(var10_11 /* !! */ );
                        }
                        this.a = var11_12;
                        this.t();
                    } else {
                        this.j = var11_13 = new ArrayList<E>(16);
lbl52:
                        // 2 sources

                        var11_13 = new ArrayList<E>((InputStream)var9_8, var10_11 /* !! */ , var2_10, var6_3);
                        var2_10 = var3_5 - this.h;
                        if (var2_10 < this.j.size()) {
                            this.j.set(var2_10, var11_13);
                            this.q();
                        } else if (var2_10 > this.j.size()) {
                            do {
                                this.j.add(null);
                            } while (var2_10 > this.j.size());
                            this.j.add(var11_13);
                        } else {
                            this.j.add(var11_13);
                            this.q();
                        }
                    }
                }
                if (var8_7) {
                    this.d(var4_4, (Parcel)var1_1);
                    this.l = var3_5;
                    this.k = true;
                }
                if (var3_5 == (var2_10 = this.h++)) {
                    var9_8 = this.j;
                    if (var9_8 == null) {
                        this.h = var2_10 + 1;
                    } else if (!var7_6 && !var8_7) {
                        var9_8.remove(0);
                    }
                }
                var2_10 = var1_1.dataSize();
                this.m = var2_10 = this.m + var2_10;
                var1_1 = this.f;
                if (var1_1 != null && var2_10 != 0) {
                    var1_1.b(var2_10);
                    jjo.f(this.f);
                    this.m = 0;
                }
                this.j();
                return;
            }
            catch (iyi var1_2) {
                this.h(var1_2.a);
                return;
            }
        }
    }

    final void l(jag jag2, jjr jjr2) {
        this.e = jag2;
        this.f = jag2.f;
        this.g = jjr2;
        if (!this.p()) {
            this.m(izs.b);
        }
    }

    protected final void m(izs izs2) {
        izs izs3 = this.n;
        int n2 = izs2.ordinal();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            throw new AssertionError();
                        }
                    } else {
                        bl3 = bl5;
                        if (izs3 == izs.d) {
                            bl3 = true;
                        }
                        fxf.G(bl3, "%s -> %s", (Object)izs3, (Object)izs2);
                    }
                } else {
                    bl3 = bl2;
                    if (izs3 == izs.c) {
                        bl3 = true;
                    }
                    fxf.G(bl3, "%s -> %s", (Object)izs3, (Object)izs2);
                }
            } else {
                if (izs3 == izs.b || izs3 == izs.a) {
                    bl3 = true;
                }
                fxf.G(bl3, "%s -> %s", (Object)izs3, (Object)izs2);
            }
        } else {
            bl3 = bl4;
            if (izs3 == izs.a) {
                bl3 = true;
            }
            fxf.G(bl3, "%s -> %s", (Object)izs3, (Object)izs2);
        }
        this.n = izs2;
    }

    public final void n(int n2) {
        this.p += n2;
        this.j();
    }

    final void o() {
        this.b.q(this);
    }

    protected final boolean p() {
        return this.n == izs.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            String string = this.getClass().getSimpleName();
            boolean bl2 = this.k;
            String string2 = String.valueOf((Object)this.n);
            boolean bl3 = this.r();
            jjr jjr2 = this.g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("[SfxA=");
            stringBuilder.append(bl2);
            stringBuilder.append("/De=");
            stringBuilder.append(string2);
            stringBuilder.append("/Msg=");
            stringBuilder.append(bl3);
            stringBuilder.append("/Lis=");
            bl2 = jjr2 != null;
            stringBuilder.append(bl2);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

