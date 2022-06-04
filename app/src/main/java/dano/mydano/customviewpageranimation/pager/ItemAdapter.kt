package dano.mydano.customviewpageranimation.pager

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder> {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

}

class DefaultViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView)

class DefaultItemDecoration: RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = (view.layoutParams as RecyclerView.LayoutParams).viewLayoutPosition
        if (position > -1) {
            if (position == 0) {
                outRect.set(0, dp2px)
            }
        }
    }
}