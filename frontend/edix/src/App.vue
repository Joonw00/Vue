<template>
  <div id="app">
    <div class="nav-header-wrapper"> <!-- 공통 배경이 적용될 부모 요소 -->
      <nav class="navbar">
        <div class="navbar-brand">Edix 로고</div>
        <ul class="navbar-menu">
          <li><a href="/about">회사 소개</a></li>
          <li><a href="/product">제품</a></li>
          <li><a href="/call">연락처</a></li>
        </ul>
      </nav>
      <header>
        <h1>Edix</h1>
      </header>
    </div>
    <div class="main-wrapper">
      <main class="content">
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
html, body {
  margin: 0;
  padding: 0;
  width: 100%;
  height: 100%;
}
.navbar {
  background-color: #1e5799; /* 네비게이션 바 배경 색상 설정 */
  color: #fff;
  height: 10vh; /* 네비게이션 바 높이 설정 */
  display: flex;
  justify-content: space-between; /* 로고와 페이지 목록을 양 끝으로 정렬 */
  align-items: center; /* 수직 방향 중앙 정렬 */
  width: 100%; /* 좌우 꽉 차게 설정 */
  padding: 0; /* 좌우 패딩 제거 */
  box-sizing: border-box; /* 패딩과 보더가 너비에 포함되도록 */
}

.navbar-brand {
  font-size: 1.5rem; /* 로고 글꼴 크기 */
  font-weight: bold; /* 로고 글꼴 굵기 */
  width: 20%; /* 로고의 너비를 전체의 20%로 설정 */
  text-align: left; /* 로고를 왼쪽에 정렬 */
  padding-left: 20%; /* 왼쪽 여백 */
}

.navbar-menu {
  list-style: none; /* 리스트 스타일 제거 */
  display: flex;
  gap: 2rem; /* 메뉴 항목 간격 */
  margin: 0; /* 기본 마진 제거 */
  width: 60%; /* 메뉴의 너비를 전체의 60%로 설정 */
  justify-content: flex-end; /* 메뉴 항목을 오른쪽으로 정렬 */
  padding-right: 20%; /* 오른쪽 여백 */
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
  background-image: url('~@/assets/HeaderImg.jpg');
  background-size: cover; /* 이미지가 헤더를 꽉 채우도록 */
  background-position: center; /* 이미지가 중앙에 오도록 */
  color: white;
  height: 50vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  text-align: center;
  padding: 0;
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


/* 반응형 디자인 */
@media (max-width: 768px) {
  .main-wrapper {
    flex-direction: column;
  }
}
</style>
