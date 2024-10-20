/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 */
import android.graphics.Paint;

final class azk
extends azm {
    public int[] a;
    float b = 0.0f;
    float c = 1.0f;
    float d = 1.0f;
    float e = 0.0f;
    float f = 1.0f;
    float g = 0.0f;
    Paint.Cap h = Paint.Cap.BUTT;
    Paint.Join i = Paint.Join.MITER;
    float j = 4.0f;
    htf k;
    htf l;

    public azk() {
    }

    public azk(azk azk2) {
        super(azk2);
        int[] nArray = azk2.a;
        this.a = null;
        this.k = azk2.k;
        this.b = azk2.b;
        this.c = azk2.c;
        this.l = azk2.l;
        this.o = azk2.o;
        this.d = azk2.d;
        this.e = azk2.e;
        this.f = azk2.f;
        this.g = azk2.g;
        this.h = azk2.h;
        this.i = azk2.i;
        this.j = azk2.j;
    }

    @Override
    public final boolean g() {
        return this.l.i() || this.k.i();
        {
        }
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.b;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.b;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    @Override
    public final boolean h(int[] nArray) {
        boolean bl2 = this.l.j(nArray);
        return this.k.j(nArray) | bl2;
    }

    void setFillAlpha(float f2) {
        this.d = f2;
    }

    void setFillColor(int n2) {
        this.l.b = n2;
    }

    void setStrokeAlpha(float f2) {
        this.c = f2;
    }

    void setStrokeColor(int n2) {
        this.k.b = n2;
    }

    void setStrokeWidth(float f2) {
        this.b = f2;
    }

    void setTrimPathEnd(float f2) {
        this.f = f2;
    }

    void setTrimPathOffset(float f2) {
        this.g = f2;
    }

    void setTrimPathStart(float f2) {
        this.e = f2;
    }
}

