/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.UserManager
 */
import android.content.Context;
import android.os.UserManager;
import com.google.android.apps.speech.tts.googletts.local.greco3.AndroidComposer;

public final class bsr {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/ComposerWrapperImpl");
    public final UserManager b;
    public final AndroidComposer c;
    public iiq d;
    public volatile boolean e = false;
    public bso f;
    public final bst g;

    public bsr(Context context, bst bst2, AndroidComposer androidComposer) {
        this.b = (UserManager)context.getSystemService("user");
        this.g = bst2;
        this.c = androidComposer;
    }

    final iiq a(bso object) {
        Object object2;
        Comparable<Boolean> comparable;
        Object object3;
        Object object4 = iir.a.l();
        if (fxf.P(((bso)object).p())) {
            object3 = cab.a;
            object3 = ((bso)object).l();
            object3 = ((String)object3).substring(((String)object3).lastIndexOf(45) + 1);
        } else {
            object3 = ((bso)object).p();
        }
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        Object object5 = (iir)((hwp)object4).b;
        object3.getClass();
        ((iir)object5).b |= 4;
        ((iir)object5).c = object3;
        int n2 = ((bso)object).u();
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object3 = (iir)((hwp)object4).b;
        ((iir)object3).b |= 0x10;
        object = n2 != 2 ? "male" : "female";
        ((iir)object3).d = object;
        object3 = (iir)((hwp)object4).o();
        n2 = this.c.getAudioBufferSizeBytes() / 2;
        object = (hwr)iiq.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (iiq)((hwr)object).b;
        ((iiq)object4).b = 2 | ((iiq)object4).b;
        ((iiq)object4).c = true;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (iiq)((hwr)object).b;
        ((iiq)object4).b |= 4;
        ((iiq)object4).d = n2;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (iiq)((hwr)object).b;
        object3.getClass();
        ((iiq)object4).e = object3;
        ((iiq)object4).b |= 0x400;
        object3 = iip.a.l();
        for (Object object6 : isp.a.b().a()) {
            object5 = (String)((gtp)object6).a;
            comparable = (Boolean)((gtp)object6).b;
            ((Boolean)comparable).booleanValue();
            object5.getClass();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object2 = (iip)((hwp)object3).b;
            object6 = ((iip)object2).b;
            if (!((hya)object6).b) {
                ((iip)object2).b = ((hya)object6).a();
            }
            ((iip)object2).b.put(object5, comparable);
        }
        for (Object object6 : isp.a.b().b()) {
            object4 = (String)((gtp)object6).a;
            comparable = (Long)((gtp)object6).b;
            ((Long)comparable).longValue();
            object4.getClass();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object6 = (iip)((hwp)object3).b;
            object2 = ((iip)object6).c;
            if (!((hya)object2).b) {
                ((iip)object6).c = ((hya)object2).a();
            }
            ((iip)object6).c.put(object4, comparable);
        }
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (iiq)((hwr)object).b;
        object3 = (iip)((hwp)object3).o();
        object3.getClass();
        ((iiq)object4).f = object3;
        ((iiq)object4).b |= 0x10000;
        return (iiq)((hwp)object).o();
    }
}

