/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class bgl
implements bgj {
    public final aum a;

    public bgl(aum aum2) {
        this.a = aum2;
    }

    public final void a(HashMap hashMap) {
        Collection<Object> collection = hashMap.keySet();
        if (collection.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            block10: {
                Object object = new StringBuilder();
                ((StringBuilder)object).append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
                int n2 = collection.size();
                wg.j((StringBuilder)object, n2);
                ((StringBuilder)object).append(")");
                object = auo.a(((StringBuilder)object).toString(), n2);
                collection = collection.iterator();
                n2 = 1;
                while (collection.hasNext()) {
                    ((auo)object).g(n2, (String)collection.next());
                    ++n2;
                }
                object = wf.i(this.a, (awr)object, false);
                try {
                    n2 = wf.j((Cursor)object, "work_spec_id");
                    if (n2 == -1) break block10;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    object.close();
                }
                block6: while (true) {
                    while (object.moveToNext()) {
                        collection = (ArrayList)hashMap.get(object.getString(n2));
                        if (collection == null) continue block6;
                        ((ArrayList)collection).add(bas.a(object.getBlob(0)));
                    }
                    break;
                }
            }
            return;
        }
        wf.e(hashMap, new bgk(this, 0));
    }

    public final void b(HashMap hashMap) {
        Collection<Object> collection = hashMap.keySet();
        if (collection.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            block10: {
                Object object = new StringBuilder();
                ((StringBuilder)object).append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
                int n2 = collection.size();
                wg.j((StringBuilder)object, n2);
                ((StringBuilder)object).append(")");
                object = auo.a(((StringBuilder)object).toString(), n2);
                collection = collection.iterator();
                n2 = 1;
                while (collection.hasNext()) {
                    ((auo)object).g(n2, (String)collection.next());
                    ++n2;
                }
                object = wf.i(this.a, (awr)object, false);
                try {
                    n2 = wf.j((Cursor)object, "work_spec_id");
                    if (n2 == -1) break block10;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    object.close();
                }
                block6: while (true) {
                    while (object.moveToNext()) {
                        collection = (ArrayList)hashMap.get(object.getString(n2));
                        if (collection == null) continue block6;
                        ((ArrayList)collection).add(object.getString(0));
                    }
                    break;
                }
            }
            return;
        }
        wf.e(hashMap, new bgk(this, 1));
    }
}

