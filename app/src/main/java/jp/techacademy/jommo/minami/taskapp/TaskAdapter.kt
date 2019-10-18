package jp.techacademy.jommo.minami.taskapp

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TaskAdapter: BaseAdapter() {
    var taskList = mutableListOf<String>()

    override fun getCount(): Int {
        return taskList.size
    }

    override fun getItem(position: Int): Any {
        return taskList[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}