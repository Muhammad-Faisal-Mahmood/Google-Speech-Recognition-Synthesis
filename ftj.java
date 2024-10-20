/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class ftj {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public ftj(long l2, long l3, TimeInterpolator timeInterpolator) {
        this.c = l2;
        this.d = l3;
        this.e = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return ftf.b;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(this.a());
        if (animator instanceof ValueAnimator) {
            int n2 = this.a;
            animator = (ValueAnimator)animator;
            animator.setRepeatCount(n2);
            animator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ftj)) {
            return false;
        }
        object = (ftj)object;
        if (this.c == ((ftj)object).c && this.d == ((ftj)object).d && this.a == ((ftj)object).a) {
            if (this.b != ((ftj)object).b) {
                return false;
            }
            return this.a().getClass().equals(((ftj)object).a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a().getClass().hashCode();
        long l2 = this.d;
        long l3 = this.c;
        return ((((int)(l3 ^ l3 >>> 32) * 31 + (int)(l2 ^ l2 >>> 32)) * 31 + n2) * 31 + this.a) * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.c);
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.d);
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(this.a().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.b);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

