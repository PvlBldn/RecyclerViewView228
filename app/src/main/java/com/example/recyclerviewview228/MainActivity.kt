package com.example.recyclerviewview228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewview228.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    lateinit var adapter: ToDoItemAdapter
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        recyclerView = binding.mainRecyclerView
        adapter = ToDoItemAdapter()
        recyclerView.adapter = adapter
        adapter.setList(toDoAdd())
    }

    fun toDoAdd(): ArrayList<ToDoItem> {
        val toDoList = ArrayList<ToDoItem>()

        val toDo = ToDoItem("Kartoshechka", "kupit' i pozharit'")

        toDoList.add(toDo)

        return toDoList
    }
}