/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

final class fjb
implements fbz {
    final fhy a;
    final AmbientMode$AmbientController b;

    public fjb(fhy fhy2, AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a = fhy2;
        this.b = ambientMode$AmbientController;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(int n2) {
        Object object;
        Object object2 = (heg)((heg)fjc.a.c().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$2", "onProgress", 136, "ModelManagerWrapper.java");
        Object object3 = this.a;
        Object object4 = ((fhy)object3).c;
        object3 = object = idq.b(((fhy)object3).d);
        if (object == null) {
            object3 = idq.a;
        }
        object2.G("Model [%s]-[%s] download %d%%.", object4, ((Enum)object3).name(), n2);
        if (!this.a.f) {
            return;
        }
        object = this.b;
        object3 = ((AmbientMode$AmbientController)object).a;
        synchronized (object3) {
            object = ((AmbientMode$AmbientController)object).a;
            object2 = fib.a.l();
            object4 = fia.a.l();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            fia fia2 = (fia)((hwp)object4).b;
            fia2.b |= 1;
            fia2.c = n2;
            fia2 = (fia)((hwp)object4).o();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object4 = (fib)((hwp)object2).b;
            fia2.getClass();
            ((fib)object4).c = fia2;
            ((fib)object4).b = 2;
            object.c((fib)((hwp)object2).o());
            return;
        }
    }

    @Override
    public final void b() {
        heg heg2 = (heg)((heg)fjc.a.f().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$2", "onScheduled", 154, "ModelManagerWrapper.java");
        Object object = this.a;
        String string = ((fhy)object).c;
        idq idq2 = idq.b(((fhy)object).d);
        object = idq2;
        if (idq2 == null) {
            object = idq.a;
        }
        heg2.C("Model [%s]-[%s] download scheduled.", string, ((Enum)object).name());
        this.b.b(3);
    }

    @Override
    public final void c() {
        heg heg2 = (heg)((heg)fjc.a.f().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$2", "onSuccess", 146, "ModelManagerWrapper.java");
        Object object = this.a;
        String string = ((fhy)object).c;
        idq idq2 = idq.b(((fhy)object).d);
        object = idq2;
        if (idq2 == null) {
            object = idq.a;
        }
        heg2.C("Model [%s]-[%s] download completed.", string, ((Enum)object).name());
        this.b.b(2);
    }

    @Override
    public final void d(int n2) {
        Object object;
        heg heg2 = (heg)((heg)fjc.a.h().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper$2", "onError", 162, "ModelManagerWrapper.java");
        Object object2 = this.a;
        String string = ((fhy)object2).c;
        object2 = object = idq.b(((fhy)object2).d);
        if (object == null) {
            object2 = idq.a;
        }
        object = ((Enum)object2).name();
        switch (n2) {
            default: {
                object2 = "DOWNLOADERROR_LANGUAGE_NOT_SUPPORTED";
                break;
            }
            case 12: {
                object2 = "DOWNLOADERROR_SERVER_DISCONNECTED";
                break;
            }
            case 11: {
                object2 = "DOWNLOADERROR_TOO_MANY_REQUESTS";
                break;
            }
            case 10: {
                object2 = "DOWNLOADERROR_INSUFFICIENT_PERMISSIONS";
                break;
            }
            case 9: {
                object2 = "DOWNLOADERROR_RECOGNIZER_BUSY";
                break;
            }
            case 8: {
                object2 = "DOWNLOADERROR_NO_MATCH";
                break;
            }
            case 7: {
                object2 = "DOWNLOADERROR_SPEECH_TIMEOUT";
                break;
            }
            case 6: {
                object2 = "DOWNLOADERROR_CLIENT";
                break;
            }
            case 5: {
                object2 = "DOWNLOADERROR_SERVER";
                break;
            }
            case 4: {
                object2 = "DOWNLOADERROR_AUDIO";
                break;
            }
            case 3: {
                object2 = "DOWNLOADERROR_NETWORK";
            }
        }
        heg2.G("Model [%s]-[%s] download failed %s", string, object, object2);
        this.b.b(5);
    }
}

