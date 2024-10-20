/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;

public final class eop
extends jsf
implements jqz {
    final Object a;
    private final int b;

    public eop(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object a() {
        int n2 = this.b;
        Object object = null;
        switch (n2) {
            default: {
                return new ConcurrentHashMap(((ily)((cya)this.a).c).a.size(), 0.75f, 4);
            }
            case 19: {
                return hvu.q(Base64.decode((String)((String)this.a), (int)3));
            }
            case 18: {
                return this.a.getDefaultViewModelCreationExtras();
            }
            case 17: {
                return this.a.getDefaultViewModelProviderFactory();
            }
            case 16: {
                return this.a.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging();
            }
            case 15: {
                Object object2 = this.a;
                if (object2 == null) return null;
                return object2.a();
            }
            case 14: {
                return String.valueOf(((evz)this.a).c()).concat("_tmp.timestamps");
            }
            case 13: {
                return String.valueOf(((evz)this.a).c()).concat(".timestamps");
            }
            case 12: {
                return String.valueOf(((evz)this.a).c()).concat(".wav");
            }
            case 11: {
                return String.valueOf(((evz)this.a).c()).concat("_tmp.wav");
            }
            case 10: {
                Object object3 = (evz)this.a;
                if (((evz)object3).d) {
                    object3 = ((evz)object3).c.getExternalCacheDir();
                    if (object3 != null) {
                        object = String.valueOf(((File)object3).getAbsolutePath()).concat("/audio_library/recordings");
                    }
                    object3 = object;
                    if (object == null) {
                        object3 = this.a;
                        ((heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter$fileNameWithoutExtension$2", "invoke", 79, "AudioFileWriter.kt")).r("#audio# no external storage available, falling back to internal");
                        object3 = ewx.a(((evz)object3).c).getAbsolutePath();
                    }
                } else {
                    object3 = ewx.a(((evz)object3).c).getAbsolutePath();
                }
                object = cgw.p().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSS"));
                jse.d(object, "format(...)");
                CharSequence charSequence = ((evz)this.a).e.a;
                String string = evz.b.a(charSequence, "");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("-");
                ((StringBuilder)charSequence).append(string);
                return a.ao(((StringBuilder)charSequence).toString(), (String)object3, "/");
            }
            case 9: {
                Object object4 = (euc)this.a;
                n2 = ((euc)object4).b.h();
                ((heg)euc.a.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "createHotwordDefaultRoute", 98, "HotwordRoutesRegistry.kt")).s("#audio# initializing the default route(%s) for hotword", n2);
                eth eth2 = new eth(gsl.a);
                object = dox.h(ebl.a.l());
                Object object5 = dpf.u(edf.a.l());
                ((cxt)object5).y(n2);
                ((bzq)object).z(((cxt)object5).x());
                object = ((bzq)object).y();
                object5 = eth2.a().a;
                object5 = ((euc)object4).d.S((ebl)object, (hpn)object5);
                object4 = object = ((ebl)object).c;
                if (object == null) {
                    object4 = edf.a;
                }
                n2 = ((edf)object4).c;
                object4 = dox.i(ebk.a.l());
                object = eth2.a().b;
                hwp hwp2 = (hwp)((bzq)object4).a;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                ebk ebk2 = (ebk)hwp2.b;
                ebk2.c = object;
                ebk2.b = 1 | ebk2.b;
                return jns.g(new eua(eth2, (ecr)object5, n2, ((bzq)object4).A()));
            }
            case 8: {
                return this.a.a();
            }
            case 7: {
                return ((eqt)this.a).d.a();
            }
            case 6: {
                return this.a.a();
            }
            case 5: {
                return this.a.b().a().a().isDone();
            }
            case 4: {
                return ((eai)this.a.b().d()).a().isDone();
            }
            case 3: {
                object = this.a;
                eex eex2 = new eex(new mz(object, 18), 11);
                return ((epa)object).a.b(eex2);
            }
            case 2: {
                return this.a.a();
            }
            case 1: {
                Object object6 = (heg)eoi.a.f().h(hfo.a, "ALT.AdapterSrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor$writeableAudioBufferData$2", "invoke-d1pmJ48", 89, "AudioAdapterAudioSourceDataAccessor.kt");
                object = (eoi)this.a;
                n2 = ((eoi)object).c;
                object6.A("#audio# %s session(%d) opening source", ((eoi)object).o(), n2);
                object6 = this.a;
                try {
                    eds eds2 = ((eoi)object6).i;
                    object6 = object = ((eoi)object6).d.c;
                    if (object == null) {
                        object6 = edq.a;
                    }
                    object6 = eds2.a((edq)object6);
                    return new joe(object6);
                }
                catch (Throwable throwable) {
                    object6 = jns.aj(throwable);
                }
                return new joe(object6);
            }
            case 0: 
        }
        Object object7 = this.a;
        object = new eex(new mz(object7, 17), 10);
        return ((eoq)object7).f.b((gte)object);
    }
}

