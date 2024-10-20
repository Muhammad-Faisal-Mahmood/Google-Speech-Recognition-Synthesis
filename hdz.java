/*
 * Decompiled with CFR 0.152.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class hdz {
    public final hfv a;

    protected hdz(hfv hfv2) {
        hhk.h(hfv2, "backend");
        this.a = hfv2;
    }

    public static void j(String string, hfu hfu2) {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date(TimeUnit.NANOSECONDS.toMillis(hfu2.e()));
        stringBuilder.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date));
        stringBuilder.append(": logging error [");
        hhk.l(1, hfu2.f(), stringBuilder);
        stringBuilder.append("]: ");
        stringBuilder.append(string);
        System.err.println(stringBuilder);
        System.err.flush();
    }

    public abstract hew a(Level var1);

    public final hew b() {
        return this.a(Level.CONFIG);
    }

    public final hew c() {
        return this.a(Level.FINE);
    }

    public final hew d() {
        return this.a(Level.FINER);
    }

    public final hew e() {
        return this.a(Level.FINEST);
    }

    public final hew f() {
        return this.a(Level.INFO);
    }

    public final hew g() {
        return this.a(Level.SEVERE);
    }

    public final hew h() {
        return this.a(Level.WARNING);
    }

    protected final String i() {
        return this.a.d();
    }

    protected final boolean k(Level level) {
        return this.a.c(level);
    }
}

