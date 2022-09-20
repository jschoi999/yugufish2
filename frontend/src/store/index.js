import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    //원본소스 역할
    message: 'hello',
  },
  getters: {
    //vue의 computed와 비슷
    //특정 state에 대한 연산을하고 값을 가져옴
  },
  mutations: {
    //state을 변화시키는 방법
    //store.commit('이름', payload)
  },
  actions: {
    //mutation과 비슷하지만 비동기 작업이 가능
    //mutation에 대한 commit이 가능함
  },
  modules: {
  }
})
