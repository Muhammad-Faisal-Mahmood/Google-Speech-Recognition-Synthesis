/*
 * Decompiled with CFR 0.152.
 */
public final class aak
extends aai {
    public aak(be be2, be be3, int n2) {
        jse.e(be2, "fragment");
        StringBuilder stringBuilder = new StringBuilder("Attempting to nest fragment ");
        stringBuilder.append(be2);
        stringBuilder.append(" within the view of parent fragment ");
        stringBuilder.append(be3);
        stringBuilder.append(" via container with ID ");
        stringBuilder.append(n2);
        stringBuilder.append(" without using parent's childFragmentManager");
        super(be2, stringBuilder.toString());
    }
}

