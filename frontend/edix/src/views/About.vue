<template>
  <div>
    <!-- <h2>에딕스 홈페이지를 방문해주셔서 감사드립니다.</h2> -->
    
    <!-- 버튼들 -->
    <div class="buttons">
      <button @click="showIntroduction">소개의 글</button>
      <button @click="showBusinessHistory">사업내역</button>
      <button @click="showLocation">위치</button>
    </div>
    
    <!-- 각 내용 -->
    <section v-if="showingIntroduction">
      <h3>에딕스만의 기술력</h3>
      <p>1992년12월 1일 창립된 이래 만10년동안 업계의 치열한 경쟁에서 성공적으로 선두에 설 수 있었던 것은 많은 노하우와 막강한 기술력으로 한길을 걸어온 결과입니다.</p>
      <p>그동안 많은 고객에게 컴퓨터 교육을 실시하고 새로운 정보를 공유하여 컴퓨터 인식에 많은 기여를 해왔습니다.</p>
    </section>
    
    <section v-if="showingBusinessHistory">
      <h3>사업 내역</h3>
      <h4>메인보드 유통</h4>    
      <p>총판 및 대리점</p>  
      <h4>유지 보수</h4>
    </section>
    
    <section v-if="showingLocation">
      <h3>위치</h3>
      <!-- 이미지 -->
      <img src="../assets/location.jpg" alt="위치 이미지">

      <!-- 텍스트 -->
      <h4>오시는 길</h4>
      <p>지하철 4호선 신용산 1번 출구</p>
      <p>지하터널을 건너 (15분) 농협 건물 뒷쪽 나진상가 19동 다열 209호</p>
    </section>

  </div>
</template>

<script>
export default {
  name: 'AboutPage',
  data() {
    return {
      showingIntroduction: true, // 소개의 글 보여줄지 여부
      showingBusinessHistory: false, // 사업내역 보여줄지 여부
      showingLocation: false // 위치 보여줄지 여부
    };
  },
  methods: {
    showIntroduction() {
      this.showingIntroduction = true;
      this.showingBusinessHistory = false;
      this.showingLocation = false;
    },
    showBusinessHistory() {
      this.showingIntroduction = false;
      this.showingBusinessHistory = true;
      this.showingLocation = false;
    },
    showLocation() {
      this.showingIntroduction = false;
      this.showingBusinessHistory = false;
      this.showingLocation = true;
    }
  }
}
</script>

<style scoped>
.buttons {
  display: flex;
  justify-content: center; /* 버튼들을 중앙에 정렬 */
  margin: 20px 0; /* 상하 마진 */
}

button {
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

button:hover {
  transform: translateY(-3px); /* 호버 시 위로 이동 */
  box-shadow: 0 6px 8px rgba(0, 0, 0, 0.2); /* 호버 시 그림자 강조 */
}

button:focus {
  outline: none; /* 포커스 아웃라인 제거 */
}
</style>
