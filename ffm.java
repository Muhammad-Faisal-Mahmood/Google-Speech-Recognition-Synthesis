/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 */
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.Locale;

public final class ffm
implements hny {
    public final ffo a;
    public final fgu b;
    public final int c;
    public final int d;
    public final InputStream e;

    public /* synthetic */ ffm(ffo ffo2, fgu fgu2, int n2, int n3, InputStream inputStream) {
        this.a = ffo2;
        this.b = fgu2;
        this.c = n2;
        this.d = n3;
        this.e = inputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        int n2;
        int n3;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        hwp hwp2;
        Object object5;
        ffo ffo2;
        block72: {
            Object object6;
            Object object7;
            Object object8;
            Object object9;
            object = (Void)object;
            ffo2 = this.a;
            fxf.K(ffo2.f);
            object5 = ffo2.f;
            hwp2 = (hwr)ida.a.l();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object4 = this.b;
            object = (ida)((hwr)hwp2).b;
            ((ida)object).b |= 2;
            ((ida)object).d = true;
            object = true != ((fgu)object4).c.isEmpty() ? "multi-recognizer" : "recognizer";
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (ida)((hwr)hwp2).b;
            ((ida)object3).b |= 1;
            ((ida)object3).c = object;
            object = ((fgu)object4).H;
            try {
                if (!((AbstractCollection)object).isEmpty()) {
                    object = icy.c;
                    object3 = icy.a.l();
                    object9 = Collection$_EL.stream(((fgu)object4).H);
                    object2 = new fcx(9);
                    object8 = (Iterable)object9.map(object2).collect(gye.a);
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object9 = (icy)((hwp)object3).b;
                    object2 = ((icy)object9).b;
                    if (!object2.c()) {
                        ((icy)object9).b = hwv.q((hxb)object2);
                    }
                    hvc.g((Iterable)object8, ((icy)object9).b);
                    ((hwr)hwp2).aH((gpm)object, (icy)((hwp)object3).o());
                }
            }
            catch (NumberFormatException numberFormatException) {
                a.as(fjp.a.g(), "[RS][S3] failed to parse experiment ids.", "com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "buildS3Header", 'S', "BaseS3HeaderProducer.java", numberFormatException);
            }
            object2 = new gzs();
            object = ((fgu)object4).f;
            if (((Enum)object).equals(fgs.a)) {
                ((heg)((heg)fjp.a.g()).j("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3ClientInfo", 115, "BaseS3HeaderProducer.java")).r("[RS][S3] transcription entrypoint is undefined.");
            }
            object9 = ((Enum)object).name().toLowerCase(Locale.US).replace('_', '-');
            object = object3 = ((fgu)object4).e;
            if (((String)object3).isEmpty()) {
                object = ((fgu)object4).d;
            }
            ((heg)((heg)fjp.a.f()).j("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3ClientInfo", 123, "BaseS3HeaderProducer.java")).u("[RS][S3] triggerApplicationId: %s", object);
            object3 = icx.a.l();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            Object object10 = ((hwp)object3).b;
            object8 = (icx)object10;
            object.getClass();
            ((icx)object8).b |= 0x800;
            ((icx)object8).g = object;
            if (!((hwv)object10).B()) {
                ((hwp)object3).u();
            }
            icx.c((icx)((hwp)object3).b);
            object = Build.DISPLAY;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object8 = (icx)((hwp)object3).b;
            object.getClass();
            ((icx)object8).b |= 8;
            ((icx)object8).c = object;
            object = Build.MODEL;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object8 = ((hwp)object3).b;
            object10 = (icx)object8;
            object.getClass();
            ((icx)object10).b |= 0x40;
            ((icx)object10).f = object;
            if (!((hwv)object8).B()) {
                ((hwp)object3).u();
            }
            object = ffo2.c;
            object8 = (icx)((hwp)object3).b;
            object9.getClass();
            ((icx)object8).b |= 0x10;
            ((icx)object8).d = object9;
            object9 = object.getPackageManager();
            try {
                object = object9.getPackageInfo(object.getPackageName(), 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                throw new IllegalStateException(nameNotFoundException);
            }
            object9 = Integer.toString(((PackageInfo)object).versionCode);
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object = (icx)((hwp)object3).b;
            object9.getClass();
            ((icx)object).b |= 0x20;
            ((icx)object).e = object9;
            object = (icx)((hwp)object3).o();
            object3 = new fas(icx.h, object, 8, null);
            object9 = idc.a.l();
            object = icw.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            icw.c((icw)((hwp)object).b);
            object8 = ((fgu)object4).b;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object10 = (icw)((hwp)object).b;
            object8.getClass();
            ((icw)object10).b |= 1;
            ((icw)object10).c = object8;
            object = (icw)((hwp)object).o();
            if (!((hwp)object9).b.B()) {
                ((hwp)object9).u();
            }
            object8 = (idc)((hwp)object9).b;
            object.getClass();
            ((idc)object8).c = object;
            ((idc)object8).b |= 1;
            object = ((fgu)object4).c;
            n4 = object.size();
            for (n3 = 0; n3 < n4; ++n3) {
                object10 = (String)object.get(n3);
                object7 = icw.a.l();
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                icw.c((icw)((hwp)object7).b);
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object8 = (icw)((hwp)object7).b;
                object10.getClass();
                ((icw)object8).b |= 1;
                ((icw)object8).c = object10;
                object10 = (icw)((hwp)object7).o();
                if (!((hwp)object9).b.B()) {
                    ((hwp)object9).u();
                }
                object8 = (idc)((hwp)object9).b;
                object10.getClass();
                object7 = ((idc)object8).d;
                if (!object7.c()) {
                    ((idc)object8).d = hwv.s((hxk)object7);
                }
                ((idc)object8).d.add(object10);
            }
            object = new fas(idc.e, (idc)((hwp)object9).o(), 8, null);
            object8 = icv.a.l();
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            object9 = (icv)((hwp)object8).b;
            ((icv)object9).b |= 1;
            ((icv)object9).c = true;
            object9 = (icv)((hwp)object8).o();
            object9 = new fas(icv.d, object9, 8, null);
            object8 = icu.a.l();
            Object object11 = icq.k;
            if (!((hwp)object8).b.B()) {
                ((hwp)object8).u();
            }
            n2 = this.c;
            object10 = ((hwp)object8).b;
            object7 = (icu)object10;
            ((icu)object7).c = ((icq)object11).q;
            ((icu)object7).b |= 1;
            if (!((hwv)object10).B()) {
                ((hwp)object8).u();
            }
            float f2 = n2;
            object10 = ((hwp)object8).b;
            object7 = (icu)object10;
            ((icu)object7).b |= 2;
            ((icu)object7).d = f2;
            if (!((hwv)object10).B()) {
                ((hwp)object8).u();
            }
            n4 = this.d;
            object10 = (icu)((hwp)object8).b;
            ((icu)object10).b |= 4;
            ((icu)object10).e = n4;
            object8 = (icu)((hwp)object8).o();
            object8 = new fas(icu.f, object8, 8, null);
            if (((fgu)object4).a <= 0) {
                throw new IllegalStateException("Illegal Max Results param, should be >= 1");
            }
            object10 = iib.a.l();
            boolean bl2 = ((fgu)object4).j;
            if (!((hwp)object10).b.B()) {
                ((hwp)object10).u();
            }
            object11 = ((hwp)object10).b;
            object7 = (iib)object11;
            ((iib)object7).b |= 0x10;
            ((iib)object7).g = bl2;
            bl2 = ((fgu)object4).j;
            if (!((hwv)object11).B()) {
                ((hwp)object10).u();
            }
            object7 = ((hwp)object10).b;
            object11 = (iib)object7;
            ((iib)object11).b |= 0x40;
            ((iib)object11).h = bl2;
            if (!((hwv)object7).B()) {
                ((hwp)object10).u();
            }
            object11 = ((hwp)object10).b;
            object7 = (iib)object11;
            ((iib)object7).b |= 0x40000000;
            ((iib)object7).l = true;
            if (!((hwv)object11).B()) {
                ((hwp)object10).u();
            }
            object11 = ((hwp)object10).b;
            object7 = (iib)object11;
            ((iib)object7).b |= 0x800000;
            ((iib)object7).k = true;
            n3 = true != ((fgu)object4).q ? 0 : 2;
            if (!((hwv)object11).B()) {
                ((hwp)object10).u();
            }
            object7 = ((hwp)object10).b;
            object11 = (iib)object7;
            ((iib)object11).b |= 0x1000;
            ((iib)object11).i = n3;
            n3 = ((fgu)object4).a;
            if (!((hwv)object7).B()) {
                ((hwp)object10).u();
            }
            object7 = (iib)((hwp)object10).b;
            ((iib)object7).b |= 2;
            ((iib)object7).f = n3;
            bl2 = ((fgu)object4).r.isPresent();
            if (!((hwp)object10).b.B()) {
                ((hwp)object10).u();
            }
            object7 = ((hwp)object10).b;
            object11 = (iib)object7;
            ((iib)object11).c |= 0x2000;
            ((iib)object11).m = bl2;
            bl2 = ((fgu)object4).C;
            if (!((hwv)object7).B()) {
                ((hwp)object10).u();
            }
            object7 = (iib)((hwp)object10).b;
            ((iib)object7).d |= 1;
            ((iib)object7).p = bl2;
            if (((fgu)object4).I.equals("web_search")) {
                ((heg)((heg)fjp.a.f()).j("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3RecognizerInfo", 201, "BaseS3HeaderProducer.java")).r("[RS][S3] enabled secondary routing key");
                if (!((hwp)object10).b.B()) {
                    ((hwp)object10).u();
                }
                object7 = (iib)((hwp)object10).b;
                ((iib)object7).b |= 0x80000;
                ((iib)object7).j = "android_3p_shortform";
            }
            if (((fgu)object4).v.isPresent() && (n3 = a.t(((iep)((fgu)object4).v.get()).c)) != 0 && n3 == 2) {
                if (!((hwp)object10).b.B()) {
                    ((hwp)object10).u();
                }
                object7 = (iib)((hwp)object10).b;
                ((iib)object7).c |= 0x20000;
                ((iib)object7).n = true;
                object7 = ics.a.l();
                n3 = ((iep)((fgu)object4).v.get()).d;
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object11 = (ics)((hwp)object7).b;
                ((ics)object11).b |= 2;
                ((ics)object11).d = n3;
                n3 = ((iep)((fgu)object4).v.get()).e;
                if (!((hwp)object7).b.B()) {
                    ((hwp)object7).u();
                }
                object6 = ((hwp)object7).b;
                object11 = (ics)object6;
                ((ics)object11).b |= 1;
                ((ics)object11).c = n3;
                if (!((hwv)object6).B()) {
                    ((hwp)object7).u();
                }
                object11 = ((hwp)object7).b;
                object6 = (ics)object11;
                ((ics)object6).e = 1;
                ((ics)object6).b |= 8;
                if (!((hwv)object11).B()) {
                    ((hwp)object7).u();
                }
                object11 = (ics)((hwp)object7).b;
                ((ics)object11).f = 2;
                ((ics)object11).b |= 0x10;
                object11 = (ics)((hwp)object7).o();
                if (!((hwp)object10).b.B()) {
                    ((hwp)object10).u();
                }
                object7 = (iib)((hwp)object10).b;
                object11.getClass();
                ((iib)object7).o = object11;
                ((iib)object7).c |= 0x40000;
            }
            object11 = ((fgu)object4).F;
            object7 = iib.q;
            if (((Optional)object11).isPresent()) {
                object11 = ibn.a.l();
                Object object12 = ((bqt)((fgu)object4).F.get()).c;
                if (!((hwp)object11).b.B()) {
                    ((hwp)object11).u();
                }
                object6 = (ibn)((hwp)object11).b;
                object12.getClass();
                ((ibn)object6).b |= 1;
                ((ibn)object6).c = object12;
                object6 = ((bqt)((fgu)object4).F.get()).d;
                if (!((hwp)object11).b.B()) {
                    ((hwp)object11).u();
                }
                object12 = (ibn)((hwp)object11).b;
                object6.getClass();
                ((ibn)object12).b |= 2;
                ((ibn)object12).d = object6;
                object12 = (ibn)((hwp)object11).o();
                object6 = ibo.a.l();
                if (!((hwp)object6).b.B()) {
                    ((hwp)object6).u();
                }
                object11 = (ibo)((hwp)object6).b;
                object12.getClass();
                ((ibo)object11).c = object12;
                ((ibo)object11).b |= 2;
                object6 = (ibo)((hwp)object6).o();
                object12 = ibp.a.l();
                if (!((hwp)object12).b.B()) {
                    ((hwp)object12).u();
                }
                Object object13 = (ibp)((hwp)object12).b;
                object6.getClass();
                object11 = ((ibp)object13).b;
                if (!object11.c()) {
                    ((ibp)object13).b = hwv.s((hxk)object11);
                }
                ((ibp)object13).b.add(object6);
                object13 = (ibp)((hwp)object12).o();
                object11 = (hwr)ibm.a.l();
                object12 = (hwr)ibq.a.l();
                if (!((hwp)object12).b.B()) {
                    ((hwp)object12).u();
                }
                object6 = (ibq)((hwr)object12).b;
                object13.getClass();
                ((ibq)object6).c = object13;
                ((ibq)object6).b |= 0x80;
                if (!((hwp)object11).b.B()) {
                    ((hwp)object11).u();
                }
                object6 = (ibm)((hwr)object11).b;
                object12 = (ibq)((hwp)object12).o();
                object12.getClass();
                object13 = ((ibm)object6).b;
                if (!object13.c()) {
                    ((ibm)object6).b = hwv.s((hxk)object13);
                }
                ((ibm)object6).b.add(object12);
                object6 = (ibm)((hwp)object11).o();
                if (!((hwp)object10).b.B()) {
                    ((hwp)object10).u();
                }
                object11 = (iib)((hwp)object10).b;
                object6.getClass();
                ((iib)object11).e = object6;
                ((iib)object11).b |= 1;
            }
            object10 = new fas(object7, (iib)((hwp)object10).o(), 8, null);
            object11 = idf.a.l();
            if (!((hwp)object11).b.B()) {
                ((hwp)object11).u();
            }
            object7 = (idf)((hwp)object11).b;
            ((idf)object7).b |= 1;
            ((idf)object7).c = 1000;
            object7 = (idf)((hwp)object11).o();
            ((gzs)object2).j(gzx.j(object3, object, object9, object8, object10, new fas(idf.d, object7, 8, null)));
            object = icz.a.l();
            if (((fgu)object4).H.isEmpty()) {
                object = Optional.empty();
            } else {
                try {
                    object3 = Collection$_EL.stream(((fgu)object4).H);
                    object9 = new fcx(9);
                    object3 = (Iterable)object3.map(object9).collect(gye.a);
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object8 = (icz)((hwp)object).b;
                    object9 = ((icz)object8).b;
                    if (!object9.c()) {
                        ((icz)object8).b = hwv.q((hxb)object9);
                    }
                    hvc.g((Iterable)object3, ((icz)object8).b);
                }
                catch (NumberFormatException numberFormatException) {
                    a.as(fjp.a.g(), "[RS][S3] failed to parse experiment ids.", "com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3Experiment", '\u0119', "BaseS3HeaderProducer.java", numberFormatException);
                    object = Optional.empty();
                    break block72;
                }
                object = Optional.of(new fas(icz.c, (icz)((hwp)object).o(), 8, null));
            }
        }
        if (((Optional)object).isPresent()) {
            ((gzs)object2).h(((Optional)object).get());
        }
        object = ((gzs)object2).g();
        int n5 = ((hct)object).c;
        for (n3 = 0; n3 < n5; ++n3) {
            ((fas)object.get(n3)).accept(hwp2);
        }
        if (((fgu)object4).G.isPresent()) {
            object = ((fgu)object4).G;
            object = Optional.of(new fas(idd.e, ((Optional)object).get(), 8, null));
        } else {
            object = Optional.empty();
        }
        object3 = this.e;
        ((Optional)object).ifPresent(new fjo(hwp2, 0));
        object = (ida)hwp2.o();
        ((heg)((heg)fjp.a.f()).j("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "buildS3Header", 107, "BaseS3HeaderProducer.java")).u("S3Request:\n%s", object);
        object5.c(object);
        object = new ezb((InputStream)object3, n2, 24000, n4);
        object3 = new byte[224];
        while (!ffo2.e.get()) {
            n3 = hjg.d((InputStream)object, (byte[])object3, 224);
            if (n3 > 0) {
                hwp2 = ict.a.l();
                object5 = hvu.s((byte[])object3, 0, n3);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object4 = (ict)hwp2.b;
                ((ict)object4).b |= 1;
                ((ict)object4).c = object5;
                object5 = (ict)hwp2.o();
                object4 = ffo2.f;
                hwp2 = (hwr)ida.a.l();
                ((hwr)hwp2).aH(ict.d, object5);
                object4.c((ida)hwp2.o());
            }
            if (n3 == 224) continue;
            object3 = ffo2.f;
            object = (hwr)ida.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            ida.G((ida)((hwr)object).b);
            object3.c((ida)((hwp)object).o());
            ffo2.f.a();
            return hpj.a;
        }
        return hpj.a;
    }
}

