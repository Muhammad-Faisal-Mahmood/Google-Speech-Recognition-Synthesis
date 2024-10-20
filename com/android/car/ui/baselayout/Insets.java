/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.baselayout;

import j$.util.Objects;

public final class Insets {
    private final int mBottom;
    private final int mLeft;
    private final int mRight;
    private final int mTop;

    public Insets() {
        this.mBottom = 0;
        this.mTop = 0;
        this.mRight = 0;
        this.mLeft = 0;
    }

    public Insets(int n2, int n3, int n4, int n5) {
        this.mLeft = n2;
        this.mRight = n4;
        this.mTop = n3;
        this.mBottom = n5;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (Insets)object;
            if (this.mLeft == ((Insets)object).mLeft && this.mRight == ((Insets)object).mRight && this.mTop == ((Insets)object).mTop && this.mBottom == ((Insets)object).mBottom) {
                return true;
            }
        }
        return false;
    }

    public int getBottom() {
        return this.mBottom;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getTop() {
        return this.mTop;
    }

    public int hashCode() {
        return Objects.hash(this.mLeft, this.mRight, this.mTop, this.mBottom);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ left: ");
        stringBuilder.append(this.mLeft);
        stringBuilder.append(", right: ");
        stringBuilder.append(this.mRight);
        stringBuilder.append(", top: ");
        stringBuilder.append(this.mTop);
        stringBuilder.append(", bottom: ");
        stringBuilder.append(this.mBottom);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

