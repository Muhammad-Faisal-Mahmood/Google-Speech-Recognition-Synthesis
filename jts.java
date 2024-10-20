/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;

public final class jts {
    public static final Charset a;

    static {
        Charset charset = Charset.forName("UTF-8");
        jse.d(charset, "forName(...)");
        a = charset;
        jse.d(Charset.forName("UTF-16"), "forName(...)");
        jse.d(Charset.forName("UTF-16BE"), "forName(...)");
        jse.d(Charset.forName("UTF-16LE"), "forName(...)");
        jse.d(Charset.forName("US-ASCII"), "forName(...)");
        jse.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}

