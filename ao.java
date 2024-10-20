/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 */
import android.transition.Transition;

final class ao
extends ah {
    public final Object b;
    public final boolean c;
    public final Object d;

    /*
     * Unable to fully structure code
     */
    public ao(cy var1_1, boolean var2_2, boolean var3_3) {
        block19: {
            block20: {
                block18: {
                    block16: {
                        block17: {
                            jse.e(var1_1, "operation");
                            super((cy)var1_1);
                            var6_4 = var1_1.a;
                            var8_5 = cx.b;
                            var4_6 = false;
                            var7_7 = null;
                            var5_8 = true;
                            if (var6_4 != var8_5) break block16;
                            if (!var2_2) break block17;
                            var9_9 = var1_1.c;
                            var6_4 = var9_9.S;
                            if (var6_4 == null) ** GOTO lbl-1000
                            var6_4 = var8_5 = var6_4.l;
                            if (var8_5 == be.e) {
                                var6_4 = var9_9.getExitTransition();
                            }
                            break block18;
                        }
                        var6_4 = var1_1.c.getEnterTransition();
                        break block19;
                    }
                    if (var2_2) {
                        var9_10 = var1_1.c;
                        var6_4 = var9_10.S;
                        ** if (var6_4 != null) goto lbl-1000
                    }
                    break block20;
lbl-1000:
                    // 2 sources

                    {
                        var6_4 = null;
                        ** GOTO lbl31
                    }
lbl-1000:
                    // 1 sources

                    {
                        var6_4 = var8_5 = var6_4.j;
                        if (var8_5 == be.e) {
                            var6_4 = var9_10.getEnterTransition();
                        }
                    }
                }
                var4_6 = true;
                break block19;
            }
            var6_4 = var1_1.c.getExitTransition();
        }
        this.b = var6_4;
        var2_2 = var5_8;
        if (var1_1.a == cx.b) {
            if (var4_6) {
                var6_4 = var1_1.c.S;
                var2_2 = var5_8;
                if (var6_4 != null) {
                    var6_4 = var6_4.o;
                    var2_2 = var6_4 == null ? var5_8 : var6_4.booleanValue();
                }
            } else {
                var6_4 = var1_1.c.S;
                var2_2 = var5_8;
                if (var6_4 != null) {
                    var6_4 = var6_4.p;
                    var2_2 = var6_4 == null ? var5_8 : var6_4.booleanValue();
                }
            }
        }
        this.c = var2_2;
        var6_4 = var7_7;
        if (var3_3) {
            if (var4_6) {
                var8_5 = var1_1.c;
                var1_1 = var8_5.S;
                if (var1_1 == null) {
                    var6_4 = var7_7;
                } else {
                    var6_4 = var1_1 = var1_1.n;
                    if (var1_1 == be.e) {
                        var6_4 = var8_5.getSharedElementEnterTransition();
                    }
                }
            } else {
                var6_4 = var1_1.c.getSharedElementEnterTransition();
            }
        }
        this.d = var6_4;
    }

    private final cm d(Object object) {
        if (object == null) {
            return null;
        }
        Object object2 = cf.a;
        if (!(object instanceof Transition)) {
            object2 = cf.b;
            if (object2 != null && ((cm)object2).m(object)) {
                return cf.b;
            }
            object2 = new StringBuilder("Transition ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" for fragment ");
            ((StringBuilder)object2).append(this.a.c);
            ((StringBuilder)object2).append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return cf.a;
    }

    public final cm a() {
        Object object = this.d;
        Object object2 = this.d(this.b);
        object = this.d(object);
        if (object2 != null && object != null && object2 != object) {
            object2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            ((StringBuilder)object2).append(this.a.c);
            ((StringBuilder)object2).append(" returned Transition ");
            ((StringBuilder)object2).append(this.b);
            ((StringBuilder)object2).append(" which uses a different Transition  type than its shared element transition ");
            ((StringBuilder)object2).append(this.d);
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        if (object2 == null) {
            return object;
        }
        return object2;
    }

    public final boolean c() {
        return this.d != null;
    }
}

