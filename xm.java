/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes$Builder
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;

public final class xm {
    static int a(int n2) {
        int n3 = 0;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            int n4;
            block1: {
                block10: {
                    block2: {
                        block3: {
                            block4: {
                                block5: {
                                    block6: {
                                        block7: {
                                            block8: {
                                                block9: {
                                                    n4 = n3;
                                                    if ((n2 & i2) == 0) break block1;
                                                    if (i2 == 1) break block2;
                                                    if (i2 == 2) break block3;
                                                    if (i2 == 4) break block4;
                                                    if (i2 == 8) break block5;
                                                    if (i2 == 16) break block6;
                                                    if (i2 == 32) break block7;
                                                    if (i2 == 64) break block8;
                                                    if (i2 == 128) break block9;
                                                    n4 = n3;
                                                    break block1;
                                                }
                                                n4 = sk$$ExternalSyntheticApiModelOutline1.m$3();
                                                break block10;
                                            }
                                            n4 = sk$$ExternalSyntheticApiModelOutline1.m$5();
                                            break block10;
                                        }
                                        n4 = sk$$ExternalSyntheticApiModelOutline1.m$6();
                                        break block10;
                                    }
                                    n4 = sk$$ExternalSyntheticApiModelOutline1.m$7();
                                    break block10;
                                }
                                n4 = sk$$ExternalSyntheticApiModelOutline1.m();
                                break block10;
                            }
                            n4 = sk$$ExternalSyntheticApiModelOutline1.m$8();
                            break block10;
                        }
                        n4 = sk$$ExternalSyntheticApiModelOutline1.m$2();
                        break block10;
                    }
                    n4 = sk$$ExternalSyntheticApiModelOutline1.m$1();
                }
                n4 = n3 | n4;
            }
            n3 = n4;
        }
        return n3;
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return yj.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return yj.b(edgeEffect, f2, f3);
        }
        yi.a(edgeEffect, f2, f3);
        return f2;
    }

    public static EdgeEffect d(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return yj.c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static final acr e(aco object) {
        jse.e(object, "owner");
        object = object instanceof aav ? ((aav)object).getDefaultViewModelCreationExtras() : acp.a;
        return object;
    }

    public static final void f(View view, awh awh2) {
        jse.e(view, "<this>");
        view.setTag(2131428011, (Object)awh2);
    }

    public static final awg g(awh awh2) {
        return new awg(new awi(awh2, new mq(awh2, 10)));
    }

    public static final void h(Bundle bundle) {
        jse.e(bundle, "<this>");
        jse.e(bundle, "source");
    }

    public static final AudioAttributesCompat i(bzb bzb2) {
        return new AudioAttributesCompat(new AudioAttributesImplApi26(((AudioAttributes.Builder)bzb2.a).build()));
    }

    public static final void j(int n2, bzb bzb2) {
        ((AudioAttributes.Builder)bzb2.a).setUsage(n2);
    }
}

