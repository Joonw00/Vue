import { createRouter, createWebHistory } from 'vue-router';
import About from '../views/About.vue';
import product from '../views/product.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/about',
      name: 'About',
      component: About
    },
    {
      path: '/product',
      name: 'product',
      component: product
    }
  ]
});

export default router;
