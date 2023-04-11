package com.example.recyclerviewview228

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ToDoItemAdapter: RecyclerView.Adapter<ToDoItemAdapter.ToDoItemViewHolder>() {

    private var todoList = emptyList<ToDoItem>()

    class ToDoItemViewHolder(item: View): RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoItemViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)

        return ToDoItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: ToDoItemViewHolder, position: Int) {
        holder.itemView.tv_title.text = todoList[position].title
        holder.itemView.tv_description.text = todoList[position].description
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<ToDoItem>) {
        todoList = list
        notifyDataSetChanged()
    }
}