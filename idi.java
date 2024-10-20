/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Context;
import android.os.Parcelable;
import j$.time.Duration;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.JavaCronetProvider;

public final class idi {
    public static volatile ixb a;
    public static volatile ixb b;
    public static volatile idi c;

    public static String A(int n2) {
        return a.ah(n2, "x-goog-ext-", "-bin");
    }

    public static final Parcelable B(htx htx2) {
        jse.e(htx2, "<this>");
        ius ius2 = ius.k();
        jse.e(htx2, "<this>");
        jse.e(ius2, "context");
        return (Parcelable)htx2.b.a(ius2);
    }

    public static final htx C(String string, Parcelable.Creator object) {
        object = new izx((Parcelable.Creator)object, false);
        string = string.concat("-bin");
        return new htx(new iwt(string, (iwp)object), new iup("REQ-".concat(string)), new iup("RESH-".concat(string)), new iup("REST-".concat(string)));
    }

    public static iua D(jnu jnu2) {
        return new hsz(new dan(jnu2, 16), hyf.class, hyf.class);
    }

    public static void E(ixb object, Class object2, boolean bl2) {
        boolean bl3;
        Object object3;
        Object object4 = bl2 ? ((ixb)object).d : ((ixb)object).e;
        try {
            object3 = ((jmi)object4).a.getClass();
            bl3 = false;
        }
        catch (ClassCastException classCastException) {
            object3 = Object.class;
            bl3 = true;
        }
        if (!((Class)object2).isAssignableFrom((Class<?>)object3)) {
            object4 = true != bl2 ? "response" : "request";
            String string = ((ixb)object).b;
            iyh iyh2 = iyh.j;
            object3 = ((Class)object3).getName();
            object = true != bl3 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
            object2 = object2.toString();
            StringBuilder stringBuilder = new StringBuilder("AsyncClientInterceptor: The ");
            stringBuilder.append((String)object4);
            stringBuilder.append(" message type of method ");
            stringBuilder.append(string);
            stringBuilder.append(" (");
            stringBuilder.append((String)object3);
            stringBuilder.append((String)object);
            stringBuilder.append(") must be a subclass of ");
            stringBuilder.append((String)object2);
            throw new iyi(iyh2.e(stringBuilder.toString()));
        }
    }

    public static koc F(Context context, jnu object) {
        try {
            object = (koc)object.b();
            return object;
        }
        catch (IllegalStateException | UnsatisfiedLinkError throwable) {
            return new JavaCronetProvider(context).d().a();
        }
    }

    public static iws G(gpm gpm2) {
        return new iwo(idi.A(gpm2.i()), iwx.f);
    }

    public static final /* synthetic */ dlm H(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }

