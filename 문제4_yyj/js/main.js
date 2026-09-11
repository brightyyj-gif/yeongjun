

$(function () {

    var slider = $('.slider').bxSlider({
        auto: true,
        controls: false,
        pager: false,
        speed: 500,

        onSlideAfter: function ($slideElement, oldIndex, newIndex) {
            $('.current').text(newIndex + 1);

        }

    });

    $('.prev').click(function () {
        slider.goToPrevSlide();
    });

    $('.next').click(function () {
        slider.goToNextSlide();

    });

    $('.pause').click(function () {
        slider.stopAuto();
    });

    $('.play').click(function () {
        slider.startAuto();

    });
});