/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

final class btm
implements hpb {
    final btn a;

    public btm(btn btn2) {
        this.a = btn2;
    }

    @Override
    public final void a(Throwable throwable) {
        a.as(btn.a.g(), "Failed to get available voices", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$1", "onFailure", '\u00b1', "VoiceDataManager.java", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void b(Object object5) {
        Object object2 = this.a;
        Iterator iterator2 = (Map)object5;
        object5 = ((btn)object2).c;
        fxf.K(iterator2);
        this.a.c = object2 = hac.i((Map)((Object)iterator2));
        boolean bl2 = object5 != null && !object5.equals(this.a.c);
        for (Iterator iterator2 : this.a.c.values()) {
            boolean bl3;
            block10: {
                Object object3 = this.a;
                buc buc2 = ((bsw)((Object)iterator2)).a;
                object3 = ((btn)object3).h.d();
                Object object4 = cab.a;
                for (bub bub2 : buc2.g) {
                    object4 = object3.iterator();
                    while (object4.hasNext()) {
                        if (!((String)object4.next()).contains(bub2.f)) continue;
                        bl3 = true;
                        break block10;
                    }
                }
                bl3 = false;
            }
            bl2 = bl2 | bl3 | cab.d(((bsw)((Object)iterator2)).a);
        }
        this.a.f.b();
        object2 = this.a.b;
        synchronized (object2) {
            Throwable throwable2;
            block12: {
                block11: {
                    if (object5 == null) {
                        try {
                            for (Object object5 : this.a.d) {
                                ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$1", "onSuccess", 163, "VoiceDataManager.java")).r("onVoicesDataInit");
                                object5.b();
                            }
                            break block11;
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                    }
                    if (bl2) {
                        for (Object object5 : this.a.d) {
                            ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$1", "onSuccess", 168, "VoiceDataManager.java")).r("onVoicesDataChange");
                            object5.a();
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

