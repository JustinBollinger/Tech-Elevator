<template>
  <div>
    <img src="../assets/ping_pong_loader.gif" alt="A loading animation of a ping pong mallet bouncing a ping pong ball." v-if="isLoading">
    <h2>{{card.title}}</h2>
    <p class="date">{{card.date}}</p>
    <p>{{card.description}}</p>

    <div class="comment" v-for="comment in card.comments" v-bind:key="comment.id">
      <h3>{{comment.author}}</h3>
      <p class="date">{{comment.postedOn}}</p>
      <p>{{comment.body}}</p>
    </div>
  </div>
</template>

<script>
import boardService from '@/services/BoardService.js';

export default {
  name: "card-detail",
  data() {
    return {
      isLoading: true,
      card: {}
    }
  },
  created() {
    // this fires when the page is loaded
    // call the API here
    const boardId = this.$route.params.boardID;
    const cardId = this.$route.params.cardID;
    boardService.getCard(boardId, cardId)
                .then(result => {
                  this.card = result;
                  this.isLoading = false;
                });
  }
};
</script>

<style scoped>
.date{
  font-size: .75em;
}

div.comment {
  border-radius: 10px;
  padding: 20px;
  font-size: .9em;
  background-color: bisque;
  margin: 5px;
}
</style>