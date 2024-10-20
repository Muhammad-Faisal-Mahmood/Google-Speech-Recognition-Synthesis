/*
 * Decompiled with CFR 0.152.
 */
public final class ivy
extends iwf {
    private final iwb a;

    public ivy(iwb iwb2) {
        a.s(iwb2, "result");
        this.a = iwb2;
    }

    @Override
    public final iwb a(iwc iwc2) {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof ivy)) {
            return false;
        }
        object = (ivy)object;
        return this.a.equals(((ivy)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("FixedResultPicker(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

