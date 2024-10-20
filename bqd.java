/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
import android.os.ParcelFileDescriptor;
import java.util.Arrays;
import java.util.Locale;

public final class bqd {
    public final Locale a;
    public final ParcelFileDescriptor b;
    public final String c;
    private final byte[] d;

    public bqd() {
        throw null;
    }

    public bqd(Locale locale, ParcelFileDescriptor parcelFileDescriptor, String string) {
        this.d = null;
        this.a = locale;
        this.b = parcelFileDescriptor;
        this.c = string;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bqd) {
            Object object2;
            if ((object = (bqd)object) instanceof bqd) {
                object2 = ((bqd)object).d;
            }
            if (Arrays.equals(null, null) && this.a.equals(((bqd)object).a) && ((object2 = (Object)this.b) == null ? ((bqd)object).b == null : object2.equals(((bqd)object).b)) && this.c.equals(((bqd)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = Arrays.hashCode(null);
        int n3 = this.a.hashCode();
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        int n4 = parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode();
        return (((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        Object object = this.b;
        Object object2 = this.a;
        String string = Arrays.toString(null);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("RosieRobotRequest{audio=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", locale=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", audioFileDescriptor=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", contextString=");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

