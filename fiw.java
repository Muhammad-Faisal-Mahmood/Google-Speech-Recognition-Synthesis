/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.ParcelFileDescriptor
 */
import android.os.Build;
import android.os.ParcelFileDescriptor;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class fiw
implements jnf {
    public final String a;
    final jnf b;
    public final fjj c;
    final fix d;

    public fiw(fix fix2, String string, jnf jnf2, fjj fjj2) {
        this.a = string;
        this.b = jnf2;
        this.c = fjj2;
        this.d = fix2;
    }

    @Override
    public final void a() {
        ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl$4", "onCompleted", 342, "GoogleAsrServiceImpl.java")).u("[%s] #recognitionSession onCompleted", this.a);
        this.c.r(Optional.empty());
    }

    @Override
    public final void b(Throwable throwable) {
        throw null;
    }

    @Override
    public final /* synthetic */ void c(Object object) {
        hwv hwv2 = (fij)object;
        int n2 = hwv2.b;
        if (n2 == 1) {
            Object object2;
            Object object3;
            Optional<ParcelFileDescriptor> optional = (fig)hwv2.c;
            object = fix.a;
            object = object3 = ((fig)((Object)optional)).g;
            if (object3 == null) {
                object = fhm.a;
            }
            object3 = fhj.d;
            ((hws)object).h((gpm)object3);
            if (((hws)object).r.o((hwu)((gpm)object3).a)) {
                object2 = fix.b;
                object = object3 = ((fig)((Object)optional)).b;
                if (object3 == null) {
                    object = fhi.a;
                }
                if (!((gzm)object2).contains(((fhi)object).b)) {
                    optional = (heg)((heg)fix.a.g().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl$4", "onNext", 288, "GoogleAsrServiceImpl.java");
                    object2 = this.a;
                    object = hwv2.b == 1 ? (fig)hwv2.c : fig.a;
                    object = object3 = ((fig)object).b;
                    if (object3 == null) {
                        object = fhi.a;
                    }
                    optional.C("[%s] Invalid client %s sending data donation request.", object2, ((fhi)object).b);
                    object = this.b;
                    object3 = (hwr)fiq.a.l();
                    optional = fip.a.l();
                    if (!((hwp)((Object)optional)).b.B()) {
                        ((hwp)((Object)optional)).u();
                    }
                    object2 = ((hwp)((Object)optional)).b;
                    hwv2 = (fip)object2;
                    ((fip)hwv2).c = 5;
                    ((fip)hwv2).b |= 1;
                    if (!((hwv)object2).B()) {
                        ((hwp)((Object)optional)).u();
                    }
                    hwv2 = (fip)((hwp)((Object)optional)).b;
                    ((fip)hwv2).d = 1;
                    ((fip)hwv2).b |= 2;
                    optional = (fip)((hwp)((Object)optional)).o();
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    hwv2 = (fiq)((hwr)object3).b;
                    optional.getClass();
                    ((fiq)hwv2).c = optional;
                    ((fiq)hwv2).b = 1;
                    object.c((fiq)((hwp)object3).o());
                    this.b.a();
                    return;
                }
            }
            object2 = this.d;
            object = hwv2.b == 1 ? (fig)hwv2.c : fig.a;
            ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "triggerUsmEncoderLpDownloadIfRequired", 352, "GoogleAsrServiceImpl.java")).r("#triggerUsmEncoderLpDownloadIfRequired");
            if (((fix)object2).e) {
                object3 = optional = ((fig)object).g;
                if (optional == null) {
                    object3 = fhm.a;
                }
                object3 = optional = ((fhm)object3).o;
                if (optional == null) {
                    object3 = fhe.a;
                }
                if ((n2 = fhq.g(((fhe)object3).b)) != 0 && n2 != 1) {
                    object2 = ((fix)object2).c;
                    Object object4 = fhy.a.l();
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    hwv hwv3 = ((hwp)object4).b;
                    object3 = (fhy)hwv3;
                    ((fhy)object3).b |= 1;
                    ((fhy)object3).c = "ag-AG";
                    object3 = optional = idq.b(((fig)object).c);
                    if (optional == null) {
                        object3 = idq.a;
                    }
                    if (!hwv3.B()) {
                        ((hwp)object4).u();
                    }
                    optional = ((hwp)object4).b;
                    hwv3 = (fhy)((Object)optional);
                    ((fhy)hwv3).d = ((idq)object3).m;
                    ((fhy)hwv3).b = 2 | ((fhy)hwv3).b;
                    if (!((hwv)((Object)optional)).B()) {
                        ((hwp)object4).u();
                    }
                    object3 = (fhy)((hwp)object4).b;
                    ((fhy)object3).b |= 4;
                    ((fhy)object3).e = true;
                    object = object3 = ((fig)object).b;
                    if (object3 == null) {
                        object = fhi.a;
                    }
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object3 = (fhy)((hwp)object4).b;
                    object.getClass();
                    ((fhy)object3).g = object;
                    ((fhy)object3).b |= 0x10;
                    optional = (fhy)((hwp)object4).o();
                    object4 = ((fjc)object2).c;
                    object = object3 = idq.b(((fhy)((Object)optional)).d);
                    if (object3 == null) {
                        object = idq.a;
                    }
                    fxf.al(grf.g(object4.a("ag-AG", false, (idq)object)).h(new fiz(0), ((fjc)object2).d).f(Throwable.class, new buf(20), ((fjc)object2).d), new ena(object2, optional, 9), ((fjc)object2).d);
                }
            }
            Optional.empty();
            object3 = Optional.empty();
            object = hwv2.b == 1 ? (fig)hwv2.c : fig.a;
            if (object != null) {
                optional = Optional.ofNullable((ParcelFileDescriptor)idi.B(fhs.a));
                if (optional != null) {
                    if (Build.VERSION.SDK_INT >= 35 && (object3 = Optional.ofNullable(ut$$ExternalSyntheticApiModelOutline0.m(idi.B(fhs.b)))) == null) {
                        throw new NullPointerException("Null attributionSource");
                    }
                    object3 = new fji((fig)object, optional, (Optional)object3);
                    ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl$4", "onNext", 320, "GoogleAsrServiceImpl.java")).G("[%s] #recognitionSession startAction with pfd: %b, attrSrc: %b", this.a, ((fji)object3).b.isPresent(), ((fji)object3).c.isPresent());
                    object = this.c;
                    object3 = new czm(object, object3, 14, null);
                    optional = ((fjj)object).c;
                    gax.c(((fjj)object).m.E((Callable)object3, (Executor)((Object)optional)), "Failed handling #startRecognition", new Object[0]);
                    return;
                }
                throw new NullPointerException("Null audioSource");
            }
            throw new NullPointerException("Null startAction");
        }
        if (n2 == 2) {
            ((heg)((heg)fix.a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl$4", "onNext", 327, "GoogleAsrServiceImpl.java")).u("[%s] #recognitionSession receive stop action", this.a);
            object = this.c;
            ((fjj)object).s("stopRecognition", new fgm(object, 9));
        }
    }
}

