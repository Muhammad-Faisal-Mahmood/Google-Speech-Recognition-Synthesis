/*
 * Decompiled with CFR 0.152.
 */
public final class fjs
implements fjt {
    private static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/s3response/RecognizedTextS3ResponseProcessor");

    @Override
    public final void a(idb object, fgr fgr2) {
        Object object2 = iia.d;
        ((hws)object).h((gpm)object2);
        if (((hws)object).r.o((hwu)((gpm)object2).a)) {
            object2 = iia.d;
            ((hws)object).h((gpm)object2);
            object = ((hws)object).r.l((hwu)((gpm)object2).a);
            object = object == null ? ((gpm)object2).d : ((gpm)object2).k(object);
            object = (iia)object;
            if (((iia)object).b == 1) {
                object = (icn)((iia)object).c;
                int n2 = a.v(((icn)object).c);
                if ((n2 == 0 || n2 == 1) && (((icn)object).b & 8) != 0) {
                    CharSequence charSequence = new StringBuilder();
                    CharSequence charSequence2 = new StringBuilder();
                    object = object2 = ((icn)object).e;
                    if (object2 == null) {
                        object = icj.a;
                    }
                    object2 = ((icj)object).b.iterator();
                    block0: while (true) {
                        n2 = 0;
                        while (object2.hasNext()) {
                            object = (ici)object2.next();
                            if ((((ici)object).b & 1) == 0) continue;
                            ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/s3response/RecognizedTextS3ResponseProcessor", "createRecognizedText", 64, "RecognizedTextS3ResponseProcessor.java")).Q(((ici)object).c, ((ici)object).d);
                            if (n2 == 0 && ((ici)object).d >= 0.9) {
                                ((StringBuilder)charSequence2).append(((ici)object).c);
                                continue block0;
                            }
                            charSequence.append(((ici)object).c);
                            n2 = 1;
                        }
                        break;
                    }
                    object = fgd.a.l();
                    charSequence2 = ((StringBuilder)charSequence2).toString();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object2 = ((hwp)object).b;
                    fgd fgd2 = (fgd)object2;
                    fgd2.b = 1 | fgd2.b;
                    fgd2.c = charSequence2;
                    charSequence = charSequence.toString();
                    if (!((hwv)object2).B()) {
                        ((hwp)object).u();
                    }
                    object2 = (fgd)((hwp)object).b;
                    ((fgd)object2).b |= 2;
                    ((fgd)object2).d = charSequence;
                    object = (fgd)((hwp)object).o();
                    ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/s3response/RecognizedTextS3ResponseProcessor", "createRecognizedText", 80, "RecognizedTextS3ResponseProcessor.java")).u("recognizedText %s", object);
                    fgr2.g((fgd)object);
                }
            }
        }
    }
}

