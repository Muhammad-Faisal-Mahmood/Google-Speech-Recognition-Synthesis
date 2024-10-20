/*
 * Decompiled with CFR 0.152.
 */
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

public final class cdw
implements Runnable {
    final int a;
    final Object b;
    private final int c;

    public cdw(Object object, int n2, int n3) {
        this.c = n3;
        this.a = n2;
        this.b = object;
    }

    public /* synthetic */ cdw(Object object, int n2, int n3, byte[] byArray) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    public cdw(Object object, int n2, int n3, char[] cArray) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    @Override
    public final void run() {
        int n2 = this.c;
        int n3 = 4;
        switch (n2) {
            default: {
                n3 = this.a;
                ((VersionSafeCallbacks$UrlRequestStatusListener)this.b).ah(n3);
                return;
            }
            case 14: {
                switch (this.a) {
                    default: {
                        throw new IllegalArgumentException("No request status found.");
                    }
                    case 15: {
                        n3 = 14;
                        break;
                    }
                    case 14: {
                        n3 = 13;
                        break;
                    }
                    case 13: {
                        n3 = 12;
                        break;
                    }
                    case 12: {
                        n3 = 11;
                        break;
                    }
                    case 11: {
                        n3 = 10;
                        break;
                    }
                    case 10: {
                        n3 = 9;
                        break;
                    }
                    case 9: {
                        n3 = 8;
                        break;
                    }
                    case 8: {
                        n3 = 7;
                        break;
                    }
                    case 7: {
                        n3 = 6;
                        break;
                    }
                    case 6: {
                        n3 = 5;
                        break;
                    }
                    case 3: {
                        n3 = 3;
                        break;
                    }
                    case 2: {
                        n3 = 2;
                        break;
                    }
                    case 1: {
                        n3 = 1;
                        break;
                    }
                    case 0: {
                        n3 = 0;
                    }
                    case 4: 
                }
                ((VersionSafeCallbacks$UrlRequestStatusListener)this.b).ah(n3);
                return;
            }
            case 13: {
                n3 = this.a;
                ((koy)((Object)this.b)).b.l.y(n3);
                return;
            }
            case 12: {
                n3 = this.a;
                ((jdi)this.b).e.l(n3);
                return;
            }
            case 11: {
                n3 = this.a;
                ((jdi)this.b).e.k(n3);
                return;
            }
            case 10: {
                n3 = this.a;
                ((jdi)this.b).e.g(n3);
                return;
            }
            case 9: {
                n3 = this.a;
                ((jdd)this.b).b.e(n3);
                return;
            }
            case 8: {
                long l2;
                jcx jcx2;
                n3 = jnr.a;
                try {
                    jcx2 = ((jbi)this.b).j;
                    n3 = this.a;
                    fxf.r(true, "numMessages must be > 0");
                    if (((jgj)jcx2).b()) {
                        return;
                    }
                    l2 = ((jgj)jcx2).e;
                }
                catch (Throwable throwable) {
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        ((jbi)this.b).b(throwable2);
                        return;
                    }
                }
                long l3 = n3;
                ((jgj)jcx2).e = l2 + l3;
                ((jgj)jcx2).a();
                return;
            }
            case 7: {
                hte hte2 = (hte)this.b;
                if (!hte2.h) {
                    n3 = this.a;
                    if (hte2.e.e == 4) {
                        hte2.i.e(n3);
                        return;
                    }
                    hte2.d += n3;
                }
                return;
            }
            case 6: {
                ((hsu)this.b).b.e(this.a);
                return;
            }
            case 5: {
                ((hsm)this.b).b().e(this.a);
                return;
            }
            case 4: {
                n3 = this.a;
                ((gaw)((Object)this.b)).stopSelf(n3);
                return;
            }
            case 3: {
                ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "scheduleSpeechInputCompleteSilenceLengthTimeout", 340, "RecognitionClient.java")).s("%d ms silence timeout reached - closing mic", this.a);
                ((ffu)this.b).b.f.e();
                return;
            }
            case 2: {
                n3 = this.a;
                ((dqy)this.b).a(n3 + 1);
                return;
            }
            case 1: {
                n3 = this.a;
                Object object = (ajd)this.b;
                ((ajd)object).a[n3].J();
                object = ((ajd)object).i;
                ((akl)object).u(((akl)object).t(), 1033, new akd(18));
                return;
            }
            case 0: 
        }
        n3 = this.a;
        ((cdx)this.b).k(n3);
    }
}

