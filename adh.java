/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Arrays;

public final class adh {
    public static final adh a = new adh(new adg[0]);
    private static final adg e;
    public final int b;
    public final long c;
    public final int d;
    private final adg[] f;

    static {
        adg adg2 = new adg(-1, new int[0], new aef[0], new long[0]);
        int[] nArray = adg2.e;
        int n2 = nArray.length;
        int n3 = Math.max(0, n2);
        nArray = Arrays.copyOf(nArray, n3);
        Arrays.fill(nArray, n2, n3, 0);
        long[] lArray = adg2.f;
        n3 = lArray.length;
        n2 = Math.max(0, n3);
        lArray = Arrays.copyOf(lArray, n2);
        Arrays.fill(lArray, n3, n2, -9223372036854775807L);
        e = new adg(0, nArray, Arrays.copyOf(adg2.d, 0), lArray);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
    }

    private adh(adg[] adgArray) {
        this.c = 0L;
        this.b = 0;
        this.f = adgArray;
        this.d = 0;
    }

    public final adg a(int n2) {
        adg adg2 = n2 < 0 ? e : this.f[n2];
        return adg2;
    }

    public final void b() {
        this.a(-1);
        int n2 = adg.i;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (adh)object;
            if (Objects.equals(null, null) && Arrays.equals(this.f, ((adh)object).f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)-9223372036854775807L * 961 + Arrays.hashCode(this.f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        stringBuilder.append("])");
        return stringBuilder.toString();
    }
}

