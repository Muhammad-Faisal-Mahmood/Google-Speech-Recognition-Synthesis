/*
 * Decompiled with CFR 0.152.
 */
public final class fem
implements imb {
    @Override
    public final /* synthetic */ Object b() {
        int n2;
        Object object;
        boolean bl2 = true;
        fxf.r(true, "property name must be defined");
        fxf.r(true, "default hostname must be defined");
        fxf.r(true, "defaultPort must be bigger than 0");
        Object object2 = foy.a;
        boolean bl3 = "true".equals(fpi.a("debug.social", "true"));
        Object object3 = object = "speechs3proto2-pa.googleapis.com:443";
        if (bl3) {
            object3 = object;
            if ("true".equals(fpi.a((String)((cxt)object2).a, "true"))) {
                object3 = object = fpi.a("s3.grpc.url", "speechs3proto2-pa.googleapis.com:443");
                if (object != null) {
                    object3 = object;
                    if (((String)object).length() == 91) {
                        object3 = new StringBuilder((String)object);
                        n2 = 2;
                        while (true) {
                            object = fpi.a(a.af(n2, "s3.grpc.url"), "");
                            ((StringBuilder)object3).append((String)object);
                            if (((String)object).length() != 91) {
                                object3 = ((StringBuilder)object3).toString();
                                break;
                            }
                            ++n2;
                        }
                    }
                }
            }
        }
        fxf.K(object3);
        bl3 = ((String)object3).startsWith("[");
        int n3 = -1;
        Object var9_9 = null;
        if (bl3) {
            bl3 = ((String)object3).charAt(0) == '[';
            fxf.v(bl3, "Bracketed host-port string must start with a bracket: %s", object3);
            int n4 = ((String)object3).indexOf(58);
            n2 = ((String)object3).lastIndexOf(93);
            bl3 = n4 >= 0 && n2 > n4;
            fxf.v(bl3, "Invalid bracketed host/port: %s", object3);
            object2 = ((String)object3).substring(1, n2);
            n4 = n2 + 1;
            if (n4 == ((String)object3).length()) {
                object = new String[]{object2, ""};
            } else {
                bl3 = ((String)object3).charAt(n4) == ':';
                fxf.v(bl3, "Only a colon may follow a close bracket: %s", object3);
                for (n2 = n4 = n2 + 2; n2 < ((String)object3).length(); ++n2) {
                    fxf.v(Character.isDigit(((String)object3).charAt(n2)), "Port must be numeric: %s", object3);
                }
                object = new String[]{object2, ((String)object3).substring(n4)};
            }
            object2 = object[0];
            String string = object[1];
            object = object2;
            object2 = string;
        } else {
            int n5;
            n2 = ((String)object3).indexOf(58);
            if (n2 >= 0 && ((String)object3).indexOf(58, n5 = n2 + 1) == -1) {
                object = ((String)object3).substring(0, n2);
                object2 = ((String)object3).substring(n5);
            } else {
                object2 = null;
                object = object3;
            }
        }
        n2 = n3;
        if (!fxf.P((String)object2)) {
            bl3 = !((String)object2).startsWith("+") && gso.a.e((CharSequence)object2);
            fxf.v(bl3, "Unparseable port number: %s", object3);
            try {
                n2 = Integer.parseInt((String)object2);
                bl3 = n2 >= 0 && n2 <= 65535;
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("Unparseable port number: ".concat(String.valueOf(object3)));
            }
            fxf.v(bl3, "Port number out of range: %s", object3);
        }
        object = new hmm((String)object, n2);
        if (!((hmm)object).a.startsWith("speechs3proto2-pa.googleapis.com")) {
            ((heg)((heg)ewu.a.f()).j("com/google/android/libraries/search/hostname/Hostname", "propOrDefault", 40, "Hostname.java")).G("gRPC hostname was overwritten. %s:%d -> %s", "speechs3proto2-pa.googleapis.com", 443, object);
        }
        object3 = ((hmm)object).a;
        fxf.A(((hmm)object).a());
        n2 = ((hmm)object).b;
        object = idm.f;
        if (object != null) {
            object2 = new gjl((String)object3, n2, (hrh)object);
            object = ((gjl)object2).a;
            n2 = ((gjl)object2).b != null ? 0 : 1;
            n3 = object != null ? 0 : 1;
            bl3 = n3 == n2;
            fxf.B(bl3, "If host is set, port must be set (and vice-versa)");
            bl3 = bl2;
            object3 = var9_9;
            if (object != null) {
                if (((String)object).matches("[a-zA-Z0-9-.]+")) {
                    object3 = object;
                    bl3 = bl2;
                } else {
                    object3 = object;
                    bl3 = false;
                }
            }
            fxf.E(bl3, "Host string is invalid: %s", object3);
            return object2;
        }
        throw new NullPointerException("Null rpcServiceConfig");
    }
}

