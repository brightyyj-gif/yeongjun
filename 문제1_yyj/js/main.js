$(document).ready(function () {

    var $ham = $(".ham");
    var $nav = $(".nav");

    function openMenu() {

        $ham.addClass("active");
        $nav.addClass("active");
        $("body").addClass("menu-active");
        $("body").css("overflow", "hidden");

        $ham.attr("aria-expanded", "true");
        $ham.attr("aria-label", "메뉴 닫기");
    }

    function closeMenu() {

        $ham.removeClass("active");

        $nav.removeClass("active");

        $("body").removeClass("menu-active");

        $("body").css("overflow", "");

        $ham.attr("aria-expanded", "false");
        $ham.attr("aria-label", "메뉴 열기");
        $nav.children("ul")
            .children("li")
            .removeClass("sub-open");
    }

    $ham.on("click", function (e) {

        e.stopPropagation();

        if ($(window).width() >= 1025) {
            return;
        }

        if ($nav.hasClass("active")) {
            closeMenu();
        } else {
            openMenu();
        }

    });

    $nav.children("ul")
        .children("li")
        .has(".sub")
        .children("a")
        .on("click", function (e) {

            if ($(window).width() <= 1024) {

                e.preventDefault();
                e.stopPropagation();

                var $parent = $(this).parent("li");

                $parent
                    .siblings()
                    .removeClass("sub-open");
                $parent.toggleClass("sub-open");

            }
        });

    $(document).on("keydown", function (e) {

        if (e.key === "Escape") {
            if ($nav.hasClass("active")) {
                closeMenu();
            }
        }

    });

    $(document).on("click", function (e) {

        if (!$nav.hasClass("active")) {
            return;
        }

        if ($(e.target).closest(".nav").length) {
            return;
        }

        closeMenu();

    });
    
    $(window).on("resize", function () {
        if ($(window).width() >= 1025) {
            closeMenu();
        }
    });
});
