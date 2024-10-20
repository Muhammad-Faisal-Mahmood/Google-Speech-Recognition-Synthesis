/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;

final class flp
implements fgr {
    final String a;
    final fgr b;
    final flr c;

    public flp(flr flr2, String string, fgr fgr2) {
        this.a = string;
        this.b = fgr2;
        this.c = flr2;
    }

    @Override
    public final /* synthetic */ void a(boolean bl2) {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c(fef fef2) {
        a.as(flr.b.h(), "#onError", "com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService$3", "onError", '\u00e2', "VoiceInputMethodDataService.java", fef2);
        Object object = this.c.j;
        Object object2 = (ConcurrentHashMap)((gpm)object).b;
        Object object3 = this.a;
        object2 = (flh)((ConcurrentHashMap)object2).get(object3);
        if (object2 != null) {
            Object object4 = ((gpm)object).c;
            Object object5 = ((flh)object2).a;
            object5 = dxv.y.b("inputViewSessionId", (String)object5);
            ((dyj)object5).r("recognitionSessionId", (String)object3);
            object3 = fef2.a;
            ((dyj)object5).q(((fdr)object3).a, ((fdr)object3).b());
            object4.a((dyk)object5);
            if (((flh)object2).a().a()) {
                object = ((gpm)object).c;
                object2 = ((flh)object2).a;
                object.a(dxv.w.b("inputViewSessionId", (String)object2).j());
            }
        }
        this.c.c(this.a, new ezt(fef2, 20));
        this.b.c(fef2);
    }

    @Override
    public final void d(fef object) {
        Object object2 = this.c.j;
        Object object3 = (ConcurrentHashMap)((gpm)object2).b;
        String string = this.a;
        if ((object3 = (flh)((ConcurrentHashMap)object3).get(string)) != null) {
            object2 = ((gpm)object2).c;
            object3 = ((flh)object3).a;
            object3 = dxv.z.b("inputViewSessionId", (String)object3);
            ((dyj)object3).r("recognitionSessionId", string);
            object = ((fef)object).a;
            ((dyj)object3).q(((fdr)object).a, ((fdr)object).b());
            object2.a((dyk)object3);
        }
    }

    @Override
    public final /* synthetic */ void e(fjm fjm2, fjn fjn2) {
    }

    @Override
    public final /* synthetic */ void f(ifs ifs2) {
    }

    @Override
    public final void g(fgd fgd2) {
        this.b.g(fgd2);
    }

    @Override
    public final void h() {
        gpm gpm2 = this.c.j;
        Object object = (ConcurrentHashMap)gpm2.b;
        Object object2 = this.a;
        if ((object = (flh)((ConcurrentHashMap)object).get(object2)) != null) {
            Object object3 = gpm2.c;
            Object object4 = ((flh)object).a;
            object4 = dxv.y.b("inputViewSessionId", (String)object4);
            ((dyj)object4).r("recognitionSessionId", (String)object2);
            ((dyj)object4).s(1);
            object3.a((dyk)object4);
            if (((flh)object).a().a()) {
                object2 = gpm2.c;
                object = ((flh)object).a;
                object2.a(dxv.w.b("inputViewSessionId", (String)object).j());
            }
        }
    }

    @Override
    public final void i(fex fex2) {
        this.b.i(fex2);
    }

    @Override
    public final void j(iga iga2) {
    }

    @Override
    public final void k() {
        fiz fiz2 = new fiz(4);
        this.c.c(this.a, fiz2);
    }
}

