/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

public final class eyu
extends be {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override
    public final void onAttach(Context object) {
        super.onAttach((Context)object);
        object = this.getActivity();
        if (object instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity)object;
        }
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624058, viewGroup, false);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        Object[] objectArray = acv.a(this.getActivity());
        if (!objectArray.b.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Object object;
                if (acv.b(2)) {
                    Objects.toString(objectArray);
                }
                if ((object = objectArray.b.b()) != null) {
                    Object object2;
                    ((acw)object).j();
                    pb pb2 = objectArray.b.b;
                    int n2 = pd.a(pb2.b, pb2.d, 54321);
                    if (n2 >= 0 && (object = (objectArray = pb2.c)[n2]) != (object2 = pc.a)) {
                        objectArray[n2] = object2;
                        pb2.a = true;
                    }
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override
    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override
    public final void onViewCreated(View object, Bundle object2) {
        object2 = this.getActivity();
        this.a = new ArrayAdapter((Context)object2, 2131624055, 2131427708, new ArrayList());
        object2 = acv.a((abe)object2);
        if (!object2.b.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Object object3 = object2.b.b();
                if (acv.b(2)) {
                    Objects.toString(object2);
                }
                if (object3 == null) {
                    try {
                        object2.b.c = true;
                        object3 = new adb((Context)this.getActivity());
                        if (object3.getClass().isMemberClass() && !Modifier.isStatic(object3.getClass().getModifiers())) {
                            StringBuilder stringBuilder = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                            stringBuilder.append(object3);
                            object = new IllegalArgumentException(stringBuilder.toString());
                            throw object;
                        }
                        acw acw2 = new acw((adc)object3);
                        if (acv.b(3)) {
                            ((Object)acw2).toString();
                        }
                        object2.b.b.d(54321, acw2);
                        acw2.k(object2.a, this);
                    }
                    finally {
                        object2.b.a();
                    }
                } else {
                    if (acv.b(3)) {
                        Objects.toString(object3);
                    }
                    ((acw)object3).k(object2.a, this);
                }
                object = (ListView)object.findViewById(2131427711);
                object.setAdapter((ListAdapter)this.a);
                object.setOnItemClickListener((AdapterView.OnItemClickListener)new eyt(this, 0));
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }
}

