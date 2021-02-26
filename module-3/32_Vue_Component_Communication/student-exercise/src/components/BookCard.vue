<template>
  <div class="card">

    <div class="book-title">{{book.title}}</div>

    <img v-if="book.isbn" 
        v-bind:title="book.title"
        v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />

    <div class="book-author">{{book.author}}</div>

  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ['book']
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>