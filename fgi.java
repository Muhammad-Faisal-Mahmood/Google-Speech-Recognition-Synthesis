/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class fgi
implements hnx {
    public final Supplier a;
    public final int b;
    public final int c;
    public final Object d;
    private final int e;

    public /* synthetic */ fgi(Object object, Supplier supplier, int n2, int n3, int n4) {
        this.e = n4;
        this.d = object;
        this.a = supplier;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final hpn a() {
        if (this.e != 0) {
            Object object = this.d;
            Object object2 = (ffr)object;
            if (((ffr)object2).g != null) {
                ((heg)((heg)ffr.a.g().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 72, "OnDevicePrimaryRecognizer.java")).r("Recognizer already starts listening, ignore.");
                object2 = hpj.a;
            } else {
                int n2 = this.c;
                int n3 = this.b;
                Supplier supplier = this.a;
                Object object3 = ((ffr)object2).b;
                Object object4 = (heg)((heg)ffr.a.f().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 77, "OnDevicePrimaryRecognizer.java");
                Object object5 = ((ffr)object2).b.h;
                object3 = ((fgu)object3).b;
                object4.C("Initialize OnDevicePrimary [locale: %s] [applicationDomain: %s]", object3, ((Enum)object5).name());
                ffj ffj2 = ((ffr)object2).f;
                object5 = ((ffr)object2).b;
                object4 = ((fgu)object5).h;
                object2 = grf.g(ffj2.a(((fgu)object5).b, false, (idq)object4)).h(new ffp(object, object3, 0), ((ffr)object2).e).h(new ffq((ffr)object2, supplier, n3, n2, 0), ((ffr)object2).e).e(Throwable.class, new ezt(object, 17), ((ffr)object2).e);
            }
            return object2;
        }
        ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 225, "SodaSpeechRecognizer.java")).r("Offline recognizer - start listening");
        Object object = this.d;
        Object object6 = (fgo)object;
        if (((fgo)object6).w != null) {
            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 229, "SodaSpeechRecognizer.java")).r("Recognizer already starts listening.");
            object6 = hpj.a;
        } else {
            int n4 = this.c;
            int n5 = this.b;
            Supplier supplier = this.a;
            Object object7 = ((fgo)object6).k;
            heg heg2 = (heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 235, "SodaSpeechRecognizer.java");
            idq idq2 = ((fgu)object7).h;
            object7 = ((fgu)object7).b;
            heg2.C("Initialize Soda [locale: %s], [applicationDomain: %s]", object7, idq2.name());
            object6 = grf.g(((fgo)object6).b.a((String)object7, ((fgo)object6).k.A.isPresent(), idq2)).i(new ezz(object, 14), ((fgo)object6).c).i(new fgj((fgo)object6, idq2), ((fgo)object6).c).i(new fgk((fgo)object6, supplier, n5, n4), ((fgo)object6).d).f(Throwable.class, new ezz(object, 12), ((fgo)object6).d);
        }
        return object6;
    }
}

