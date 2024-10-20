/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class aqx
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(6);
    public final String a;
    public final gzx b;

    public aqx(String object, String string, List list) {
        super((String)object);
        abr.d(list.isEmpty() ^ true);
        this.a = string;
        this.b = object = gzx.o(list);
        object = (String)object.get(0);
    }

    private static List b(String string) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            if (string.length() >= 10) {
                arrayList.add(Integer.parseInt(string.substring(0, 4)));
                arrayList.add(Integer.parseInt(string.substring(5, 7)));
                arrayList.add(Integer.parseInt(string.substring(8, 10)));
            } else if (string.length() >= 7) {
                arrayList.add(Integer.parseInt(string.substring(0, 4)));
                arrayList.add(Integer.parseInt(string.substring(5, 7)));
            } else if (string.length() >= 4) {
                arrayList.add(Integer.parseInt(string.substring(0, 4)));
            }
            return arrayList;
        }
        catch (NumberFormatException numberFormatException) {
            return new ArrayList();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a(aeh var1_1) {
        block61: {
            var9_5 = this.f;
            var2_6 = var9_5.hashCode();
            var3_7 = 1;
            switch (var2_6) {
                default: {
                    break;
                }
                case 2590194: {
                    if (!var9_5.equals("TYER")) break;
                    var2_6 = 11;
                    break block61;
                }
                case 2583398: {
                    if (!var9_5.equals("TRCK")) break;
                    var2_6 = 9;
                    break block61;
                }
                case 2581514: {
                    if (!var9_5.equals("TPE3")) break;
                    var2_6 = 19;
                    break block61;
                }
                case 2581513: {
                    if (!var9_5.equals("TPE2")) break;
                    var2_6 = 5;
                    break block61;
                }
                case 2581512: {
                    if (!var9_5.equals("TPE1")) break;
                    var2_6 = 3;
                    break block61;
                }
                case 2575251: {
                    if (!var9_5.equals("TIT2")) break;
                    var2_6 = 1;
                    break block61;
                }
                case 2571565: {
                    if (!var9_5.equals("TEXT")) break;
                    var2_6 = 21;
                    break block61;
                }
                case 2570410: {
                    if (!var9_5.equals("TDRL")) break;
                    var2_6 = 15;
                    break block61;
                }
                case 2570401: {
                    if (!var9_5.equals("TDRC")) break;
                    var2_6 = 14;
                    break block61;
                }
                case 2569891: {
                    if (!var9_5.equals("TDAT")) break;
                    var2_6 = 13;
                    break block61;
                }
                case 2569358: {
                    if (!var9_5.equals("TCON")) break;
                    var2_6 = 22;
                    break block61;
                }
                case 2569357: {
                    if (!var9_5.equals("TCOM")) break;
                    var2_6 = 17;
                    break block61;
                }
                case 2567331: {
                    if (!var9_5.equals("TALB")) break;
                    var2_6 = 7;
                    break block61;
                }
                case 83552: {
                    if (!var9_5.equals("TYE")) break;
                    var2_6 = 10;
                    break block61;
                }
                case 83536: {
                    if (!var9_5.equals("TXT")) break;
                    var2_6 = 20;
                    break block61;
                }
                case 83378: {
                    if (!var9_5.equals("TT2")) break;
                    var2_6 = 0;
                    break block61;
                }
                case 83341: {
                    if (!var9_5.equals("TRK")) break;
                    var2_6 = 8;
                    break block61;
                }
                case 83255: {
                    if (!var9_5.equals("TP3")) break;
                    var2_6 = 18;
                    break block61;
                }
                case 83254: {
                    if (!var9_5.equals("TP2")) break;
                    var2_6 = 4;
                    break block61;
                }
                case 83253: {
                    if (!var9_5.equals("TP1")) break;
                    var2_6 = 2;
                    break block61;
                }
                case 82897: {
                    if (!var9_5.equals("TDA")) break;
                    var2_6 = 12;
                    break block61;
                }
                case 82878: {
                    if (!var9_5.equals("TCM")) break;
                    var2_6 = 16;
                    break block61;
                }
                case 82815: {
                    if (!var9_5.equals("TAL")) break;
                    var2_6 = 6;
                    break block61;
                }
            }
            var2_6 = -1;
        }
        var9_5 = null;
        var10_8 = null;
        switch (var2_6) {
            default: {
                break;
            }
            case 22: {
                var9_5 = (String)this.b.get(0);
                fxf.K(var9_5);
                if (!var9_5.isEmpty()) ** GOTO lbl113
lbl110:
                // 5 sources

                while (true) {
                    var9_5 = null;
                    ** GOTO lbl130
                    break;
                }
lbl113:
                // 1 sources

                var4_9 = var9_5.charAt(0);
                var2_6 = var4_9 == '-' ? var3_7 : 0;
                if (var2_6 == var9_5.length()) ** GOTO lbl110
                var3_7 = var2_6 + 1;
                if ((var2_6 = hmp.a(var9_5.charAt(var2_6))) < 0 || var2_6 >= 10) ** GOTO lbl110
                var5_10 = -var2_6;
                for (var2_6 = var3_7; var2_6 < var9_5.length(); ++var2_6) {
                    var3_7 = hmp.a(var9_5.charAt(var2_6));
                    if (var3_7 < 0 || var3_7 >= 10 || var5_10 < -922337203685477580L || (var5_10 *= 10L) < -9223372036854775808L + (var7_11 = (long)var3_7)) ** GOTO lbl110
                    var5_10 -= var7_11;
                }
                if (var4_9 == '-') {
                    var9_5 = var5_10;
                } else {
                    if (var5_10 != -9223372036854775808L) ** break;
                    ** continue;
                    var9_5 = -var5_10;
                }
lbl130:
                // 3 sources

                var9_5 = var9_5 != null && var9_5.longValue() == (long)var9_5.intValue() ? Integer.valueOf(var9_5.intValue()) : null;
                if (var9_5 == null) {
                    var1_1.u = (CharSequence)this.b.get(0);
                    return;
                }
                var2_6 = var9_5.intValue();
                var9_5 = aqt.a;
                var9_5 = var10_8;
                if (var2_6 >= 0) {
                    var11_12 = aqt.a;
                    var9_5 = var10_8;
                    if (var2_6 < ((hct)var11_12).c) {
                        var9_5 = (String)var11_12.get(var2_6);
                    }
                }
                if (var9_5 == null) break;
                var1_1.u = var9_5;
                return;
            }
            case 20: 
            case 21: {
                var1_1.r = (CharSequence)this.b.get(0);
                return;
            }
            case 18: 
            case 19: {
                var1_1.t = (CharSequence)this.b.get(0);
                return;
            }
            case 16: 
            case 17: {
                var1_1.s = (CharSequence)this.b.get(0);
                return;
            }
            case 15: {
                var9_5 = aqx.b((String)this.b.get(0));
                var2_6 = var9_5.size();
                if (var2_6 != 1) {
                    if (var2_6 != 2) {
                        if (var2_6 != 3) break;
                        var1_1.q = (Integer)var9_5.get(2);
                    }
                    var1_1.p = (Integer)var9_5.get(1);
                }
                var1_1.o = (Integer)var9_5.get(0);
                return;
            }
            case 14: {
                var9_5 = aqx.b((String)this.b.get(0));
                var2_6 = var9_5.size();
                if (var2_6 != 1) {
                    if (var2_6 != 2) {
                        if (var2_6 != 3) break;
                        var1_1.n = (Integer)var9_5.get(2);
                    }
                    var1_1.m = (Integer)var9_5.get(1);
                }
                var1_1.l = (Integer)var9_5.get(0);
                return;
            }
            case 12: 
            case 13: {
                var9_5 = (String)this.b.get(0);
                var3_7 = Integer.parseInt(var9_5.substring(2, 4));
                var2_6 = Integer.parseInt(var9_5.substring(0, 2));
                var1_1.m = var3_7;
                var1_1.n = var2_6;
lbl181:
                // 2 sources

                return;
            }
            case 10: 
            case 11: {
                var1_1.l = Integer.parseInt((String)this.b.get(0));
lbl186:
                // 2 sources

                return;
            }
            case 8: 
            case 9: {
                var10_8 = agf.w((String)this.b.get(0), "/");
                var2_6 = Integer.parseInt(var10_8[0]);
                if (var10_8.length > 1) {
                    var9_5 = Integer.parseInt(var10_8[1]);
                }
                var1_1.h = var2_6;
                var1_1.i = var9_5;
lbl196:
                // 2 sources

                return;
            }
            case 6: 
            case 7: {
                var1_1.c = (CharSequence)this.b.get(0);
                return;
            }
            case 4: 
            case 5: {
                var1_1.d = (CharSequence)this.b.get(0);
                return;
            }
            case 2: 
            case 3: {
                var1_1.b = (CharSequence)this.b.get(0);
                return;
            }
            case 0: 
            case 1: {
                var1_1.a = (CharSequence)this.b.get(0);
            }
        }
        return;
        catch (NumberFormatException | StringIndexOutOfBoundsException var1_2) {
            ** continue;
        }
        catch (NumberFormatException var1_3) {
            ** continue;
        }
        catch (NumberFormatException var1_4) {
            ** continue;
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqx)object;
            if (Objects.equals(this.f, ((aqx)object).f) && Objects.equals(this.a, ((aqx)object).a) && fvd.z(this.b, ((aqx)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.f.hashCode();
        String string = this.a;
        int n3 = string != null ? string.hashCode() : 0;
        return ((n2 + 527) * 31 + n3) * 31 + this.b.hashCode();
    }

    @Override
    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": description=");
        stringBuilder.append(this.a);
        stringBuilder.append(": values=");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeStringArray((String[])this.b.toArray(new String[0]));
    }
}

