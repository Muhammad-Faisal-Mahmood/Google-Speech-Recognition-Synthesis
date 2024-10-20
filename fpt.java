/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class fpt {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    static final Account b = fpq.a;
    public static final Set c = DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}

