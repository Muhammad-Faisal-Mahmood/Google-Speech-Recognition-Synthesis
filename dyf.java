/*
 * Decompiled with CFR 0.152.
 */
public final class dyf {
    public final int a;
    public final int b;

    public dyf() {
        throw null;
    }

    public dyf(int n2, int n3) {
        this.a = n2;
        if (n3 != 0) {
            this.b = n3;
            return;
        }
        throw new NullPointerException("Null productId");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dyf) {
            object = (dyf)object;
            if (this.a == ((dyf)object).a && this.b == ((dyf)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        a.L(n2);
        return n2 ^ (this.a ^ 0xF4243) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != 0) {
            stringBuilder.append("app ID: ");
            stringBuilder.append(this.a);
        }
        if (this.b != 1) {
            String string;
            stringBuilder.append("product ID: ");
            switch (this.b) {
                default: {
                    string = "AGSA_RUBIDIUM";
                    break;
                }
                case 8: {
                    string = "SEARCHBOX";
                    break;
                }
                case 7: {
                    string = "XBLEND";
                    break;
                }
                case 6: {
                    string = "ASSISTANT_LITE";
                    break;
                }
                case 5: {
                    string = "TEST";
                    break;
                }
                case 4: {
                    string = "DISCOVER";
                    break;
                }
                case 3: {
                    string = "AGSA_STARTUP";
                    break;
                }
                case 2: {
                    string = "FAKE_APP";
                    break;
                }
                case 1: {
                    string = "UNKNOWN";
                }
            }
            stringBuilder.append(string);
            stringBuilder.append(" (ID ");
            stringBuilder.append(this.b - 1);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}

