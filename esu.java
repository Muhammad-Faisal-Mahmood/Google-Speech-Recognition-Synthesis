/*
 * Decompiled with CFR 0.152.
 */
public final class esu
implements ess {
    private final int a;
    private final eal b;

    public esu(int n2, eal eal2) {
        jse.e(eal2, "intent");
        this.a = n2;
        this.b = eal2;
    }

    @Override
    public final /* synthetic */ int a() {
        return this.a;
    }

    public final /* synthetic */ Class annotationType() {
        return ess.class;
    }

    @Override
    public final /* synthetic */ eal b() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof ess)) {
            return false;
        }
        if (this.a == (object = (ess)object).a()) {
            return this.b == object.b();
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int n2 = this.b.hashCode();
        return (this.a ^ 0xBCAE7EDA) + (n2 ^ 0xFF2A1764);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("@com.google.android.libraries.search.audio.policies.PolicyUse(clientOrdinal=");
        stringBuilder.append(this.a);
        stringBuilder.append(", intent=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

