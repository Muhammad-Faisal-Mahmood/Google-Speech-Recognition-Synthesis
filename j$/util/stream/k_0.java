/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.Stream;
import j$.util.stream.u0_0;
import j$.util.stream.z0;

/*
 * Renamed from j$.util.stream.k
 */
final class k_0
extends z0 {
    public final int b;
    boolean c;
    Object d;

    public /* synthetic */ k_0(B0 b0) {
        this.b = 0;
        super(b0);
    }

    public k_0(u0_0 u0_02, B0 b0) {
        this.b = 1;
        this.d = u0_02;
        super(b0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void accept(Object var1_1) {
        switch (this.b) {
            default: {
                var1_1 = (Stream)((u0_0)this.d).m.apply(var1_1);
                if (var1_1 == null) ** GOTO lbl25
                try {
                    var2_3 = this.c;
                    var3_4 = this.a;
                    if (!var2_3) {
                    }
                    ** GOTO lbl15
                }
                catch (Throwable var3_5) {
                    ** GOTO lbl19
                }
                ((Stream)var1_1.a()).forEach(var3_4);
                ** GOTO lbl25
lbl15:
                // 1 sources

                var4_7 = ((Stream)var1_1.a()).spliterator();
                while (!var3_4.j() && (var2_3 = var4_7.o(var3_4))) {
                }
                ** GOTO lbl25
lbl19:
                // 1 sources

                try {
                    var1_1.close();
                    throw var3_5;
                }
                catch (Throwable var1_2) {
                    var3_5.addSuppressed(var1_2);
                }
                throw var3_5;
lbl25:
                // 3 sources

                if (var1_1 == null) return;
                var1_1.close();
                return;
            }
            case 0: 
        }
        var4_8 = this.a;
        if (var1_1 == null) {
            if (this.c != false) return;
            this.c = true;
            this.d = null;
            var4_8.accept(null);
            return;
        }
        var3_6 = this.d;
        if (var3_6 != null) {
            if (var1_1.equals(var3_6) != false) return;
        }
        this.d = var1_1;
        var4_8.accept(var1_1);
    }

    @Override
    public void c() {
        switch (this.b) {
            default: {
                super.c();
                return;
            }
            case 0: 
        }
        this.c = false;
        this.d = null;
        this.a.c();
    }

    @Override
    public final void e(long l2) {
        switch (this.b) {
            default: {
                this.a.e(-1L);
                return;
            }
            case 0: 
        }
        this.c = false;
        this.d = null;
        this.a.e(-1L);
    }

    @Override
    public boolean j() {
        switch (this.b) {
            default: {
                return super.j();
            }
            case 1: 
        }
        this.c = true;
        return this.a.j();
    }
}

