/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.text.TextUtils
 */
import android.os.Build;
import android.text.TextUtils;

public final class cng {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/SodaUtils");

    public static hwr a(String object, String object2, idy idy2) {
        hwr hwr2 = (hwr)iez.a.l();
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        hwv hwv2 = (iez)hwr2.b;
        object2.getClass();
        ((iez)hwv2).b |= 0x40;
        ((iez)hwv2).g = object2;
        object2 = (hwr)iey.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        hwv2 = (iey)((hwr)object2).b;
        object.getClass();
        ((iey)hwv2).b |= 0x10000;
        ((iey)hwv2).f = object;
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object = (iez)hwr2.b;
        object2 = (iey)((hwp)object2).o();
        object2.getClass();
        ((iez)object).e = object2;
        ((iez)object).b |= 4;
        object = ien.a.l();
        object2 = ids.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        hwv2 = ((hwp)object2).b;
        ids ids2 = (ids)hwv2;
        ids2.c = 1;
        ids2.b |= 1;
        if (!hwv2.B()) {
            ((hwp)object2).u();
        }
        hwv2 = ((hwp)object2).b;
        ids2 = (ids)hwv2;
        ids2.b |= 4;
        ids2.e = 1;
        if (!hwv2.B()) {
            ((hwp)object2).u();
        }
        hwv2 = (ids)((hwp)object2).b;
        ((ids)hwv2).b |= 2;
        ((ids)hwv2).d = 16000;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv2 = (ien)((hwp)object).b;
        object2 = (ids)((hwp)object2).o();
        object2.getClass();
        ((ien)hwv2).c = object2;
        ((ien)hwv2).b |= 1;
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object2 = (iez)hwr2.b;
        object = (ien)((hwp)object).o();
        object.getClass();
        ((iez)object2).c = object;
        ((iez)object2).b |= 1;
        object = cng.b(idy2);
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object2 = (iez)hwr2.b;
        object.getClass();
        ((iez)object2).i = object;
        ((iez)object2).b |= 0x200;
        return hwr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static idt b(idy object) {
        try {
            TextUtils.isEmpty((CharSequence)"");
        }
        catch (NoClassDefFoundError noClassDefFoundError) {}
        hwp hwp2 = idt.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        Object object2 = (idt)hwv2;
        ((idt)object2).c = ((idy)object).E;
        ((idt)object2).b |= 1;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = hwp2.b;
        object2 = (idt)object;
        ((idt)object2).b |= 0x40;
        ((idt)object2).i = "";
        if (!((hwv)object).B()) {
            hwp2.u();
        }
        object = (idt)hwp2.b;
        ((idt)object).b |= 0x10;
        ((idt)object).g = "Android";
        try {
            object2 = Build.MODEL;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (idt)hwp2.b;
            object2.getClass();
            ((idt)object).b |= 0x20;
            ((idt)object).h = object2;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return (idt)hwp2.o();
        }
        return (idt)hwp2.o();
    }
}

