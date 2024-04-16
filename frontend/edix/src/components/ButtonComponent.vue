<template>
  <button @click="onClick" :class="btnClass">
    <slot></slot> <!-- 슬롯을 사용하여 버튼 내용을 유연하게 삽입 -->
  </button>
</template>

<script>
export default {
  name: 'ButtonComponent',
  props: {
    btnClass: {
      type: String,
      default: 'default-btn' // 기본 클래스
    }
  },
  methods: {
    onClick() {
      this.$emit('click'); // 부모 컴포넌트로 클릭 이벤트를 내보냄
    }
  }
}
</script>

<style scoped>
.default-btn {
  background: linear-gradient(to right, #4facfe 0%, #00f2fe 100%);
  border: none;
  color: white;
  padding: 10px 20px;
  margin: 0 10px;
  font-size: 16px;
  cursor: pointer;
  border-radius: 5px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s, box-shadow 0.3s;
}

.default-btn:hover {
  transform: translateY(-3px);
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.2);
}

.default-btn:focus {
  outline: none;
}
</style>
