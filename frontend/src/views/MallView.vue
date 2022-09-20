<template>
  <div>
    <p>Mall View</p>
    <p>{{$route.query.page}}</p>
    <p>state의 값은 ? {{getState}}</p>
  </div>
</template>

<script>

  export default {
    name: 'MallView',

    components: {
    },
    computed: {
      getState(){
        return this.$store.state.message;
      }
    },
    methods: {
      test(){
      }
    },
  }
</script>