    public static void I(dlm dlm2, Map.Entry entry) {
        block43: {
            hwu hwu2;
            block42: {
                hwu2 = (hwu)entry.getKey();
                if (!hwu2.d) break block42;
                Object object = hzm.a;
                switch (hwu2.c.ordinal()) {
                    default: {
                        break block43;
                    }
                    case 17: {
                        hyv.D(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 16: {
                        hyv.C(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 15: {
                        hyv.B(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 14: {
                        hyv.A(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 13: {
                        hyv.x(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 12: {
                        hyv.F(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 11: {
                        hyv.q(hwu2.b, (List)entry.getValue(), dlm2);
                        return;
                    }
                    case 10: {
                        object = (List)entry.getValue();
                        if (object != null && !object.isEmpty()) {
                            hyv.z(hwu2.b, (List)entry.getValue(), dlm2, hyo.a.a(object.get(0).getClass()));
                            return;
                        }
                        break block43;
                    }
                    case 9: {
                        object = (List)entry.getValue();
                        if (object != null && !object.isEmpty()) {
                            hyv.w(hwu2.b, (List)entry.getValue(), dlm2, hyo.a.a(object.get(0).getClass()));
                            return;
                        }
                        break block43;
                    }
                    case 8: {
                        hyv.E(hwu2.b, (List)entry.getValue(), dlm2);
                        return;
                    }
                    case 7: {
                        hyv.p(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 6: {
                        hyv.t(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 5: {
                        hyv.u(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 4: {
                        hyv.x(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 3: {
                        hyv.G(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 2: {
                        hyv.y(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 1: {
                        hyv.v(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                    case 0: {
                        hyv.r(hwu2.b, (List)entry.getValue(), dlm2, hwu2.e);
                        return;
                    }
                }
            }
            hzm hzm2 = hzm.a;
            switch (hwu2.c.ordinal()) {
                default: {
                    break;
                }
                case 17: {
                    dlm2.I(hwu2.b, (Long)entry.getValue());
                    return;
                }
                case 16: {
                    dlm2.H(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 15: {
                    dlm2.G(hwu2.b, (Long)entry.getValue());
                    return;
                }
                case 14: {
                    dlm2.F(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 13: {
                    dlm2.B(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 12: {
                    dlm2.K(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 11: {
                    dlm2.u(hwu2.b, (hvu)entry.getValue());
                    return;
                }
                case 10: {
                    dlm2.D(hwu2.b, entry.getValue(), hyo.a.a(entry.getValue().getClass()));
                    return;
                }
                case 9: {
                    dlm2.A(hwu2.b, entry.getValue(), hyo.a.a(entry.getValue().getClass()));
                    return;
                }
                case 8: {
                    dlm2.J(hwu2.b, (String)entry.getValue());
                    return;
                }
                case 7: {
                    dlm2.t(hwu2.b, (Boolean)entry.getValue());
                    return;
                }
                case 6: {
                    dlm2.x(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 5: {
                    dlm2.y(hwu2.b, (Long)entry.getValue());
                    return;
                }
                case 4: {
                    dlm2.B(hwu2.b, (Integer)entry.getValue());
                    return;
                }
                case 3: {
                    dlm2.L(hwu2.b, (Long)entry.getValue());
                    return;
                }
                case 2: {
                    dlm2.C(hwu2.b, (Long)entry.getValue());
                    return;
                }
                case 1: {
                    dlm2.z(hwu2.b, ((Float)entry.getValue()).floatValue());
                    return;
                }
                case 0: {
                    dlm2.v(hwu2.b, (Double)entry.getValue());
                }
            }
        }
    }

    public static int a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 99) {
                    return 0;
                }
                return 100;
            }
            return 2;
        }
        return 1;
    }

    public static int b(int n2) {
        return n2 - 2;
    }

    public static final Duration c(hwg object) {
        object = fvc.aq((hwg)object);
        jse.d(object, "toJavaDuration(...)");
        return object;
    }

    public static final Object d(Context context, Class clazz) {
        jse.e(context, "context");
        return idi.e(fvc.ao(context.getApplicationContext()), clazz);
    }

    public static Object e(Object object, Class clazz) {
        if (object instanceof ilv) {
            if (object instanceof ilx) {
                int n2;
                block4: {
                    Annotation[] annotationArray = clazz.getAnnotations();
                    int n3 = annotationArray.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        if (!annotationArray[n2].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) continue;
                        n2 = 1;
                        break block4;
                    }
                    n2 = 0;
                }
                fvc.ak((n2 ^ 1) != 0, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", clazz.getCanonicalName());
            }
            return clazz.cast(object);
        }
        if (object instanceof ilw) {
            return idi.e(((ilw)object).bn(), clazz);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", object.getClass(), ilv.class, ilw.class));
    }

    public static int f(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 249: {
                return 250;
            }
            case 248: {
                return 249;
            }
            case 247: {
                return 248;
            }
            case 246: {
                return 247;
            }
            case 245: {
                return 246;
            }
            case 244: {
                return 245;
            }
            case 243: {
                return 244;
            }
            case 242: {
                return 243;
            }
            case 241: {
                return 242;
            }
            case 240: {
                return 241;
            }
            case 239: {
                return 240;
            }
            case 238: {
                return 239;
            }
            case 237: {
                return 238;
            }
            case 236: {
                return 237;
            }
            case 235: {
                return 236;
            }
            case 234: {
                return 235;
            }
            case 233: {
                return 234;
            }
            case 232: {
                return 233;
            }
            case 231: {
                return 232;
            }
            case 230: {
                return 231;
            }
            case 229: {
                return 230;
            }
            case 228: {
                return 229;
            }
            case 227: {
                return 228;
            }
            case 226: {
                return 227;
            }
            case 225: {
                return 226;
            }
            case 224: {
                return 225;
            }
            case 223: {
                return 224;
            }
            case 222: {
                return 223;
            }
            case 221: {
                return 222;
            }
            case 220: {
                return 221;
            }
            case 219: {
                return 220;
            }
            case 218: {
                return 219;
            }
            case 217: {
                return 218;
            }
            case 216: {
                return 217;
            }
            case 215: {
                return 216;
            }
            case 214: {
                return 215;
            }
            case 213: {
                return 214;
            }
            case 212: {
                return 213;
            }
            case 211: {
                return 212;
            }
            case 210: {
                return 211;
            }
            case 209: {
                return 210;
            }
            case 208: {
                return 209;
            }
            case 207: {
                return 208;
            }
            case 206: {
                return 207;
            }
            case 205: {
                return 206;
            }
            case 204: {
                return 205;
            }
            case 203: {
                return 204;
            }
            case 202: {
                return 203;
            }
            case 201: {
                return 202;
            }
            case 200: {
                return 201;
            }
            case 199: {
                return 200;
            }
            case 198: {
                return 199;
            }
            case 197: {
                return 198;
            }
            case 196: {
                return 197;
            }
            case 195: {
                return 196;
            }
            case 194: {
                return 195;
            }
            case 193: {
                return 194;
            }
            case 192: {
                return 193;
            }
            case 191: {
                return 192;
            }
            case 190: {
                return 191;
            }
            case 189: {
                return 190;
            }
            case 188: {
                return 189;
            }
            case 187: {
                return 188;
            }
            case 186: {
                return 187;
            }
            case 185: {
                return 186;
            }
            case 184: {
                return 185;
            }
            case 183: {
                return 184;
            }
            case 182: {
                return 183;
            }
            case 181: {
                return 182;
            }
            case 180: {
                return 181;
            }
            case 179: {
                return 180;
            }
            case 178: {
                return 179;
            }
            case 177: {
                return 178;
            }
            case 176: {
                return 177;
            }
            case 175: {
                return 176;
            }
            case 174: {
                return 175;
            }
            case 173: {
                return 174;
            }
            case 172: {
                return 173;
            }
            case 171: {
                return 172;
            }
            case 170: {
                return 171;
            }
            case 169: {
                return 170;
            }
            case 168: {
                return 169;
            }
            case 167: {
                return 168;
            }
            case 166: {
                return 167;
            }
            case 165: {
                return 166;
            }
            case 164: {
                return 165;
            }
            case 163: {
                return 164;
            }
            case 162: {
                return 163;
            }
            case 161: {
                return 162;
            }
            case 160: {
                return 161;
            }
            case 159: {
                return 160;
            }
            case 158: {
                return 159;
            }
            case 157: {
                return 158;
            }
            case 156: {
                return 157;
            }
            case 155: {
                return 156;
            }
            case 154: {
                return 155;
            }
            case 153: {
                return 154;
            }
            case 152: {
                return 153;
            }
            case 151: {
                return 152;
            }
            case 150: {
                return 151;
            }
            case 149: {
                return 150;
            }
            case 148: {
                return 149;
            }
            case 147: {
                return 148;
            }
            case 146: {
                return 147;
            }
            case 145: {
                return 146;
            }
            case 144: {
                return 145;
            }
            case 143: {
                return 144;
            }
            case 142: {
                return 143;
            }
            case 141: {
                return 142;
            }
            case 140: {
                return 141;
            }
            case 139: {
                return 140;
            }
            case 138: {
                return 139;
            }
            case 137: {
                return 138;
            }
            case 136: {
                return 137;
            }
            case 135: {
                return 136;
            }
            case 134: {
                return 135;
            }
            case 133: {
                return 134;
            }
            case 132: {
                return 133;
            }
            case 131: {
                return 132;
            }
            case 130: {
                return 131;
            }
            case 129: {
                return 130;
            }
            case 128: {
                return 129;
            }
            case 127: {
                return 128;
            }
            case 126: {
                return 127;
            }
            case 125: {
                return 126;
            }
            case 124: {
                return 125;
            }
            case 123: {
                return 124;
            }
            case 122: {
                return 123;
            }
            case 121: {
                return 122;
            }
            case 120: {
                return 121;
            }
            case 119: {
                return 120;
            }
            case 118: {
                return 119;
            }
            case 117: {
                return 118;
            }
            case 116: {
                return 117;
            }
            case 115: {
                return 116;
            }
            case 114: {
                return 115;
            }
            case 113: {
                return 114;
            }
            case 112: {
                return 113;
            }
            case 111: {
                return 112;
            }
            case 110: {
                return 111;
            }
            case 109: {
                return 110;
            }
            case 108: {
                return 109;
            }
            case 107: {
                return 108;
            }
            case 106: {
                return 107;
            }
            case 105: {
                return 106;
            }
            case 104: {
                return 105;
            }
            case 103: {
                return 104;
            }
            case 102: {
                return 103;
            }
            case 101: {
                return 102;
            }
            case 100: {
                return 101;
            }
            case 99: {
                return 100;
            }
            case 98: {
                return 99;
            }
            case 97: {
                return 98;
            }
            case 96: {
                return 97;
            }
            case 95: {
                return 96;
            }
            case 94: {
                return 95;
            }
            case 93: {
                return 94;
            }
            case 92: {
                return 93;
            }
            case 91: {
                return 92;
            }
            case 90: {
                return 91;
            }
            case 89: {
                return 90;
            }
            case 88: {
                return 89;
            }
            case 87: {
                return 88;
            }
            case 86: {
                return 87;
            }
            case 85: {
                return 86;
            }
            case 84: {
                return 85;
            }
            case 83: {
                return 84;
            }
            case 82: {
                return 83;
            }
            case 81: {
                return 82;
            }
            case 80: {
                return 81;
            }
            case 79: {
                return 80;
            }
            case 78: {
                return 79;
            }
            case 77: {
                return 78;
            }
            case 76: {
                return 77;
            }
            case 75: {
                return 76;
            }
            case 74: {
                return 75;
            }
            case 73: {
                return 74;
            }
            case 72: {
                return 73;
            }
            case 71: {
                return 72;
            }
            case 70: {
                return 71;
            }
            case 69: {
                return 70;
            }
            case 68: {
                return 69;
            }
            case 67: {
                return 68;
            }
            case 66: {
                return 67;
            }
            case 65: {
                return 66;
            }
            case 64: {
                return 65;
            }
            case 63: {
                return 64;
            }
            case 62: {
                return 63;
            }
            case 61: {
                return 62;
            }
            case 60: {
                return 61;
            }
            case 59: {
                return 60;
            }
            case 58: {
                return 59;
            }
            case 57: {
                return 58;
            }
            case 56: {
                return 57;
            }
            case 55: {
                return 56;
            }
            case 54: {
                return 55;
            }
            case 53: {
                return 54;
            }
            case 52: {
                return 53;
            }
            case 51: {
                return 52;
            }
            case 50: {
                return 51;
            }
            case 49: {
                return 50;
            }
            case 48: {
                return 49;
            }
            case 47: {
                return 48;
            }
            case 46: {
                return 47;
            }
            case 45: {
                return 46;
            }
            case 44: {
                return 45;
            }
            case 43: {
                return 44;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static int g(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static final void h(img img2, List list) {
        list.add(img2);
    }

    public static final void i(img img2, List list) {
        list.add(img2);
    }

    public static img j(jnu jnu2) {
        idi.l(jnu2);
        return new imi(jnu2);
    }

    public static void k(Object object, Class clazz) {
        if (object != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(clazz.getCanonicalName()).concat(" must be set"));
    }

    public static void l(Object object) {
        object.getClass();
    }

    public static void m(Object object) {
        if (object != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final boolean n(Object object) {
        return !((hya)object).b;
    }

    public static final Object o(Object object, Object object2) {
        hya hya2 = (hya)object;
        hya hya3 = (hya)object2;
        object2 = hya2;
        if (!hya3.isEmpty()) {
            object = hya2;
            if (!hya2.b) {
                object = hya2.a();
            }
            ((hya)object).b();
            object2 = object;
            if (!hya3.isEmpty()) {
                ((hya)object).putAll((Map)hya3);
                object2 = object;
            }
        }
        return object2;
    }

    public static final Object p() {
        return hya.a.a();
    }

    public static hxk q(Object object, long l2) {
        return (hxk)hzj.h(object, l2);
    }

    public static final List r(Object object, long l2) {
        hxk hxk2;
        hxk hxk3 = hxk2 = idi.q(object, l2);
        if (!hxk2.c()) {
            int n2 = hxk2.size();
            n2 = n2 == 0 ? 10 : (n2 += n2);
            hxk3 = hxk2.d(n2);
            hzj.u(object, l2, hxk3);
        }
        return hxk3;
    }

    public static hwl s(Object object) {
        return ((hws)object).r;
    }

    public static hwl t(Object object) {
        return ((hws)object).c();
    }

    public static void u(hvz object, Object object2, hwj hwj2, hwl hwl2) {
        object2 = (gpm)object2;
        object = ((hvz)object).t(((gpm)object2).b.getClass(), hwj2);
        hwl2.n((hwu)((gpm)object2).a, object);
    }

    public static final void v(Object object) {
        idi.s(object).f();
    }

    public static final hvu w(hwd hwd2, byte[] byArray) {
        hwd2.ah();
        return new hvt(byArray);
    }

    public static /* synthetic */ String x(int n2) {
        switch (n2) {
            default: {
                return "END_DOCUMENT";
            }
            case 9: {
                return "NULL";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 7: {
                return "NUMBER";
            }
            case 6: {
                return "STRING";
            }
            case 5: {
                return "NAME";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 1: 
        }
        return "BEGIN_ARRAY";
    }

    public static String y(String string) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(string);
    }

    public static final gpm z(Object object) {
        return (gpm)((dlm)object).a;
    }
}

