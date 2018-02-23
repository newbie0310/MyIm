package com.ego.im4bmob.adapter;

/**为RecycleView添加点击事件
 * @author smile
 * @project OnRecyclerViewListener
 */
public interface OnRecyclerViewListener {
    void onItemClick(int position);
    boolean onItemLongClick(int position);
}
