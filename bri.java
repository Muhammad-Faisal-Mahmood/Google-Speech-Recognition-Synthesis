/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.libraries.speech.transcription.voiceime.BackspaceView;

public final class bri
implements fla,
flb,
ilv {
    private final View a;
    private final brg b;
    private final brd c;

    public bri() {
        throw null;
    }

    public bri(brg brg2, brd brd2, View view) {
        this.b = brg2;
        this.c = brd2;
        this.a = view;
    }

    @Override
    public final fkz a() {
        fma fma2 = (fma)this.b.H.b();
        Object object = this.a;
        if (object instanceof BackspaceView) {
            object = (BackspaceView)object;
            idi.m(object);
            Object object2 = this.c;
            Object object3 = (ghn)((Object)((brd)object2).f.b.b());
            object3 = ((gtt)gto.i((Object)((Object)((ghn)((Object)((brd)object2).d.b()))))).a;
            object2 = (gpm)this.b.g.b();
            return new fkz(fma2, (BackspaceView)object, (ghn)((Object)object3), (gpm)object2);
        }
        throw new IllegalStateException(a.at(object, fkz.class, "Attempt to inject a ActivityAgnosticView wrapper of type "));
    }

    @Override
    public final void b() {
    }
}

