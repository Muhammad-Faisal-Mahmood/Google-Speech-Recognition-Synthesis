/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

public final class y
extends ce
implements bv {
    final by a;
    boolean b;
    int c;

    public y(by by2) {
        by2.g();
        bm bm2 = by2.l;
        if (bm2 != null) {
            bm2.c.getClassLoader();
        }
        this.c = -1;
        this.a = by2;
    }

    final void a(int n2) {
        if (this.j) {
            if (by.S(2)) {
                ((Object)this).toString();
            }
            int n3 = this.d.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                cd cd2 = (cd)this.d.get(i2);
                be be2 = cd2.b;
                if (be2 == null) continue;
                be2.z += n2;
                if (!by.S(2)) continue;
                Objects.toString(cd2.b);
                int n4 = cd2.b.z;
            }
        }
    }

    @Override
    public final void b() {
        this.o();
        this.a.F(this, false);
    }

    @Override
    public final void c(int n2, be object, String charSequence, int n3) {
        Object object2 = ((be)object).mPreviousWho;
        if (object2 != null) {
            zy.a((be)object, (String)object2);
        }
        object2 = object.getClass();
        int n4 = ((Class)object2).getModifiers();
        if (!((Class)object2).isAnonymousClass() && Modifier.isPublic(n4) && (!((Class)object2).isMemberClass() || Modifier.isStatic(n4))) {
            if (charSequence != null) {
                object2 = ((be)object).G;
                if (object2 != null && !((String)charSequence).equals(object2)) {
                    object2 = new StringBuilder("Can't change tag of fragment ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(": was ");
                    ((StringBuilder)object2).append(((be)object).G);
                    ((StringBuilder)object2).append(" now ");
                    ((StringBuilder)object2).append((String)charSequence);
                    throw new IllegalStateException(((StringBuilder)object2).toString());
                }
                ((be)object).G = charSequence;
            }
            if (n2 != 0) {
                if (n2 != -1) {
                    n4 = ((be)object).E;
                    if (n4 != 0 && n4 != n2) {
                        charSequence = new StringBuilder("Can't change container ID of fragment ");
                        ((StringBuilder)charSequence).append(object);
                        ((StringBuilder)charSequence).append(": was ");
                        ((StringBuilder)charSequence).append(((be)object).E);
                        ((StringBuilder)charSequence).append(" now ");
                        ((StringBuilder)charSequence).append(n2);
                        throw new IllegalStateException(((StringBuilder)charSequence).toString());
                    }
                    ((be)object).E = n2;
                    ((be)object).F = n2;
                } else {
                    object2 = new StringBuilder("Can't add fragment ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" with tag ");
                    ((StringBuilder)object2).append((String)charSequence);
                    ((StringBuilder)object2).append(" to container view with no id");
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
            }
            this.l(new cd(n3, (be)object));
            ((be)object).A = this.a;
            return;
        }
        object = new StringBuilder("Fragment ");
        ((StringBuilder)object).append(((Class)object2).getCanonicalName());
        ((StringBuilder)object).append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public final void d(String string, PrintWriter printWriter) {
        this.e(string, printWriter, true);
    }

    public final void e(String string, PrintWriter printWriter, boolean bl2) {
        if (bl2) {
            printWriter.print(string);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(string);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(string);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(string);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(string);
            printWriter.println("Operations:");
            int n2 = this.d.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                CharSequence charSequence;
                cd cd2 = (cd)this.d.get(i2);
                switch (cd2.a) {
                    default: {
                        charSequence = new StringBuilder("cmd=");
                        ((StringBuilder)charSequence).append(cd2.a);
                        charSequence = ((StringBuilder)charSequence).toString();
                        break;
                    }
                    case 10: {
                        charSequence = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        charSequence = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        charSequence = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        charSequence = "ATTACH";
                        break;
                    }
                    case 6: {
                        charSequence = "DETACH";
                        break;
                    }
                    case 5: {
                        charSequence = "SHOW";
                        break;
                    }
                    case 4: {
                        charSequence = "HIDE";
                        break;
                    }
                    case 3: {
                        charSequence = "REMOVE";
                        break;
                    }
                    case 2: {
                        charSequence = "REPLACE";
                        break;
                    }
                    case 1: {
                        charSequence = "ADD";
                        break;
                    }
                    case 0: {
                        charSequence = "NULL";
                    }
                }
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print((String)charSequence);
                printWriter.print(" ");
                printWriter.println(cd2.b);
                if (!bl2) continue;
                if (cd2.d != 0 || cd2.e != 0) {
                    printWriter.print(string);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cd2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cd2.e));
                }
                if (cd2.f == 0 && cd2.g == 0) continue;
                printWriter.print(string);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString(cd2.f));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString(cd2.g));
            }
        }
    }

    @Override
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        if (by.S(2)) {
            ((Object)this).toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            this.a.b.add(this);
        }
        return true;
    }

    @Override
    public final boolean g() {
        return this.d.isEmpty();
    }

    @Override
    public final void h() {
        this.k(false, true);
    }

    @Override
    public final void i() {
        this.k(true, true);
    }

    @Override
    public final void j(be be2) {
        Object object = be2.A;
        if (object != null && object != this.a) {
            object = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            ((StringBuilder)object).append(be2.toString());
            ((StringBuilder)object).append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        this.l(new cd(3, be2));
    }

    final void k(boolean bl2, boolean bl3) {
        if (!this.b) {
            if (by.S(2)) {
                ((Object)this).toString();
                PrintWriter printWriter = new PrintWriter(new cr());
                this.d("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            this.c = this.j ? this.a.h.getAndIncrement() : -1;
            if (bl3) {
                this.a.E(this, bl2);
            }
            return;
        }
        throw new IllegalStateException("commit already called");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.c);
        }
        if (this.l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

