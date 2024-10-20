/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class crm
implements ckw {
    public final String a;
    private final int b;

    public /* synthetic */ crm(String string, int n2) {
        this.b = n2;
        this.a = string;
    }

    @Override
    public final void c(Exception exception) {
        if (this.b != 0) {
            boolean bl2 = crn.a;
            Log.w((String)"CBVerifier", (String)String.format("Fail to register phenotypeflags for %s. %s", this.a, exception));
            return;
        }
        boolean bl3 = crn.a;
        Log.w((String)"CBVerifier", (String)String.format("Committing phenotypeflags for %s failed. %s", this.a, exception));
    }
}

