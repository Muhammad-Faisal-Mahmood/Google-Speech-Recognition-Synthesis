/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 */
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.concurrent.Executor;

public final class enx {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker");
    public final Context b;
    public final Executor c;

    public enx(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    public final void a(hpn hpn2, hpn hpn3, int n2, String string) {
        hhk.T(hpn2, gqk.g(new eut(this, n2, string, hpn3, 1)), this.c);
    }

    public final void b(String string) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        AppOpsManager appOpsManager = (AppOpsManager)this.b.getSystemService("appops");
        if (appOpsManager == null) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "finishOp", 104, "RecordAudioOpChecker.java")).r("#audio# unable to get access to app ops manager for startOp");
            return;
        }
        Context context = this.b;
        sk$$ExternalSyntheticApiModelOutline1.m(appOpsManager, "android:record_audio", Process.myUid(), context.getPackageName(), string);
    }

    public final boolean c() {
        if (!tt.b()) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager)this.b.getSystemService("appops");
        if (appOpsManager == null) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "isRecordAudioOpAllowed", 46, "RecordAudioOpChecker.java")).r("#audio# Unable to get access to app ops manager");
            return true;
        }
        Context context = this.b;
        return dp$$ExternalSyntheticApiModelOutline0.m(appOpsManager, "android:record_audio", Process.myUid(), context.getPackageName()) == 0;
    }
}

