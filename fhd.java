/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class fhd {
    public final String a;
    public final fgd b;
    public final fex c;
    public final boolean d;
    public final Boolean e;
    public final fdr f;
    public final int g;
    public final Uri h;
    public final boolean i;

    public fhd() {
        throw null;
    }

    public fhd(String string, fgd fgd2, fex fex2, boolean bl2, Boolean bl3, fdr fdr2, int n2, Uri uri, boolean bl4) {
        this.a = string;
        this.b = fgd2;
        this.c = fex2;
        this.d = bl2;
        this.e = bl3;
        this.f = fdr2;
        this.g = n2;
        this.h = uri;
        this.i = bl4;
    }

    public static fhc a() {
        fhc fhc2 = new fhc();
        fhc2.a = null;
        fhc2.b = null;
        fhc2.c = null;
        fhc2.b(false);
        fhc2.d = null;
        fhc2.e = null;
        fhc2.d(0);
        fhc2.f = null;
        fhc2.c(false);
        return fhc2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fhd) {
            object = (fhd)object;
            Object object2 = this.a;
            if ((object2 == null ? ((fhd)object).a == null : ((String)object2).equals(((fhd)object).a)) && ((object2 = this.b) == null ? ((fhd)object).b == null : ((hwv)object2).equals(((fhd)object).b)) && ((object2 = this.c) == null ? ((fhd)object).c == null : ((hwv)object2).equals(((fhd)object).c)) && this.d == ((fhd)object).d && ((object2 = this.e) == null ? ((fhd)object).e == null : ((Boolean)object2).equals(((fhd)object).e)) && ((object2 = this.f) == null ? ((fhd)object).f == null : object2.equals(((fhd)object).f)) && this.g == ((fhd)object).g && ((object2 = this.h) == null ? ((fhd)object).h == null : object2.equals((Object)((fhd)object).h)) && this.i == ((fhd)object).i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4;
        Object object = this.a;
        int n5 = 0;
        int n6 = object == null ? 0 : ((String)object).hashCode();
        object = this.b;
        if (object == null) {
            n4 = 0;
        } else if (((hwv)object).B()) {
            n4 = ((hwv)object).i();
        } else {
            n4 = n3 = ((hwv)object).memoizedHashCode;
            if (n3 == 0) {
                ((hwv)object).memoizedHashCode = n4 = ((hwv)object).i();
            }
        }
        object = this.c;
        if (object == null) {
            n3 = 0;
        } else if (((hwv)object).B()) {
            n3 = ((hwv)object).i();
        } else {
            n3 = n2 = ((hwv)object).memoizedHashCode;
            if (n2 == 0) {
                ((hwv)object).memoizedHashCode = n3 = ((hwv)object).i();
            }
        }
        boolean bl2 = this.d;
        int n7 = 1237;
        n2 = true != bl2 ? 1237 : 1231;
        object = this.e;
        int n8 = object == null ? 0 : ((Boolean)object).hashCode();
        object = this.f;
        int n9 = object == null ? 0 : object.hashCode();
        int n10 = this.g;
        object = this.h;
        if (object != null) {
            n5 = object.hashCode();
        }
        if (this.i) {
            n7 = 1231;
        }
        return ((((((((n6 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n3) * 1000003 ^ n2) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n5) * 1000003 ^ n7;
    }

    public final String toString() {
        Object object = this.h;
        Object object2 = this.f;
        Object object3 = this.c;
        String string = String.valueOf(this.b);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("TranscriptionState{language=");
        stringBuilder.append(this.a);
        stringBuilder.append(", liveTranscription=");
        stringBuilder.append(string);
        stringBuilder.append(", finalRecognitionResults=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", hasStartOfSpeech=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isMicOpen=");
        stringBuilder.append(this.e);
        stringBuilder.append(", appflowErrorStatus=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", speechLevel=");
        stringBuilder.append(this.g);
        stringBuilder.append(", audioUri=");
        stringBuilder.append((String)object);
        stringBuilder.append(", lastAudioRationaleToastTimestampLoaded=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

