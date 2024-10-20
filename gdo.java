/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;

public final class gdo {
    public final jax a;
    private final Object b;

    static {
        new gdo(null, Instant.EPOCH, false);
    }

    public gdo(Object object, Instant instant, boolean bl2) {
        this.b = object;
        boolean bl3 = object != null;
        this.a = new jax(instant, bl3, bl2);
    }

    public final Object a() {
        fxf.B(this.b(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean b() {
        return this.a.a;
    }

    public final boolean c() {
        fxf.B(this.b(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.a.b;
    }

    public final String toString() {
        Object object = this.a;
        if (!((jax)object).a) {
            return "CacheResult.cacheMiss";
        }
        if (!((jax)object).b) {
            object = String.valueOf(this.b);
            StringBuilder stringBuilder = new StringBuilder("CacheResult.cacheInvalid{data=");
            stringBuilder.append((String)object);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
        Object object2 = this.b;
        object = ((jax)object).c;
        object2 = String.valueOf(object2);
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("CacheResult.cacheHit{data=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", timestamp=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

