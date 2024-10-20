/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

final class eva
extends jqs
implements jro {
    Object a;
    final evi b;
    final jrk c;
    final jvb d;

    public eva(evi evi2, jrk jrk2, jvb jvb2, jqb jqb2) {
        this.b = evi2;
        this.c = jrk2;
        this.d = jvb2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        object = (dzn)this.a;
        object = (eun)this.c.a(object);
        if (joe.a(this.b.f((eun)object)) != null) {
            object = this.d;
            ((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$sendAudioBytesReceiverRegistry$2$1", "invokeSuspend", 238, "StreamListeningSessionResponseSender.kt")).r("#audio# Stopping sending bytes to the remote client");
            jwi jwi2 = (jwi)object.bA().get(jwi.c);
            if (jwi2 != null) {
                jwi2.r(null);
            } else {
                Objects.toString(object);
                throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(object)));
            }
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new eva(this.b, this.c, this.d, jqb2);
        ((eva)jqb2).a = object;
        return jqb2;
    }
}

