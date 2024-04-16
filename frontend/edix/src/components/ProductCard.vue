<template>
  <div>
    <div class="card" @click="toggleModal">
      <img :src="product.imageUrl" :alt="product.title" class="card-img-top">
      <h5 class="card-title">{{ product.title }}</h5>
    </div>
    <!-- 모달 창, selectedProduct로 현재 product를 전달 -->
    <ProductModal
      v-if="showModal"
      :selectedProduct="product"
      @close="toggleModal"
    />
  </div>
</template>

<script>
import ProductModal from './ProductModal.vue';  // 경로에 주의하세요

export default {
  name: 'ProductCard',
  components: {
    ProductModal
  },
  props: {
    product: Object
  },
  data() {
    return {
      showModal: false
    };
  },
  methods: {
    toggleModal() {
      this.showModal = !this.showModal;
    }
  }
}
</script>

<style scoped>
.card {
  flex-basis: calc(33.333% - 40px);
  margin: 20px;
  cursor: pointer;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
  transition: transform 0.3s ease;
  width: 300px;
  border-radius: 10px;
}

.card img {
  width: 100%;
  height: auto;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}

.card-title {
  font-size: 1rem;
  margin: 0.5em 0;
}

.card:hover {
  transform: translateY(-10px);
}
</style>
