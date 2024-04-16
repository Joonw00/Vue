<template>
  <div>    
    <!-- 버튼들 -->
    <div class="buttons">
      <ButtonComponent @click="showIntroduction">소개의 글</ButtonComponent>
      <ButtonComponent @click="showBusinessHistory">사업내역</ButtonComponent>
      <ButtonComponent @click="showLocation">위치</ButtonComponent>
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
import ButtonComponent from '@/components/ButtonComponent.vue';
export default {
  name: 'AboutPage',
  components: {
    ButtonComponent
  },
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
