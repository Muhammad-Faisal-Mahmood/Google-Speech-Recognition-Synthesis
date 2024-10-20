/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

public final class cli
implements ceo {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cli(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
    }

    @Override
    public final void a(Object object, Object object2) {
        if (this.d != 0) {
            Object object3 = (ckd)object;
            object = new clu((bzo)object2, 1);
            object3 = (ckc)((cfc)object3).t();
            String string = (String)this.a;
            object2 = ((bov)object3).a();
            int n2 = box.a;
            object2.writeStrongBinder((IBinder)object);
            object2.writeString("__internal.external_ids#".concat((String)this.c));
            object2.writeInt(0);
            object2.writeStringArray(new String[]{string});
            object2.writeIntArray((int[])this.b);
            object2.writeByteArray(null);
            ((bov)object3).c(2, (Parcel)object2);
            return;
        }
        object = (cma)object;
        clu clu2 = new clu((cei)this.a, 0);
        object2 = new clk((ccs)this.c, (bzo)object2, clu2);
        ((cma)object).F((clu)((Object)this.b), clu2, (cdm)object2);
    }
}

