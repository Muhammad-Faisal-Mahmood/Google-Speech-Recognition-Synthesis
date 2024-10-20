/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class bge
implements bgc {
    public final aum a;
    public final atw b;

    public bge(aum aum2) {
        this.a = aum2;
        this.b = new bgd(aum2);
    }

    @Override
    public final List a(String string) {
        auo auo2 = auo.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        auo2.g(1, string);
        this.a.j();
        string = wf.i(this.a, auo2, false);
        try {
            ArrayList<String> arrayList = new ArrayList<String>(string.getCount());
            while (string.moveToNext()) {
                arrayList.add(string.getString(0));
            }
            return arrayList;
        }
        finally {
            string.close();
            auo2.j();
        }
    }
}

