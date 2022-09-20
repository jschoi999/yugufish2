import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import MallView from '../views/MallView'
import AdminLogin from '../views/AdminLogin'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    //about - 조황 페이지
    path: '/route/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    //mall페이지
    path: '/route/mall',
    name: 'mall',
    component: MallView,
    props: true,

  },
  {
    path: '/route/adminLogin',
    name: 'adminLogin',
    component: AdminLogin,
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
