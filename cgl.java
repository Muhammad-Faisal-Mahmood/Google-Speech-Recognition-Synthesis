/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;

public final class cgl
extends RuntimeException {
    public cgl(String string, Parcel object) {
        int n2 = object.dataPosition();
        int n3 = object.dataSize();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" Parcel: pos=");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" size=");
        ((StringBuilder)object).append(n3);
        super(((StringBuilder)object).toString());
    }
}

