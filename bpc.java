/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IInterface;
import android.os.Parcel;
import java.util.Locale;

public final class bpc
extends bow
implements IInterface {
    final po a;
    public final bqb b;
    private final int c;

    public bpc(bqb bqb2, po po2, int n2) {
        this.c = n2;
        this.a = po2;
        this.b = bqb2;
        super("com.google.android.apps.aicore.aidl.IDownloadListener2");
    }

    public bpc(bqb bqb2, po po2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = po2;
        this.b = bqb2;
        super("com.google.android.apps.aicore.aidl.IDownloadListener");
    }

    @Override
    protected final boolean y(int n2, Parcel object, Parcel object2) {
        int n3 = this.c;
        int n4 = 0;
        if (n3 != 0) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return false;
                        }
                        object.readString();
                        box.b(object);
                        object = this.b;
                        object2 = new bpw(8);
                        object.f.execute((Runnable)object2);
                        this.a.c(null);
                        return true;
                    }
                    object2 = object.readString();
                    Object object3 = object.readString();
                    box.b(object);
                    object2 = new bpp(1, 0, String.format(Locale.ENGLISH, "Feature %s failed with failure %s.", object2, object3), null);
                    object = this.b;
                    object3 = new bpw(9);
                    object.f.execute((Runnable)object3);
                    this.a.d((Throwable)object2);
                    return true;
                }
                object.readString();
                object.readLong();
                box.b(object);
                object = this.b;
                object2 = new bpw(7);
                object.f.execute((Runnable)object2);
                return true;
            }
            object.readString();
            object.readLong();
            box.b(object);
            object = this.b;
            object2 = new bpw(6);
            object.f.execute((Runnable)object2);
            return true;
        }
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) {
                    if (n2 != 5) {
                        return false;
                    }
                    object.readString();
                    box.b(object);
                    object = this.b;
                    object2 = new bpw(4);
                    object.f.execute((Runnable)object2);
                    this.a.c(null);
                    return true;
                }
                Object object4 = object.readString();
                n3 = object.readInt();
                object2 = object.readString();
                box.b(object);
                object = String.format(Locale.ENGLISH, "Feature %s failed with failure status %d and error %s.", object4, n3, object2);
                n2 = n4;
                if (n3 == 1) {
                    n2 = 501;
                }
                object2 = new bpp(1, n2, (String)object, null);
                object4 = this.b;
                object = new bpw(2);
                ((bqb)object4).f.execute((Runnable)object);
                this.a.d((Throwable)object2);
                return true;
            }
            object.readString();
            object.readLong();
            box.b(object);
            object2 = this.b;
            object = new bpw(5);
            object2.f.execute((Runnable)object);
            return true;
        }
        object.readString();
        object.readLong();
        box.b(object);
        object2 = this.b;
        object = new bpw(3);
        object2.f.execute((Runnable)object);
        return true;
    }
}

