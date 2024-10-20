/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 */
import android.content.Context;
import android.graphics.Typeface;
import java.util.ArrayList;

public final class hti {
    public static hti c;
    public final int a;
    public final Object b;

    public hti() {
        this.a = 1;
        this.b = new ArrayList();
    }

    public hti(int n2) {
        this.b = null;
        this.a = n2;
    }

    public hti(int n2, adu adu2) {
        this.a = n2;
        this.b = adu2;
    }

    public hti(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public hti(Context context) {
        this.b = context;
        this.a = 2;
    }

    public hti(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public hti(cbk cbk2, int n2) {
        kl.at(cbk2);
        this.b = cbk2;
        this.a = n2;
    }

    public hti(dkt dkt2, int n2) {
        this.b = dkt2;
        this.a = n2;
    }

    public hti(byte[] byArray) {
        this.b = byArray;
        this.a = 0;
    }

    static hti a(int n2, iyh iyh2) {
        int n3 = n2;
        if (n2 != 4) {
            n3 = 5;
        }
        fxf.A(true);
        fxf.K(iyh2);
        return new hti(n3, iyh2);
    }

    static hti b(int n2) {
        fxf.A(true);
        return new hti(n2, (Object)null);
    }
}

