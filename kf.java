/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  android.view.ViewGroup
 */
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

public abstract class kf {
    private boolean mHasStableIds = false;
    private final kg mObservable = new kg();
    private ke mStateRestorationPolicy = ke.a;

    public final void bindViewHolder(lg lg2, int n2) {
        boolean bl2 = lg2.mBindingAdapter == null;
        if (bl2) {
            lg2.mPosition = n2;
            if (this.hasStableIds()) {
                lg2.mItemId = this.getItemId(n2);
            }
            lg2.setFlags(1, 519);
            if (tz.a()) {
                Trace.beginSection((String)String.format("RV onBindViewHolder type=0x%X", lg2.mItemViewType));
            }
        }
        lg2.mBindingAdapter = this;
        int n3 = RecyclerView.ab;
        this.onBindViewHolder(lg2, n2, lg2.getUnmodifiedPayloads());
        if (bl2) {
            lg2.clearPayload();
            lg2 = lg2.itemView.getLayoutParams();
            if (lg2 instanceof kp) {
                ((kp)((Object)lg2)).e = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int n2 = this.mStateRestorationPolicy.ordinal();
        if (n2 != 1) {
            return n2 != 2;
        }
        return this.getItemCount() > 0;
    }

    public final lg createViewHolder(ViewGroup object, int n2) {
        try {
            if (tz.a()) {
                Trace.beginSection((String)String.format("RV onCreateViewHolder type=0x%X", n2));
            }
            object = this.onCreateViewHolder((ViewGroup)object, n2);
            if (object.itemView.getParent() == null) {
                object.mItemViewType = n2;
                return object;
            }
            object = new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            throw object;
        }
        finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(kf kf2, lg lg2, int n2) {
        if (kf2 == this) {
            return n2;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int n2) {
        return -1L;
    }

    public int getItemViewType(int n2) {
        return 0;
    }

    public final ke getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.h();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.a();
    }

    public final void notifyItemChanged(int n2) {
        this.mObservable.c(n2, 1);
    }

    public final void notifyItemChanged(int n2, Object object) {
        this.mObservable.d(n2, 1, object);
    }

    public final void notifyItemInserted(int n2) {
        this.mObservable.e(n2, 1);
    }

    public final void notifyItemMoved(int n2, int n3) {
        this.mObservable.b(n2, n3);
    }

    public final void notifyItemRangeChanged(int n2, int n3) {
        this.mObservable.c(n2, n3);
    }

    public final void notifyItemRangeChanged(int n2, int n3, Object object) {
        this.mObservable.d(n2, n3, object);
    }

    public final void notifyItemRangeInserted(int n2, int n3) {
        this.mObservable.e(n2, n3);
    }

    public final void notifyItemRangeRemoved(int n2, int n3) {
        this.mObservable.f(n2, n3);
    }

    public final void notifyItemRemoved(int n2) {
        this.mObservable.f(n2, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(lg var1, int var2);

    public void onBindViewHolder(lg lg2, int n2, List list) {
        this.onBindViewHolder(lg2, n2);
    }

    public abstract lg onCreateViewHolder(ViewGroup var1, int var2);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(lg lg2) {
        return false;
    }

    public void onViewAttachedToWindow(lg lg2) {
    }

    public void onViewDetachedFromWindow(lg lg2) {
    }

    public void onViewRecycled(lg lg2) {
    }

    public void registerAdapterDataObserver(kh kh2) {
        this.mObservable.registerObserver(kh2);
    }

    public void setHasStableIds(boolean bl2) {
        if (!this.hasObservers()) {
            this.mHasStableIds = bl2;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(ke ke2) {
        this.mStateRestorationPolicy = ke2;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(kh kh2) {
        this.mObservable.unregisterObserver(kh2);
    }
}

