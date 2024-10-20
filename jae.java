/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import java.util.concurrent.TimeUnit;

final class jae
extends jag {
    private final ixb a;
    private final iwx b;
    private final jjo c;

    public jae(izi izi2, int n2, ixb ixb2, iwx iwx2, jjo jjo2) {
        super(izi2, n2, jjo2);
        this.a = ixb2;
        this.b = iwx2;
        this.c = jjo2;
    }

    @Override
    protected final int a(Parcel parcel) {
        parcel.writeString(this.a.b);
        izy.b(parcel, this.b);
        this.c.a();
        if (this.a.a.b()) {
            return 16;
        }
        return 0;
    }

    @Override
    protected final int b(Parcel parcel) {
        return 0;
    }

    final void c(iut object) {
        this.b.e(jeb.b);
        long l2 = Math.max(0L, ((iut)object).b(TimeUnit.NANOSECONDS));
        object = jeb.b;
        this.b.g((iws)object, l2);
    }
}

