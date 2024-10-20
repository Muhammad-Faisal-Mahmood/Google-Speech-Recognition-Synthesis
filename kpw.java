/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 */
import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

final class kpw
extends BroadcastReceiver {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context context, Intent object) {
        if ("android.security.action.TRUST_STORE_CHANGED".equals(object.getAction())) {
            try {
                object = kpx.d;
                synchronized (object) {
                    kpx.a = null;
                    kpx.c = null;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                Log.e((String)"cr_X509Util", (String)"Unable to reload the default TrustManager", (Throwable)noSuchAlgorithmException);
                return;
            }
            catch (KeyStoreException keyStoreException) {
                Log.e((String)"cr_X509Util", (String)"Unable to reload the default TrustManager", (Throwable)keyStoreException);
                return;
            }
            catch (CertificateException certificateException) {
                Log.e((String)"cr_X509Util", (String)"Unable to reload the default TrustManager", (Throwable)certificateException);
                return;
            }
            {
                kpx.c();
            }
            {
                N.M6C2IQIc();
                return;
            }
        }
        if ("android.security.action.KEYCHAIN_CHANGED".equals(object.getAction())) {
            N.MJdorYDE();
            return;
        }
        if ("android.security.action.KEY_ACCESS_CHANGED".equals(object.getAction()) && !object.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
            N.MJdorYDE();
        }
    }
}

