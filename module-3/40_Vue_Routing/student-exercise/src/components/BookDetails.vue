<template>
  <div>Book Details
      <div>ISBN: {{$route.params.isbn}}</div>
      <book-card v-bind:book='book' />
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue'

export default {
    components: {
        BookCard
    },
    data() {
        return{
            book: {}
        }
    },
    created() {
        // look up the book
        const isbn = this.$route.params.isbn;
        this.book = this.$store.state.books.find(book => book.isbn == isbn)
    }
}
</script>

<style>

</style>