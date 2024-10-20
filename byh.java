/*
 * Decompiled with CFR 0.152.
 */
class byh
implements gbv {
    final byl a;

    public byh(byl byl2) {
        this.a = byl2;
    }

    @Override
    public final /* synthetic */ void c(Object object, Object object2) {
        object = (String)object;
        object2 = (Boolean)object2;
        ((hfk)((hfk)byl.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper$2", "onSuccess", 170, "SettingsFragmentHelper.java")).C("onSaveDownloadPolicySettings#onSuccess: %s, %b", object, object2);
        if (!((Boolean)object2).booleanValue()) {
            ((hfk)((hfk)byl.a.g()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper$2", "onSuccess", 174, "SettingsFragmentHelper.java")).r("Error saving AutoUpdate setting");
            object2 = this.a.e;
            fxf.K(object2);
            object2.a(dxv.at.c(3));
        } else {
            dxi dxi2 = this.a.e;
            fxf.K(dxi2);
            dyj dyj2 = dxv.at.c(1);
            gpm gpm2 = hkn.d;
            hwp hwp2 = hkn.a.l();
            object2 = fao.b(Integer.parseInt((String)object));
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hkn hkn2 = (hkn)hwp2.b;
            hkn2.c = ((fao)object2).e;
            hkn2.b |= 1;
            dyj2.u(gpm2, (hkn)hwp2.o());
            dxi2.a(dyj2);
        }
        this.a.a().a(fao.b(Integer.parseInt((String)object)));
        this.a.a().setEnabled(true);
    }
}

