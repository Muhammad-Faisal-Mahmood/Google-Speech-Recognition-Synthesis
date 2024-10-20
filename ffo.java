/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public final class ffo
implements fgq {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer");
    public final hpr b;
    public final Context c;
    public final fgr d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public jnf f;
    private final hpr g;
    private final idh h;
    private final fgu i;
    private final boolean j;
    private jnf k;

    public ffo(hpr hpr2, hpr hpr3, idh idh2, Context context, feh feh2, fgu fgu2, fgr fgr2) {
        this.g = hpr2;
        this.b = hpr3;
        this.h = idh2;
        this.c = context;
        this.j = feh2.h;
        this.i = fgu2;
        this.d = fgr2;
    }

    public static Throwable b(Throwable throwable, Class clazz) {
        while (throwable != null) {
            if (clazz.isInstance(throwable)) {
                return throwable;
            }
            throwable = throwable.getCause();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void e() {
        synchronized (this) {
            Object object = iyh.c;
            iyi iyi2 = new iyi((iyh)object);
            if (this.e.compareAndSet(false, true)) {
                ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "closeNetworkIfNeeded", 286, "NetworkSpeechRecognizer.java")).r("User cancelled, closing S3 stream");
                jnf jnf2 = this.f;
                if (jnf2 != null) {
                    object = (hwr)ida.a.l();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    ida.G((ida)((hwr)object).b);
                    jnf2.c((ida)((hwp)object).o());
                    this.f.b(iyi2);
                }
                if ((object = this.k) != null) {
                    object.b(iyi2);
                    return;
                }
            }
            return;
        }
    }

    @Override
    public final void a() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "cancel", 213, "NetworkSpeechRecognizer.java")).r("#cancel");
        this.d(new fds());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(Supplier object, int n2, int n3) {
        synchronized (this) {
            Object object2 = a;
            ((heg)((heg)((hdz)object2).f()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 102, "NetworkSpeechRecognizer.java")).r("Online recognizer - start listening");
            if (this.e.get()) {
                ((heg)((heg)((hdz)object2).g()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 104, "NetworkSpeechRecognizer.java")).r("#closeNetworkIfNeeded called before #startNetworkAndProcessResponses");
                return;
            }
            if (this.k == null && this.f == null) {
                Object object3 = new fjq(0);
                Object object4 = new fjs();
                Object object5 = this.i;
                Object object6 = new fjr(((fgu)object5).C, ((fgu)object5).v.isPresent());
                object5 = new fjq(2);
                Object object7 = new fjq(1);
                object6 = gzx.s(object3, object4, object6, object5, object7);
                this.k = object3 = new ffn(this, (List)object6);
                object4 = this.h;
                object6 = new iwx();
                object5 = iwx.b;
                object7 = new iwm("X-Goog-Api-Key", (iwn)object5);
                ((iwx)object6).g((iws)object7, "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
                object5 = iwx.b;
                object7 = new iwm("X-Android-Package", (iwn)object5);
                ((iwx)object6).g((iws)object7, "com.google.android.googlequicksearchbox");
                object5 = iwx.b;
                object7 = new iwm("X-Android-Cert", (iwn)object5);
                ((iwx)object6).g((iws)object7, "58E1C4133F7441EC3D2C270270A14802DA47BA0E");
                object7 = new hsq(object6, 2);
                object7 = (idh)((jmn)object4).c(new iua[]{object7});
                object4 = hrz.a;
                Object object8 = new idi();
                object6 = ((jmn)object7).a;
                object4 = ((jmn)object7).b.f((itv)object4, object8);
                object7 = new idh((itx)object6, (itw)object4);
                object8 = ((jmn)object7).a;
                object6 = object4 = idi.b;
                if (object4 == null) {
                    synchronized (idi.class) {
                        object6 = object4 = idi.b;
                        if (object4 == null) {
                            object6 = ixb.a();
                            ((iwy)object6).c = ixa.d;
                            ((iwy)object6).d = ixb.c("speech.s3.S3StubbyClientConnectorService", "S3Bidi");
                            ((iwy)object6).b();
                            object4 = ida.a;
                            Object object9 = jmj.a;
                            ((iwy)object6).a = object9 = new jmi((hyf)object4);
                            object9 = idb.a;
                            ((iwy)object6).b = object4 = new jmi((hyf)object9);
                            idi.b = object6 = ((iwy)object6).a();
                        }
                    }
                }
                object6 = ((itx)object8).a((ixb)object6, ((jmn)object7).b);
                a.s(object3, "responseObserver");
                object4 = new jmp((itz)object6);
                object7 = new jms((jnf)object3, (jmp)object4);
                jmw.c((itz)object6, (jmr)object7);
                this.f = object5 = new fej((jnf)object4);
                object4 = (InputStream)ag$$ExternalSyntheticApiModelOutline1.m((Supplier)object);
                object = object6 = this.i.f;
                if (((Enum)object6).equals(fgs.e)) {
                    object = fgs.c;
                }
                object6 = object;
                if (!this.j) {
                    object6 = object;
                    if (this.i.o) {
                        object6 = fgs.d;
                    }
                }
                ((heg)((heg)((hdz)object2).f()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startSendingS3Requests", 137, "NetworkSpeechRecognizer.java")).E("#startSendingS3Requests, multi = %b, entrypoint = %s", this.i.o, ((Enum)object6).name());
                object = this.i;
                object2 = new fgt((fgu)object);
                ((fgt)object2).o((fgs)object6);
                object = ((fgt)object2).a();
                object6 = new ffd(this, 4);
                object6 = fxf.ag((Runnable)object6, this.g);
                object2 = new ffm(this, (fgu)object, n2, n3, (InputStream)object4);
                object6 = fxf.ak((hpn)object6, (hny)object2, this.g);
                object = new cmr(this, 9);
                fxf.al((hpn)object6, (hpb)object, this.b);
                return;
            }
            ((heg)((heg)((hdz)object2).g()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 108, "NetworkSpeechRecognizer.java")).r("#startNetworkAndProcessResponses called twice");
            return;
        }
    }

    public final void d(fef fef2) {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "failWithException", 206, "NetworkSpeechRecognizer.java")).r("#failWithException");
        this.d.c(fef2);
        this.e();
    }
}

