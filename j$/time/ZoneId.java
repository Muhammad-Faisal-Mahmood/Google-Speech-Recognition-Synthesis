/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.nio.file.attribute.a;
import j$.time.c;
import j$.time.s;
import j$.time.x;
import j$.time.y;
import j$.time.zone.e;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public abstract class ZoneId
implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = j$.nio.file.attribute.a.g("ACT", "Australia/Darwin");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = j$.nio.file.attribute.a.g("AET", "Australia/Sydney");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = j$.nio.file.attribute.a.g("AGT", "America/Argentina/Buenos_Aires");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = j$.nio.file.attribute.a.g("ART", "Africa/Cairo");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = j$.nio.file.attribute.a.g("AST", "America/Anchorage");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = j$.nio.file.attribute.a.g("BET", "America/Sao_Paulo");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry7 = j$.nio.file.attribute.a.g("BST", "Asia/Dhaka");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry8 = j$.nio.file.attribute.a.g("CAT", "Africa/Harare");
        Serializable serializable = j$.nio.file.attribute.a.g("CNT", "America/St_Johns");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry9 = j$.nio.file.attribute.a.g("CST", "America/Chicago");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry10 = j$.nio.file.attribute.a.g("CTT", "Asia/Shanghai");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry11 = j$.nio.file.attribute.a.g("EAT", "Africa/Addis_Ababa");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry12 = j$.nio.file.attribute.a.g("ECT", "Europe/Paris");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry13 = j$.nio.file.attribute.a.g("IET", "America/Indiana/Indianapolis");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry14 = j$.nio.file.attribute.a.g("IST", "Asia/Kolkata");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry15 = j$.nio.file.attribute.a.g("JST", "Asia/Tokyo");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry16 = j$.nio.file.attribute.a.g("MIT", "Pacific/Apia");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry17 = j$.nio.file.attribute.a.g("NET", "Asia/Yerevan");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry18 = j$.nio.file.attribute.a.g("NST", "Pacific/Auckland");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry19 = j$.nio.file.attribute.a.g("PLT", "Asia/Karachi");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry20 = j$.nio.file.attribute.a.g("PNT", "America/Phoenix");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry21 = j$.nio.file.attribute.a.g("PRT", "America/Puerto_Rico");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry22 = j$.nio.file.attribute.a.g("PST", "America/Los_Angeles");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry23 = j$.nio.file.attribute.a.g("SST", "Pacific/Guadalcanal");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry24 = j$.nio.file.attribute.a.g("VST", "Asia/Ho_Chi_Minh");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry25 = j$.nio.file.attribute.a.g("EST", "-05:00");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry26 = j$.nio.file.attribute.a.g("MST", "-07:00");
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry27 = j$.nio.file.attribute.a.g("HST", "-10:00");
        HashMap hashMap = new HashMap(28);
        for (int i2 = 0; i2 < 28; ++i2) {
            Map.Entry entry = (new Map.Entry[]{simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, simpleImmutableEntry7, simpleImmutableEntry8, serializable, simpleImmutableEntry9, simpleImmutableEntry10, simpleImmutableEntry11, simpleImmutableEntry12, simpleImmutableEntry13, simpleImmutableEntry14, simpleImmutableEntry15, simpleImmutableEntry16, simpleImmutableEntry17, simpleImmutableEntry18, simpleImmutableEntry19, simpleImmutableEntry20, simpleImmutableEntry21, simpleImmutableEntry22, simpleImmutableEntry23, simpleImmutableEntry24, simpleImmutableEntry25, simpleImmutableEntry26, simpleImmutableEntry27})[i2];
            Object k2 = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(k2, Objects.requireNonNull(entry.getValue())) == null) {
                continue;
            }
            serializable = new StringBuilder("duplicate key: ");
            ((StringBuilder)serializable).append(k2);
            throw new IllegalArgumentException(((StringBuilder)serializable).toString());
        }
        a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (this.getClass() != x.class && this.getClass() != y.class) {
            throw new AssertionError((Object)"Invalid subclass");
        }
    }

    static ZoneId J(String string, boolean bl2) {
        Objects.requireNonNull(string, "zoneId");
        if (string.length() > 1 && !string.startsWith("+") && !string.startsWith("-")) {
            if (!string.startsWith("UTC") && !string.startsWith("GMT")) {
                if (string.startsWith("UT")) {
                    return ZoneId.L(string, 2, bl2);
                }
                return y.N(string, bl2);
            }
            return ZoneId.L(string, 3, bl2);
        }
        return x.P(string);
    }

    public static ZoneId K(String string, x x2) {
        Objects.requireNonNull(string, "prefix");
        Objects.requireNonNull(x2, "offset");
        if (string.isEmpty()) {
            return x2;
        }
        if (!(string.equals("GMT") || string.equals("UTC") || string.equals("UT"))) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(string));
        }
        String string2 = string;
        if (x2.O() != 0) {
            string2 = string.concat(x2.l());
        }
        return new y(string2, e.i(x2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ZoneId L(String string, int n2, boolean bl2) {
        String string2 = string.substring(0, n2);
        if (string.length() == n2) {
            return ZoneId.K(string2, x.f);
        }
        if (string.charAt(n2) != '+' && string.charAt(n2) != '-') {
            return y.N(string, bl2);
        }
        try {
            x x2 = x.P(string.substring(n2));
            if (x2 != x.f) return ZoneId.K(string2, x2);
            return ZoneId.K(string2, x2);
        }
        catch (c c2) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(string), c2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String string = TimeZone.getDefault().getID();
        Objects.requireNonNull(string, "zoneId");
        Object object = a;
        Objects.requireNonNull(object, "aliasMap");
        object = (String)object.get(string);
        if (object == null) {
            object = Objects.requireNonNull(string, "defaultObj");
        }
        return ZoneId.J((String)object, true);
    }

    private Object writeReplace() {
        return new s(7, this);
    }

    public abstract e I();

    abstract void M(ObjectOutput var1);

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ZoneId) {
            object = (ZoneId)object;
            return this.l().equals(((ZoneId)object).l());
        }
        return false;
    }

    public int hashCode() {
        return this.l().hashCode();
    }

    public abstract String l();

    public String toString() {
        return this.l();
    }
}

