/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.RemoteException
 */
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

final class ize
implements izv {
    static final ize a = new ize();

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(int n2, Parcel parcel) {
        if (n2 != 1 || parcel.readInt() <= 0) return false;
        parcel = parcel.readStrongBinder();
        jah jah2 = jah.c();
        jah2.a().writeInt(0);
        parcel.transact(2, jah2.a(), null, 1);
        jah2.close();
        return false;
        catch (Throwable throwable) {
            try {
                jah2.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (RemoteException remoteException) {
                    izf.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", remoteException);
                }
            }
        }
        return false;
    }
}

