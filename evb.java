/*
 * Decompiled with CFR 0.152.
 */
public final class evb
extends jqs
implements jrp {
    public Object a;
    public final evi b;

    public evb(evi evi2, jqb jqb2) {
        this.b = evi2;
        super(3, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        Object object2 = this.a;
        object = (heg)evi.a.g().h(hfo.a, "ALT.GrpcARCRespSender");
        object2 = (Throwable)object2;
        ((heg)object.i((Throwable)object2).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$sendAudioBytesReceiverRegistry$2$2", "invokeSuspend", 247, "StreamListeningSessionResponseSender.kt")).r("#audio# Fail while getting flow's session audio data, shutting down");
        this.b.i((Throwable)object2);
        return jon.a;
    }
}

