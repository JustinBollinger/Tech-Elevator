<template>
  <section class="todo-summary">
      <div>
          <h3>Home</h3>
          <p>{{ completedHomeTodos }} / {{ totalHomeTodos }}</p>
      </div>
      <div>
          <h3>Work</h3>
          <p>{{ completedWorkTodos }} / {{ totalWorkTodos }}</p>
      </div>
  </section>
</template>

<script>
export default {
        computed: {
            completedHomeTodos () {
                const todos = this.$store.state.todos;
                return todos.filter(todo => todo.category === 'Home' && todo.done).length;
            },
            totalHomeTodos () {
                const todos = this.$store.state.todos;
                return todos.filter(todo => todo.category === 'Home').length;
            },
            completedWorkTodos () {
                const todos = this.$store.state.todos;
                return todos.filter(todo => todo.category === 'Work' && todo.done).length;
            }
            ,
            totalWorkTodos () {
                const todos = this.$store.state.todos;
                return todos.filter(todo => todo.category === 'Work').length;
            }
        }

}
</script>

<style>
.todo-summary {
    width:600px;
    margin: auto;
    font-family: 'Roboto Condensed', sans-serif;
    display: flex;
    justify-content:space-evenly;
}

.todo-summary div {
    background: #fff;
    padding: 20px;
    border-radius: 10px;
    display: inline-block;
    text-align: center;
    width: 40%;
}

.todo-summary div p {
    font-size: 2em;
    margin: 3px;
}
</style>