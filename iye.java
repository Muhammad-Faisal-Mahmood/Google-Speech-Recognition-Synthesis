/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;

public final class iye
extends Enum {
    public static final /* enum */ iye a;
    public static final /* enum */ iye b;
    public static final /* enum */ iye c;
    public static final /* enum */ iye d;
    public static final /* enum */ iye e;
    public static final /* enum */ iye f;
    public static final /* enum */ iye g;
    public static final /* enum */ iye h;
    public static final /* enum */ iye i;
    public static final /* enum */ iye j;
    public static final /* enum */ iye k;
    public static final /* enum */ iye l;
    public static final /* enum */ iye m;
    public static final /* enum */ iye n;
    public static final /* enum */ iye o;
    public static final /* enum */ iye p;
    public static final /* enum */ iye q;
    private static final iye[] t;
    public final int r;
    public final byte[] s;

    static {
        iye iye2;
        iye iye3;
        iye iye4;
        iye iye5;
        iye iye6;
        iye iye7;
        iye iye8;
        iye iye9;
        iye iye10;
        iye iye11;
        iye iye12;
        iye iye13;
        iye iye14;
        iye iye15;
        iye iye16;
        iye iye17;
        iye iye18;
        a = iye18 = new iye("OK", 0, 0);
        b = iye17 = new iye("CANCELLED", 1, 1);
        c = iye16 = new iye("UNKNOWN", 2, 2);
        d = iye15 = new iye("INVALID_ARGUMENT", 3, 3);
        e = iye14 = new iye("DEADLINE_EXCEEDED", 4, 4);
        f = iye13 = new iye("NOT_FOUND", 5, 5);
        g = iye12 = new iye("ALREADY_EXISTS", 6, 6);
        h = iye11 = new iye("PERMISSION_DENIED", 7, 7);
        i = iye10 = new iye("RESOURCE_EXHAUSTED", 8, 8);
        j = iye9 = new iye("FAILED_PRECONDITION", 9, 9);
        k = iye8 = new iye("ABORTED", 10, 10);
        l = iye7 = new iye("OUT_OF_RANGE", 11, 11);
        m = iye6 = new iye("UNIMPLEMENTED", 12, 12);
        n = iye5 = new iye("INTERNAL", 13, 13);
        o = iye4 = new iye("UNAVAILABLE", 14, 14);
        p = iye3 = new iye("DATA_LOSS", 15, 15);
        q = iye2 = new iye("UNAUTHENTICATED", 16, 16);
        t = new iye[]{iye18, iye17, iye16, iye15, iye14, iye13, iye12, iye11, iye10, iye9, iye8, iye7, iye6, iye5, iye4, iye3, iye2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iye() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.r = var3_2;
        this.s = Integer.toString((int)var3_2).getBytes(StandardCharsets.US_ASCII);
    }

    public static iye[] values() {
        return (iye[])t.clone();
    }

    public final iyh a() {
        return (iyh)iyh.a.get(this.r);
    }
}

