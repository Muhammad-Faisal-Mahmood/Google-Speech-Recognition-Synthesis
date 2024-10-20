/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class dym {
    public static final AtomicLong a = new AtomicLong();
    public final gto b;
    public final gto c;
    public final gto d;
    public final dxx e;
    public final hac f;
    public final hav g;
    public final hwp h;
    private final long i;

    public dym() {
        throw null;
    }

    public dym(long l2, gto gto2, gto gto3, gto gto4, dxx dxx2, hwp hwp2, hac hac2, hav hav2) {
        this.i = l2;
        this.b = gto2;
        this.c = gto3;
        this.d = gto4;
        this.e = dxx2;
        this.h = hwp2;
        this.f = hac2;
        this.g = hav2;
    }

    public final dye a() {
        return this.e.a;
    }

    public final dyg b() {
        return this.e.f;
    }

    public final hav c() {
        return this.e.c();
    }

    public final boolean d() {
        return this.e.c;
    }

    public final boolean e() {
        return this.e.d;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dym) {
            object = (dym)object;
            if (this.i == ((dym)object).i && this.b.equals(((dym)object).b) && this.c.equals(((dym)object).c) && this.d.equals(((dym)object).d) && this.e.equals(((dym)object).e) && this.h.equals(((dym)object).h) && fvd.s(this.f, ((dym)object).f) && this.g.equals(((dym)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.i;
        return (((((((((int)(l2 ^ l2 >>> 32) ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode();
    }

    /*
     * Unable to fully structure code
     */
    public final String toString() {
        block58: {
            block61: {
                block60: {
                    block59: {
                        var6_1 = new StringBuilder();
                        var6_1.append("<");
                        var6_1.append(this.e.b);
                        var6_1.append("> (ID:");
                        var6_1.append(this.e.a());
                        var6_1.append(") ");
                        var6_1.append(this.a().c);
                        var4_3 = var5_2 = ((bor)this.h.b).d;
                        if (var5_2 == null) {
                            var4_3 = ibk.a;
                        }
                        var3_4 = var4_3.b;
                        var1_5 = 2;
                        var2_6 = 1;
                        if ((var3_4 & 2) == 0) break block58;
                        var6_1.append(" Status: ");
                        var4_3 = var5_2 = ((bor)this.h.b).d;
                        if (var5_2 == null) {
                            var4_3 = ibk.a;
                        }
                        var4_3 = var5_2 = var4_3.d;
                        if (var5_2 == null) {
                            var4_3 = ibj.a;
                        }
                        if ((var4_3.b & 2) == 0) break block59;
                        var4_3 = var5_2 = ((bor)this.h.b).d;
                        if (var5_2 == null) {
                            var4_3 = ibk.a;
                        }
                        var4_3 = var5_2 = var4_3.d;
                        if (var5_2 == null) {
                            var4_3 = ibj.a;
                        }
                        var6_1.append(var4_3.d);
                        var6_1.append(":");
                        var4_3 = var5_2 = ((bor)this.h.b).d;
                        if (var5_2 == null) {
                            var4_3 = ibk.a;
                        }
                        var4_3 = var5_2 = var4_3.d;
                        if (var5_2 == null) {
                            var4_3 = ibj.a;
                        }
                        var6_1.append(var4_3.c);
                        break block58;
                    }
                    var4_3 = var5_2 = ((bor)this.h.b).d;
                    if (var5_2 == null) {
                        var4_3 = ibk.a;
                    }
                    var4_3 = var5_2 = var4_3.d;
                    if (var5_2 == null) {
                        var4_3 = ibj.a;
                    }
                    if ((var3_4 = var4_3.c) == 20) break block60;
                    switch (var3_4) {
                        default: {
                            var1_5 = 0;
                            ** GOTO lbl113
                        }
                        case 16: {
                            var1_5 = 17;
                            ** GOTO lbl113
                        }
                        case 15: {
                            var1_5 = 16;
                            ** GOTO lbl113
                        }
                        case 14: {
                            var1_5 = 15;
                            ** GOTO lbl113
                        }
                        case 13: {
                            var1_5 = 14;
                            ** GOTO lbl113
                        }
                        case 12: {
                            var1_5 = 13;
                            ** GOTO lbl113
                        }
                        case 11: {
                            var1_5 = 12;
                            ** GOTO lbl113
                        }
                        case 10: {
                            var1_5 = 11;
                            ** GOTO lbl113
                        }
                        case 9: {
                            var1_5 = 10;
                            ** GOTO lbl113
                        }
                        case 8: {
                            var1_5 = 9;
                            ** GOTO lbl113
                        }
                        case 7: {
                            var1_5 = 8;
                            ** GOTO lbl113
                        }
                        case 6: {
                            var1_5 = 7;
                            ** GOTO lbl113
                        }
                        case 5: {
                            var1_5 = 6;
                            ** GOTO lbl113
                        }
                        case 4: {
                            var1_5 = 5;
                            ** GOTO lbl113
                        }
                        case 3: {
                            var1_5 = 4;
                            ** GOTO lbl113
                        }
                        case 2: {
                            var1_5 = 3;
                            ** GOTO lbl113
                        }
                        case 0: {
                            var1_5 = 1;
                            ** GOTO lbl113
                        }
                        case 1: {
                            if (var1_5 != 0) break block61;
                        }
                    }
                }
                var1_5 = 21;
lbl113:
                // 18 sources

                if (var1_5 != 0) break block61;
                ** GOTO lbl-1000
            }
            if (var1_5 != 21) {
                switch (var1_5) {
                    default: {
                        var4_3 = "null";
                        break;
                    }
                    case 17: {
                        var4_3 = "UNAUTHENTICATED";
                        break;
                    }
                    case 16: {
                        var4_3 = "DATA_LOSS";
                        break;
                    }
                    case 15: {
                        var4_3 = "UNAVAILABLE";
                        break;
                    }
                    case 14: {
                        var4_3 = "INTERNAL";
                        break;
                    }
                    case 13: {
                        var4_3 = "UNIMPLEMENTED";
                        break;
                    }
                    case 12: {
                        var4_3 = "OUT_OF_RANGE";
                        break;
                    }
                    case 11: {
                        var4_3 = "ABORTED";
                        break;
                    }
                    case 10: {
                        var4_3 = "FAILED_PRECONDITION";
                        break;
                    }
                    case 9: {
                        var4_3 = "RESOURCE_EXHAUSTED";
                        break;
                    }
                    case 8: {
                        var4_3 = "PERMISSION_DENIED";
                        break;
                    }
                    case 7: {
                        var4_3 = "ALREADY_EXISTS";
                        break;
                    }
                    case 6: {
                        var4_3 = "NOT_FOUND";
                        break;
                    }
                    case 5: {
                        var4_3 = "DEADLINE_EXCEEDED";
                        break;
                    }
                    case 4: {
                        var4_3 = "INVALID_ARGUMENT";
                        break;
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var4_3 = "UNKNOWN";
                        break;
                    }
                    case 2: {
                        var4_3 = "CANCELLED";
                        break;
                    }
                    case 1: {
                        var4_3 = "OK";
                        break;
                    }
                }
            } else {
                var4_3 = "DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_";
            }
            var6_1.append((String)var4_3);
        }
        var6_1.append(" Timestamp");
        if (this.c.g()) {
            var6_1.append(" [Custom]: ");
            var6_1.append(this.c.c());
        } else {
            var6_1.append(": ");
            var4_3 = var5_2 = ((bor)this.h.b).d;
            if (var5_2 == null) {
                var4_3 = ibk.a;
            }
            var4_3 = var5_2 = var4_3.c;
            if (var5_2 == null) {
                var4_3 = hzb.a;
            }
            hzw.e((hzb)var4_3);
            var6_1.append(hhk.ap(hhk.aq(var4_3.b, 1000000000L), var4_3.c));
        }
        var6_1.append("ns. ");
        if (!this.f.isEmpty()) {
            var6_1.append(", Tags: [");
            var4_3 = this.f.l().k();
            var1_5 = var2_6;
            while (var4_3.hasNext()) {
                var5_2 = (String)var4_3.next();
                if (var1_5 == 0) {
                    var6_1.append("; ");
                }
                var6_1.append((String)var5_2);
                var6_1.append(":");
                var5_2 = (Set)this.f.get(var5_2);
                if (var5_2 == null) {
                    var6_1.append("<null>");
                } else {
                    new gtk(",").g(var6_1, (Iterable)var5_2);
                }
                var1_5 = 0;
            }
            var6_1.append("]");
        }
        var6_1.append("}");
        return var6_1.toString();
    }
}

