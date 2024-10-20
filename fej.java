/*
 * Decompiled with CFR 0.152.
 */
public final class fej
implements jnf {
    private final jnf a;

    public fej(jnf jnf2) {
        this.a = jnf2;
    }

    @Override
    public final void a() {
        try {
            this.a.a();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            a.as(fek.a.h(), "Calling onCompleted failed.", "com/google/android/libraries/speech/transcription/grpc/S3ConnectionUtil$CatchingStreamObserver", "onCompleted", 'A', "S3ConnectionUtil.java", illegalStateException);
            return;
        }
    }

    @Override
    public final void b(Throwable throwable) {
        try {
            jnf jnf2 = this.a;
            ((jmp)jnf2).a.c("Cancelled by client with StreamObserver.onError()", throwable);
            ((jmp)jnf2).b = true;
            return;
        }
        catch (IllegalStateException illegalStateException) {
            a.as(fek.a.h(), "Calling onError failed.", "com/google/android/libraries/speech/transcription/grpc/S3ConnectionUtil$CatchingStreamObserver", "onError", 'J', "S3ConnectionUtil.java", illegalStateException);
            return;
        }
    }
}

