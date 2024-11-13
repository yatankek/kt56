import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kt56.R
import com.example.kt56.Todos

class MyAdapter(private val todosList: List<Todos>) : RecyclerView.Adapter<MyAdapter.TodosViewHolder>() {

    // Вложенный класс ViewHolder для удержания ссылок на представления
    class TodosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val todoText: TextView = itemView.findViewById(R.id.todo_text)
        val userIdText: TextView = itemView.findViewById(R.id.user_id_text)
        val completedText: TextView = itemView.findViewById(R.id.completed_text)
    }

    // Метод для создания нового ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todos_item, parent, false)
        return TodosViewHolder(view)
    }

    // Метод для привязки данных из списка к представлениям ViewHolder
    override fun onBindViewHolder(holder: TodosViewHolder, position: Int) {
        val todo = todosList[position]
        holder.todoText.text = todo.todo
        holder.userIdText.text = "User ID: ${todo.userId}"
        holder.completedText.text = if (todo.completed) "Completed" else "Not completed"
    }

    // Возвращает размер списка
    override fun getItemCount(): Int {
        return todosList.size
    }
}