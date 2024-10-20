/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.SpannedString
 */
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;

public final class bsg {
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final float e;
    private final String f;

    public bsg() {
        throw null;
    }

    public bsg(int n2, int n3, int n4, String string, float f2, String string2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = string;
        this.e = f2;
        this.f = string2;
    }

    public static bsg a(brv brv2, String string) {
        int n2;
        block5: {
            Object object;
            block6: {
                block4: {
                    n2 = brv2.a.toString().hashCode();
                    object = brv2.h;
                    if (object != null) {
                        if (((hwv)object).B()) {
                            n2 = ((hwv)object).i();
                        } else {
                            int n3;
                            n2 = n3 = ((hwv)object).memoizedHashCode;
                            if (n3 == 0) {
                                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
                            }
                        }
                    }
                    if (!((object = brv2.a) instanceof SpannedString)) break block4;
                    n2 = ((SpannedString)object).hashCode();
                    break block5;
                }
                if (!(object instanceof SpannableString)) break block6;
                n2 = ((SpannableString)object).hashCode();
                break block5;
            }
            if (!(object instanceof SpannableStringBuilder)) break block5;
            n2 = ((SpannableStringBuilder)object).hashCode();
        }
        return new bsg(n2, brv2.d, brv2.e, brv2.c(), brv2.l, string);
    }

    public final boolean equals(Object object) {
        block5: {
            bsg bsg2;
            block7: {
                block6: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof bsg)) break block5;
                    bsg2 = (bsg)object;
                    if (this.a != bsg2.a || this.b != bsg2.b || this.c != bsg2.c) break block5;
                    object = this.d;
                    if (object != null) break block6;
                    if (bsg2.d != null) break block5;
                    break block7;
                }
                if (!((String)object).equals(bsg2.d)) break block5;
            }
            float f2 = this.e;
            float f3 = bsg2.e;
            if (Float.floatToIntBits(f2) == Float.floatToIntBits(f3) && this.f.equals(bsg2.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.d;
        int n2 = string == null ? 0 : string.hashCode();
        return ((n2 ^ (((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003) * 1000003 ^ Float.floatToIntBits(this.e)) * 1000003 ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SynthesisKey{textHashcode=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pitch=");
        stringBuilder.append(this.b);
        stringBuilder.append(", speechRate=");
        stringBuilder.append(this.c);
        stringBuilder.append(", vuiId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", outputGain=");
        stringBuilder.append(this.e);
        stringBuilder.append(", synthesisVoiceName=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

