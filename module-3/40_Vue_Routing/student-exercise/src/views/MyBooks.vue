<template>
  <div id='my-books'>
      <div>
        <reading-list />
      </div>
      <nav>
          <router-link to='/addBook'>Add Book to Reading List</router-link>
      </nav>
  </div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue'

export default {
    name: 'my-books',
    components: {
        ReadingList
    }
}
</script>

<style>

</style>