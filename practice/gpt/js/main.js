document.addEventListener("DOMContentLoaded", function () {
  const menuToggle = document.querySelector(".menu-toggle");
  const mobileNav = document.querySelector(".mobile-nav");
  const menuOverlay = document.querySelector(".menu-overlay");

  if (!menuToggle || !mobileNav) {
    return;
  }

  // 메뉴 열기
  function openMenu() {
    mobileNav.classList.add("is-open");
    menuToggle.classList.add("is-active");

    if (menuOverlay) {
      menuOverlay.classList.add("is-visible");
    }

    // 배경 스크롤 방지
    document.body.style.overflow = "hidden";

    menuToggle.setAttribute("aria-expanded", "true");
  }

  // 메뉴 닫기
  function closeMenu() {
    mobileNav.classList.remove("is-open");
    menuToggle.classList.remove("is-active");

    if (menuOverlay) {
      menuOverlay.classList.remove("is-visible");
    }

    // 배경 스크롤 복원
    document.body.style.overflow = "";

    menuToggle.setAttribute("aria-expanded", "false");
  }

  // 햄버거 버튼
  menuToggle.addEventListener("click", function () {
    const isOpen = mobileNav.classList.contains("is-open");

    if (isOpen) {
      closeMenu();
    } else {
      openMenu();
    }
  });

  // 배경 클릭 시 닫기
  if (menuOverlay) {
    menuOverlay.addEventListener("click", closeMenu);
  }

  // ESC 키로 닫기
  document.addEventListener("keydown", function (event) {
    if (event.key === "Escape") {
      closeMenu();
    }
  });


  // =========================
  // 서브메뉴 아코디언
  // =========================

  const submenuItems = document.querySelectorAll(
    ".mobile-nav .has-submenu > a"
  );

  submenuItems.forEach(function (link) {
    link.addEventListener("click", function (event) {
      event.preventDefault();

      const parent = link.parentElement;

      // 다른 서브메뉴 닫기
      document
        .querySelectorAll(".mobile-nav .has-submenu.is-open")
        .forEach(function (item) {
          if (item !== parent) {
            item.classList.remove("is-open");
          }
        });

      // 현재 서브메뉴 토글
      parent.classList.toggle("is-open");
    });
  });


  // =========================
  // PC로 전환되었을 때
  // 모바일 메뉴 상태 초기화
  // =========================

  window.addEventListener("resize", function () {
    if (window.innerWidth >= 1025) {
      closeMenu();

      document
        .querySelectorAll(".mobile-nav .has-submenu.is-open")
        .forEach(function (item) {
          item.classList.remove("is-open");
        });
    }
  });
});
