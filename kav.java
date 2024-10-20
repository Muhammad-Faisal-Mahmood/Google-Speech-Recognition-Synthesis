/*
 * Decompiled with CFR 0.152.
 */
public final class kav
implements jvb {
    public final jqf a;

    public kav(jqf jqf2) {
        this.a = jqf2;
    }

    @Override
    public final jqf bA() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineScope(coroutineContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

