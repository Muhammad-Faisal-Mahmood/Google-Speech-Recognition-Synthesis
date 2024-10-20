/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Set;

public final class dwg {
    public static final dwc a(String string, long l2, String string2, Set set, boolean bl2, boolean bl3) {
        dwe dwe2 = new dwe(1);
        Objects.requireNonNull(Long.class);
        return new dwc(string2, string, l2, new bng(true, set, dwe2, new dwd(Long.class, 1)));
    }

    public static final dwc b(String object, String string, String string2, Set set, boolean bl2, boolean bl3) {
        object = new dwe(2);
        Objects.requireNonNull(String.class);
        return new dwc("com.google.android.tts", "ApiKeys__api_key", "AJ3jcGg;:\\:Lmgr1eZ[?4eWwWIy7Q8lI7[ak\\C\\", new bng(true, set, (dwf)object, new dwd(String.class, 4)));
    }

    public static final dwc c(String string, boolean bl2, String string2, Set set, boolean bl3, boolean bl4) {
        dwe dwe2 = new dwe(0);
        Objects.requireNonNull(Boolean.class);
        return new dwc(string2, string, bl2, new bng(bl4, set, dwe2, new dwd(Boolean.class, 3)));
    }

    public static final dwc d(String string, dwf dwf2, String string2, String string3, Set set, boolean bl2, boolean bl3) {
        return new dwc(string3, string, new bng(true, set, new dwd(dwf2, 0), new dwd(dwf2, 2)), string2);
    }
}

