/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class cde
extends cdi {
    protected final cdl a;

    public cde(int n2, cdl cdl2) {
        super(n2);
        this.a = cdl2;
    }

    @Override
    public final void d(Status status) {
        try {
            this.a.f(status);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Log.w((String)"ApiCallRunner", (String)"Exception reporting failure", (Throwable)illegalStateException);
            return;
        }
    }

    @Override
    public final void e(Exception object) {
        String string = object.getClass().getSimpleName();
        object = ((Throwable)object).getLocalizedMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        object = new Status(10, stringBuilder.toString());
        try {
            this.a.f((Status)object);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Log.w((String)"ApiCallRunner", (String)"Exception reporting failure", (Throwable)illegalStateException);
            return;
        }
    }

    @Override
    public final void f(cdx cdx2) {
        try {
            this.a.e(cdx2.b);
            return;
        }
        catch (RuntimeException runtimeException) {
            this.e(runtimeException);
            return;
        }
    }

    @Override
    public final void g(cxu cxu2, boolean bl2) {
        cdl cdl2 = this.a;
        cxu2.a.put(cdl2, bl2);
        ((ccx)cdl2).c(new cgb(cxu2, cdl2, 1));
    }
}

