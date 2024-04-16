<template>
  <div>
    <div class="product-grid">
      <div class="card" v-for="product in products" :key="product.id" @click="showModal(product)">
        <img :src="product.imageUrl" :alt="product.title" class="card-img-top">
        <h5 class="card-title">{{ product.title }}</h5>
      </div>
    </div>
    <!-- 모달 창 -->
    <product-modal :selectedProduct="selectedProduct" @close="closeModal" />
  </div>
</template>

<script>
import ProductModal from '@/components/ProductModal.vue';

export default {
  name: 'ProductPage',
  components: {
    ProductModal
  },
  data() {
    return {
      products: [
        { id: 1, title: 'P-Ⅲ 보드', imageUrl: require('@/assets/product/p3.jpg'), description: ' 400MHz FSB, AGP4X' },
        { id: 2, title: 'P-Ⅳ 보드', imageUrl: require('@/assets/product/p4.jpg'), description: '상품 1에 대한 설명입니다.' },
        { id: 3, title: '상품 3', imageUrl: require('@/assets/product/HeaderImg.jpg'), description: '상품 3에 대한 설명입니다.' },
        { id: 4, title: '상품 4', imageUrl: require('@/assets/product/p3.jpg'), description: '상품 4에 대한 설명입니다.' },
        { id: 5, title: '상품 5', imageUrl: require('@/assets/product/p3.jpg'), description: '상품 5에 대한 설명입니다.' },
      ],
      selectedProduct: null
    };
  },
  methods: {
    showModal(product) {
      this.selectedProduct = product;
    },
    closeModal() {
      this.selectedProduct = null;
    }
  }
}
</script>


// TODO : ProductCard 컴포넌트화 하기
<style>
/* 카드 컨테이너 스타일 */
.product-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start; /* 수정: 왼쪽으로 정렬 */
  margin-left: -15px; /* 카드 간의 간격을 조정하기 위한 음수 마진 */
  margin-right: -15px;
}

/* 카드 스타일 */
.card {
  flex-basis: calc(33.333% - 40px); /* 한 줄에 3개의 카드를 나타내도록 너비 조정 */
  margin: 20px; /* 카드 사이의 간격 */
  cursor: pointer;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
  transition: transform 0.3s ease;
  width: 300px; /* 카드 폭 */
  margin: 20px; /* 카드 간격 */
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
  border-radius: 10px; /* 모서리 둥글게 */
}

.card img {
  width: 100%; /* 이미지 가로 폭 */
  height: 150px; /* 고정된 이미지 높이 */
  border-top-left-radius: 10px; /* 상단 왼쪽 모서리 둥글게 */
  border-top-right-radius: 10px; /* 상단 오른쪽 모서리 둥글게 */
}
.card-img-top {
  width: 100%;
  height: 150px; /* 고정된 이미지 높이 */
}

.card-title {
  font-size: 1rem; /* 카드 제목 글꼴 크기 */
  margin: 0.5em 0; /* 카드 제목 위아래 간격 */
}

.card:hover {
  transform: translateY(-10px);
}

/* 반응형 디자인 설정 */
@media (max-width: 992px) {
  .card {
    flex-basis: calc(50% - 40px); /* 화면이 992px 이하면 한 줄에 2개씩 */
  }
}

@media (max-width: 600px) {
  .card {
    flex-basis: 100%; /* 화면이 600px 이하면 한 줄에 1개씩 */
  }
}
</style>