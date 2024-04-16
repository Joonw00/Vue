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
        <p>슬로건 or 설명 한문장</p> 
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

.nav-header-wrapper {
  background-image: url('~@/assets/HeaderImg.jpg'); /* 공통 배경 이미지 */
  background-size: cover; /* 이미지가 컨테이너를 꽉 채우도록 */
  background-position: center; /* 이미지가 중앙에 오도록 */
}
.navbar {
  background-color: transparent; /* 네비게이션 바 배경 투명 설정 */
  color: #fff;
  height: 10vh;
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  padding: 0;
  box-sizing: border-box;
}

.navbar-brand {
  color: #333; /* 짙은 회색으로 조정 */
  font-size: 1.5rem;
  font-weight: bold;
  width: 20%;
  text-align: left;
  padding-left: 20%;
}

.navbar-menu {
  list-style: none;
  display: flex;
  gap: 2rem;
  margin: 0;
  width: 60%;
  justify-content: flex-end;
  padding-right: 20%;
}

.navbar-menu li {
  padding: 0.5rem 0;
}

.navbar-menu a {
  text-decoration: none;
  color: #555; /* 짙은 회색으로 조정 */
}

header {
  background-color: transparent; /* 헤더 배경 투명 설정 */
  color: #555; /* 짙은 회색으로 조정 */
  height: 36vh;
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
  padding-top: 20px;
  text-align: center; /* 내용 중앙 정렬 */
}


/* 반응형 디자인 */
@media (max-width: 768px) {
  .main-wrapper {
    flex-direction: column;
  }
}
</style>
