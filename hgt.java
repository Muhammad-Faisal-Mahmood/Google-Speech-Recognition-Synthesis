/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class hgt {
    private static String a = "hhc";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = new String[]{"hhc", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ((hie)hie.a.get()).b;
    }

    public static long b() {
        return hgr.a.c();
    }

    public static hfv d(String string) {
        return hgr.a.e(string);
    }

    public static hfz f() {
        return hgt.i().a();
    }

    public static hgs g() {
        return hgr.a.h();
    }

    public static hhk i() {
        return hgr.a.j();
    }

    public static hhr k() {
        return hgt.i().b();
    }

    public static String l() {
        return hgr.a.m();
    }

    public static boolean n(String string, Level level, boolean bl2) {
        hgt.i().c(string, level, bl2);
        return false;
    }

    static /* bridge */ /* synthetic */ String[] o() {
        return d;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract hfv e(String var1);

    protected abstract hgs h();

    protected hhk j() {
        return hhm.a;
    }

    protected abstract String m();
}

