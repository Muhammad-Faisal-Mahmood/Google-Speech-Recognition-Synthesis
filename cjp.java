/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

public final class cjp
extends cgk
implements Comparable {
    public static final Parcelable.Creator CREATOR = new cho(5);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public cjp(String string, long l2, boolean bl2, double d2, String string2, byte[] byArray, int n2, int n3, int n4) {
        this.a = string;
        this.b = l2;
        this.c = bl2;
        this.d = d2;
        this.e = string2;
        this.f = byArray;
        this.g = n2;
        this.h = n3;
        this.i = n4;
    }

    private static int b(int n2, int n3) {
        block4: {
            block3: {
                block2: {
                    if (n2 >= n3) break block2;
                    n2 = -1;
                    break block3;
                }
                if (n2 == n3) break block4;
                n2 = 1;
            }
            return n2;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(StringBuilder charSequence) {
        block5: {
            block6: {
                block7: {
                    ((StringBuilder)charSequence).append("Flag(");
                    ((StringBuilder)charSequence).append(this.a);
                    ((StringBuilder)charSequence).append(", ");
                    int n2 = this.g;
                    if (n2 == 1) break block6;
                    if (n2 == 2) break block7;
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                charSequence = this.a;
                                StringBuilder stringBuilder = new StringBuilder("Invalid type: ");
                                stringBuilder.append((String)charSequence);
                                stringBuilder.append(", ");
                                stringBuilder.append(n2);
                                throw new AssertionError((Object)stringBuilder.toString());
                            }
                            ((StringBuilder)charSequence).append("'");
                            byte[] byArray = this.f;
                            kl.at(byArray);
                            ((StringBuilder)charSequence).append(Base64.encodeToString((byte[])byArray, (int)3));
                            ((StringBuilder)charSequence).append("'");
                            break block5;
                        } else {
                            ((StringBuilder)charSequence).append("'");
                            String string = this.e;
                            kl.at(string);
                            ((StringBuilder)charSequence).append(string);
                            ((StringBuilder)charSequence).append("'");
                        }
                        break block5;
                    } else {
                        ((StringBuilder)charSequence).append(this.d);
                    }
                    break block5;
                }
                ((StringBuilder)charSequence).append(this.c);
                break block5;
            }
            ((StringBuilder)charSequence).append(this.b);
        }
        ((StringBuilder)charSequence).append(", ");
        ((StringBuilder)charSequence).append(this.g);
        ((StringBuilder)charSequence).append(", ");
        ((StringBuilder)charSequence).append(this.h);
        ((StringBuilder)charSequence).append(", ");
        ((StringBuilder)charSequence).append(this.i);
        ((StringBuilder)charSequence).append(")");
    }

    public final boolean equals(Object object) {
        if (object instanceof cjp) {
            int n2;
            object = (cjp)object;
            if (a.k(this.a, ((cjp)object).a) && (n2 = this.g) == ((cjp)object).g && this.h == ((cjp)object).h && this.i == ((cjp)object).i) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 == 5) {
                                    return Arrays.equals(this.f, ((cjp)object).f);
                                }
                                throw new AssertionError((Object)a.af(n2, "Invalid enum value: "));
                            }
                            return a.k(this.e, ((cjp)object).e);
                        }
                        return this.d == ((cjp)object).d;
                    }
                    return this.c == ((cjp)object).c;
                }
                if (this.b == ((cjp)object).b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3;
        double d2;
        long l2;
        n2 = kl.u(parcel);
        Object object = this.a;
        if (!cho.b(object)) {
            kl.K(parcel, 2, (String)object);
        }
        if ((l2 = this.b) != 0L) {
            kl.B(parcel, 3, l2);
        }
        if (this.c) {
            kl.x(parcel, 4, true);
        }
        if ((d2 = this.d) != 0.0) {
            kl.y(parcel, 5, d2);
        }
        if (!cho.b(object = this.e)) {
            kl.K(parcel, 6, (String)object);
        }
        if (!cho.b(object = (Object)this.f)) {
            kl.D(parcel, 7, (byte[])object);
        }
        if (!cho.a(n3 = this.g)) {
            kl.A(parcel, 8, n3);
        }
        if (!cho.a(n3 = this.h)) {
            kl.A(parcel, 9, n3);
        }
        if (!cho.a(n3 = this.i)) {
            kl.A(parcel, 10, n3);
        }
        kl.w(parcel, n2);
    }
}

