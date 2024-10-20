/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 */
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lg {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    kf mBindingAdapter;
    int mFlags;
    boolean mInChangeScrap = false;
    private int mIsRecyclableCount = 0;
    long mItemId = -1L;
    int mItemViewType = -1;
    public WeakReference mNestedRecyclerView;
    public int mOldPosition = -1;
    RecyclerView mOwnerRecyclerView;
    List mPayloads = null;
    public int mPendingAccessibilityState = -1;
    public int mPosition = -1;
    int mPreLayoutPosition = -1;
    kv mScrapContainer = null;
    public lg mShadowedHolder = null;
    public lg mShadowingHolder = null;
    List mUnmodifiedPayloads = null;
    private int mWasImportantForAccessibilityBeforeHidden = 0;

    public lg(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    private void createPayloadsIfNeeded() {
        if (this.mPayloads == null) {
            ArrayList arrayList;
            this.mPayloads = arrayList = new ArrayList();
            this.mUnmodifiedPayloads = DesugarCollections.unmodifiableList(arrayList);
        }
    }

    public void addChangePayload(Object object) {
        if (object == null) {
            this.addFlags(1024);
            return;
        }
        if ((0x400 & this.mFlags) == 0) {
            this.createPayloadsIfNeeded();
            this.mPayloads.add(object);
        }
    }

    public void addFlags(int n2) {
        this.mFlags = n2 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= 0xFFFFFBFF;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= 0xFFFFFFDF;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= 0xFFFFFEFF;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 0x10) == 0) {
            View view = this.itemView;
            int[] nArray = wj.a;
            if (view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int n2, int n3, boolean bl2) {
        this.addFlags(8);
        this.offsetPosition(n3, bl2);
        this.mPosition = n2;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return this.getBindingAdapterPosition();
    }

    public final kf getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        int n2;
        Object object;
        if (this.mBindingAdapter != null && (object = this.mOwnerRecyclerView) != null && (object = ((RecyclerView)object).g()) != null && (n2 = this.mOwnerRecyclerView.b(this)) != -1) {
            return ((kf)object).findRelativeAdapterPositionIn(this.mBindingAdapter, this, n2);
        }
        return -1;
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int n2;
        int n3 = n2 = this.mPreLayoutPosition;
        if (n2 == -1) {
            n3 = this.mPosition;
        }
        return n3;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int n2;
        int n3 = n2 = this.mPreLayoutPosition;
        if (n2 == -1) {
            n3 = this.mPosition;
        }
        return n3;
    }

    public List getUnmodifiedPayloads() {
        List list;
        if ((this.mFlags & 0x400) == 0 && (list = this.mPayloads) != null && list.size() != 0) {
            return this.mUnmodifiedPayloads;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int n2) {
        return (n2 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 0x200) != 0 || this.isInvalid();
        {
        }
    }

    public boolean isAttachedToTransitionOverlay() {
        return this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 0x10) == 0) {
            View view = this.itemView;
            int[] nArray = wj.a;
            if (!view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 0x100) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int n2, boolean bl2) {
        int n3;
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        int n4 = n3 = this.mPreLayoutPosition;
        if (n3 == -1) {
            this.mPreLayoutPosition = n4 = this.mPosition;
        }
        if (bl2) {
            this.mPreLayoutPosition = n4 + n2;
        }
        this.mPosition += n2;
        if (this.itemView.getLayoutParams() != null) {
            ((kp)this.itemView.getLayoutParams()).e = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int n2 = this.mPendingAccessibilityState;
        this.mWasImportantForAccessibilityBeforeHidden = n2 != -1 ? n2 : this.itemView.getImportantForAccessibility();
        recyclerView.at(this, 4);
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        recyclerView.at(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        int n2 = RecyclerView.ab;
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        this.clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.w(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int n2, int n3) {
        this.mFlags = n2 & n3 | this.mFlags & ~n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setIsRecyclable(boolean bl2) {
        int n2;
        block3: {
            block5: {
                block4: {
                    block2: {
                        n2 = bl2 ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
                        this.mIsRecyclableCount = n2;
                        if (n2 >= 0) break block2;
                        this.mIsRecyclableCount = 0;
                        n2 = RecyclerView.ab;
                        ((Object)this).toString();
                        Log.e((String)"View", (String)"isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(((Object)this).toString()));
                        break block3;
                    }
                    if (bl2 || n2 != 1) break block4;
                    n2 = this.mFlags | 0x10;
                    break block5;
                }
                if (!bl2 || n2 != 0) break block3;
                n2 = this.mFlags & 0xFFFFFFEF;
            }
            this.mFlags = n2;
        }
        n2 = RecyclerView.ab;
    }

    public void setScrapContainer(kv kv2, boolean bl2) {
        this.mScrapContainer = kv2;
        this.mInChangeScrap = bl2;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 0x10) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 0x80) != 0;
    }

    void stopIgnoring() {
        this.mFlags &= 0xFFFFFF7F;
    }

    public String toString() {
        CharSequence charSequence = this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append(" position=");
        stringBuilder.append(this.mPosition);
        stringBuilder.append(" id=");
        stringBuilder.append(this.mItemId);
        stringBuilder.append(", oldPos=");
        stringBuilder.append(this.mOldPosition);
        stringBuilder.append(", pLpos:");
        stringBuilder.append(this.mPreLayoutPosition);
        stringBuilder = new StringBuilder(stringBuilder.toString());
        if (this.isScrap()) {
            stringBuilder.append(" scrap ");
            charSequence = true != this.mInChangeScrap ? "[attachedScrap]" : "[changeScrap]";
            stringBuilder.append((String)charSequence);
        }
        if (this.isInvalid()) {
            stringBuilder.append(" invalid");
        }
        if (!this.isBound()) {
            stringBuilder.append(" unbound");
        }
        if (this.needsUpdate()) {
            stringBuilder.append(" update");
        }
        if (this.isRemoved()) {
            stringBuilder.append(" removed");
        }
        if (this.shouldIgnore()) {
            stringBuilder.append(" ignored");
        }
        if (this.isTmpDetached()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!this.isRecyclable()) {
            charSequence = new StringBuilder(" not recyclable(");
            ((StringBuilder)charSequence).append(this.mIsRecyclableCount);
            ((StringBuilder)charSequence).append(")");
            stringBuilder.append(((StringBuilder)charSequence).toString());
        }
        if (this.isAdapterPositionUnknown()) {
            stringBuilder.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            stringBuilder.append(" no parent");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 0x20) != 0;
    }
}

