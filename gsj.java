/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ExecutionException;

public final class gsj
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(11);
    public final int a;
    public final Object b;
    public hpn c;
    private gsi d;

    public gsj(int n2, Object object, hpn hpn2) {
        this.a = n2;
        this.b = object;
        this.c = hpn2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public gsj(Parcel parcel) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = parcel.readInt();
        this.b = parcel.readValue(classLoader);
        int n2 = parcel.readInt();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) throw new IllegalArgumentException(a.af(n2, "Unknown result type: "));
                this.c = hhk.J((Throwable)parcel.readValue(classLoader));
            } else {
                this.c = hhk.K(parcel.readValue(classLoader));
            }
        } else {
            this.c = hhk.J(new gsk("ParcelableFuture was Parceled before the Future completed."));
        }
        this.a();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        void var1_6;
        gsi gsi2 = this.d;
        if (gsi2 == null || !this.b()) return;
        try {
            Object object = hhk.S(this.c);
            fbx fbx2 = new fbx(gsi2, this, object, 18, null);
            gsi2.c(this, fbx2);
            return;
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        catch (ExecutionException executionException) {
            gsi2.b(this, executionException.getCause());
            return;
        }
        gsi2.b(this, (Throwable)var1_6);
    }

    public final boolean b() {
        return this.c.isDone();
    }

    public final void c(gsi gsi2) {
        this.d = gsi2;
        this.a();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object object = this.b;
        object = object != null ? a.ax(object, "input=", ";") : "";
        String string = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("ParcelableFuture(");
        stringBuilder.append((String)object);
        stringBuilder.append("future=");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeToParcel(Parcel parcel, int n2) {
        Object object;
        Object object2;
        Object var7_4;
        block12: {
            parcel.writeInt(this.a);
            boolean bl2 = this.b();
            var7_4 = null;
            if (bl2) {
                try {
                    object2 = hhk.S(this.c);
                    n2 = 1;
                    object = null;
                    break block12;
                }
                catch (Error error) {
                }
                catch (RuntimeException runtimeException) {
                }
                catch (ExecutionException executionException) {
                    object = executionException.getCause();
                }
                n2 = 2;
                object2 = null;
            } else {
                n2 = 0;
                object2 = null;
                object = null;
            }
        }
        int n3 = parcel.dataPosition();
        try {
            parcel.writeValue(this.b);
        }
        catch (RuntimeException runtimeException) {
            parcel.setDataPosition(n3);
            parcel.writeValue(null);
            object = String.valueOf(this.b.getClass());
            object2 = runtimeException.getMessage();
            StringBuilder stringBuilder = new StringBuilder("Parceling failed for type and will be dropped: ");
            stringBuilder.append((String)object);
            stringBuilder.append("; ");
            stringBuilder.append((String)object2);
            object = new gsk(stringBuilder.toString());
            n2 = 2;
            object2 = var7_4;
        }
        n3 = parcel.dataPosition();
        try {
            parcel.writeInt(n2);
            if (n2 != 0) {
                if (n2 != 1) {
                    parcel.writeValue(object);
                    return;
                }
                parcel.writeValue(object2);
            }
            return;
        }
        catch (RuntimeException runtimeException) {
            parcel.setDataPosition(n3);
            gsk gsk2 = new gsk("Parceling failed for result and will be dropped: ".concat(String.valueOf(runtimeException.getMessage())));
            parcel.writeInt(2);
            parcel.writeValue((Object)gsk2);
            return;
        }
    }
}

