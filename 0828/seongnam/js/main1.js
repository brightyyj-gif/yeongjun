$(function(){
    var slider1 = $('.bxslider').bxSlider({
        auto:true,
        pager:false,
        controls:false,

        // onSlideLoad:function(currentIndex){
        //     $('#current').text(currentIndex + 1);
        // },


        onSlideBefore:function($slideElement,oldIndex,newIndex){
            // 슬라이드 변경시 현재 슬라이드 번호 업데이트
            $('#current').text(newIndex + 1);
        }
        //&slideElement 이동할 슬라이드
        // old 슬라이드 이전 슬라이드 번호
        // newIndex 이동할 슬라이드 번호

    });

    $('.pause').on('click', function(){
        if($(this).hasClass('on') =='true'){
            $(this).removeClass('on');
            slider1.startAuto();
        }else{
            $(this).addClass('on');
            slider1.stopAuto();
        }
        return false;
    });
    // 이전버튼 클릭
    $('.prev'),on('click' ,function(){
        slider1.gotoPrevSlide();
        return false;
    });


    $('.prev'),on('click' ,function(e){
        e.preventDefailt();
        slider1.goToNextSlide();
    });
});