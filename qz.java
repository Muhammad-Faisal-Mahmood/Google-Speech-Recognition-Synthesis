/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public final class qz {
    static int a;
    final ArrayList b = new ArrayList();
    public final int c;
    public int d;
    ArrayList e = null;
    private int f = -1;

    public qz(int n2) {
        int n3 = a;
        a = n3 + 1;
        this.c = n3;
        this.d = n2;
    }

    public final int a(px px2, int n2) {
        Object object;
        int n3 = this.b.size();
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        Object object2 = this.b;
        qg qg2 = ((qg)((ArrayList)object2).get((int)0)).U;
        px2.k();
        qg2.b(px2, false);
        for (n3 = 0; n3 < ((ArrayList)object2).size(); ++n3) {
            ((qg)((ArrayList)object2).get(n3)).b(px2, false);
        }
        if (n2 == 0) {
            object = (qh)qg2;
            if (((qh)object).at > 0) {
                kt.e((qh)object, px2, (ArrayList)object2, 0);
            }
        }
        if (n2 == 1) {
            object = (qh)qg2;
            if (((qh)object).au > 0) {
                kt.e((qh)object, px2, (ArrayList)object2, 1);
            }
        }
        try {
            px2.j();
        }
        catch (Exception exception) {
            PrintStream printStream = System.err;
            object = new StringBuilder();
            ((StringBuilder)object).append(exception.toString());
            ((StringBuilder)object).append("\n");
            ((StringBuilder)object).append(Arrays.toString(exception.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream.println(((StringBuilder)object).toString());
        }
        this.e = new ArrayList();
        for (n3 = n4; n3 < ((ArrayList)object2).size(); ++n3) {
            object = new ki((qg)((ArrayList)object2).get(n3));
            this.e.add(object);
        }
        if (n2 == 0) {
            object2 = (qh)qg2;
            n3 = px.o(((qh)object2).J);
            n2 = px.o(((qh)object2).L);
            px2.k();
        } else {
            object2 = (qh)qg2;
            n3 = px.o(((qh)object2).K);
            n2 = px.o(((qh)object2).M);
            px2.k();
        }
        return n2 - n3;
    }

    public final void b(ArrayList arrayList) {
        int n2 = this.b.size();
        if (this.f != -1 && n2 > 0) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                qz qz2 = (qz)arrayList.get(i2);
                if (this.f != qz2.c) continue;
                this.c(this.d, qz2);
            }
        }
        if (n2 == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int n2, qz qz2) {
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            qg qg2 = (qg)arrayList.get(i2);
            qz2.d(qg2);
            if (n2 == 0) {
                qg2.ao = qz2.c;
                continue;
            }
            qg2.ap = qz2.c;
        }
        this.f = qz2.c;
    }

    public final boolean d(qg qg2) {
        if (this.b.contains(qg2)) {
            return false;
        }
        this.b.add(qg2);
        return true;
    }

    public final String toString() {
        Serializable serializable = new StringBuilder();
        int n2 = this.d;
        String string = n2 == 0 ? "Horizontal" : (n2 == 1 ? "Vertical" : "Both");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(" [");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append("] <");
        string = ((StringBuilder)serializable).toString();
        serializable = this.b;
        int n3 = serializable.size();
        for (n2 = 0; n2 < n3; ++n2) {
            qg qg2 = (qg)serializable.get(n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(qg2.ai);
            string = stringBuilder.toString();
        }
        return string.concat(" >");
    }
}

