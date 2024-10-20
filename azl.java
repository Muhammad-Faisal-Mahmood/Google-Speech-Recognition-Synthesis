/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import java.util.ArrayList;

final class azl
extends aay {
    final Matrix a = new Matrix();
    final ArrayList b = new ArrayList();
    float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public azl() {
        super(null);
        this.j = new Matrix();
        this.m = null;
    }

    public azl(azl aay2, ot ot2) {
        super(null);
        Object object = new Matrix();
        this.j = object;
        this.m = null;
        this.c = aay2.c;
        this.d = aay2.d;
        this.e = aay2.e;
        this.f = aay2.f;
        this.g = aay2.g;
        this.h = aay2.h;
        this.i = aay2.i;
        Object object2 = aay2.l;
        this.l = null;
        object2 = aay2.m;
        this.m = object2;
        int n2 = aay2.k;
        n2 = 0;
        this.k = 0;
        if (object2 != null) {
            ot2.put(object2, this);
        }
        object.set(aay2.j);
        object = aay2.b;
        while (n2 < ((ArrayList)object).size()) {
            block10: {
                block7: {
                    block9: {
                        block8: {
                            block6: {
                                aay2 = ((ArrayList)object).get(n2);
                                if (!(aay2 instanceof azl)) break block6;
                                this.b.add(new azl((azl)aay2, ot2));
                                break block7;
                            }
                            if (!(aay2 instanceof azk)) break block8;
                            aay2 = new azk((azk)aay2);
                            break block9;
                        }
                        if (!(aay2 instanceof azj)) break block10;
                        aay2 = new azj((azj)aay2);
                    }
                    this.b.add(aay2);
                    object2 = ((azm)aay2).n;
                    if (object2 != null) {
                        ot2.put(object2, aay2);
                    }
                }
                ++n2;
                continue;
            }
            throw new IllegalStateException("Unknown object in the tree!");
        }
    }

    @Override
    public final boolean g() {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!((aay)this.b.get(i2)).g()) continue;
            return true;
        }
        return false;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    @Override
    public final boolean h(int[] nArray) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            bl2 |= ((aay)this.b.get(i2)).h(nArray);
        }
        return bl2;
    }

    public final void l() {
        this.j.reset();
        float f2 = -this.d;
        float f3 = -this.e;
        this.j.postTranslate(f2, f3);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        f3 = this.h;
        float f4 = this.d;
        f2 = this.i;
        float f5 = this.e;
        this.j.postTranslate(f3 + f4, f2 + f5);
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            this.l();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            this.l();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            this.l();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            this.l();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            this.l();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            this.l();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            this.l();
        }
    }
}

