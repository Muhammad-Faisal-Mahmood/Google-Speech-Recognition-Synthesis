/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.speech.RecognitionService$Callback
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionService;
import java.io.File;

public final class fkg {
    public final Object a;
    public final Object b;
    public final Object c;

    public fkg(dgu dgu2, den den2, File file) {
        this.c = den2;
        this.a = file;
        this.b = dgu2;
    }

    public fkg(fki fki2, RecognitionService.Callback callback, Intent intent) {
        this.a = callback;
        this.b = intent;
        this.c = fki2;
    }

    public /* synthetic */ fkg(Runnable runnable, ayc ayc2, Runnable runnable2) {
        this.b = runnable;
        this.c = ayc2;
        this.a = runnable2;
    }

    public static final void c(fkh fkh2) {
        try {
            fkh2.a();
            return;
        }
        catch (RemoteException remoteException) {
            ((heg)((heg)((heg)fki.a.g()).i(remoteException)).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceWrapper$1", "logIfThrows", 203, "RecognitionServiceWrapper.java")).q();
            return;
        }
    }

    public final void a(int n2) {
        fkg.c(new fkd((RecognitionService.Callback)this.a, n2));
        ((fki)this.c).b.remove(this.a);
    }

    public final void b(Bundle bundle) {
        ((fki)this.c).a();
        fkg.c(new fke((RecognitionService.Callback)this.a, bundle, 3));
    }

    public final void d(String object, File object2, Exception exception) {
        Object object3 = (den)this.c;
        ddn ddn2 = object3.o();
        object3 = object3.e();
        exception.getMessage();
        dco dco2 = (dco)ddn2;
        String string = dco2.a;
        ((File)object2).length();
        ddb.a();
        object2 = dco2.b;
        object = new dbd(ddn2, (String)object, (ded)object3, exception, 3);
        ((dgu)this.b).h.d.a((dau)object);
    }

    public final void e() {
        Object object = this.b;
        if (object == null) {
            object = this.a;
            ((ayc)this.c).n();
            object.run();
            return;
        }
        object.run();
    }
}

