<template>
  <button class="styled-button" @click="onClick">
    <slot></slot> <!-- 버튼 내용을 슬롯을 통해 받습니다 -->
  </button>
</template>

<script>
export default {
  name: 'ButtonComponent',
  methods: {
    onClick() {
      this.$emit('click'); // 클릭 이벤트를 발생시켜 부모 컴포넌트로 전달합니다
    }
  }
}
</script>

<style scoped>
.styled-button {
  color: #555; /* 짙은 회색으로 조정 */
  border: none;
  padding: 10px 20px;
  margin: 0 10px;
  font-size: 16px;
  cursor: pointer;
  border-radius: 5px;
  margin-bottom: 20px; /* 버튼과 내용 사이의 여백 추가 */
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.2);
  transition: transform 0.3s, box-shadow 0.3s;
}

.styled-button:hover {
  color: #555; /* 호버 시 색상을 조금 더 어둡게 조정 */
  background: rgba(0, 0, 0, 0.05); /* 호버 시 배경에 약간의 색상을 추가 */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
}


.styled-button:focus {
  outline: none; /* 포커스 아웃라인 제거 */
}
</style>
