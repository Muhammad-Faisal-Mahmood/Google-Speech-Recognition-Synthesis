/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Callable;

public final class fjf
implements Callable {
    public final fjj a;
    public final ifs b;

    public /* synthetic */ fjf(fjj fjj2, ifs ifs2) {
        this.a = fjj2;
        this.b = ifs2;
    }

    public final Object call() {
        int n2;
        Object object;
        Object object2;
        Object object3 = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onLangIdEvent", 411, "RecognitionSession.java");
        Object object4 = this.a;
        object3.u("[%s] #onLangIdEvent", ((fjj)object4).g);
        int n3 = fje.a;
        object3 = fim.a.l();
        hyg hyg2 = this.b;
        n3 = ((ifs)hyg2).c.size();
        int n4 = 1;
        if (n3 > 0) {
            object2 = (ift)((ifs)hyg2).c.get(0);
            if ((((ift)object2).b & 1) != 0) {
                object2 = ((ift)object2).c;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object = (fim)((hwp)object3).b;
                object2.getClass();
                ((fim)object).b |= 1;
                ((fim)object).c = object2;
            }
        }
        if ((((ifs)hyg2).b & 1) != 0) {
            n3 = n2 = a.v(((ifs)hyg2).d);
            if (n2 == 0) {
                n3 = 1;
            }
            n3 = --n3 != 0 ? (n3 != 1 ? (n3 != 2 ? 4 : 3) : 2) : 1;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object2 = (fim)((hwp)object3).b;
            ((fim)object2).d = n3 - 1;
            ((fim)object2).b |= 2;
        }
        if (((ifs)hyg2).e.size() > 0) {
            object2 = ((ifs)hyg2).e;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            fim fim2 = (fim)((hwp)object3).b;
            object = fim2.e;
            if (!object.c()) {
                fim2.e = hwv.s((hxk)object);
            }
            hvc.g((Iterable)object2, fim2.e);
        }
        if ((((ifs)hyg2).b & 2) != 0) {
            n3 = n2 = a.v(((ifs)hyg2).f);
            if (n2 == 0) {
                n3 = 1;
            }
            n3 = --n3 != 0 ? (n3 != 1 ? (n3 != 2 ? 4 : 3) : 2) : 1;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object2 = (fim)((hwp)object3).b;
            ((fim)object2).f = n3 - 1;
            ((fim)object2).b |= 4;
        }
        if ((((ifs)hyg2).b & 4) != 0) {
            n3 = n2 = a.u(((ifs)hyg2).g);
            if (n2 == 0) {
                n3 = 1;
            }
            n2 = n3 - 1;
            n3 = n4;
            if (n2 != 0) {
                n3 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? 5 : 4) : 3) : 2;
            }
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            hyg2 = (fim)((hwp)object3).b;
            ((fim)hyg2).g = n3 - 1;
            ((fim)hyg2).b |= 8;
        }
        hyg2 = (hwr)fiq.a.l();
        object3 = (fim)((hwp)object3).o();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object2 = ((fjj)object4).l;
        object4 = (fiq)((hwr)hyg2).b;
        object3.getClass();
        ((fiq)object4).c = object3;
        ((fiq)object4).b = 4;
        ((AmbientModeSupport$AmbientController)object2).f((fiq)((hwp)hyg2).o());
        return null;
    }
}

