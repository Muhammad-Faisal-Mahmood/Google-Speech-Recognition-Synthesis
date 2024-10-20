/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public final class ffq
implements gte {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ ffq(cyu cyu2, int n2, int n3, gto gto2, int n4) {
        this.e = n4;
        this.c = cyu2;
        this.a = n2;
        this.b = n3;
        this.d = gto2;
    }

    public /* synthetic */ ffq(ffr ffr2, Supplier supplier, int n2, int n3, int n4) {
        this.e = n4;
        this.c = ffr2;
        this.d = supplier;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final Object apply(Object object) {
        if (this.e != 0) {
            if ((object = (List)object) != null) {
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Object object2 = this.d;
                    int n2 = this.b;
                    int n3 = this.a;
                    Object object3 = this.c;
                    hwv hwv2 = (hls)iterator.next();
                    object = (hwp)hwv2.C(5);
                    ((hwp)object).x(hwv2);
                    hwv2 = (hmg)((gto)object2).c();
                    ((cyu)object3).h(n3, (hwp)object, n2, (hmg)hwv2);
                }
            }
            return null;
        }
        object = (fgq)object;
        ((heg)((heg)ffr.a.f().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 111, "OnDevicePrimaryRecognizer.java")).r("OnDevicePrimaryRecognizer started successful");
        fxf.K(object);
        int n4 = this.b;
        int n5 = this.a;
        object.c((Supplier)this.d, n5, n4);
        ((ffr)this.c).g = object;
        return null;
    }
}

