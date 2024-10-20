/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class gji {
    public final int a;
    public final String b;
    public final Bundle c;

    public gji() {
        throw null;
    }

    public gji(int n2, String string, Bundle bundle) {
        this.a = n2;
        this.b = string;
        this.c = bundle;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                gji gji2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof gji)) break block4;
                    gji2 = (gji)object;
                    if (this.a != gji2.a || !((object = this.b) == null ? gji2.b == null : ((String)object).equals(gji2.b))) break block4;
                    object = this.c;
                    gji2 = gji2.c;
                    if (object != null) break block5;
                    if (gji2 != null) break block4;
                    break block6;
                }
                if (!object.equals(gji2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String string = this.b;
        int n2 = 0;
        int n3 = string == null ? 0 : string.hashCode();
        int n4 = this.a;
        string = this.c;
        if (string != null) {
            n2 = string.hashCode();
        }
        return ((n3 ^ (n4 ^ 0xF4243) * 1000003) * 1000003 ^ n2) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        String string = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("OrderedResult{resultCode=");
        stringBuilder.append(this.a);
        stringBuilder.append(", resultData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", resultExtras=");
        stringBuilder.append(string);
        stringBuilder.append(", isAbort=false}");
        return stringBuilder.toString();
    }
}

