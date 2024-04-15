<template>
  <div id="app">
    <nav class="navbar">
      <div class="navbar-brand">Edix 로고</div>
      <ul class="navbar-menu">
        <!-- <li><a href="/home">홈</a></li> -->
        <li><a href="/about">회사 소개</a></li>
        <li><a href="/product">제품</a></li>
        <!-- <li><a href="/service">서비스</a></li> -->
        <li><a href="/call">연락처</a></li>
      </ul>
    </nav>
    <header> <!-- 상단 바 -->
      <h1>Edix</h1>
    </header>
    <div class="main-wrapper">
      <main class="content"> <!-- 페이지 컨텐츠 -->
        <router-view />
      </main>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>

/* 네비게이션 바 스타일 */
.navbar {
  background-color: #1e5799; /* 네비게이션 바 배경 색상 설정 */
  color: #fff;
  height: 10vh; /* 네비게이션 바 높이 설정 */
  display: flex;
  justify-content: space-between; /* 로고와 페이지 목록을 양 끝으로 정렬 */
  align-items: center; /* 수직 방향 중앙 정렬 */
}

.navbar-brand {
  font-size: 1.5rem; /* 로고 글꼴 크기 */
  font-weight: bold; /* 로고 글꼴 굵기 */
}

.navbar-menu {
  list-style: none; /* 리스트 스타일 제거 */
  display: flex;
  gap: 2rem; /* 메뉴 항목 간격 */
  margin: 0; /* 기본 마진 제거 */
}

.navbar-menu li {
  padding: 0.5rem 0; /* 리스트 항목 상하 패딩 */
}

.navbar-menu a {
  text-decoration: none; /* 링크 밑줄 제거 */
  color: #fff;
}

/* 그라데이션 상단 바 스타일 */
header {
  background: linear-gradient(135deg, #1e5799 0%,#2989d8 50%,#207cca 51%,#7db9e8 100%);
  color: white;
  height: 50vh; /* 그라데이션 상단 바 높이 조정 */
  display: flex;
  flex-direction: column;
  justify-content: center; /* 수직 방향 중앙 정렬 */
  text-align: center;
  padding: 0; /* 상단 바 좌우 패딩 제거 */
}

/* 제목과 설명 컨테이너 */
.title-container {
  max-width: 800px; /* 적절한 가로 폭 설정 */
  margin: 0 auto; /* 좌우 중앙 정렬 */
}

.title-container h1 {
  font-size: 4rem; /* 큰 제목 글꼴 크기 */
  margin-bottom: 0.5em; /* 제목과 설명 사이 간격 */
}

.title-container p {
  font-size: 1.5rem; /* 설명 글꼴 크기 */
}

/* 내용 부분 */
.content {
  padding: 40px 20%; /* 내용의 좌우 여백 조정 */
  text-align: center; /* 내용 중앙 정렬 */
}

/* 상품 카드 스타일 */
.card-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  padding: 20px;
}

.card {
  width: 300px; /* 카드 폭 */
  margin: 20px; /* 카드 간격 */
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
  border-radius: 10px; /* 모서리 둥글게 */
}

.card img {
  width: 100%; /* 이미지 가로 폭 */
  height: auto; /* 이미지 높이 자동 조정 */
  border-top-left-radius: 10px; /* 상단 왼쪽 모서리 둥글게 */
  border-top-right-radius: 10px; /* 상단 오른쪽 모서리 둥글게 */
}

.card-body {
  padding: 15px; /* 카드 내부 여백 */
}

.card-title {
  font-size: 1.25rem; /* 카드 제목 글꼴 크기 */
  margin-bottom: 15px; /* 제목과 내용 사이 간격 */
}

.card-text {
  font-size: 1rem; /* 카드 내용 글꼴 크기 */
  color: #333; /* 카드 내용 텍스트 색상 */
}

/* 반응형 디자인 */
@media (max-width: 768px) {
  .main-wrapper {
    flex-direction: column;
  }
}
</style>
