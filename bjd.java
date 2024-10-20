/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bjd {
    public static final String a = bbi.b("DiagnosticsWrkr");

    public static final String a(bgt bgt2, bhx bhx2, bgn bgn2, List object) {
        StringBuilder stringBuilder = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            bhd bhd2 = (bhd)iterator.next();
            object = ass.d(bgn2, AmbientLifecycleObserverKt.o(bhd2));
            object = object != null ? Integer.valueOf(((bgm)object).c) : null;
            Object object2 = bhd2.b;
            Object object3 = auo.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            ((auo)object3).g(1, (String)object2);
            object2 = (bgv)bgt2;
            ((bgv)object2).a.j();
            object2 = wf.i(((bgv)object2).a, (awr)object3, false);
            Serializable serializable = new ArrayList(object2.getCount());
            while (object2.moveToNext()) {
                serializable.add(object2.getString(0));
            }
            object2 = jns.D(serializable, ",", null, null, null, 62);
            object3 = jns.D(bhx2.a(bhd2.b), ",", null, null, null, 62);
            serializable = new StringBuilder("\n");
            ((StringBuilder)serializable).append(bhd2.b);
            ((StringBuilder)serializable).append("\t ");
            ((StringBuilder)serializable).append(bhd2.d);
            ((StringBuilder)serializable).append("\t ");
            ((StringBuilder)serializable).append(object);
            ((StringBuilder)serializable).append("\t ");
            ((StringBuilder)serializable).append(bhd2.c.name());
            ((StringBuilder)serializable).append("\t ");
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append("\t ");
            ((StringBuilder)serializable).append((String)object3);
            ((StringBuilder)serializable).append('\t');
            stringBuilder.append(((StringBuilder)serializable).toString());
            continue;
            finally {
                object2.close();
                ((auo)object3).j();
            }
        }
        return stringBuilder.toString();
    }
}

