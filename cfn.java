/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

public final class cfn {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    private final ComponentName f;

    public cfn(String string, boolean bl2) {
        kl.ar(string);
        this.b = string;
        kl.ar("com.google.android.gms");
        this.c = "com.google.android.gms";
        this.f = null;
        this.d = 4225;
        this.e = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cfn)) {
            return false;
        }
        object = (cfn)object;
        if (a.k(this.b, ((cfn)object).b) && a.k(this.c, ((cfn)object).c)) {
            ComponentName componentName = ((cfn)object).f;
            if (a.k(null, null)) {
                int n2 = ((cfn)object).d;
                if (this.e == ((cfn)object).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, 4225, this.e});
    }

    public final String toString() {
        return this.b;
    }
}

