/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class cfe {
    public final Account a;
    public final Set b;
    public final Set c;
    public final String d;
    public final String e;
    public final ckh f;
    public Integer g;
    private final Map h;

    public cfe(Account object, Set iterator, String object2, String string, ckh ckh2) {
        this.a = object;
        object = iterator == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(iterator);
        this.b = object;
        iterator = Collections.emptyMap();
        this.h = iterator;
        this.d = object2;
        this.e = string;
        this.f = ckh2;
        object = new HashSet(object);
        iterator = iterator.values().iterator();
        while (iterator.hasNext()) {
            object2 = ((bzb)iterator.next()).a;
            object.addAll(null);
        }
        this.c = DesugarCollections.unmodifiableSet(object);
    }
}

