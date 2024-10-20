/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  gda
 */
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;
import java.util.Date;
import org.chromium.base.UnguessableToken;

public final class chy
implements Parcelable.Creator {
    private final int a;

    public chy(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Object createFromParcel(Parcel object) {
        block27: {
            long l2;
            long l3;
            int n2 = this.a;
            Object object2 = null;
            switch (n2) {
                default: {
                    l3 = object.readLong();
                    l2 = object.readLong();
                    if (l3 != 0L && l2 != 0L) break;
                    break block27;
                }
                case 12: {
                    object2 = new byte[object.readInt()];
                    object.readByteArray((byte[])object2);
                    return new ProtoParsers$InternalDontUse((byte[])object2, null);
                }
                case 11: {
                    return new gsj((Parcel)object);
                }
                case 10: {
                    return new grh();
                }
                case 9: {
                    return new gca((Parcel)object);
                }
                case 8: {
                    return fym.a(object.readInt(), gda.a);
                }
                case 7: {
                    return new fuw((Parcel)object);
                }
                case 6: {
                    return new eys((Parcel)object);
                }
                case 5: {
                    object2 = (den)object.readParcelable(den.class.getClassLoader());
                    int n3 = object.readInt();
                    int n4 = object.readInt();
                    n2 = object.readInt();
                    int n5 = object.readInt();
                    int n6 = object.readInt();
                    object = der.g();
                    ((deq)object).f((den)object2);
                    ((deq)object).d(n3);
                    ((deq)object).c(n4);
                    ((deq)object).e(n2);
                    ((deq)object).b(n5);
                    ((deq)object).g(n6);
                    return ((deq)object).a();
                }
                case 4: {
                    object2 = den.o;
                    ded ded2 = (ded)object.readParcelable(ded.class.getClassLoader());
                    String string = fxf.O(object.readString());
                    String string2 = fxf.O(object.readString());
                    long l4 = object.readLong();
                    long l5 = object.readLong();
                    n2 = object.readInt();
                    int n7 = object.readInt();
                    ArrayList arrayList = object.createStringArrayList();
                    ArrayList arrayList2 = object.createStringArrayList();
                    object2 = object.readString();
                    long l6 = object.readLong();
                    object = object.readString();
                    dem dem2 = den.p();
                    dem2.a = ded2;
                    dem2.l(string);
                    dem2.k(string2);
                    dem2.m(l4);
                    dem2.g(l5);
                    dem2.j(n2);
                    dem2.h(n7);
                    if (arrayList != null) {
                        n7 = arrayList.size();
                        for (n2 = 0; n2 < n7; ++n2) {
                            dem2.d((String)arrayList.get(n2));
                        }
                    }
                    if (arrayList2 != null) {
                        dem2.f(arrayList2);
                    }
                    dem2.c = object2;
                    dem2.i(new Date(l6));
                    if (object != null) {
                        dem2.e("label", object);
                    }
                    return dem2.a();
                }
                case 3: {
                    return ded.c(fxf.O(object.readString()), object.readInt());
                }
                case 2: {
                    String string = object.readString();
                    String string3 = object.readString();
                    int n8 = object.readInt();
                    n2 = object.readInt();
                    int n9 = object.readInt();
                    int n10 = object.readInt();
                    int n11 = object.readInt();
                    object2 = object.createStringArrayList();
                    object = ddr.j();
                    ((ddq)object).a = string;
                    ((ddq)object).b = string3;
                    ((ddq)object).d(n8);
                    ((ddq)object).c(n2);
                    ((ddq)object).f(n9);
                    ((ddq)object).b(n10);
                    ((ddq)object).g(n11);
                    if (object2 != null) {
                        n11 = object2.size();
                        for (n2 = 0; n2 < n11; ++n2) {
                            string3 = (String)object2.get(n2);
                            dde.f(string3);
                            if (((ddq)object).c == null) {
                                if (((ddq)object).d == null) {
                                    ((ddq)object).c = new gzs();
                                } else {
                                    ((ddq)object).c = new gzs();
                                    ((ddq)object).c.j(((ddq)object).d);
                                    ((ddq)object).d = null;
                                }
                            }
                            ((ddq)object).c.h(string3);
                        }
                    }
                    return ((ddq)object).a();
                }
                case 1: {
                    return new dcn(object.readInt(), object.readInt());
                }
                case 0: {
                    int n12 = kl.U((Parcel)object);
                    byte[] byArray = null;
                    while (object.dataPosition() < n12) {
                        int n13 = object.readInt();
                        n2 = kl.Q(n13);
                        if (n2 != 2) {
                            if (n2 != 3) {
                                kl.ag((Parcel)object, n13);
                                continue;
                            }
                            byArray = kl.ai((Parcel)object, n13);
                            continue;
                        }
                        object2 = (chz)kl.Y((Parcel)object, n13, chz.CREATOR);
                    }
                    kl.ae((Parcel)object, n12);
                    return new chx((chz)object2, byArray);
                }
            }
            return new UnguessableToken(l3, l2);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new UnguessableToken[n2];
            }
            case 12: {
                return new ProtoParsers$InternalDontUse[n2];
            }
            case 11: {
                return new gsj[n2];
            }
            case 10: {
                return new grh[n2];
            }
            case 9: {
                return new gca[n2];
            }
            case 8: {
                return new fym[n2];
            }
            case 7: {
                return new fuw[n2];
            }
            case 6: {
                return new eys[n2];
            }
            case 5: {
                return new der[n2];
            }
            case 4: {
                return new den[n2];
            }
            case 3: {
                return new ded[n2];
            }
            case 2: {
                return new ddr[n2];
            }
            case 1: {
                return new dcv[n2];
            }
            case 0: 
        }
        return new chx[n2];
    }
}

