/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class eeb
implements ewq,
eef,
eem {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer");
    public final eae b;
    public final int c;
    public final Executor d;
    public final ewn e;
    public final juc f;
    public final eek g;
    public final String h;
    public final jua i;
    public final czh j;
    public final bzq k;
    private final List l;
    private final Executor m;
    private final Set n;

    public eeb(eae object, int n2, int n3, gto gto2, List list, Executor executor, czh czh2, bzq bzq2) {
        this.b = object;
        this.c = n3;
        this.l = list;
        this.m = executor;
        this.j = czh2;
        this.k = bzq2;
        this.d = new hpz(executor);
        this.n = new LinkedHashSet();
        this.e = new ewn(n2 * n3, n2, wl.j);
        this.f = new juc(null, jud.a);
        this.g = new eek((eae)object, n3, gto2);
        this.h = object = crh.K(this);
        this.i = new jua(0, jud.a);
        if (n2 > 0) {
            if (n3 > 0) {
                czh2.n((String)object);
                return;
            }
            throw new IllegalArgumentException("chunk size should be positive");
        }
        throw new IllegalArgumentException("max number of chunks should be positive");
    }

    @Override
    public final /* synthetic */ hpn a(dzj dzj2) {
        return doc.a(this, dzj2);
    }

    @Override
    public final int b() {
        return this.i.b;
    }

    public final void c(dzn dzn2) {
        block3: {
            Object object;
            Object object2;
            block4: {
                block2: {
                    if (dzn2.c != 2) break block2;
                    if (!this.f.d(null, dzn2)) break block3;
                    break block4;
                }
                object2 = this.e;
                ((ewn)object2).d += ((Number)((ewn)object2).b.a(dzn2)).intValue();
                while (((ewn)object2).d > ((ewn)object2).a && (object = ((ewn)object2).c.c()) != null) {
                    int n2 = ((Number)((ewn)object2).b.a(object)).intValue();
                    ((ewn)object2).d -= n2;
                    ((ewn)object2).f += n2;
                }
                ((ewn)object2).c.add(dzn2);
            }
            object2 = new ArrayList(this.n).iterator();
            jse.d(object2, "iterator(...)");
            while (object2.hasNext()) {
                object = (eee)object2.next();
                jse.b(object);
                this.e((eee)object, dzn2);
            }
        }
    }

    @Override
    public final List d() {
        return dpg.i(this.l);
    }

    public final void e(eee eee2, dzn dzn2) {
        eee2.b(dzn2);
        if (dzn2.c == 2 && this.n.remove(eee2)) {
            ((heg)a.f().h(hfo.a, "ALT.BytesReceiverBuffer").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "emitAudio", 182, "AudioBytesReceiverAudioBuffer.kt")).C("#audio# unregistering receiver(%s) due to EOF, buffer(%s)", crh.K(eee2), this.h);
        }
    }

    @Override
    public final void f() {
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((eeq)iterator.next()).b();
        }
        this.d.execute(gqk.i(new dqv(this, 11)));
    }

    @Override
    public final void g(eft eft2, byte[] byArray) {
        boolean bl2;
        if (eft2.c()) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.BytesReceiverBuffer")).P().j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "writeToBuffer", 97, "AudioBytesReceiverAudioBuffer.kt")).r("#audio# skipping an error write request");
            return;
        }
        Iterator iterator = this.l.iterator();
        block0: while (true) {
            bl2 = false;
            while (iterator.hasNext()) {
                int n2 = ((eeq)iterator.next()).c(byArray, eft2.a);
                if (!bl2 && n2 != 3) continue block0;
                bl2 = true;
            }
            break;
        }
        if (bl2) {
            ((heg)((heg)a.f().h(hfo.a, "ALT.BytesReceiverBuffer")).P().j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "writeToBuffer", 109, "AudioBytesReceiverAudioBuffer.kt")).r("#audio# silencing audio due to skip requested...");
            byArray = new byte[eft2.a];
        }
        this.d.execute(gqk.i(new ai((Object)this, (Object)eft2, (Object)byArray, 20, null)));
    }

    public final void h(eee eee2) {
        this.n.add(eee2);
        Object object = this.e.e.iterator();
        while (object.hasNext()) {
            this.e(eee2, (dzn)object.next());
        }
        object = (dzn)this.f.a;
        if (object != null) {
            this.e(eee2, (dzn)object);
        }
    }

    @Override
    public final dzk i(dzj dzj2, int n2) {
        return this.j(dzj2, 0, n2);
    }

    public final dzk j(dzj dzj2, int n2, int n3) {
        heg heg2 = (heg)a.f().h(hfo.a, "ALT.BytesReceiverBuffer").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "registerAudioBytesReceiver$java_com_google_android_libraries_search_audio_audiobuffer_audiobuffer", 230, "AudioBytesReceiverAudioBuffer.kt");
        String string = crh.K(dzj2);
        Object object = n3 == Integer.MAX_VALUE ? "no-limit" : Integer.valueOf(n3);
        heg2.H("#audio# registering receiver(%s), range(offset=%d, minimal=%s), buffer(%s)", string, n2, object, this.h);
        object = new eea(this, n3);
        return new dzk(fxf.ah(new hrr(this, dzj2, n2, (eea)object, 1), this.d), new bfb(this, object, 4));
    }

    @Override
    public final /* synthetic */ dzk k(dzj dzj2) {
        return dpg.j(this, dzj2);
    }
}

