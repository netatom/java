<script>
import Todo from './components/Todo.vue';
import Header from './components/Header.vue';

export default {
  components: {
    Todo, Header
  },
  data() {
    return {
      todos: [],
      loading: false
    }
  },
  created() {
    this.loadTodos()
  },
  methods: {
    async loadTodos() {
      this.loading = true
      try {
        const response = await fetch('http://localhost:8888/api/todo')
        const result = await response.json()
        // console.log(result)
        this.todos = result
      } catch (err) {
        console.error('Fetch error', err)
      } finally {
        this.loading = false
      }
    },
    async insertTodo(text) {
      // console.log(text)
      try {
        const response = await fetch('http://localhost:8888/api/todo', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify({
            text
          })
        })
        if (response.ok) {
          await this.loadTodos()
        }
      } catch (err) {
        console.error('Fetch error', err)
      }
    },
    async removeTodo(id) {
      // console.log(id)
      try {
        const response = await fetch(`http://localhost:8888/api/todo/${id}`, {
          method: 'DELETE',
          headers: {
            'Content-Type': 'application/json'
          }
        })
        if (response.ok) {
          await this.loadTodos()
        }
      } catch (err) {
        console.error('Fetch error', err)
      }
    },
    async updateDone(id) {
      // console.log(id)
      const todo = this.todos.find(todo => todo.id === id)
      if (todo) {
        todo.done = !todo.done
        try {
          const response = await fetch(`http://localhost:8888/api/todo/${id}`, {
            method: 'PUT',
            headers: {
              'Content-Type': 'application/json'
            },
            body: JSON.stringify({
              text: todo.text,
              done: todo.done ? 1 : 0
            })
          })
          if (response.ok) {
            await this.loadTodos()
          }
        } catch (err) {
          console.error('Fetch error', err)
        }
      }

    }
  }
}
</script>
<template>
  <div id=id>
    <Header @insertTodo="insertTodo" />
    <Todo :todos="todos" @removeTodo="removeTodo" @updateDone="updateDone" />
  </div>
</template>