/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class cas
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(1);
    private static final String[] m = new String[0];
    public final cbi a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final cjn[] g;
    public final boolean h;
    public cbh i;
    public final int j;
    public final cbc k;
    public final ikp l;
    private final String[] n;

    public cas(cbi cbi2, ikp ikp2, byte[] byArray, int[] nArray, String[] stringArray, int[] nArray2, cjn[] cjnArray, String[] stringArray2, int n2) {
        this.a = cbi2;
        this.l = ikp2;
        this.b = byArray;
        this.c = nArray;
        this.d = stringArray;
        this.e = nArray2;
        this.f = null;
        this.g = cjnArray;
        this.h = true;
        this.n = stringArray2;
        this.j = n2;
        this.k = null;
    }

    public cas(cbi cbi2, byte[] byArray, int[] nArray, String[] stringArray, int[] nArray2, byte[][] byArray2, boolean bl2, cjn[] cjnArray, cbh cbh2, String[] stringArray2, int n2, cbc cbc2) {
        this.a = cbi2;
        this.b = byArray;
        this.c = nArray;
        this.d = stringArray;
        this.e = nArray2;
        this.f = byArray2;
        this.h = bl2;
        this.g = cjnArray;
        this.i = cbh2;
        this.n = stringArray2;
        this.j = n2;
        this.l = null;
        this.k = cbc2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cas) {
            object = (cas)object;
            if (a.k(this.a, ((cas)object).a) && Arrays.equals(this.b, ((cas)object).b) && Arrays.equals(this.c, ((cas)object).c) && Arrays.equals(this.d, ((cas)object).d) && a.k(this.l, ((cas)object).l) && Arrays.equals(this.e, ((cas)object).e) && Arrays.deepEquals((Object[])this.f, (Object[])((cas)object).f) && Arrays.equals(this.g, ((cas)object).g) && Arrays.equals(this.n, ((cas)object).n) && this.h == ((cas)object).h && a.k(this.i, ((cas)object).i) && this.j == ((cas)object).j && a.k(this.k, ((cas)object).k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, this.h, this.n, this.i, this.j, this.k});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.a);
        stringBuilder.append(", LogEventBytes: ");
        Object object = this.b;
        Object var2_3 = null;
        object = object == null ? null : (Object)new String((byte[])object, StandardCharsets.UTF_8);
        stringBuilder.append((String)object);
        stringBuilder.append(", TestCodes: ");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(", MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(", LogEvent: ");
        stringBuilder.append(this.l);
        stringBuilder.append(", , ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append(", ExperimentTokens: ");
        stringBuilder.append(Arrays.deepToString((Object[])this.f));
        stringBuilder.append(", ExperimentTokensParcelables: ");
        stringBuilder.append(Arrays.toString(this.g));
        stringBuilder.append(", MendelPackagesToFilter: ");
        stringBuilder.append(Arrays.toString(this.n));
        stringBuilder.append("AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.h);
        stringBuilder.append(", LogVerifierResult: ");
        cbh cbh2 = this.i;
        object = var2_3;
        if (cbh2 != null) {
            object = cbh2.toString();
        }
        stringBuilder.append((String)object);
        stringBuilder.append("EventCode: ");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String[] stringArray;
        int n3 = kl.u(parcel);
        kl.J(parcel, 2, this.a, n2);
        kl.D(parcel, 3, this.b);
        kl.G(parcel, 4, this.c);
        kl.L(parcel, 5, this.d);
        kl.G(parcel, 6, this.e);
        kl.E(parcel, 7, this.f);
        kl.x(parcel, 8, this.h);
        kl.N(parcel, 9, this.g, n2);
        kl.J(parcel, 11, this.i, n2);
        String[] stringArray2 = stringArray = this.n;
        if (stringArray == null) {
            stringArray2 = m;
        }
        kl.L(parcel, 12, stringArray2);
        kl.A(parcel, 13, this.j);
        kl.J(parcel, 14, this.k, n2);
        kl.w(parcel, n3);
    }
}

