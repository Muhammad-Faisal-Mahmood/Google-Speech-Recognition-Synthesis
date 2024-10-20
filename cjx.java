/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

public final class cjx
implements ceo {
    public final String a;
    public final int b;
    public final String[] c;
    public final byte[] d;

    public /* synthetic */ cjx(String string, int n2, String[] stringArray, byte[] byArray) {
        this.a = string;
        this.b = n2;
        this.c = stringArray;
        this.d = byArray;
    }

    @Override
    public final void a(Object object, Object object2) {
        Object object3 = (ckd)object;
        object = new clu((bzo)object2, 1);
        object3 = (ckc)((cfc)object3).t();
        object2 = ((bov)object3).a();
        int n2 = box.a;
        object2.writeStrongBinder((IBinder)object);
        object2.writeString(this.a);
        object2.writeInt(this.b);
        object2.writeStringArray(this.c);
        object2.writeByteArray(this.d);
        ((bov)object3).c(1, (Parcel)object2);
    }
}

