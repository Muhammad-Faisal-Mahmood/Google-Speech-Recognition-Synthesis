/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

public final class cjv
implements ceo {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ cjv(String string, int n2) {
        this.c = n2;
        this.a = string;
        this.b = "";
    }

    public /* synthetic */ cjv(String string, Object object, int n2) {
        this.c = n2;
        this.a = string;
        this.b = object;
    }

    public /* synthetic */ cjv(String string, Object object, int n2, byte[] byArray) {
        this.c = n2;
        this.b = string;
        this.a = object;
    }

    @Override
    public final void a(Object object, Object object2) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        Object object3 = (ckd)object;
                        object = new bpd((bzo)object2, 3);
                        object3 = (ckc)((cfc)object3).t();
                        object2 = ((hvd)this.a).g();
                        Parcel parcel = ((bov)object3).a();
                        n2 = box.a;
                        parcel.writeStrongBinder((IBinder)object);
                        parcel.writeString((String)this.b);
                        parcel.writeByteArray((byte[])object2);
                        ((bov)object3).c(25, parcel);
                        return;
                    }
                    Object object4 = (ckd)object;
                    object = new clu((bzo)object2, 1);
                    object4 = (ckc)((cfc)object4).t();
                    object2 = new StringBuilder("CURRENT:");
                    ((StringBuilder)object2).append((String)this.b);
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append((String)this.a);
                    ((ckc)object4).e((clu)((Object)object), ((StringBuilder)object2).toString());
                    return;
                }
                object = (ckc)((ckd)object).t();
                bpd bpd2 = new bpd((cei)this.a, 4);
                object2 = ((bov)object).a();
                object2.writeString((String)this.b);
                n2 = box.a;
                object2.writeStrongBinder((IBinder)bpd2);
                ((bov)object).c(28, (Parcel)object2);
                return;
            }
            Object object5 = (ckd)object;
            object = new clu((bzo)object2, 1);
            object5 = (ckc)((cfc)object5).t();
            object2 = ((bov)object5).a();
            n2 = box.a;
            object2.writeStrongBinder((IBinder)object);
            object2.writeString((String)this.a);
            object2.writeString((String)this.b);
            object2.writeString(null);
            ((bov)object5).c(11, (Parcel)object2);
            return;
        }
        ckd ckd2 = (ckd)object;
        object = new clu((bzo)object2, 1);
        object2 = (ckc)ckd2.t();
        ckd2 = ((bov)object2).a();
        n2 = box.a;
        ckd2.writeStrongBinder((IBinder)object);
        ckd2.writeString((String)this.a);
        ckd2.writeByteArray((byte[])this.b);
        ((bov)object2).c(20, (Parcel)ckd2);
    }
}

