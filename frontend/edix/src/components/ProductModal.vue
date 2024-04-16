<template>
  <div class="modal" v-if="selectedProduct" @click="closeModal">
    <div class="modal-content" @click.stop> <!-- 이벤트 전파 중지 -->
      <span class="close" @click="closeModal">&times;</span>
      <h2>{{ selectedProduct.title }}</h2>
      <img :src="selectedProduct.imageUrl" :alt="selectedProduct.title">
      <p>{{ selectedProduct.description }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ProductModal',
  props: {
    selectedProduct: Object
  },
  methods: {
    closeModal() {
      this.$emit('close');
    }
  }
}
</script>


<style scoped>
.modal {
  display: flex;
  align-items: center;
  justify-content: center;
  position: fixed;
  z-index: 1000;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: rgba(0, 0, 0, 0.6); /* 배경을 더 어둡게 */
  animation: fadeIn 0.3s;
}

.modal-content {
  background-color: #fff;
  margin: auto;
  padding: 20px;
  border: 1px solid #ddd;
  width: 50%; /* 모달 크기 조정 */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  border-radius: 8px;
  animation: slideIn 0.3s;
}


.modal-content img {
  width: 100%; /* 이미지 너비를 모달 컨텐츠의 100%로 설정 */
  height: auto; /* 이미지의 높이를 자동으로 설정하여 비율 유지 */
  margin-bottom: 20px; /* 이미지 아래쪽에 여백 추가 */
}

.close {
  color: #666;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}

@keyframes fadeIn {
  from { opacity: 0; }
  to { opacity: 1; }
}

@keyframes slideIn {
  from { transform: translateY(-20px); opacity: 0; }
  to { transform: translateY(0); opacity: 1; }
}

</style>

