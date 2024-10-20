/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class bpd
extends bow
implements IInterface {
    final Object a;
    private final int b;

    public bpd(bqa bqa2, int n2) {
        this.b = n2;
        this.a = bqa2;
        super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback");
    }

    public bpd(bzb bzb2, int n2) {
        this.b = n2;
        this.a = bzb2;
        super("com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
    }

    public bpd(bzo bzo2, int n2) {
        this.b = n2;
        this.a = bzo2;
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public bpd(bzo bzo2, int n2, byte[] byArray) {
        this.b = n2;
        this.a = bzo2;
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    public bpd(cei cei2, int n2) {
        this.b = n2;
        this.a = cei2;
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    public bpd(po po2, int n2) {
        this.b = n2;
        this.a = po2;
        super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final boolean y(int n2, Parcel object, Parcel object2) {
        int n3 = this.b;
        object2 = null;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n2 != 2) return bl4;
                            object2 = (Status)box.a((Parcel)object, Status.CREATOR);
                            byte[] byArray = object.createByteArray();
                            box.b((Parcel)object);
                            if (((Status)object2).a()) {
                                try {
                                    object = hwj.a();
                                    object = hwv.o(dvk.a, byArray, 0, byArray.length, (hwj)object);
                                    hwv.D((hwv)object);
                                    object = (dvk)object;
                                }
                                catch (hxn hxn2) {
                                    ((bzo)this.a).b(hxn2);
                                    return true;
                                }
                                kl.aA((Status)object2, object, (bzo)this.a);
                                return true;
                            }
                            kl.aA((Status)object2, null, (bzo)this.a);
                            return true;
                        }
                        if (n2 != 2) return false;
                        object2 = object.createByteArray();
                        box.b((Parcel)object);
                        object = new cjz((byte[])object2);
                        ((cei)this.a).a((ceh)object);
                        return true;
                    }
                    if (n2 != 1) return false;
                    object2 = (Status)box.a((Parcel)object, Status.CREATOR);
                    box.b((Parcel)object);
                    kl.az((Status)object2, (bzo)this.a);
                    return true;
                }
                if (n2 != 2) {
                    if (n2 != 3) {
                        return bl2;
                    }
                    n2 = object.readInt();
                    box.b((Parcel)object);
                    object = new bpp(2, n2, "Inference failed.", null);
                    ((po)((bzb)this.a).a).d((Throwable)object);
                    return true;
                }
                object2 = (bpk)box.a((Parcel)object, bpk.CREATOR);
                box.b((Parcel)object);
                object = new gzs();
                object2 = ((bpk)object2).a;
                n5 = object2.size();
                for (n2 = n4; n2 < n5; ++n2) {
                    ((gzs)object).h(new bqc(((bpi)object2.get((int)n2)).a));
                }
                object = new bqe(gzx.o(((gzs)object).g()));
                ((po)((bzb)this.a).a).c(object);
                return true;
            }
            if (n2 != 2) {
                if (n2 != 3) {
                    return bl3;
                }
                n2 = object.readInt();
                object2 = object.readString();
                box.b((Parcel)object);
                n2 = n2 != 1 ? (n2 != 2 ? n5 : 604) : 601;
                object = this.a;
                object2 = new bpp(4, n2, "AiCore service is not connected. Service error: ".concat(String.valueOf(object2)), null);
                ((bqa)object).a((bpp)object2);
                return true;
            } else {
                IBinder iBinder = object.readStrongBinder();
                if (iBinder != null) {
                    object2 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
                    object2 = object2 instanceof boz ? (boz)object2 : new boz(iBinder);
                }
                box.b((Parcel)object);
                ((bqa)this.a).d((boz)object2);
            }
            return true;
        }
        if (n2 != 2) {
            if (n2 != 3) {
                return false;
            }
            n2 = object.readInt();
            box.b((Parcel)object);
            object = new bpp(3, n2, "Preparation failed.", null);
            ((po)this.a).d((Throwable)object);
            return true;
        }
        ((po)this.a).c(null);
        return true;
    }
}

