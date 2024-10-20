/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class clu
extends bow
implements IInterface {
    private final int a;
    private final Object b;

    public clu(bzo bzo2, int n2) {
        this.a = n2;
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.b = bzo2;
    }

    public clu(cei cei2, int n2) {
        this.a = n2;
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.b = cei2;
    }

    @Override
    protected final boolean y(int n2, Parcel object, Parcel object2) {
        if (this.a != 0) {
            switch (n2) {
                default: {
                    return false;
                }
                case 16: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    long l2 = object.readLong();
                    box.b(object);
                    kl.aA((Status)object2, l2, (bzo)this.b);
                    return true;
                }
                case 15: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 14: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 13: {
                    Status status = (Status)box.a(object, Status.CREATOR);
                    object2 = (cjr)box.a(object, cjr.CREATOR);
                    box.b(object);
                    kl.aA(status, object2, (bzo)this.b);
                    return true;
                }
                case 12: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 11: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    object.readLong();
                    box.b(object);
                    kl.aA((Status)object2, null, (bzo)this.b);
                    return true;
                }
                case 10: {
                    Status status = (Status)box.a(object, Status.CREATOR);
                    object2 = (cjj)box.a(object, cjj.CREATOR);
                    box.b(object);
                    kl.aA(status, object2, (bzo)this.b);
                    return true;
                }
                case 9: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    cjp cjp2 = (cjp)box.a(object, cjp.CREATOR);
                    box.b(object);
                    kl.aA((Status)object2, cjp2, (bzo)this.b);
                    return true;
                }
                case 8: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 7: {
                    Status status = (Status)box.a(object, Status.CREATOR);
                    object2 = (cjk)box.a(object, cjk.CREATOR);
                    box.b(object);
                    kl.aA(status, object2, (bzo)this.b);
                    return true;
                }
                case 6: {
                    Status status = (Status)box.a(object, Status.CREATOR);
                    object2 = (cjn)box.a(object, cjn.CREATOR);
                    box.b(object);
                    kl.aA(status, object2, (bzo)this.b);
                    return true;
                }
                case 5: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 4: {
                    Status status = (Status)box.a(object, Status.CREATOR);
                    object2 = (cjj)box.a(object, cjj.CREATOR);
                    box.b(object);
                    kl.aA(status, object2, (bzo)this.b);
                    return true;
                }
                case 3: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 2: {
                    object2 = (Status)box.a(object, Status.CREATOR);
                    box.b(object);
                    kl.az((Status)object2, (bzo)this.b);
                    return true;
                }
                case 1: 
            }
            object2 = (Status)box.a(object, Status.CREATOR);
            box.b(object);
            kl.az((Status)object2, (bzo)this.b);
            return true;
        }
        if (n2 == 2) {
            object = new clz(0);
            ((cei)this.b).a((ceh)object);
            return true;
        }
        return false;
    }
}

