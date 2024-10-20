/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

abstract class jag {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final izi d;
    public final int e;
    public final jjo f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public jag(izi izi2, int n2, jjo jjo2) {
        this.d = izi2;
        this.e = n2;
        this.f = jjo2;
    }

    private final void c(int n2) {
        int n3 = this.k;
        int n4 = n2 - 1;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (n4 != 1) {
            if (n4 != 2) {
                if (n4 == 3) {
                    if (n3 == 3) {
                        bl4 = true;
                    }
                    fxf.A(bl4);
                }
            } else {
                bl4 = bl2;
                if (n3 == 2) {
                    bl4 = true;
                }
                fxf.A(bl4);
            }
        } else {
            bl4 = bl3;
            if (n3 == 1) {
                bl4 = true;
            }
            fxf.A(bl4);
        }
        this.k = n2;
    }

    protected abstract int a(Parcel var1);

    protected abstract int b(Parcel var1);

    final void d(InputStream inputStream) {
        this.e();
        ConcurrentLinkedQueue<InputStream> concurrentLinkedQueue = this.c;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.add(inputStream);
            return;
        }
        if (this.b == null) {
            this.b = inputStream;
            return;
        }
        this.c = concurrentLinkedQueue = new ConcurrentLinkedQueue<InputStream>();
        concurrentLinkedQueue.add(inputStream);
    }

    protected final void e() {
        this.a = true;
    }

    protected final void f() {
        this.g = true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void g() {
        block40: {
            while (true) {
                block49: {
                    block48: {
                        block47: {
                            block46: {
                                block45: {
                                    block44: {
                                        block43: {
                                            block41: {
                                                block42: {
                                                    var2_2 = this.k;
                                                    var1_1 = var2_2 - 1;
                                                    var5_5 = null;
                                                    if (var2_2 == 0) throw null;
                                                    var4_4 = 1;
                                                    if (var1_1 != 0) {
                                                        if (var1_1 != 1) {
                                                            if (var1_1 != 2) {
                                                                return;
                                                            }
                                                            if (!this.g) {
                                                                return;
                                                            }
                                                        } else if (!this.i() && !this.g) {
                                                            return;
                                                        }
                                                    } else if (this.a == false) return;
                                                    if (this.h() == false) return;
                                                    var6_11 = jah.c();
                                                    var7_13 /* !! */  = var6_11.a();
                                                    var1_1 = 0;
                                                    var7_13 /* !! */ .writeInt(0);
                                                    var7_13 /* !! */  = var6_11.a();
                                                    var2_2 = this.h;
                                                    this.h = var2_2 + 1;
                                                    var7_13 /* !! */ .writeInt(var2_2);
                                                    var2_2 = this.k;
                                                    var3_3 = var2_2 - 1;
                                                    if (var2_2 == 0) break;
                                                    if (var3_3 == 0) break block41;
                                                    if (var3_3 == 1) break block42;
                                                    if (var3_3 != 2) {
                                                        var5_5 = new AssertionError();
                                                        throw var5_5;
                                                    }
                                                    ** GOTO lbl107
                                                }
                                                var1_1 = 0;
                                                break block43;
                                            }
                                            var2_2 = this.a(var6_11.a()) | 1;
                                            this.c(2);
                                            var1_1 = var2_2;
                                            if (this.i()) break block43;
                                            var1_1 = var2_2;
                                            if (this.g) break block43;
                                            var1_1 = var2_2;
                                            ** GOTO lbl109
                                        }
                                        if (this.i == 0) {
                                            var5_5 = this.b;
                                        } else {
                                            var7_13 /* !! */  = this.c;
                                            if (var7_13 /* !! */  != null) {
                                                var5_5 = (InputStream)var7_13 /* !! */ .peek();
                                            }
                                        }
                                        if (var5_5 == null) ** GOTO lbl103
                                        var8_14 = var6_11.a();
                                        if (!(var5_5 instanceof jai)) break block44;
                                        this.j = ((jai)var5_5).a(var8_14);
                                        var3_3 = 64;
                                        var2_2 = 0;
                                        ** GOTO lbl89
                                    }
                                    var7_13 /* !! */  = (Parcel)izn.b();
                                    var3_3 = var5_5.read((byte[])var7_13 /* !! */ );
                                    if (var3_3 > 0) break block45;
                                    var8_14.writeInt(0);
                                    break block46;
                                }
                                var8_14.writeInt(var3_3);
                                var8_14.writeByteArray((byte[])var7_13 /* !! */ , 0, var3_3);
                                this.j += var3_3;
                                var2_2 = ((Parcel)var7_13 /* !! */ ).length;
                                if (var3_3 == var2_2) break block47;
                            }
                            var2_2 = 0;
                            var3_3 = 0;
                        }
                        var3_3 = 128;
                        var2_2 = var4_4;
                        {
                            catch (Throwable var5_6) {
                                izn.a((byte[])var7_13 /* !! */ );
                                throw var5_6;
                            }
                        }
                        izn.a((byte[])var7_13 /* !! */ );
lbl89:
                        // 2 sources

                        if (var2_2 == 0) {
                            var5_5.close();
                            var2_2 = this.i;
                            this.i = var2_2 + 1;
                            if (var2_2 > 0) {
                                var5_5 = this.c;
                                fxf.K(var5_5);
                                var5_5.poll();
                            }
                            jjo.f(this.f);
                            jjo.f(this.f);
                            this.j = 0;
                        }
                        var1_1 = var1_1 | 2 | var3_3;
                        break block48;
lbl103:
                        // 1 sources

                        fxf.A(this.g);
                    }
                    if (!this.g || this.i()) break block49;
                    this.c(3);
lbl107:
                    // 2 sources

                    var1_1 = var1_1 | 4 | this.b(var6_11.a());
                    this.c(4);
                }
                jjj.j(var6_11.a(), var1_1);
                var1_1 = var6_11.a().dataSize();
                this.d.s(this.e, (jah)var6_11);
                this.f.c(var1_1);
                jjo.f(this.f);
                var6_11.close();
                continue;
                break;
            }
            try {
                throw null;
            }
            catch (Throwable var5_7) {
                try {
                    var6_11.close();
                    throw var5_7;
                }
                catch (Throwable var6_12) {
                    try {
                        var5_7.addSuppressed(var6_12);
                        throw var5_7;
                    }
                    catch (iyi var5_8) {
                        break block40;
                    }
                    catch (IOException var5_9) {
                        var5_10 = iyh.j.d(var5_9);
                        var6_11 = new iyi(var5_10);
                        throw var6_11;
                    }
                }
            }
        }
        this.c(5);
        throw var5_8;
    }

    final boolean h() {
        return this.d.v();
    }

    protected final boolean i() {
        Queue queue = this.c;
        if (queue != null) {
            return !queue.isEmpty();
        }
        return this.b != null && this.i == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            String string = this.getClass().getSimpleName();
            int n2 = this.k;
            String string2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? (n2 != 5 ? "null" : "CLOSED") : "SUFFIX_SENT") : "ALL_MESSAGES_SENT") : "PREFIX_SENT") : "INITIAL";
            n2 = this.i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("[S=");
            stringBuilder.append(string2);
            stringBuilder.append("/NDM=");
            stringBuilder.append(n2);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

