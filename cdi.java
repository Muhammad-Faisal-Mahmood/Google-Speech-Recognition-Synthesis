/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class cdi {
    public final int c;

    public cdi(int n2) {
        this.c = n2;
    }

    public static Status h(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Object)((Object)remoteException)).getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(19, stringBuilder.toString());
    }

    public abstract void d(Status var1);

    public abstract void e(Exception var1);

    public abstract void f(cdx var1);

    public abstract void g(cxu var1, boolean var2);
}

