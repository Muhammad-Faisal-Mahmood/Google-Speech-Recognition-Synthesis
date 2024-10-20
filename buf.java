/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

public final class buf
implements hny {
    private final int a;

    public /* synthetic */ buf(int n2) {
        this.a = n2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.a;
        Object object2 = true;
        switch (n2) {
            default: {
                object = (Throwable)object;
                ((heg)((heg)((heg)fjc.a.f().h(hfo.a, "ModelManagerWrapper")).i((Throwable)object)).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper", "downloadUsmEncoderLp", 194, "ModelManagerWrapper.java")).r("Can't get USM encoder LP.");
                return hhk.K(Optional.empty());
            }
            case 19: {
                object = Collection$_EL.stream((gzx)object).map(new fab(12));
                n2 = gzx.d;
                return hhk.K((gzx)object.collect(gye.a));
            }
            case 18: {
                object2 = (Throwable)object;
                a.as(elb.a.h(), "#audio# startListening failed: exception thrown.", "com/google/android/libraries/search/audio/core/common/ResultUtils", "catchingStartListeningResultFuture", '\u017d', "ResultUtils.java", (Throwable)object2);
                object = elb.e(ebs.b);
                if (object2 instanceof elx) {
                    object = ((elx)object2).a;
                }
                object2 = gsl.a;
                return hhk.K(ekr.b((gto)object2, (gto)object2, (ebt)object, (gto)object2, hhk.K(eaf.a)));
            }
            case 17: {
                object2 = (Throwable)object;
                a.as(elb.a.h(), "#audio# startListeningForHotword failed: exception thrown.", "com/google/android/libraries/search/audio/core/common/ResultUtils", "catchingHotwordStartListeningResultFuture", '\u019a', "ResultUtils.java", (Throwable)object2);
                object = elb.e(ebs.b);
                if (object2 instanceof elx) {
                    object = ((elx)object2).a;
                }
                object2 = gsl.a;
                return hhk.K(ekr.e((gto)object2, (gto)object2, (ebt)object, (gto)object2, hhk.K(eaf.a)));
            }
            case 16: {
                object = (ccq)object;
                throw new dut(((ccq)object).a(), ((Throwable)object).getMessage(), (Throwable)object);
            }
            case 15: {
                object = (List)object;
                return hhk.K(object2);
            }
            case 14: {
                object = (cxk)object;
                return hhk.K(null);
            }
            case 13: {
                object2 = (Boolean)object;
                object = new cxk();
                if (!((Boolean)object2).booleanValue()) {
                    throw new IOException("failed to save sharedFilesMetadata", (Throwable)object);
                }
                throw object;
            }
            case 12: {
                object = object2 = ctp.b(((ctv)object).d);
                if (object2 == null) {
                    object = ctp.a;
                }
                return hhk.K(object);
            }
            case 11: {
                object = (Boolean)object;
                return hpj.a;
            }
            case 10: {
                object = object2 = (cth)object;
                if (object2 == null) {
                    object = cth.a;
                }
                return hhk.K(object);
            }
            case 9: {
                return crh.w((List)object).u(new cuh(13), (Executor)hom.a);
            }
            case 8: {
                object = (Boolean)object;
                return hpj.a;
            }
            case 7: {
                object = (IOException)object;
                object2 = css.a();
                ((kqr)object2).b = csr.J;
                ((kqr)object2).d = object;
                return hhk.J(((kqr)object2).a());
            }
            case 6: {
                object = (Boolean)object;
                return hpj.a;
            }
            case 5: {
                object = (cxr)object;
                return hhk.K(object2);
            }
            case 4: {
                cyr.j((IOException)object, "%s: IOException while adding group for download", "MobileDataDownload");
                return hhk.K(false);
            }
            case 3: {
                return cni.b((bqe)object);
            }
            case 2: {
                iej iej2 = (iej)object;
                object = ifi.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ifi)((hwp)object).b;
                iej2.getClass();
                ((ifi)object2).c = iej2;
                ((ifi)object2).b = 5;
                return hhk.K((ifi)((hwp)object).o());
            }
            case 1: {
                object = (Throwable)object;
                ((heg)((heg)((heg)bug.a.h()).i((Throwable)object)).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoicepackUpdaterWorker", "startWorkInternal", 139, "VoicepackUpdaterWorker.java")).r("Voicepack update failed.");
                return hhk.K(new bbe());
            }
            case 0: 
        }
        object = (dcm)object;
        return hhk.K(new bbg());
    }
}

