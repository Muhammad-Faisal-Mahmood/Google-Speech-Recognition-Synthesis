/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class fhc {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    private boolean g;
    private int h;
    private boolean i;
    private byte j;

    public fhc() {
    }

    public fhc(fhd fhd2) {
        this.a = fhd2.a;
        this.b = fhd2.b;
        this.c = fhd2.c;
        this.g = fhd2.d;
        this.d = fhd2.e;
        this.e = fhd2.f;
        this.h = fhd2.g;
        this.f = fhd2.h;
        this.i = fhd2.i;
        this.j = (byte)7;
    }

    public final fhd a() {
        if (this.j != 7) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((this.j & 1) == 0) {
                stringBuilder.append(" hasStartOfSpeech");
            }
            if ((this.j & 2) == 0) {
                stringBuilder.append(" speechLevel");
            }
            if ((this.j & 4) == 0) {
                stringBuilder.append(" lastAudioRationaleToastTimestampLoaded");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
        }
        Object object = this.a;
        Object object2 = this.b;
        Object object3 = this.c;
        boolean bl2 = this.g;
        Object object4 = this.d;
        Object object5 = this.e;
        int n2 = this.h;
        Object object6 = this.f;
        boolean bl3 = this.i;
        object6 = (Uri)object6;
        object5 = (fdr)object5;
        object4 = (Boolean)object4;
        object3 = (fex)object3;
        object2 = (fgd)object2;
        return new fhd((String)object, (fgd)object2, (fex)object3, bl2, (Boolean)object4, (fdr)object5, n2, (Uri)object6, bl3);
    }

    public final void b(boolean bl2) {
        this.g = bl2;
        this.j = (byte)(this.j | 1);
    }

    public final void c(boolean bl2) {
        this.i = bl2;
        this.j = (byte)(this.j | 4);
    }

    public final void d(int n2) {
        this.h = n2;
        this.j = (byte)(this.j | 2);
    }

    public final dmq e() {
        Object object;
        if (this.j == 7 && (object = this.a) != null) {
            Object object2 = this.b;
            boolean bl2 = this.g;
            Object object3 = this.d;
            Object object4 = this.c;
            Object object5 = this.e;
            boolean bl3 = this.i;
            Object object6 = this.f;
            int n2 = this.h;
            object6 = (dkx)object6;
            object5 = (Long)object5;
            object4 = (String)object4;
            object3 = (kdo)object3;
            return new dmq((String)object2, bl2, (kfl)object, (kdo)object3, (String)object4, (Long)object5, bl3, (dkx)object6, n2);
        }
        object = new StringBuilder();
        if ((this.j & 1) == 0) {
            ((StringBuilder)object).append(" isEventNameConstant");
        }
        if (this.a == null) {
            ((StringBuilder)object).append(" metric");
        }
        if ((this.j & 2) == 0) {
            ((StringBuilder)object).append(" isUnsampled");
        }
        if ((this.j & 4) == 0) {
            ((StringBuilder)object).append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void f(int n2) {
        this.h = n2;
        this.j = (byte)(this.j | 4);
    }

    public final void g(boolean bl2) {
        this.g = bl2;
        this.j = (byte)(this.j | 1);
    }

    public final void h(boolean bl2) {
        this.i = bl2;
        this.j = (byte)(this.j | 2);
    }

    public final void i(kfl kfl2) {
        if (kfl2 != null) {
            this.a = kfl2;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}

