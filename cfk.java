/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Build
 *  android.util.Log
 */
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

public abstract class cfk
implements DialogInterface.OnClickListener {
    protected abstract void a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(DialogInterface dialogInterface, int n2) {
        Throwable throwable2;
        block5: {
            try {
                try {
                    this.a();
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    String string = "Failed to start resolution intent.";
                    if (Build.FINGERPRINT.contains("generic")) {
                        string = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                    }
                    Log.e((String)"DialogRedirect", (String)string, (Throwable)activityNotFoundException);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
        throw throwable2;
    }
}

