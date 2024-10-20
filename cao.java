/*
 * Decompiled with CFR 0.152.
 */
public final class cao {
    public final int a;
    public final ikq b;

    public cao() {
        throw null;
    }

    public cao(int n2, ikq ikq2) {
        this.a = n2;
        this.b = ikq2;
    }

    public static cao a(int n2, ikq ikq2) {
        boolean bl2 = n2 > 0;
        kl.an(bl2);
        kl.at(ikq2);
        return new cao(n2, ikq2);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cao) {
            object = (cao)object;
            if (this.a == ((cao)object).a && this.b.equals(((cao)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = ((Object)this.b).toString();
        StringBuilder stringBuilder = new StringBuilder("ComplianceProductData{productId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", productIdOrigin=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

