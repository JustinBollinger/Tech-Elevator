<template>

    <form class='new-book-form' v-on:submit.prevent='addNewBook()'>
        <input class="title-input" type='text' placeholder='Title' v-model='newBook.title'>
        <input class="author-input" type='text' placeholder='Author' v-model='newBook.author'>
        <input class="isbn-input" type='text' placeholder='ISBN' v-model='newBook.isbn'>
      <button type='submit' v-bind="newBook">Submit</button>
    </form>

</template>

<script>
export default {
  name: 'new-book-form',
  data() {
    return {
      newBook: {
        title: '',
        author: '',
        read: false,
        isbn: ''
      }
    }
  },
  methods: {
    addNewBook() {
      this.$store.commit('ADD_NEW_BOOK', this.newBook);
      this.resetForm();
    },
    resetForm() {
      this.newBook = {}
    }
  }
}
</script>

<style>

</style>