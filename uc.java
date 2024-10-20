/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import java.util.List;

public final class uc {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public uc(String string, String string2, String string3, List object) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        a.Y(object);
        this.d = object;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(string3);
        this.e = ((StringBuilder)object).toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = new StringBuilder("FontRequest {mProviderAuthority: ");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(", mProviderPackage: ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", mQuery: ");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append(", mCertificates:");
        stringBuilder.append(((StringBuilder)object).toString());
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            stringBuilder.append(" [");
            object = (List)this.d.get(i2);
            for (int i3 = 0; i3 < object.size(); ++i3) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[])((byte[])object.get(i3)), (int)0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}mCertificatesArray: 0");
        return stringBuilder.toString();
    }
}

