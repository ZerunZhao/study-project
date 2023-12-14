import { createRouter, createWebHistory } from 'vue-router'
import {useStore} from "@/stores";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'welcome',
      component: () => import('@/views/WelcomeView.vue'),
      children: [
        {
          path: '',
          name: 'welcome-login',
          component: () => import('@/components/welcome/LoginPage.vue')
        }, {
          path: 'register',
          name: 'welcome-register',
          component: () => import('@/components/welcome/RegisterPage.vue')
        }, {
          path: 'forget',
          name: 'welcome-forget',
          component: () => import('@/components/welcome/ForgetPage.vue')
        }
      ]
    }, {
      path: '/index',
      name: 'index',
      component: () => import('@/components/menu/MenuPage.vue'),
      children:[
        {
          path: '/',
          redirect: 'recom'
        },
        {
          path: '/userHome',
          name: 'userHome',
          component: () => import('@/views/UserHomeView.vue')
        },
        {
          path: '/resumeAxis',
          name: 'resumeAxis',
          component: () => import('@/views/ResumeAxisView.vue')
        },
        {
          path: '/testModel',
          name: 'testModel',
          component: () => import('@/components/testmodel/Demo06.vue')
        }
      ]
    }
  ]
})

router.beforeEach((to, from, next) => {
  const store = useStore()
  if(store.auth.user != null && to.name.startsWith('welcome-')) {
    next('/index')
  } else if(store.auth.user == null && to.fullPath.startsWith('/index')) {
    next('/')
  } else if(to.matched.length === 0){
    next('/index')
  } else {
    next()
  }
})

export default router
