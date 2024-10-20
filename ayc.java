/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ListView
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;

public abstract class ayc
implements Cloneable {
    private static final yj C;
    private static final Animator[] u;
    private static final int[] v;
    private static final ThreadLocal w;
    private boolean A = false;
    private ArrayList B = null;
    public long a = -1L;
    long b = -1L;
    public final ArrayList c;
    public final ArrayList d;
    public ayn e;
    public ayn f;
    ayk g = null;
    public final int[] h;
    public ArrayList i;
    public ArrayList j;
    final ArrayList k;
    int l = 0;
    boolean m = false;
    public ayc n = null;
    public ArrayList o;
    long p;
    public axy q;
    long r;
    public yj s;
    public aay t;
    private final String x = this.getClass().getName();
    private axz[] y;
    private Animator[] z;

    static {
        u = new Animator[0];
        v = new int[]{2, 1, 3, 4};
        C = new yj();
        w = new ThreadLocal();
    }

    public ayc() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ayn();
        this.f = new ayn();
        this.h = v;
        this.k = new ArrayList();
        this.z = u;
        this.o = new ArrayList();
        this.s = C;
    }

    private static boolean N(aym aym2, aym object, String string) {
        boolean bl2;
        object = ((aym)object).a;
        aym2 = aym2.a.get(string);
        object = object.get(string);
        if (aym2 == null && object == null) {
            bl2 = false;
        } else {
            if (aym2 != null && object != null) {
                return ((Object)aym2).equals(object) ^ true;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static void f(ayn ayn2, View view, aym object) {
        ((pa)ayn2.a).put(view, object);
        int n2 = view.getId();
        if (n2 >= 0) {
            if (((SparseArray)ayn2.b).indexOfKey(n2) >= 0) {
                ((SparseArray)ayn2.b).put(n2, null);
            } else {
                ((SparseArray)ayn2.b).put(n2, (Object)view);
            }
        }
        if ((object = wa.f(view)) != null) {
            if (((pa)ayn2.d).containsKey(object)) {
                ((pa)ayn2.d).put(object, null);
            } else {
                ((pa)ayn2.d).put(object, view);
            }
        }
        if (view.getParent() instanceof ListView && (object = (ListView)view.getParent()).getAdapter().hasStableIds()) {
            long l2 = object.getItemIdAtPosition(object.getPositionForView(view));
            ox ox2 = (ox)ayn2.c;
            if (ox2.a) {
                int n3 = ox2.d;
                object = ox2.b;
                Object[] objectArray = ox2.c;
                int n4 = 0;
                for (int i2 = 0; i2 < n3; ++i2) {
                    Object object2 = objectArray[i2];
                    n2 = n4;
                    if (object2 != oy.a) {
                        if (i2 != n4) {
                            object[n4] = object[i2];
                            objectArray[n4] = object2;
                            objectArray[i2] = null;
                        }
                        n2 = n4 + 1;
                    }
                    n4 = n2;
                }
                ox2.a = false;
                ox2.d = n4;
            }
            if (pd.b(ox2.b, ox2.d, l2) >= 0) {
                view = (View)((ox)ayn2.c).c(l2);
                if (view != null) {
                    view.setHasTransientState(false);
                    ((ox)ayn2.c).f(l2, null);
                    return;
                }
            } else {
                view.setHasTransientState(true);
                ((ox)ayn2.c).f(l2, view);
            }
        }
    }

    private final void g(View view, boolean bl2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                aym aym2 = new aym(view);
                if (bl2) {
                    this.c(aym2);
                } else {
                    this.b(aym2);
                }
                aym2.c.add(this);
                this.o(aym2);
                if (bl2) {
                    ayc.f(this.e, view, aym2);
                } else {
                    ayc.f(this.f, view, aym2);
                }
            }
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                    this.g(view.getChildAt(i2), bl2);
                }
            }
        }
    }

    public static ot h() {
        ot ot2;
        ThreadLocal threadLocal = w;
        ot ot3 = ot2 = (ot)threadLocal.get();
        if (ot2 == null) {
            ot3 = new ot();
            threadLocal.set(ot3);
        }
        return ot3;
    }

    public boolean A() {
        return !this.k.isEmpty();
    }

    public boolean B(aym aym2, aym aym3) {
        boolean bl2;
        block6: {
            boolean bl3;
            bl2 = bl3 = false;
            if (aym2 != null) {
                bl2 = bl3;
                if (aym3 != null) {
                    block7: {
                        Object object = this.e();
                        if (object != null) {
                            int n2 = 0;
                            while (true) {
                                bl2 = bl3;
                                if (n2 >= ((String[])object).length) break block6;
                                if (!ayc.N(aym2, aym3, (String)object[n2])) {
                                    ++n2;
                                    continue;
                                }
                                break block7;
                                break;
                            }
                        }
                        object = aym2.a.keySet().iterator();
                        do {
                            bl2 = bl3;
                            if (!object.hasNext()) break block6;
                        } while (!ayc.N(aym2, aym3, (String)object.next()));
                    }
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    final boolean C(View view) {
        int n2 = view.getId();
        if (this.c.size() == 0 && this.d.size() == 0) {
            return true;
        }
        return this.c.contains(n2) || this.d.contains(view);
        {
        }
    }

    public final void D(axz axz2) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(axz2);
    }

    public void E(View view) {
        this.d.add(view);
    }

    public final void F(axz axz2) {
        Cloneable cloneable = this.B;
        if (cloneable != null) {
            if (!((ArrayList)cloneable).remove(axz2) && (cloneable = this.n) != null) {
                ((ayc)cloneable).F(axz2);
            }
            if (this.B.size() == 0) {
                this.B = null;
            }
        }
    }

    public void G(View view) {
        this.d.remove(view);
    }

    public void H() {
    }

    public void I() {
    }

    public void J(long l2) {
        this.a = l2;
    }

    public void K() {
        this.b = 0L;
    }

    public void L(yj yj2) {
        if (yj2 == null) {
            this.s = C;
            return;
        }
        this.s = yj2;
    }

    public void M(aay aay2) {
        this.t = aay2;
    }

    public Animator a(ViewGroup viewGroup, aym aym2, aym aym3) {
        return null;
    }

    public abstract void b(aym var1);

    public abstract void c(aym var1);

    public boolean d() {
        throw null;
    }

    public String[] e() {
        return null;
    }

    public ayc i() {
        try {
            ayc ayc2 = (ayc)super.clone();
            Object object = new ArrayList();
            ayc2.o = object;
            ayc2.e = object = new ayn();
            ayc2.f = object = new ayn();
            ayc2.i = null;
            ayc2.j = null;
            ayc2.q = null;
            ayc2.n = this;
            ayc2.B = null;
            return ayc2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final ayc j() {
        ayk ayk2 = this.g;
        if (ayk2 != null) {
            return ayk2.j();
        }
        return this;
    }

    final aym k(View object, boolean bl2) {
        int n2;
        Object var6_4;
        block6: {
            Cloneable cloneable = this.g;
            if (cloneable != null) {
                return ((ayc)cloneable).k((View)object, bl2);
            }
            cloneable = bl2 ? this.i : this.j;
            var6_4 = null;
            if (cloneable == null) {
                return null;
            }
            int n3 = ((ArrayList)cloneable).size();
            for (n2 = 0; n2 < n3; ++n2) {
                aym aym2 = (aym)((ArrayList)cloneable).get(n2);
                if (aym2 == null) {
                    return null;
                }
                if (aym2.b != object) {
                    continue;
                }
                break block6;
            }
            n2 = -1;
        }
        object = var6_4;
        if (n2 >= 0) {
            object = bl2 ? this.j : this.i;
            object = (aym)((ArrayList)object).get(n2);
        }
        return object;
    }

    public final aym l(View view, boolean bl2) {
        Object object = this.g;
        if (object != null) {
            return ((ayc)object).l(view, bl2);
        }
        object = bl2 ? this.e : this.f;
        return (aym)((pa)((ayn)object).a).get(view);
    }

    public String m(String charSequence) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(this.getClass().getSimpleName());
        ((StringBuilder)charSequence).append("@");
        ((StringBuilder)charSequence).append(Integer.toHexString(this.hashCode()));
        ((StringBuilder)charSequence).append(": ");
        if (this.b != -1L) {
            ((StringBuilder)charSequence).append("dur(");
            ((StringBuilder)charSequence).append(this.b);
            ((StringBuilder)charSequence).append(") ");
        }
        if (this.a != -1L) {
            ((StringBuilder)charSequence).append("dly(");
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append(") ");
        }
        if (this.c.size() > 0 || this.d.size() > 0) {
            ((StringBuilder)charSequence).append("tgts(");
            int n2 = this.c.size();
            int n3 = 0;
            if (n2 > 0) {
                for (n2 = 0; n2 < this.c.size(); ++n2) {
                    if (n2 > 0) {
                        ((StringBuilder)charSequence).append(", ");
                    }
                    ((StringBuilder)charSequence).append(this.c.get(n2));
                }
            }
            if (this.d.size() > 0) {
                for (n2 = n3; n2 < this.d.size(); ++n2) {
                    if (n2 > 0) {
                        ((StringBuilder)charSequence).append(", ");
                    }
                    ((StringBuilder)charSequence).append(this.d.get(n2));
                }
            }
            ((StringBuilder)charSequence).append(")");
        }
        return ((StringBuilder)charSequence).toString();
    }

    public void n() {
        Animator[] animatorArray = this.k;
        int n2 = animatorArray.size();
        animatorArray = animatorArray.toArray(this.z);
        this.z = u;
        while (--n2 >= 0) {
            Animator animator = animatorArray[n2];
            animatorArray[n2] = null;
            animator.cancel();
        }
        this.z = animatorArray;
        this.t(this, ayb.c, false);
    }

    public void o(aym aym2) {
    }

    final void p(ViewGroup object, boolean bl2) {
        Object object2;
        boolean bl3;
        this.q(bl2);
        if (this.c.size() <= 0 && this.d.size() <= 0) {
            this.g((View)object, bl2);
            return;
        }
        int n2 = 0;
        while (true) {
            int n3 = this.c.size();
            bl3 = true;
            if (n2 >= n3) break;
            View view = object.findViewById(((Integer)this.c.get(n2)).intValue());
            if (view != null) {
                object2 = new aym(view);
                if (bl2) {
                    this.c((aym)object2);
                } else {
                    this.b((aym)object2);
                    bl3 = false;
                }
                object2.c.add(this);
                this.o((aym)object2);
                if (bl3) {
                    ayc.f(this.e, view, (aym)object2);
                } else {
                    ayc.f(this.f, view, (aym)object2);
                }
            }
            ++n2;
        }
        for (n2 = 0; n2 < this.d.size(); ++n2) {
            object2 = (View)this.d.get(n2);
            object = new aym((View)object2);
            if (bl2) {
                this.c((aym)object);
                bl3 = true;
            } else {
                this.b((aym)object);
                bl3 = false;
            }
            object.c.add(this);
            this.o((aym)object);
            if (bl3) {
                ayc.f(this.e, object2, (aym)object);
                continue;
            }
            ayc.f(this.f, object2, (aym)object);
        }
    }

    final void q(boolean bl2) {
        if (bl2) {
            ((pa)this.e.a).clear();
            ((SparseArray)this.e.b).clear();
            ((ox)this.e.c).e();
            return;
        }
        ((pa)this.f.a).clear();
        ((SparseArray)this.f.b).clear();
        ((ox)this.f.c).e();
    }

    public void r(ViewGroup object, ayn object2, ayn ayn2, ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        ot ot2 = ayc.h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n3 = arrayList.size();
        axy axy2 = this.j().q;
        for (n2 = 0; n2 < n3; ++n2) {
            Object object3 = (aym)arrayList.get(n2);
            object2 = (aym)arrayList2.get(n2);
            Object object4 = object3;
            if (object3 != null) {
                object4 = object3;
                if (!((aym)object3).c.contains(this)) {
                    object4 = null;
                }
            }
            object3 = object2;
            if (object2 != null) {
                object3 = object2;
                if (!object2.c.contains(this)) {
                    object3 = null;
                }
            }
            if (object4 == null && object3 == null || object4 != null && object3 != null && !this.B((aym)object4, (aym)object3) || (object2 = this.a((ViewGroup)object, (aym)object4, (aym)object3)) == null) continue;
            if (object3 != null) {
                Object object5;
                block15: {
                    object5 = ((aym)object3).b;
                    Object object6 = this.e();
                    if (object6 != null) {
                        int n4;
                        object3 = new aym((View)object5);
                        Object object7 = (aym)((pa)ayn2.a).get(object5);
                        object4 = object2;
                        if (object7 != null) {
                            object2 = object6;
                            for (n4 = 0; n4 < ((String[])object2).length; ++n4) {
                                Map map = ((aym)object3).a;
                                object6 = object2[n4];
                                map.put(object6, ((aym)object7).a.get(object6));
                            }
                        }
                        int n5 = ot2.f;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object6 = (axx)ot2.get((Animator)ot2.d(n4));
                            if (object6.c == null || object6.a != object5 || !((String)(object2 = object6.b)).equals(object7 = this.x) || !((aym)object6.c).equals(object3)) continue;
                            object2 = object3;
                            object4 = null;
                            break block15;
                        }
                        object2 = object3;
                    } else {
                        object3 = null;
                        object4 = object2;
                        object2 = object3;
                    }
                }
                object3 = object5;
                object5 = object2;
                object2 = object4;
                object4 = object3;
                object3 = object5;
            } else {
                object4 = ((aym)object4).b;
                object3 = null;
            }
            if (object2 == null) continue;
            object3 = new axx((View)object4, this.x, this, object.getWindowId(), (aym)object3, (Animator)object2);
            object4 = object2;
            if (axy2 != null) {
                object4 = new AnimatorSet();
                object4.play((Animator)object2);
            }
            ot2.put(object4, object3);
            this.o.add(object4);
        }
        if (sparseIntArray.size() != 0) {
            for (n3 = 0; n3 < sparseIntArray.size(); ++n3) {
                n2 = sparseIntArray.keyAt(n3);
                object = (axx)ot2.get((Animator)this.o.get(n2));
                long l2 = sparseIntArray.valueAt(n3);
                long l3 = ((Animator)object.f).getStartDelay();
                ((Animator)object.f).setStartDelay(l2 - Long.MAX_VALUE + l3);
            }
        }
    }

    protected final void s() {
        int n2;
        this.l = n2 = this.l - 1;
        if (n2 == 0) {
            View view;
            this.t(this, ayb.b, false);
            for (n2 = 0; n2 < ((ox)this.e.c).a(); ++n2) {
                view = (View)((ox)this.e.c).d(n2);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            for (n2 = 0; n2 < ((ox)this.f.c).a(); ++n2) {
                view = (View)((ox)this.f.c).d(n2);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            this.m = true;
        }
    }

    public final void t(ayc ayc2, ayb ayb2, boolean bl2) {
        Cloneable cloneable = this.n;
        if (cloneable != null) {
            ((ayc)cloneable).t(ayc2, ayb2, bl2);
        }
        if ((cloneable = this.B) != null && !((ArrayList)cloneable).isEmpty()) {
            int n2 = this.B.size();
            axz[] axzArray = this.y;
            cloneable = axzArray;
            if (axzArray == null) {
                cloneable = new axz[n2];
            }
            this.y = null;
            cloneable = (axz[])this.B.toArray((T[])cloneable);
            for (int i2 = 0; i2 < n2; ++i2) {
                ayb2.a((axz)((Object)cloneable[i2]), ayc2);
                cloneable[i2] = null;
            }
            this.y = cloneable;
        }
    }

    public final String toString() {
        return this.m("");
    }

    public void u(View object) {
        if (!this.m) {
            object = this.k;
            int n2 = ((ArrayList)object).size();
            Animator[] animatorArray = ((ArrayList)object).toArray(this.z);
            this.z = u;
            while (--n2 >= 0) {
                object = animatorArray[n2];
                animatorArray[n2] = null;
                object.pause();
            }
            this.z = animatorArray;
            this.t(this, ayb.d, false);
            this.A = true;
        }
    }

    public void v() {
        ot ot2 = ayc.h();
        this.p = 0L;
        for (int i2 = 0; i2 < this.o.size(); ++i2) {
            long l2;
            Animator animator = (Animator)this.o.get(i2);
            axx axx2 = (axx)ot2.get(animator);
            if (animator == null || axx2 == null) continue;
            if (this.b >= 0L) {
                ((Animator)axx2.f).setDuration(0L);
            }
            if ((l2 = this.a) >= 0L) {
                axx2 = (Animator)axx2.f;
                axx2.setStartDelay(l2 + axx2.getStartDelay());
            }
            this.k.add(animator);
            this.p = Math.max(this.p, ag$$ExternalSyntheticApiModelOutline1.m(animator));
        }
        this.o.clear();
    }

    public void w(View object) {
        if (this.A) {
            if (!this.m) {
                object = this.k;
                int n2 = ((ArrayList)object).size();
                Animator[] animatorArray = ((ArrayList)object).toArray(this.z);
                this.z = u;
                while (--n2 >= 0) {
                    object = animatorArray[n2];
                    animatorArray[n2] = null;
                    object.resume();
                }
                this.z = animatorArray;
                this.t(this, ayb.e, false);
            }
            this.A = false;
        }
    }

    protected void x() {
        this.z();
        ot ot2 = ayc.h();
        ArrayList arrayList = this.o;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2;
            Animator animator = (Animator)arrayList.get(i2);
            if (!ot2.containsKey(animator)) continue;
            this.z();
            if (animator == null) continue;
            animator.addListener((Animator.AnimatorListener)new axv(this, ot2));
            if (this.b >= 0L) {
                animator.setDuration(0L);
            }
            if ((l2 = this.a) >= 0L) {
                animator.setStartDelay(l2 + animator.getStartDelay());
            }
            animator.addListener((Animator.AnimatorListener)new axw(this));
            animator.start();
        }
        this.o.clear();
        this.s();
    }

    public void y(long l2, long l3) {
        long l4 = this.p;
        int n2 = 0;
        boolean bl2 = l2 < l3;
        long l5 = l3 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 < 0 && l2 >= 0L || l3 > l4 && l2 <= l4) {
            this.m = false;
            this.t(this, ayb.a, bl2);
        }
        ArrayList arrayList = this.k;
        int n3 = arrayList.size();
        Animator[] animatorArray = arrayList.toArray(this.z);
        this.z = u;
        while (n2 < n3) {
            arrayList = animatorArray[n2];
            animatorArray[n2] = null;
            long l7 = ag$$ExternalSyntheticApiModelOutline1.m((Animator)arrayList);
            l7 = Math.min(Math.max(0L, l2), l7);
            ag$$ExternalSyntheticApiModelOutline0.m((AnimatorSet)arrayList, l7);
            ++n2;
        }
        this.z = animatorArray;
        n2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (n2 > 0 && l3 <= l4 || l2 < 0L && l6 >= 0) {
            if (n2 > 0) {
                this.m = true;
            }
            this.t(this, ayb.b, bl2);
        }
    }

    protected final void z() {
        if (this.l == 0) {
            this.t(this, ayb.a, false);
            this.m = false;
        }
        ++this.l;
    }
}

