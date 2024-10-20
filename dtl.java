/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Pattern;

public final class dtl {
    public static final dtk a;
    public static final dtk b;
    public static final dtk c;
    private static final guf d;

    static {
        d = guf.b('/').a();
        a = new dtj(1);
        b = new dtj(0);
        c = new dtj(2);
    }

    public static List a(String string) {
        return fvd.y(d.g(string), new dti(0));
    }

    public static void b(dtk dtk2, hye hye2) {
        String string = dtk2.a(hye2);
        String string2 = dtk2.b(hye2);
        if (string.isEmpty() && !string2.isEmpty()) {
            dtk2.c(hye2, hqk.a(string2));
        } else {
            dtk2.c(hye2, null);
        }
        dtk2.d(hye2);
    }

    /*
     * Unable to fully structure code
     */
    public static final hll c(hll var0) {
        block35: {
            block33: {
                block34: {
                    var6_1 = var0.d;
                    if (var6_1.isEmpty()) break block33;
                    var5_2 = var0.c;
                    switch (var5_2.hashCode()) {
                        default: {
                            break;
                        }
                        case 1879291277: {
                            if (!var5_2.equals("java.lang.NullPointerException")) break;
                            var1_3 = 9;
                            break block34;
                        }
                        case 1625905794: {
                            if (!var5_2.equals("java.lang.ArrayIndexOutOfBoundsException")) break;
                            var1_3 = 3;
                            break block34;
                        }
                        case 1270017459: {
                            if (!var5_2.equals("java.lang.IndexOutOfBoundsException")) break;
                            var1_3 = 8;
                            break block34;
                        }
                        case 1077344571: {
                            if (!var5_2.equals("java.lang.WrongMethodTypeException")) break;
                            var1_3 = 11;
                            break block34;
                        }
                        case 287460082: {
                            if (!var5_2.equals("java.io.InvalidClassException")) break;
                            var1_3 = 0;
                            break block34;
                        }
                        case 145247949: {
                            if (!var5_2.equals("java.lang.IncompatibleClassChangeError")) break;
                            var1_3 = 7;
                            break block34;
                        }
                        case -37663348: {
                            if (!var5_2.equals("java.lang.ClassCastException")) break;
                            var1_3 = 5;
                            break block34;
                        }
                        case -437312173: {
                            if (!var5_2.equals("java.lang.ArrayStoreException")) break;
                            var1_3 = 4;
                            break block34;
                        }
                        case -759901694: {
                            if (!var5_2.equals("java.lang.IllegalAccessError")) break;
                            var1_3 = 6;
                            break block34;
                        }
                        case -823400207: {
                            if (!var5_2.equals("java.lang.ArithmeticException")) break;
                            var1_3 = 2;
                            break block34;
                        }
                        case -1383341662: {
                            if (!var5_2.equals("java.lang.StringIndexOutOfBoundsException")) break;
                            var1_3 = 10;
                            break block34;
                        }
                        case -1940179375: {
                            if (!var5_2.equals("java.lang.AbstractMethodError")) break;
                            var1_3 = 1;
                            break block34;
                        }
                    }
                    var1_3 = -1;
                }
                switch (var1_3) {
                    default: {
                        break block35;
                    }
                    case 11: {
                        var2_4 = Pattern.matches("Expected .+ but was .+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 10: {
                        var2_4 = Pattern.matches("length=\\d+; index=\\d+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 9: {
                        if (!Pattern.matches("Attempt to (?:read from|write to) field '.+' on a null object reference in method '.+'", (CharSequence)var6_1) && !Pattern.matches("Attempt to invoke .+ method '.+' on a null object reference", (CharSequence)var6_1) && !var6_1.equals("Attempt to read from null array") && !var6_1.equals("Attempt to write to null array") && !var6_1.equals("Attempt to get length of null array") && !var6_1.equals("Attempt to do a synchronize operation on a null object")) break block35;
                        break block33;
                    }
                    case 8: {
                        var2_4 = Pattern.matches("length=\\d+; index=-?\\d+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 7: {
                        if (!Pattern.matches("The method '.+' was expected to be of type .+ but instead was found to be of type .+", (CharSequence)var6_1) && !Pattern.matches("Class '.+' does not implement interface '.+' in call to '.+'", (CharSequence)var6_1) && !Pattern.matches("Expected '.+' to be a (?:static|instance) field rather than a (?:static|instance) field", (CharSequence)var6_1) && !Pattern.matches("Conflicting default method implementations .+", (CharSequence)var6_1)) break block35;
                        break block33;
                    }
                    case 6: {
                        if (!Pattern.matches("Illegal class access: '.+' attempting to access .+'", (CharSequence)var6_1) && !Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", (CharSequence)var6_1) && !Pattern.matches("Method '.+' is inaccessible to class '.+'", (CharSequence)var6_1) && !Pattern.matches("Field '.+' is inaccessible to class '.+'", (CharSequence)var6_1) && !Pattern.matches("Final field '.+' cannot be written to by method '.+'", (CharSequence)var6_1) && !Pattern.matches("Method '.+' implementing interface method '.+' is not public", (CharSequence)var6_1)) break block35;
                        break block33;
                    }
                    case 5: {
                        var2_4 = Pattern.matches(".+ cannot be cast to .+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 4: {
                        var2_4 = Pattern.matches(".+ cannot be stored in an array of type .+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 3: {
                        var2_4 = Pattern.matches("length=\\d+; index=-?\\d+", (CharSequence)var6_1);
                        ** GOTO lbl92
                    }
                    case 2: {
                        var2_4 = var6_1.equals("divide by zero");
                        ** GOTO lbl92
                    }
                    case 1: {
                        var2_4 = var6_1.startsWith("abstract method ");
lbl92:
                        // 8 sources

                        if (!var2_4) break block35;
                        break block33;
                    }
                    case 0: 
                }
                if (!Pattern.matches("cannot bind .+ descriptor to .+", (CharSequence)var6_1) && !Pattern.matches("Circular reference\\.", (CharSequence)var6_1) && !Pattern.matches(".*class invalid for deserialization", (CharSequence)var6_1) && !Pattern.matches("Class descriptor should be initialized", (CharSequence)var6_1) && !Pattern.matches(".*enum descriptor has non-zero .+", (CharSequence)var6_1) && !Pattern.matches(".*enum type", (CharSequence)var6_1) && !Pattern.matches(".*incompatible types for field .+", (CharSequence)var6_1) && !Pattern.matches(".*invalid descriptor for field .+", (CharSequence)var6_1) && !Pattern.matches(".*local class incompatible: .+", (CharSequence)var6_1) && !Pattern.matches(".*local class name incompatible with stream class .+", (CharSequence)var6_1) && !Pattern.matches("multiple serializable fields named .+", (CharSequence)var6_1) && !Pattern.matches(".*no valid constructor", (CharSequence)var6_1) && !Pattern.matches(".*serializable and externalizable flags conflict", (CharSequence)var6_1) && !Pattern.matches(".*Serializable incompatible with Externalizable", (CharSequence)var6_1) && !Pattern.matches(".*unmatched serializable field(s) declared", (CharSequence)var6_1)) break block35;
            }
            return var0;
        }
        var5_2 = (hwp)var0.C(5);
        var5_2.x(var0);
        var3_5 = hqk.a((String)var6_1);
        if (!var5_2.b.B()) {
            var5_2.u();
        }
        var6_1 = var5_2.b;
        var0 = (hll)var6_1;
        var0.b = 4 | var0.b;
        var0.e = var3_5;
        if (!var6_1.B()) {
            var5_2.u();
        }
        var0 = (hll)var5_2.b;
        var0.b &= -3;
        var0.d = hll.a.d;
        return (hll)var5_2.o();
    }
}

