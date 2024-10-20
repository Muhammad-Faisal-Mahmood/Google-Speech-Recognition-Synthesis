/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CompoundButton
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.android.car.ui.SecureView;
import java.util.List;

public final class bli
extends kf {
    public int a = -1;
    private final List b;

    public bli(List list) {
        this.b = list;
    }

    @Override
    public final int getItemCount() {
        int n2 = this.a == -1 ? this.b.size() : Math.min(this.b.size(), this.a);
        return n2;
    }

    @Override
    public final int getItemViewType(int n2) {
        if (this.b.get(n2) instanceof bla) {
            bkx bkx2 = ((bla)this.b.get((int)n2)).c;
            return 1;
        }
        if (this.b.get(n2) instanceof blc) {
            return 0;
        }
        throw new IllegalStateException("Unknown view type.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void onBindViewHolder(lg lg2, int n2) {
        block28: {
            Object object;
            blf blf2;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            block31: {
                block30: {
                    block29: {
                        int n3 = lg2.getItemViewType();
                        if (n3 == 0) break block28;
                        bl4 = true;
                        bl3 = true;
                        bl2 = true;
                        if (n3 != 1 && n3 != 2) {
                            throw new IllegalStateException("Unknown item view type.");
                        }
                        if (!(lg2 instanceof blh)) throw new IllegalStateException("Incorrect view holder type for list item.");
                        blf2 = (blf)this.b.get(n2);
                        if (!(blf2 instanceof bla)) throw new IllegalStateException("Expected item to be bound to viewHolder to be instance of CarUiContentListItem.");
                        lg2 = (blh)lg2;
                        blf2 = (bla)blf2;
                        object = ((bla)blf2).b;
                        if (object != null) {
                            ((blh)lg2).d.a((bjh)object);
                            ((blh)lg2).d.setVisibility(0);
                        } else {
                            ((blh)lg2).d.setVisibility(8);
                        }
                        ((blh)lg2).e.setVisibility(8);
                        ((blh)lg2).f.setVisibility(8);
                        ((blh)lg2).g.setVisibility(8);
                        ((blh)lg2).h.setVisibility(8);
                        object = ((bla)blf2).a;
                        if (object != null) {
                            ((blh)lg2).i.setVisibility(0);
                            n2 = ((bla)blf2).d.ordinal();
                            if (n2 != 0) {
                                if (n2 != 1) {
                                    if (n2 == 2) {
                                        ((blh)lg2).h.setVisibility(0);
                                        ((blh)lg2).h.setImageDrawable((Drawable)object);
                                        ((blh)lg2).h.setClipToOutline(true);
                                    }
                                } else {
                                    ((blh)lg2).f.setVisibility(0);
                                    ((blh)lg2).f.setImageDrawable((Drawable)object);
                                }
                            } else {
                                ((blh)lg2).g.setVisibility(0);
                                ((blh)lg2).g.setImageDrawable((Drawable)object);
                            }
                        } else {
                            ((blh)lg2).i.setVisibility(8);
                        }
                        if (!((blh)lg2).p) break block29;
                        object = ((blh)lg2).a;
                        if (!(object instanceof SecureView)) break block30;
                        ((SecureView)((Object)object)).a();
                        break block31;
                    }
                    object = ((blh)lg2).b;
                    if (object instanceof SecureView) {
                        ((SecureView)((Object)object)).a();
                        n2 = 0;
                    } else {
                        n2 = 1;
                    }
                    object = ((blh)lg2).c;
                    if (!(object instanceof SecureView)) break block30;
                    ((SecureView)((Object)object)).a();
                    if (n2 == 0) break block31;
                }
                Log.w((String)"carui", (String)"List item doesn't have a SecureView, but security was requested!");
            }
            ((blh)lg2).k.setVisibility(8);
            ((blh)lg2).l.setVisibility(8);
            ((blh)lg2).m.setVisibility(8);
            ((blh)lg2).n.setVisibility(8);
            ((blh)lg2).o.setVisibility(8);
            object = ((bla)blf2).i;
            n2 = ((bla)blf2).c.ordinal();
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 5) throw new IllegalStateException("Unknown secondary action type.");
                                if (object == null) {
                                    bl2 = false;
                                }
                                ((blh)lg2).o.setVisibility(0);
                                ((blh)lg2).o.setImageDrawable(((blh)lg2).itemView.getContext().getDrawable(2131230940));
                                ((blh)lg2).j.setVisibility(0);
                                ((blh)lg2).a.setVisibility(0);
                                ((blh)lg2).a.setOnClickListener((View.OnClickListener)new gp(object, 14, null));
                                ((blh)lg2).a.setClickable(bl2);
                                ((blh)lg2).b.setVisibility(8);
                                ((blh)lg2).c.setVisibility(8);
                            } else {
                                bl2 = object != null ? bl4 : false;
                                ((blh)lg2).o.setVisibility(0);
                                ((blh)lg2).o.setImageDrawable(null);
                                ((blh)lg2).j.setVisibility(0);
                                ((blh)lg2).a.setVisibility(0);
                                ((blh)lg2).a.setOnClickListener((View.OnClickListener)new gp(object, 15, null));
                                ((blh)lg2).a.setClickable(bl2);
                                ((blh)lg2).b.setVisibility(8);
                                ((blh)lg2).c.setVisibility(8);
                            }
                        } else {
                            ((blh)lg2).b((bla)blf2, (CompoundButton)((blh)lg2).n, (eky)object);
                        }
                    } else {
                        ((blh)lg2).b((bla)blf2, (CompoundButton)((blh)lg2).m, (eky)object);
                    }
                } else {
                    ((blh)lg2).b((bla)blf2, (CompoundButton)((blh)lg2).l, (eky)object);
                }
            } else {
                bl2 = object != null ? bl3 : false;
                ((blh)lg2).j.setVisibility(8);
                ((blh)lg2).a.setVisibility(0);
                ((blh)lg2).a.setOnClickListener((View.OnClickListener)new gp(object, 13, null));
                ((blh)lg2).a.setClickable(bl2);
                ((blh)lg2).b.setVisibility(8);
                ((blh)lg2).c.setVisibility(8);
            }
            ((blh)lg2).itemView.setActivated(((bla)blf2).g);
            ((blh)lg2).a(((blh)lg2).itemView, ((bla)blf2).f);
            return;
        }
        if (!(lg2 instanceof blg)) throw new IllegalStateException("Incorrect view holder type for list item.");
        blf blf3 = (blf)this.b.get(n2);
        if (!(blf3 instanceof blc)) {
            throw new IllegalStateException("Expected item to be bound to viewHolder to be instance of CarUiHeaderListItem.");
        }
        lg2 = (blg)lg2;
        blf3 = (blc)blf3;
        lg2 = ((blg)lg2).a;
        throw null;
    }

    @Override
    public final lg onCreateViewHolder(ViewGroup viewGroup, int n2) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        boolean bl2 = false;
        if (n2 != 0) {
            if (n2 != 1 && n2 != 2) {
                throw new IllegalStateException("Unknown item type.");
            }
            viewGroup = layoutInflater.inflate(2131623976, viewGroup, false);
            if (n2 == 1) {
                bl2 = true;
            }
            return new blh((View)viewGroup, bl2);
        }
        return new blg(layoutInflater.inflate(2131623973, viewGroup, false));
    }
}

