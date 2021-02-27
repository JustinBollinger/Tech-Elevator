<template>
  <div class='new-book-form'>
    <form v-on:submit.prevent="ADD_NEW_BOOK"></form>
      <div class='title-input'>
        <label for="Title">Title: </label>
        <input type="text" book="Title" v-model="newBook.title" />
      </div>
      <div class='author-input'>
        <label for="Author">Author: </label>
        <input type="text" book="Author" v-model="newBook.author" />
      </div>
      <div>
        <label for="ISBN">ISBN: </label>
        <input type="text" book='ISBN' v-model="newBook.isbn" />
      </div>
      
    
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>