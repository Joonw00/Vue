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
  background: linear-gradient(to right, #4facfe 0%, #00f2fe 100%); /* 그라디언트 배경 */
  border: none; /* 테두리 제거 */
  color: white; /* 텍스트 색상 */
  padding: 10px 20px; /* 패딩 */
  margin: 0 10px; /* 좌우 마진 */
  font-size: 16px; /* 글꼴 크기 */
  cursor: pointer; /* 커서 */
  border-radius: 5px; /* 둥근 모서리 */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
  transition: transform 0.3s, box-shadow 0.3s; /* 변환 및 그림자 애니메이션 */
}

.styled-button:hover {
  transform: translateY(-3px); /* 호버 시 위로 이동 */
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.2); /* 호버 시 그림자 강조 */
}

.styled-button:focus {
  outline: none; /* 포커스 아웃라인 제거 */
}
</style>
