package com.softwareit.recyclerview.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class OffsetDecoration(
    start: Int = 0,
    top: Int = 0,
    end: Int = 0,
    bottom: Int = 0
) : RecyclerView.ItemDecoration() {

    constructor(horizontal: Int = 0, vertical: Int = 0) : this(
        start = horizontal,
        top = vertical,
        end = horizontal,
        bottom = vertical,
    )

    private val startOffset = start.dp
    private val topOffset = top.dp
    private val endOffset = end.dp
    private val bottomOffset = bottom.dp

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = startOffset
        outRect.top = topOffset
        outRect.right = endOffset
        outRect.bottom = bottomOffset
    }
}